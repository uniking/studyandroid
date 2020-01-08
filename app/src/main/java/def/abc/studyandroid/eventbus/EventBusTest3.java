package def.abc.studyandroid.eventbus;

import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by wzl on 1/8/20.
 */

public class EventBusTest3 {
    public EventBusTest3(){
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.POSTING, priority = 1, sticky = true)
    public void testEventBus(Object obj){
        MessageEvent me = (MessageEvent) obj;
        Log.w("eventbus3", "get event, type=" + me.type + " message=" + me.message);
    }
}