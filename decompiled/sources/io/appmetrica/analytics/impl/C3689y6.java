package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3689y6 implements CryptoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final AESRSAEncrypter f18589a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    public final Encrypter getAesRsaEncrypter() {
        return this.f18589a;
    }
}
