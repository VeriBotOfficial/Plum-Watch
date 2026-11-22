package com.baidu.ar;

/* loaded from: classes12.dex */
public class zb extends y2 {
    public nd e;
    public d7 f;

    public zb(c7 c7Var, nd ndVar, int i, int i2) {
        super(c7Var, i, i2);
        this.e = ndVar;
    }

    public final int a(float[] fArr, int i) {
        return 90.0f - ((float) (((Math.acos((double) (-fArr[10])) * 180.0d) * 1.0d) / 3.141592653589793d)) > ((float) i) ? 0 : 1;
    }

    public void a(d7 d7Var) {
        this.f = d7Var;
    }

    @Override // com.baidu.ar.y2, com.baidu.ar.s6
    public boolean a(float[] fArr) {
        float[] a2 = this.f.a(this.e.c(), fArr);
        if (a2 != null) {
            String a3 = this.f7342a.a(this.e);
            int i = (int) a2[0];
            if (i == 0) {
                int a4 = a(fArr, this.e.c());
                if (a4 == 0) {
                    this.f7342a.c();
                } else if (a4 == 1) {
                    this.f7342a.d();
                }
                this.f7342a.a(new float[16]);
            } else if (i == 1) {
                this.f7342a.a(a3, (int) a2[1], (int) a2[2], y2.d, this.e.a());
                this.f7342a.b();
                return true;
            }
        }
        return false;
    }
}
