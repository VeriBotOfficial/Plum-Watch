package com.umeng.analytics.pro;

/* compiled from: ShortStack.java */
/* loaded from: classes2.dex */
public class ar {

    /* renamed from: a, reason: collision with root package name */
    private short[] f13793a;
    private int b = -1;

    public ar(int i) {
        this.f13793a = new short[i];
    }

    public short a() {
        short[] sArr = this.f13793a;
        int i = this.b;
        this.b = i - 1;
        return sArr[i];
    }

    public void a(short s) {
        if (this.f13793a.length == this.b + 1) {
            d();
        }
        short[] sArr = this.f13793a;
        int i = this.b + 1;
        this.b = i;
        sArr[i] = s;
    }

    private void d() {
        short[] sArr = this.f13793a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f13793a = sArr2;
    }

    public short b() {
        return this.f13793a[this.b];
    }

    public void c() {
        this.b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<ShortStack vector:[");
        for (int i = 0; i < this.f13793a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.b) {
                sb.append(">>");
            }
            sb.append((int) this.f13793a[i]);
            if (i == this.b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }
}
