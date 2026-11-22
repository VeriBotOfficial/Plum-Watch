package io.agora.rtc2;

/* loaded from: classes6.dex */
public enum DirectCdnStreamingReason {
    OK(0),
    FAILED(1),
    AUDIO_PUBLICATION(2),
    VIDEO_PUBLICATION(3),
    NET_CONNECT(4),
    BAD_NAME(5);

    private int value;

    DirectCdnStreamingReason(int v) {
        this.value = v;
    }

    public static DirectCdnStreamingReason fromInt(int v) {
        for (DirectCdnStreamingReason directCdnStreamingReason : values()) {
            if (directCdnStreamingReason.getValue() == v) {
                return directCdnStreamingReason;
            }
        }
        return FAILED;
    }

    public int getValue() {
        return this.value;
    }
}
