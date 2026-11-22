package com.baidu.ar;

import com.baidu.ar.algotrack2d.AR2DJniClient;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.callback.ICallbackWith;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class vc {
    public static final String f = "vc";

    /* renamed from: a, reason: collision with root package name */
    public xc f7260a;
    public float[][] c;
    public fd e;
    public boolean b = false;
    public long d = 0;

    public final float a(int i, int i2, float f2) {
        if (Float.isNaN(f2)) {
            return f2;
        }
        return (f2 * 500.0f) / ((float) Math.sqrt((i * i) + (i2 * i2)));
    }

    public final float a(boolean z, float[] fArr) {
        if (!z || fArr == null) {
            return Float.NaN;
        }
        float f2 = fArr[9];
        float f3 = fArr[10];
        float f4 = fArr[11];
        return a(this.f7260a.f(), this.f7260a.e(), (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4)));
    }

    public void a() {
        if (this.b) {
            AR2DJniClient.arRelease();
            this.b = false;
        }
        fd fdVar = this.e;
        if (fdVar != null) {
            fdVar.a();
        }
    }

    public void a(FramePixels framePixels, ICallbackWith<yc> iCallbackWith) {
        xc xcVar;
        if (framePixels == null || !this.b || (xcVar = this.f7260a) == null) {
            return;
        }
        float[] fArr = this.c[(int) (this.d % xcVar.a())];
        this.d = r0 + 1;
        ByteBuffer pixelsAddress = framePixels.getPixelsAddress();
        long currentTimeMillis = System.currentTimeMillis();
        int arTracking = AR2DJniClient.arTracking(pixelsAddress, fArr);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        boolean z = arTracking == 1;
        int[] iArr = new int[2];
        if (AR2DJniClient.arGetMarkerSize(iArr)) {
            this.f7260a.d(iArr[0]);
            this.f7260a.c(iArr[1]);
        } else {
            h.a(f, "arGetMarkerSize fail");
        }
        float a2 = a(z, fArr);
        wc wcVar = new wc();
        wcVar.a(z);
        wcVar.a(fArr);
        wcVar.c(z);
        wcVar.b(this.e.a(z));
        wcVar.d(this.e.b());
        wcVar.e(this.e.c());
        wcVar.a(a2);
        wcVar.a(currentTimeMillis2);
        wcVar.b(framePixels.getTimestamp());
        if (iCallbackWith != null) {
            iCallbackWith.run(new yc(wcVar));
        }
    }

    public void a(xc xcVar) {
        try {
            com.baidu.ar.libloader.a.a("dumixar");
            this.f7260a = xcVar;
            boolean z = AR2DJniClient.arInit(xcVar.c(), xcVar.b(), a(xcVar.c(), xcVar.b()), xcVar.d()) == 1;
            this.b = z;
            if (z) {
                this.c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, xcVar.a(), 12);
            } else {
                AR2DJniClient.arRelease();
            }
            this.e = new fd();
        } catch (UnsatisfiedLinkError e) {
            h.b(f, "track2d algo UnsatisfiedLinkError " + e.getMessage());
        }
    }

    public final float[] a(int i, int i2) {
        float f2 = i;
        float f3 = f2 / 2.0f;
        float f4 = (f2 * 600.0f) / 640.0f;
        return new float[]{f4, 0.0f, f3, 0.0f, f4, i2 / 2.0f, 0.0f, 0.0f, 1.0f};
    }
}
