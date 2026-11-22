package com.baidu.platform.comapi.bmsdk.style;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes13.dex */
public class BmSurfaceStyle extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8552a;
    private int b;
    private BmBitmapResource c;

    public BmSurfaceStyle() {
        super(53, nativeCreate());
        this.f8552a = 0;
        this.b = 0;
        this.c = null;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBitmapResource(long j, long j2);

    private static native boolean nativeSetBmpResId(long j, int i);

    private static native boolean nativeSetColor(long j, int i);

    public boolean a(int i) {
        this.b = i;
        return nativeSetColor(getNativeInstance(), a.a(i));
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
        this.f8552a = 0;
        return nativeSetBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }
}
