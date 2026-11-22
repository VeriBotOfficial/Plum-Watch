package io.livekit.android.room.participant;

import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalParticipant.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/livekit/android/room/participant/AudioPresets;", "", "maxBitrate", "", "(Ljava/lang/String;II)V", "getMaxBitrate", "()I", "TELEPHONE", "SPEECH", "MUSIC", "MUSIC_STEREO", "MUSIC_HIGH_QUALITY", "MUSIC_HIGH_QUALITY_STEREO", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioPresets {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioPresets[] $VALUES;
    private final int maxBitrate;
    public static final AudioPresets TELEPHONE = new AudioPresets("TELEPHONE", 0, ErrorCode.MSP_ERROR_HTTP_BASE);
    public static final AudioPresets SPEECH = new AudioPresets("SPEECH", 1, ErrorCode.ERROR_TTS_INVALID_PARA);
    public static final AudioPresets MUSIC = new AudioPresets("MUSIC", 2, OpusUtil.SAMPLE_RATE);
    public static final AudioPresets MUSIC_STEREO = new AudioPresets("MUSIC_STEREO", 3, 64000);
    public static final AudioPresets MUSIC_HIGH_QUALITY = new AudioPresets("MUSIC_HIGH_QUALITY", 4, 96000);
    public static final AudioPresets MUSIC_HIGH_QUALITY_STEREO = new AudioPresets("MUSIC_HIGH_QUALITY_STEREO", 5, 128000);

    private static final /* synthetic */ AudioPresets[] $values() {
        return new AudioPresets[]{TELEPHONE, SPEECH, MUSIC, MUSIC_STEREO, MUSIC_HIGH_QUALITY, MUSIC_HIGH_QUALITY_STEREO};
    }

    public static EnumEntries<AudioPresets> getEntries() {
        return $ENTRIES;
    }

    public static AudioPresets valueOf(String str) {
        return (AudioPresets) Enum.valueOf(AudioPresets.class, str);
    }

    public static AudioPresets[] values() {
        return (AudioPresets[]) $VALUES.clone();
    }

    private AudioPresets(String str, int i, int i2) {
        this.maxBitrate = i2;
    }

    public final int getMaxBitrate() {
        return this.maxBitrate;
    }

    static {
        AudioPresets[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
