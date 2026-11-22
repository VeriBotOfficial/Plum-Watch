package com.baidu.platform.comapi.bmsdk.animation;

import com.baidu.platform.comapi.bmsdk.b;

/* loaded from: classes13.dex */
public class BmTranslateAnimation extends BmAnimation {

    /* renamed from: a, reason: collision with root package name */
    private double f8546a;
    private double b;
    private double c;
    private double d;

    public BmTranslateAnimation(b bVar, b bVar2) {
        super(82, nativeCreate());
        double d = bVar.f8547a;
        this.f8546a = d;
        double d2 = bVar2.f8547a;
        this.b = d2;
        double d3 = bVar.b;
        this.c = d3;
        double d4 = bVar2.b;
        this.d = d4;
        nativeBuildAnimation(this.nativeInstance, d, d2, d3, d4);
    }

    private static native boolean nativeBuildAnimation(long j, double d, double d2, double d3, double d4);

    private static native long nativeCreate();
}
