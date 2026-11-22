package com.xmly.businesssdk.utils;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ClassUtil {
    public static <T> T createFromClass(String str) {
        return (T) createFromClass(str, new Class[0], new Object[0]);
    }

    public static boolean existClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            Logger.v("ClassUtil", "exist() ClassNotFoundException " + str);
            return false;
        }
    }

    public static <T> T createFromClass(String str, Class[] clsArr, Object[] objArr) {
        Logger.v("ClassUtil", "ClassUtil createFromClass() " + str + "   params " + Arrays.toString(objArr));
        try {
            Constructor<?> constructor = Class.forName(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e) {
            Logger.d("ClassUtil", "ClassUtil createFromClass() params " + str + e.getClass().getName());
            return null;
        }
    }

    public static <T> T createFromClass(Class<?> cls, Class[] clsArr, Object[] objArr) {
        Logger.v("ClassUtil", "ClassUtil createFromClass() " + cls + "   params " + Arrays.toString(objArr));
        try {
            Constructor<?> constructor = cls.getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e) {
            Logger.d("ClassUtil", "ClassUtil createFromClass() params " + cls + e.getClass().getName());
            return null;
        }
    }

    public static <T> T createFromClass(String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Activity) {
                clsArr[i] = Activity.class;
            } else if (obj instanceof Context) {
                clsArr[i] = Context.class;
            } else {
                clsArr[i] = obj.getClass();
            }
        }
        return (T) createFromClass(str, clsArr, objArr);
    }

    public static <T> T createFromClass(Class<?> cls) {
        Logger.v("ClassUtil", "ClassUtil createFromClass() " + cls);
        try {
            Constructor<?> constructor = cls.getConstructor(new Class[0]);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(new Object[0]);
        } catch (Exception e) {
            Logger.d("ClassUtil", "ClassUtil createFromClass() " + cls + e.getClass().getName());
            return null;
        }
    }
}
