package com.baidu.ar;

import java.lang.reflect.Constructor;

/* loaded from: classes12.dex */
public class ca implements q6 {

    /* renamed from: a, reason: collision with root package name */
    public q6 f6840a;

    public ca() {
        Constructor<?> a2 = ab.a("com.baidu.ar.statistic.performance.PerformanceStatisticApi", (Class<?>[]) new Class[0]);
        if (a2 != null) {
            this.f6840a = (q6) ab.a(a2, new Object[0]);
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameIn() {
        q6 q6Var = this.f6840a;
        if (q6Var != null) {
            q6Var.onFrameIn();
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameOut() {
        q6 q6Var = this.f6840a;
        if (q6Var != null) {
            q6Var.onFrameOut();
        }
    }
}
