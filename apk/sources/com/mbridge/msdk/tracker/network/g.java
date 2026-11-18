package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;

/* JADX INFO: compiled from: Header.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12292a;
    private final String b;

    public g(String str, String str2) {
        this.f12292a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f12292a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f12292a, gVar.f12292a) && TextUtils.equals(this.b, gVar.b);
    }

    public int hashCode() {
        return (this.f12292a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f12292a + ",value=" + this.b + "]";
    }
}
