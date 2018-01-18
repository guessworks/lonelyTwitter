package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by hubertle on 1/17/18.
 */

public class happyMood extends currentMood {

    public happyMood() {
        //constructor with default date
        this.mood = "Happy";
    }

    public happyMood(Date date){
        //constructor with provided date
        this.mood = "Happy";
        this.date = date;
    }

    public String displayMood(){
        //mood-dependent format method which returns a string representing the mood
        return "Mood is : Happy :)";
    }

}

