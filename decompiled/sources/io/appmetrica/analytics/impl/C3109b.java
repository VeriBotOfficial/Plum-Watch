package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3109b implements K8 {

    /* renamed from: a, reason: collision with root package name */
    public final AESEncrypter f18190a;

    public C3109b() {
        this(new C3084a(C3593ua.j().f()));
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final E8 a(C3091a6 c3091a6) {
        byte[] encrypt;
        String encodeToString;
        String value = c3091a6.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f18190a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                c3091a6.setValue(encodeToString);
                return new E8(c3091a6, M8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        c3091a6.setValue(encodeToString);
        return new E8(c3091a6, M8.AES_VALUE_ENCRYPTION);
    }

    public C3109b(C3084a c3084a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c3084a.b(), c3084a.a()));
    }

    public C3109b(AESEncrypter aESEncrypter) {
        this.f18190a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f18190a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    public final M8 a() {
        return M8.AES_VALUE_ENCRYPTION;
    }
}
