package com.baidu.bbalbscesium.k.a;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes12.dex */
public final class e {
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final int p = 5;

    /* renamed from: q, reason: collision with root package name */
    private static final int f7420q = 6;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f7421a;
    private int b;
    private int c;
    private int f;
    private i g;
    private f h;
    private int d = 0;
    private int e = 0;
    private int i = 1;
    private boolean j = false;

    public e(b bVar, int i) {
        this.f7421a = null;
        this.g = null;
        this.h = null;
        this.b = i;
        this.c = i;
        this.f = i;
        this.f7421a = new byte[i * 2];
        this.h = new d(bVar);
        this.g = new h(this.b);
    }

    private int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) throws IllegalBlockSizeException {
        if (bArr == null || i3 == 0) {
            return 0;
        }
        int i4 = this.i;
        if (i4 != 2 && i4 != 3 && i3 % this.c != 0 && i4 != 6) {
            if (this.g != null) {
                throw new IllegalBlockSizeException("Input length (with padding) not multiple of " + this.c + " bytes");
            }
            throw new IllegalBlockSizeException("Input length not multiple of " + this.c + " bytes");
        }
        if (this.j) {
            this.h.b(bArr, i, i3, bArr2, i2);
            return i3;
        }
        this.h.d(bArr, i, i3, bArr2, i2);
        return i3;
    }

    static byte[] a(Key key) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("No key given");
        }
        if (!"RAW".equalsIgnoreCase(key.getFormat())) {
            throw new InvalidKeyException("Wrong format: RAW bytes needed");
        }
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            return encoded;
        }
        throw new InvalidKeyException("RAW key bytes missing");
    }

    int a(int i) {
        int i2 = this.d + i;
        i iVar = this.g;
        if (iVar == null || this.j) {
            return i2;
        }
        int i3 = this.c;
        int i4 = this.b;
        if (i3 == i4) {
            return i2 + iVar.a(i2);
        }
        int i5 = this.f;
        return i2 < i5 ? i5 : (i2 + i4) - ((i2 - i5) % i4);
    }

    int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, ShortBufferException, BadPaddingException {
        int a2;
        byte[] bArr3;
        int i4;
        i iVar;
        int a3;
        int i5 = this.d + i2;
        int i6 = this.c;
        int i7 = this.b;
        if (i6 != i7) {
            int i8 = this.f;
            a2 = i5 < i8 ? i8 - i5 : i7 - ((i5 - i8) % i7);
        } else {
            i iVar2 = this.g;
            a2 = iVar2 != null ? iVar2.a(i5) : 0;
        }
        if (a2 > 0 && a2 != this.b && this.g != null && this.j) {
            throw new IllegalBlockSizeException("Input length must be multiple of " + this.b + " when decrypting with padded cipher");
        }
        boolean z = this.j;
        int i9 = (z || this.g == null) ? i5 : i5 + a2;
        if (bArr2 == null) {
            throw new ShortBufferException("Output buffer is null");
        }
        int length = bArr2.length - i3;
        if (((!z || this.g == null) && length < i9) || (z && length < i9 - this.b)) {
            throw new ShortBufferException("Output buffer too short: " + length + " bytes given, " + i9 + " bytes needed");
        }
        int i10 = this.d;
        if (i10 == 0 && (z || this.g == null)) {
            bArr3 = bArr;
            i4 = i;
        } else {
            byte[] bArr4 = new byte[i9];
            if (i10 != 0) {
                System.arraycopy(this.f7421a, 0, bArr4, 0, i10);
            }
            if (i2 != 0) {
                System.arraycopy(bArr, i, bArr4, this.d, i2);
            }
            if (!this.j && (iVar = this.g) != null) {
                iVar.b(bArr4, i5, a2);
            }
            bArr3 = bArr4;
            i4 = 0;
        }
        if (this.j) {
            if (length < i9) {
                this.h.g();
            }
            byte[] bArr5 = new byte[i5];
            int a4 = a(bArr3, i4, bArr5, 0, i5);
            i iVar3 = this.g;
            if (iVar3 != null && (a4 = iVar3.a(bArr5, 0, a4)) < 0) {
                throw new BadPaddingException("Given final block not properly padded");
            }
            if (bArr2.length - i3 < a4) {
                this.h.f();
                throw new ShortBufferException("Output buffer too short: " + (bArr2.length - i3) + " bytes given, " + a4 + " bytes needed");
            }
            for (int i11 = 0; i11 < a4; i11++) {
                bArr2[i3 + i11] = bArr5[i11];
            }
            a3 = a4;
        } else {
            a3 = a(bArr3, i4, bArr2, i3, i9);
        }
        this.d = 0;
        this.f = this.b;
        if (this.i != 0) {
            this.h.e();
        }
        return a3;
    }

    Key a(byte[] bArr, String str) throws InvalidKeyException {
        try {
            return new SecretKeySpec(a(bArr, 0, bArr.length), str);
        } catch (BadPaddingException unused) {
            throw new InvalidKeyException("The wrapped key is not padded correctly");
        } catch (IllegalBlockSizeException unused2) {
            throw new InvalidKeyException("The wrapped key does not have the correct length");
        }
    }

    public void a(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] iv;
        this.j = i == 2 || i == 4;
        byte[] a2 = a(key);
        if (algorithmParameterSpec == null) {
            iv = null;
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            if (iv == null || iv.length != this.b) {
                throw new InvalidAlgorithmParameterException("Wrong IV length: must be " + this.b + " bytes long");
            }
        } else {
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Wrong parameter type: IV expected");
            }
            iv = ((RC2ParameterSpec) algorithmParameterSpec).getIV();
            if (iv != null && iv.length != this.b) {
                throw new InvalidAlgorithmParameterException("Wrong IV length: must be " + this.b + " bytes long");
            }
        }
        a(i, a2, iv, secureRandom);
    }

    public void a(int i, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        boolean z = i == 2 || i == 4;
        this.j = z;
        if (this.i == 0) {
            if (bArr2 != null) {
                throw new InvalidAlgorithmParameterException("ECB mode cannot use IV");
            }
        } else if (bArr2 == null) {
            if (z) {
                throw new InvalidAlgorithmParameterException("Parameters missing");
            }
            if (secureRandom == null) {
                secureRandom = c.b;
            }
            bArr2 = new byte[this.b];
            secureRandom.nextBytes(bArr2);
        }
        this.d = 0;
        this.f = this.b;
        this.h.a(this.j, "", bArr, bArr2);
    }

    void a(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            throw new NoSuchAlgorithmException("null mode");
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        b b = this.h.b();
        if (!upperCase.equals("CBC")) {
            throw new NoSuchAlgorithmException("Cipher mode: " + str + " not found");
        }
        this.i = 1;
        this.h = new d(b);
    }

    public byte[] a(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        try {
            int a2 = a(i2);
            byte[] bArr2 = new byte[a2];
            int a3 = a(bArr, i, i2, bArr2, 0);
            if (a3 >= a2) {
                return bArr2;
            }
            byte[] bArr3 = new byte[a3];
            if (a3 != 0) {
                try {
                    System.arraycopy(bArr2, 0, bArr3, 0, a3);
                } catch (ShortBufferException unused) {
                    return bArr3;
                }
            }
            return bArr3;
        } catch (ShortBufferException unused2) {
            return null;
        }
    }

    int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        int i4;
        int i5 = this.d;
        int i6 = (i5 + i2) - this.e;
        if (this.g != null && this.j) {
            i6 -= this.b;
        }
        int i7 = i6 > 0 ? i6 - (i6 % this.c) : 0;
        if (bArr2 == null || bArr2.length - i3 < i7) {
            throw new ShortBufferException("Output buffer must be (at least) " + i7 + " bytes long");
        }
        if (i7 != 0) {
            byte[] bArr3 = new byte[i7];
            int i8 = i7 - i5;
            if (i8 < 0) {
                i8 = 0;
                i4 = i7;
            } else {
                i4 = i5;
            }
            if (i5 != 0) {
                System.arraycopy(this.f7421a, 0, bArr3, 0, i4);
            }
            if (i8 > 0) {
                System.arraycopy(bArr, i, bArr3, i4, i8);
            }
            if (this.j) {
                this.h.a(bArr3, 0, i7, bArr2, i3);
            } else {
                this.h.c(bArr3, 0, i7, bArr2, i3);
            }
            int i9 = this.c;
            int i10 = this.b;
            if (i9 != i10) {
                int i11 = this.f;
                if (i7 < i11) {
                    this.f = i11 - i7;
                } else {
                    this.f = i10 - ((i7 - i11) % i10);
                }
            }
            i2 -= i8;
            i += i8;
            int i12 = this.d - i4;
            this.d = i12;
            if (i12 > 0) {
                byte[] bArr4 = this.f7421a;
                System.arraycopy(bArr4, i4, bArr4, 0, i12);
            }
        }
        if (i2 > 0) {
            System.arraycopy(bArr, i, this.f7421a, this.d, i2);
        }
        this.d += i2;
        return i7;
    }

    byte[] b(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        try {
            byte[] encoded = key.getEncoded();
            if (encoded == null || encoded.length == 0) {
                throw new InvalidKeyException("Cannot get an encoding of the key to be wrapped");
            }
            return a(encoded, 0, encoded.length);
        } catch (BadPaddingException unused) {
            return null;
        }
    }

    public byte[] b(byte[] bArr, int i, int i2) {
        try {
            int a2 = a(i2);
            byte[] bArr2 = new byte[a2];
            int b = b(bArr, i, i2, bArr2, 0);
            if (b == a2) {
                return bArr2;
            }
            byte[] bArr3 = new byte[b];
            try {
                System.arraycopy(bArr2, 0, bArr3, 0, b);
                return bArr3;
            } catch (ShortBufferException unused) {
                return bArr3;
            }
        } catch (ShortBufferException unused2) {
            return null;
        }
    }
}
