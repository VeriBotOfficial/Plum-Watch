package io.agora.rtc2.live;

import androidx.media3.extractor.OpusUtil;
import com.wakeup.feature.device.white.record.PcmAudioUtil;

/* loaded from: classes6.dex */
public class LiveInjectStreamConfig {
    public int width = 0;
    public int height = 0;
    public int videoGop = 30;
    public int videoFramerate = 15;
    public int videoBitrate = 400;
    public AudioSampleRateType audioSampleRate = AudioSampleRateType.TYPE_44100;
    public int audioBitrate = 48;
    public int audioChannels = 1;

    public enum AudioSampleRateType {
        TYPE_32000(PcmAudioUtil.PCM_BYTES_PER_SEC),
        TYPE_44100(44100),
        TYPE_48000(OpusUtil.SAMPLE_RATE);

        private int value;

        AudioSampleRateType(int v) {
            this.value = v;
        }

        public static int getValue(AudioSampleRateType type) {
            return type.value;
        }
    }
}
