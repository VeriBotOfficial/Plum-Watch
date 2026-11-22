package com.efs.sdk.memleaksdk.monitor.shark;

import com.autonavi.aps.amapapi.config.Const;
import com.efs.sdk.memleaksdk.monitor.shark.HprofRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\tJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0015\u0010\u0014\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0082\fJ\u0015\u0010\u0014\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0082\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/FieldIdReader;", "", "record", "Lcom/efs/sdk/memleaksdk/monitor/shark/HprofRecord$HeapDumpRecord$ObjectRecord$InstanceDumpRecord;", "identifierByteSize", "", "(Lcom/efs/sdk/memleaksdk/monitor/shark/HprofRecord$HeapDumpRecord$ObjectRecord$InstanceDumpRecord;I)V", "position", "readByteId", "", "index", "array", "", "readId", "readIntId", "readLongId", "readShortId", "skipBytes", "", Const.SP_KEY_CALL_LOC_COUNT, "and", "", "other", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final class ch {

    /* renamed from: a, reason: collision with root package name */
    private int f9862a;
    private final HprofRecord.a.AbstractC0559a.b b;
    private final int c;

    public ch(HprofRecord.a.AbstractC0559a.b record, int i) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.b = record;
        this.c = i;
    }

    public final long a() {
        long j;
        int i = this.c;
        if (i == 1) {
            j = this.b.f9812a[this.f9862a];
        } else if (i == 2) {
            j = a(this.f9862a, this.b.f9812a);
        } else if (i == 4) {
            j = b(this.f9862a, this.b.f9812a);
        } else if (i == 8) {
            j = c(this.f9862a, this.b.f9812a);
        } else {
            throw new IllegalStateException("ID Length must be 1, 2, 4, or 8".toString());
        }
        this.f9862a += this.c;
        return j;
    }

    public final void a(int i) {
        this.f9862a += i;
    }

    private final long a(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 8) | (bArr[i + 1] & 255);
    }

    private final long b(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    private final long c(int i, byte[] bArr) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }
}
