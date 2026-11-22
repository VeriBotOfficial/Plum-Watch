package com.anythink.core.common.a;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f3621a;
    private String b;
    private String c;
    private int d;
    private String e;

    public final String a() {
        if (TextUtils.isEmpty(this.f3621a)) {
            return "";
        }
        return this.f3621a;
    }

    public final void a(String str) {
        this.f3621a = str;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.b)) {
            return "";
        }
        return this.b;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final String c() {
        if (TextUtils.isEmpty(this.c)) {
            return "";
        }
        return this.c;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final int d() {
        return this.d;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final String e() {
        if (TextUtils.isEmpty(this.e)) {
            return "";
        }
        return this.e;
    }

    public final void d(String str) {
        this.e = str;
    }

    public final String toString() {
        return "AdxOfferTrackingRecordBean{placementId='" + this.f3621a + "', dspId='" + this.b + "', offerId='" + this.c + "', tkType=" + this.d + ", extraInfo='" + this.e + "'}";
    }
}
