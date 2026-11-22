package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelType;

/* loaded from: classes12.dex */
public class k9 extends o4 {
    public m6 i;
    public long j;

    public k9(Context context, int i, int i2) {
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.e = pixelReadParams;
        pixelReadParams.setOutputWidth(i);
        this.e.setOutputHeight(i2);
        if (this.i == null) {
            Object a2 = ab.a("com.baidu.ar.maprecord.NavigationRecoderController");
            if (a2 instanceof m6) {
                m6 m6Var = (m6) a2;
                this.i = m6Var;
                m6Var.a(context, i, i2);
            }
        }
    }

    public void a(float f) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.a(f);
        }
    }

    public void a(float f, float f2) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.a(f, f2);
        }
    }

    public void a(String str) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.a(str);
        }
    }

    public void a(float[] fArr) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.c(fArr);
        }
    }

    public void a(float[] fArr, int i) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.a(fArr, i);
        }
    }

    public void a(float[] fArr, int i, boolean z) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.a(fArr, i, z);
        }
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        m6 m6Var = this.i;
        if (m6Var == null) {
            return false;
        }
        this.j++;
        m6Var.a(framePixels.getPixelData());
        return false;
    }

    public void b(float[] fArr) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.b(fArr);
        }
    }

    public void c(float[] fArr) {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.a(fArr);
        }
    }

    @Override // com.baidu.ar.o4
    public void e() {
    }

    @Override // com.baidu.ar.o4
    public void f() {
    }

    public void g() {
        m6 m6Var = this.i;
        if (m6Var != null) {
            m6Var.stopRecord();
            this.i = null;
        }
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return "NavigationRecoderDetector";
    }
}
