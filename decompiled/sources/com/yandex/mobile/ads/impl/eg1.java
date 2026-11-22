package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes5.dex */
public class eg1 extends IOException {
    public final boolean b;
    public final int c;

    public static eg1 a(String str, IllegalArgumentException illegalArgumentException) {
        return new eg1(str, illegalArgumentException, true, 0);
    }

    protected eg1(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.b = z;
        this.c = i;
    }

    public static eg1 a(String str, Exception exc) {
        return new eg1(str, exc, true, 1);
    }

    public static eg1 a(String str) {
        return new eg1(str, null, false, 1);
    }
}
