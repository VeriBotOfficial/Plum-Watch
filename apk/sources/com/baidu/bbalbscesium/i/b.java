package com.baidu.bbalbscesium.i;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.LongBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public class b implements Serializable, Cloneable {
    private static final int d = 6;
    private static final int e = 64;
    private static final int f = 63;
    private static final long g = -1;
    private static final ObjectStreamField[] h = {new ObjectStreamField("bits", long[].class)};
    private static final long i = 7997698588986878753L;
    static final /* synthetic */ boolean j = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f7386a;
    private transient int b;
    private transient boolean c;

    public b() {
        this.b = 0;
        this.c = false;
        f(64);
        this.c = false;
    }

    public b(int r4) {
        this.b = 0;
        this.c = false;
        if (r4 < 0) {
            throw new NegativeArraySizeException("nbits < 0: " + r4);
        }
        f(r4);
        this.c = true;
    }

    private b(long[] jArr) {
        this.b = 0;
        this.c = false;
        this.f7386a = jArr;
        this.b = jArr.length;
        b();
    }

    public static b a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder = byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN);
        int r0 = byteBufferOrder.remaining();
        while (r0 > 0 && byteBufferOrder.get(r0 - 1) == 0) {
            r0--;
        }
        long[] jArr = new long[(r0 + 7) / 8];
        byteBufferOrder.limit(r0);
        int r3 = 0;
        while (byteBufferOrder.remaining() >= 8) {
            jArr[r3] = byteBufferOrder.getLong();
            r3++;
        }
        int r2 = byteBufferOrder.remaining();
        for (int r1 = 0; r1 < r2; r1++) {
            jArr[r3] = jArr[r3] | ((((long) byteBufferOrder.get()) & 255) << (r1 * 8));
        }
        return new b(jArr);
    }

    public static b a(LongBuffer longBuffer) {
        LongBuffer longBufferSlice = longBuffer.slice();
        int r0 = longBufferSlice.remaining();
        while (r0 > 0 && longBufferSlice.get(r0 - 1) == 0) {
            r0--;
        }
        long[] jArr = new long[r0];
        longBufferSlice.get(jArr);
        return new b(jArr);
    }

    public static b a(byte[] bArr) {
        return a(ByteBuffer.wrap(bArr));
    }

    public static b a(long[] jArr) {
        int length = jArr.length;
        while (length > 0 && jArr[length - 1] == 0) {
            length--;
        }
        return new b(Arrays.copyOf(jArr, length));
    }

    private static void a(int r3, int r4) {
        if (r3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + r3);
        }
        if (r4 < 0) {
            throw new IndexOutOfBoundsException("toIndex < 0: " + r4);
        }
        if (r3 > r4) {
            throw new IndexOutOfBoundsException("fromIndex: " + r3 + " > toIndex: " + r4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        boolean z;
        long[] jArr = (long[]) objectInputStream.readFields().get("bits", (Object) null);
        this.f7386a = jArr;
        this.b = jArr.length;
        f();
        long[] jArr2 = this.f7386a;
        if (jArr2.length > 0) {
            z = jArr2[jArr2.length - 1] == 0;
        }
        this.c = z;
        b();
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        b();
        if (!this.c) {
            j();
        }
        objectOutputStream.putFields().put("bits", this.f7386a);
        objectOutputStream.writeFields();
    }

    private void b() {
        int r3;
        int r4;
        boolean z = j;
        if (!z && (r4 = this.b) != 0 && this.f7386a[r4 - 1] == 0) {
            throw new AssertionError();
        }
        if (!z && ((r3 = this.b) < 0 || r3 > this.f7386a.length)) {
            throw new AssertionError();
        }
        if (z) {
            return;
        }
        int r0 = this.b;
        long[] jArr = this.f7386a;
        if (r0 != jArr.length && jArr[r0] != 0) {
            throw new AssertionError();
        }
    }

    private void b(int r3) {
        long[] jArr = this.f7386a;
        if (jArr.length < r3) {
            this.f7386a = Arrays.copyOf(this.f7386a, Math.max(jArr.length * 2, r3));
            this.c = false;
        }
    }

    private void c(int r2) {
        int r3 = r2 + 1;
        if (this.b < r3) {
            b(r3);
            this.b = r3;
        }
    }

    private void f() {
        int r0 = this.b - 1;
        while (r0 >= 0 && this.f7386a[r0] == 0) {
            r0--;
        }
        this.b = r0 + 1;
    }

    private void f(int r1) {
        this.f7386a = new long[l(r1 - 1) + 1];
    }

    private void j() {
        int r0 = this.b;
        long[] jArr = this.f7386a;
        if (r0 != jArr.length) {
            this.f7386a = Arrays.copyOf(jArr, r0);
            b();
        }
    }

    private static int l(int r0) {
        return r0 >> 6;
    }

    public int a() {
        int r1 = 0;
        for (int r0 = 0; r0 < this.b; r0++) {
            r1 += Long.bitCount(this.f7386a[r0]);
        }
        return r1;
    }

    public void a(int r7) {
        if (r7 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + r7);
        }
        int r0 = l(r7);
        if (r0 >= this.b) {
            return;
        }
        long[] jArr = this.f7386a;
        jArr[r0] = jArr[r0] & (~(1 << r7));
        f();
        b();
    }

    public void a(int r1, int r2, boolean z) {
        if (z) {
            e(r1, r2);
        } else {
            b(r1, r2);
        }
    }

    public void a(int r1, boolean z) {
        if (z) {
            k(r1);
        } else {
            a(r1);
        }
    }

    public void a(b bVar) {
        if (this == bVar) {
            return;
        }
        while (true) {
            int r0 = this.b;
            if (r0 <= bVar.b) {
                break;
            }
            long[] jArr = this.f7386a;
            int r1 = r0 - 1;
            this.b = r1;
            jArr[r1] = 0;
        }
        for (int r2 = 0; r2 < this.b; r2++) {
            long[] jArr2 = this.f7386a;
            jArr2[r2] = jArr2[r2] & bVar.f7386a[r2];
        }
        f();
        b();
    }

    public void b(int r9, int r10) {
        int r0;
        a(r9, r10);
        if (r9 != r10 && (r0 = l(r9)) < this.b) {
            int r1 = l(r10 - 1);
            if (r1 >= this.b) {
                r10 = e();
                r1 = this.b - 1;
            }
            long j2 = (-1) << r9;
            long j3 = (-1) >>> (-r10);
            if (r0 == r1) {
                long[] jArr = this.f7386a;
                jArr[r0] = (~(j3 & j2)) & jArr[r0];
            } else {
                long[] jArr2 = this.f7386a;
                jArr2[r0] = (~j2) & jArr2[r0];
                while (true) {
                    r0++;
                    if (r0 >= r1) {
                        break;
                    } else {
                        this.f7386a[r0] = 0;
                    }
                }
                long[] jArr3 = this.f7386a;
                jArr3[r1] = (~j3) & jArr3[r1];
            }
            f();
            b();
        }
    }

    public void b(b bVar) {
        for (int r0 = Math.min(this.b, bVar.b) - 1; r0 >= 0; r0--) {
            long[] jArr = this.f7386a;
            jArr[r0] = jArr[r0] & (~bVar.f7386a[r0]);
        }
        f();
        b();
    }

    public void c() {
        while (true) {
            int r0 = this.b;
            if (r0 <= 0) {
                return;
            }
            long[] jArr = this.f7386a;
            int r1 = r0 - 1;
            this.b = r1;
            jArr[r1] = 0;
        }
    }

    public void c(int r9, int r10) {
        a(r9, r10);
        if (r9 == r10) {
            return;
        }
        int r0 = l(r9);
        int r1 = l(r10 - 1);
        c(r1);
        long j2 = (-1) << r9;
        long j3 = (-1) >>> (-r10);
        if (r0 == r1) {
            long[] jArr = this.f7386a;
            jArr[r0] = (j3 & j2) ^ jArr[r0];
        } else {
            long[] jArr2 = this.f7386a;
            jArr2[r0] = jArr2[r0] ^ j2;
            while (true) {
                r0++;
                if (r0 >= r1) {
                    break;
                }
                long[] jArr3 = this.f7386a;
                jArr3[r0] = ~jArr3[r0];
            }
            long[] jArr4 = this.f7386a;
            jArr4[r1] = j3 ^ jArr4[r1];
        }
        f();
        b();
    }

    public boolean c(b bVar) {
        for (int r0 = Math.min(this.b, bVar.b) - 1; r0 >= 0; r0--) {
            if ((this.f7386a[r0] & bVar.f7386a[r0]) != 0) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {
        if (!this.c) {
            j();
        }
        try {
            b bVar = (b) super.clone();
            bVar.f7386a = (long[]) this.f7386a.clone();
            bVar.b();
            return bVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public b d(int r18, int r19) {
        long j2;
        int r2 = r19;
        a(r18, r19);
        b();
        int r3 = e();
        int r4 = 0;
        if (r3 <= r18 || r18 == r2) {
            return new b(0);
        }
        if (r2 > r3) {
            r2 = r3;
        }
        int r5 = r2 - r18;
        b bVar = new b(r5);
        int r6 = l(r5 - 1);
        int r7 = r6 + 1;
        int r8 = l(r18);
        int r9 = r18 & 63;
        boolean z = r9 == 0;
        while (r4 < r6) {
            long[] jArr = bVar.f7386a;
            long[] jArr2 = this.f7386a;
            jArr[r4] = z ? jArr2[r8] : (jArr2[r8] >>> r18) | (jArr2[r8 + 1] << (-r18));
            r4++;
            r8++;
        }
        long j3 = (-1) >>> (-r2);
        long[] jArr3 = bVar.f7386a;
        if (((r2 - 1) & 63) < r9) {
            long[] jArr4 = this.f7386a;
            j2 = ((jArr4[r8 + 1] & j3) << (-r18)) | (jArr4[r8] >>> r18);
        } else {
            j2 = (this.f7386a[r8] & j3) >>> r18;
        }
        jArr3[r6] = j2;
        bVar.b = r7;
        bVar.f();
        bVar.b();
        return bVar;
    }

    public void d(int r7) {
        if (r7 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + r7);
        }
        int r0 = l(r7);
        c(r0);
        long[] jArr = this.f7386a;
        jArr[r0] = jArr[r0] ^ (1 << r7);
        f();
        b();
    }

    public void d(b bVar) {
        if (this == bVar) {
            return;
        }
        int r0 = Math.min(this.b, bVar.b);
        int r1 = this.b;
        int r2 = bVar.b;
        if (r1 < r2) {
            b(r2);
            this.b = bVar.b;
        }
        for (int r3 = 0; r3 < r0; r3++) {
            long[] jArr = this.f7386a;
            jArr[r3] = jArr[r3] | bVar.f7386a[r3];
        }
        if (r0 < bVar.b) {
            System.arraycopy(bVar.f7386a, r0, this.f7386a, r0, this.b - r0);
        }
        b();
    }

    public boolean d() {
        return this.b == 0;
    }

    public int e() {
        int r0 = this.b;
        if (r0 == 0) {
            return 0;
        }
        int r1 = r0 - 1;
        return (r1 * 64) + (64 - Long.numberOfLeadingZeros(this.f7386a[r1]));
    }

    public void e(int r10, int r11) {
        a(r10, r11);
        if (r10 == r11) {
            return;
        }
        int r0 = l(r10);
        int r1 = l(r11 - 1);
        c(r1);
        long j2 = (-1) << r10;
        long j3 = (-1) >>> (-r11);
        if (r0 == r1) {
            long[] jArr = this.f7386a;
            jArr[r0] = (j3 & j2) | jArr[r0];
        } else {
            long[] jArr2 = this.f7386a;
            jArr2[r0] = j2 | jArr2[r0];
            while (true) {
                r0++;
                if (r0 >= r1) {
                    break;
                } else {
                    this.f7386a[r0] = -1;
                }
            }
            long[] jArr3 = this.f7386a;
            jArr3[r1] = j3 | jArr3[r1];
        }
        b();
    }

    public void e(b bVar) {
        int r0 = Math.min(this.b, bVar.b);
        int r1 = this.b;
        int r2 = bVar.b;
        if (r1 < r2) {
            b(r2);
            this.b = bVar.b;
        }
        for (int r3 = 0; r3 < r0; r3++) {
            long[] jArr = this.f7386a;
            jArr[r3] = jArr[r3] ^ bVar.f7386a[r3];
        }
        int r4 = bVar.b;
        if (r0 < r4) {
            System.arraycopy(bVar.f7386a, r0, this.f7386a, r0, r4 - r0);
        }
        f();
        b();
    }

    public boolean e(int r5) {
        if (r5 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + r5);
        }
        b();
        int r0 = l(r5);
        return r0 < this.b && (this.f7386a[r0] & (1 << r5)) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b bVar = (b) obj;
        b();
        bVar.b();
        if (this.b != bVar.b) {
            return false;
        }
        for (int r2 = 0; r2 < this.b; r2++) {
            if (this.f7386a[r2] != bVar.f7386a[r2]) {
                return false;
            }
        }
        return true;
    }

    public int g() {
        return this.f7386a.length * 64;
    }

    public int g(int r6) {
        if (r6 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + r6);
        }
        b();
        int r0 = l(r6);
        if (r0 >= this.b) {
            return r6;
        }
        long j2 = (~this.f7386a[r0]) & ((-1) << r6);
        while (j2 == 0) {
            r0++;
            int r7 = this.b;
            if (r0 == r7) {
                return r7 * 64;
            }
            j2 = ~this.f7386a[r0];
        }
        return (r0 * 64) + Long.numberOfTrailingZeros(j2);
    }

    public int h(int r8) {
        if (r8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + r8);
        }
        b();
        int r0 = l(r8);
        if (r0 >= this.b) {
            return -1;
        }
        long j2 = this.f7386a[r0] & ((-1) << r8);
        while (j2 == 0) {
            r0++;
            if (r0 == this.b) {
                return -1;
            }
            j2 = this.f7386a[r0];
        }
        return (r0 * 64) + Long.numberOfTrailingZeros(j2);
    }

    public byte[] h() {
        int r0 = this.b;
        if (r0 == 0) {
            return new byte[0];
        }
        int r1 = r0 - 1;
        int r2 = r1 * 8;
        for (long j2 = this.f7386a[r1]; j2 != 0; j2 >>>= 8) {
            r2++;
        }
        byte[] bArr = new byte[r2];
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int r3 = 0; r3 < r1; r3++) {
            byteBufferOrder.putLong(this.f7386a[r3]);
        }
        for (long j3 = this.f7386a[r1]; j3 != 0; j3 >>>= 8) {
            byteBufferOrder.put((byte) (255 & j3));
        }
        return bArr;
    }

    public int hashCode() {
        int r0 = this.b;
        long j2 = 1234;
        while (true) {
            int r3 = r0 - 1;
            if (r3 < 0) {
                return (int) ((j2 >> 32) ^ j2);
            }
            j2 ^= this.f7386a[r3] * ((long) r0);
            r0 = r3;
        }
    }

    public int i(int r7) {
        if (r7 < 0) {
            if (r7 == -1) {
                return -1;
            }
            throw new IndexOutOfBoundsException("fromIndex < -1: " + r7);
        }
        b();
        int r1 = l(r7);
        if (r1 >= this.b) {
            return r7;
        }
        long j2 = (~this.f7386a[r1]) & ((-1) >>> (-(r7 + 1)));
        while (j2 == 0) {
            int r8 = r1 - 1;
            if (r1 == 0) {
                return -1;
            }
            j2 = ~this.f7386a[r8];
            r1 = r8;
        }
        return (((r1 + 1) * 64) - 1) - Long.numberOfLeadingZeros(j2);
    }

    public long[] i() {
        return Arrays.copyOf(this.f7386a, this.b);
    }

    public int j(int r8) {
        if (r8 < 0) {
            if (r8 == -1) {
                return -1;
            }
            throw new IndexOutOfBoundsException("fromIndex < -1: " + r8);
        }
        b();
        int r1 = l(r8);
        if (r1 >= this.b) {
            return e() - 1;
        }
        long j2 = this.f7386a[r1] & ((-1) >>> (-(r8 + 1)));
        while (j2 == 0) {
            int r9 = r1 - 1;
            if (r1 == 0) {
                return -1;
            }
            j2 = this.f7386a[r9];
            r1 = r9;
        }
        return (((r1 + 1) * 64) - 1) - Long.numberOfLeadingZeros(j2);
    }

    public void k(int r7) {
        if (r7 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + r7);
        }
        int r0 = l(r7);
        c(r0);
        long[] jArr = this.f7386a;
        jArr[r0] = jArr[r0] | (1 << r7);
        b();
    }

    public String toString() {
        b();
        int r0 = this.b;
        StringBuilder sb = new StringBuilder(((r0 > 128 ? a() : r0 * 64) * 6) + 2);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int r1 = h(0);
        if (r1 != -1) {
            sb.append(r1);
            int r2 = r1 + 1;
            while (true) {
                int r3 = h(r2);
                if (r3 < 0) {
                    break;
                }
                int r4 = g(r3);
                while (true) {
                    sb.append(", ").append(r3);
                    int r5 = r3 + 1;
                    if (r5 >= r4) {
                        break;
                    }
                    r3 = r5;
                }
                r2 = r3 + 2;
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
