package com.anythink.expressad.foundation.g.f.c;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4860a;
    private final String b;

    public c(String str, String str2) {
        this.f4860a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f4860a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.f4860a, cVar.f4860a) && TextUtils.equals(this.b, cVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4860a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f4860a + ",value=" + this.b + "]";
    }
}
