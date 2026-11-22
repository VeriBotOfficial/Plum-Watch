package com.wakeup.common.utils;

import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* compiled from: AESUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/utils/AESUtils;", "", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "cKey", "getCKey", "setCKey", "decrypt", "", "content", "encrypt", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AESUtils {
    private String key = "OUvnJ3cXRSXS3OBD";
    private String cKey = "OUvnJ3cXRSXS3OBD";

    public final String getKey() {
        return this.key;
    }

    public final void setKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final String getCKey() {
        return this.cKey;
    }

    public final void setCKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cKey = str;
    }

    public final byte[] decrypt(byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Security.addProvider(new BouncyCastleProvider());
        KeyGenerator.getInstance("AES").init(128);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        byte[] bytes = this.key.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        byte[] bytes2 = this.cKey.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bytes2));
        return cipher.doFinal(content);
    }

    public final byte[] encrypt(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Security.addProvider(new BouncyCastleProvider());
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        byte[] bytes = this.key.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        byte[] bytes2 = this.cKey.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes2));
        byte[] bytes3 = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
        return cipher.doFinal(bytes3);
    }
}
