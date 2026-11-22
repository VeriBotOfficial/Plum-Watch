package io.agora.rtc2;

import io.agora.rtc2.Constants;
import io.agora.rtc2.internal.EncryptionConfig;
import io.agora.rtc2.live.LiveTranscoding;
import io.agora.rtc2.video.ChannelMediaRelayConfiguration;
import io.agora.rtc2.video.ContentInspectConfig;
import io.agora.rtc2.video.SnapshotConfig;
import io.agora.rtc2.video.VideoCanvas;
import io.agora.rtc2.video.VideoEncoderConfiguration;
import io.agora.rtc2.video.VideoSubscriptionOptions;
import io.agora.rtc2.video.WatermarkOptions;

/* loaded from: classes6.dex */
public abstract class RtcEngineEx extends RtcEngine {
    public abstract void addHandlerEx(IRtcEngineEventHandler handler, RtcConnection connection);

    public abstract int addVideoWatermarkEx(String watermarkUrl, WatermarkOptions options, RtcConnection connection);

    public abstract int adjustRecordingSignalVolumeEx(int volume, RtcConnection connection);

    public abstract int adjustUserPlaybackSignalVolumeEx(int uid, int volume, RtcConnection connection);

    public abstract int clearVideoWatermarkEx(RtcConnection connection);

    public abstract int createDataStreamEx(DataStreamConfig config, RtcConnection connection);

    public abstract int createDataStreamEx(boolean reliable, boolean ordered, RtcConnection connection);

    public abstract int enableAudioVolumeIndicationEx(int interval, int smooth, boolean reportVad, RtcConnection connection);

    public abstract int enableContentInspectEx(boolean enabled, ContentInspectConfig config, RtcConnection connection);

    @Deprecated
    public abstract int enableDualStreamModeEx(boolean enabled, SimulcastStreamConfig streamConfig, RtcConnection connection);

    public abstract int enableEncryptionEx(boolean enabled, EncryptionConfig config, RtcConnection connection);

    public abstract String getCallIdEx(RtcConnection connection);

    public abstract int getConnectionStateEx(RtcConnection connection);

    public abstract int getUserInfoByUidEx(int uid, UserInfo userInfo, RtcConnection connection);

    public abstract int getUserInfoByUserAccountEx(String userAccount, UserInfo userInfo, RtcConnection connection);

    public abstract int joinChannelEx(String token, RtcConnection connection, ChannelMediaOptions options, IRtcEngineEventHandler eventHandler);

    public abstract int joinChannelWithUserAccountEx(String token, String channelId, String userAccount, ChannelMediaOptions options, IRtcEngineEventHandler eventHandler);

    public abstract int leaveChannelEx(RtcConnection connection);

    public abstract int leaveChannelEx(RtcConnection connection, LeaveChannelOptions options);

    public abstract int leaveChannelWithUserAccountEx(String channelId, String userAccount);

    public abstract int leaveChannelWithUserAccountEx(String channelId, String userAccount, LeaveChannelOptions options);

    public abstract int muteAllRemoteAudioStreamsEx(boolean muted, RtcConnection connection);

    public abstract int muteAllRemoteVideoStreamsEx(boolean muted, RtcConnection connection);

    public abstract int muteLocalAudioStreamEx(boolean muted, RtcConnection connection);

    public abstract int muteLocalVideoStreamEx(boolean muted, RtcConnection connection);

    public abstract int muteRecordingSignalEx(boolean muted, RtcConnection connection);

    public abstract int muteRemoteAudioStreamEx(int uid, boolean muted, RtcConnection connection);

    public abstract int muteRemoteVideoStreamEx(int uid, boolean muted, RtcConnection connection);

    public abstract int pauseAllChannelMediaRelayEx(RtcConnection connection);

    public abstract void removeHandlerEx(IRtcEngineEventHandler handler, RtcConnection connection);

    public abstract int resumeAllChannelMediaRelayEx(RtcConnection connection);

    public abstract int sendAudioMetadataEx(byte[] metadata, RtcConnection connection);

    public abstract int sendCustomReportMessageEx(String id2, String category, String event, String label, int value, RtcConnection connection);

    public abstract int sendStreamMessageEx(int streamId, byte[] message, RtcConnection connection);

    public abstract int setDualStreamModeEx(Constants.SimulcastStreamMode mode, SimulcastStreamConfig streamConfig, RtcConnection connection);

    public abstract int setHighPriorityUserListEx(int[] uidList, int option, RtcConnection connection);

    public abstract int setParametersEx(String parameters, RtcConnection connection);

    public abstract int setRemoteRenderModeEx(int uid, int renderMode, int mirrorMode, RtcConnection connection);

    public abstract int setRemoteUserSpatialAudioParamsEx(int uid, SpatialAudioParams params, RtcConnection connection);

    @Deprecated
    public abstract int setRemoteVideoStreamTypeEx(int uid, int streamType, RtcConnection connection);

    public abstract int setRemoteVideoStreamTypeEx(int uid, Constants.VideoStreamType streamType, RtcConnection connection);

    public abstract int setRemoteVideoSubscriptionOptionsEx(int uid, VideoSubscriptionOptions options, RtcConnection rtcConnection);

    public abstract int setRemoteVoicePositionEx(int uid, double pan, double gain, RtcConnection connection);

    public abstract int setSimulcastConfigEx(SimulcastConfig simulcastConfig, RtcConnection connection);

    public abstract int setSubscribeAudioAllowlistEx(int[] uidList, RtcConnection connection);

    public abstract int setSubscribeAudioBlocklistEx(int[] uidList, RtcConnection connection);

    public abstract int setSubscribeVideoAllowlistEx(int[] uidList, RtcConnection connection);

    public abstract int setSubscribeVideoBlocklistEx(int[] uidList, RtcConnection connection);

    public abstract int setVideoEncoderConfigurationEx(VideoEncoderConfiguration config, RtcConnection connection);

    public abstract int setupRemoteVideoEx(VideoCanvas remote, RtcConnection connection);

    public abstract int startMediaRenderingTracingEx(RtcConnection connection);

    public abstract int startOrUpdateChannelMediaRelayEx(ChannelMediaRelayConfiguration channelMediaRelayConfiguration, RtcConnection connection);

    public abstract int startRtmpStreamWithTranscodingEx(String url, LiveTranscoding transcoding, RtcConnection connection);

    public abstract int startRtmpStreamWithoutTranscodingEx(String url, RtcConnection connection);

    public abstract int stopChannelMediaRelayEx(RtcConnection connection);

    public abstract int stopRtmpStreamEx(String url, RtcConnection connection);

    public abstract int takeSnapshotEx(RtcConnection connection, int uid, SnapshotConfig config);

    public abstract int takeSnapshotEx(RtcConnection connection, int uid, String filePath);

    public abstract int updateChannelMediaOptionsEx(ChannelMediaOptions options, RtcConnection connection);

    public abstract int updateRtmpTranscodingEx(LiveTranscoding transcoding, RtcConnection connection);
}
