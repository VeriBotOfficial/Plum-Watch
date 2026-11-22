package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12852a = -15238995;

    public static int a(int i, int i2) {
        return i + (i2 * 16777216);
    }

    public static int a(float f, int i) {
        return Color.argb((int) (Color.alpha(i) * (1.0f - f)), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int a(int i) {
        return a(i, 255);
    }

    public static Bitmap a(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(i3);
        return createBitmap;
    }
}
