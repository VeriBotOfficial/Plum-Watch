package com.yandex.mobile.ads.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x01 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17298a;
    private final int b;

    public final byte[] a(byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            byte[] decode = Base64.decode(this.f17298a, 0);
            if (decode == null) {
                return null;
            }
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[16];
            secureRandom.nextBytes(bArr2);
            secureRandom.nextBytes(bArr);
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
            Intrinsics.checkNotNull(generatePublic);
            return a(input, bArr2, bArr, generatePublic);
        } catch (Throwable th) {
            sp0.b(th);
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x01(int i, String publicKey) {
        this(i, publicKey, 0);
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
    }

    private x01(int i, String str, int i2) {
        this.f17298a = str;
        this.b = i;
    }

    private final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                xc xcVar = new xc(AESEncrypter.DEFAULT_ALGORITHM, bArr2, bArr3);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    byteArrayOutputStream.write(xcVar.a(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray2;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            sp0.b(th);
            return null;
        }
    }
}
