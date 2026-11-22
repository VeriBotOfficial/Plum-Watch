package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r02 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16718a;
    private final String b;
    private final String c;
    private final String d;
    private final ui e;
    private final j02 f;
    private final List<j02> g;

    public r02() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r02)) {
            return false;
        }
        r02 r02Var = (r02) obj;
        return Intrinsics.areEqual(this.f16718a, r02Var.f16718a) && Intrinsics.areEqual(this.b, r02Var.b) && Intrinsics.areEqual(this.c, r02Var.c) && Intrinsics.areEqual(this.d, r02Var.d) && Intrinsics.areEqual(this.e, r02Var.e) && Intrinsics.areEqual(this.f, r02Var.f) && Intrinsics.areEqual(this.g, r02Var.g);
    }

    public final int hashCode() {
        String str = this.f16718a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ui uiVar = this.e;
        int hashCode5 = (hashCode4 + (uiVar == null ? 0 : uiVar.hashCode())) * 31;
        j02 j02Var = this.f;
        int hashCode6 = (hashCode5 + (j02Var == null ? 0 : j02Var.hashCode())) * 31;
        List<j02> list = this.g;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.f16718a + ", colorWizButtonText=" + this.b + ", colorWizBack=" + this.c + ", colorWizBackRight=" + this.d + ", backgroundColors=" + this.e + ", smartCenter=" + this.f + ", smartCenters=" + this.g + Separators.RPAREN;
    }

    public /* synthetic */ r02(int i) {
        this(null, null, null, null, null, null, null);
    }

    public r02(String str, String str2, String str3, String str4, ui uiVar, j02 j02Var, List<j02> list) {
        this.f16718a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uiVar;
        this.f = j02Var;
        this.g = list;
    }

    public final ui a() {
        return this.e;
    }

    public final j02 b() {
        return this.f;
    }

    public final List<j02> c() {
        return this.g;
    }
}
