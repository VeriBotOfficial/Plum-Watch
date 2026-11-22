package com.baidu.platform.comapi.bmsdk.animation;

/* loaded from: classes13.dex */
public class BmRotateAnimation extends BmAnimation {

    /* renamed from: a, reason: collision with root package name */
    private float f8544a;
    private float b;

    public BmRotateAnimation(float f, float f2) {
        super(84, nativeCreate());
        this.f8544a = f;
        this.b = f2;
        nativeBuildAnimation(this.nativeInstance, f, f2);
    }

    private static native boolean nativeBuildAnimation(long j, float f, float f2);

    private static native long nativeCreate();
}
