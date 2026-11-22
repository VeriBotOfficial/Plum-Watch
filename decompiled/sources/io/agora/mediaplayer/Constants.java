package io.agora.mediaplayer;

/* loaded from: classes6.dex */
public class Constants {
    public static final int PLAYER_REASON_NOT_INIT = -1;
    public static final int PLAYER_RENDER_MODE_ADAPTIVE = 3;
    public static final int PLAYER_RENDER_MODE_FIT = 2;
    public static final int PLAYER_RENDER_MODE_HIDDEN = 1;

    public enum AudioDualMonoMode {
        AUDIO_DUAL_MONO_STEREO(0),
        AUDIO_DUAL_MONO_L(1),
        AUDIO_DUAL_MONO_R(2),
        AUDIO_DUAL_MONO_MIX(3);

        private int value;

        AudioDualMonoMode(int v) {
            this.value = v;
        }

        public static int getValue(AudioDualMonoMode mode) {
            return mode.value;
        }
    }

    public enum MediaPlayerEvent {
        PLAYER_EVENT_UNKNOWN(-1),
        PLAYER_EVENT_SEEK_BEGIN(0),
        PLAYER_EVENT_SEEK_COMPLETE(1),
        PLAYER_EVENT_SEEK_ERROR(2),
        PLAYER_EVENT_AUDIO_TRACK_CHANGED(5),
        PLAYER_EVENT_BUFFER_LOW(6),
        PLAYER_EVENT_BUFFER_RECOVER(7),
        PLAYER_EVENT_FREEZE_START(8),
        PLAYER_EVENT_FREEZE_STOP(9),
        PLAYER_EVENT_SWITCH_BEGIN(10),
        PLAYER_EVENT_SWITCH_COMPLETE(11),
        PLAYER_EVENT_SWITCH_ERROR(12),
        PLAYER_EVENT_FIRST_DISPLAYED(13),
        PLAYER_EVENT_REACH_CACHE_FILE_MAX_COUNT(14),
        PLAYER_EVENT_REACH_CACHE_FILE_MAX_SIZE(15),
        PLAYER_EVENT_TRY_OPEN_START(16),
        PLAYER_EVENT_TRY_OPEN_SUCCEED(17),
        PLAYER_EVENT_TRY_OPEN_FAILED(18);

        private int value;

        MediaPlayerEvent(int v) {
            this.value = v;
        }

        public static MediaPlayerEvent fromNativeIndex(int nativeIndex) {
            return getEventByValue(nativeIndex);
        }

        public static MediaPlayerEvent getEventByValue(int value) {
            for (MediaPlayerEvent mediaPlayerEvent : values()) {
                if (mediaPlayerEvent.value == value) {
                    return mediaPlayerEvent;
                }
            }
            return PLAYER_EVENT_UNKNOWN;
        }

        public static int getValue(MediaPlayerEvent type) {
            return type.value;
        }
    }

    public enum MediaPlayerMetadataType {
        PLAYER_METADATA_TYPE_UNKNOWN(0),
        PLAYER_METADATA_TYPE_SEI(1);

        private int value;

        MediaPlayerMetadataType(int v) {
            this.value = v;
        }

        public static MediaPlayerMetadataType fromNativeIndex(int nativeIndex) {
            return getTypeByValue(nativeIndex);
        }

        public static MediaPlayerMetadataType getTypeByValue(int value) {
            for (MediaPlayerMetadataType mediaPlayerMetadataType : values()) {
                if (mediaPlayerMetadataType.value == value) {
                    return mediaPlayerMetadataType;
                }
            }
            return PLAYER_METADATA_TYPE_UNKNOWN;
        }

        public static int getValue(MediaPlayerMetadataType type) {
            return type.value;
        }
    }

    public enum MediaPlayerPreloadEvent {
        PLAYER_PRELOAD_EVENT_BEGIN(0),
        PLAYER_PRELOAD_EVENT_COMPLETE(1),
        PLAYER_PRELOAD_EVENT_ERROR(2);

        private int value;

        MediaPlayerPreloadEvent(int v) {
            this.value = v;
        }

        public static MediaPlayerPreloadEvent fromNativeIndex(int nativeIndex) {
            return getTypeByValue(nativeIndex);
        }

