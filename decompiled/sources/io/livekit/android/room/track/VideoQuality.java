package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.LivekitModels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoQuality.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lio/livekit/android/room/track/VideoQuality;", "", "(Ljava/lang/String;I)V", "toProto", "Llivekit/LivekitModels$VideoQuality;", "LOW", "MEDIUM", "HIGH", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoQuality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final VideoQuality LOW = new VideoQuality("LOW", 0);
    public static final VideoQuality MEDIUM = new VideoQuality("MEDIUM", 1);
    public static final VideoQuality HIGH = new VideoQuality("HIGH", 2);

    /* compiled from: VideoQuality.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ VideoQuality[] $values() {
        return new VideoQuality[]{LOW, MEDIUM, HIGH};
    }

    public static EnumEntries<VideoQuality> getEntries() {
        return $ENTRIES;
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }

    private VideoQuality(String str, int i) {
    }

    static {
        VideoQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public final LivekitModels.VideoQuality toProto() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return LivekitModels.VideoQuality.LOW;
        }
        if (i == 2) {
            return LivekitModels.VideoQuality.MEDIUM;
        }
        if (i == 3) {
            return LivekitModels.VideoQuality.HIGH;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: VideoQuality.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/VideoQuality$Companion;", "", "()V", "fromProto", "Lio/livekit/android/room/track/VideoQuality;", "quality", "Llivekit/LivekitModels$VideoQuality;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: VideoQuality.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LivekitModels.VideoQuality.values().length];
                try {
                    iArr[LivekitModels.VideoQuality.LOW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LivekitModels.VideoQuality.MEDIUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LivekitModels.VideoQuality.HIGH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LivekitModels.VideoQuality.OFF.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LivekitModels.VideoQuality.UNRECOGNIZED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoQuality fromProto(LivekitModels.VideoQuality quality) {
            Intrinsics.checkNotNullParameter(quality, "quality");
            int i = WhenMappings.$EnumSwitchMapping$0[quality.ordinal()];
            if (i == 1) {
                return VideoQuality.LOW;
            }
            if (i == 2) {
                return VideoQuality.MEDIUM;
            }
            if (i == 3) {
                return VideoQuality.HIGH;
            }
            if (i == 4 || i == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
