package com.baidu.ar;

/* loaded from: classes12.dex */
public class nb extends y2 {
    public nd e;

    public nb(c7 c7Var, nd ndVar, int i, int i2) {
        super(c7Var, i, i2);
        this.e = ndVar;
    }

    @Override // com.baidu.ar.y2, com.baidu.ar.s6
    public boolean a(float[] fArr) {
        String[] split = this.e.e().split(",");
        String a2 = this.f7342a.a(this.e);
        int i = this.b / 2;
        int i2 = this.c / 2;
        try {
            int[] a3 = this.f7342a.a(Float.parseFloat(split[0].trim()), Float.parseFloat(split[1].trim()));
            i = a3[0];
            i2 = a3[1];
        } catch (NumberFormatException unused) {
            h.b("model position is not number !!!");
        }
        this.f7342a.a(a2, i, i2, y2.d, this.e.a());
        return true;
    }
}
