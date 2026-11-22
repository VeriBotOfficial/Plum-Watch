package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class ci0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15189a;
    private final List<kf0> b;
    private final int c;
    private final InputStream d;
    private final byte[] e;

    public ci0(int i, ArrayList arrayList, int i2, InputStream inputStream) {
        this.f15189a = i;
        this.b = arrayList;
        this.c = i2;
        this.d = inputStream;
        this.e = null;
    }

    public ci0(int i, ArrayList arrayList, byte[] bArr) {
        this.f15189a = i;
        this.b = arrayList;
        this.c = bArr.length;
        this.e = bArr;
        this.d = null;
    }

    public final int d() {
        return this.f15189a;
    }

    public final List<kf0> c() {
        return Collections.unmodifiableList(this.b);
    }

    public final int b() {
        return this.c;
    }

    public final InputStream a() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.e != null) {
            return new ByteArrayInputStream(this.e);
        }
        return null;
    }
}
