package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes5.dex */
public class uv extends IOException {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public uv(int i) {
        this.b = i;
    }

    public uv(int i, String str) {
        super(str);
        this.b = i;
    }

    public uv(int i, String str, Throwable th) {
        super(str, th);
        this.b = i;
    }

    public uv(Throwable th, int i) {
        super(th);
        this.b = i;
    }
}
