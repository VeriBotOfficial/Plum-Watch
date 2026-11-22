package com.efs.sdk.memleaksdk.monitor.shark;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001!B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0012\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0015\u0010\u001e\u001a\u00020\u0003*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0082\fJ\u0015\u0010\u001e\u001a\u00020\u0014*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0082\fR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/UnsortedByteEntries;", "", "bytesPerValue", "", "longIdentifiers", "", "initialCapacity", "growthFactor", "", "(IZID)V", "assigned", "bytesPerEntry", "currentCapacity", "entries", "", "subArray", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/UnsortedByteEntries$MutableByteSubArray;", "subArrayIndex", RequestParameters.SUBRESOURCE_APPEND, "key", "", "growEntries", "", "newCapacity", "moveToSortedMap", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/SortedBytesMap;", "readInt", "array", "index", "readLong", "and", "", "other", "MutableByteSubArray", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    final int f9894a;
    byte[] b;
    int c;
    int d;
    final boolean e;
    private final a f;
    private int g;
    private final int h;
    private final int i;
    private final double j;

    public cu(int i, boolean z, int i2, double d) {
        this.h = i;
        this.e = z;
        this.i = i2;
        this.j = d;
        this.f9894a = i + (z ? 8 : 4);
        this.f = new a();
    }

    public /* synthetic */ cu(int i, boolean z, int i2, double d, int i3) {
        this(i, z, (i3 & 4) != 0 ? 4 : i2, (i3 & 8) != 0 ? 2.0d : d);
    }

    public final a a(long j) {
        if (this.b == null) {
            int i = this.i;
            this.g = i;
            this.b = new byte[i * this.f9894a];
        } else {
            int i2 = this.g;
            if (i2 == this.d) {
                int i3 = (int) (i2 * this.j);
                a(i3);
                this.g = i3;
            }
        }
        this.d++;
        this.c = 0;
        this.f.a(j);
        return this.f;
    }

    public final cs a() {
        if (this.d == 0) {
            return new cs(this.e, this.h, new byte[0]);
        }
        byte[] bArr = this.b;
        Intrinsics.checkNotNull(bArr);
        cw.f9897a.a(bArr, 0, this.d, this.f9894a, new b());
        int length = bArr.length;
        int i = this.d;
        int i2 = this.f9894a;
        if (length > i * i2) {
            bArr = Arrays.copyOf(bArr, i * i2);
            Intrinsics.checkNotNullExpressionValue(bArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        this.b = null;
        this.d = 0;
        return new cs(this.e, this.h, bArr);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/efs/sdk/memleaksdk/monitor/shark/internal/UnsortedByteEntries$moveToSortedMap$1", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/aosp/ByteArrayComparator;", "compare", "", "entrySize", "o1Array", "", "o1Index", "o2Array", "o2Index", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    public static final class b implements cv {
        b() {
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cv
        public int a(int i, byte[] o1Array, int i2, byte[] o2Array, int i3) {
            Intrinsics.checkNotNullParameter(o1Array, "o1Array");
            Intrinsics.checkNotNullParameter(o2Array, "o2Array");
            if (!cu.this.e) {
                return Intrinsics.compare(cu.this.a(o1Array, i2 * i), cu.this.a(o2Array, i3 * i));
            }
            return (cu.this.b(o1Array, i2 * i) > cu.this.b(o2Array, i3 * i) ? 1 : (cu.this.b(o1Array, i2 * i) == cu.this.b(o2Array, i3 * i) ? 0 : -1));
        }
    }

    final int a(byte[] bArr, int i) {
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    final long b(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    private final void a(int i) {
        int i2 = this.f9894a;
        byte[] bArr = new byte[i * i2];
        System.arraycopy(this.b, 0, bArr, 0, this.d * i2);
        this.b = bArr;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/UnsortedByteEntries$MutableByteSubArray;", "", "(Lcom/efs/sdk/memleaksdk/monitor/shark/internal/UnsortedByteEntries;)V", "writeByte", "", "value", "", "writeId", "", "writeInt", "", "writeLong", "writeTruncatedLong", "byteCount", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    public final class a {
        public a() {
        }

        public final void a(byte b) {
            int i = cu.this.c;
            cu.this.c++;
            int i2 = cu.this.f9894a;
            if (i < 0 || i2 < i) {
                throw new IllegalArgumentException(("Index " + i + " should be between 0 and " + cu.this.f9894a).toString());
            }
            int i3 = ((cu.this.d - 1) * cu.this.f9894a) + i;
            byte[] bArr = cu.this.b;
            Intrinsics.checkNotNull(bArr);
            bArr[i3] = b;
        }

        public final void a(long j) {
            if (cu.this.e) {
                b(j);
            } else {
                a((int) j);
            }
        }

        public final void a(int i) {
            int i2 = cu.this.c;
            cu.this.c += 4;
            if (i2 < 0 || i2 > cu.this.f9894a - 4) {
                throw new IllegalArgumentException(("Index " + i2 + " should be between 0 and " + (cu.this.f9894a - 4)).toString());
            }
            int i3 = ((cu.this.d - 1) * cu.this.f9894a) + i2;
            byte[] bArr = cu.this.b;
            Intrinsics.checkNotNull(bArr);
            bArr[i3] = (byte) ((i >>> 24) & 255);
            bArr[i3 + 1] = (byte) ((i >>> 16) & 255);
            bArr[i3 + 2] = (byte) ((i >>> 8) & 255);
            bArr[i3 + 3] = (byte) (i & 255);
        }

        public final void a(long j, int i) {
            int i2 = cu.this.c;
            cu.this.c += i;
            if (i2 < 0 || i2 > cu.this.f9894a - i) {
                throw new IllegalArgumentException(("Index " + i2 + " should be between 0 and " + (cu.this.f9894a - i)).toString());
            }
            int i3 = ((cu.this.d - 1) * cu.this.f9894a) + i2;
            byte[] bArr = cu.this.b;
            Intrinsics.checkNotNull(bArr);
            int i4 = (i - 1) * 8;
            while (i4 >= 8) {
                bArr[i3] = (byte) (255 & (j >>> i4));
                i4 -= 8;
                i3++;
            }
            bArr[i3] = (byte) (j & 255);
        }

        public final void b(long j) {
            int i = cu.this.c;
            cu.this.c += 8;
            if (i < 0 || i > cu.this.f9894a - 8) {
                throw new IllegalArgumentException(("Index " + i + " should be between 0 and " + (cu.this.f9894a - 8)).toString());
            }
            int i2 = ((cu.this.d - 1) * cu.this.f9894a) + i;
            byte[] bArr = cu.this.b;
            Intrinsics.checkNotNull(bArr);
            bArr[i2] = (byte) ((j >>> 56) & 255);
            bArr[i2 + 1] = (byte) ((j >>> 48) & 255);
            bArr[i2 + 2] = (byte) ((j >>> 40) & 255);
            bArr[i2 + 3] = (byte) ((j >>> 32) & 255);
            bArr[i2 + 4] = (byte) ((j >>> 24) & 255);
            bArr[i2 + 5] = (byte) ((j >>> 16) & 255);
            bArr[i2 + 6] = (byte) ((j >>> 8) & 255);
            bArr[i2 + 7] = (byte) (j & 255);
        }
    }
}
