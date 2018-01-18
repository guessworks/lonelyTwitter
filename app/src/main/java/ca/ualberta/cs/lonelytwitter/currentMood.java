package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hubertle on 1/17/18.
 */

public abstract class currentMood {

    protected String mood;
    protected Date date;

    currentMood() {
        //default constructor
    }

    public currentMood(Date date){
        //constructor with provided date
        this.date = date;
    }

    public String getMood(){
        return mood;
    }

    public Date getDate() {
        return date;
    }

    public void setMood(String mood){
        this.mood = mood;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract String displayMood();


}
