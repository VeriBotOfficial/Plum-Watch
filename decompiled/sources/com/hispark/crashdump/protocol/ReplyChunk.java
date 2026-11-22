package com.hispark.crashdump.protocol;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/hispark/crashdump/protocol/ReplyChunk;", "", "transmitId", "", "offset", "size", "data", "", "<init>", "(III[B)V", "getTransmitId", "()I", "getOffset", "getSize", "getData", "()[B", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReplyChunk {
    private final byte[] data;
    private final int offset;
    private final int size;
    private final int transmitId;

    public static /* synthetic */ ReplyChunk copy$default(ReplyChunk replyChunk, int i, int i2, int i3, byte[] bArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = replyChunk.transmitId;
        }
        if ((i4 & 2) != 0) {
            i2 = replyChunk.offset;
        }
        if ((i4 & 4) != 0) {
            i3 = replyChunk.size;
        }
        if ((i4 & 8) != 0) {
            bArr = replyChunk.data;
        }
        return replyChunk.copy(i, i2, i3, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTransmitId() {
        return this.transmitId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final ReplyChunk copy(int transmitId, int offset, int size, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ReplyChunk(transmitId, offset, size, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyChunk)) {
            return false;
        }
        ReplyChunk replyChunk = (ReplyChunk) other;
        return this.transmitId == replyChunk.transmitId && this.offset == replyChunk.offset && this.size == replyChunk.size && Intrinsics.areEqual(this.data, replyChunk.data);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.transmitId) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.size)) * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        return "ReplyChunk(transmitId=" + this.transmitId + ", offset=" + this.offset + ", size=" + this.size + ", data=" + Arrays.toString(this.data) + ')';
    }

    public ReplyChunk(int i, int i2, int i3, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.transmitId = i;
        this.offset = i2;
        this.size = i3;
        this.data = data;
    }

    public final int getTransmitId() {
        return this.transmitId;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final byte[] getData() {
        return this.data;
    }
}
