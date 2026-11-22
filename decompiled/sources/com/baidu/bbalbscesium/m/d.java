package com.baidu.bbalbscesium.m;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes12.dex */
public final class d {
    private d() {
    }

    public static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-1").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
