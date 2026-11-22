package com.yandex.mobile.ads.instream.player.ad.error;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/mobile/ads/instream/player/ad/error/InstreamAdPlayerError;", "", "Lcom/yandex/mobile/ads/instream/player/ad/error/InstreamAdPlayerError$Reason;", "a", "Lcom/yandex/mobile/ads/instream/player/ad/error/InstreamAdPlayerError$Reason;", "getReason", "()Lcom/yandex/mobile/ads/instream/player/ad/error/InstreamAdPlayerError$Reason;", "reason", "", "b", "Ljava/lang/Throwable;", "getUnderlyingError", "()Ljava/lang/Throwable;", "underlyingError", "<init>", "(Lcom/yandex/mobile/ads/instream/player/ad/error/InstreamAdPlayerError$Reason;Ljava/lang/Throwable;)V", "Reason", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InstreamAdPlayerError {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Reason reason;

    /* renamed from: b, reason: from kotlin metadata */
    private final Throwable underlyingError;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/mobile/ads/instream/player/ad/error/InstreamAdPlayerError$Reason;", "", "RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER", "RENDERER_FAILED_DEQUEUE_INPUT_BUFFER", "RENDERER_FAILED_STOP", "RENDERER_FAILED_SET_SURFACE", "RENDERER_FAILED_RELEASE_OUTPUT_BUFFER", "RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER", "RENDERER_MEDIA_CODEC_UNKNOWN", "TIMEOUT", "ILLEGAL_SEEK_POSITION", "DECODER_QUERY_ERROR", "DECODER_INITIALIZATION_ERROR", "DECODER_UNKNOWN_ERROR", "BEHIND_LIVE_WINDOW_ERROR", "DRM_KEYS_EXPIRED", "DRM_MEDIA_RESOURCE_BUSY", "DRM_SESSION_ERROR", "HTTP_CLEARTEXT_NOT_PERMITTED", "HTTP_CODE_UNAUTHORIZED", "HTTP_CODE_FORBIDDEN", "HTTP_CODE_NOT_FOUND", "HTTP_CODE_UNKNOWN", "SSL_HANDSHAKE_ERROR", "NETWORK_UNAVAILABLE", "CONTENT_PARSER_ERROR", "LOADER_UNEXPECTED_ERROR", "AUDIO_ERROR", "SUBTITLE_ERROR", "CACHE_ERROR", "UNKNOWN", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Reason {
        public static final Reason AUDIO_ERROR;
        public static final Reason BEHIND_LIVE_WINDOW_ERROR;
        public static final Reason CACHE_ERROR;
        public static final Reason CONTENT_PARSER_ERROR;
        public static final Reason DECODER_INITIALIZATION_ERROR;
        public static final Reason DECODER_QUERY_ERROR;
        public static final Reason DECODER_UNKNOWN_ERROR;
        public static final Reason DRM_KEYS_EXPIRED;
        public static final Reason DRM_MEDIA_RESOURCE_BUSY;
        public static final Reason DRM_SESSION_ERROR;
        public static final Reason HTTP_CLEARTEXT_NOT_PERMITTED;
        public static final Reason HTTP_CODE_FORBIDDEN;
        public static final Reason HTTP_CODE_NOT_FOUND;
        public static final Reason HTTP_CODE_UNAUTHORIZED;
        public static final Reason HTTP_CODE_UNKNOWN;
        public static final Reason ILLEGAL_SEEK_POSITION;
        public static final Reason LOADER_UNEXPECTED_ERROR;
        public static final Reason NETWORK_UNAVAILABLE;
        public static final Reason RENDERER_FAILED_DEQUEUE_INPUT_BUFFER;
        public static final Reason RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER;
        public static final Reason RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER;
        public static final Reason RENDERER_FAILED_RELEASE_OUTPUT_BUFFER;
        public static final Reason RENDERER_FAILED_SET_SURFACE;
        public static final Reason RENDERER_FAILED_STOP;
        public static final Reason RENDERER_MEDIA_CODEC_UNKNOWN;
        public static final Reason SSL_HANDSHAKE_ERROR;
        public static final Reason SUBTITLE_ERROR;
        public static final Reason TIMEOUT;
        public static final Reason UNKNOWN;
        private static final /* synthetic */ Reason[] b;
        private static final /* synthetic */ EnumEntries c;

        static {
            Reason reason = new Reason(0, "RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER");
            RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER = reason;
            Reason reason2 = new Reason(1, "RENDERER_FAILED_DEQUEUE_INPUT_BUFFER");
            RENDERER_FAILED_DEQUEUE_INPUT_BUFFER = reason2;
            Reason reason3 = new Reason(2, "RENDERER_FAILED_STOP");
            RENDERER_FAILED_STOP = reason3;
            Reason reason4 = new Reason(3, "RENDERER_FAILED_SET_SURFACE");
            RENDERER_FAILED_SET_SURFACE = reason4;
            Reason reason5 = new Reason(4, "RENDERER_FAILED_RELEASE_OUTPUT_BUFFER");
            RENDERER_FAILED_RELEASE_OUTPUT_BUFFER = reason5;
            Reason reason6 = new Reason(5, "RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER");
            RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER = reason6;
            Reason reason7 = new Reason(6, "RENDERER_MEDIA_CODEC_UNKNOWN");
            RENDERER_MEDIA_CODEC_UNKNOWN = reason7;
            Reason reason8 = new Reason(7, "TIMEOUT");
            TIMEOUT = reason8;
            Reason reason9 = new Reason(8, "ILLEGAL_SEEK_POSITION");
            ILLEGAL_SEEK_POSITION = reason9;
            Reason reason10 = new Reason(9, "DECODER_QUERY_ERROR");
            DECODER_QUERY_ERROR = reason10;
            Reason reason11 = new Reason(10, "DECODER_INITIALIZATION_ERROR");
            DECODER_INITIALIZATION_ERROR = reason11;
            Reason reason12 = new Reason(11, "DECODER_UNKNOWN_ERROR");
            DECODER_UNKNOWN_ERROR = reason12;
            Reason reason13 = new Reason(12, "BEHIND_LIVE_WINDOW_ERROR");
            BEHIND_LIVE_WINDOW_ERROR = reason13;
            Reason reason14 = new Reason(13, "DRM_KEYS_EXPIRED");
            DRM_KEYS_EXPIRED = reason14;
            Reason reason15 = new Reason(14, "DRM_MEDIA_RESOURCE_BUSY");
            DRM_MEDIA_RESOURCE_BUSY = reason15;
            Reason reason16 = new Reason(15, "DRM_SESSION_ERROR");
            DRM_SESSION_ERROR = reason16;
            Reason reason17 = new Reason(16, "HTTP_CLEARTEXT_NOT_PERMITTED");
            HTTP_CLEARTEXT_NOT_PERMITTED = reason17;
            Reason reason18 = new Reason(17, "HTTP_CODE_UNAUTHORIZED");
            HTTP_CODE_UNAUTHORIZED = reason18;
            Reason reason19 = new Reason(18, "HTTP_CODE_FORBIDDEN");
            HTTP_CODE_FORBIDDEN = reason19;
            Reason reason20 = new Reason(19, "HTTP_CODE_NOT_FOUND");
            HTTP_CODE_NOT_FOUND = reason20;
            Reason reason21 = new Reason(20, "HTTP_CODE_UNKNOWN");
            HTTP_CODE_UNKNOWN = reason21;
            Reason reason22 = new Reason(21, "SSL_HANDSHAKE_ERROR");
            SSL_HANDSHAKE_ERROR = reason22;
            Reason reason23 = new Reason(22, "NETWORK_UNAVAILABLE");
            NETWORK_UNAVAILABLE = reason23;
            Reason reason24 = new Reason(23, "CONTENT_PARSER_ERROR");
            CONTENT_PARSER_ERROR = reason24;
            Reason reason25 = new Reason(24, "LOADER_UNEXPECTED_ERROR");
            LOADER_UNEXPECTED_ERROR = reason25;
            Reason reason26 = new Reason(25, "AUDIO_ERROR");
            AUDIO_ERROR = reason26;
            Reason reason27 = new Reason(26, "SUBTITLE_ERROR");
            SUBTITLE_ERROR = reason27;
            Reason reason28 = new Reason(27, "CACHE_ERROR");
            CACHE_ERROR = reason28;
            Reason reason29 = new Reason(28, "UNKNOWN");
            UNKNOWN = reason29;
            Reason[] reasonArr = {reason, reason2, reason3, reason4, reason5, reason6, reason7, reason8, reason9, reason10, reason11, reason12, reason13, reason14, reason15, reason16, reason17, reason18, reason19, reason20, reason21, reason22, reason23, reason24, reason25, reason26, reason27, reason28, reason29};
            b = reasonArr;
            c = EnumEntriesKt.enumEntries(reasonArr);
        }

        private Reason(int i, String str) {
        }

        public static EnumEntries<Reason> getEntries() {
            return c;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) b.clone();
        }
    }

    public InstreamAdPlayerError(Reason reason, Throwable underlyingError) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(underlyingError, "underlyingError");
        this.reason = reason;
        this.underlyingError = underlyingError;
    }

    public final Reason getReason() {
        return this.reason;
    }

    public final Throwable getUnderlyingError() {
        return this.underlyingError;
    }
}
