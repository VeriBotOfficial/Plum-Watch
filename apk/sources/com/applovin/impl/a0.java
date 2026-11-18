package com.applovin.impl;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes16.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6138a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final boolean g;

    public a0(String str, int r7) {
        this.e = str;
        this.f = r7;
        String[] strArrSplit = str.split(",");
        boolean z = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.g = z;
        if (z) {
            this.f6138a = a(strArrSplit[0]);
            this.b = a(strArrSplit[1]);
            this.c = a(strArrSplit[2]);
            this.d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f6138a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    protected boolean a(Object obj) {
        return obj instanceof a0;
    }

    public String b() {
        return this.f6138a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!a0Var.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = a0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = a0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = a0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = a0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.f6138a.equals("applovin.com");
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        String strB = b();
        int r0 = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int r1 = ((r0 + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strE = e();
        int r2 = (r1 * 59) + (strE == null ? 43 : strE.hashCode());
        String strA = a();
        return (r2 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + Separators.RPAREN;
    }

    public String a() {
        return this.d;
    }

    public boolean a(a0 a0Var) {
        if (!a0Var.b().equals(this.f6138a) || !a0Var.c().equals(this.b) || !a0Var.e().equals(this.c)) {
            return false;
        }
        if (a0Var.a().equals("")) {
            return true;
        }
        return a0Var.a().equals(this.d);
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public a0(String str) {
        this(str, -1);
    }
}
