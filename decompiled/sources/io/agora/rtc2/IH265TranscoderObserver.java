package io.agora.rtc2;

/* loaded from: classes6.dex */
public interface IH265TranscoderObserver {

    public enum H265TranscodeResult {
        UNKNOWN(-1),
        SUCCESS(0),
        REQUEST_INVALID(1),
        UNAUTHORIZED(2),
        TOKEN_EXPIRED(3),
        FORBIDDEN(4),
        NOT_FOUND(5),
        CONFLICTED(6),
        NOT_SUPPORTED(7),
        TOO_OFTEN(8),
        SERVER_INTERNAL_ERROR(9),
        SERVICE_UNAVAILABLE(10);

        private int value;

        H265TranscodeResult(int v) {
            this.value = v;
        }

        public static H265TranscodeResult fromInt(int v) {
            for (H265TranscodeResult h265TranscodeResult : values()) {
                if (h265TranscodeResult.getValue() == v) {
                    return h265TranscodeResult;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }
    }

    void onEnableTranscode(int result);

    void onQueryChannel(int result, String originChannel, String transcodeChannel);

    void onTriggerTranscode(int result);
}
