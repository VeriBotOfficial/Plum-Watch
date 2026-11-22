package com.anythink.core.common.n.c;

import android.gov.nist.core.Separators;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public final class c implements d, e, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    static final int f4218a = 65533;
    private static final byte[] d = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions};
    s b;
    long c;

    private c B() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final /* bridge */ /* synthetic */ d A() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.e
    public final c c() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.anythink.core.common.n.c.e
    public final c d() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d f() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long b() {
        return this.c;
    }

    @Override // com.anythink.core.common.n.c.d
    public final OutputStream e() {
        return new OutputStream() { // from class: com.anythink.core.common.n.c.c.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                c.this.l((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                c.this.c(bArr, i, i2);
            }

            public final String toString() {
                return c.this + ".outputStream()";
            }
        };
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean g() {
        return this.c == 0;
    }

    @Override // com.anythink.core.common.n.c.e
    public final void a(long j) {
        if (this.c < j) {
            throw new EOFException();
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean b(long j) {
        return this.c >= j;
    }

    @Override // com.anythink.core.common.n.c.e
    public final e h() {
        return n.a(new p(this));
    }

    @Override // com.anythink.core.common.n.c.e
    public final InputStream i() {
        return new InputStream() { // from class: com.anythink.core.common.n.c.c.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                if (c.this.c > 0) {
                    return c.this.k() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                return c.this.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(c.this.c, 2147483647L);
            }

            public final String toString() {
                return c.this + ".inputStream()";
            }
        };
    }

    private c a(OutputStream outputStream) {
        long j = this.c;
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        y.a(j, 0L, j);
        if (j != 0) {
            s sVar = this.b;
            long j2 = 0;
            while (j2 >= sVar.e - sVar.d) {
                j2 -= sVar.e - sVar.d;
                sVar = sVar.h;
            }
            while (j > 0) {
                int min = (int) Math.min(sVar.e - r5, j);
                outputStream.write(sVar.c, (int) (sVar.d + j2), min);
                j -= min;
                sVar = sVar.h;
                j2 = 0;
            }
        }
        return this;
    }

    private c a(OutputStream outputStream, long j, long j2) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        long j3 = j2;
        y.a(this.c, 0L, j3);
        if (j3 != 0) {
            s sVar = this.b;
            while (j >= sVar.e - sVar.d) {
                j -= sVar.e - sVar.d;
                sVar = sVar.h;
            }
            while (j3 > 0) {
                int min = (int) Math.min(sVar.e - r8, j3);
                outputStream.write(sVar.c, (int) (sVar.d + j), min);
                j3 -= min;
                sVar = sVar.h;
                j = 0;
            }
        }
        return this;
    }

    public final c a(c cVar, long j, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        long j3 = j;
        y.a(this.c, j3, j2);
        if (j2 != 0) {
            cVar.c += j2;
            s sVar = this.b;
            while (j3 >= sVar.e - sVar.d) {
                j3 -= sVar.e - sVar.d;
                sVar = sVar.h;
            }
            s sVar2 = sVar;
            long j4 = j2;
            while (j4 > 0) {
                s a2 = sVar2.a();
                a2.d = (int) (a2.d + j3);
                a2.e = Math.min(a2.d + ((int) j4), a2.e);
                s sVar3 = cVar.b;
                if (sVar3 == null) {
                    a2.i = a2;
                    a2.h = a2;
                    cVar.b = a2;
                } else {
                    sVar3.i.a(a2);
                }
                j4 -= a2.e - a2.d;
                sVar2 = sVar2.h;
                j3 = 0;
            }
        }
        return this;
    }

    private c b(OutputStream outputStream) {
        long j = this.c;
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        y.a(j, 0L, j);
        s sVar = this.b;
        while (j > 0) {
            int min = (int) Math.min(j, sVar.e - sVar.d);
            outputStream.write(sVar.c, sVar.d, min);
            sVar.d += min;
            long j2 = min;
            this.c -= j2;
            j -= j2;
            if (sVar.d == sVar.e) {
                s c = sVar.c();
                this.b = c;
                t.a(sVar);
                sVar = c;
            }
        }
        return this;
    }

    private c a(OutputStream outputStream, long j) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        y.a(this.c, 0L, j);
        s sVar = this.b;
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, sVar.e - sVar.d);
            outputStream.write(sVar.c, sVar.d, min);
            sVar.d += min;
            long j3 = min;
            this.c -= j3;
            j2 -= j3;
            if (sVar.d == sVar.e) {
                s c = sVar.c();
                this.b = c;
                t.a(sVar);
                sVar = c;
            }
        }
        return this;
    }

    private c a(InputStream inputStream) {
        a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    private c a(InputStream inputStream, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        a(inputStream, j, false);
        return this;
    }

    private void a(InputStream inputStream, long j, boolean z) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            s g = g(1);
            int read = inputStream.read(g.c, g.e, (int) Math.min(j, 8192 - g.e));
            if (read == -1) {
                if (!z) {
                    throw new EOFException();
                }
                return;
            } else {
                g.e += read;
                long j2 = read;
                this.c += j2;
                j -= j2;
            }
        }
    }

    public final long j() {
        long j = this.c;
        if (j == 0) {
            return 0L;
        }
        s sVar = this.b.i;
        return (sVar.e >= 8192 || !sVar.g) ? j : j - (sVar.e - sVar.d);
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte k() {
        if (this.c == 0) {
            throw new IllegalStateException("size == 0");
        }
        s sVar = this.b;
        int i = sVar.d;
        int i2 = sVar.e;
        int i3 = i + 1;
        byte b = sVar.c[i];
        this.c--;
        if (i3 == i2) {
            this.b = sVar.c();
            t.a(sVar);
            return b;
        }
        sVar.d = i3;
        return b;
    }

    public final byte c(long j) {
        long j2 = j;
        y.a(this.c, j2, 1L);
        long j3 = this.c;
        if (j3 - j2 > j2) {
            s sVar = this.b;
            while (true) {
                long j4 = sVar.e - sVar.d;
                if (j2 >= j4) {
                    j2 -= j4;
                    sVar = sVar.h;
                } else {
                    return sVar.c[sVar.d + ((int) j2)];
                }
            }
        } else {
            long j5 = j2 - j3;
            s sVar2 = this.b;
            do {
                sVar2 = sVar2.i;
                j5 += sVar2.e - sVar2.d;
            } while (j5 < 0);
            return sVar2.c[sVar2.d + ((int) j5)];
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final short l() {
        if (this.c < 2) {
            throw new IllegalStateException("size < 2: " + this.c);
        }
        s sVar = this.b;
        int i = sVar.d;
        int i2 = sVar.e;
        if (i2 - i < 2) {
            return (short) (((k() & 255) << 8) | (k() & 255));
        }
        byte[] bArr = sVar.c;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.c -= 2;
        if (i5 == i2) {
            this.b = sVar.c();
            t.a(sVar);
        } else {
            sVar.d = i5;
        }
        return (short) i6;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int m() {
        if (this.c < 4) {
            throw new IllegalStateException("size < 4: " + this.c);
        }
        s sVar = this.b;
        int i = sVar.d;
        int i2 = sVar.e;
        if (i2 - i < 4) {
            return ((k() & 255) << 24) | ((k() & 255) << 16) | ((k() & 255) << 8) | (k() & 255);
        }
        byte[] bArr = sVar.c;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.c -= 4;
        if (i5 == i2) {
            this.b = sVar.c();
            t.a(sVar);
            return i6;
        }
        sVar.d = i5;
        return i6;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long n() {
        if (this.c < 8) {
            throw new IllegalStateException("size < 8: " + this.c);
        }
        s sVar = this.b;
        int i = sVar.d;
        int i2 = sVar.e;
        if (i2 - i < 8) {
            return ((m() & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & m());
        }
        byte[] bArr = sVar.c;
        int i3 = i + 7;
        long j = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.c -= 8;
        if (i4 == i2) {
            this.b = sVar.c();
            t.a(sVar);
            return j2;
        }
        sVar.d = i4;
        return j2;
    }

    @Override // com.anythink.core.common.n.c.e
    public final short o() {
        return y.a(l());
    }

    @Override // com.anythink.core.common.n.c.e
    public final int p() {
        return y.a(m());
    }

    @Override // com.anythink.core.common.n.c.e
    public final long q() {
        return y.a(n());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8 A[EDGE_INSN: B:46:0x00a8->B:40:0x00a8 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r() {
        /*
            r15 = this;
            long r0 = r15.c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb3
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        Lf:
            com.anythink.core.common.n.c.s r7 = r15.b
            byte[] r8 = r7.c
            int r9 = r7.d
            int r10 = r7.e
        L17:
            if (r9 >= r10) goto L94
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L67
            r12 = 57
            if (r11 > r12) goto L67
            int r12 = 48 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L3c
            if (r13 != 0) goto L36
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L36
            goto L3c
        L36:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L72
        L3c:
            com.anythink.core.common.n.c.c r0 = new com.anythink.core.common.n.c.c
            r0.<init>()
            com.anythink.core.common.n.c.c r0 = r0.o(r3)
            com.anythink.core.common.n.c.c r0 = r0.l(r11)
            if (r1 != 0) goto L4e
            r0.k()
        L4e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.u()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L67:
            r12 = 45
            r13 = 1
            if (r11 != r12) goto L77
            if (r0 != 0) goto L77
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L72:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L17
        L77:
            if (r0 == 0) goto L7b
            r2 = r13
            goto L94
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L94:
            if (r9 != r10) goto La0
            com.anythink.core.common.n.c.s r8 = r7.c()
            r15.b = r8
            com.anythink.core.common.n.c.t.a(r7)
            goto La2
        La0:
            r7.d = r9
        La2:
            if (r2 != 0) goto La8
            com.anythink.core.common.n.c.s r7 = r15.b
            if (r7 != 0) goto Lf
        La8:
            long r5 = r15.c
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.c = r5
            if (r1 == 0) goto Lb1
            return r3
        Lb1:
            long r0 = -r3
            return r0
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.c.c.r():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[EDGE_INSN: B:40:0x009e->B:37:0x009e BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s() {
        /*
            r14 = this;
            long r0 = r14.c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La5
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            com.anythink.core.common.n.c.s r6 = r14.b
            byte[] r7 = r6.c
            int r8 = r6.d
            int r9 = r6.e
        L13:
            if (r8 >= r9) goto L8a
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6d
            r11 = 70
            if (r10 > r11) goto L6d
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            com.anythink.core.common.n.c.c r0 = new com.anythink.core.common.n.c.c
            r0.<init>()
            com.anythink.core.common.n.c.c r0 = r0.n(r4)
            com.anythink.core.common.n.c.c r0 = r0.l(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.u()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L6d:
            if (r0 == 0) goto L71
            r1 = 1
            goto L8a
        L71:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8a:
            if (r8 != r9) goto L96
            com.anythink.core.common.n.c.s r7 = r6.c()
            r14.b = r7
            com.anythink.core.common.n.c.t.a(r6)
            goto L98
        L96:
            r6.d = r8
        L98:
            if (r1 != 0) goto L9e
            com.anythink.core.common.n.c.s r6 = r14.b
            if (r6 != 0) goto Lb
        L9e:
            long r1 = r14.c
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.c = r1
            return r4
        La5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.c.c.s():long");
    }

    @Override // com.anythink.core.common.n.c.e
    public final f t() {
        return new f(y());
    }

    @Override // com.anythink.core.common.n.c.e
    public final f d(long j) {
        return new f(h(j));
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(o oVar) {
        int a2 = a(oVar, false);
        if (a2 == -1) {
            return -1;
        }
        try {
            i(oVar.f4234a[a2].j());
            return a2;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r20 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(com.anythink.core.common.n.c.o r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.c.c.a(com.anythink.core.common.n.c.o, boolean):int");
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(c cVar, long j) {
        long j2 = this.c;
        if (j2 < j) {
            cVar.a(this, j2);
            throw new EOFException();
        }
        cVar.a(this, j);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(v vVar) {
        long j = this.c;
        if (j > 0) {
            vVar.a(this, j);
        }
        return j;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String u() {
        try {
            return a(this.c, y.f4243a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String e(long j) {
        return a(j, y.f4243a);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(Charset charset) {
        try {
            return a(this.c, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(long j, Charset charset) {
        y.a(this.c, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        s sVar = this.b;
        if (sVar.d + j > sVar.e) {
            return new String(h(j), charset);
        }
        String str = new String(sVar.c, sVar.d, (int) j, charset);
        sVar.d = (int) (sVar.d + j);
        this.c -= j;
        if (sVar.d == sVar.e) {
            this.b = sVar.c();
            t.a(sVar);
        }
        return str;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String v() {
        long a2 = a((byte) 10);
        if (a2 == -1) {
            long j = this.c;
            if (j != 0) {
                return e(j);
            }
            return null;
        }
        return g(a2);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String w() {
        return f(Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String f(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return g(a2);
        }
        if (j2 < this.c && c(j2 - 1) == 13 && c(j2) == 10) {
            return g(j2);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, this.c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.c, j) + " content=" + cVar.t().g() + Typography.ellipsis);
    }

    final String g(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (c(j2) == 13) {
                String e = e(j2);
                i(2L);
                return e;
            }
        }
        String e2 = e(j);
        i(1L);
        return e2;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int x() {
        int i;
        int i2;
        int i3;
        if (this.c == 0) {
            throw new EOFException();
        }
        byte c = c(0L);
        if ((c & 128) == 0) {
            i = c & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((c & 224) == 192) {
            i = c & 31;
            i2 = 2;
            i3 = 128;
        } else if ((c & TransmissionUnpacked.HD_VAL_MAGIC_HB) == 224) {
            i = c & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((c & 248) != 240) {
                i(1L);
                return 65533;
            }
            i = c & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.c < j) {
            throw new EOFException("size < " + i2 + ": " + this.c + " (to read code point prefixed 0x" + Integer.toHexString(c) + Separators.RPAREN);
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte c2 = c(j2);
            if ((c2 & 192) != 128) {
                i(j2);
                return 65533;
            }
            i = (i << 6) | (c2 & 63);
        }
        i(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((i < 55296 || i > 57343) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] y() {
        try {
            return h(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] h(long j) {
        y.a(this.c, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        b(bArr);
        return bArr;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr, int i, int i2) {
        y.a(bArr.length, i, i2);
        s sVar = this.b;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i2, sVar.e - sVar.d);
        System.arraycopy(sVar.c, sVar.d, bArr, i, min);
        sVar.d += min;
        this.c -= min;
        if (sVar.d == sVar.e) {
            this.b = sVar.c();
            t.a(sVar);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        s sVar = this.b;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), sVar.e - sVar.d);
        byteBuffer.put(sVar.c, sVar.d, min);
        sVar.d += min;
        this.c -= min;
        if (sVar.d == sVar.e) {
            this.b = sVar.c();
            t.a(sVar);
        }
        return min;
    }

    public final void z() {
        try {
            i(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final void i(long j) {
        while (j > 0) {
            if (this.b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, r0.e - this.b.d);
            long j2 = min;
            this.c -= j2;
            j -= j2;
            this.b.d += min;
            if (this.b.d == this.b.e) {
                s sVar = this.b;
                this.b = sVar.c();
                t.a(sVar);
            }
        }
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c d(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.a(this);
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str) {
        return b(str, 0, str.length());
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                s g = g(1);
                byte[] bArr = g.c;
                int i3 = g.e - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = (i3 + i) - g.e;
                g.e += i5;
                this.c += i5;
            } else {
                if (charAt2 < 2048) {
                    l((charAt2 >> 6) | 192);
                    l((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    l((charAt2 >> '\f') | 224);
                    l(((charAt2 >> 6) & 63) | 128);
                    l((charAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        l(63);
                        i = i6;
                    } else {
                        int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        l((i7 >> 18) | 240);
                        l(((i7 >> 12) & 63) | 128);
                        l(((i7 >> 6) & 63) | 128);
                        l((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c m(int i) {
        if (i < 128) {
            l(i);
            return this;
        }
        if (i < 2048) {
            l((i >> 6) | 192);
            l((i & 63) | 128);
            return this;
        }
        if (i >= 65536) {
            if (i <= 1114111) {
                l((i >> 18) | 240);
                l(((i >> 12) & 63) | 128);
                l(((i >> 6) & 63) | 128);
                l((i & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        if (i >= 55296 && i <= 57343) {
            l(63);
            return this;
        }
        l((i >> 12) | 224);
        l(((i >> 6) & 63) | 128);
        l((i & 63) | 128);
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, Charset charset) {
        return b(str, 0, str.length(), charset);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(y.f4243a)) {
            return b(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return c(bytes, 0, bytes.length);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c d(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return c(bArr, 0, bArr.length);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        y.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            s g = g(1);
            int min = Math.min(i3 - i, 8192 - g.e);
            System.arraycopy(bArr, i, g.c, g.e, min);
            i += min;
            g.e += min;
        }
        this.c += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            s g = g(1);
            int min = Math.min(i, 8192 - g.e);
            byteBuffer.get(g.c, g.e, min);
            i -= min;
            g.e += min;
        }
        this.c += remaining;
        return remaining;
    }

    @Override // com.anythink.core.common.n.c.d
    public final long a(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a_ = wVar.a_(this, 8192L);
            if (a_ == -1) {
                return j;
            }
            j += a_;
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d a(w wVar, long j) {
        while (j > 0) {
            long a_ = wVar.a_(this, j);
            if (a_ == -1) {
                throw new EOFException();
            }
            j -= a_;
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c l(int i) {
        s g = g(1);
        byte[] bArr = g.c;
        int i2 = g.e;
        g.e = i2 + 1;
        bArr[i2] = (byte) i;
        this.c++;
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c k(int i) {
        s g = g(2);
        byte[] bArr = g.c;
        int i2 = g.e;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        g.e = i2 + 2;
        this.c += 2;
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c j(int i) {
        return k((int) y.a((short) i));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final c i(int i) {
        s g = g(4);
        byte[] bArr = g.c;
        int i2 = g.e;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        g.e = i2 + 4;
        this.c += 4;
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final c h(int i) {
        return i(y.a(i));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final c q(long j) {
        s g = g(8);
        byte[] bArr = g.c;
        int i = g.e;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        g.e = i + 8;
        this.c += 8;
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final c p(long j) {
        return q(y.a(j));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final c o(long j) {
        boolean z;
        if (j == 0) {
            return l(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        s g = g(i);
        byte[] bArr = g.c;
        int i2 = g.e + i;
        while (j != 0) {
            i2--;
            bArr[i2] = d[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = BuiltinOptions.GreaterEqualOptions;
        }
        g.e += i;
        this.c += i;
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final c n(long j) {
        if (j == 0) {
            return l(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        s g = g(numberOfTrailingZeros);
        byte[] bArr = g.c;
        int i = g.e;
        for (int i2 = (g.e + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = d[(int) (15 & j)];
            j >>>= 4;
        }
        g.e += numberOfTrailingZeros;
        this.c += numberOfTrailingZeros;
        return this;
    }

    final s g(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        s sVar = this.b;
        if (sVar == null) {
            s a2 = t.a();
            this.b = a2;
            a2.i = a2;
            a2.h = a2;
            return a2;
        }
        s sVar2 = sVar.i;
        return (sVar2.e + i > 8192 || !sVar2.g) ? sVar2.a(t.a()) : sVar2;
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        y.a(cVar.c, 0L, j);
        while (j > 0) {
            if (j < cVar.b.e - cVar.b.d) {
                s sVar = this.b;
                s sVar2 = sVar != null ? sVar.i : null;
                if (sVar2 != null && sVar2.g) {
                    if ((sVar2.e + j) - (sVar2.f ? 0 : sVar2.d) <= 8192) {
                        cVar.b.a(sVar2, (int) j);
                        cVar.c -= j;
                        this.c += j;
                        return;
                    }
                }
                cVar.b = cVar.b.a((int) j);
            }
            s sVar3 = cVar.b;
            long j2 = sVar3.e - sVar3.d;
            cVar.b = sVar3.c();
            s sVar4 = this.b;
            if (sVar4 == null) {
                this.b = sVar3;
                sVar3.i = sVar3;
                sVar3.h = sVar3;
            } else {
                sVar4.i.a(sVar3).d();
            }
            cVar.c -= j2;
            this.c += j2;
            j -= j2;
        }
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        long j2 = this.c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        cVar.a(this, j);
        return j;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b) {
        return a(b, 0L, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b, long j) {
        return a(b, j, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b, long j, long j2) {
        s sVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.c), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.c;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (sVar = this.b) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                sVar = sVar.i;
                j4 -= sVar.e - sVar.d;
            }
        } else {
            while (true) {
                long j6 = (sVar.e - sVar.d) + j3;
                if (j6 >= j) {
                    break;
                }
                sVar = sVar.h;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = sVar.c;
            int min = (int) Math.min(sVar.e, (sVar.d + j5) - j4);
            for (int i = (int) ((sVar.d + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - sVar.d) + j4;
                }
            }
            j4 += sVar.e - sVar.d;
            sVar = sVar.h;
            j7 = j4;
        }
        return -1L;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar) {
        return a(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(f fVar, long j) {
        if (fVar.j() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        s sVar = this.b;
        long j3 = -1;
        if (sVar == null) {
            return -1L;
        }
        long j4 = this.c;
        if (j4 - j < j) {
            while (j4 > j) {
                sVar = sVar.i;
                j4 -= sVar.e - sVar.d;
            }
        } else {
            while (true) {
                long j5 = (sVar.e - sVar.d) + j2;
                if (j5 >= j) {
                    break;
                }
                sVar = sVar.h;
                j2 = j5;
            }
            j4 = j2;
        }
        byte b = fVar.b(0);
        int j6 = fVar.j();
        long j7 = (this.c - j6) + 1;
        long j8 = j4;
        long j9 = j;
        while (j8 < j7) {
            byte[] bArr = sVar.c;
            long j10 = j3;
            int min = (int) Math.min(sVar.e, (sVar.d + j7) - j8);
            for (int i = (int) ((sVar.d + j9) - j8); i < min; i++) {
                if (bArr[i] == b && a(sVar, i + 1, fVar, j6)) {
                    return (i - sVar.d) + j8;
                }
            }
            j8 += sVar.e - sVar.d;
            sVar = sVar.h;
            j9 = j8;
            j3 = j10;
        }
        return j3;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long c(f fVar) {
        return b(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        s sVar = this.b;
        if (sVar == null) {
            return -1L;
        }
        long j3 = this.c;
        if (j3 - j < j) {
            while (j3 > j) {
                sVar = sVar.i;
                j3 -= sVar.e - sVar.d;
            }
        } else {
            while (true) {
                long j4 = (sVar.e - sVar.d) + j2;
                if (j4 >= j) {
                    break;
                }
                sVar = sVar.h;
                j2 = j4;
            }
            j3 = j2;
        }
        if (fVar.j() == 2) {
            byte b = fVar.b(0);
            byte b2 = fVar.b(1);
            while (j3 < this.c) {
                byte[] bArr = sVar.c;
                i = (int) ((sVar.d + j) - j3);
                int i3 = sVar.e;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (b3 == b || b3 == b2) {
                        i2 = sVar.d;
                        return (i - i2) + j3;
                    }
                    i++;
                }
                j3 += sVar.e - sVar.d;
                sVar = sVar.h;
                j = j3;
            }
            return -1L;
        }
        byte[] l = fVar.l();
        while (j3 < this.c) {
            byte[] bArr2 = sVar.c;
            i = (int) ((sVar.d + j) - j3);
            int i4 = sVar.e;
            while (i < i4) {
                byte b4 = bArr2[i];
                for (byte b5 : l) {
                    if (b4 == b5) {
                        i2 = sVar.d;
                        return (i - i2) + j3;
                    }
                }
                i++;
            }
            j3 += sVar.e - sVar.d;
            sVar = sVar.h;
            j = j3;
        }
        return -1L;
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j, f fVar) {
        return a(j, fVar, fVar.j());
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j, f fVar, int i) {
        if (j < 0 || i < 0 || this.c - j < i || fVar.j() < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (c(i2 + j) != fVar.b(i2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(s sVar, int i, f fVar, int i2) {
        int i3 = sVar.e;
        byte[] bArr = sVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                sVar = sVar.h;
                bArr = sVar.c;
                i = sVar.d;
                i3 = sVar.e;
            }
            if (bArr[i] != fVar.b(i4)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return x.c;
    }

    private List<Integer> C() {
        if (this.b == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.b.e - this.b.d));
        s sVar = this.b;
        while (true) {
            sVar = sVar.h;
            if (sVar == this.b) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(sVar.e - sVar.d));
        }
    }

    private f D() {
        return c("MD5");
    }

    private f E() {
        return c("SHA-1");
    }

    private f F() {
        return c("SHA-256");
    }

    private f G() {
        return c("SHA-512");
    }

    private f c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            s sVar = this.b;
            if (sVar != null) {
                messageDigest.update(sVar.c, this.b.d, this.b.e - this.b.d);
                s sVar2 = this.b;
                while (true) {
                    sVar2 = sVar2.h;
                    if (sVar2 == this.b) {
                        break;
                    }
                    messageDigest.update(sVar2.c, sVar2.d, sVar2.e - sVar2.d);
                }
            }
            return f.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private f e(f fVar) {
        return a("HmacSHA1", fVar);
    }

    private f f(f fVar) {
        return a("HmacSHA256", fVar);
    }

    private f g(f fVar) {
        return a("HmacSHA512", fVar);
    }

    private f a(String str, f fVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(fVar.k(), str));
            s sVar = this.b;
            if (sVar != null) {
                mac.update(sVar.c, this.b.d, this.b.e - this.b.d);
                s sVar2 = this.b;
                while (true) {
                    sVar2 = sVar2.h;
                    if (sVar2 == this.b) {
                        break;
                    }
                    mac.update(sVar2.c, sVar2.d, sVar2.e - sVar2.d);
                }
            }
            return f.a(mac.doFinal());
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j = this.c;
        if (j != cVar.c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        s sVar = this.b;
        s sVar2 = cVar.b;
        int i = sVar.d;
        int i2 = sVar2.d;
        while (j2 < this.c) {
            long min = Math.min(sVar.e - i, sVar2.e - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (sVar.c[i] != sVar2.c[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == sVar.e) {
                sVar = sVar.h;
                i = sVar.d;
            }
            if (i2 == sVar2.e) {
                sVar2 = sVar2.h;
                i2 = sVar2.d;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        s sVar = this.b;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = sVar.e;
            for (int i3 = sVar.d; i3 < i2; i3++) {
                i = (i * 31) + sVar.c[i3];
            }
            sVar = sVar.h;
        } while (sVar != this.b);
        return i;
    }

    private c H() {
        c cVar = new c();
        if (this.c == 0) {
            return cVar;
        }
        s a2 = this.b.a();
        cVar.b = a2;
        a2.i = a2;
        a2.h = a2;
        s sVar = this.b;
        while (true) {
            sVar = sVar.h;
            if (sVar != this.b) {
                cVar.b.i.a(sVar.a());
            } else {
                cVar.c = this.c;
                return cVar;
            }
        }
    }

    private f I() {
        long j = this.c;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.c);
        }
        int i = (int) j;
        if (i == 0) {
            return f.b;
        }
        return new u(this, i);
    }

    private f n(int i) {
        if (i == 0) {
            return f.b;
        }
        return new u(this, i);
    }

    private a J() {
        a aVar = new a();
        if (aVar.f4221a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f4221a = this;
        aVar.b = false;
        return aVar;
    }

    private a b(a aVar) {
        if (aVar.f4221a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f4221a = this;
        aVar.b = false;
        return aVar;
    }

    private a K() {
        return a(new a());
    }

    public final a a(a aVar) {
        if (aVar.f4221a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f4221a = this;
        aVar.b = true;
        return aVar;
    }

    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public c f4221a;
        public boolean b;
        public byte[] d;
        private s g;
        public long c = -1;
        public int e = -1;
        public int f = -1;

        public final int a() {
            if (this.c == this.f4221a.c) {
                throw new IllegalStateException();
            }
            long j = this.c;
            return j == -1 ? a(0L) : a(j + (this.f - this.e));
        }

        public final int a(long j) {
            if (j < -1 || j > this.f4221a.c) {
                throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f4221a.c)));
            }
            if (j == -1 || j == this.f4221a.c) {
                this.g = null;
                this.c = j;
                this.d = null;
                this.e = -1;
                this.f = -1;
                return -1;
            }
            long j2 = this.f4221a.c;
            s sVar = this.f4221a.b;
            s sVar2 = this.f4221a.b;
            long j3 = 0;
            if (this.g != null) {
                long j4 = this.c - (this.e - r4.d);
                if (j4 > j) {
                    sVar2 = this.g;
                    j2 = j4;
                } else {
                    sVar = this.g;
                    j3 = j4;
                }
            }
            if (j2 - j > j - j3) {
                while (j >= (sVar.e - sVar.d) + j3) {
                    j3 += sVar.e - sVar.d;
                    sVar = sVar.h;
                }
            } else {
                while (j2 > j) {
                    sVar2 = sVar2.i;
                    j2 -= sVar2.e - sVar2.d;
                }
                j3 = j2;
                sVar = sVar2;
            }
            if (this.b && sVar.f) {
                s b = sVar.b();
                if (this.f4221a.b == sVar) {
                    this.f4221a.b = b;
                }
                sVar = sVar.a(b);
                sVar.i.c();
            }
            this.g = sVar;
            this.c = j;
            this.d = sVar.c;
            this.e = sVar.d + ((int) (j - j3));
            int i = sVar.e;
            this.f = i;
            return i - this.e;
        }

        private long b(long j) {
            c cVar = this.f4221a;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = cVar.c;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException("newSize < 0: ".concat(String.valueOf(j)));
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    s sVar = this.f4221a.b.i;
                    long j4 = sVar.e - sVar.d;
                    if (j4 <= j3) {
                        this.f4221a.b = sVar.c();
                        t.a(sVar);
                        j3 -= j4;
                    } else {
                        sVar.e = (int) (sVar.e - j3);
                        break;
                    }
                }
                this.g = null;
                this.c = j;
                this.d = null;
                this.e = -1;
                this.f = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    s g = this.f4221a.g(1);
                    int min = (int) Math.min(j5, 8192 - g.e);
                    g.e += min;
                    j5 -= min;
                    if (z) {
                        this.g = g;
                        this.c = j2;
                        this.d = g.c;
                        this.e = g.e - min;
                        this.f = g.e;
                        z = false;
                    }
                }
            }
            this.f4221a.c = j;
            return j2;
        }

        private long a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: ".concat(String.valueOf(i)));
            }
            if (i > 8192) {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: ".concat(String.valueOf(i)));
            }
            c cVar = this.f4221a;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.b) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long j = cVar.c;
            s g = this.f4221a.g(i);
            int i2 = 8192 - g.e;
            g.e = 8192;
            long j2 = i2;
            this.f4221a.c = j + j2;
            this.g = g;
            this.c = j;
            this.d = g.c;
            this.e = 8192 - i2;
            this.f = 8192;
            return j2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f4221a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f4221a = null;
            this.g = null;
            this.c = -1L;
            this.d = null;
            this.e = -1;
            this.f = -1;
        }
    }

    public final String toString() {
        f uVar;
        long j = this.c;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                uVar = f.b;
            } else {
                uVar = new u(this, i);
            }
            return uVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.c);
    }

    public final /* synthetic */ Object clone() {
        c cVar = new c();
        if (this.c == 0) {
            return cVar;
        }
        s a2 = this.b.a();
        cVar.b = a2;
        a2.i = a2;
        a2.h = a2;
        s sVar = this.b;
        while (true) {
            sVar = sVar.h;
            if (sVar != this.b) {
                cVar.b.i.a(sVar.a());
            } else {
                cVar.c = this.c;
                return cVar;
            }
        }
    }
}
