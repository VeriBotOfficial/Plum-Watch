package com.qumeng.overseas.advlib.trdparty.unionset.utils;

import android.graphics.Rect;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class c {
    private static final int h = 1000;
    protected static final String i = "CountdownHelper";

    /* renamed from: a, reason: collision with root package name */
    protected int f13445a;
    private View b;
    private b c;
    private boolean d = false;
    private boolean e = false;
    private Rect f = new Rect();
    private final Runnable g = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.a(c.i, "onTick.. " + c.this.f13445a, new Object[0]);
            c.this.e = false;
            if (c.this.b()) {
                r0.f13445a--;
                if (c.this.c != null) {
                    c.this.c.onTick(c.this.f13445a);
                }
            }
            c.this.c();
        }
    }

    public interface b {
        void onTick(int i);
    }

    public c(int i2, View view) {
        this.f13445a = i2;
        this.b = view;
    }

    public void d() {
        View view = this.b;
        if (view != null) {
            view.removeCallbacks(this.g);
        }
        this.d = false;
        this.e = false;
        n.a(i, "pauseCountdown.. " + this.f13445a, new Object[0]);
    }

    public void e() {
        this.d = true;
        c();
        n.a(i, "resumeCountdown.. " + this.f13445a, new Object[0]);
    }

    public void f() {
        this.d = true;
        this.e = false;
        c();
        n.a(i, "startCountdown.. " + this.f13445a, new Object[0]);
    }

    public void g() {
        this.f13445a = 0;
        View view = this.b;
        if (view != null) {
            view.removeCallbacks(this.g);
        }
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        n.a(i, "stopCountdown.. " + this.f13445a, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        View view = this.b;
        return view != null && view.isShown() && this.b.getLocalVisibleRect(this.f) && ((double) (this.f.width() * this.f.height())) >= ((double) (this.b.getWidth() * this.b.getHeight())) * 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        View view = this.b;
        if (view == null || !this.d || this.e) {
            return;
        }
        if (this.f13445a <= 0) {
            this.d = false;
        } else {
            view.postDelayed(this.g, 1000L);
            this.e = true;
        }
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public boolean a() {
        return this.d;
    }
}
