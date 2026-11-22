package com.bytedance.adsdk.kg.bh;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.kg.gff.kg.zu;

/* loaded from: classes13.dex */
public class rb {
    private static final PointF fxn = new PointF();

    public static float fxn(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int fxn(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static boolean gff(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF fxn(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void fxn(zu zuVar, Path path) {
        Path path2;
        path.reset();
        PointF fxn2 = zuVar.fxn();
        path.moveTo(fxn2.x, fxn2.y);
        fxn.set(fxn2.x, fxn2.y);
        int i = 0;
        while (i < zuVar.gff().size()) {
            com.bytedance.adsdk.kg.gff.fxn fxnVar = zuVar.gff().get(i);
            PointF fxn3 = fxnVar.fxn();
            PointF kg = fxnVar.kg();
            PointF gff = fxnVar.gff();
            PointF pointF = fxn;
            if (fxn3.equals(pointF) && kg.equals(gff)) {
                path.lineTo(gff.x, gff.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(fxn3.x, fxn3.y, kg.x, kg.y, gff.x, gff.y);
            }
            pointF.set(gff.x, gff.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (zuVar.kg()) {
            path3.close();
        }
    }

    static int fxn(float f, float f2) {
        return fxn((int) f, (int) f2);
    }

    private static int fxn(int i, int i2) {
        return i - (i2 * kg(i, i2));
    }

    private static int kg(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int fxn(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float kg(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
