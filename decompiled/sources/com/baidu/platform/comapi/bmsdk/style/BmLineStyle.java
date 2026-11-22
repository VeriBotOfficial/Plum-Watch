package com.baidu.platform.comapi.bmsdk.style;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes13.dex */
public class BmLineStyle extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8551a;
    private int b;
    private int c;
    private BmBitmapResource d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;

    public BmLineStyle() {
        super(51, nativeCreate());
        this.f8551a = 0;
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.e = 0.0f;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    private static native boolean nativeClearBitmapResource(long j);

    private static native long nativeCreate();

    private static native boolean nativeSetBitmapResource(long j, long j2);

    private static native boolean nativeSetBmpResId(long j, int i);

    private static native boolean nativeSetColor(long j, int i);

    private static native boolean nativeSetLineResId(long j, int i);

    private static native boolean nativeSetLineType(long j, int i);

    private static native boolean nativeSetStrokeColor(long j, int i);

    private static native boolean nativeSetStrokeWidth(long j, int i);

    private static native boolean nativeSetTextureOption(long j, int i);

    private static native boolean nativeSetWidth(long j, float f);

    public boolean a(int i) {
        this.c = i;
        return nativeSetColor(getNativeInstance(), a.a(i));
    }

    public boolean b(int i) {
        this.i = i;
        return nativeSetLineType(getNativeInstance(), i);
    }

    public boolean c(int i) {
        this.h = i;
        return nativeSetTextureOption(getNativeInstance(), i);
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() throws Exception {
        super.close();
        BmBitmapResource bmBitmapResource = this.d;
        if (bmBitmapResource != null) {
            try {
                bmBitmapResource.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
            this.d = null;
        }
    }

    public boolean a(BmBitmapResource bmBitmapResource) {
        if (bmBitmapResource == null) {
            return false;
        }
        BmBitmapResource bmBitmapResource2 = this.d;
        if (bmBitmapResource2 != null && bmBitmapResource2.getNativeInstance() != bmBitmapResource.getNativeInstance()) {
            try {
                this.d.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.d = bmBitmapResource;
        this.b = 0;
        this.f8551a = 0;
        return nativeSetBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }

    public boolean a() {
        if (this.d == null) {
            return true;
        }
        this.d = null;
        return nativeClearBitmapResource(this.nativeInstance);
    }

    public boolean a(float f) {
        this.e = f / 2.0f;
        return nativeSetWidth(getNativeInstance(), this.e);
    }
}
