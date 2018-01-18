package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by hubertle on 1/17/18.
 */

public class sadMood extends currentMood {

    public sadMood(){
        //constructor with default date
        this.mood = "Sad";
    }

    public sadMood(Date date){
        //constructor with provided date
        this.mood = "Sad";
        this.date = date;
    }

    public String displayMood(){
        //mood-dependent format method which returns a string representing the mood
        return "Mood is: Sad :(";
    }
}
