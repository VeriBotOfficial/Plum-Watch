package io.agora.rtc2.audio;

/* loaded from: classes6.dex */
public class AdvancedAudioOptions {
    public AudioProcessingChannelsEnum audioProcessingChannels;

    public enum AudioProcessingChannelsEnum {
        AGORA_AUDIO_MONO_PROCESSING(1),
        AGORA_AUDIO_STEREO_PROCESSING(2);

        private int value;

        AudioProcessingChannelsEnum(int v) {
            this.value = v;
        }

        public int getValue() {
            return this.value;
        }
    }

    public AdvancedAudioOptions() {
        this.audioProcessingChannels = AudioProcessingChannelsEnum.AGORA_AUDIO_MONO_PROCESSING;
    }

    public AdvancedAudioOptions(AudioProcessingChannelsEnum channels) {
        this.audioProcessingChannels = channels;
    }
}
