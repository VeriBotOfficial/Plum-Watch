package com.baidu.platform.comapi.bmsdk;

import android.util.Log;
import com.baidu.mapapi.map.GroundOverlay;
import com.baidu.platform.comapi.bmsdk.style.BmDrawableResource;

/* loaded from: classes13.dex */
public class BmGround extends BmDrawItem {
    private BmDrawableResource i;
    private GroundOverlay j;

    public BmGround() {
        super(22, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeSetAnchorX(long j, float f);

    private static native boolean nativeSetAnchorY(long j, float f);

    private static native boolean nativeSetDrawableResource(long j, long j2);

    private static native boolean nativeSetHeight(long j, double d);

    private static native boolean nativeSetPosition(long j, double d, double d2, double d3);

    private static native boolean nativeSetWidth(long j, double d);

    public boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        return nativeSetPosition(this.nativeInstance, bVar.f8547a, bVar.b, 0.0d);
    }

    public boolean b(double d) {
        return nativeSetWidth(this.nativeInstance, d);
    }

    public GroundOverlay c() {
        return this.j;
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmDrawItem, com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() throws Exception {
        super.close();
        try {
            BmDrawableResource bmDrawableResource = this.i;
            if (bmDrawableResource != null) {
                bmDrawableResource.close();
            }
        } catch (Exception unused) {
            Log.e("BmBitmapResource", "BmBitmapResource close failed");
        }
    }

    public void a(GroundOverlay groundOverlay) {
        this.j = groundOverlay;
    }

    public boolean b(float f) {
        return nativeSetAnchorX(this.nativeInstance, f);
    }

    public boolean c(float f) {
        return nativeSetAnchorY(this.nativeInstance, f);
    }

    public boolean a(double d) {
        return nativeSetHeight(this.nativeInstance, d);
    }

    public boolean a(BmDrawableResource bmDrawableResource) {
        try {
            BmDrawableResource bmDrawableResource2 = this.i;
            if (bmDrawableResource2 != null) {
                bmDrawableResource2.close();
            }
        } catch (Exception unused) {
            Log.e("BmBitmapResource", "BmBitmapResource close failed");
        }
        this.i = bmDrawableResource;
        if (bmDrawableResource != null) {
            return nativeSetDrawableResource(this.nativeInstance, bmDrawableResource.getNativeInstance());
        }
        return nativeSetDrawableResource(this.nativeInstance, 0L);
    }
}
