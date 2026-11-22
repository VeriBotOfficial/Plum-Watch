package com.efs.sdk.memleaksdk.monitor.shark;

import com.anythink.expressad.f.a.b;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0011\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0011\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0006\u0010!\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/hppc/LongScatterSet;", "", "expectedElements", "", "(I)V", "assigned", "hasEmptyKey", "", "keys", "", "loadFactor", "", "mask", "resizeAt", b.ay, "key", "", "allocateBuffers", "", "arraySize", "allocateThenInsertThenRehash", "slot", "pendingKey", "contains", "ensureCapacity", "hashKey", "plusAssign", "rehash", "fromKeys", "release", "remove", "shiftConflictingKeys", "inputGapSlot", "size", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private long[] f9908a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private final double f;

    public dd() {
        this(0, 1);
    }

    public dd(int i) {
        this.f9908a = new long[0];
        this.f = 0.75d;
        a(i);
    }

    public /* synthetic */ dd(int i, int i2) {
        this((i2 & 1) != 0 ? 4 : i);
    }

    public final boolean a(long j) {
        if (j == 0) {
            boolean z = !this.e;
            this.e = true;
            return z;
        }
        long[] jArr = this.f9908a;
        int i = this.c;
        int a2 = cx.f9898a.a(j) & i;
        long j2 = jArr[a2];
        while (j2 != 0) {
            if (j2 == j) {
                return false;
            }
            a2 = (a2 + 1) & i;
            j2 = jArr[a2];
        }
        if (this.b == this.d) {
            a(a2, j);
        } else {
            jArr[a2] = j;
        }
        this.b++;
        return true;
    }

    public final boolean b(long j) {
        if (j == 0) {
            return this.e;
        }
        long[] jArr = this.f9908a;
        int i = this.c;
        int a2 = cx.f9898a.a(j) & i;
        long j2 = jArr[a2];
        while (j2 != 0) {
            if (j2 == j) {
                return true;
            }
            a2 = (a2 + 1) & i;
            j2 = jArr[a2];
        }
        return false;
    }

    public final boolean c(long j) {
        if (j == 0) {
            boolean z = this.e;
            this.e = false;
            return z;
        }
        long[] jArr = this.f9908a;
        int i = this.c;
        int a2 = cx.f9898a.a(j) & i;
        long j2 = jArr[a2];
        while (j2 != 0) {
            if (j2 == j) {
                b(a2);
                return true;
            }
            a2 = (a2 + 1) & i;
            j2 = jArr[a2];
        }
        return false;
    }

    private final void b(int i) {
        long[] jArr = this.f9908a;
        int i2 = this.c;
        int i3 = 0;
        while (true) {
            i3++;
            int i4 = (i + i3) & i2;
            long j = jArr[i4];
            if (j == 0) {
                jArr[i] = 0;
                this.b--;
                return;
            } else if (((i4 - cx.f9898a.a(j)) & i2) >= i3) {
                jArr[i] = j;
                i3 = 0;
                i = i4;
            }
        }
    }

    public final void a(int i) {
        if (i > this.d) {
            long[] jArr = this.f9908a;
            c(cx.f9898a.a(i, this.f));
            if (a() != 0) {
                a(jArr);
            }
        }
    }

    public final int a() {
        return this.b + (this.e ? 1 : 0);
    }

    private final void a(long[] jArr) {
        int i;
        long[] jArr2 = this.f9908a;
        int i2 = this.c;
        int length = jArr.length - 1;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j = jArr[length];
            if (j != 0) {
                int a2 = cx.f9898a.a(j);
                while (true) {
                    i = a2 & i2;
                    if (jArr2[i] == 0) {
                        break;
                    } else {
                        a2 = i + 1;
                    }
                }
                jArr2[i] = j;
            }
        }
    }

    private final void c(int i) {
        long[] jArr = this.f9908a;
        try {
            this.f9908a = new long[i + 1];
            this.d = cx.f9898a.b(i, this.f);
            this.c = i - 1;
        } catch (OutOfMemoryError e) {
            this.f9908a = jArr;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "Not enough memory to allocate buffers for rehashing: %,d -> %,d", Arrays.copyOf(new Object[]{Integer.valueOf(a()), Integer.valueOf(i)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new RuntimeException(format, e);
        }
    }

    private final void a(int i, long j) {
        long[] jArr = this.f9908a;
        c(cx.f9898a.a(this.c + 1, a(), this.f));
        jArr[i] = j;
        a(jArr);
    }
}
