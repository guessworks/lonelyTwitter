/*
 * Tweeable
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
 * An interface that outlines the methods needed for all Tweet objects.
 *
 * @author Lauren Hubert
 * @see Tweet
 * @see NormalTweet
 * @see ImportantTweet
 */
public interface Tweeable {

    /**
     * Returns the tweet message.
     *
     * @return tweet message
     */
    public String getMessage();

    /**
     * Sets the tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet message exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException;

    /**
     * Returns the tweet date.
     *
     * @return tweet date
     */
    public Date getDate();

    /**
     * Sets the tweet date.
     *
     * @param date tweet date
     */
    public void setDate(Date date);
}
