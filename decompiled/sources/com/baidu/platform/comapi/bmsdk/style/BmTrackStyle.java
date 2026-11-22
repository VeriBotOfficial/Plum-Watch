package com.baidu.platform.comapi.bmsdk.style;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes13.dex */
public class BmTrackStyle extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8554a;
    private int b;
    private BmBitmapResource c;
    private float d;
    private BmBitmapResource e;
    private float f;
    private int g;

    public BmTrackStyle() {
        super(61, nativeCreate());
        this.f8554a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0.0f;
        this.e = null;
        this.f = 0.0f;
        this.g = 0;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBitmapResource(long j, long j2);

    private static native boolean nativeSetColor(long j, int i);

    private static native boolean nativeSetOpacity(long j, float f);

    private static native boolean nativeSetPaletteBitmapResource(long j, long j2);

    private static native boolean nativeSetPaletteOpacity(long j, float f);

    private static native boolean nativeSetTrackType(long j, int i);

    private static native boolean nativeSetWidth(long j, int i);

    public boolean a(int i) {
        this.g = i;
        return nativeSetColor(getNativeInstance(), a.a(this.g));
    }

    public boolean b(int i) {
        this.b = i;
        return nativeSetTrackType(getNativeInstance(), i);
    }

    public boolean c(int i) {
        this.f8554a = i;
        return nativeSetWidth(getNativeInstance(), this.f8554a);
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() throws Exception {
        super.close();
        BmBitmapResource bmBitmapResource = this.c;
        if (bmBitmapResource != null) {
            try {
                bmBitmapResource.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
            this.c = null;
        }
        BmBitmapResource bmBitmapResource2 = this.e;
        if (bmBitmapResource2 != null) {
            try {
                bmBitmapResource2.close();
            } catch (Exception unused2) {
                Log.e("BmBitmapResource", "BmBitmapResource Palette close failed");
            }
            this.e = null;
        }
    }

    public boolean a(BmBitmapResource bmBitmapResource) {
        if (bmBitmapResource == null) {
            return false;
        }
        BmBitmapResource bmBitmapResource2 = this.c;
        if (bmBitmapResource2 != null && bmBitmapResource2.getNativeInstance() != bmBitmapResource.getNativeInstance()) {
            try {
                this.c.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.c = bmBitmapResource;
        return nativeSetBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }

    public boolean b(BmBitmapResource bmBitmapResource) {
        if (bmBitmapResource == null) {
            return false;
        }
        BmBitmapResource bmBitmapResource2 = this.e;
        if (bmBitmapResource2 != null && bmBitmapResource2.getNativeInstance() != bmBitmapResource.getNativeInstance()) {
            try {
                this.c.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.e = bmBitmapResource;
        return nativeSetPaletteBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }

    public boolean a(float f) {
        this.d = f;
        return nativeSetOpacity(getNativeInstance(), this.d);
    }

    public boolean b(float f) {
        this.f = f;
        return nativeSetPaletteOpacity(getNativeInstance(), this.f);
    }
}
