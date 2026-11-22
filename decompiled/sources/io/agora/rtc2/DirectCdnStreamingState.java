package io.agora.rtc2;

/* loaded from: classes6.dex */
public enum DirectCdnStreamingState {
    IDLE(0),
    RUNNING(1),
    STOPPED(2),
    FAILED(3),
    RECOVERING(4);

    private int value;

    DirectCdnStreamingState(int v) {
        this.value = v;
    }

    public static DirectCdnStreamingState fromInt(int v) {
        for (DirectCdnStreamingState directCdnStreamingState : values()) {
            if (directCdnStreamingState.getValue() == v) {
                return directCdnStreamingState;
            }
        }
        return FAILED;
    }

    public int getValue() {
        return this.value;
    }
}
