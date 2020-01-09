package def.abc.studyandroid.annotation;

import android.util.Log;

import java.lang.reflect.Method;

/**
 * Created by wzl on 1/9/20.
 */

public class AnnotationTest {
    @Hello(value = "happy annotation")
    public void hello1 (){

    }

    public void hello2 (){

    }


    public static void hello(){
        Class cls = AnnotationTest.class;
        try {
            Method method1 = cls.getMethod("hello1");
            Hello hello = method1.getAnnotation(Hello.class);
            if(hello != null)
                Log.w("AnnotationTest", hello.value());

            Method method2 = cls.getMethod("hello2");
            hello = method2.getAnnotation(Hello.class);
            if(hello != null)
                Log.w("AnnotationTest", hello.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
