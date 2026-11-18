package com.bytedance.sdk.openadsdk.dx;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.hjq.permissions.Permission;

/* JADX INFO: loaded from: classes11.dex */
public class rb {
    public static int bh = 0;
    public static int dgx = 16;
    protected static String fxn = "images";
    protected static int gff = 1;
    public static int hie = 8;
    protected static int hm = 30;
    public static int jq = 4;
    protected static String kg = null;
    public static int mvp = 32;
    protected static long rb = 15360;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    public static int f9545sg = 1;
    public static int tw = 2;

    protected static boolean fxn(Context context, String str) {
        return false;
    }

    protected static Bitmap fxn(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean fxn(Context context, int r6) {
        boolean zFxn;
        boolean zFxn2;
        if (bh == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zFxn = fxn(context, "android.permission.READ_MEDIA_IMAGES");
                zFxn2 = true;
            } else {
                zFxn = fxn(context, "android.permission.READ_EXTERNAL_STORAGE");
                zFxn2 = fxn(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zFxn3 = fxn(context, Permission.CAMERA);
            boolean zFxn4 = fxn(context, Permission.RECORD_AUDIO);
            PackageManager packageManager = context.getPackageManager();
            if (zFxn && zFxn2) {
                bh |= f9545sg;
            }
            if (zFxn3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                bh |= tw;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                bh |= jq;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                bh |= hie;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                bh |= dgx;
            }
            if (zFxn4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                bh |= mvp;
            }
        }
        return (bh & r6) != 0;
    }

    public static boolean fxn(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z2 = true;
        if (z2) {
        }
    }

    public static boolean kg(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static float kg(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }
}
