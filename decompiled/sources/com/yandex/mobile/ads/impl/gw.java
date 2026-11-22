package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gw {

    /* renamed from: a, reason: collision with root package name */
    private final String f15633a;
    private final String b;
    private final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return Intrinsics.areEqual(this.f15633a, gwVar.f15633a) && Intrinsics.areEqual(this.b, gwVar.b) && Intrinsics.areEqual(this.c, gwVar.c);
    }

    public final int hashCode() {
        String str = this.f15633a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdNetworkSettingsData(pageId=" + this.f15633a + ", appReviewStatus=" + this.b + ", appAdsTxt=" + this.c + Separators.RPAREN;
    }

    public gw(String str, String str2, String str3) {
        this.f15633a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String c() {
        return this.f15633a;
    }

    public final String b() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }
}
