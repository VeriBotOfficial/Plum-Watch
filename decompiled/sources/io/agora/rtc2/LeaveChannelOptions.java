package io.agora.rtc2;

/* loaded from: classes6.dex */
public class LeaveChannelOptions {
    public boolean stopAudioMixing = true;
    public boolean stopAllEffect = true;
    public boolean stopMicrophoneRecording = true;

    public boolean isStopAllEffect() {
        return this.stopAllEffect;
    }

    public boolean isStopAudioMixing() {
        return this.stopAudioMixing;
    }

    public boolean isStopMicrophoneRecording() {
        return this.stopMicrophoneRecording;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("stopAudioMixing=");
        sb.append(this.stopAudioMixing);
        sb.append("stopAllEffect=").append(this.stopAllEffect);
        sb.append("stopMicrophoneRecording=").append(this.stopMicrophoneRecording);
        return sb.toString();
    }
}
