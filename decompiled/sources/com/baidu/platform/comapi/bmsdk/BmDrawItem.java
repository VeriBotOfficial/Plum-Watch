package com.baidu.platform.comapi.bmsdk;

import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;

/* loaded from: classes13.dex */
public abstract class BmDrawItem extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    protected int f8538a;
    protected float b;
    protected String c;
    int d;
    private int e;
    private int f;
    long g;
    protected BmAnimation h;

    private BmDrawItem() {
        super(2, 0L);
        this.f8538a = 1;
        this.b = 1.0f;
        this.c = "";
        this.e = 4;
        this.f = 22;
        this.g = -1L;
        this.h = null;
    }

    private static native boolean nativeSetAnimation(long j, long j2);

    private static native boolean nativeSetClickable(long j, boolean z);

    private static native boolean nativeSetHoleClickable(long j, boolean z);

    private static native boolean nativeSetOpacity(long j, float f);

    private static native boolean nativeSetShowLevel(long j, int i, int i2);

    private static native boolean nativeSetVisibility(long j, int i);

    public long a() {
        return this.g;
    }

    public int b() {
        return this.d;
    }

    public boolean c(int i) {
        this.f8538a = i;
        return nativeSetVisibility(getNativeInstance(), i);
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() throws Exception {
        super.close();
    }

    public void d(int i) {
        this.d = i;
    }

    public void a(long j) {
        this.g = j;
    }

    public boolean b(int i) {
        return nativeSetShowLevel(getNativeInstance(), i, this.f);
    }

    public boolean a(int i, int i2) {
        this.e = i;
        this.f = i2;
        return nativeSetShowLevel(getNativeInstance(), this.e, this.f);
    }

    public boolean b(boolean z) {
        return nativeSetHoleClickable(getNativeInstance(), z);
    }

    public boolean a(int i) {
        return nativeSetShowLevel(getNativeInstance(), this.e, i);
    }

    public boolean a(float f) {
        this.b = f;
        return nativeSetOpacity(getNativeInstance(), f);
    }

    public boolean a(boolean z) {
        return nativeSetClickable(getNativeInstance(), z);
    }

    public boolean a(BmAnimation bmAnimation) {
        this.h = bmAnimation;
        return nativeSetAnimation(getNativeInstance(), bmAnimation == null ? 0L : bmAnimation.getNativeInstance());
    }

    public BmDrawItem(int i, long j) {
        super(i, j);
        this.f8538a = 1;
        this.b = 1.0f;
        this.c = "";
        this.e = 4;
        this.f = 22;
        this.g = -1L;
        this.h = null;
    }
}
