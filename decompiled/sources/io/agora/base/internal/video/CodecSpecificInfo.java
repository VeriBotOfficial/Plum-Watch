package io.agora.base.internal.video;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class CodecSpecificInfo {
    private ByteBuffer compressed_alpha_buffer;
    public long elapsedRealtime;
    private final ByteBuffer metadata;
    public long opaque;

    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public CodecSpecificInfo() {
        this(null, null, 0L);
    }

    public VideoCodecType getVideoCodecType() {
        return VideoCodecType.UNKNOWN;
    }

    public VideoCodecProfile getVideoCodecProfile() {
        return VideoCodecProfile.UNKNOWN;
    }

    public CodecSpecificInfo(long j) {
        this.metadata = null;
        this.compressed_alpha_buffer = null;
        this.opaque = j;
    }

    public CodecSpecificInfo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j) {
        this.metadata = byteBuffer;
        this.compressed_alpha_buffer = byteBuffer2;
        this.opaque = j;
    }

    public CodecSpecificInfo(ByteBuffer byteBuffer, long j) {
        this.metadata = byteBuffer;
        this.elapsedRealtime = j;
        this.opaque = 0L;
    }

    public ByteBuffer getMetadata() {
        return this.metadata;
    }

    public long getOpaque() {
        return this.opaque;
    }

    public ByteBuffer getCompressedAlphadata() {
        return this.compressed_alpha_buffer;
    }

    public class CodecSpecificInfoHEVC extends CodecSpecificInfo {
        private VideoCodecProfile profile;

        public CodecSpecificInfoHEVC(VideoCodecProfile videoCodecProfile) {
            this.profile = videoCodecProfile;
        }

        @Override // io.agora.base.internal.video.CodecSpecificInfo
        public VideoCodecType getVideoCodecType() {
            return VideoCodecType.H265;
        }

        @Override // io.agora.base.internal.video.CodecSpecificInfo
        public VideoCodecProfile getVideoCodecProfile() {
            return this.profile;
        }
    }
}
