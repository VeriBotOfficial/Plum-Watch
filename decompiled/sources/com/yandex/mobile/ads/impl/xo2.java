package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class xo2 {
    public static void a(vn2 vn2Var) {
        if (!vn2Var.h()) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (vn2Var.k()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
