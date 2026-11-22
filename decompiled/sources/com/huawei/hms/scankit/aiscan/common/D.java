package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C3066w;
import com.huawei.hms.scankit.p._a;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.Collection;
import java.util.Map;
import java.util.Vector;

/* compiled from: TwoDimDecoder.java */
/* loaded from: classes14.dex */
public class D {
    public static byte[] a(C3066w c3066w, Map<EnumC2970d, Object> map, x xVar, int[] iArr, double[] dArr) throws C2967a {
        if (c3066w == null) {
            return null;
        }
        Collection collection = map != null ? (Collection) map.get(EnumC2970d.POSSIBLE_FORMATS) : null;
        if ((collection != null && !collection.contains(BarcodeFormat.QR_CODE) && !collection.contains(BarcodeFormat.PDF_417)) || xVar == null || xVar.i() != null) {
            iArr[0] = c3066w.e();
            iArr[1] = c3066w.c();
            return c3066w.d();
        }
        if (collection != null) {
            collection.clear();
            map.remove(EnumC2970d.POSSIBLE_FORMATS);
            collection.add(xVar.b());
            map.put(EnumC2970d.POSSIBLE_FORMATS, collection);
        } else if (map != null) {
            map.remove(EnumC2970d.POSSIBLE_FORMATS);
            Vector vector = new Vector();
            vector.add(xVar.b());
            map.put(EnumC2970d.POSSIBLE_FORMATS, vector);
        }
        float f = 3.0f / _a.e;
        if (f < 1.0f) {
            f = 1.0f;
        }
        dArr[5] = f;
        return a(c3066w, xVar.h(), dArr, iArr);
    }

    private static byte[] a(C3066w c3066w, z[] zVarArr, double[] dArr, int[] iArr) throws C2967a {
        if (zVarArr == null) {
            iArr[0] = c3066w.e();
            iArr[1] = c3066w.c();
            return c3066w.d();
        }
        int e = c3066w.e();
        int i = e;
        int c = c3066w.c();
        int i2 = 0;
        int i3 = 0;
        for (z zVar : zVarArr) {
            if (zVar != null) {
                if (((int) zVar.b()) < i) {
                    i = (int) zVar.b();
                }
                if (((int) zVar.c()) < c) {
                    c = (int) zVar.c();
                }
                if (((int) zVar.b()) > i2) {
                    i2 = (int) zVar.b();
                }
                if (((int) zVar.c()) > i3) {
                    i3 = (int) zVar.c();
                }
            }
        }
        return a(zVarArr, c3066w, iArr, Math.max(i2 - i, i3 - c), dArr);
    }

    private static byte[] a(z[] zVarArr, C3066w c3066w, int[] iArr, float f, double[] dArr) throws C2967a {
        float b = zVarArr[0].b();
        float b2 = zVarArr[1].b();
        float b3 = zVarArr[2].b();
        float c = zVarArr[0].c();
        float c2 = zVarArr[1].c();
        float c3 = zVarArr[2].c();
        if (b >= 0.0f && b2 >= 0.0f && b3 >= 0.0f && c >= 0.0f && c2 >= 0.0f && c3 >= 0.0f && b <= c3066w.e() && b2 <= c3066w.e() && b3 <= c3066w.e() && c <= c3066w.c() && c2 <= c3066w.c() && c3 <= c3066w.c()) {
            int i = ((int) (c + c3)) / 2;
            int i2 = (int) ((((int) (b + b3)) / 2) - f);
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = (int) (i - f);
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = ((int) f) * 2;
            int e = i2 + i4 <= c3066w.e() ? i4 : c3066w.e() - i2;
            if (i3 + i4 > c3066w.c()) {
                i4 = c3066w.c() - i3;
            }
            C3066w a2 = c3066w.a(i2, i3, e, i4);
            double degrees = dArr[0] + Math.toDegrees(a(zVarArr[0], zVarArr[1])) + 90.0d;
            dArr[0] = degrees;
            dArr[1] = i2;
            dArr[2] = i3;
            double d = e;
            dArr[3] = d;
            double d2 = i4;
            dArr[4] = d2;
            double radians = Math.toRadians(degrees);
            int abs = (int) (((Math.abs(Math.sin(radians)) * d) + (Math.abs(Math.cos(radians)) * d2)) * dArr[5]);
            int abs2 = (int) (((d2 * Math.abs(Math.sin(radians))) + (d * Math.abs(Math.cos(radians)))) * dArr[5]);
            iArr[0] = abs2;
            iArr[1] = abs;
            byte[] imageRotate = LoadOpencvJNIUtil.imageRotate(a2.d(), a2.c(), a2.e(), abs, abs2, (float) dArr[0], dArr[5]);
            if (imageRotate != null) {
                return imageRotate;
            }
            iArr[0] = c3066w.e();
            iArr[1] = c3066w.c();
            return c3066w.d();
        }
        iArr[0] = c3066w.e();
        iArr[1] = c3066w.c();
        throw C2967a.a();
    }

    public static double a(z zVar, z zVar2) {
        return Math.atan2(zVar2.c() - zVar.c(), zVar2.b() - zVar.b());
    }

    public static z[] a(z[] zVarArr, int i, int i2, double[] dArr) {
        double d;
        double d2;
        z[] zVarArr2 = zVarArr;
        if (zVarArr2 == null) {
            return null;
        }
        double d3 = dArr[3];
        double d4 = 0.0d;
        int i3 = d3 != 0.0d ? (int) d3 : i;
        double d5 = dArr[4];
        int i4 = d5 != 0.0d ? (int) d5 : i2;
        double d6 = dArr[5];
        z[] zVarArr3 = new z[zVarArr2.length];
        int i5 = 0;
        double radians = Math.toRadians(dArr[0]);
        double cos = Math.cos(radians) * d6;
        double sin = Math.sin(radians) * d6;
        double d7 = i4;
        double d8 = i3;
        double abs = (((Math.abs(sin) - sin) * d7) + ((Math.abs(cos) - cos) * d8)) / 2.0d;
        double d9 = -sin;
        double abs2 = ((d7 * (Math.abs(cos) - cos)) + ((Math.abs(sin) + sin) * d8)) / 2.0d;
        while (i5 < zVarArr2.length) {
            if (zVarArr2[i5] != null) {
                d2 = d4;
                d = d9;
                double b = (((r3.b() - abs) * cos) + ((abs2 - r3.c()) * sin)) / ((cos * cos) - (sin * d));
                zVarArr3[i5] = new z(Math.round(b) + ((int) dArr[1]), Math.round(sin == d2 ? (r3.c() - abs2) / cos : ((r3.b() - abs) - (cos * b)) / sin) + ((int) dArr[2]));
            } else {
                d = d9;
                d2 = d4;
                zVarArr3[i5] = null;
            }
            i5++;
            zVarArr2 = zVarArr;
            d4 = d2;
            d9 = d;
        }
        return zVarArr3;
    }
}
