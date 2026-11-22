package com.wakeup.module.video.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoQuality.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/module/video/utils/VideoQuality;", "", "<init>", "(Ljava/lang/String;I)V", "High", "Medium", "Low", "VeryHigh", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoQuality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;
    public static final VideoQuality High = new VideoQuality("High", 0);
    public static final VideoQuality Medium = new VideoQuality("Medium", 1);
    public static final VideoQuality Low = new VideoQuality("Low", 2);
    public static final VideoQuality VeryHigh = new VideoQuality("VeryHigh", 3);

    private static final /* synthetic */ VideoQuality[] $values() {
        return new VideoQuality[]{High, Medium, Low, VeryHigh};
    }

    public static EnumEntries<VideoQuality> getEntries() {
        return $ENTRIES;
    }

    private VideoQuality(String str, int i) {
    }

    static {
        VideoQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }
}
