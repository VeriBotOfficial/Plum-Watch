package com.baidu.bbalbscesium.k.d;

import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* loaded from: classes12.dex */
public final class f {
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    private static final Map l = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final int f7434a;
    private final int b;
    private SecureRandom c;
    private final int d;
    private MessageDigest e;
    private MessageDigest f;
    private byte[] g;

    private f(int i2, int i3, SecureRandom secureRandom, OAEPParameterSpec oAEPParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] value;
        String str;
        this.f7434a = i2;
        this.b = i3;
        this.c = secureRandom;
        if (i3 < 64) {
            throw new InvalidKeyException("Padded size must be at least 64");
        }
        if (i2 == 1 || i2 == 2) {
            this.d = i3 - 11;
            return;
        }
        if (i2 == 3) {
            this.d = i3;
            return;
        }
        if (i2 != 4) {
            throw new InvalidKeyException("Invalid padding: " + i2);
        }
        String str2 = "SHA-1";
        if (oAEPParameterSpec != null) {
            try {
                String digestAlgorithm = oAEPParameterSpec.getDigestAlgorithm();
                String mGFAlgorithm = oAEPParameterSpec.getMGFAlgorithm();
                if (!mGFAlgorithm.equalsIgnoreCase("MGF1")) {
                    throw new InvalidAlgorithmParameterException("Unsupported MGF algo: " + mGFAlgorithm);
                }
                String digestAlgorithm2 = ((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm();
                PSource pSource = oAEPParameterSpec.getPSource();
                String algorithm = pSource.getAlgorithm();
                if (!algorithm.equalsIgnoreCase("PSpecified")) {
                    throw new InvalidAlgorithmParameterException("Unsupported pSource algo: " + algorithm);
                }
                value = ((PSource.PSpecified) pSource).getValue();
                str = digestAlgorithm;
                str2 = digestAlgorithm2;
            } catch (NoSuchAlgorithmException e) {
                e = e;
                throw new InvalidKeyException("Digest " + str2 + " not available", e);
            }
        } else {
            value = null;
            str = "SHA-1";
        }
        try {
            this.e = MessageDigest.getInstance(str);
            this.f = MessageDigest.getInstance(str2);
            byte[] a2 = a(this.e, value);
            this.g = a2;
            int length = (i3 - 2) - (a2.length * 2);
            this.d = length;
            if (length <= 0) {
                throw new InvalidKeyException("Key is too short for encryption using OAEPPadding with " + str + " and MGF1" + str2);
            }
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            str2 = str;
            throw new InvalidKeyException("Digest " + str2 + " not available", e);
        }
    }

    public static f a(int i2, int i3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        return new f(i2, i3, null, null);
    }

    public static f a(int i2, int i3, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        return new f(i2, i3, secureRandom, null);
    }

    public static f a(int i2, int i3, SecureRandom secureRandom, OAEPParameterSpec oAEPParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        return new f(i2, i3, secureRandom, oAEPParameterSpec);
    }

    private void a(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) throws BadPaddingException {
        int i6;
        byte[] bArr3 = new byte[4];
        byte[] bArr4 = new byte[20];
        while (i5 > 0) {
            this.f.update(bArr, i2, i3);
            this.f.update(bArr3);
            try {
                this.f.digest(bArr4, 0, 20);
                for (int i7 = 0; i7 < 20 && i5 > 0; i7++) {
                    bArr2[i4] = (byte) (bArr4[i7] ^ bArr2[i4]);
                    i5--;
                    i4++;
                }
                if (i5 > 0) {
                    while (true) {
                        byte b = (byte) (bArr3[i6] + 1);
                        bArr3[i6] = b;
                        i6 = (b == 0 && i6 > 0) ? i6 - 1 : 3;
                    }
                }
            } catch (DigestException e) {
                throw new BadPaddingException(e.toString());
            }
        }
    }

    private static byte[] a(MessageDigest messageDigest, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return messageDigest.digest(bArr);
        }
        String algorithm = messageDigest.getAlgorithm();
        Map map = l;
        byte[] bArr2 = (byte[]) map.get(algorithm);
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] digest = messageDigest.digest();
        map.put(algorithm, digest);
        return digest;
    }

    private byte[] b(byte[] bArr) throws BadPaddingException {
        if (this.c == null) {
            this.c = b.f7430a;
        }
        int length = this.g.length;
        byte[] bArr2 = new byte[length];
        this.c.nextBytes(bArr2);
        int i2 = this.b;
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr2, 0, bArr3, 1, length);
        int i3 = length + 1;
        int i4 = i2 - i3;
        int length2 = this.b - bArr.length;
        System.arraycopy(this.g, 0, bArr3, i3, length);
        bArr3[length2 - 1] = 1;
        System.arraycopy(bArr, 0, bArr3, length2, bArr.length);
        a(bArr3, 1, length, bArr3, i3, i4);
        a(bArr3, i3, i4, bArr3, 1, length);
        return bArr3;
    }

    private byte[] c(byte[] bArr) throws BadPaddingException {
        int i2;
        int i3;
        int i4 = this.b;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, i4 - bArr.length, bArr.length);
        int length = (this.b - 3) - bArr.length;
        bArr2[0] = 0;
        int i5 = this.f7434a;
        bArr2[1] = (byte) i5;
        int i6 = -1;
        int i7 = 2;
        if (i5 != 1) {
            if (this.c == null) {
                this.c = b.f7430a;
            }
            byte[] bArr3 = new byte[64];
            while (true) {
                int i8 = length - 1;
                if (length <= 0) {
                    break;
                }
                while (true) {
                    if (i6 < 0) {
                        this.c.nextBytes(bArr3);
                        i6 = 63;
                    }
                    i2 = i6 - 1;
                    i3 = bArr3[i6] & 255;
                    if (i3 != 0) {
                        break;
                    }
                    i6 = i2;
                }
                bArr2[i7] = (byte) i3;
                i6 = i2;
                length = i8;
                i7++;
            }
        } else {
            while (true) {
                int i9 = length - 1;
                if (length <= 0) {
                    break;
                }
                bArr2[i7] = -1;
                i7++;
                length = i9;
            }
        }
        return bArr2;
    }

    private byte[] e(byte[] bArr) throws BadPaddingException {
        int length = this.g.length;
        if (bArr[0] != 0) {
            throw new BadPaddingException("Data must start with zero");
        }
        int i2 = length + 1;
        int length2 = bArr.length - i2;
        a(bArr, i2, length2, bArr, 1, length);
        a(bArr, 1, length, bArr, i2, length2);
        for (int i3 = 0; i3 < length; i3++) {
            if (this.g[i3] != bArr[i2 + i3]) {
                throw new BadPaddingException("lHash mismatch");
            }
        }
        int i4 = i2 + length;
        do {
            byte b = bArr[i4];
            if (b != 0) {
                int i5 = i4 + 1;
                if (b != 1) {
                    throw new BadPaddingException("Padding string not terminated by 0x01 byte");
                }
                int length3 = bArr.length - i5;
                byte[] bArr2 = new byte[length3];
                System.arraycopy(bArr, i5, bArr2, 0, length3);
                return bArr2;
            }
            i4++;
        } while (i4 < bArr.length);
        throw new BadPaddingException("Padding string not terminated");
    }

    private byte[] f(byte[] bArr) throws BadPaddingException {
        if (bArr[0] != 0) {
            throw new BadPaddingException("Data must start with zero");
        }
        if (bArr[1] != this.f7434a) {
            throw new BadPaddingException("Blocktype mismatch: " + ((int) bArr[1]));
        }
        int i2 = 2;
        while (true) {
            int i3 = i2 + 1;
            int i4 = bArr[i2] & 255;
            if (i4 == 0) {
                int length = bArr.length - i3;
                if (length > this.d) {
                    throw new BadPaddingException("Padding string too short");
                }
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, bArr.length - length, bArr2, 0, length);
                return bArr2;
            }
            if (i3 == bArr.length) {
                throw new BadPaddingException("Padding string not terminated");
            }
            if (this.f7434a == 1 && i4 != 255) {
                throw new BadPaddingException("Padding byte not 0xff: " + i4);
            }
            i2 = i3;
        }
    }

    public int a() {
        return this.d;
    }

    public byte[] a(byte[] bArr) throws BadPaddingException {
        if (bArr.length > this.d) {
            throw new BadPaddingException("Data must be shorter than " + (this.d + 1) + " bytes");
        }
        int i2 = this.f7434a;
        if (i2 == 1 || i2 == 2) {
            return c(bArr);
        }
        if (i2 == 3) {
            return bArr;
        }
        if (i2 == 4) {
            return b(bArr);
        }
        throw new AssertionError();
    }

    public byte[] a(byte[] bArr, int i2, int i3) throws BadPaddingException {
        return a(b.a(bArr, i2, i3));
    }

    public byte[] b(byte[] bArr, int i2, int i3) throws BadPaddingException {
        return d(b.a(bArr, i2, i3));
    }

    public byte[] d(byte[] bArr) throws BadPaddingException {
        if (bArr.length != this.b) {
            throw new BadPaddingException("Padded length must be " + this.b);
        }
        int i2 = this.f7434a;
        if (i2 == 1 || i2 == 2) {
            return f(bArr);
        }
        if (i2 == 3) {
            return bArr;
        }
        if (i2 == 4) {
            return e(bArr);
        }
        throw new AssertionError();
    }
}
