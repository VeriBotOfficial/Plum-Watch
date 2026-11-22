package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;

/* loaded from: classes5.dex */
public abstract class zq1 implements Closeable {

    public static final class a {
        public static yq1 a(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Buffer write = new Buffer().write(bArr);
            long length = bArr.length;
            Intrinsics.checkNotNullParameter(write, "<this>");
            return new yq1(length, null, write);
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public abstract long a();

    public abstract cx0 b();

    public abstract BufferedSource c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g92.a((Closeable) c());
    }
}
