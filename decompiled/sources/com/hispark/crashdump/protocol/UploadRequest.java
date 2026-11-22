package com.hispark.crashdump.protocol;

import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;

/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/hispark/crashdump/protocol/UploadRequest;", "", "transmitId", "", Const.SP_KEY_CALL_LOC_COUNT, "offset", "size", "<init>", "(IIII)V", "getTransmitId", "()I", "getCount", "getOffset", "getSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UploadRequest {
    private final int count;
    private final int offset;
    private final int size;
    private final int transmitId;

    public static /* synthetic */ UploadRequest copy$default(UploadRequest uploadRequest, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = uploadRequest.transmitId;
        }
        if ((i5 & 2) != 0) {
            i2 = uploadRequest.count;
        }
        if ((i5 & 4) != 0) {
            i3 = uploadRequest.offset;
        }
        if ((i5 & 8) != 0) {
            i4 = uploadRequest.size;
        }
        return uploadRequest.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTransmitId() {
        return this.transmitId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final UploadRequest copy(int transmitId, int count, int offset, int size) {
        return new UploadRequest(transmitId, count, offset, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadRequest)) {
            return false;
        }
        UploadRequest uploadRequest = (UploadRequest) other;
        return this.transmitId == uploadRequest.transmitId && this.count == uploadRequest.count && this.offset == uploadRequest.offset && this.size == uploadRequest.size;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.transmitId) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.size);
    }

    public String toString() {
        return "UploadRequest(transmitId=" + this.transmitId + ", count=" + this.count + ", offset=" + this.offset + ", size=" + this.size + ')';
    }

    public UploadRequest(int i, int i2, int i3, int i4) {
        this.transmitId = i;
        this.count = i2;
        this.offset = i3;
        this.size = i4;
    }

    public final int getTransmitId() {
        return this.transmitId;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }
}
