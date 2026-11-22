package com.qumeng.overseas.advlib.trdparty.unionset.common;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;

/* loaded from: classes17.dex */
public class a {
    private static final long k = 200;
    public static final long l = 100;
    private static final long m = 300;
    private d b;
    private boolean d;
    private boolean e;
    private View f;
    private Handler h;
    private long i;
    private boolean j;

    /* renamed from: a, reason: collision with root package name */
    private boolean f13353a = true;
    private Rect c = new Rect();
    private int g = hashCode();

    /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.common.a$a, reason: collision with other inner class name */
    class HandlerC0869a extends Handler {
        HandlerC0869a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (a.this.f != null) {
                int measuredHeight = a.this.f.getMeasuredHeight();
                int measuredWidth = a.this.f.getMeasuredWidth();
                if (message.what == a.this.g) {
                    boolean localVisibleRect = a.this.f.getLocalVisibleRect(a.this.c);
                    if (a.this.f.isShown() && localVisibleRect) {
                        int abs = Math.abs(a.this.c.right - a.this.c.left);
                        int abs2 = Math.abs(a.this.c.bottom - a.this.c.top);
                        a.b(a.this, 200L);
                        if (a.this.b != null && !a.this.e && a.this.f.getAlpha() != 0.0f) {
                            a aVar = a.this;
                            if (aVar.a(abs, abs2, measuredWidth, measuredHeight, aVar.i)) {
                                a.this.b.onExposed();
                                a.this.e = true;
                            }
                        }
                    } else {
                        a.this.i = 0L;
                    }
                    if (!a.this.d || a.this.e) {
                        return;
                    }
                    a.this.h.sendEmptyMessageDelayed(a.this.g, 200L);
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.d = false;
            if (a.this.h != null) {
                a.this.h.removeMessages(a.this.g);
                a.this.h = null;
            }
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.b.onExposed();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }
    }

    public interface d {
        void onExposed();
    }

    boolean a(int i, int i2, int i3, int i4, long j) {
        return i >= 50 && i2 >= 50 && ((((float) i) * 1.0f) * ((float) i2)) / ((float) (i3 * i4)) >= 0.2f;
    }

    static /* synthetic */ long b(a aVar, long j) {
        long j2 = aVar.i + j;
        aVar.i = j2;
        return j2;
    }

    public void a(View view, d dVar) {
        this.f = view;
        this.b = dVar;
        if (this.f13353a) {
            this.h = new HandlerC0869a();
            if (view.isAttachedToWindow()) {
                a();
            }
            view.addOnAttachStateChangeListener(new b());
            return;
        }
        if (view.isAttachedToWindow()) {
            this.b.onExposed();
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Handler handler;
        this.d = true;
        if (this.j || this.e || (handler = this.h) == null) {
            return;
        }
        this.j = true;
        handler.sendEmptyMessageDelayed(this.g, 200L);
    }

    public void a(d dVar) {
        this.b = dVar;
    }

    public void a(boolean z) {
        this.f13353a = z;
    }
}
