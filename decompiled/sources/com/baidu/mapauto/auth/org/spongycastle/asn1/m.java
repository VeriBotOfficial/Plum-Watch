package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public final class m extends r {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f8278a;
    public byte[] b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8279a;
        public final byte[] b;

        public a(byte[] bArr) {
            this.f8279a = com.baidu.mapauto.auth.org.spongycastle.util.a.b(bArr);
            this.b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f8279a;
        }
    }

    public m(byte[] bArr) {
        boolean z;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                z = z2;
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                    z2 = z;
                }
            } else {
                z = z2;
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                    z2 = z;
                }
            }
        }
        this.f8278a = stringBuffer.toString();
        this.b = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        byte[] i = i();
        pVar.a(6);
        pVar.b(i.length);
        pVar.f8283a.write(i);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar == this) {
            return true;
        }
        if (rVar instanceof m) {
            return this.f8278a.equals(((m) rVar).f8278a);
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        int length = i().length;
        return u1.a(length) + 1 + length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return this.f8278a.hashCode();
    }

    public final synchronized byte[] i() {
        String substring;
        int i;
        String substring2;
        int i2;
        int i3;
        String str;
        if (this.b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str2 = this.f8278a;
            int i4 = 46;
            int indexOf = str2.indexOf(46, 0);
            if (indexOf == -1) {
                substring = str2.substring(0);
                i = -1;
            } else {
                substring = str2.substring(0, indexOf);
                i = indexOf + 1;
            }
            int parseInt = Integer.parseInt(substring) * 40;
            if (i == -1) {
                i2 = i;
                substring2 = null;
            } else {
                int indexOf2 = str2.indexOf(46, i);
                if (indexOf2 == -1) {
                    substring2 = str2.substring(i);
                    i2 = -1;
                } else {
                    substring2 = str2.substring(i, indexOf2);
                    i2 = indexOf2 + 1;
                }
            }
            if (substring2.length() <= 18) {
                i3 = i2;
                long parseLong = Long.parseLong(substring2) + parseInt;
                byte[] bArr = new byte[9];
                bArr[8] = (byte) (((int) parseLong) & 127);
                int i5 = 8;
                while (parseLong >= 128) {
                    parseLong >>= 7;
                    i5--;
                    bArr[i5] = (byte) ((((int) parseLong) & 127) | 128);
                }
                byteArrayOutputStream.write(bArr, i5, 9 - i5);
            } else {
                i3 = i2;
                a(byteArrayOutputStream, new BigInteger(substring2).add(BigInteger.valueOf(parseInt)));
            }
            int i6 = i3;
            while (i6 != -1) {
                if (i6 == -1) {
                    str = null;
                } else {
                    int indexOf3 = str2.indexOf(i4, i6);
                    if (indexOf3 == -1) {
                        str = str2.substring(i6);
                        i6 = -1;
                    } else {
                        String substring3 = str2.substring(i6, indexOf3);
                        i6 = indexOf3 + 1;
                        str = substring3;
                    }
                }
                if (str.length() <= 18) {
                    long parseLong2 = Long.parseLong(str);
                    byte[] bArr2 = new byte[9];
                    bArr2[8] = (byte) (((int) parseLong2) & 127);
                    int i7 = 8;
                    while (parseLong2 >= 128) {
                        parseLong2 >>= 7;
                        i7--;
                        bArr2[i7] = (byte) ((((int) parseLong2) & 127) | 128);
                    }
                    byteArrayOutputStream.write(bArr2, i7, 9 - i7);
                } else {
                    a(byteArrayOutputStream, new BigInteger(str));
                }
                i4 = 46;
            }
            this.b = byteArrayOutputStream.toByteArray();
        }
        return this.b;
    }

    public final String toString() {
        return this.f8278a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m a(d dVar) {
        if (dVar == 0 || (dVar instanceof m)) {
            return (m) dVar;
        }
        if (dVar.c() instanceof m) {
            return (m) dVar.c();
        }
        if (!(dVar instanceof byte[])) {
            throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("illegal object in getInstance: ").append(dVar.getClass().getName()).toString());
        }
        try {
            return (m) r.a((byte[]) dVar);
        } catch (IOException e) {
            throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("failed to construct object identifier from byte[]: ").append(e.getMessage()).toString());
        }
    }
}
