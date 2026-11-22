package com.qumeng.overseas.advlib.__remote__.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* loaded from: classes17.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f13230a = new Object();
    private static TypedValue b = null;
    private static final String c = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;

    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return context.registerReceiver(broadcastReceiver, intentFilter, i);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
