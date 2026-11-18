package com.baidu.ar;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes16.dex */
public class p7 extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public void a(int r1) {
        this.e = r1;
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
    public void onOrientationChanged(int r8) {
        a aVar;
        a aVar2;
        if (r8 < 0) {
            aVar = a.SCREEN_ORIENTATION_NOT_DEFINED;
        } else {
            int r0 = this.e;
            if (r0 == 1) {
                int r9 = ((r8 + 360) + this.d) % 360;
                if (r9 <= 45 || r9 > 315) {
                    aVar2 = a.SCREEN_ORIENTATION_PORTRAIT;
                } else if (r9 > 45 && r9 <= 135) {
                    aVar2 = a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                } else {
                    if (r9 <= 135 || r9 > 225) {
                        if (r9 > 225 && r9 <= 315) {
                            aVar2 = a.SCREEN_ORIENTATION_LANDSCAPE;
                        }
                        if (this.c && r0 == 1) {
                            this.c = true;
                            this.f7112a = this.b;
                            a();
                            return;
                        }
                        return;
                    }
                    aVar2 = a.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                }
                this.b = aVar2;
                if (this.c) {
                    return;
                } else {
                    return;
                }
            }
            if (r0 != 0) {
                return;
            }
            if (r8 <= 45 || r8 > 315) {
                aVar = a.SCREEN_ORIENTATION_PORTRAIT;
            } else if (r8 > 45 && r8 <= 135) {
                aVar = a.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
            } else if (r8 > 135 && r8 <= 225) {
                aVar = a.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
            } else if (r8 <= 225 || r8 > 315) {
                return;
            } else {
                aVar = a.SCREEN_ORIENTATION_LANDSCAPE;
            }
        }
        this.b = aVar;
    }
}
