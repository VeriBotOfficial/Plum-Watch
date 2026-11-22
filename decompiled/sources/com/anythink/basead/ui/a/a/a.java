package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes11.dex */
public abstract class a implements com.anythink.basead.ui.a.b {

    /* renamed from: a, reason: collision with root package name */
    protected View f3156a;
    protected ValueAnimator b;
    protected int c;
    protected int d;

    @Override // com.anythink.basead.ui.a.b
    public void a(Canvas canvas) {
    }

    protected ValueAnimator e() {
        return null;
    }

    public a(View view) {
        this.f3156a = view;
    }

    @Override // com.anythink.basead.ui.a.b
    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // com.anythink.basead.ui.a.b
    public synchronized void a() {
        if (this.f3156a == null) {
            return;
        }
        d();
        ValueAnimator e = e();
        this.b = e;
        if (e != null) {
            this.f3156a.post(new Runnable() { // from class: com.anythink.basead.ui.a.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.b == null || a.this.b.isStarted()) {
                        return;
                    }
                    a.this.f();
                    try {
                        a.this.b.start();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void b() {
        if (this.b != null) {
            try {
                this.b.pause();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void c() {
        if (this.b != null) {
            try {
                this.b.resume();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void d() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            try {
                valueAnimator.cancel();
                this.b = null;
            } catch (Throwable th) {
                new Object[]{th.getMessage()};
            }
        }
    }

    protected void f() {
        View view = this.f3156a;
        if (view == null) {
            return;
        }
        if (this.c == 0 || this.d == 0) {
            this.c = view.getWidth();
            this.d = this.f3156a.getHeight();
        }
    }
}
