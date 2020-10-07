package com.xord.bestquote

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BestQuoteSQLiteOpenHelper(context: Context): SQLiteOpenHelper(context,null,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        //write code that creates the two tables and also insert quote categories
        db!!.execSQL("CREATE TABLE quote_categories("
        +"_id INTEGER PRIMARY KEY,"+
                "image_resource_id TEXT," +
                "name TEXT)"
        )
        insertQuoteCategory(db,1,R.drawable.love,"love")
        insertQuoteCategory(db,2,R.drawable.motivate,"motivation")
        insertQuoteCategory(db,3,R.drawable.romancee,"Romantic")
        insertQuoteCategory(db,4,R.drawable.success,"Success")
        insertQuoteCategory(db,5,R.drawable.psychology,"Psychology")
        insertQuoteCategory(db,6,R.drawable.friendship,"friendship")

        //quotes table
        db!!.execSQL("CREATE TABLE quotes(quote TEXT, category_id INTEGER)")
        //love quotes
        insertQuote(db,"Love takes off masks that we fear we cannot live without and know we cannot live within.",1)
        insertQuote(db,"life is first gift, love is the second and understanding is the third.",1)
        insertQuote(db,"Just in case you have forgotten today: You matter. You are loved.",1)
        insertQuote(db,"We love because it's the only true adventure.",1)
        insertQuote(db,"Love yourself first and everything else falls into line. You really have to love yourself to get anything done in this world.",1)
        insertQuote(db,"The more the soul knows, the more she loves, and loving much, she tastes much.",1)
        insertQuote(db,"The most important thing in life is to learn how to give out love, and to let it come in.",1)
        insertQuote(db,"Love will find a way through paths where wolves fear to prey.",1)
        insertQuote(db,"I love you not because of who you are, but because of who I am when I am with you.",1)
        insertQuote(db,"We are shaped and fashioned by what we love.",1)

        //motivational quotes
        insertQuote(db,"Your limitation—it’s only your imagination.",2)
        insertQuote(db,"Push yourself, because no one else is going to do it for you.",2)
        insertQuote(db,"Sometimes later becomes never. Do it now.",2)
        insertQuote(db,"Great things never come from comfort zones.",2)
        insertQuote(db,"Dream it. Wish it. Do it.",2)
        insertQuote(db,"Success doesn’t just find you. You have to go out and get it.",2)
        insertQuote(db,"The harder you work for something, the greater you’ll feel when you achieve it.",2)
        insertQuote(db,"Don’t stop when you’re tired. Stop when you’re done.",2)
        insertQuote(db,"Wake up with determination. Go to bed with satisfaction.",2)
        insertQuote(db,"Do something today that your future self will thank you for.",2)
        insertQuote(db,"Little things make big days.",2)

        //romantic
        insertQuote(db,"No matter what has happened. No matter what you’ve done. No matter what you will do. I will always love you. I swear it.",3)
        insertQuote(db,"I wanted to tell you that wherever I am, whatever happens, I’ll always think of you, and the time we spent together, as my happiest time." +
                " I’d do it all over again, if I had the choice. No regrets.",3)
        insertQuote(db,"And in her smile I see something more beautiful than the stars.",3)
        insertQuote(db,"It’s one thing to fall in love. It’s another to feel someone else fall in love with you," +
                " and to feel a responsibility toward that love.",3)
        insertQuote(db,"It’s one thing to fall in love. It’s another to feel someone else fall in love with you," +
                " and to feel a responsibility toward that love.",3)
        insertQuote(db,"I’m in love with you," +
                " and I’m not in the business of denying myself the simple pleasure of saying true things." +
                " I’m in love with you, and I know that love is just a shout into the void, and that oblivion is inevitable," +
                " and that we’re all doomed and that there will come a day when all our labor has been returned to dust," +
                " and I know the sun will swallow the only earth we’ll ever have, " +
                "and I am in love with you.",3)
        insertQuote(db,"I never loved you any more than I do, right this second." +
                " And I’ll never love you any less than I do, right this second.",3)
        insertQuote(db,"Sometimes I can’t see myself when I’m with you. I can only just see you.",3)
        insertQuote(db,"I knew the second I met you that there was something about you I needed. Turns out it wasn’t something about you at all. It was just you." +
                "",3)

        //success quotes
        insertQuote(db,"Success is not final; failure is not fatal: It is the courage to continue that counts.",4)
        insertQuote(db,"It is better to fail in originality than to succeed in imitation.",4)
        insertQuote(db,"The road to success and the road to failure are almost exactly the same.",4)
        insertQuote(db,"Success usually comes to those who are too busy to be looking for it.",4)
        insertQuote(db,"Opportunities don't happen. You create them.",4)
        insertQuote(db,"Don't be afraid to give up the good to go for the great.",4)
        insertQuote(db,"There are two types of people who will tell you that you cannot make a difference in this world: " +
                "those who are afraid to try and those who are afraid you will succeed.",4)
        insertQuote(db,"Successful people do what unsuccessful people are not willing to do." +
                " Don't wish it were easier; wish you were better.",4)
        insertQuote(db,"Try not to become a man of success. Rather become a man of value.",4)
        insertQuote(db,"Never give in except to convictions of honor and good sense.",4)
        insertQuote(db,"Stop chasing the money and start chasing the passion.",4)
        insertQuote(db,"Success is walking from failure to failure with no loss of enthusiasm.",4)

        //psychology quotes
        insertQuote(db,"The purpose of psychology is to give us wholly novel ideas about the things that we know best."
               ,5)
        insertQuote(db,"The brain is wider than the sky.",5)
        insertQuote(db,"Psychology keeps trying to vindicate human nature. History keeps undermining the effort.",5)
        insertQuote(db,"Introspection is always retrospection.",5)
        insertQuote(db,"The chief difficulty for those who begin the study of " +
                "scientific psychology is that all men indulge in popular psychology",5)
        insertQuote(db,"It is not easy to treat feelings scientifically.",5)
        insertQuote(db,"You are the creator of your own reality, and life can show up " +
                "no other way than that way in which you think it will.",5)
        insertQuote(db,"The greatest discovery of my generation is that human beings" +
                " can alter their lives by altering their attitudes of mind.",5)
        insertQuote(db,"The happiness of your life depends upon the quality of your thoughts.",5)
        insertQuote(db,"sex relieves tension and love causes it.",5)

        //knowledge
        insertQuote(db,"A friend is someone who knows all about you and still loves you.",5)
        insertQuote(db,"The only true wisdom is in knowing you know nothing.",5)
        insertQuote(db,"The Seven Social Sins are:\n" +
                "\n" +
                "Wealth without work.\n" +
                "Pleasure without conscience.\n" +
                "Knowledge without character.\n" +
                "Commerce without morality.\n" +
                "Science without humanity.\n" +
                "Worship without sacrifice.\n" +
                "Politics without principle.\n",5)
        insertQuote(db,"Hold fast to dreams." +
                "For if dreams die," +
                "life is a broken-winged bird" +
                "that cannot fly.",5)
        insertQuote(db,"Any fool can know. The point is to understand.",5)
        insertQuote(db,"Confidence is ignorance. If you're feeling cocky, it's because there's something you don't know.",6)
        insertQuote(db,"I cannot teach anybody anything. I can only make them think",5)
        insertQuote(db,"Knowing too much of your future is never a good thing.",5)
        insertQuote(db,"People don't care how much you know until they know how much you care",5)
        insertQuote(db,"Beware of the man who works hard to learn something, learns it, and finds himself no wiser than before.",5)
        insertQuote(db,"The eye sees only what the mind is prepared to comprehend.",5)

        //friendship
        insertQuote(db,"A real friend is one who walks in when the rest of the world walks out.",6)
        insertQuote(db,"Friendship is born at that moment when one person says to another, " +
                "‘What! You too? I thought I was the only one.",6)
        insertQuote(db,"True friendship comes when the silence between two people is comfortable.",6)
        insertQuote(db,"Sweet is the memory of distant friends! Like the mellow rays of the departing sun, " +
                "it falls tenderly, yet sadly, on the heart.",6)
        insertQuote(db,"Don’t make friends who are comfortable to be with. " +
                "Make friends who will force you to lever yourself up.",6)
        insertQuote(db,"A friend is someone who understands your past, believes in your future, " +
                "and accepts you just the way you are.",6)
        insertQuote(db,"Ultimately the bond of all companionship, whether in marriage or in friendship, " +
                "is conversation.",6)
        insertQuote(db,"A true friend never gets in your way unless you happen to be going down.",6)
        insertQuote(db,"It is not a lack of love, but a lack of friendship that makes unhappy marriages.",6)
        insertQuote(db,"One’s friends are that part of the human race with which one can be human.",6)
        insertQuote(db,"Be slow to fall into friendship; but when thou art in, continue firm & constant.",6)


    }
    fun insertQuote(db:SQLiteDatabase?, quote:String,categoryId:Int){
        val contentValues = ContentValues()
        contentValues.put("quote",quote)
        contentValues.put("category_id",categoryId)

        db!!.insert("quotes",null,contentValues)
    }

     fun insertQuoteCategory(db:SQLiteDatabase?,id: Int, resourceId: Int, name: String){
        val contentValues = ContentValues()
        contentValues.put("_id",id)
        contentValues.put("image_resource_id",resourceId)
        contentValues.put("name",name)

        db!!.insert("quote_categories",null,contentValues)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}