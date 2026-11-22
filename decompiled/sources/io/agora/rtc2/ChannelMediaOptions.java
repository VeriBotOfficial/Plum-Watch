package io.agora.rtc2;

/* loaded from: classes6.dex */
public class ChannelMediaOptions {
    public Integer audienceLatencyLevel;
    public Integer audioDelayMs;
    public Boolean autoSubscribeAudio;
    public Boolean autoSubscribeVideo;
    public Integer channelProfile;
    public Integer clientRoleType;
    public Integer customVideoTrackId;
    public Integer defaultVideoStreamType;
    public Boolean enableAudioRecordingOrPlayout;
    public Boolean enableBuiltInMediaEncryption;
    public Boolean isAudioFilterable;
    public Boolean isInteractiveAudience;
    public Integer mediaPlayerAudioDelayMs;
    public String parameters;
    public Boolean publishCameraTrack;
    public Boolean publishCustomAudioTrack;
    public Integer publishCustomAudioTrackId;
    public Boolean publishCustomVideoTrack;
    public Boolean publishEncodedVideoTrack;
    public Boolean publishFourthCameraTrack;
    public Boolean publishLipSyncTrack;
    public Boolean publishMediaPlayerAudioTrack;
    public Integer publishMediaPlayerId;
    public Boolean publishMediaPlayerVideoTrack;
    public Boolean publishMicrophoneTrack;
    public Boolean publishMixedAudioTrack;
    public Boolean publishRhythmPlayerTrack;
    public Boolean publishScreenCaptureAudio;
    public Boolean publishScreenCaptureVideo;
    public Boolean publishSecondaryCameraTrack;
    public Boolean publishThirdCameraTrack;
    public Boolean publishTranscodedVideoTrack;
    public Boolean startPreview;
    public String token;

    public ChannelMediaOptions() {
    }

    public ChannelMediaOptions(Integer clientRoleType) {
        this.clientRoleType = clientRoleType;
    }

    public Integer getAudienceLatencyLevel() {
        return this.audienceLatencyLevel;
    }

    public Integer getAudioDelayMs() {
        return this.audioDelayMs;
    }

    public Integer getChannelProfile() {
        return this.channelProfile;
    }

    public Integer getClientRoleType() {
        return this.clientRoleType;
    }

    public Integer getCustomVideoTrackId() {
        return this.customVideoTrackId;
    }

    public Integer getDefaultVideoStreamType() {
        return this.defaultVideoStreamType;
    }

    public Boolean getIsAudioFilterable() {
        return this.isAudioFilterable;
    }

    public Integer getMediaPlayerAudioDelayMs() {
        return this.mediaPlayerAudioDelayMs;
    }

    public String getParameters() {
        return this.parameters;
    }

    public Integer getPublishCustomAudioTrackId() {
        return this.publishCustomAudioTrackId;
    }

    public Integer getPublishMediaPlayerId() {
        return this.publishMediaPlayerId;
    }

    public Boolean getPublishRhythmPlayerTrack() {
        return this.publishRhythmPlayerTrack;
    }

    public String getToken() {
        return this.token;
    }

    public Boolean isAutoSubscribeAudio() {
        return this.autoSubscribeAudio;
    }

    public Boolean isAutoSubscribeVideo() {
        return this.autoSubscribeVideo;
    }

    public Boolean isEnableAudioRecordingOrPlayout() {
        return this.enableAudioRecordingOrPlayout;
    }

    public Boolean isEnableBuiltInMediaEncryption() {
        return this.enableBuiltInMediaEncryption;
    }

