package com.efs.sdk.memleaksdk.monitor.shark;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0082\f\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\f\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\u000b"}, d2 = {"and", "", "", "other", "", "readInt", "", "index", "readLong", "readShort", "", "memleaksdk_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final class ce {
    public static final short a(byte[] readShort, int i) {
        Intrinsics.checkNotNullParameter(readShort, "$this$readShort");
        int i2 = i + 1;
        return (short) ((readShort[i2] & 255) | ((readShort[i] & 255) << 8));
    }

    public static final int b(byte[] readInt, int i) {
        Intrinsics.checkNotNullParameter(readInt, "$this$readInt");
        int i2 = ((readInt[i + 1] & 255) << 16) | ((readInt[i] & 255) << 24);
        return (readInt[i + 3] & 255) | i2 | ((readInt[i + 2] & 255) << 8);
    }

    public static final long c(byte[] readLong, int i) {
        Intrinsics.checkNotNullParameter(readLong, "$this$readLong");
        return (readLong[i + 7] & 255) | ((readLong[i] & 255) << 56) | ((readLong[i + 1] & 255) << 48) | ((readLong[i + 2] & 255) << 40) | ((readLong[i + 3] & 255) << 32) | ((readLong[i + 4] & 255) << 24) | ((readLong[i + 5] & 255) << 16) | ((readLong[i + 6] & 255) << 8);
    }
}
