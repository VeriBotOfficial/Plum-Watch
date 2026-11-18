package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f6207a = new WeakHashMap();
    private final Object b = new Object();
    private final Handler c = new Handler();
    private boolean d = false;
    private final WeakReference e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private a g;

    public interface a {
        void a(int r1, int r2);
    }

    public c5(View view) {
        this.e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.c5$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f$0.b();
            }
        };
        this.f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.b) {
            this.d = false;
            int r3 = -1;
            int r4 = -1;
            for (Map.Entry entry : this.f6207a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (r3 == -1 && r4 == -1) {
                        r3 = num.intValue();
                        r4 = num.intValue();
                    } else {
                        r3 = Math.min(r3, ((Integer) entry.getValue()).intValue());
                        r4 = Math.max(r4, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(r3, r4);
            }
        }
    }

    private void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.postDelayed(new Runnable() { // from class: com.applovin.impl.c5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        }, 100L);
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.g = null;
        View view = (View) this.e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.b) {
            this.f6207a.remove(view);
        }
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(View view, int r4) {
        synchronized (this.b) {
            this.f6207a.put(view, Integer.valueOf(r4));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
