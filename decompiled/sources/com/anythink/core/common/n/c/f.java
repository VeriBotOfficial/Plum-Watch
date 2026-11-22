package com.anythink.core.common.n.c;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes12.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f4222a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final f b = a(new byte[0]);
    private static final long f = 1;
    final byte[] c;
    transient int d;
    transient String e;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(f fVar) {
        f fVar2 = fVar;
        int j = j();
        int j2 = fVar2.j();
        int min = Math.min(j, j2);
        for (int i = 0; i < min; i++) {
            int b2 = b(i) & 255;
            int b3 = fVar2.b(i) & 255;
            if (b2 != b3) {
                return b2 < b3 ? -1 : 1;
            }
        }
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    f(byte[] bArr) {
        this.c = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new f((byte[]) bArr.clone());
    }

    private static f a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        y.a(bArr.length, i, i2);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new f(bArr2);
    }

    private static f a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("data == null");
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new f(bArr);
    }

    public static f a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(y.f4243a));
        fVar.e = str;
        return fVar;
    }

    public static f a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        return new f(str.getBytes(charset));
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, y.f4243a);
        this.e = str2;
        return str2;
    }

    public String a(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        return new String(this.c, charset);
    }

    public String b() {
        return b.a(this.c);
    }

    public f c() {
        return d("MD5");
    }

    public f d() {
        return d("SHA-1");
    }

    public f e() {
        return d("SHA-256");
    }

    private f n() {
        return d("SHA-512");
    }

    private f d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public f a(f fVar) {
        return a("HmacSHA1", fVar);
    }

    public f b(f fVar) {
        return a("HmacSHA256", fVar);
    }

    private f d(f fVar) {
        return a("HmacSHA512", fVar);
    }

    private f a(String str, f fVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(fVar.k(), str));
            return a(mac.doFinal(this.c));
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public String f() {
        return b.b(this.c);
    }

    public static f b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] a2 = b.a(str);
        if (a2 != null) {
            return new f(a2);
        }
        return null;
    }

    public String g() {
        byte[] bArr = this.c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f4222a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static f c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
        }
        return a(bArr);
    }

    private static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
        }
        return c - '7';
    }

    private static f a(InputStream inputStream, int i) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i)));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        return new f(bArr);
    }

    public f h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new f(bArr2);
            }
            i++;
        }
    }

    public f i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 97 && b2 <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 97 && b3 <= 122) {
                        bArr2[i2] = (byte) (b3 - 32);
                    }
                }
                return new f(bArr2);
            }
            i++;
        }
    }

    public f a(int i) {
        return a(i, this.c.length);
    }

    public f a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.c;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.c.length + Separators.RPAREN);
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new f(bArr2);
    }

    public byte b(int i) {
        return this.c[i];
    }

    public int j() {
        return this.c.length;
    }

    public byte[] k() {
        return (byte[]) this.c.clone();
    }

    byte[] l() {
        return this.c;
    }

    public ByteBuffer m() {
        return ByteBuffer.wrap(this.c).asReadOnlyBuffer();
    }

    public void a(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        outputStream.write(this.c);
    }

    void a(c cVar) {
        byte[] bArr = this.c;
        cVar.c(bArr, 0, bArr.length);
    }

    public boolean a(int i, f fVar, int i2, int i3) {
        return fVar.a(0, this.c, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && y.a(bArr2, i, bArr, i2, i3);
    }

    public final boolean c(f fVar) {
        return a(0, fVar, 0, fVar.j());
    }

    private boolean b(byte[] bArr) {
        return a(0, bArr, 0, bArr.length);
    }

    private boolean e(f fVar) {
        return a(j() - fVar.j(), fVar, 0, fVar.j());
    }

    private boolean c(byte[] bArr) {
        return a(j() - bArr.length, bArr, 0, bArr.length);
    }

    private int f(f fVar) {
        return a(fVar.l(), 0);
    }

    private int a(f fVar, int i) {
        return a(fVar.l(), i);
    }

    private int d(byte[] bArr) {
        return a(bArr, 0);
    }

    public int a(byte[] bArr, int i) {
        int length = this.c.length - bArr.length;
        for (int max = Math.max(i, 0); max <= length; max++) {
            if (y.a(this.c, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    private int g(f fVar) {
        return b(fVar.l(), j());
    }

    private int b(f fVar, int i) {
        return b(fVar.l(), i);
    }

    private int e(byte[] bArr) {
        return b(bArr, j());
    }

    public int b(byte[] bArr, int i) {
        for (int min = Math.min(i, this.c.length - bArr.length); min >= 0; min--) {
            if (y.a(this.c, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int j = fVar.j();
            byte[] bArr = this.c;
            if (j == bArr.length && fVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    private int h(f fVar) {
        int j = j();
        int j2 = fVar.j();
        int min = Math.min(j, j2);
        for (int i = 0; i < min; i++) {
            int b2 = b(i) & 255;
            int b3 = fVar.b(i) & 255;
            if (b2 != b3) {
                return b2 < b3 ? -1 : 1;
            }
        }
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int length = a2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a2.length();
                break;
            }
            if (i2 == 64) {
                break;
            }
            int codePointAt = a2.codePointAt(i);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i == -1) {
            if (this.c.length > 64) {
                return "[size=" + this.c.length + " hex=" + a(0, 64).g() + "…]";
            }
            return "[hex=" + g() + "]";
        }
        String replace = a2.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < a2.length()) {
            return "[size=" + this.c.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }

    private static int e(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 == 64) {
                return i;
            }
            int codePointAt = str.codePointAt(i);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i2++;
            i += Character.charCount(codePointAt);
        }
        return str.length();
    }

    private void a(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (readInt < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(readInt)));
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        f fVar = new f(bArr);
        try {
            Field declaredField = f.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, fVar.c);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }
}
