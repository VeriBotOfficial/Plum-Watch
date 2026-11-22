package io.livekit.android.room.track;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalVideoTrackOptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/livekit/android/room/track/VideoCodec;", "", "codecName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCodecName", "()Ljava/lang/String;", "VP8", "H264", "VP9", "AV1", "H265", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoCodec {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoCodec[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String codecName;
    public static final VideoCodec VP8 = new VideoCodec("VP8", 0, "vp8");
    public static final VideoCodec H264 = new VideoCodec("H264", 1, IjkMediaFormat.CODEC_NAME_H264);
    public static final VideoCodec VP9 = new VideoCodec("VP9", 2, "vp9");
    public static final VideoCodec AV1 = new VideoCodec("AV1", 3, "av1");
    public static final VideoCodec H265 = new VideoCodec("H265", 4, "h265");

    private static final /* synthetic */ VideoCodec[] $values() {
        return new VideoCodec[]{VP8, H264, VP9, AV1, H265};
    }

    public static EnumEntries<VideoCodec> getEntries() {
        return $ENTRIES;
    }

    public static VideoCodec valueOf(String str) {
        return (VideoCodec) Enum.valueOf(VideoCodec.class, str);
    }

    public static VideoCodec[] values() {
        return (VideoCodec[]) $VALUES.clone();
    }

    private VideoCodec(String str, int i, String str2) {
        this.codecName = str2;
    }

    public final String getCodecName() {
        return this.codecName;
    }

    static {
        VideoCodec[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: LocalVideoTrackOptions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/VideoCodec$Companion;", "", "()V", "fromCodecName", "Lio/livekit/android/room/track/VideoCodec;", "codecName", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoCodec fromCodecName(String codecName) {
            Intrinsics.checkNotNullParameter(codecName, "codecName");
            for (VideoCodec videoCodec : VideoCodec.getEntries()) {
                if (StringsKt.equals(videoCodec.getCodecName(), codecName, true)) {
                    return videoCodec;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
