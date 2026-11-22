package io.agora.rtc2;

import android.graphics.Rect;
import io.agora.rtc2.Constants;
import io.agora.rtc2.LocalTranscoderConfiguration;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class IRtcEngineEventHandler {

    public static class AgoraFacePositionInfo {
        public int distance;
        public int height;
        public int width;
        public int x;
        public int y;
    }

    public static class AudioVolumeInfo {
        public int uid;
        public int vad;
        public double voicePitch;
        public int volume;
    }

    @Deprecated
    public static class ClientRole {
        public static final int CLIENT_ROLE_AUDIENCE = 2;
        public static final int CLIENT_ROLE_BROADCASTER = 1;
    }

    public static class DownlinkNetworkInfo {
        public int bandwidth_estimation_bps;
        public int lastmile_buffer_delay_time_ms;
    }

    public static class ErrorCode {
        public static final int ERR_ABORTED = 20;
        public static final int ERR_ADM_GENERAL_ERROR = 1005;
        public static final int ERR_ADM_INIT_PLAYOUT = 1008;
        public static final int ERR_ADM_INIT_RECORDING = 1011;
        public static final int ERR_ADM_START_PLAYOUT = 1009;
        public static final int ERR_ADM_START_RECORDING = 1012;
        public static final int ERR_ADM_STOP_PLAYOUT = 1010;
        public static final int ERR_ADM_STOP_RECORDING = 1013;
        public static final int ERR_ALREADY_IN_USE = 19;
        public static final int ERR_BIND_SOCKET = 13;
        public static final int ERR_BITRATE_LIMIT = 115;
        public static final int ERR_BUFFER_TOO_SMALL = 6;
        public static final int ERR_CANCELED = 11;
        public static final int ERR_CLIENT_IS_BANNED_BY_SERVER = 123;
        public static final int ERR_CONNECTION_INTERRUPTED = 111;
        public static final int ERR_CONNECTION_LOST = 112;
        public static final int ERR_DATASTREAM_DECRYPTION_FAILED = 122;
        public static final int ERR_DECRYPTION_FAILED = 120;
        public static final int ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISH = 130;
        public static final int ERR_FAILED = 1;
        public static final int ERR_INIT_NET_ENGINE = 21;
        public static final int ERR_INVALID_APP_ID = 101;
        public static final int ERR_INVALID_ARGUMENT = 2;
        public static final int ERR_INVALID_CHANNEL_NAME = 102;
        public static final int ERR_INVALID_TOKEN = 110;
        public static final int ERR_INVALID_USER_ACCOUNT = 134;
        public static final int ERR_INVALID_USER_ID = 121;
        public static final int ERR_JOIN_CHANNEL_REJECTED = 17;
        public static final int ERR_LEAVE_CHANNEL_REJECTED = 18;
        public static final int ERR_LICENSE_CREDENTIAL_INVALID = 131;
        public static final int ERR_LOAD_MEDIA_ENGINE = 1001;
        public static final int ERR_MODULE_NOT_FOUND = 157;
        public static final int ERR_NET_DOWN = 14;
        public static final int ERR_NOT_INITIALIZED = 7;
        public static final int ERR_NOT_IN_CHANNEL = 113;
        public static final int ERR_NOT_READY = 3;
        public static final int ERR_NOT_SUPPORTED = 4;
        public static final int ERR_NO_PERMISSION = 9;
        public static final int ERR_NO_SERVER_RESOURCES = 103;
        public static final int ERR_OK = 0;
        public static final int ERR_REFUSED = 5;
        public static final int ERR_RESOURCE_LIMITED = 22;
        public static final int ERR_SET_CLIENT_ROLE_NOT_AUTHORIZED = 119;
        public static final int ERR_SIZE_TOO_LARGE = 114;
        public static final int ERR_STREAM_MESSAGE_TIMEOUT = 117;
        public static final int ERR_TIMEDOUT = 10;
        public static final int ERR_TOKEN_EXPIRED = 109;
        public static final int ERR_TOO_MANY_DATA_STREAMS = 116;
        public static final int ERR_TOO_OFTEN = 12;
        public static final int ERR_VDM_CAMERA_NOT_AUTHORIZED = 1501;
    }

    public static class LastmileProbeResult {
        public int rtt;
        public short state;
        public LastmileProbeOneWayResult uplinkReport = new LastmileProbeOneWayResult();
        public LastmileProbeOneWayResult downlinkReport = new LastmileProbeOneWayResult();

        public static class LastmileProbeOneWayResult {
            public int availableBandwidth;
            public int jitter;
            public int packetLossRate;
        }
    }

    public static class LocalAudioStats {
        public int aecEstimatedDelay;
        public int audioDeviceDelay;
        public int audioPlayoutDelay;
        public int earMonitorDelay;
        public int internalCodec;
        public int numChannels;
        public int sentBitrate;
        public int sentSampleRate;
        public int txPacketLossRate;
    }

    public static class LocalVideoStats {
        public int captureBrightnessLevel;
        public int captureFrameHeight;
        public int captureFrameRate;
        public int captureFrameWidth;
        public int codecType;
        public boolean dualStreamEnabled;
        public int encodedBitrate;
        public int encodedFrameCount;
        public int encodedFrameHeight;
        public int encodedFrameWidth;
        public int encoderOutputFrameRate;
        public int hwEncoderAccelerating;
        public int qualityAdaptIndication;
        public int regulatedCaptureFrameHeight;
        public int regulatedCaptureFrameRate;
        public int regulatedCaptureFrameWidth;
        public int rendererOutputFrameRate;
        public int sentBitrate;
        public int sentFrameRate;
        public int targetBitrate;
        public int targetFrameRate;
        public int txPacketLossRate;
        public int uid;
    }

    @Deprecated
    public static class Quality {
        public static final int BAD = 4;
        public static final int DOWN = 6;
        public static final int EXCELLENT = 1;
        public static final int GOOD = 2;
        public static final int POOR = 3;
        public static final int UNKNOWN = 0;
        public static final int VBAD = 5;
    }

    public static class RemoteAudioStats {
        public int audioLossRate;
        public int e2eDelay;
        public int frozenRate;
        public int frozenRateByCustomPlcCount;
        public int jitterBufferDelay;
        public int mosValue;
        public int networkTransportDelay;
        public int numChannels;
        public int plcCount;
        public long publishDuration;
        public int qoeQuality;
        public int quality;
        public int qualityChangedReason;
        public int receivedBitrate;
        public int receivedSampleRate;
        public int rxAudioBytes;
        public long totalActiveTime;
        public int totalFrozenTime;
        public int uid;
    }

    public static class RemoteVideoStats {
        public int avSyncTimeMs;
        public int decoderOutputFrameRate;
        public int delay;
        public int e2eDelay;
        public int frameLossRate;
        public int frozenRate;
        public int height;
        public int mosValue;
        public int packetLossRate;
        public long publishDuration;
        public int receivedBitrate;
        public int rendererOutputFrameRate;
        public int rxStreamType;
        public int rxVideoBytes;
        public long totalActiveTime;
        public int totalFrozenTime;
        public int uid;
        public int width;
    }

    public static class RtcStats {
        public int connectTimeMs;
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int gatewayRtt;
        public int lastmileDelay;
        public int memoryAppUsageInKbytes;
        public double memoryAppUsageRatio;
        public double memoryTotalUsageRatio;
        public int rxAudioBytes;
        public int rxAudioKBitRate;
        public int rxBytes;
        public int rxKBitRate;
        public int rxPacketLossRate;
        public int rxVideoBytes;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioBytes;
        public int txAudioKBitRate;
        public int txBytes;
        public int txKBitRate;
        public int txPacketLossRate;
        public int txVideoBytes;
        public int txVideoKBitRate;
        public int users;
    }

    public static class UplinkNetworkInfo {
        public int video_encoder_target_bitrate_bps;
    }

    @Deprecated
    public static class UserOfflineReason {
        public static final int USER_OFFLINE_DROPPED = 1;
        public static final int USER_OFFLINE_QUIT = 0;
    }

    public static class VideoLayout {
        public String channelId;
        public int height;
        public String strUid;
        public int uid;
        public int videoState;
        public int width;
        public int x;
        public int y;

        public String toString() {
            return "VideoLayout{channelId='" + this.channelId + "', uid=" + this.uid + ", strUid='" + this.strUid + "', videoState=" + this.videoState + ", x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class VideoLayoutInfo {
        public int height;
        public int layoutCount;
        public VideoLayout[] layoutList;
        public int width;

        public String toString() {
            return "VideoLayoutInfo{width=" + this.width + ", height=" + this.height + ", layoutCount=" + this.layoutCount + ", layoutList=" + Arrays.toString(this.layoutList) + AbstractJsonLexerKt.END_OBJ;
        }
    }

    @Deprecated
    public static class VideoProfile {
        public static final int VIDEO_PROFILE_1080P = 60;
        public static final int VIDEO_PROFILE_1080P_3 = 62;
        public static final int VIDEO_PROFILE_1080P_5 = 64;
        public static final int VIDEO_PROFILE_120P = 0;
        public static final int VIDEO_PROFILE_120P_3 = 2;
        public static final int VIDEO_PROFILE_1440P = 66;
        public static final int VIDEO_PROFILE_1440P_2 = 67;
        public static final int VIDEO_PROFILE_180P = 10;
        public static final int VIDEO_PROFILE_180P_3 = 12;
        public static final int VIDEO_PROFILE_180P_4 = 13;
        public static final int VIDEO_PROFILE_240P = 20;
        public static final int VIDEO_PROFILE_240P_3 = 22;
        public static final int VIDEO_PROFILE_240P_4 = 23;
        public static final int VIDEO_PROFILE_360P = 30;
        public static final int VIDEO_PROFILE_360P_3 = 32;
        public static final int VIDEO_PROFILE_360P_4 = 33;
        public static final int VIDEO_PROFILE_360P_6 = 35;
        public static final int VIDEO_PROFILE_360P_7 = 36;
        public static final int VIDEO_PROFILE_360P_8 = 37;
        public static final int VIDEO_PROFILE_480P = 40;
        public static final int VIDEO_PROFILE_480P_3 = 42;
        public static final int VIDEO_PROFILE_480P_4 = 43;
        public static final int VIDEO_PROFILE_480P_6 = 45;
        public static final int VIDEO_PROFILE_480P_8 = 47;
        public static final int VIDEO_PROFILE_480P_9 = 48;
        public static final int VIDEO_PROFILE_4K = 70;
        public static final int VIDEO_PROFILE_4K_3 = 72;
        public static final int VIDEO_PROFILE_720P = 50;
        public static final int VIDEO_PROFILE_720P_3 = 52;
        public static final int VIDEO_PROFILE_720P_5 = 54;
        public static final int VIDEO_PROFILE_720P_6 = 55;
        public static final int VIDEO_PROFILE_DEFAULT = 30;
    }

    public static class VideoRenderingTracingInfo {
        public int elapsedTime;
        public int join2JoinSuccess;
        public int joinSuccess2RemoteJoined;
        public int remoteJoined2PacketReceived;
        public int remoteJoined2SetView;
        public int remoteJoined2UnmuteVideo;
        public int start2JoinChannel;
    }

    public static class WarnCode {
        public static final int WARN_ADM_RECORD_AUDIO_SILENCE = 1019;
        public static final int WARN_ADM_RECORD_IS_OCCUPIED = 1033;
        public static final int WARN_ADM_RUNTIME_PLAYOUT_WARNING = 1014;
        public static final int WARN_ADM_RUNTIME_RECORDING_WARNING = 1016;
        public static final int WARN_APM_HOWLING = 1051;
        public static final int WARN_AUDIO_MIXING_OPEN_ERROR = 701;
        public static final int WARN_INIT_VIDEO = 16;
        public static final int WARN_INVALID_VIEW = 8;
        public static final int WARN_LOOKUP_CHANNEL_REJECTED = 105;
        public static final int WARN_LOOKUP_CHANNEL_TIMEOUT = 104;
        public static final int WARN_NO_AVAILABLE_CHANNEL = 103;
        public static final int WARN_OPEN_CHANNEL_INVALID_TICKET = 121;
        public static final int WARN_OPEN_CHANNEL_REJECTED = 107;
        public static final int WARN_OPEN_CHANNEL_TIMEOUT = 106;
        public static final int WARN_OPEN_CHANNEL_TRY_NEXT_VOS = 122;
        public static final int WARN_PENDING = 20;
    }

    public static class WlAccStats {
        public int e2eDelayPercent;
        public int frozenRatioPercent;
        public int lossRatePercent;
    }

    public void onActiveSpeaker(int uid) {
    }

    public void onAudioEffectFinished(int soundId) {
    }

    public void onAudioMetadataReceived(int uid, byte[] data) {
    }

    @Deprecated
    public void onAudioMixingFinished() {
    }

    public void onAudioMixingPositionChanged(long position) {
    }

    public void onAudioMixingStateChanged(int state, int reason) {
    }

    public void onAudioPublishStateChanged(String channel, int oldState, int newState, int elapseSinceLastState) {
    }

    public void onAudioQuality(int uid, int quality, short delay, short lost) {
    }

    public void onAudioRouteChanged(int routing) {
    }

    public void onAudioSubscribeStateChanged(String channel, int uid, int oldState, int newState, int elapseSinceLastState) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] speakers, int totalVolume) {
    }

    public void onCameraExposureAreaChanged(Rect rect) {
    }

    public void onCameraFocusAreaChanged(Rect rect) {
    }

    @Deprecated
    public void onCameraReady() {
    }

    public void onChannelMediaRelayStateChanged(int state, int code) {
    }

    public void onClientRoleChangeFailed(int reason, int currentRole) {
    }

    public void onClientRoleChanged(int oldRole, int newRole, ClientRoleOptions newRoleOptions) {
    }

    public void onConnectionBanned() {
    }

    public void onConnectionInterrupted() {
    }

    public void onConnectionLost() {
    }

    public void onConnectionStateChanged(int state, int reason) {
    }

    public void onContentInspectResult(int result) {
    }

    public void onDownlinkNetworkInfoUpdated(DownlinkNetworkInfo info) {
    }

    public void onEncryptionError(int errorType) {
    }

    public void onError(int err) {
    }

    public void onFacePositionChanged(int imageWidth, int imageHeight, AgoraFacePositionInfo[] faceRectArr) {
    }

    public void onFirstLocalAudioFramePublished(int elapsed) {
    }

    public void onFirstLocalVideoFrame(Constants.VideoSourceType source, int width, int height, int elapsed) {
    }

    public void onFirstLocalVideoFramePublished(Constants.VideoSourceType source, int elapsed) {
    }

    public void onFirstRemoteAudioDecoded(int uid, int elapsed) {
    }

    public void onFirstRemoteAudioFrame(int uid, int elapsed) {
    }

    public void onFirstRemoteVideoDecoded(int uid, int width, int height, int elapsed) {
    }

    public void onFirstRemoteVideoFrame(int uid, int width, int height, int elapsed) {
    }

    public void onIntraRequestReceived() {
    }

    public void onJoinChannelSuccess(String channel, int uid, int elapsed) {
    }

    public void onLastmileProbeResult(LastmileProbeResult result) {
    }

    public void onLastmileQuality(int quality) {
    }

    public void onLeaveChannel(RtcStats stats) {
    }

    public void onLicenseValidationFailure(int error) {
    }

    public void onLocalAudioStateChanged(int state, int reason) {
    }

    public void onLocalAudioStats(LocalAudioStats stats) {
    }

    public void onLocalPublishFallbackToAudioOnly(boolean isFallbackOrRecover) {
    }

    public void onLocalUserRegistered(int uid, String userAccount) {
    }

    public void onLocalVideoStat(int sentBitrate, int sentFrameRate) {
    }

    public void onLocalVideoStateChanged(Constants.VideoSourceType source, int state, int reason) {
    }

    public void onLocalVideoStats(Constants.VideoSourceType source, LocalVideoStats stats) {
    }

    public void onLocalVideoTranscoderError(LocalTranscoderConfiguration.TranscodingVideoStream stream, int error) {
    }

    public void onMediaEngineLoadSuccess() {
    }

    public void onMediaEngineStartCallSuccess() {
    }

    public void onNetworkQuality(int uid, int txQuality, int rxQuality) {
    }

    public void onNetworkTypeChanged(int type) {
    }

    public void onPermissionError(int permission) {
    }

    public void onProxyConnected(String channel, int uid, int proxyType, String localProxyIp, int elapsed) {
    }

    public void onRejoinChannelSuccess(String channel, int uid, int elapsed) {
    }

    public void onRemoteAudioStateChanged(int uid, int state, int reason, int elapsed) {
    }

    public void onRemoteAudioStats(RemoteAudioStats stats) {
    }

    @Deprecated
    public void onRemoteAudioTransportStats(int uid, int delay, int lost, int rxKBitRate) {
    }

    public void onRemoteSubscribeFallbackToAudioOnly(int uid, boolean isFallbackOrRecover) {
    }

    public void onRemoteVideoStat(int uid, int delay, int receivedBitrate, int receivedFrameRate) {
    }

    public void onRemoteVideoStateChanged(int uid, int state, int reason, int elapsed) {
    }

    public void onRemoteVideoStats(RemoteVideoStats stats) {
    }

    @Deprecated
    public void onRemoteVideoTransportStats(int uid, int delay, int lost, int rxKBitRate) {
    }

    public void onRequestToken() {
    }

    public void onRhythmPlayerStateChanged(int state, int reason) {
    }

    public void onRtcStats(RtcStats stats) {
    }

    public void onRtmpStreamingEvent(String url, int event) {
    }

    public void onRtmpStreamingStateChanged(String url, int state, int reason) {
    }

    public void onSnapshotTaken(int uid, String filePath, int width, int height, int errCode) {
    }

    public void onStreamMessage(int uid, int streamId, byte[] data) {
    }

    public void onStreamMessageError(int uid, int streamId, int error, int missed, int cached) {
    }

    public void onTokenPrivilegeWillExpire(String token) {
    }

    public void onTranscodedStreamLayoutInfo(int uid, VideoLayoutInfo info) {
    }

    public void onTranscodingUpdated() {
    }

    public void onUplinkNetworkInfoUpdated(UplinkNetworkInfo info) {
    }

    public void onUploadLogResult(String requestId, boolean success, int reason) {
    }

    @Deprecated
    public void onUserEnableLocalVideo(int uid, boolean enabled) {
    }

    public void onUserEnableVideo(int uid, boolean enabled) {
    }

    public void onUserInfoUpdated(int uid, UserInfo userInfo) {
    }

    public void onUserJoined(int uid, int elapsed) {
    }

    public void onUserMuteAudio(int uid, boolean muted) {
    }

    public void onUserMuteVideo(int uid, boolean muted) {
    }

    public void onUserOffline(int uid, int reason) {
    }

    public void onUserStateChanged(int uid, int state) {
    }

    public void onVideoPublishStateChanged(Constants.VideoSourceType source, String channel, int oldState, int newState, int elapseSinceLastState) {
    }

    public void onVideoRenderingTracingResult(int uid, Constants.MEDIA_TRACE_EVENT currentEvent, VideoRenderingTracingInfo tracingInfo) {
    }

    public void onVideoSizeChanged(Constants.VideoSourceType source, int uid, int width, int height, int rotation) {
    }

    @Deprecated
    public void onVideoStopped() {
    }

    public void onVideoSubscribeStateChanged(String channel, int uid, int oldState, int newState, int elapseSinceLastState) {
    }

    public void onWlAccMessage(int reason, int action, String wlAccMsg) {
    }

    public void onWlAccStats(WlAccStats currentStats, WlAccStats averageStats) {
    }
}
