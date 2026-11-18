package com.anythink.basead.ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3183a;
    public float b;
    private Bitmap c;
    private int d;
    private int e;
    private float f;
    private float g;

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.d;
    }

    public final Bitmap c() {
        return this.c;
    }

    private float f() {
        return this.f;
    }

    public a(Context context, Bitmap bitmap, double d, double d2, int r13) {
        r13 = r13 == 0 ? Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : r13;
        double dNextInt = (((double) new Random().nextInt(6)) + (d * 100.0d)) / 100.0d;
        if (dNextInt >= d && dNextInt <= d2) {
            d2 = dNextInt;
        }
        Log.d("RedPacketBean", "widthScale: ".concat(String.valueOf(d2)));
        int r7 = (int) (((double) r13) * d2);
        this.d = r7;
        int height = (r7 * bitmap.getHeight()) / bitmap.getWidth();
        this.e = height;
        try {
            this.c = Bitmap.createScaledBitmap(bitmap, this.d, height, true);
        } catch (Exception e) {
            Log.e("RedPacketBean", "createScaledBitmap failed: " + e.getMessage());
        }
        this.f = 400.0f;
        this.g = (new Random().nextFloat() * 30.0f) - 15.0f;
    }

    public final void d() {
        Bitmap bitmap = this.c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.c.recycle();
        this.c = null;
    }

    public final float e() {
        return this.g;
    }
}
