package com.wakeup.module.ai.utils;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadSingleLaneInputAudioFrameCodec.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0013J \u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\b¨\u0006!"}, d2 = {"Lcom/wakeup/module/ai/utils/VadSingleLaneInputAudioFrameCodec;", "Lcom/wakeup/module/ai/utils/VadInputAudioFrameCodec;", "<init>", "()V", "PROTOCOL", "", "protocol", "getProtocol", "()I", "TYPE_AUDIO", "TYPE_SILENCE", "TYPE_START", "TYPE_END", "TYPE_LENGTH", "TIMESTAMP_LENGTH", "STREAM_ID_LENGTH", "FULL_HEADER_LENGTH", "getFULL_HEADER_LENGTH", "encode", "", "type", "timestamp", "", "streamId", "", "payload", "encodeControl", "timestampMs", "encodeAudio", "decode", "Lcom/wakeup/module/ai/utils/VadSingleLaneInputAudioFrameCodec$DecodedFrame;", "frame", "DecodedFrame", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VadSingleLaneInputAudioFrameCodec implements VadInputAudioFrameCodec {
    public static final int PROTOCOL = 6;
    public static final int STREAM_ID_LENGTH = 2;
    public static final int TIMESTAMP_LENGTH = 8;
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_END = 4;
    public static final int TYPE_LENGTH = 1;
    public static final int TYPE_SILENCE = 2;
    public static final int TYPE_START = 3;
    public static final VadSingleLaneInputAudioFrameCodec INSTANCE = new VadSingleLaneInputAudioFrameCodec();
    private static final int FULL_HEADER_LENGTH = 11;

    @Override // com.wakeup.module.ai.utils.VadInputAudioFrameCodec
    public int getProtocol() {
        return 6;
    }

    private VadSingleLaneInputAudioFrameCodec() {
    }

    public final int getFULL_HEADER_LENGTH() {
        return FULL_HEADER_LENGTH;
    }

    /* compiled from: VadSingleLaneInputAudioFrameCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/wakeup/module/ai/utils/VadSingleLaneInputAudioFrameCodec$DecodedFrame;", "", "type", "", "timestamp", "", "streamId", "", "payload", "", "<init>", "(IJS[B)V", "getType", "()I", "getTimestamp", "()J", "getStreamId", "()S", "getPayload", "()[B", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DecodedFrame {
        private final byte[] payload;
        private final short streamId;
        private final long timestamp;
        private final int type;

        public static /* synthetic */ DecodedFrame copy$default(DecodedFrame decodedFrame, int i, long j, short s, byte[] bArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = decodedFrame.type;
            }
            if ((i2 & 2) != 0) {
                j = decodedFrame.timestamp;
            }
            if ((i2 & 4) != 0) {
                s = decodedFrame.streamId;
            }
            if ((i2 & 8) != 0) {
                bArr = decodedFrame.payload;
            }
            return decodedFrame.copy(i, j, s, bArr);
        }

        /* renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final short getStreamId() {
            return this.streamId;
        }

        /* renamed from: component4, reason: from getter */
        public final byte[] getPayload() {
            return this.payload;
        }

        public final DecodedFrame copy(int type, long timestamp, short streamId, byte[] payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new DecodedFrame(type, timestamp, streamId, payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DecodedFrame)) {
                return false;
            }
            DecodedFrame decodedFrame = (DecodedFrame) other;
            return this.type == decodedFrame.type && this.timestamp == decodedFrame.timestamp && this.streamId == decodedFrame.streamId && Intrinsics.areEqual(this.payload, decodedFrame.payload);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.type) * 31) + Long.hashCode(this.timestamp)) * 31) + Short.hashCode(this.streamId)) * 31) + Arrays.hashCode(this.payload);
        }

        public String toString() {
            return "DecodedFrame(type=" + this.type + ", timestamp=" + this.timestamp + ", streamId=" + ((int) this.streamId) + ", payload=" + Arrays.toString(this.payload) + Separators.RPAREN;
        }

        public DecodedFrame(int i, long j, short s, byte[] payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.type = i;
            this.timestamp = j;
            this.streamId = s;
            this.payload = payload;
        }

        public final int getType() {
            return this.type;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final short getStreamId() {
            return this.streamId;
        }

        public final byte[] getPayload() {
            return this.payload;
        }
    }

    public static /* synthetic */ byte[] encode$default(VadSingleLaneInputAudioFrameCodec vadSingleLaneInputAudioFrameCodec, int i, long j, short s, byte[] bArr, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            bArr = new byte[0];
        }
        return vadSingleLaneInputAudioFrameCodec.encode(i, j, s, bArr);
    }

    public final byte[] encode(int type, long timestamp, short streamId, byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (1 > type || type >= 5) {
            throw new IllegalArgumentException(("Unsupported VAD input frame type: " + type).toString());
        }
        ByteBuffer allocate = ByteBuffer.allocate(FULL_HEADER_LENGTH + payload.length);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put((byte) type);
        allocate.putLong(timestamp);
        allocate.putShort(streamId);
        if (!(payload.length == 0)) {
            allocate.put(payload);
        }
        byte[] array = allocate.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    @Override // com.wakeup.module.ai.utils.VadInputAudioFrameCodec
    public byte[] encodeControl(int type, long timestampMs, short streamId) {
        return encode$default(this, type, timestampMs, streamId, null, 8, null);
    }

    @Override // com.wakeup.module.ai.utils.VadInputAudioFrameCodec
    public byte[] encodeAudio(long timestampMs, short streamId, byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return encode(1, timestampMs, streamId, payload);
    }

    public final DecodedFrame decode(byte[] frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (frame.length < FULL_HEADER_LENGTH) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(frame).order(ByteOrder.BIG_ENDIAN);
        int i = order.get() & 255;
        long j = order.getLong();
        short s = order.getShort();
        int remaining = order.remaining();
        byte[] bArr = new byte[remaining];
        if (!(remaining == 0)) {
            order.get(bArr);
        }
        return new DecodedFrame(i, j, s, bArr);
    }
}
