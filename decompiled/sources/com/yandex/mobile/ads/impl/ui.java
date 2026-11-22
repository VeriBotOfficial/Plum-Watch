package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ui {

    /* renamed from: a, reason: collision with root package name */
    private final String f17055a;
    private final String b;
    private final String c;
    private final String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui)) {
            return false;
        }
        ui uiVar = (ui) obj;
        return Intrinsics.areEqual(this.f17055a, uiVar.f17055a) && Intrinsics.areEqual(this.b, uiVar.b) && Intrinsics.areEqual(this.c, uiVar.c) && Intrinsics.areEqual(this.d, uiVar.d);
    }

    public final int hashCode() {
        String str = this.f17055a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundColors(top=" + this.f17055a + ", right=" + this.b + ", left=" + this.c + ", bottom=" + this.d + Separators.RPAREN;
    }

    public ui(String str, String str2, String str3, String str4) {
        this.f17055a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String d() {
        return this.f17055a;
    }

    public final String c() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String a() {
        return this.d;
    }
}
