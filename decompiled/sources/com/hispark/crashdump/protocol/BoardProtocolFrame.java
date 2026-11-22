package com.hispark.crashdump.protocol;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/hispark/crashdump/protocol/BoardProtocolFrame;", "", "mid", "", "cid", "type", "payload", "", "<init>", "(BBB[B)V", "getMid", "()B", "getCid", "getType", "getPayload", "()[B", "mcid", "", "getMcid", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoardProtocolFrame {
    private final byte cid;
    private final String mcid;
    private final byte mid;
    private final byte[] payload;
    private final byte type;

    public static /* synthetic */ BoardProtocolFrame copy$default(BoardProtocolFrame boardProtocolFrame, byte b, byte b2, byte b3, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            b = boardProtocolFrame.mid;
        }
        if ((i & 2) != 0) {
            b2 = boardProtocolFrame.cid;
        }
        if ((i & 4) != 0) {
            b3 = boardProtocolFrame.type;
        }
        if ((i & 8) != 0) {
            bArr = boardProtocolFrame.payload;
        }
        return boardProtocolFrame.copy(b, b2, b3, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final byte getMid() {
        return this.mid;
    }

    /* renamed from: component2, reason: from getter */
    public final byte getCid() {
        return this.cid;
    }

    /* renamed from: component3, reason: from getter */
    public final byte getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final byte[] getPayload() {
        return this.payload;
    }

    public final BoardProtocolFrame copy(byte mid, byte cid, byte type, byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new BoardProtocolFrame(mid, cid, type, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardProtocolFrame)) {
            return false;
        }
        BoardProtocolFrame boardProtocolFrame = (BoardProtocolFrame) other;
        return this.mid == boardProtocolFrame.mid && this.cid == boardProtocolFrame.cid && this.type == boardProtocolFrame.type && Intrinsics.areEqual(this.payload, boardProtocolFrame.payload);
    }

    public int hashCode() {
        return (((((Byte.hashCode(this.mid) * 31) + Byte.hashCode(this.cid)) * 31) + Byte.hashCode(this.type)) * 31) + Arrays.hashCode(this.payload);
    }

    public String toString() {
        return "BoardProtocolFrame(mid=" + ((int) this.mid) + ", cid=" + ((int) this.cid) + ", type=" + ((int) this.type) + ", payload=" + Arrays.toString(this.payload) + ')';
    }

    public BoardProtocolFrame(byte b, byte b2, byte b3, byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.mid = b;
        this.cid = b2;
        this.type = b3;
        this.payload = payload;
        this.mcid = ProtocolBytes.INSTANCE.byteToHexString(b) + ProtocolBytes.INSTANCE.byteToHexString(b2);
    }

    public final byte getMid() {
        return this.mid;
    }

    public final byte getCid() {
        return this.cid;
    }

    public final byte getType() {
        return this.type;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final String getMcid() {
        return this.mcid;
    }
}
