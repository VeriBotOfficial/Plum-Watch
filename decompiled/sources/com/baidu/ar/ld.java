package com.baidu.ar;

import android.opengl.Matrix;
import com.baidu.ar.algovo.ARVOJniClient;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.slam.TrackModel;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class ld implements e7, d7 {
    public static final String h = "ld";
    public static final float[] i = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public md f7068a;
    public la b;
    public float[] d;
    public float g;
    public boolean c = false;
    public float e = 0.0f;
    public boolean f = false;

    public ld(md mdVar) {
        this.f7068a = mdVar;
    }

    @Override // com.baidu.ar.d7
    public int a(String str, int i2, int i3, float[] fArr, float f) {
        if (!this.c) {
            return -1;
        }
        this.g = f;
        if (fArr == null) {
            fArr = i;
        }
        int insertModel = ARVOJniClient.insertModel(str, i2, i3, fArr, 1.0f);
        this.f = true;
        return insertModel;
    }

    @Override // com.baidu.ar.e7
    public void a() {
        md mdVar = this.f7068a;
        this.b = la.a(mdVar.f7091a, mdVar.b, false);
        try {
            com.baidu.ar.libloader.a.a("dumixar");
            la laVar = this.b;
            this.c = ARVOJniClient.start(laVar.f7065a, laVar.b, laVar.a(), this.b.b());
        } catch (UnsatisfiedLinkError e) {
            h.b(h, "slam algo UnsatisfiedLinkError " + e.getMessage());
        }
    }

    @Override // com.baidu.ar.e7
    public void a(FramePixels framePixels, ICallbackWith<qd> iCallbackWith) {
        md mdVar;
        float[] b;
        if (framePixels == null || !this.c || (mdVar = this.f7068a) == null || (b = mdVar.c.b()) == null || b.length == 0) {
            return;
        }
        if (!this.f) {
            iCallbackWith.run(new qd(framePixels.getTimestamp()));
            return;
        }
        this.d = b;
        ARVOJniClient.track(framePixels.getPixelsAddress(), a(b));
        ArrayList<TrackModel> fetchModelPose = ARVOJniClient.fetchModelPose();
        Iterator<TrackModel> it = fetchModelPose.iterator();
        while (it.hasNext()) {
            a(it.next().pose, this.d);
        }
        rd rdVar = new rd(framePixels.getTimestamp());
        rdVar.a(true);
        rdVar.b(true);
        rdVar.a(fetchModelPose);
        iCallbackWith.run(new qd(rdVar));
    }

    public final void a(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        float[] fArr4 = new float[16];
        Matrix.invertM(fArr3, 0, fArr2, 0);
        Matrix.multiplyMM(fArr4, 0, i, 0, fArr3, 0);
        Matrix.invertM(fArr3, 0, fArr4, 0);
        fArr[0] = fArr3[0];
        fArr[1] = fArr3[1];
        fArr[2] = fArr3[2];
        fArr[4] = fArr3[4];
        fArr[5] = fArr3[5];
        fArr[6] = fArr3[6];
        fArr[8] = fArr3[8];
        fArr[9] = fArr3[9];
        fArr[10] = fArr3[10];
        float c = this.b.c();
        float f = fArr[12];
        float f2 = this.g;
        float f3 = fArr[13] * f2 * c;
        float f4 = fArr[14] * f2 * c;
        fArr[12] = f * f2 * c;
        fArr[13] = f3;
        fArr[14] = f4;
        Matrix.rotateM(fArr, 0, this.e - 90.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // com.baidu.ar.d7
    public float[] a(float f, float[] fArr) {
        if (!this.c) {
            return null;
        }
        float[] fArr2 = new float[2];
        return new float[]{ARVOJniClient.calModelPosition(this.b.a(), f, a(fArr), fArr2), fArr2[0], fArr2[1]};
    }

    public final float[] a(float[] fArr) {
        if (this.e == 0.0f) {
            this.e = this.f7068a.c.a();
        }
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.invertM(fArr2, 0, fArr, 0);
        Matrix.multiplyMM(fArr3, 0, i, 0, fArr2, 0);
        return new float[]{-fArr3[4], -fArr3[5], -fArr3[6], -fArr3[0], -fArr3[1], -fArr3[2], -fArr3[8], -fArr3[9], -fArr3[10], 0.0f, 0.0f, 0.0f};
    }

    @Override // com.baidu.ar.d7
    public void b() {
        if (this.c && this.f) {
            ARVOJniClient.removeAllModel();
            this.f = false;
        }
    }

    public void c() {
        if (this.c) {
            ARVOJniClient.stop();
            this.c = false;
        }
        this.f7068a = null;
    }
}
