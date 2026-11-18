package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioCapabilities {
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[]{2}, 2);
    private final int maxChannelCount;
    private final int[] supportedEncodings;

    AudioCapabilities(int[] r2, int r3) {
        if (r2 != null) {
            int[] r4 = Arrays.copyOf(r2, r2.length);
            this.supportedEncodings = r4;
            Arrays.sort(r4);
        } else {
            this.supportedEncodings = new int[0];
        }
        this.maxChannelCount = r3;
    }

    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Arrays.equals(this.supportedEncodings, audioCapabilities.supportedEncodings) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (Arrays.hashCode(this.supportedEncodings) * 31);
    }

    public boolean supportsEncoding(int r2) {
        return Arrays.binarySearch(this.supportedEncodings, r2) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", supportedEncodings=" + Arrays.toString(this.supportedEncodings) + "]";
    }

    static AudioCapabilities getCapabilities(Intent intent) {
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
        }
        return DEFAULT_AUDIO_CAPABILITIES;
    }
}
