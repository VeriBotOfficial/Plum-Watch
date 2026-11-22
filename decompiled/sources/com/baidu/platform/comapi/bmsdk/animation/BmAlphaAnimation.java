package com.baidu.platform.comapi.bmsdk.animation;

/* loaded from: classes13.dex */
public class BmAlphaAnimation extends BmAnimation {

    /* renamed from: a, reason: collision with root package name */
    private float f8543a;
    private float b;

    public BmAlphaAnimation(float f, float f2) {
        super(83, nativeCreate());
        this.f8543a = f;
        this.b = f2;
        nativeBuildAnimation(this.nativeInstance, f, f2);
    }

    private static native boolean nativeBuildAnimation(long j, float f, float f2);

    private static native long nativeCreate();
}
