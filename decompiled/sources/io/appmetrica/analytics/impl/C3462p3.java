package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3462p3 {

    /* renamed from: a, reason: collision with root package name */
    public final C3437o3 f18443a;
    public final GZIPCompressor b;

    public C3462p3() {
        this(new C3437o3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C3437o3 c3437o3 = this.f18443a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c3437o3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C3462p3(C3437o3 c3437o3, GZIPCompressor gZIPCompressor) {
        this.f18443a = c3437o3;
        this.b = gZIPCompressor;
    }
}
