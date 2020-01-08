package def.abc.studyandroid.eventbus;

/**
 * Created by wzl on 1/8/20.
 */

public class MessageEvent {
    public String message;
    public int type;//0,1,2

    public MessageEvent(int type, String message){
        this.type = type;
        this.message = message;
    }
}
