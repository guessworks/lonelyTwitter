package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hubertle on 1/17/18.
 */

public abstract class Tweet implements Tweeable{

    private String message;
    private Date date;
    private currentMood mood;

    Tweet() {
        //default constructor
    }

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        //character limit of 160 characters
        //throw an exception is message is longer than 160 characters
        if (message.length() > 160) throw new TweetTooLongException();

        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();


}