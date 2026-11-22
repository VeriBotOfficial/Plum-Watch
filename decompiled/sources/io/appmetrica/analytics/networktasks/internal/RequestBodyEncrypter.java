package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes6.dex */
public interface RequestBodyEncrypter {
    byte[] encrypt(byte[] bArr);

    RequestBodyEncryptionMode getEncryptionMode();
}
