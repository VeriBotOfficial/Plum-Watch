package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.algo.ARVPASJniClient;
import com.baidu.ar.algo.FrameType;
import com.baidu.ar.algo.JNICCallJava;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.callback.ICallbackWith;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ee implements f7, sd {

    /* renamed from: a, reason: collision with root package name */
    public la f6912a;
    public int b;
    public int c;
    public ARVPASJniClient d;
    public m7 e;
    public float[] f = new float[12];
    public float[] g = {1200.0f, 0.0f, 640.0f, 0.0f, 1200.0f, 360.0f, 0.0f, 0.0f, 1.0f};
    public String h;
    public double[] i;
    public boolean j;
    public b k;

    public class a implements o5 {
        public a() {
        }

        @Override // com.baidu.ar.o5
        public void a(byte[] bArr) {
            if (ee.this.k != null) {
                ee.this.k.a(bArr);
            }
        }
    }

    public interface b {
        void a(byte[] bArr);
    }

    public ee(int i, int i2, a6 a6Var) {
        this.f6912a = la.a(i, i2);
        this.b = i;
        this.c = i2;
        JNICCallJava.setGravityCallBack(a6Var);
        JNICCallJava.setAlgoGeneraProtobufCallBack(new a());
        JNICCallJava.setVPASsParamsTransCallback(this);
    }

    @Override // com.baidu.ar.f7
    public void a() {
        this.d = new ARVPASJniClient();
    }

    public void a(a7 a7Var) {
        JNICCallJava.setsITransModelPointCallback(a7Var);
    }

    @Override // com.baidu.ar.f7
    public void a(FramePixels framePixels, ICallbackWith<oe> iCallbackWith) {
        boolean z;
        if (this.d == null || this.e == null || TextUtils.isEmpty(this.h) || !this.j) {
            return;
        }
        ByteBuffer pixelsAddress = framePixels.getPixelsAddress();
        byte[] bArr = new byte[pixelsAddress.remaining()];
        pixelsAddress.get(bArr);
        if (this.d.trackFrame(bArr, this.e.d(), System.currentTimeMillis(), FrameType.TYPE_YUV) == -1) {
            return;
        }
        int trackerPose = this.d.getTrackerPose(this.f);
        dd ddVar = new dd();
        qe qeVar = new qe(framePixels.getTimestamp());
        if (trackerPose == 0) {
            ddVar.a(this.f);
            z = true;
        } else {
            z = false;
        }
        qeVar.a(z);
        qeVar.a(ddVar);
        iCallbackWith.run(new oe(qeVar));
    }

    public void a(b bVar) {
        this.k = bVar;
    }

    public void a(m7 m7Var) {
        this.e = m7Var;
    }

    public void a(byte[] bArr) {
        ARVPASJniClient aRVPASJniClient = this.d;
        if (aRVPASJniClient != null) {
            aRVPASJniClient.reciveProtobufBuffer(bArr);
        }
    }

    public boolean a(String str) {
        try {
            ARVPASJniClient aRVPASJniClient = this.d;
            if (aRVPASJniClient == null) {
                return false;
            }
            return aRVPASJniClient.addTrackingVPS(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void b(String str) {
        this.h = str;
    }

    @Override // com.baidu.ar.sd
    public double[] b() {
        double[] dArr = this.i;
        return dArr != null ? dArr : new double[]{40.019802d, 116.318888d};
    }

    @Override // com.baidu.ar.sd
    public String c() {
        return this.h;
    }

    public void c(String str) {
        JNICCallJava.setUserID(str);
    }

    public void d() {
        JNICCallJava.removeAllCallback();
        a((b) null);
        a((a7) null);
        ARVPASJniClient aRVPASJniClient = this.d;
        if (aRVPASJniClient != null) {
            aRVPASJniClient.releaseVPS();
        }
    }

    public void e() {
        ARVPASJniClient aRVPASJniClient = this.d;
        if (aRVPASJniClient == null) {
            return;
        }
        aRVPASJniClient.resetVPSAlgo();
    }

    public boolean f() {
        ARVPASJniClient aRVPASJniClient = this.d;
        if (aRVPASJniClient == null) {
            return false;
        }
        return aRVPASJniClient.start(this.b, this.c, this.g, this.f6912a.b());
    }

    public void g() {
        this.j = true;
    }

    public void h() {
        this.j = false;
    }
}
