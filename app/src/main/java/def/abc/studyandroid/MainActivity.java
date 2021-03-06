package def.abc.studyandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import def.abc.studyandroid.annotation.AnnotationTest;
import def.abc.studyandroid.eventbus.EventBusTest;
import def.abc.studyandroid.eventbus.EventBusTest2;
import def.abc.studyandroid.eventbus.Test;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());

        findViewById(R.id.bt_postevent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.run();
            }
        });

        findViewById(R.id.bt_annotations).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnnotationTest.hello();
            }
        });
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
