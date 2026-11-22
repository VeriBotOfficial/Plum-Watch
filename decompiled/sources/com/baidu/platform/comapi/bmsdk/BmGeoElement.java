package com.baidu.platform.comapi.bmsdk;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyleOption;
import com.baidu.platform.comapi.bmsdk.style.BmTrackStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class BmGeoElement extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f8539a = true;
    private final int b;
    private BmLineStyle c;
    private BmTrackStyle d;
    private List<b> e;
    private String f;
    private int g;

    public BmGeoElement() {
        super(70, nativeCreate(0));
        this.e = new ArrayList();
        this.b = 0;
    }

    private static native boolean nativeAddPoint(long j, double d, double d2, double d3);

    private static native boolean nativeAddStyleOption(long j, long j2);

    private static native boolean nativeClearGradientColors(long j);

    private static native long nativeCreate(int i);

    private static native boolean nativeDelGradientColors(long j, int i);

    private static native boolean nativeRemoveStyleOption(long j, long j2);

    private static native boolean nativeSetCoordChainHandle(long j, long j2);

    private static native boolean nativeSetCoordChainType(long j, int i);

    private static native boolean nativeSetGradientColors(long j, int i, int[] iArr, int i2);

    private static native boolean nativeSetPoints(long j, double[] dArr, int i, int i2);

    private static native boolean nativeSetStyle(long j, long j2);

    private static native boolean nativeSetTrackStyle(long j, long j2);

    public boolean a(BmLineStyle bmLineStyle) {
        if (bmLineStyle == null) {
            return false;
        }
        BmLineStyle bmLineStyle2 = this.c;
        if (bmLineStyle2 != null && bmLineStyle2.getNativeInstance() != bmLineStyle.getNativeInstance()) {
            try {
                this.c.close();
            } catch (Exception unused) {
                Log.e("BmLineStyle", "BmLineStyle close failed");
            }
        }
        this.c = bmLineStyle;
        return nativeSetStyle(getNativeInstance(), bmLineStyle.getNativeInstance());
    }

    public boolean b(List<b> list) {
        double[] dArr;
        this.e.clear();
        this.e.addAll(list);
        int i = 0;
        if (list == null || list.size() <= 0) {
            dArr = null;
        } else {
            int size = list.size() * 3;
            dArr = new double[size];
            for (int i2 = 0; i2 < list.size(); i2++) {
                int i3 = i2 * 3;
                dArr[i3] = list.get(i2).f8547a;
                dArr[i3 + 1] = list.get(i2).b;
                dArr[i3 + 2] = list.get(i2).c;
                if (list.get(i2).c < 0.0d) {
                    return false;
                }
            }
            i = size;
        }
        if (f8539a || dArr != null) {
            return nativeSetPoints(getNativeInstance(), dArr, i, 3);
        }
        throw new AssertionError();
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() throws Exception {
        super.close();
        BmLineStyle bmLineStyle = this.c;
        if (bmLineStyle != null) {
            try {
                bmLineStyle.close();
            } catch (Exception unused) {
                Log.e("BmLineStyle", "BmLineStyle close failed");
            }
            this.c = null;
        }
        BmTrackStyle bmTrackStyle = this.d;
        if (bmTrackStyle != null) {
            try {
                bmTrackStyle.close();
            } catch (Exception unused2) {
                Log.e("BmTrackStyle", "BmTrackStyle close failed");
            }
            this.d = null;
        }
    }

    public boolean a(BmTrackStyle bmTrackStyle) {
        if (bmTrackStyle == null) {
            return false;
        }
        BmTrackStyle bmTrackStyle2 = this.d;
        if (bmTrackStyle2 != null && bmTrackStyle2.getNativeInstance() != bmTrackStyle.getNativeInstance()) {
            try {
                this.d.close();
            } catch (Exception unused) {
                Log.e("BmTrackStyle", "BmTrackStyle close failed");
            }
        }
        this.d = bmTrackStyle;
        return nativeSetTrackStyle(getNativeInstance(), bmTrackStyle.getNativeInstance());
    }

    public BmGeoElement(int i) {
        super(70, nativeCreate(i));
        this.e = new ArrayList();
        this.b = i;
    }

    public boolean a(BmLineStyleOption bmLineStyleOption) {
        if (bmLineStyleOption == null) {
            return false;
        }
        return nativeAddStyleOption(getNativeInstance(), bmLineStyleOption.getNativeInstance());
    }

    public boolean a(List<b> list) {
        double[] dArr;
        this.e.clear();
        this.e.addAll(list);
        int i = 0;
        if (list == null || list.size() <= 0) {
            dArr = null;
        } else {
            int size = list.size() * 2;
            dArr = new double[size];
            while (i < list.size()) {
                int i2 = i * 2;
                dArr[i2] = list.get(i).f8547a;
                dArr[i2 + 1] = list.get(i).b;
                i++;
            }
            i = size;
        }
        return nativeSetPoints(getNativeInstance(), dArr, i, 2);
    }

    public void a(String str) {
        this.f = str;
    }

    public void a(int i) {
        this.g = i;
    }

    public boolean a(int i, List<Integer> list) {
        int[] iArr;
        int i2 = 0;
        if (list == null || list.size() <= 0) {
            iArr = null;
        } else {
            iArr = new int[list.size()];
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                iArr[i2] = com.baidu.platform.comapi.bmsdk.style.a.a(it.next().intValue());
                i2++;
            }
        }
        return nativeSetGradientColors(getNativeInstance(), i, iArr, i2);
    }
}
