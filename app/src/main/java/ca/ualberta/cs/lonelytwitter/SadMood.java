/*
 * SadMood
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
 * Represents a sad mood.
 *
 * @author Lauren Hubert
 * @see CurrentMood
 * @see HappyMood
 */
public class SadMood extends CurrentMood {

    /**
     * Constructs a SadMood object with a default date.
     */
    public SadMood(){
        this.mood = "Sad";
    }

    /**
     * Constructs a SadMood object.
     *
     * @param date mood date
     */
    public SadMood(Date date){
        this.mood = "Sad";
        this.date = date;
    }

    /**
     * Returns a string indicating the sad mood.
     *
     * @return sad mood
     */
    public String displayMood(){
        return "Mood is: Sad :(";
    }
}
