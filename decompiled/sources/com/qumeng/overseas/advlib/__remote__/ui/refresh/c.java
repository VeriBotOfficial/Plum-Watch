package com.qumeng.overseas.advlib.__remote__.ui.refresh;

import android.graphics.Rect;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class c {
    private static final int h = 1000;
    protected static final String i = "TimerHelper";
    private View b;
    private b c;

    /* renamed from: a, reason: collision with root package name */
    protected int f13223a = 0;
    private boolean d = false;
    private boolean e = false;
    private Rect f = new Rect();
    private final Runnable g = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.a(c.i, "onTick.. " + c.this.f13223a, new Object[0]);
            c.this.e = false;
            if (c.this.b()) {
                c cVar = c.this;
                cVar.f13223a++;
                if (cVar.c != null) {
                    c.this.c.onTick(c.this.f13223a);
                }
            }
            c.this.c();
        }
    }

    public interface b {
        void onTick(int i);
    }

    public void d() {
        View view = this.b;
        if (view != null) {
            view.removeCallbacks(this.g);
        }
        this.d = false;
        this.e = false;
        n.a(i, "pauseCountdown.. " + this.f13223a, new Object[0]);
    }

    public void e() {
        this.d = true;
        c();
        n.a(i, "resumeCountdown.. " + this.f13223a, new Object[0]);
    }

    public void f() {
        this.f13223a = 0;
        View view = this.b;
        if (view != null) {
            view.removeCallbacks(this.g);
        }
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        n.a(i, "stopCountdown.. " + this.f13223a, new Object[0]);
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
        view.postDelayed(this.g, 1000L);
        this.e = true;
    }

    public void a(View view) {
        this.b = view;
        this.d = true;
        this.e = false;
        c();
        n.a(i, "startCountdown.. " + this.f13223a, new Object[0]);
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public boolean a() {
        return this.d;
    }
}
