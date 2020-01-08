package def.abc.studyandroid.eventbus;

import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by wzl on 1/8/20.
 */

public class EventBusTest {
    public EventBusTest(){
        EventBus.getDefault().register(this);
    }

    @Subscribe
    public void testEventBus(Object obj){
        MessageEvent me = (MessageEvent) obj;
        Log.w("eventbus", "get event, type=" + me.type + " message=" + me.message);
    }
}