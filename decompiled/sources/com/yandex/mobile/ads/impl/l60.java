package com.yandex.mobile.ads.impl;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.yandex.mobile.ads.impl.f40;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public interface l60 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f16080a;
        private final String b;

        public a(String str, byte[] bArr) {
            this.f16080a = bArr;
            this.b = str;
        }

        public final byte[] a() {
            return this.f16080a;
        }

        public final String b() {
            return this.b;
        }
    }

    public interface b {
    }

    public interface c {
        l60 a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f16081a;
        private final String b;

        public d(String str, byte[] bArr) {
            this.f16081a = bArr;
            this.b = str;
        }

        public final byte[] a() {
            return this.f16081a;
        }

        public final String b() {
            return this.b;
        }
    }

    a a(byte[] bArr, List<f40.b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    d a();

    Map<String, String> a(byte[] bArr);

    void a(b bVar);

    default void a(byte[] bArr, mi1 mi1Var) {
    }

    void a(byte[] bArr, byte[] bArr2);

    boolean a(String str, byte[] bArr);

    int b();

    void b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void c(byte[] bArr) throws DeniedByServerException;

    byte[] c() throws MediaDrmException;

    fv d(byte[] bArr) throws MediaCryptoException;

    void release();
}
