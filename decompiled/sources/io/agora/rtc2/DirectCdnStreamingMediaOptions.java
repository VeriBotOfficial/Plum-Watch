package io.agora.rtc2;

/* loaded from: classes6.dex */
public class DirectCdnStreamingMediaOptions {
    public Boolean publishCameraTrack = false;
    public Boolean publishMicrophoneTrack = false;
    public Boolean publishCustomAudioTrack = false;
    public Boolean publishCustomVideoTrack = false;
    public Boolean publishMediaPlayerAudioTrack = false;
    public Integer publishMediaPlayerId = 0;
    public Integer customVideoTrackId = 0;

    public Integer getCustomVideoTrackId() {
        return this.customVideoTrackId;
    }

    public Integer getPublishMediaPlayerId() {
        return this.publishMediaPlayerId;
    }

    public Boolean isPublishCameraTrack() {
        return this.publishCameraTrack;
    }

    public Boolean isPublishCustomAudioTrack() {
        return this.publishCustomAudioTrack;
    }

    public Boolean isPublishCustomVideoTrack() {
        return this.publishCustomVideoTrack;
    }

    public Boolean isPublishMediaPlayerAudioTrack() {
        return this.publishMediaPlayerAudioTrack;
    }

    public Boolean isPublishMicrophoneTrack() {
        return this.publishMicrophoneTrack;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("publishCameraTrack=");
        sb.append(this.publishCameraTrack);
        sb.append(" publishMicrophoneTrack=").append(this.publishMicrophoneTrack);
        sb.append(" publishCustomAudioTrack=").append(this.publishCustomAudioTrack);
        sb.append(" publishCustomVideoTrack=").append(this.publishCustomVideoTrack);
        sb.append(" publishMediaPlayerAudioTrack=").append(this.publishMediaPlayerAudioTrack);
        sb.append(" publishMediaPlayerId=").append(this.publishMediaPlayerId);
        sb.append(" customVideoTrackId=").append(this.customVideoTrackId);
        return sb.toString();
    }
}
