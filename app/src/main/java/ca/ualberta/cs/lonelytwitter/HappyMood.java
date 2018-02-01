/*
 * HappyMood
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
 * Represents a happy mood.
 *
 * @author Lauren Hubert
 * @see CurrentMood
 * @see SadMood
 */
public class HappyMood extends CurrentMood {

    /**
     * Constructs a HappyMood object with a default date.
     */
    public HappyMood() {
        this.mood = "Happy";
    }

    /**
     * Constructs a HappyMood object.
     *
     * @param date mood date
     */
    public HappyMood(Date date){
        this.mood = "Happy";
        this.date = date;
    }

    /**
     * Returns a string indicating the mood.
     *
     * @return happy mood
     */
    public String displayMood(){
        return "Mood is : Happy :)";
    }

}

