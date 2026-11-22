package com.bytedance.adsdk.kg.rb;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
class dx {
    private static final Interpolator fxn = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> kg;

    dx() {
    }

    private static SparseArray<WeakReference<Interpolator>> fxn() {
        if (kg == null) {
            kg = new SparseArray<>();
        }
        return kg;
    }

    private static WeakReference<Interpolator> fxn(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (dx.class) {
            weakReference = fxn().get(i);
        }
        return weakReference;
    }

    private static void fxn(int i, WeakReference<Interpolator> weakReference) {
        synchronized (dx.class) {
            kg.put(i, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.kg.sg.fxn<T> fxn(JsonReader jsonReader, com.bytedance.adsdk.kg.sg sgVar, float f, ei<T> eiVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return kg(sgVar, jsonReader, f, eiVar);
        }
        if (z) {
            return fxn(sgVar, jsonReader, f, eiVar);
        }
        return fxn(jsonReader, f, eiVar);
    }

    private static <T> com.bytedance.adsdk.kg.sg.fxn<T> fxn(com.bytedance.adsdk.kg.sg sgVar, JsonReader jsonReader, float f, ei<T> eiVar) throws IOException {
        Interpolator fxn2;
        jsonReader.beginObject();
        PointF pointF = null;
        T t = null;
        T t2 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    t = eiVar.kg(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    pointF4 = ud.kg(jsonReader, 1.0f);
                    break;
                case "o":
                    pointF = ud.kg(jsonReader, 1.0f);
                    break;
                case "s":
                    t2 = eiVar.kg(jsonReader, f);
                    break;
                case "t":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointF3 = ud.kg(jsonReader, f);
                    break;
                case "to":
                    pointF2 = ud.kg(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            t = t2;
        } else if (pointF != null && pointF4 != null) {
            fxn2 = fxn(pointF, pointF4);
            com.bytedance.adsdk.kg.sg.fxn<T> fxnVar = new com.bytedance.adsdk.kg.sg.fxn<>(sgVar, t2, t, fxn2, f2, null);
            fxnVar.tw = pointF2;
            fxnVar.jq = pointF3;
            return fxnVar;
        }
        fxn2 = fxn;
        com.bytedance.adsdk.kg.sg.fxn<T> fxnVar2 = new com.bytedance.adsdk.kg.sg.fxn<>(sgVar, t2, t, fxn2, f2, null);
        fxnVar2.tw = pointF2;
        fxnVar2.jq = pointF3;
        return fxnVar2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> com.bytedance.adsdk.kg.sg.fxn<T> kg(com.bytedance.adsdk.kg.sg r23, android.util.JsonReader r24, float r25, com.bytedance.adsdk.kg.rb.ei<T> r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.kg.rb.dx.kg(com.bytedance.adsdk.kg.sg, android.util.JsonReader, float, com.bytedance.adsdk.kg.rb.ei):com.bytedance.adsdk.kg.sg.fxn");
    }

    private static Interpolator fxn(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.kg.bh.rb.kg(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.kg.bh.rb.kg(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.kg.bh.rb.kg(pointF2.x, -1.0f, 1.0f);
        pointF2.y = com.bytedance.adsdk.kg.bh.rb.kg(pointF2.y, -100.0f, 100.0f);
        int fxn2 = com.bytedance.adsdk.kg.bh.bh.fxn(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> fxn3 = com.bytedance.adsdk.kg.rb.fxn() ? null : fxn(fxn2);
        Interpolator interpolator = fxn3 != null ? fxn3.get() : null;
        if (fxn3 != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.kg.rmu.fxn(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.kg.rmu.fxn(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.kg.rb.fxn()) {
            try {
                fxn(fxn2, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.kg.sg.fxn<T> fxn(JsonReader jsonReader, float f, ei<T> eiVar) throws IOException {
        return new com.bytedance.adsdk.kg.sg.fxn<>(eiVar.kg(jsonReader, f));
    }
}
