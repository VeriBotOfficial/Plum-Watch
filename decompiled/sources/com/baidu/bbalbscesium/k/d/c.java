package com.baidu.bbalbscesium.k.d;

import com.unity3d.services.UnityAdsConstants;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;

/* loaded from: classes12.dex */
public final class c {
    private static final byte[] j = new byte[0];
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    private static final String o = "NoPadding";
    public static final String p = "PKCS1Padding";

    /* renamed from: q, reason: collision with root package name */
    private static final String f7431q = "OAEP";

    /* renamed from: a, reason: collision with root package name */
    private int f7432a;
    private f c;
    private byte[] e;
    private int f;
    private int g;
    private d h;
    private OAEPParameterSpec d = null;
    private String i = "SHA-1";
    private String b = p;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r8, com.baidu.bbalbscesium.k.d.d r9, java.security.SecureRandom r10, java.security.spec.AlgorithmParameterSpec r11) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.bbalbscesium.k.d.c.a(int, com.baidu.bbalbscesium.k.d.d, java.security.SecureRandom, java.security.spec.AlgorithmParameterSpec):void");
    }

    private byte[] a() throws BadPaddingException, IllegalBlockSizeException {
        int i = this.f;
        byte[] bArr = this.e;
        if (i > bArr.length) {
            throw new IllegalBlockSizeException("Data must not be longer than " + this.e.length + " bytes");
        }
        try {
            int i2 = this.f7432a;
            if (i2 == 1) {
                return b.a(this.c.a(bArr, 0, i), this.h);
            }
            if (i2 == 2) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i2 == 3) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i2 != 4) {
                throw new AssertionError(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
            }
            return this.c.d(b.a(b.a(bArr, 0, i), this.h));
        } finally {
            this.f = 0;
        }
    }

    private void b(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 == 0 || bArr == null) {
            return;
        }
        int i4 = this.f;
        int i5 = i4 + i2;
        byte[] bArr2 = this.e;
        if (i5 > bArr2.length) {
            i3 = bArr2.length + 1;
        } else {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            i3 = this.f + i2;
        }
        this.f = i3;
    }

    public void a(int i, d dVar, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            a(i, dVar, secureRandom, null);
        } catch (InvalidAlgorithmParameterException e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Wrong parameters");
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    public void a(String str) throws NoSuchAlgorithmException {
        if (!str.equalsIgnoreCase("ECB")) {
            throw new NoSuchAlgorithmException("Unsupported mode " + str);
        }
    }

    public byte[] a(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        b(bArr, i, i2);
        return a();
    }

    public void b(String str) throws NoSuchPaddingException {
        if (str.equalsIgnoreCase(o)) {
            this.b = o;
            return;
        }
        if (str.equalsIgnoreCase(p)) {
            this.b = p;
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("oaeppadding")) {
            this.b = f7431q;
        } else {
            if (!lowerCase.startsWith("oaepwith") || !lowerCase.endsWith("andmgf1padding")) {
                throw new NoSuchPaddingException("Padding " + str + " not supported");
            }
            this.b = f7431q;
            this.i = str.substring(8, str.length() - 14);
            throw new NoSuchPaddingException("MessageDigest not available for " + str);
        }
    }
}
