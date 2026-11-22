package com.baidu.platform.comapi.bmsdk;

import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmRichView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public abstract class BmBaseMarker extends BmDrawItem {
    private double i;
    private double j;
    private double k;
    private int l;
    private int m;
    private int n;
    private float o;
    private float p;

    /* renamed from: q, reason: collision with root package name */
    private float f8537q;
    private float r;
    private String s;
    private String t;
    private String u;
    private ArrayList<BmRichView> v;

    private BmBaseMarker() {
        super(3, 0L);
        this.i = 0.0d;
        this.j = 0.0d;
        this.k = 0.0d;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0.0f;
        this.p = 1.0f;
        this.f8537q = 1.0f;
        this.r = 1.0f;
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = new ArrayList<>();
    }

    private static native boolean nativeAddRichView(long j, long j2);

    private static native boolean nativeClearRichViews(long j);

    private static native boolean nativeRemoveRichView(long j, long j2);

    private static native boolean nativeSetAnchorX(long j, float f);

    private static native boolean nativeSetAnchorY(long j, float f);

    private static native boolean nativeSetBuildingId(long j, String str);

    private static native boolean nativeSetCollisionBehavior(long j, int i);

    private static native boolean nativeSetCollisionPriority(long j, int i);

    private static native boolean nativeSetDrawFullscreenMaskFlag(long j, boolean z);

    private static native boolean nativeSetFixX(long j, int i);

    private static native boolean nativeSetFixY(long j, int i);

    private static native boolean nativeSetFloorId(long j, String str);

    private static native boolean nativeSetFollowMapRotateAxis(long j, int i);

    private static native boolean nativeSetHeight(long j, int i);

    private static native boolean nativeSetId(long j, String str);

    private static native boolean nativeSetIsFix(long j, int i);

    private static native boolean nativeSetLocated(long j, int i);

    private static native boolean nativeSetOffsetX(long j, int i, int i2);

    private static native boolean nativeSetOffsetY(long j, int i, int i2);

    private static native boolean nativeSetPerspective(long j, int i);

    private static native boolean nativeSetRotate(long j, float f);

    private static native boolean nativeSetRotateFeature(long j, int i);

    private static native boolean nativeSetScale(long j, float f);

    private static native boolean nativeSetScaleX(long j, float f);

    private static native boolean nativeSetScaleY(long j, float f);

    private static native boolean nativeSetTrackBy(long j, int i);

    private static native boolean nativeSetWidth(long j, int i);

    private static native boolean nativeSetX(long j, double d);

    private static native boolean nativeSetXYZ(long j, double d, double d2, double d3);

    private static native boolean nativeSetY(long j, double d);

    private static native boolean nativeSetZ(long j, double d);

    public boolean a(b bVar) {
        this.i = bVar.f8547a;
        this.j = bVar.b;
        this.k = bVar.c;
        return nativeSetXYZ(getNativeInstance(), this.i, this.j, this.k);
    }

    public boolean b(float f) {
        return nativeSetAnchorX(getNativeInstance(), f);
    }

    public boolean c(float f) {
        return nativeSetAnchorY(getNativeInstance(), f);
    }

    public boolean d(float f) {
        this.o = f;
        return nativeSetRotate(getNativeInstance(), f);
    }

    public boolean e(float f) {
        this.p = f;
        this.f8537q = f;
        return nativeSetScale(getNativeInstance(), f);
    }

    public boolean f(float f) {
        this.p = f;
        return nativeSetScaleX(getNativeInstance(), f);
    }

    public boolean g(int i) {
        return nativeSetFixX(getNativeInstance(), i);
    }

    public boolean h(int i) {
        return nativeSetFixY(getNativeInstance(), i);
    }

    public boolean i(int i) {
        return nativeSetFollowMapRotateAxis(getNativeInstance(), i);
    }

    public boolean j(int i) {
        return nativeSetIsFix(getNativeInstance(), i);
    }

    public boolean k(int i) {
        this.l = i;
        return nativeSetLocated(getNativeInstance(), i);
    }

    public boolean l(int i) {
        return a(i, d.NO_SCALE_DPI);
    }

    public boolean m(int i) {
        return b(i, d.NO_SCALE_DPI);
    }

    public boolean n(int i) {
        return nativeSetPerspective(getNativeInstance(), i);
    }

    public boolean b(int i, d dVar) {
        this.n = i;
        return nativeSetOffsetY(getNativeInstance(), i, dVar.a());
    }

    public boolean c() {
        this.v.clear();
        return nativeClearRichViews(getNativeInstance());
    }

    public boolean g(float f) {
        this.f8537q = f;
        return nativeSetScaleY(getNativeInstance(), f);
    }

    public boolean f(int i) {
        long nativeInstance = getNativeInstance();
        if (i < 0) {
            i = 0;
        }
        return nativeSetCollisionPriority(nativeInstance, i);
    }

    public boolean b(BmRichView bmRichView) {
        this.v.remove(bmRichView);
        return nativeRemoveRichView(getNativeInstance(), bmRichView.getNativeInstance());
    }

    public boolean e(int i) {
        return nativeSetCollisionBehavior(getNativeInstance(), i);
    }

    public boolean a(int i, d dVar) {
        this.m = i;
        return nativeSetOffsetX(getNativeInstance(), i, dVar.a());
    }

    public BmBaseUI b(long j) {
        if (j == 0) {
            return null;
        }
        Iterator<BmRichView> it = this.v.iterator();
        while (it.hasNext()) {
            BmBaseUI a2 = it.next().a(j);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public boolean a(BmRichView bmRichView) {
        this.v.add(bmRichView);
        return nativeAddRichView(getNativeInstance(), bmRichView.getNativeInstance());
    }

    public boolean a(String str) {
        return nativeSetId(getNativeInstance(), str);
    }

    protected BmBaseMarker(int i, long j) {
        super(i, j);
        this.i = 0.0d;
        this.j = 0.0d;
        this.k = 0.0d;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0.0f;
        this.p = 1.0f;
        this.f8537q = 1.0f;
        this.r = 1.0f;
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = new ArrayList<>();
    }
}
