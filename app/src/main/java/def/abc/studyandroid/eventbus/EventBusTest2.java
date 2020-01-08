package def.abc.studyandroid.eventbus;

import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by wzl on 1/8/20.
 */

public class EventBusTest2 {
    public EventBusTest2(){
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.POSTING, priority = 1, sticky = false)
    public void testEventBus(Object obj){
        MessageEvent me = (MessageEvent) obj;
        Log.w("eventbus2", "get event, type=" + me.type + " message=" + me.message);
    }
}