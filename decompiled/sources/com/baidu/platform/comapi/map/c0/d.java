package com.baidu.platform.comapi.map.c0;

import android.util.Pair;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.map.c0.a;

/* compiled from: Tracker.java */
/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private VelocityTracker f8631a;
    public final int b;
    public final int c;

    public d() {
        if (JNIInitializer.getCachedContext() == null) {
            this.c = ViewConfiguration.getMinimumFlingVelocity();
            this.b = ViewConfiguration.getMaximumFlingVelocity();
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(JNIInitializer.getCachedContext());
        if (viewConfiguration == null) {
            this.c = ViewConfiguration.getMinimumFlingVelocity();
            this.b = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            this.c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.b = viewConfiguration.getScaledMaximumFlingVelocity();
        }
    }

    public void a() {
        VelocityTracker velocityTracker = this.f8631a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8631a = null;
        }
    }

    public void b() {
        this.f8631a = VelocityTracker.obtain();
    }

    public Pair<a.d, a.d> c() {
        VelocityTracker velocityTracker = this.f8631a;
        if (velocityTracker == null) {
            return new Pair<>(new a.d(0.0d, 0.0d), new a.d(0.0d, 0.0d));
        }
        velocityTracker.computeCurrentVelocity(1000, this.b);
        return new Pair<>(new a.d(this.f8631a.getXVelocity(0), this.f8631a.getYVelocity(0)), new a.d(this.f8631a.getXVelocity(1), this.f8631a.getYVelocity(1)));
    }

    public void a(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f8631a;
        if (velocityTracker == null) {
            this.f8631a = VelocityTracker.obtain();
        } else {
            velocityTracker.addMovement(motionEvent);
        }
    }
}
