/*
 * ImportantTweet
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
 * Represents an important tweet.
 *
 * @author Lauren Hubert
 * @see Tweet
 * @see NormalTweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs an ImportantTweet object with a default date.
     *
     * @param message tweet message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an ImportantTweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns true as ImportantTweet is an ImportantTweet.
     *
     * @return true
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}
