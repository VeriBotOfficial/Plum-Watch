package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* loaded from: classes4.dex */
public class ht extends ByteArrayOutputStream {
    public ht(int i) {
        super(i);
    }

    public ht() {
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m12331a() {
        return this.buf;
    }

    public int a() {
        return this.count;
    }
}
