package com.xord.bestquote

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_quote_details.*

class QuoteDetailsActivity : AppCompatActivity() {

    var quoteCategoryId = 0
    var db:SQLiteDatabase? = null
    var cursor:Cursor? = null

    var quotesAdapter:QuotesAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote_details)
        
        quoteCategoryId = intent.extras?.get("QUOTE_CATEGORY_ID").toString().toInt()

        //Read data from the database
        val myNotesDatabaseHelper = BestQuoteSQLiteOpenHelper(this)
        db = myNotesDatabaseHelper.readableDatabase

        cursor = db!!.query("quotes", arrayOf("quote"),"category_id=?",
        arrayOf(quoteCategoryId.toString())
        ,null,null,null)

        var listOfQuotes = mutableListOf<String>()
        while (cursor!!.moveToNext()==true){
            val quote = cursor!!.getString(0)
            listOfQuotes.add(quote)
        }

        //create adapter class
        quotesAdapter = QuotesAdapter(this,listOfQuotes){quote->

        val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT,quote)
            shareIntent.type = "text/plain"
            startActivity(shareIntent)
        }

        //use a layout manager
        val layoutManager = LinearLayoutManager(this)

        recyclerViewQuote.layoutManager = layoutManager
        recyclerViewQuote.adapter = quotesAdapter


    }

    override fun onDestroy() {
        super.onDestroy()
        db!!.close()
        cursor!!.close()
    }
}
