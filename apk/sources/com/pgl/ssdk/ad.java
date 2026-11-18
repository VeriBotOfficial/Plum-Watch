package com.pgl.ssdk;

import android.content.Context;
import android.os.LocaleList;
import android.provider.Settings;
import androidx.camera.video.AudioStats;
import java.lang.reflect.Method;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static double f12733a = -1.0d;

    public static String b() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = null;
        }
        return displayName == null ? "" : displayName.trim();
    }

    public static String c() {
        return "";
    }

    public static String c(Context context) {
        return "";
    }

    public static String a() {
        return LocaleList.getDefault().get(0).getLanguage();
    }

    public static String b(Context context) {
        double d = f12733a;
        double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (d >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return Integer.toString((int) d);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            dDoubleValue = ((Double) declaredMethod.invoke(objNewInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        f12733a = dDoubleValue;
        return Integer.toString((int) dDoubleValue);
    }

    public static String a(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            string = null;
        }
        return string == null ? "" : string.trim();
    }
}
