package com.baidu.ar;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes12.dex */
public class p7 extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public a f7112a;
    public a b;
    public boolean c;
    public int d;
    public int e;

    public enum a {
        SCREEN_ORIENTATION_PORTRAIT,
        SCREEN_ORIENTATION_LANDSCAPE,
        SCREEN_ORIENTATION_REVERSE_PORTRAIT,
        SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
        SCREEN_ORIENTATION_NOT_DEFINED
    }

    public p7(Context context) {
        super(context);
        this.c = false;
        this.e = 0;
    }

    public void a() {
        this.d = b();
    }

    public void a(int i) {
        this.e = i;
    }

    public final int b() {
        a aVar = this.f7112a;
        if (aVar == a.SCREEN_ORIENTATION_LANDSCAPE) {
            return 90;
        }
        if (aVar == a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE) {
            return -90;
        }
        return aVar == a.SCREEN_ORIENTATION_REVERSE_PORTRAIT ? 180 : 0;
    }

    public void c() {
        try {
            disable();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        this.e = 0;
    }

    public void d() {
        try {
            enable();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        a aVar;
        if (i < 0) {
            this.b = a.SCREEN_ORIENTATION_NOT_DEFINED;
            return;
        }
        int i2 = this.e;
        if (i2 != 1) {
            if (i2 == 0) {
                if (i <= 45 || i > 315) {
                    this.b = a.SCREEN_ORIENTATION_PORTRAIT;
                    return;
                }
                if (i > 45 && i <= 135) {
                    this.b = a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                    return;
                }
                if (i > 135 && i <= 225) {
                    this.b = a.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                    return;
                } else {
                    if (i <= 225 || i > 315) {
                        return;
                    }
                    this.b = a.SCREEN_ORIENTATION_LANDSCAPE;
                    return;
                }
            }
            return;
        }
        int i3 = ((i + 360) + this.d) % 360;
        if (i3 <= 45 || i3 > 315) {
            aVar = a.SCREEN_ORIENTATION_PORTRAIT;
        } else if (i3 > 45 && i3 <= 135) {
            aVar = a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
        } else {
            if (i3 <= 135 || i3 > 225) {
                if (i3 > 225 && i3 <= 315) {
                    aVar = a.SCREEN_ORIENTATION_LANDSCAPE;
                }
                if (this.c && i2 == 1) {
                    this.c = true;
                    this.f7112a = this.b;
                    a();
                    return;
                }
            }
            aVar = a.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
        }
        this.b = aVar;
        if (this.c) {
        }
    }
}
