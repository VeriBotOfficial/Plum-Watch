package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes12.dex */
public class g3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6248a;
    private final MaxAdFormat b;

    public g3(String str, MaxAdFormat maxAdFormat) {
        this.f6248a = str;
        this.b = maxAdFormat;
    }

    protected boolean a(Object obj) {
        return obj instanceof g3;
    }

    public String b() {
        return this.f6248a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        if (!g3Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = g3Var.b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        MaxAdFormat a2 = a();
        MaxAdFormat a3 = g3Var.a();
        return a2 != null ? a2.equals(a3) : a3 == null;
    }

    public int hashCode() {
        String b = b();
        int hashCode = b == null ? 43 : b.hashCode();
        MaxAdFormat a2 = a();
        return ((hashCode + 59) * 59) + (a2 != null ? a2.hashCode() : 43);
    }

    public String toString() {
        return this.f6248a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b.getLabel();
    }

    public MaxAdFormat a() {
        return this.b;
    }

    public static g3 a(String str) {
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return new g3(split[0], MaxAdFormat.formatFromString(split[1]));
    }
}
