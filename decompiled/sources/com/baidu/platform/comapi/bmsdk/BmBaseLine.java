package com.baidu.platform.comapi.bmsdk;

import android.util.Log;
import com.baidu.mapapi.map.Polyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class BmBaseLine extends BmDrawItem {
    private Polyline i;
    private List<BmGeoElement> j;

    private BmBaseLine() {
        super(7, 0L);
        this.j = new ArrayList();
    }

    private static native boolean nativeAddGeoElement(long j, long j2);

    private static native boolean nativeClearGeoElements(long j);

    private static native boolean nativeDeleteGeoElement(long j, long j2);

    private static native boolean nativeSetBloomAlpha(long j, float f);

    private static native boolean nativeSetBloomBlurTimes(long j, int i);

    private static native boolean nativeSetBloomGradientASpeed(long j, float f);

    private static native boolean nativeSetBloomWidth(long j, float f);

    private static native boolean nativeSetCollisionBehavior(long j, int i);

    private static native boolean nativeSetCollisionTagId(long j, int i);

    private static native boolean nativeSetEndCapType(long j, int i);

    private static native boolean nativeSetGeoElement(long j, long j2);

    private static native boolean nativeSetHighPrecision(long j, boolean z);

    private static native boolean nativeSetJointType(long j, int i);

    private static native boolean nativeSetLineBloomDirection(long j, int i);

    private static native boolean nativeSetLineBloomMode(long j, int i);

    private static native boolean nativeSetLineDirectionCrossType(long j, int i);

    private static native boolean nativeSetSmooth(long j, int i);

    private static native boolean nativeSetSmoothFactor(long j, float f);

    private static native boolean nativeSetStartCapType(long j, int i);

    private static native boolean nativeSetThin(long j, int i);

    private static native boolean nativeSetThinFactor(long j, float f);

    public void a(Polyline polyline) {
        this.i = polyline;
    }

    public boolean b(BmGeoElement bmGeoElement) {
        boolean nativeDeleteGeoElement = nativeDeleteGeoElement(getNativeInstance(), bmGeoElement.getNativeInstance());
        try {
            bmGeoElement.close();
            return nativeDeleteGeoElement;
        } catch (Exception unused) {
            Log.e("BmGeoElement", "BmGeoElement close failed");
            return nativeDeleteGeoElement;
        }
    }

    public boolean c() {
        List<BmGeoElement> list = this.j;
        if (list != null) {
            Iterator<BmGeoElement> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().close();
                } catch (Exception unused) {
                    Log.e("BmGeoElement", "BmGeoElement close failed");
                }
            }
            this.j.clear();
        }
        return nativeClearGeoElements(getNativeInstance());
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmDrawItem, com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() throws Exception {
        super.close();
        List<BmGeoElement> list = this.j;
        if (list != null) {
            Iterator<BmGeoElement> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().close();
                } catch (Exception unused) {
                    Log.e("BmGeoElement", "BmGeoElement close failed");
                }
            }
            this.j.clear();
            this.j = null;
        }
    }

    public Polyline d() {
        return this.i;
    }

    public boolean e(float f) {
        return nativeSetSmoothFactor(getNativeInstance(), f);
    }

    public boolean f(float f) {
        return nativeSetThinFactor(getNativeInstance(), f);
    }

    public boolean g(int i) {
        return nativeSetJointType(getNativeInstance(), i);
    }

    public boolean h(int i) {
        return nativeSetLineBloomDirection(getNativeInstance(), i);
    }

    public boolean i(int i) {
        return nativeSetLineBloomMode(getNativeInstance(), i);
    }

    public boolean j(int i) {
        return nativeSetLineDirectionCrossType(getNativeInstance(), i);
    }

    public boolean k(int i) {
        return nativeSetSmooth(getNativeInstance(), i);
    }

    public boolean l(int i) {
        return nativeSetStartCapType(getNativeInstance(), i);
    }

    public boolean m(int i) {
        return nativeSetThin(getNativeInstance(), i);
    }

    public boolean a(BmGeoElement bmGeoElement) {
        List<BmGeoElement> list = this.j;
        if (list != null) {
            list.add(bmGeoElement);
        }
        return nativeAddGeoElement(getNativeInstance(), bmGeoElement.getNativeInstance());
    }

    public boolean d(float f) {
        return nativeSetBloomWidth(getNativeInstance(), f);
    }

    public boolean e(int i) {
        return nativeSetBloomBlurTimes(getNativeInstance(), i);
    }

    public boolean f(int i) {
        return nativeSetEndCapType(getNativeInstance(), i);
    }

    protected BmBaseLine(int i, long j) {
        super(i, j);
        this.j = new ArrayList();
    }

    public boolean b(float f) {
        return nativeSetBloomAlpha(getNativeInstance(), f);
    }

    public boolean c(float f) {
        return nativeSetBloomGradientASpeed(getNativeInstance(), f);
    }

    public boolean c(boolean z) {
        return nativeSetHighPrecision(getNativeInstance(), z);
    }
}
