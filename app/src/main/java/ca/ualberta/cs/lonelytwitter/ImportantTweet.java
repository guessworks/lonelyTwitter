package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hubertle on 1/17/18.
 */

public class ImportantTweet extends Tweet {

    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public boolean isImportant(){
        return true;
    }
}
