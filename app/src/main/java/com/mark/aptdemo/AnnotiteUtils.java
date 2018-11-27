package com.mark.aptdemo;

import android.app.Activity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <pre>
 *     author : admin
 *     e-mail : makun.cai@aorise.org
 *     time   : 2018/11/27
 *     desc   : TODO
 *     version: 1.0
 * </pre>
 */
public class AnnotiteUtils {
    public static void injectViews(Activity activity){
        Class<? extends Activity> clazz = activity.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields){
            InjectView injectView = field.getAnnotation(InjectView.class);
            if (injectView!=null){
                int viewID = injectView.value();
                if (viewID!=0){
                    try {
                        Method findViewById = clazz.getMethod("findViewById", int.class);
                        Object resView = findViewById.invoke(activity,viewID);
                        field.setAccessible(true);
                        field.set(activity,resView);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
