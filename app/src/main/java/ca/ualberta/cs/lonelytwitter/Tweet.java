/*
 * Tweet
 *
 * January 31, 2018
 *
 * Copyright @ 2018 Team X, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at the University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */


package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author Lauren Hubert
 * @version lab 4
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweeable{

    private String message;
    private Date date;
    private CurrentMood mood;

    /**
     * Constructs a tweet object with a default date.
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Returns the tweet date.
     * @return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns the tweet message.
     * @return tweet message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140) throw new TweetTooLongException();
        this.message = message;
    }

    /**
     * Sets tweet date.
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Determines if the tweet is an ImportantTweet or a NormalTweet.
     *
     * @return true if the tweet is an ImportantTweet and false if it is a NormalTweet.
     */
    public abstract boolean isImportant();

    /**
     * Overrides toString() method; returns tweet message.
     *
     * @return tweet message
     */
    @Override
    public String toString(){
        return message;
    }
}