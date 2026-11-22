package com.xiaomi.push;

import android.gov.nist.core.Separators;

/* loaded from: classes4.dex */
public class fs {

    /* renamed from: a, reason: collision with root package name */
    private String f14600a;

    public fs(String str) {
        this.f14600a = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("stream:error (");
        sb.append(this.f14600a).append(Separators.RPAREN);
        return sb.toString();
    }
}
