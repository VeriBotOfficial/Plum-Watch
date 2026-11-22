package io.agora.rtc2.internal;

import android.graphics.Rect;
import android.text.TextUtils;
import io.agora.rtc2.Constants;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.LocalAudioMixerConfiguration;
import io.agora.rtc2.LocalTranscoderConfiguration;
import io.agora.rtc2.live.LiveInjectStreamConfig;
import io.agora.rtc2.live.LiveTranscoding;
import io.agora.rtc2.video.AgoraImage;
import io.agora.rtc2.video.ContentInspectConfig;
import io.agora.rtc2.video.VideoCompositingLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public class RtcEngineMessage {

    public static class PActiveSpeaker extends Marshallable {
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
        }
    }

    public static class PAudioMetadataReceived extends Marshallable {
        byte[] payload;
        int uid;
        String userAccount;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.userAccount = popString16UTF8();
            this.payload = popBytes();
        }
    }

    public static class PAudioMixingPositionChanged extends Marshallable {
        long position;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.position = popInt64();
        }
    }

    public static class PAudioMixingStateChanged extends Marshallable {
        int reasonCode;
        int state;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.state = popInt();
            this.reasonCode = popInt();
        }
    }

    public static class PAudioRoutingChanged extends Marshallable {
        int routing;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.routing = popInt();
        }
    }

    public static class PCameraExposureAreaChanged extends Marshallable {
        public int height;
        public int width;
        public int x;
        public int y;

        Rect getRect() {
            int i = this.x;
            int i2 = this.y;
            return new Rect(i, i2, this.width + i, this.height + i2);
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.x);
            pushInt(this.y);
            pushInt(this.width);
            pushInt(this.height);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.x = popInt();
            this.y = popInt();
            this.width = popInt();
            this.height = popInt();
        }
    }

    public static class PCameraFocusAreaChanged extends Marshallable {
        public int height;
        public int width;
        public int x;
        public int y;

        Rect getRect() {
            int i = this.x;
            int i2 = this.y;
            return new Rect(i, i2, this.width + i, this.height + i2);
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.x);
            pushInt(this.y);
            pushInt(this.width);
            pushInt(this.height);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.x = popInt();
            this.y = popInt();
            this.width = popInt();
            this.height = popInt();
        }
    }

    public static class PClientRoleChangeFailed extends Marshallable {
        int currentRole;
        int reason;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.reason = popInt();
            this.currentRole = popInt();
        }
    }

    public static class PClientRoleChanged extends Marshallable {
        int newRole;
        int newRoleLatencyLevel;
        int oldRole;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.oldRole = popInt();
            this.newRole = popInt();
            this.newRoleLatencyLevel = popInt();
        }
    }

    public static class PConnectionState extends Marshallable {
        public int reason;
        public int state;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.state);
            pushInt(this.reason);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.state = popInt();
            this.reason = popInt();
        }
    }

    public static class PContentInspectConfig extends Marshallable {
        private void marshall(Marshallable m, ContentInspectConfig config) {
            if (config == null || config.moduleCount <= 0 || config.moduleCount > 32) {
                return;
            }
            m.pushString16(config.extraInfo);
            m.pushString16(config.serverConfig);
            pushShort((short) config.moduleCount);
            for (int i = 0; i < config.moduleCount; i++) {
                m.pushInt(config.modules[i].type);
                m.pushInt(config.modules[i].interval);
            }
        }

        public byte[] marshall(ContentInspectConfig config) {
            marshall(this, config);
            return super.marshall();
        }
    }

    public static class PContentInspectResult extends Marshallable {
        public int result;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.result);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.result = popInt();
        }
    }

    public static class PCrossChannelEvent extends Marshallable {
        public int code;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.code);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.code = popInt();
        }
    }

    public static class PCrossChannelState extends Marshallable {
        public int code;
        public int state;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.state);
            pushInt(this.code);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.state = popInt();
            this.code = popInt();
        }
    }

    public static class PDownlinkNetworkInfoUpdated extends Marshallable {
        int bandwidth_estimation_bps;
        int lastmile_buffer_delay_time_ms;

        public IRtcEngineEventHandler.DownlinkNetworkInfo getDownlinkNetworkInfo() {
            IRtcEngineEventHandler.DownlinkNetworkInfo downlinkNetworkInfo = new IRtcEngineEventHandler.DownlinkNetworkInfo();
            downlinkNetworkInfo.lastmile_buffer_delay_time_ms = this.lastmile_buffer_delay_time_ms;
            downlinkNetworkInfo.bandwidth_estimation_bps = this.bandwidth_estimation_bps;
            return downlinkNetworkInfo;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.lastmile_buffer_delay_time_ms = popInt();
            this.bandwidth_estimation_bps = popInt();
        }
    }

    public static class PEncryptionError extends Marshallable {
        int errorType;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.errorType);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.errorType = popInt();
        }
    }

    public static class PError extends Marshallable {
        public int err;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.err = popInt();
        }
    }

    public static class PFacePositionChanged extends Marshallable {
        public int imageHeight;
        public int imageWidth;
        public int num;
        FaceRect[] rectArr = null;
        int[] disArr = null;

        public static class FaceRect {
            public int height;
            public int width;
            public int x;
            public int y;
        }

        IRtcEngineEventHandler.AgoraFacePositionInfo[] getAgoraFacePositionInfo() {
            FaceRect[] faceRectArr = this.rectArr;
            int i = 0;
            if (faceRectArr == null || faceRectArr.length <= 0) {
                return new IRtcEngineEventHandler.AgoraFacePositionInfo[0];
            }
            IRtcEngineEventHandler.AgoraFacePositionInfo[] agoraFacePositionInfoArr = new IRtcEngineEventHandler.AgoraFacePositionInfo[faceRectArr.length];
            while (true) {
                FaceRect[] faceRectArr2 = this.rectArr;
                if (i >= faceRectArr2.length) {
                    return agoraFacePositionInfoArr;
                }
                FaceRect faceRect = faceRectArr2[i];
                IRtcEngineEventHandler.AgoraFacePositionInfo agoraFacePositionInfo = new IRtcEngineEventHandler.AgoraFacePositionInfo();
                agoraFacePositionInfo.x = faceRect.x;
                agoraFacePositionInfo.y = faceRect.y;
                agoraFacePositionInfo.width = faceRect.width;
                agoraFacePositionInfo.height = faceRect.height;
                agoraFacePositionInfo.distance = this.disArr[i];
                agoraFacePositionInfoArr[i] = agoraFacePositionInfo;
                i++;
            }
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.imageWidth = popInt();
            this.imageHeight = popInt();
            int popShort = popShort();
            if (popShort > 0) {
                this.rectArr = new FaceRect[popShort];
                for (int i = 0; i < popShort; i++) {
                    this.rectArr[i] = new FaceRect();
                    this.rectArr[i].x = popInt();
                    this.rectArr[i].y = popInt();
                    this.rectArr[i].width = popInt();
                    this.rectArr[i].height = popInt();
                }
            }
            int popShort2 = popShort();
            if (popShort2 > 0) {
                this.disArr = new int[popShort2];
                for (int i2 = 0; i2 < popShort2; i2++) {
                    this.disArr[i2] = popInt();
                }
            }
        }
    }

    public static class PFirstLocalAudioFrame extends Marshallable {
        public int elapsed;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.elapsed = popInt();
        }
    }

    public static class PFirstLocalVideoFrame extends Marshallable {
        public int elapsed;
        public int height;
        public int source;
        public int width;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushByte((byte) this.source);
            pushInt(this.width);
            pushInt(this.height);
            pushInt(this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.source = popByte();
            this.width = popInt();
            this.height = popInt();
            this.elapsed = popInt();
        }
    }

    public static class PFirstLocalVideoFramePublished extends Marshallable {
        public int elapsed;
        public int source;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushByte((byte) this.source);
            pushInt(this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.source = popByte();
            this.elapsed = popInt();
        }
    }

    public static class PFirstRemoteAudioDecoded extends Marshallable {
        public int elapsed;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushInt(this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.elapsed = popInt();
        }
    }

    public static class PFirstRemoteAudioFrame extends Marshallable {
        public int elapsed;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushInt(this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.elapsed = popInt();
        }
    }

    public static class PFirstRemoteVideoDecoded extends Marshallable {
        public int elapsed;
        public int height;
        public int uid;
        public int width;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushInt(this.width);
            pushInt(this.height);
            pushInt(this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.width = popInt();
            this.height = popInt();
            this.elapsed = popInt();
        }
    }

    public static class PFirstRemoteVideoFrame extends Marshallable {
        public int elapsed;
        public int height;
        public int uid;
        public int width;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushInt(this.width);
            pushInt(this.height);
            pushInt(this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.width = popInt();
            this.height = popInt();
            this.elapsed = popInt();
        }
    }

    public static class PHostInRequest extends Marshallable {
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
        }
    }

    public static class PHostInResponse extends Marshallable {
        public boolean accepted;
        public int error;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.accepted = popBool().booleanValue();
            this.error = popInt();
        }
    }

    public static class PHostInStopped extends Marshallable {
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
        }
    }

    public static class PInjectStreamConfig extends Marshallable {
        private static final short SERVER_TYPE = 0;
        private static final short URI = 25;

        private void marshall(Marshallable m, LiveInjectStreamConfig config) {
            m.pushShort((short) 0);
            m.pushShort((short) 25);
            m.pushInt(config.width);
            m.pushInt(config.height);
            m.pushInt(config.videoGop);
            m.pushInt(config.videoFramerate);
            m.pushInt(config.videoBitrate);
            m.pushInt(LiveInjectStreamConfig.AudioSampleRateType.getValue(config.audioSampleRate));
            m.pushInt(config.audioBitrate);
            m.pushInt(config.audioChannels);
        }

        public byte[] marshall(LiveInjectStreamConfig config) {
            marshall(this, config);
            return super.marshall();
        }
    }

    public static class PLayout extends Marshallable {
    }

    public static class PLicenseVerifyFailed extends Marshallable {
        int reason;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.reason = popInt();
        }
    }

    public static class PLiveTranscoding extends Marshallable {
        private static final short SERVER_TYPE = 0;
        private static final short URI = 23;

        private void marshall(Marshallable m, LiveTranscoding transcoding) {
            m.pushShort((short) 0);
            m.pushShort((short) 23);
            m.pushInt(transcoding.width);
            m.pushInt(transcoding.height);
            m.pushInt(transcoding.videoGop);
            m.pushInt(transcoding.videoFramerate);
            m.pushInt(LiveTranscoding.VideoCodecProfileType.getValue(transcoding.videoCodecProfile));
            m.pushInt(LiveTranscoding.VideoCodecType.getValue(transcoding.videoCodecType));
            m.pushInt(transcoding.videoBitrate);
            marshallWatermarks(m, transcoding.getWatermarkList());
            marshallBackgroundImage(m, transcoding.getBackgroundImageList());
            m.pushBool(Boolean.valueOf(transcoding.lowLatency));
            m.pushInt(LiveTranscoding.AudioSampleRateType.getValue(transcoding.audioSampleRate));
            m.pushInt(transcoding.audioBitrate);
            m.pushInt(transcoding.audioChannels);
            m.pushInt(LiveTranscoding.AudioCodecProfileType.getValue(transcoding.audioCodecProfile));
            m.pushInt(transcoding.backgroundColor & 16777215);
            if (TextUtils.isEmpty(transcoding.userConfigExtraInfo)) {
                transcoding.userConfigExtraInfo = "";
            }
            m.pushString16(transcoding.userConfigExtraInfo);
            if (TextUtils.isEmpty(transcoding.metadata)) {
                transcoding.metadata = "";
            }
            m.pushString16(transcoding.metadata);
            pushShort((short) transcoding.getAdvancedFeatures().size());
            for (Map.Entry<String, Boolean> entry : transcoding.getAdvancedFeatures().entrySet()) {
                m.pushString16(entry.getKey());
                m.pushBool(entry.getValue());
            }
            pushShort((short) transcoding.getUserCount());
            Iterator<LiveTranscoding.TranscodingUser> it = transcoding.getUsers().iterator();
            while (it.hasNext()) {
                marshallUserConfig(m, it.next());
            }
        }

        private void marshallBackgroundImage(Marshallable m, ArrayList<AgoraImage> backgroundImageList) {
            if (backgroundImageList == null) {
                pushShort((short) 0);
                return;
            }
            pushShort((short) backgroundImageList.size());
            Iterator<AgoraImage> it = backgroundImageList.iterator();
            while (it.hasNext()) {
                marshallImage(m, it.next());
            }
        }

        private void marshallImage(Marshallable m, AgoraImage image) {
            m.pushString16(image.url);
            m.pushInt(image.x);
            m.pushInt(image.y);
            m.pushInt(image.width);
            m.pushInt(image.height);
            m.pushInt(image.zOrder);
            m.pushDouble(image.alpha);
        }

        private void marshallUserConfig(Marshallable m, LiveTranscoding.TranscodingUser user) {
            m.pushInt(user.uid);
            String str = user.userId;
            if (str == null) {
                str = "";
            }
            m.pushString16(str);
            m.pushInt(user.x);
            m.pushInt(user.y);
            m.pushInt(user.width);
            m.pushInt(user.height);
            m.pushInt(user.zOrder);
            m.pushDouble(user.alpha);
            m.pushInt(user.audioChannel);
        }

        private void marshallWatermarks(Marshallable m, ArrayList<AgoraImage> watermarkList) {
            if (watermarkList == null) {
                pushShort((short) 0);
                return;
            }
            pushShort((short) watermarkList.size());
            Iterator<AgoraImage> it = watermarkList.iterator();
            while (it.hasNext()) {
                marshallImage(m, it.next());
            }
        }

        public byte[] marshall(LiveTranscoding transcoding) {
            marshall(this, transcoding);
            return super.marshall();
        }
    }

    public static class PLocalAudioMixedTrackConfiguration extends Marshallable {
        private void marshall(Marshallable m, LocalAudioMixerConfiguration localAudioMixerConfiguration) {
            m.pushInt(localAudioMixerConfiguration.audioInputStreams.size());
            m.pushBool(Boolean.valueOf(localAudioMixerConfiguration.syncWithLocalMic));
            marshallMixedAudioStream(m, localAudioMixerConfiguration.audioInputStreams);
        }

        private void marshallLocalAudioMixedStream(Marshallable m, LocalAudioMixerConfiguration.MixedAudioStream audioStream) {
            m.pushInt(Constants.AudioSourceType.getValue(audioStream.sourceType));
            m.pushInt(audioStream.remoteUserUid);
            m.pushString16(audioStream.channelId);
            m.pushInt(audioStream.trackId);
        }

        private void marshallMixedAudioStream(Marshallable m, ArrayList<LocalAudioMixerConfiguration.MixedAudioStream> audioInputStreams) {
            Iterator<LocalAudioMixerConfiguration.MixedAudioStream> it = audioInputStreams.iterator();
            while (it.hasNext()) {
                marshallLocalAudioMixedStream(m, it.next());
            }
        }

        public byte[] marshall(LocalAudioMixerConfiguration localAudioMixerConfiguration) {
            marshall(this, localAudioMixerConfiguration);
            return super.marshall();
        }
    }

    public static class PLocalAudioStat extends Marshallable {
        public IRtcEngineEventHandler.LocalAudioStats stats = new IRtcEngineEventHandler.LocalAudioStats();

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.stats.numChannels);
            pushInt(this.stats.sentSampleRate);
            pushInt(this.stats.sentBitrate);
            pushInt(this.stats.internalCodec);
            pushShort((short) this.stats.txPacketLossRate);
            pushInt(this.stats.audioDeviceDelay);
            pushInt(this.stats.audioPlayoutDelay);
            pushInt(this.stats.earMonitorDelay);
            pushInt(this.stats.aecEstimatedDelay);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.stats.numChannels = popInt();
            this.stats.sentSampleRate = popInt();
            this.stats.sentBitrate = popInt();
            this.stats.internalCodec = popInt();
            this.stats.txPacketLossRate = popShort();
            this.stats.audioDeviceDelay = popInt();
            this.stats.audioPlayoutDelay = popInt();
            this.stats.earMonitorDelay = popInt();
            this.stats.aecEstimatedDelay = popInt();
        }
    }

    public static class PLocalAudioState extends Marshallable {
        public int errorCode;
        public int state;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushByte((byte) this.state);
            pushByte((byte) this.errorCode);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.state = popByte();
            this.errorCode = popByte();
        }
    }

    public static class PLocalFallbackStatus extends Marshallable {
        boolean state;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.state = popBool().booleanValue();
        }
    }

    public static class PLocalLiveTranscoderConfiguration extends Marshallable {
        private void marshall(Marshallable m, LocalTranscoderConfiguration localTranscoderConfiguration) {
            m.pushInt(localTranscoderConfiguration.transcodingVideoStreams.size());
            m.pushBool(Boolean.valueOf(localTranscoderConfiguration.syncWithPrimaryCamera));
            marshallVideoEncoderConfiguration(m, localTranscoderConfiguration);
            marshallTranscodingVideoStream(m, localTranscoderConfiguration.transcodingVideoStreams);
        }

        private void marshallLocalTranscodingVideoStream(Marshallable m, LocalTranscoderConfiguration.TranscodingVideoStream transcodingVideoStream) {
            m.pushInt(Constants.VideoSourceType.getValue(transcodingVideoStream.sourceType));
            m.pushInt(transcodingVideoStream.remoteUserUid);
            m.pushString16("");
            m.pushString16(transcodingVideoStream.imageUrl);
            m.pushInt(transcodingVideoStream.mediaPlayerId);
            m.pushInt(transcodingVideoStream.x);
            m.pushInt(transcodingVideoStream.y);
            m.pushInt(transcodingVideoStream.width);
            m.pushInt(transcodingVideoStream.height);
            m.pushInt(transcodingVideoStream.zOrder);
            m.pushDouble(transcodingVideoStream.alpha);
            m.pushBool(Boolean.valueOf(transcodingVideoStream.mirror));
        }

        private void marshallTranscodingVideoStream(Marshallable m, ArrayList<LocalTranscoderConfiguration.TranscodingVideoStream> transcodingVideoStreams) {
            pushShort((short) transcodingVideoStreams.size());
            Iterator<LocalTranscoderConfiguration.TranscodingVideoStream> it = transcodingVideoStreams.iterator();
            while (it.hasNext()) {
                marshallLocalTranscodingVideoStream(m, it.next());
            }
        }

        private void marshallVideoEncoderConfiguration(Marshallable m, LocalTranscoderConfiguration localTranscoderConfiguration) {
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.dimensions.width);
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.dimensions.height);
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.frameRate);
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.bitrate);
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.minBitrate);
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.orientationMode.getValue());
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.mirrorMode.getValue());
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.degradationPrefer.getValue());
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.advanceOptions.compressionPreference.getValue());
            m.pushInt(localTranscoderConfiguration.videoOutputConfiguration.advanceOptions.encodingPreference.getValue());
        }

        public byte[] marshall(LocalTranscoderConfiguration localTranscoderConfiguration) {
            marshall(this, localTranscoderConfiguration);
            return super.marshall();
        }
    }

    public static class PLocalVideoStat extends Marshallable {
        public int source;
        public IRtcEngineEventHandler.LocalVideoStats stats = new IRtcEngineEventHandler.LocalVideoStats();

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushByte((byte) this.source);
            pushInt(this.stats.uid);
            pushInt(this.stats.sentBitrate);
            pushInt(this.stats.sentFrameRate);
            pushInt(this.stats.captureFrameRate);
            pushInt(this.stats.regulatedCaptureFrameRate);
            pushInt(this.stats.captureFrameWidth);
            pushInt(this.stats.captureFrameHeight);
            pushInt(this.stats.regulatedCaptureFrameWidth);
            pushInt(this.stats.regulatedCaptureFrameHeight);
            pushInt(this.stats.encoderOutputFrameRate);
            pushInt(this.stats.rendererOutputFrameRate);
            pushInt(this.stats.targetBitrate);
            pushInt(this.stats.targetFrameRate);
            pushInt(this.stats.encodedBitrate);
            pushInt(this.stats.encodedFrameWidth);
            pushInt(this.stats.encodedFrameHeight);
            pushInt(this.stats.encodedFrameCount);
            pushInt(this.stats.codecType);
            pushInt(this.stats.qualityAdaptIndication);
            pushShort((short) this.stats.txPacketLossRate);
            pushInt(this.stats.captureBrightnessLevel);
            pushBool(Boolean.valueOf(this.stats.dualStreamEnabled));
            pushInt(this.stats.hwEncoderAccelerating);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.source = popByte();
            this.stats.uid = popInt();
            this.stats.sentBitrate = popInt();
            this.stats.sentFrameRate = popInt();
            this.stats.captureFrameRate = popInt();
            this.stats.regulatedCaptureFrameRate = popInt();
            this.stats.captureFrameWidth = popInt();
            this.stats.captureFrameHeight = popInt();
            this.stats.regulatedCaptureFrameWidth = popInt();
            this.stats.regulatedCaptureFrameHeight = popInt();
            this.stats.encoderOutputFrameRate = popInt();
            this.stats.rendererOutputFrameRate = popInt();
            this.stats.targetBitrate = popInt();
            this.stats.targetFrameRate = popInt();
            this.stats.encodedBitrate = popInt();
            this.stats.encodedFrameWidth = popInt();
            this.stats.encodedFrameHeight = popInt();
            this.stats.encodedFrameCount = popInt();
            this.stats.codecType = popInt();
            this.stats.qualityAdaptIndication = popInt();
            this.stats.txPacketLossRate = popShort();
            this.stats.captureBrightnessLevel = popInt();
            this.stats.dualStreamEnabled = popBool().booleanValue();
            this.stats.hwEncoderAccelerating = popInt();
        }
    }

    public static class PLocalVideoState extends Marshallable {
        public int errorCode;
        public int source;
        public int state;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushByte((byte) this.source);
            pushByte((byte) this.state);
            pushByte((byte) this.errorCode);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.source = popByte();
            this.state = popByte();
            this.errorCode = popByte();
        }
    }

    public static class PMediaEngineEvent extends Marshallable {
        int code;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.code = popInt();
        }
    }

    public static class PMediaResAudioEffectFinished extends Marshallable {
        int soundId;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.soundId = popInt();
        }
    }

    public static class PMediaResAudioQuality extends Marshallable {
        short delay;
        short lost;
        int quality;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.quality = popInt();
            this.delay = popShort();
            this.lost = popShort();
        }
    }

    public static class PMediaResJoinMedia extends Marshallable {
        public String channel;
        public int elapsed;
        public boolean firstSuccess;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.channel = popString16UTF8();
            this.uid = popInt();
            this.elapsed = popInt();
            this.firstSuccess = popBool().booleanValue();
        }
    }

    public static class PMediaResLastmileProbeResult extends Marshallable {
        LastmileProbeOneWayResult downlinkReport;
        int rtt;
        short state;
        LastmileProbeOneWayResult uplinkReport;

        public static class LastmileProbeOneWayResult {
            public int availableBandwidth;
            public int jitter;
            public int packetLossRate;
        }

        public IRtcEngineEventHandler.LastmileProbeResult getLastmileProbeResult() {
            IRtcEngineEventHandler.LastmileProbeResult lastmileProbeResult = new IRtcEngineEventHandler.LastmileProbeResult();
            lastmileProbeResult.state = this.state;
            lastmileProbeResult.rtt = this.rtt;
            lastmileProbeResult.uplinkReport.packetLossRate = this.uplinkReport.packetLossRate;
            lastmileProbeResult.uplinkReport.jitter = this.uplinkReport.jitter;
            lastmileProbeResult.uplinkReport.availableBandwidth = this.uplinkReport.availableBandwidth;
            lastmileProbeResult.downlinkReport.packetLossRate = this.downlinkReport.packetLossRate;
            lastmileProbeResult.downlinkReport.jitter = this.downlinkReport.jitter;
            lastmileProbeResult.downlinkReport.availableBandwidth = this.downlinkReport.availableBandwidth;
            return lastmileProbeResult;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushShort(this.state);
            pushInt(this.uplinkReport.packetLossRate);
            pushInt(this.uplinkReport.jitter);
            pushInt(this.uplinkReport.availableBandwidth);
            pushInt(this.downlinkReport.packetLossRate);
            pushInt(this.downlinkReport.jitter);
            pushInt(this.downlinkReport.availableBandwidth);
            pushInt(this.rtt);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.state = popShort();
            this.uplinkReport = new LastmileProbeOneWayResult();
            this.downlinkReport = new LastmileProbeOneWayResult();
            this.uplinkReport.packetLossRate = popInt();
            this.uplinkReport.jitter = popInt();
            this.uplinkReport.availableBandwidth = popInt();
            this.downlinkReport.packetLossRate = popInt();
            this.downlinkReport.jitter = popInt();
            this.downlinkReport.availableBandwidth = popInt();
            this.rtt = popInt();
        }
    }

    public static class PMediaResLastmileQuality extends Marshallable {
        int quality;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.quality = popInt();
        }
    }

    public static class PMediaResNetworkQuality extends Marshallable {
        int rxQuality;
        int txQuality;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.txQuality = popInt();
            this.rxQuality = popInt();
        }
    }

    public static class PMediaResRtcStats extends Marshallable {
        int connectTimeMs;
        int cpuAppUsage;
        int cpuTotalUsage;
        int gatewayRtt;
        int lastmileDelay;
        int memoryAppUsageInKbytes;
        double memoryAppUsageRatio;
        double memoryTotalUsageRatio;
        int rxAudioBytes;
        int rxAudioKBitRate;
        int rxKBitRate;
        int rxPacketLossRate;
        int rxVideoBytes;
        int rxVideoKBitRate;
        int totalDuration;
        int totalRxBytes;
        int totalTxBytes;
        int txAudioBytes;
        int txAudioKBitRate;
        int txKBitRate;
        int txPacketLossRate;
        int txVideoBytes;
        int txVideoKBitRate;
        int users;

        public IRtcEngineEventHandler.RtcStats getRtcStats() {
            IRtcEngineEventHandler.RtcStats rtcStats = new IRtcEngineEventHandler.RtcStats();
            rtcStats.totalDuration = this.totalDuration;
            rtcStats.txBytes = this.totalTxBytes;
            rtcStats.rxBytes = this.totalRxBytes;
            rtcStats.txAudioBytes = this.txAudioBytes;
            rtcStats.rxAudioBytes = this.rxAudioBytes;
            rtcStats.txVideoBytes = this.txVideoBytes;
            rtcStats.rxVideoBytes = this.rxVideoBytes;
            rtcStats.txKBitRate = this.txKBitRate;
            rtcStats.rxKBitRate = this.rxKBitRate;
            rtcStats.txAudioKBitRate = this.txAudioKBitRate;
            rtcStats.rxAudioKBitRate = this.rxAudioKBitRate;
            rtcStats.txVideoKBitRate = this.txVideoKBitRate;
            rtcStats.rxVideoKBitRate = this.rxVideoKBitRate;
            rtcStats.lastmileDelay = this.lastmileDelay;
            rtcStats.users = this.users;
            rtcStats.cpuTotalUsage = this.cpuTotalUsage / 100.0d;
            rtcStats.gatewayRtt = this.gatewayRtt;
            rtcStats.cpuAppUsage = this.cpuAppUsage / 100.0d;
            rtcStats.connectTimeMs = this.connectTimeMs;
            rtcStats.txPacketLossRate = this.txPacketLossRate;
            rtcStats.rxPacketLossRate = this.rxPacketLossRate;
            rtcStats.memoryAppUsageRatio = this.memoryAppUsageRatio;
            rtcStats.memoryTotalUsageRatio = this.memoryTotalUsageRatio;
            rtcStats.memoryAppUsageInKbytes = this.memoryAppUsageInKbytes;
            return rtcStats;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.totalDuration = popInt();
            this.totalTxBytes = popInt();
            this.totalRxBytes = popInt();
            this.txAudioBytes = popInt();
            this.rxAudioBytes = popInt();
            this.txVideoBytes = popInt();
            this.rxVideoBytes = popInt();
            this.txKBitRate = popShort();
            this.rxKBitRate = popShort();
            this.txAudioKBitRate = popShort();
            this.rxAudioKBitRate = popShort();
            this.txVideoKBitRate = popShort();
            this.rxVideoKBitRate = popShort();
            this.lastmileDelay = popShort();
            this.txPacketLossRate = popInt();
            this.rxPacketLossRate = popInt();
            this.cpuTotalUsage = popInt();
            this.gatewayRtt = popInt();
            this.cpuAppUsage = popInt();
            this.memoryAppUsageRatio = popDouble();
            this.memoryTotalUsageRatio = popDouble();
            this.memoryAppUsageInKbytes = popInt();
            this.users = popInt();
            this.connectTimeMs = popInt();
        }
    }

    public static class PMediaResSpeakersReport extends Marshallable {
        int mixVolume;
        Speaker[] speakers;

        public static class Speaker {
            public int uid;
            public int vad;
            public double voicePitch;
            public int volume;
        }

        public IRtcEngineEventHandler.AudioVolumeInfo[] getAudioVolumeInfo() {
            Speaker[] speakerArr = this.speakers;
            if (speakerArr == null || speakerArr.length <= 0) {
                return new IRtcEngineEventHandler.AudioVolumeInfo[0];
            }
            IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRtcEngineEventHandler.AudioVolumeInfo[speakerArr.length];
            for (int i = 0; i < this.speakers.length; i++) {
                IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = new IRtcEngineEventHandler.AudioVolumeInfo();
                audioVolumeInfoArr[i] = audioVolumeInfo;
                audioVolumeInfo.vad = this.speakers[i].vad;
                audioVolumeInfoArr[i].volume = this.speakers[i].volume;
                audioVolumeInfoArr[i].voicePitch = this.speakers[i].voicePitch;
                audioVolumeInfoArr[i].uid = this.speakers[i].uid;
            }
            return audioVolumeInfoArr;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.mixVolume);
            int length = this.speakers.length;
            pushShort((short) length);
            for (int i = 0; i < length; i++) {
                pushInt(this.speakers[i].uid);
                pushInt(this.speakers[i].volume);
                pushInt(this.speakers[i].vad);
                pushDouble(this.speakers[i].voicePitch);
            }
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.mixVolume = popInt();
            int popShort = popShort();
            if (popShort > 0) {
                this.speakers = new Speaker[popShort];
                for (int i = 0; i < popShort; i++) {
                    this.speakers[i] = new Speaker();
                    this.speakers[i].uid = popInt();
                    this.speakers[i].volume = popInt();
                    this.speakers[i].vad = popInt();
                    this.speakers[i].voicePitch = popDouble();
                }
            }
        }
    }

    public static class PMediaResTransportQuality extends Marshallable {
        public int bitrate;
        public short delay;
        public boolean isAudio;
        public short lost;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.isAudio = popBool().booleanValue();
            this.uid = popInt();
            this.bitrate = popInt();
            this.delay = popShort();
            this.lost = popShort();
        }
    }

    public static class PMediaResUserJoinedEvent extends Marshallable {
        int elapsed;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.elapsed = popInt();
        }
    }

    public static class PMediaResUserOfflineEvent extends Marshallable {
        int reason;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.reason = popInt();
        }
    }

    public static class PMediaResUserState extends Marshallable {
        boolean state;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.state = popBool().booleanValue();
        }
    }

    public static class PMediaResWlAccMessage extends Marshallable {
        public int action;
        public int reason;
        public String wlAccMsg;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.reason);
            pushInt(this.action);
            pushString16(this.wlAccMsg);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.reason = popInt();
            this.action = popInt();
            this.wlAccMsg = popString16UTF8();
        }
    }

    public static class PMediaResWlAccStats extends Marshallable {
        public short e2eDelayPercentAve;
        public short e2eDelayPercentCur;
        public short frozenRatioPercentAve;
        public short frozenRatioPercentCur;
        public short lossRatePercentAve;
        public short lossRatePercentCur;

        public IRtcEngineEventHandler.WlAccStats getWlAccStatsAve() {
            IRtcEngineEventHandler.WlAccStats wlAccStats = new IRtcEngineEventHandler.WlAccStats();
            wlAccStats.e2eDelayPercent = this.e2eDelayPercentAve;
            wlAccStats.frozenRatioPercent = this.frozenRatioPercentAve;
            wlAccStats.lossRatePercent = this.lossRatePercentAve;
            return wlAccStats;
        }

        public IRtcEngineEventHandler.WlAccStats getWlAccStatsCur() {
            IRtcEngineEventHandler.WlAccStats wlAccStats = new IRtcEngineEventHandler.WlAccStats();
            wlAccStats.e2eDelayPercent = this.e2eDelayPercentCur;
            wlAccStats.frozenRatioPercent = this.frozenRatioPercentCur;
            wlAccStats.lossRatePercent = this.lossRatePercentCur;
            return wlAccStats;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushShort(this.e2eDelayPercentCur);
            pushShort(this.frozenRatioPercentCur);
            pushShort(this.lossRatePercentCur);
            pushShort(this.e2eDelayPercentAve);
            pushShort(this.frozenRatioPercentAve);
            pushShort(this.lossRatePercentAve);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.e2eDelayPercentCur = popShort();
            this.frozenRatioPercentCur = popShort();
            this.lossRatePercentCur = popShort();
            this.e2eDelayPercentAve = popShort();
            this.frozenRatioPercentAve = popShort();
            this.lossRatePercentAve = popShort();
        }
    }

    public static class PNetworkTypeChanged extends Marshallable {
        public int type;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.type);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.type = popInt();
        }
    }

    public static class PPermissionError extends Marshallable {
        int permission;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.permission);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.permission = popInt();
        }
    }

    public static class PPrivilegeWillExpire extends Marshallable {
        public String token;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushBytes(this.token.getBytes());
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.token = popString16UTF8();
        }
    }

    public static class PProxyConnect extends Marshallable {
        public String channel;
        public int elapsed;
        public String localProxyIp;
        public int proxyType;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.channel = popString16UTF8();
            this.uid = popInt();
            this.proxyType = popInt();
            this.localProxyIp = popString16UTF8();
            this.elapsed = popInt();
        }
    }

    public static class PPublishAudioStateChanged extends Marshallable {
        String channelId;
        int elapseSinceLastState;
        short newState;
        short oldState;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.channelId = popString16UTF8();
            this.oldState = popShort();
            this.newState = popShort();
            this.elapseSinceLastState = popInt();
        }
    }

    public static class PPublishVideoStateChanged extends Marshallable {
        String channelId;
        int elapseSinceLastState;
        short newState;
        short oldState;
        int source;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.source = popByte();
            this.channelId = popString16UTF8();
            this.oldState = popShort();
            this.newState = popShort();
            this.elapseSinceLastState = popInt();
        }
    }

    public static class PRemoteAudioStat extends Marshallable {
        public IRtcEngineEventHandler.RemoteAudioStats stats = new IRtcEngineEventHandler.RemoteAudioStats();

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.stats.uid);
            pushInt(this.stats.quality);
            pushInt(this.stats.networkTransportDelay);
            pushInt(this.stats.jitterBufferDelay);
            pushInt(this.stats.audioLossRate);
            pushInt(this.stats.numChannels);
            pushInt(this.stats.receivedSampleRate);
            pushInt(this.stats.receivedBitrate);
            pushInt(this.stats.totalFrozenTime);
            pushInt(this.stats.frozenRate);
            pushInt64(this.stats.totalActiveTime);
            pushInt64(this.stats.publishDuration);
            pushInt(this.stats.qoeQuality);
            pushInt(this.stats.qualityChangedReason);
            pushInt(this.stats.mosValue);
            pushInt(this.stats.frozenRateByCustomPlcCount);
            pushInt(this.stats.plcCount);
            pushInt(this.stats.rxAudioBytes);
            pushInt(this.stats.e2eDelay);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.stats.uid = popInt();
            this.stats.quality = popInt();
            this.stats.networkTransportDelay = popInt();
            this.stats.jitterBufferDelay = popInt();
            this.stats.audioLossRate = popInt();
            this.stats.numChannels = popInt();
            this.stats.receivedSampleRate = popInt();
            this.stats.receivedBitrate = popInt();
            this.stats.totalFrozenTime = popInt();
            this.stats.frozenRate = popInt();
            this.stats.totalActiveTime = popInt64();
            this.stats.publishDuration = popInt64();
            this.stats.qoeQuality = popInt();
            this.stats.qualityChangedReason = popInt();
            this.stats.mosValue = popInt();
            this.stats.frozenRateByCustomPlcCount = popInt();
            this.stats.plcCount = popInt();
            this.stats.rxAudioBytes = popInt();
            this.stats.e2eDelay = popInt();
        }
    }

    public static class PRemoteAudioState extends Marshallable {
        public int elapsed;
        public int reason;
        public int state;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushByte((byte) this.state);
            pushByte((byte) this.reason);
            pushByte((byte) this.elapsed);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.state = popByte();
            this.reason = popByte();
            this.elapsed = popInt();
        }
    }

    public static class PRemoteVideoStat extends Marshallable {
        public IRtcEngineEventHandler.RemoteVideoStats stats = new IRtcEngineEventHandler.RemoteVideoStats();

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.stats.uid);
            pushInt(this.stats.delay);
            pushInt(this.stats.e2eDelay);
            pushInt(this.stats.width);
            pushInt(this.stats.height);
            pushInt(this.stats.receivedBitrate);
            pushInt(this.stats.decoderOutputFrameRate);
            pushInt(this.stats.rendererOutputFrameRate);
            pushInt(this.stats.frameLossRate);
            pushInt(this.stats.packetLossRate);
            pushInt(this.stats.rxStreamType);
            pushInt(this.stats.totalFrozenTime);
            pushInt(this.stats.frozenRate);
            pushInt(this.stats.avSyncTimeMs);
            pushInt64(this.stats.totalActiveTime);
            pushInt64(this.stats.publishDuration);
            pushInt(this.stats.mosValue);
            pushInt(this.stats.rxVideoBytes);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.stats.uid = popInt();
            this.stats.delay = popInt();
            this.stats.e2eDelay = popInt();
            this.stats.width = popInt();
            this.stats.height = popInt();
            this.stats.receivedBitrate = popInt();
            this.stats.decoderOutputFrameRate = popInt();
            this.stats.rendererOutputFrameRate = popInt();
            this.stats.frameLossRate = popInt();
            this.stats.packetLossRate = popInt();
            this.stats.rxStreamType = popInt();
            this.stats.totalFrozenTime = popInt();
            this.stats.frozenRate = popInt();
            this.stats.avSyncTimeMs = popInt();
            this.stats.totalActiveTime = popInt64();
            this.stats.publishDuration = popInt64();
            this.stats.mosValue = popInt();
            this.stats.rxVideoBytes = popInt();
        }
    }

    public static class PRemoteVideoState extends Marshallable {
        public int elapsed;
        public int reason;
        public int state;
        public int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushInt(this.state);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.state = popByte();
            this.reason = popByte();
            this.elapsed = popInt();
        }
    }

    public static class PRhythmPlayerStateChanged extends Marshallable {
        int errorCode;
        int state;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.state = popInt();
            this.errorCode = popInt();
        }
    }

    public static class PSnapshotTaken extends Marshallable {
        public int errCode;
        public String filepath;
        public int height;
        public int uid;
        public int width;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushBytes(this.filepath.getBytes());
            pushInt(this.width);
            pushInt(this.height);
            pushInt(this.errCode);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.filepath = popString16UTF8();
            this.width = popInt();
            this.height = popInt();
            this.errCode = popInt();
        }
    }

    public static class PStreamInjectedStatus extends Marshallable {
        public int status;
        public int uid;
        public String url;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushBytes(this.url.getBytes());
            pushInt(this.uid);
            pushInt(this.status);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.url = popString16UTF8();
            this.uid = popInt();
            this.status = popInt();
        }
    }

    public static class PStreamMessage extends Marshallable {
        byte[] payload;
        long sentTs;
        int streamId;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.streamId = popInt();
            this.sentTs = popInt64();
            this.payload = popBytes();
        }
    }

    public static class PStreamMessageError extends Marshallable {
        int cached;
        int error;
        int missed;
        int streamId;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.streamId = popInt();
            this.error = popInt();
            this.missed = popInt();
            this.cached = popInt();
        }
    }

    public static class PStreamPublishEvent extends Marshallable {
        public int event;
        public String url;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.url = popString16UTF8();
            this.event = popInt();
        }
    }

    public static class PStreamPublishState extends Marshallable {
        public int error;
        public int state;
        public String url;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.url = popString16UTF8();
            this.state = popInt();
            this.error = popInt();
        }
    }

    public static class PStreamPublished extends Marshallable {
        public int error;
        public String url;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.url = popString16UTF8();
            this.error = popInt();
        }
    }

    public static class PStreamUnPublished extends Marshallable {
        public String url;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.url = popString16UTF8();
        }
    }

    public static class PSubscribeAudioStateChanged extends Marshallable {
        String channelId;
        int elapseSinceLastState;
        short newState;
        short oldState;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.channelId = popString16UTF8();
            this.uid = popInt();
            this.oldState = popShort();
            this.newState = popShort();
            this.elapseSinceLastState = popInt();
        }
    }

    public static class PSubscribeVideoStateChanged extends Marshallable {
        String channelId;
        int elapseSinceLastState;
        short newState;
        short oldState;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.channelId = popString16UTF8();
            this.uid = popInt();
            this.oldState = popShort();
            this.newState = popShort();
            this.elapseSinceLastState = popInt();
        }
    }

    public static class PTranscodingVideoStream extends Marshallable {
        public double alpha;
        public int error;
        public int height;
        public String imageUrl;
        public boolean mirror;
        public int remoteUserUid;
        public int sourceType;
        public int width;
        public int x;
        public int y;
        public int zOrder;

        public LocalTranscoderConfiguration.TranscodingVideoStream getTranscodingVideoStream() {
            LocalTranscoderConfiguration.TranscodingVideoStream transcodingVideoStream = new LocalTranscoderConfiguration.TranscodingVideoStream();
            transcodingVideoStream.sourceType = Constants.VideoSourceType.fromInt(this.sourceType);
            transcodingVideoStream.remoteUserUid = this.remoteUserUid;
            transcodingVideoStream.imageUrl = this.imageUrl;
            transcodingVideoStream.x = this.x;
            transcodingVideoStream.y = this.y;
            transcodingVideoStream.width = this.width;
            transcodingVideoStream.height = this.height;
            transcodingVideoStream.zOrder = this.zOrder;
            transcodingVideoStream.alpha = this.alpha;
            transcodingVideoStream.mirror = this.mirror;
            return transcodingVideoStream;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.error = popInt();
            this.sourceType = popInt();
            this.remoteUserUid = popInt();
            this.imageUrl = popString16UTF8();
            this.x = popInt();
            this.y = popInt();
            this.width = popInt();
            this.height = popInt();
            this.zOrder = popInt();
            this.alpha = popDouble();
            this.mirror = popBool().booleanValue();
        }
    }

    public static class PUplinkNetworkInfoUpdated extends Marshallable {
        int videoEncoderTargetBitrateBps;

        public IRtcEngineEventHandler.UplinkNetworkInfo getUplinkNetworkInfo() {
            IRtcEngineEventHandler.UplinkNetworkInfo uplinkNetworkInfo = new IRtcEngineEventHandler.UplinkNetworkInfo();
            uplinkNetworkInfo.video_encoder_target_bitrate_bps = this.videoEncoderTargetBitrateBps;
            return uplinkNetworkInfo;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.videoEncoderTargetBitrateBps = popInt();
        }
    }

    public static class PUploadLogResult extends Marshallable {
        public int reason;
        public String requestId;
        public boolean success;

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.requestId = popString16();
            this.success = popBool().booleanValue();
            this.reason = popInt();
        }
    }

    public static class PUserInfoState extends Marshallable {
        public int uid;
        public String userAccount;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushBytes(this.userAccount.getBytes());
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.userAccount = popString16UTF8();
        }
    }

    public static class PUserStateChanged extends Marshallable {
        int state;
        int uid;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.state = popInt();
        }
    }

    public static class PUserTransportStat extends Marshallable {
        public short delay;
        public boolean isAudio;
        public short lost;
        public int peerUid;
        public short rxKBitRate;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.isAudio = popBool().booleanValue();
            this.peerUid = popInt();
            this.delay = popShort();
            this.lost = popShort();
            this.rxKBitRate = popShort();
        }
    }

    public static class PVideoCompositingLayout extends Marshallable {
        private static final short SERVER_TYPE = 0;
        private static final short URI = 20;

        private void marshall(Marshallable m, VideoCompositingLayout layout) {
            m.pushShort((short) 0);
            m.pushShort((short) 20);
            m.pushInt(layout.canvasWidth);
            m.pushInt(layout.canvasHeight);
            if (layout.backgroundColor != null) {
                m.pushBytes(layout.backgroundColor.getBytes());
            } else {
                m.pushBytes("".getBytes());
            }
            if (layout.appData != null) {
                m.pushBytes(layout.appData);
            } else {
                m.pushBytes("".getBytes());
            }
            m.pushShort((short) layout.regions.length);
            for (int i = 0; i < layout.regions.length; i++) {
                marshallRegion(m, layout.regions[i]);
            }
        }

        private void marshallRegion(Marshallable m, VideoCompositingLayout.Region region) {
            m.pushInt(region.uid);
            if (TextUtils.isEmpty(region.userId)) {
                m.pushBytes("".getBytes());
            } else {
                m.pushBytes(region.userId.getBytes());
            }
            m.pushDouble(region.x);
            m.pushDouble(region.y);
            m.pushDouble(region.width);
            m.pushDouble(region.height);
            m.pushInt(region.zOrder);
            m.pushDouble(region.alpha);
            m.pushInt(region.renderMode);
        }

        public byte[] marshall(VideoCompositingLayout layout) {
            marshall(this, layout);
            return super.marshall();
        }
    }

    public static class PVideoLayoutInfo extends Marshallable {
        public int height;
        public int layoutCount;
        public Layout[] layoutList;
        public String service;
        public int uid;
        public int width;

        public static class Layout {
            public String channel;
            public int height;
            public int uid;
            public int videoState;
            public int width;
            public int x;
            public int y;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushString16(this.service);
            pushInt(this.uid);
            pushInt(this.width);
            pushInt(this.height);
            int length = this.layoutList.length;
            pushInt(length);
            for (int i = 0; i < length; i++) {
                pushString16(this.layoutList[i].channel);
                pushInt(this.layoutList[i].uid);
                pushInt(this.layoutList[i].x);
                pushInt(this.layoutList[i].y);
                pushInt(this.layoutList[i].width);
                pushInt(this.layoutList[i].height);
                pushInt(this.layoutList[i].videoState);
            }
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.service = popString16UTF8();
            this.uid = popInt();
            this.width = popInt();
            this.height = popInt();
            this.layoutCount = popInt();
            popShort();
            int i = this.layoutCount;
            if (i > 0) {
                this.layoutList = new Layout[i];
                for (int i2 = 0; i2 < this.layoutCount; i2++) {
                    this.layoutList[i2] = new Layout();
                    this.layoutList[i2].channel = popString16UTF8();
                    this.layoutList[i2].uid = popInt();
                    this.layoutList[i2].x = popInt();
                    this.layoutList[i2].y = popInt();
                    this.layoutList[i2].width = popInt();
                    this.layoutList[i2].height = popInt();
                    this.layoutList[i2].videoState = popInt();
                }
            }
        }
    }

    public static class PVideoNetOptions extends Marshallable {
        short bitrate;
        short frameRate;
        short height;
        short width;

        public void marshall(Marshallable m) {
            m.pushShort(this.width);
            m.pushShort(this.height);
            m.pushShort(this.frameRate);
            m.pushShort(this.bitrate);
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            marshall(this);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.width = popShort();
            this.height = popShort();
            this.frameRate = popShort();
            this.bitrate = popShort();
        }
    }

    public static class PVideoRenderingTracingInfo extends Marshallable {
        public int elapsedTime;
        public short event;
        public int join2JoinSuccess;
        public int joinSuccess2RemoteJoined;
        public int remoteJoined2PacketReceived;
        public int remoteJoined2SetView;
        public int remoteJoined2UnmuteVideo;
        public int start2JoinChannel;
        public int uid;

        public IRtcEngineEventHandler.VideoRenderingTracingInfo getVideoRenderingTracingInfo() {
            IRtcEngineEventHandler.VideoRenderingTracingInfo videoRenderingTracingInfo = new IRtcEngineEventHandler.VideoRenderingTracingInfo();
            videoRenderingTracingInfo.elapsedTime = this.elapsedTime;
            videoRenderingTracingInfo.start2JoinChannel = this.start2JoinChannel;
            videoRenderingTracingInfo.join2JoinSuccess = this.join2JoinSuccess;
            videoRenderingTracingInfo.joinSuccess2RemoteJoined = this.joinSuccess2RemoteJoined;
            videoRenderingTracingInfo.remoteJoined2SetView = this.remoteJoined2SetView;
            videoRenderingTracingInfo.remoteJoined2UnmuteVideo = this.remoteJoined2UnmuteVideo;
            videoRenderingTracingInfo.remoteJoined2PacketReceived = this.remoteJoined2PacketReceived;
            return videoRenderingTracingInfo;
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushInt(this.uid);
            pushShort(this.event);
            pushInt(this.elapsedTime);
            pushInt(this.start2JoinChannel);
            pushInt(this.join2JoinSuccess);
            pushInt(this.joinSuccess2RemoteJoined);
            pushInt(this.remoteJoined2SetView);
            pushInt(this.remoteJoined2UnmuteVideo);
            pushInt(this.remoteJoined2PacketReceived);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.uid = popInt();
            this.event = popShort();
            this.elapsedTime = popInt();
            this.start2JoinChannel = popInt();
            this.join2JoinSuccess = popInt();
            this.joinSuccess2RemoteJoined = popInt();
            this.remoteJoined2SetView = popInt();
            this.remoteJoined2UnmuteVideo = popInt();
            this.remoteJoined2PacketReceived = popInt();
        }
    }

    public static class PVideoSizeChanged extends Marshallable {
        public int height;
        public int rotation;
        public int source;
        public int uid;
        public int width;

        @Override // io.agora.rtc2.internal.Marshallable
        public byte[] marshall() {
            pushByte((byte) this.source);
            pushInt(this.uid);
            pushInt(this.width);
            pushInt(this.height);
            pushInt(this.rotation);
            return super.marshall();
        }

        @Override // io.agora.rtc2.internal.Marshallable
        public void unmarshall(byte[] buf) {
            super.unmarshall(buf);
            this.source = popByte();
            this.uid = popInt();
            this.width = popInt();
            this.height = popInt();
            this.rotation = popInt();
        }
    }

    public static int toIntegerUserId(String userId) {
        if (userId == null) {
            return 0;
        }
        try {
            return (int) Long.parseLong(userId);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long toIntegerUserId(int uid) {
        return uid & BodyPartID.bodyIdMax;
    }

    public static String toStringUserId(int uid) {
        return String.valueOf(toIntegerUserId(uid));
    }
}
