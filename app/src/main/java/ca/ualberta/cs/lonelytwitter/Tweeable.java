package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hubertle on 1/17/18.
 */

public interface Tweeable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
    public Date getDate();
    public void setDate(Date date);
}
