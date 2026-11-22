package com.baidu.bbalbscesium.i;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.LongBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class b implements Serializable, Cloneable {
    private static final int d = 6;
    private static final int e = 64;
    private static final int f = 63;
    private static final long g = -1;
    private static final ObjectStreamField[] h = {new ObjectStreamField("bits", long[].class)};
    private static final long i = 7997698588986878753L;
    static final /* synthetic */ boolean j = true;

    /* renamed from: a, reason: collision with root package name */
    private long[] f7386a;
    private transient int b;
    private transient boolean c;

    public b() {
        this.b = 0;
        this.c = false;
        f(64);
        this.c = false;
    }

    public b(int i2) {
        this.b = 0;
        this.c = false;
        if (i2 < 0) {
            throw new NegativeArraySizeException("nbits < 0: " + i2);
        }
        f(i2);
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
        ByteBuffer order = byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN);
        int remaining = order.remaining();
        while (remaining > 0 && order.get(remaining - 1) == 0) {
            remaining--;
        }
        long[] jArr = new long[(remaining + 7) / 8];
        order.limit(remaining);
        int i2 = 0;
        while (order.remaining() >= 8) {
            jArr[i2] = order.getLong();
            i2++;
        }
        int remaining2 = order.remaining();
        for (int i3 = 0; i3 < remaining2; i3++) {
            jArr[i2] = jArr[i2] | ((order.get() & 255) << (i3 * 8));
        }
        return new b(jArr);
    }

    public static b a(LongBuffer longBuffer) {
        LongBuffer slice = longBuffer.slice();
        int remaining = slice.remaining();
        while (remaining > 0 && slice.get(remaining - 1) == 0) {
            remaining--;
        }
        long[] jArr = new long[remaining];
        slice.get(jArr);
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

    private static void a(int i2, int i3) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i2);
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("toIndex < 0: " + i3);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + " > toIndex: " + i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r7[r7.length - 1] == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.io.ObjectInputStream r7) throws java.io.IOException, java.lang.ClassNotFoundException {
        /*
            r6 = this;
            java.io.ObjectInputStream$GetField r7 = r7.readFields()
            java.lang.String r0 = "bits"
            r1 = 0
            java.lang.Object r7 = r7.get(r0, r1)
            long[] r7 = (long[]) r7
            r6.f7386a = r7
            int r7 = r7.length
            r6.b = r7
            r6.f()
            long[] r7 = r6.f7386a
            int r0 = r7.length
            if (r0 <= 0) goto L26
            int r0 = r7.length
            r1 = 1
            int r0 = r0 - r1
            r2 = r7[r0]
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            r6.c = r1
            r6.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.bbalbscesium.i.b.a(java.io.ObjectInputStream):void");
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
        int i2;
        int i3;
        boolean z = j;
        if (!z && (i3 = this.b) != 0 && this.f7386a[i3 - 1] == 0) {
            throw new AssertionError();
        }
        if (!z && ((i2 = this.b) < 0 || i2 > this.f7386a.length)) {
            throw new AssertionError();
        }
        if (z) {
            return;
        }
        int i4 = this.b;
        long[] jArr = this.f7386a;
        if (i4 != jArr.length && jArr[i4] != 0) {
            throw new AssertionError();
        }
    }

    private void b(int i2) {
        long[] jArr = this.f7386a;
        if (jArr.length < i2) {
            this.f7386a = Arrays.copyOf(this.f7386a, Math.max(jArr.length * 2, i2));
            this.c = false;
        }
    }

    private void c(int i2) {
        int i3 = i2 + 1;
        if (this.b < i3) {
            b(i3);
            this.b = i3;
        }
    }

    private void f() {
        int i2 = this.b - 1;
        while (i2 >= 0 && this.f7386a[i2] == 0) {
            i2--;
        }
        this.b = i2 + 1;
    }

    private void f(int i2) {
        this.f7386a = new long[l(i2 - 1) + 1];
    }

    private void j() {
        int i2 = this.b;
        long[] jArr = this.f7386a;
        if (i2 != jArr.length) {
            this.f7386a = Arrays.copyOf(jArr, i2);
            b();
        }
    }

    private static int l(int i2) {
        return i2 >> 6;
    }

    public int a() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            i2 += Long.bitCount(this.f7386a[i3]);
        }
        return i2;
    }

    public void a(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i2);
        }
        int l = l(i2);
        if (l >= this.b) {
            return;
        }
        long[] jArr = this.f7386a;
        jArr[l] = jArr[l] & (~(1 << i2));
        f();
        b();
    }

    public void a(int i2, int i3, boolean z) {
        if (z) {
            e(i2, i3);
        } else {
            b(i2, i3);
        }
    }

    public void a(int i2, boolean z) {
        if (z) {
            k(i2);
        } else {
            a(i2);
        }
    }

    public void a(b bVar) {
        if (this == bVar) {
            return;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= bVar.b) {
                break;
            }
            long[] jArr = this.f7386a;
            int i3 = i2 - 1;
            this.b = i3;
            jArr[i3] = 0;
        }
        for (int i4 = 0; i4 < this.b; i4++) {
            long[] jArr2 = this.f7386a;
            jArr2[i4] = jArr2[i4] & bVar.f7386a[i4];
        }
        f();
        b();
    }

    public void b(int i2, int i3) {
        int l;
        a(i2, i3);
        if (i2 != i3 && (l = l(i2)) < this.b) {
            int l2 = l(i3 - 1);
            if (l2 >= this.b) {
                i3 = e();
                l2 = this.b - 1;
            }
            long j2 = (-1) << i2;
            long j3 = (-1) >>> (-i3);
            if (l == l2) {
                long[] jArr = this.f7386a;
                jArr[l] = (~(j3 & j2)) & jArr[l];
            } else {
                long[] jArr2 = this.f7386a;
                jArr2[l] = (~j2) & jArr2[l];
                while (true) {
                    l++;
                    if (l >= l2) {
                        break;
                    } else {
                        this.f7386a[l] = 0;
                    }
                }
                long[] jArr3 = this.f7386a;
                jArr3[l2] = (~j3) & jArr3[l2];
            }
            f();
            b();
        }
    }

    public void b(b bVar) {
        for (int min = Math.min(this.b, bVar.b) - 1; min >= 0; min--) {
            long[] jArr = this.f7386a;
            jArr[min] = jArr[min] & (~bVar.f7386a[min]);
        }
        f();
        b();
    }

    public void c() {
        while (true) {
            int i2 = this.b;
            if (i2 <= 0) {
                return;
            }
            long[] jArr = this.f7386a;
            int i3 = i2 - 1;
            this.b = i3;
            jArr[i3] = 0;
        }
    }

    public void c(int i2, int i3) {
        a(i2, i3);
        if (i2 == i3) {
            return;
        }
        int l = l(i2);
        int l2 = l(i3 - 1);
        c(l2);
        long j2 = (-1) << i2;
        long j3 = (-1) >>> (-i3);
        if (l == l2) {
            long[] jArr = this.f7386a;
            jArr[l] = (j3 & j2) ^ jArr[l];
        } else {
            long[] jArr2 = this.f7386a;
            jArr2[l] = jArr2[l] ^ j2;
            while (true) {
                l++;
                if (l >= l2) {
                    break;
                }
                long[] jArr3 = this.f7386a;
                jArr3[l] = ~jArr3[l];
            }
            long[] jArr4 = this.f7386a;
            jArr4[l2] = j3 ^ jArr4[l2];
        }
        f();
        b();
    }

    public boolean c(b bVar) {
        for (int min = Math.min(this.b, bVar.b) - 1; min >= 0; min--) {
            if ((this.f7386a[min] & bVar.f7386a[min]) != 0) {
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

    public b d(int i2, int i3) {
        long j2;
        int i4 = i3;
        a(i2, i3);
        b();
        int e2 = e();
        int i5 = 0;
        if (e2 <= i2 || i2 == i4) {
            return new b(0);
        }
        if (i4 > e2) {
            i4 = e2;
        }
        int i6 = i4 - i2;
        b bVar = new b(i6);
        int l = l(i6 - 1);
        int i7 = l + 1;
        int l2 = l(i2);
        int i8 = i2 & 63;
        boolean z = i8 == 0;
        while (i5 < l) {
            long[] jArr = bVar.f7386a;
            long[] jArr2 = this.f7386a;
            jArr[i5] = z ? jArr2[l2] : (jArr2[l2] >>> i2) | (jArr2[l2 + 1] << (-i2));
            i5++;
            l2++;
        }
        long j3 = (-1) >>> (-i4);
        long[] jArr3 = bVar.f7386a;
        if (((i4 - 1) & 63) < i8) {
            long[] jArr4 = this.f7386a;
            j2 = ((jArr4[l2 + 1] & j3) << (-i2)) | (jArr4[l2] >>> i2);
        } else {
            j2 = (this.f7386a[l2] & j3) >>> i2;
        }
        jArr3[l] = j2;
        bVar.b = i7;
        bVar.f();
        bVar.b();
        return bVar;
    }

    public void d(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i2);
        }
        int l = l(i2);
        c(l);
        long[] jArr = this.f7386a;
        jArr[l] = jArr[l] ^ (1 << i2);
        f();
        b();
    }

    public void d(b bVar) {
        if (this == bVar) {
            return;
        }
        int min = Math.min(this.b, bVar.b);
        int i2 = this.b;
        int i3 = bVar.b;
        if (i2 < i3) {
            b(i3);
            this.b = bVar.b;
        }
        for (int i4 = 0; i4 < min; i4++) {
            long[] jArr = this.f7386a;
            jArr[i4] = jArr[i4] | bVar.f7386a[i4];
        }
        if (min < bVar.b) {
            System.arraycopy(bVar.f7386a, min, this.f7386a, min, this.b - min);
        }
        b();
    }

    public boolean d() {
        return this.b == 0;
    }

    public int e() {
        int i2 = this.b;
        if (i2 == 0) {
            return 0;
        }
        int i3 = i2 - 1;
        return (i3 * 64) + (64 - Long.numberOfLeadingZeros(this.f7386a[i3]));
    }

    public void e(int i2, int i3) {
        a(i2, i3);
        if (i2 == i3) {
            return;
        }
        int l = l(i2);
        int l2 = l(i3 - 1);
        c(l2);
        long j2 = (-1) << i2;
        long j3 = (-1) >>> (-i3);
        if (l == l2) {
            long[] jArr = this.f7386a;
            jArr[l] = (j3 & j2) | jArr[l];
        } else {
            long[] jArr2 = this.f7386a;
            jArr2[l] = j2 | jArr2[l];
            while (true) {
                l++;
                if (l >= l2) {
                    break;
                } else {
                    this.f7386a[l] = -1;
                }
            }
            long[] jArr3 = this.f7386a;
            jArr3[l2] = j3 | jArr3[l2];
        }
        b();
    }

    public void e(b bVar) {
        int min = Math.min(this.b, bVar.b);
        int i2 = this.b;
        int i3 = bVar.b;
        if (i2 < i3) {
            b(i3);
            this.b = bVar.b;
        }
        for (int i4 = 0; i4 < min; i4++) {
            long[] jArr = this.f7386a;
            jArr[i4] = jArr[i4] ^ bVar.f7386a[i4];
        }
        int i5 = bVar.b;
        if (min < i5) {
            System.arraycopy(bVar.f7386a, min, this.f7386a, min, i5 - min);
        }
        f();
        b();
    }

    public boolean e(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i2);
        }
        b();
        int l = l(i2);
        return l < this.b && (this.f7386a[l] & (1 << i2)) != 0;
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
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.f7386a[i2] != bVar.f7386a[i2]) {
                return false;
            }
        }
        return true;
    }

    public int g() {
        return this.f7386a.length * 64;
    }

    public int g(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i2);
        }
        b();
        int l = l(i2);
        if (l >= this.b) {
            return i2;
        }
        long j2 = (~this.f7386a[l]) & ((-1) << i2);
        while (j2 == 0) {
            l++;
            int i3 = this.b;
            if (l == i3) {
                return i3 * 64;
            }
            j2 = ~this.f7386a[l];
        }
        return (l * 64) + Long.numberOfTrailingZeros(j2);
    }

    public int h(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i2);
        }
        b();
        int l = l(i2);
        if (l >= this.b) {
            return -1;
        }
        long j2 = this.f7386a[l] & ((-1) << i2);
        while (j2 == 0) {
            l++;
            if (l == this.b) {
                return -1;
            }
            j2 = this.f7386a[l];
        }
        return (l * 64) + Long.numberOfTrailingZeros(j2);
    }

    public byte[] h() {
        int i2 = this.b;
        if (i2 == 0) {
            return new byte[0];
        }
        int i3 = i2 - 1;
        int i4 = i3 * 8;
        for (long j2 = this.f7386a[i3]; j2 != 0; j2 >>>= 8) {
            i4++;
        }
        byte[] bArr = new byte[i4];
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int i5 = 0; i5 < i3; i5++) {
            order.putLong(this.f7386a[i5]);
        }
        for (long j3 = this.f7386a[i3]; j3 != 0; j3 >>>= 8) {
            order.put((byte) (255 & j3));
        }
        return bArr;
    }

    public int hashCode() {
        int i2 = this.b;
        long j2 = 1234;
        while (true) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                return (int) ((j2 >> 32) ^ j2);
            }
            j2 ^= this.f7386a[i3] * i2;
            i2 = i3;
        }
    }

    public int i(int i2) {
        if (i2 < 0) {
            if (i2 == -1) {
                return -1;
            }
            throw new IndexOutOfBoundsException("fromIndex < -1: " + i2);
        }
        b();
        int l = l(i2);
        if (l >= this.b) {
            return i2;
        }
        long j2 = (~this.f7386a[l]) & ((-1) >>> (-(i2 + 1)));
        while (j2 == 0) {
            int i3 = l - 1;
            if (l == 0) {
                return -1;
            }
            j2 = ~this.f7386a[i3];
            l = i3;
        }
        return (((l + 1) * 64) - 1) - Long.numberOfLeadingZeros(j2);
    }

    public long[] i() {
        return Arrays.copyOf(this.f7386a, this.b);
    }

    public int j(int i2) {
        if (i2 < 0) {
            if (i2 == -1) {
                return -1;
            }
            throw new IndexOutOfBoundsException("fromIndex < -1: " + i2);
        }
        b();
        int l = l(i2);
        if (l >= this.b) {
            return e() - 1;
        }
        long j2 = this.f7386a[l] & ((-1) >>> (-(i2 + 1)));
        while (j2 == 0) {
            int i3 = l - 1;
            if (l == 0) {
                return -1;
            }
            j2 = this.f7386a[i3];
            l = i3;
        }
        return (((l + 1) * 64) - 1) - Long.numberOfLeadingZeros(j2);
    }

    public void k(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i2);
        }
        int l = l(i2);
        c(l);
        long[] jArr = this.f7386a;
        jArr[l] = jArr[l] | (1 << i2);
        b();
    }

    public String toString() {
        b();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(((i2 > 128 ? a() : i2 * 64) * 6) + 2);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int h2 = h(0);
        if (h2 != -1) {
            sb.append(h2);
            int i3 = h2 + 1;
            while (true) {
                int h3 = h(i3);
                if (h3 < 0) {
                    break;
                }
                int g2 = g(h3);
                while (true) {
                    sb.append(", ").append(h3);
                    int i4 = h3 + 1;
                    if (i4 >= g2) {
                        break;
                    }
                    h3 = i4;
                }
                i3 = h3 + 2;
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
