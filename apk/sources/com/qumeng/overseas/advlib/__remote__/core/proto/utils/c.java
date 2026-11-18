package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12852a = -15238995;

    public static int a(int r1, int r2) {
        return r1 + (r2 * 16777216);
    }

    public static int a(float f, int r3) {
        return Color.argb((int) (Color.alpha(r3) * (1.0f - f)), Color.red(r3), Color.green(r3), Color.blue(r3));
    }

    public static int a(int r1) {
        return a(r1, 255);
    }

    public static Bitmap a(int r1, int r2, int r3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r1, r2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawColor(r3);
        return bitmapCreateBitmap;
    }
}