        public static MediaPlayerPreloadEvent getTypeByValue(int value) {
            for (MediaPlayerPreloadEvent mediaPlayerPreloadEvent : values()) {
                if (mediaPlayerPreloadEvent.value == value) {
                    return mediaPlayerPreloadEvent;
                }
            }
            return PLAYER_PRELOAD_EVENT_ERROR;
        }

        public static int getValue(MediaPlayerPreloadEvent type) {
            return type.value;
        }
    }

    public enum MediaPlayerReason {
        PLAYER_REASON_NONE(0),
        PLAYER_REASON_INVALID_ARGUMENTS(-1),
        PLAYER_REASON_INTERNAL(-2),
        PLAYER_REASON_NO_RESOURCE(-3),
        PLAYER_REASON_INVALID_MEDIA_SOURCE(-4),
        PLAYER_REASON_UNKNOWN_STREAM_TYPE(-5),
        PLAYER_REASON_OBJ_NOT_INITIALIZED(-6),
        PLAYER_REASON_CODEC_NOT_SUPPORTED(-7),
        PLAYER_REASON_VIDEO_RENDER_FAILED(-8),
        PLAYER_REASON_INVALID_STATE(-9),
        PLAYER_REASON_URL_NOT_FOUND(-10),
        PLAYER_REASON_INVALID_CONNECTION_STATE(-11),
        PLAY_REASON_SRC_BUFFER_UNDERFLOW(-12),
        PLAYER_REASON_INTERRUPTED(-13),
        PLAYER_REASON_NOT_SUPPORTED(-14),
        PLAYER_REASON_TOKEN_EXPIRED(-15),
        PLAYER_REASON_IP_EXPIRED(-16),
        PLAYER_REASON_UNKNOWN(-17);

        private int value;

        MediaPlayerReason(int v) {
            this.value = v;
        }

        public static MediaPlayerReason fromNativeIndex(int nativeIndex) {
            return getErrorByValue(nativeIndex);
        }

        public static MediaPlayerReason getErrorByValue(int value) {
            for (MediaPlayerReason mediaPlayerReason : values()) {
                if (mediaPlayerReason.value == value) {
                    return mediaPlayerReason;
                }
            }
            return PLAYER_REASON_UNKNOWN;
        }

        public static int getValue(MediaPlayerReason type) {
            return type.value;
        }
    }

    public enum MediaPlayerState {
        PLAYER_STATE_UNKNOWN(-1),
        PLAYER_STATE_IDLE(0),
        PLAYER_STATE_OPENING(1),
        PLAYER_STATE_OPEN_COMPLETED(2),
        PLAYER_STATE_PLAYING(3),
        PLAYER_STATE_PAUSED(4),
        PLAYER_STATE_PLAYBACK_COMPLETED(5),
        PLAYER_STATE_PLAYBACK_ALL_LOOPS_COMPLETED(6),
        PLAYER_STATE_STOPPED(7),
        PLAYER_STATE_PAUSING_INTERNAL(50),
        PLAYER_STATE_STOPPING_INTERNAL(51),
        PLAYER_STATE_SEEKING_INTERNAL(52),
        PLAYER_STATE_GETTING_INTERNAL(53),
        PLAYER_STATE_NONE_INTERNAL(54),
        PLAYER_STATE_DO_NOTHING_INTERNAL(55),
        PLAYER_STATE_SET_TRACK_INTERNAL(56),
        PLAYER_STATE_FAILED(100);

        private int value;

        MediaPlayerState(int v) {
            this.value = v;
        }

        public static MediaPlayerState fromNativeIndex(int nativeIndex) {
            return getStateByValue(nativeIndex);
        }

        public static MediaPlayerState getStateByValue(int value) {
            for (MediaPlayerState mediaPlayerState : values()) {
                if (mediaPlayerState.value == value) {
                    return mediaPlayerState;
                }
            }
            return PLAYER_STATE_UNKNOWN;
        }

        public static int getValue(MediaPlayerState type) {
            return type.value;
        }
    }

    public enum MediaStreamType {
        STREAM_TYPE_UNKNOWN(0),
        STREAM_TYPE_VIDEO(1),
        STREAM_TYPE_AUDIO(2),
        STREAM_TYPE_SUBTITLE(3);

        private int value;

        MediaStreamType(int v) {
            this.value = v;
        }

        public static int getValue(MediaStreamType type) {
            return type.value;
        }
    }
}
