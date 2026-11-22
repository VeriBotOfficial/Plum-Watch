package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3215f5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18266a;
    public final String b;

    public C3215f5(String str, String str2) {
        this.f18266a = str;
        this.b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.b);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.f18266a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f18266a + "_" + ApiKeyUtils.createPartialApiKey(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3215f5 c3215f5 = (C3215f5) obj;
            String str = this.f18266a;
            if (str == null ? c3215f5.f18266a != null : !str.equals(c3215f5.f18266a)) {
                return false;
            }
            String str2 = this.b;
            String str3 = c3215f5.b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18266a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f18266a + "_" + this.b;
    }
}
