package com.applovin.impl;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6253a;
    private final int b;
    private final int c;
    private final int d;

    public h(int r1, int r2, int r3, int r4) {
        this.f6253a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    protected boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f6253a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f6253a));
        map.put("air_num", Integer.valueOf(this.b));
        map.put("fsr_num", Integer.valueOf(this.c));
        map.put("fir_num", Integer.valueOf(this.d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + Separators.RPAREN;
    }

    public int a() {
        return this.d;
    }
}
