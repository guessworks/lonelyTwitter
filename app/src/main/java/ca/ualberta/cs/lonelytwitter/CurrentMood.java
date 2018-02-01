/*
 * CurrentMood
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
 * Represents a tweet's mood.
 *
 * @author Lauren Hubert
 * @see SadMood
 * @see HappyMood
 */
public abstract class CurrentMood {

    protected String mood;
    protected Date date;

    /**
     * Constructs a CurrentMood object with a default date.
     */
    CurrentMood() {}

    /**
     * Constructs a CurrentMood object.
     *
     * @param date mood date
     */
    public CurrentMood(Date date){
        //constructor with provided date
        this.date = date;
    }

    /**
     * Returns the mood.
     *
     * @return tweet mood
     */
    public String getMood(){
        return mood;
    }

    /**
     * Returns the date.
     *
     * @return tweet/mood date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the mood.
     *
     * @param mood tweet mood
     */
    public void setMood(String mood){
        this.mood = mood;
    }

    /**
     * Sets the date.
     *
     * @param date mood date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Displays the mood.
     *
     * @return tweet mood
     */
    public abstract String displayMood();


}
