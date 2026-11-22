package com.amap.api.col.p0003sl;

import android.graphics.Bitmap;

/* compiled from: PureScreenCheckTool.java */
/* loaded from: classes11.dex */
public class o4 {
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1802a = false;
    private int b = 0;

    public static void a(boolean z) {
        c = z;
    }

    public static boolean b() {
        return c;
    }

    public static boolean c() {
        return d;
    }

    public static boolean d() {
        return e;
    }

    public boolean e() {
        return this.b >= 20;
    }

    public void f() {
        this.b++;
    }

    public static void b(boolean z) {
        d = z;
    }

    public static void c(boolean z) {
        e = z;
    }

    public boolean a() {
        return this.f1802a;
    }

    public boolean a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = -1;
                for (int i2 = (int) (width / 4.0f); i2 < (width * 3) / 4.0f; i2++) {
                    for (int i3 = (int) (height / 4.0f); i3 < (height * 3) / 4.0f; i3++) {
                        int pixel = bitmap.getPixel(i2, i3);
                        if (i == -1) {
                            i = pixel;
                        }
                        if (pixel != i) {
                            return false;
                        }
                        if (pixel != -16777216) {
                            return false;
                        }
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return true;
    }
}
