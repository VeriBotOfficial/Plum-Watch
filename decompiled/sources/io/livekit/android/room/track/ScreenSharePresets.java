package io.livekit.android.room.track;

import com.google.android.gms.common.util.GmsVersion;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalVideoTrackOptions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/livekit/android/room/track/ScreenSharePresets;", "", "Lio/livekit/android/room/track/VideoPreset;", "capture", "Lio/livekit/android/room/track/VideoCaptureParameter;", "encoding", "Lio/livekit/android/room/track/VideoEncoding;", "(Ljava/lang/String;ILio/livekit/android/room/track/VideoCaptureParameter;Lio/livekit/android/room/track/VideoEncoding;)V", "getCapture", "()Lio/livekit/android/room/track/VideoCaptureParameter;", "getEncoding", "()Lio/livekit/android/room/track/VideoEncoding;", "H360_FPS3", "H360_FPS15", "H720_FPS5", "H720_FPS15", "H720_FPS30", "H1080_FPS15", "H1080_FPS30", "ORIGINAL", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenSharePresets implements VideoPreset {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenSharePresets[] $VALUES;
    private final VideoCaptureParameter capture;
    private final VideoEncoding encoding;
    public static final ScreenSharePresets H360_FPS3 = new ScreenSharePresets("H360_FPS3", 0, new VideoCaptureParameter(640, 360, 3, false, 8, null), new VideoEncoding(200000, 3));
    public static final ScreenSharePresets H360_FPS15 = new ScreenSharePresets("H360_FPS15", 1, new VideoCaptureParameter(640, 360, 15, false, 8, null), new VideoEncoding(400000, 15));
    public static final ScreenSharePresets H720_FPS5 = new ScreenSharePresets("H720_FPS5", 2, new VideoCaptureParameter(1280, 720, 5, false, 8, null), new VideoEncoding(800000, 5));
    public static final ScreenSharePresets H720_FPS15 = new ScreenSharePresets("H720_FPS15", 3, new VideoCaptureParameter(1280, 720, 15, false, 8, null), new VideoEncoding(1500000, 15));
    public static final ScreenSharePresets H720_FPS30 = new ScreenSharePresets("H720_FPS30", 4, new VideoCaptureParameter(1280, 720, 30, false, 8, null), new VideoEncoding(2000000, 30));
    public static final ScreenSharePresets H1080_FPS15 = new ScreenSharePresets("H1080_FPS15", 5, new VideoCaptureParameter(1920, 1080, 15, false, 8, null), new VideoEncoding(2500000, 15));
    public static final ScreenSharePresets H1080_FPS30 = new ScreenSharePresets("H1080_FPS30", 6, new VideoCaptureParameter(1920, 1080, 30, false, 8, null), new VideoEncoding(GmsVersion.VERSION_LONGHORN, 30));
    public static final ScreenSharePresets ORIGINAL = new ScreenSharePresets("ORIGINAL", 7, new VideoCaptureParameter(0, 0, 30, false), new VideoEncoding(GmsVersion.VERSION_ORLA, 30));

    private static final /* synthetic */ ScreenSharePresets[] $values() {
        return new ScreenSharePresets[]{H360_FPS3, H360_FPS15, H720_FPS5, H720_FPS15, H720_FPS30, H1080_FPS15, H1080_FPS30, ORIGINAL};
    }

    public static EnumEntries<ScreenSharePresets> getEntries() {
        return $ENTRIES;
    }

    public static ScreenSharePresets valueOf(String str) {
        return (ScreenSharePresets) Enum.valueOf(ScreenSharePresets.class, str);
    }

    public static ScreenSharePresets[] values() {
        return (ScreenSharePresets[]) $VALUES.clone();
    }

    private ScreenSharePresets(String str, int i, VideoCaptureParameter videoCaptureParameter, VideoEncoding videoEncoding) {
        this.capture = videoCaptureParameter;
        this.encoding = videoEncoding;
    }

    @Override // io.livekit.android.room.track.VideoPreset
    public VideoCaptureParameter getCapture() {
        return this.capture;
    }

    @Override // io.livekit.android.room.track.VideoPreset
    public VideoEncoding getEncoding() {
        return this.encoding;
    }

    static {
        ScreenSharePresets[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
