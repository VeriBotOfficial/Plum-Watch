package com.mbridge.msdk.playercommon.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioAttributes {
    public static final AudioAttributes DEFAULT = new Builder().build();
    private android.media.AudioAttributes audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int usage;

    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage);
        }

        public Builder setContentType(int r1) {
            this.contentType = r1;
            return this;
        }

        public Builder setFlags(int r1) {
            this.flags = r1;
            return this;
        }

        public Builder setUsage(int r1) {
            this.usage = r1;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage;
    }

    android.media.AudioAttributes getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            this.audioAttributesV21 = new android.media.AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage).build();
        }
        return this.audioAttributesV21;
    }

    public int hashCode() {
        return ((((this.contentType + 527) * 31) + this.flags) * 31) + this.usage;
    }

    private AudioAttributes(int r1, int r2, int r3) {
        this.contentType = r1;
        this.flags = r2;
        this.usage = r3;
    }
}
