package def.abc.studyandroid.eventbus;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by wzl on 1/8/20.
 */

public class Test {
    public static void run()
    {
        EventBusTest ebt = new EventBusTest();
        EventBusTest2 ebt2 = new EventBusTest2();

        EventBus.getDefault().post(new MessageEvent(0, "hello"));
        EventBus.getDefault().postSticky(new MessageEvent(1, "sticky hello"));

        EventBusTest3 ebt3 = new EventBusTest3();
        EventBusTest3 ebt4 = new EventBusTest3();
    }
}
