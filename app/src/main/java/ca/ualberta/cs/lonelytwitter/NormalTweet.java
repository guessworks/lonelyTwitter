/*
 * NormalTweet
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
 * Represents a Normal Tweet.
 *
 * @author Lauren Hubert
 * @see Tweet
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a NormalTweet object with a default date.
     *
     * @param message tweet message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a NormalTweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns false as the NormalTweet object is not an ImportantTweet object.
     *
     * @return false
     */
    @Override
    public boolean isImportant(){
        return false;
    }

}
