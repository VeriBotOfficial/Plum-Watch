package com.efs.sdk.memleaksdk.monitor.shark;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes14.dex */
public final class l implements m, n, Cloneable, ByteChannel {
    private static final byte[] c = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions};

    /* renamed from: a, reason: collision with root package name */
    r f9916a;
    long b;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.efs.sdk.memleaksdk.monitor.shark.v
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public long a() {
        return this.b;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public boolean b() {
        return this.b == 0;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public byte c() {
        if (this.b == 0) {
            throw new IllegalStateException("size == 0");
        }
        r rVar = this.f9916a;
        int i = rVar.b;
        int i2 = rVar.c;
        int i3 = i + 1;
        byte b = rVar.f9921a[i];
        this.b--;
        if (i3 == i2) {
            this.f9916a = rVar.b();
            s.a(rVar);
            return b;
        }
        rVar.b = i3;
        return b;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public short d() {
        if (this.b < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        r rVar = this.f9916a;
        int i = rVar.b;
        int i2 = rVar.c;
        if (i2 - i < 2) {
            return (short) (((c() & 255) << 8) | (c() & 255));
        }
        byte[] bArr = rVar.f9921a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.f9916a = rVar.b();
            s.a(rVar);
        } else {
            rVar.b = i5;
        }
        return (short) i6;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public int e() {
        if (this.b < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        r rVar = this.f9916a;
        int i = rVar.b;
        int i2 = rVar.c;
        if (i2 - i < 4) {
            return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
        }
        byte[] bArr = rVar.f9921a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 == i2) {
            this.f9916a = rVar.b();
            s.a(rVar);
            return i6;
        }
        rVar.b = i5;
        return i6;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public long f() {
        if (this.b < 8) {
            throw new IllegalStateException("size < 8: " + this.b);
        }
        r rVar = this.f9916a;
        int i = rVar.b;
        int i2 = rVar.c;
        if (i2 - i < 8) {
            return ((e() & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & e());
        }
        byte[] bArr = rVar.f9921a;
        int i3 = i + 7;
        long j = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.b -= 8;
        if (i4 == i2) {
            this.f9916a = rVar.b();
            s.a(rVar);
            return j2;
        }
        rVar.b = i4;
        return j2;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public String a(long j) throws EOFException {
        return a(j, x.f9924a);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public String a(long j, Charset charset) throws EOFException {
        x.a(this.b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        r rVar = this.f9916a;
        if (rVar.b + j > rVar.c) {
            return new String(b(j), charset);
        }
        String str = new String(rVar.f9921a, rVar.b, (int) j, charset);
        rVar.b = (int) (rVar.b + j);
        this.b -= j;
        if (rVar.b == rVar.c) {
            this.f9916a = rVar.b();
            s.a(rVar);
        }
        return str;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public byte[] b(long j) throws EOFException {
        x.a(this.b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        a(bArr);
        return bArr;
    }

    public void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    public int a(byte[] bArr, int i, int i2) {
        x.a(bArr.length, i, i2);
        r rVar = this.f9916a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i2, rVar.c - rVar.b);
        System.arraycopy(rVar.f9921a, rVar.b, bArr, i, min);
        rVar.b += min;
        this.b -= min;
        if (rVar.b == rVar.c) {
            this.f9916a = rVar.b();
            s.a(rVar);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        r rVar = this.f9916a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.c - rVar.b);
        byteBuffer.put(rVar.f9921a, rVar.b, min);
        rVar.b += min;
        this.b -= min;
        if (rVar.b == rVar.c) {
            this.f9916a = rVar.b();
            s.a(rVar);
        }
        return min;
    }

    public void g() {
        try {
            c(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public void c(long j) throws EOFException {
        while (j > 0) {
            if (this.f9916a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, r0.c - this.f9916a.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            this.f9916a.b += min;
            if (this.f9916a.b == this.f9916a.c) {
                r rVar = this.f9916a;
                this.f9916a = rVar.b();
                s.a(rVar);
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            r a2 = a(1);
            int min = Math.min(i, 8192 - a2.c);
            byteBuffer.get(a2.f9921a, a2.c, min);
            i -= min;
            a2.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    r a(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        r rVar = this.f9916a;
        if (rVar == null) {
            r a2 = s.a();
            this.f9916a = a2;
            a2.g = a2;
            a2.f = a2;
            return a2;
        }
        r rVar2 = rVar.g;
        return (rVar2.c + i > 8192 || !rVar2.e) ? rVar2.a(s.a()) : rVar2;
    }

    public void a(l lVar, long j) {
        if (lVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (lVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        x.a(lVar.b, 0L, j);
        while (j > 0) {
            if (j < lVar.f9916a.c - lVar.f9916a.b) {
                r rVar = this.f9916a;
                r rVar2 = rVar != null ? rVar.g : null;
                if (rVar2 != null && rVar2.e) {
                    if ((rVar2.c + j) - (rVar2.d ? 0 : rVar2.b) <= 8192) {
                        lVar.f9916a.a(rVar2, (int) j);
                        lVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                lVar.f9916a = lVar.f9916a.a((int) j);
            }
            r rVar3 = lVar.f9916a;
            long j2 = rVar3.c - rVar3.b;
            lVar.f9916a = rVar3.b();
            r rVar4 = this.f9916a;
            if (rVar4 == null) {
                this.f9916a = rVar3;
                rVar3.g = rVar3;
                rVar3.f = rVar3;
            } else {
                rVar4.g.a(rVar3).c();
            }
            lVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.v
    public long b(l lVar, long j) {
        if (lVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        lVar.a(this, j);
        return j;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public long a(byte b) {
        return a(b, 0L, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) {
        r rVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (rVar = this.f9916a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                rVar = rVar.g;
                j4 -= rVar.c - rVar.b;
            }
        } else {
            while (true) {
                long j6 = (rVar.c - rVar.b) + j3;
                if (j6 >= j) {
                    break;
                }
                rVar = rVar.f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = rVar.f9921a;
            int min = (int) Math.min(rVar.c, (rVar.b + j5) - j4);
            for (int i = (int) ((rVar.b + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - rVar.b) + j4;
                }
            }
            j4 += rVar.c - rVar.b;
            rVar = rVar.f;
            j7 = j4;
        }
        return -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        long j = this.b;
        if (j != lVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        r rVar = this.f9916a;
        r rVar2 = lVar.f9916a;
        int i = rVar.b;
        int i2 = rVar2.b;
        while (j2 < this.b) {
            long min = Math.min(rVar.c - i, rVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (rVar.f9921a[i] != rVar2.f9921a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == rVar.c) {
                rVar = rVar.f;
                i = rVar.b;
            }
            if (i2 == rVar2.c) {
                rVar2 = rVar2.f;
                i2 = rVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        r rVar = this.f9916a;
        if (rVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = rVar.c;
            for (int i3 = rVar.b; i3 < i2; i3++) {
                i = (i * 31) + rVar.f9921a[i3];
            }
            rVar = rVar.f;
        } while (rVar != this.f9916a);
        return i;
    }

    public String toString() {
        return i().toString();
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public l clone() {
        l lVar = new l();
        if (this.b == 0) {
            return lVar;
        }
        r a2 = this.f9916a.a();
        lVar.f9916a = a2;
        a2.g = a2;
        a2.f = a2;
        r rVar = this.f9916a;
        while (true) {
            rVar = rVar.f;
            if (rVar != this.f9916a) {
                lVar.f9916a.g.a(rVar.a());
            } else {
                lVar.b = this.b;
                return lVar;
            }
        }
    }

    public o i() {
        long j = this.b;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
        }
        return b((int) j);
    }

    public o b(int i) {
        if (i == 0) {
            return o.b;
        }
        return new t(this, i);
    }
}