    public Boolean isInteractiveAudience() {
        return this.isInteractiveAudience;
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

    public Boolean isPublishEncodedVideoTrack() {
        return this.publishEncodedVideoTrack;
    }

    public Boolean isPublishFourthCameraTrack() {
        return this.publishFourthCameraTrack;
    }

    public Boolean isPublishLipSyncTrack() {
        return this.publishLipSyncTrack;
    }

    public Boolean isPublishMediaPlayerAudioTrack() {
        return this.publishMediaPlayerAudioTrack;
    }

    public Boolean isPublishMediaPlayerVideoTrack() {
        return this.publishMediaPlayerVideoTrack;
    }

    public Boolean isPublishMicrophoneTrack() {
        return this.publishMicrophoneTrack;
    }

    public Boolean isPublishMixedAudioTrack() {
        return this.publishMixedAudioTrack;
    }

    public Boolean isPublishScreenCaptureAudio() {
        return this.publishScreenCaptureAudio;
    }

    public Boolean isPublishScreenCaptureVideo() {
        return this.publishScreenCaptureVideo;
    }

    public Boolean isPublishSecondaryCameraTrack() {
        return this.publishSecondaryCameraTrack;
    }

    public Boolean isPublishThirdCameraTrack() {
        return this.publishThirdCameraTrack;
    }

    public Boolean isPublishTranscodedVideoTrack() {
        return this.publishTranscodedVideoTrack;
    }

    public Boolean isStartPreview() {
        return this.startPreview;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("publishCameraTrack=");
        sb.append(this.publishCameraTrack);
        sb.append(" publishSecondaryCameraTrack=").append(this.publishSecondaryCameraTrack);
        sb.append(" publishThirdCameraTrack=").append(this.publishThirdCameraTrack);
        sb.append(" publishFourthCameraTrack=").append(this.publishFourthCameraTrack);
        sb.append(" publishScreenCaptureVideo=").append(this.publishScreenCaptureVideo);
        sb.append(" publishScreenCaptureAudio=").append(this.publishScreenCaptureAudio);
        sb.append(" publishCustomAudioTrack=").append(this.publishCustomAudioTrack);
        sb.append(" publishCustomAudioTrackId=").append(this.publishCustomAudioTrackId);
        sb.append(" publishCustomVideoTrack=").append(this.publishCustomVideoTrack);
        sb.append(" publishEncodedVideoTrack=").append(this.publishEncodedVideoTrack);
        sb.append(" publishMediaPlayerAudioTrack=").append(this.publishMediaPlayerAudioTrack);
        sb.append(" publishMediaPlayerVideoTrack=").append(this.publishMediaPlayerVideoTrack);
        sb.append(" publishMixedAudioTrack=").append(this.publishMixedAudioTrack);
        sb.append(" publishTranscodedVideoTrack=").append(this.publishTranscodedVideoTrack);
        sb.append(" publishLipSyncdVideoTrack=").append(this.publishLipSyncTrack);
        sb.append(" publishMediaPlayerId=").append(this.publishMediaPlayerId);
        sb.append(" publishMicrophoneTrack=").append(this.publishMicrophoneTrack);
        sb.append(" autoSubscribeAudio=").append(this.autoSubscribeAudio);
        sb.append(" autoSubscribeVideo=").append(this.autoSubscribeVideo);
        sb.append(" startPrevie=").append(this.startPreview);
        sb.append(" clientRoleType=").append(this.clientRoleType);
        sb.append(" audienceLatencyLevel=").append(this.audienceLatencyLevel);
        sb.append(" defaultVideoStreamType=").append(this.defaultVideoStreamType);
        sb.append(" channelProfile=").append(this.channelProfile);
        sb.append(" audioDelayMs=").append(this.audioDelayMs);
        sb.append(" enableBuiltInMediaEncryption=").append(this.enableBuiltInMediaEncryption);
        sb.append(" publishRhythmPlayerTrack=").append(this.publishRhythmPlayerTrack);
        sb.append(" isAudioFilterable=").append(this.isAudioFilterable);
        sb.append(" mediaPlayerAudioDelayMs=").append(this.mediaPlayerAudioDelayMs);
        sb.append(" customVideoTrackId=").append(this.customVideoTrackId);
        sb.append(" isInteractiveAudience=").append(this.isInteractiveAudience);
        sb.append(" parameters=").append(this.parameters);
        return sb.toString();
    }
}
