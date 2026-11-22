package livekit;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import livekit.LivekitMetrics;

/* loaded from: classes8.dex */
public final class LivekitModels {

    @Deprecated
    public interface ActiveSpeakerUpdateOrBuilder extends MessageLiteOrBuilder {
        SpeakerInfo getSpeakers(int i);

        int getSpeakersCount();

        List<SpeakerInfo> getSpeakersList();
    }

    public interface ChatMessageOrBuilder extends MessageLiteOrBuilder {
        boolean getDeleted();

        long getEditTimestamp();

        boolean getGenerated();

        String getId();

        ByteString getIdBytes();

        String getMessage();

        ByteString getMessageBytes();

        long getTimestamp();

        boolean hasEditTimestamp();
    }

    public interface ClientConfigurationOrBuilder extends MessageLiteOrBuilder {
        DisabledCodecs getDisabledCodecs();

        ClientConfigSetting getForceRelay();

        int getForceRelayValue();

        ClientConfigSetting getResumeConnection();

        int getResumeConnectionValue();

        VideoConfiguration getScreen();

        VideoConfiguration getVideo();

        boolean hasDisabledCodecs();

        boolean hasScreen();

        boolean hasVideo();
    }

    public interface ClientInfoOrBuilder extends MessageLiteOrBuilder {
        String getAddress();

        ByteString getAddressBytes();

        String getBrowser();

        ByteString getBrowserBytes();

        String getBrowserVersion();

        ByteString getBrowserVersionBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getNetwork();

        ByteString getNetworkBytes();

        String getOs();

        ByteString getOsBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getOtherSdks();

        ByteString getOtherSdksBytes();

        int getProtocol();

        ClientInfo.SDK getSdk();

        int getSdkValue();

        String getVersion();

        ByteString getVersionBytes();
    }

    public interface CodecOrBuilder extends MessageLiteOrBuilder {
        String getFmtpLine();

        ByteString getFmtpLineBytes();

        String getMime();

        ByteString getMimeBytes();
    }

    public interface DataPacketOrBuilder extends MessageLiteOrBuilder {
        ChatMessage getChatMessage();

        String getDestinationIdentities(int i);

        ByteString getDestinationIdentitiesBytes(int i);

        int getDestinationIdentitiesCount();

        List<String> getDestinationIdentitiesList();

        EncryptedPacket getEncryptedPacket();

        @Deprecated
        DataPacket.Kind getKind();

        @Deprecated
        int getKindValue();

        LivekitMetrics.MetricsBatch getMetrics();

        String getParticipantIdentity();

        ByteString getParticipantIdentityBytes();

        String getParticipantSid();

        ByteString getParticipantSidBytes();

        RpcAck getRpcAck();

        RpcRequest getRpcRequest();

        RpcResponse getRpcResponse();

        int getSequence();

        SipDTMF getSipDtmf();

        @Deprecated
        ActiveSpeakerUpdate getSpeaker();

        DataStream.Chunk getStreamChunk();

        DataStream.Header getStreamHeader();

        DataStream.Trailer getStreamTrailer();

        Transcription getTranscription();

        UserPacket getUser();

        DataPacket.ValueCase getValueCase();

        boolean hasChatMessage();

        boolean hasEncryptedPacket();

        boolean hasMetrics();

        boolean hasRpcAck();

        boolean hasRpcRequest();

        boolean hasRpcResponse();

        boolean hasSipDtmf();

        @Deprecated
        boolean hasSpeaker();

        boolean hasStreamChunk();

        boolean hasStreamHeader();

        boolean hasStreamTrailer();

        boolean hasTranscription();

        boolean hasUser();
    }

    public interface DataStreamOrBuilder extends MessageLiteOrBuilder {
    }

    public interface DisabledCodecsOrBuilder extends MessageLiteOrBuilder {
        Codec getCodecs(int i);

        int getCodecsCount();

        List<Codec> getCodecsList();

        Codec getPublish(int i);

        int getPublishCount();

        List<Codec> getPublishList();
    }

    public interface EncryptedPacketOrBuilder extends MessageLiteOrBuilder {
        ByteString getEncryptedValue();

        Encryption.Type getEncryptionType();

        int getEncryptionTypeValue();

        ByteString getIv();

        int getKeyIndex();
    }

    public interface EncryptedPacketPayloadOrBuilder extends MessageLiteOrBuilder {
        ChatMessage getChatMessage();

        RpcAck getRpcAck();

        RpcRequest getRpcRequest();

        RpcResponse getRpcResponse();

        DataStream.Chunk getStreamChunk();

        DataStream.Header getStreamHeader();

        DataStream.Trailer getStreamTrailer();

        UserPacket getUser();

        EncryptedPacketPayload.ValueCase getValueCase();

        boolean hasChatMessage();

        boolean hasRpcAck();

        boolean hasRpcRequest();

        boolean hasRpcResponse();

        boolean hasStreamChunk();

        boolean hasStreamHeader();

        boolean hasStreamTrailer();

        boolean hasUser();
    }

    public interface EncryptionOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ListUpdateOrBuilder extends MessageLiteOrBuilder {
        String getAdd(int i);

        ByteString getAddBytes(int i);

        int getAddCount();

        List<String> getAddList();

        boolean getClear();

        String getRemove(int i);

        ByteString getRemoveBytes(int i);

        int getRemoveCount();

        List<String> getRemoveList();

        String getSet(int i);

        ByteString getSetBytes(int i);

        int getSetCount();

        List<String> getSetList();
    }

    public interface PaginationOrBuilder extends MessageLiteOrBuilder {
        String getAfterId();

        ByteString getAfterIdBytes();

        int getLimit();
    }

    public interface ParticipantInfoOrBuilder extends MessageLiteOrBuilder {
        boolean containsAttributes(String str);

        @Deprecated
        Map<String, String> getAttributes();

        int getAttributesCount();

        Map<String, String> getAttributesMap();

        String getAttributesOrDefault(String str, String str2);

        String getAttributesOrThrow(String str);

        DisconnectReason getDisconnectReason();

        int getDisconnectReasonValue();

        String getIdentity();

        ByteString getIdentityBytes();

        boolean getIsPublisher();

        long getJoinedAt();

        long getJoinedAtMs();

        ParticipantInfo.Kind getKind();

        ParticipantInfo.KindDetail getKindDetails(int i);

        int getKindDetailsCount();

        List<ParticipantInfo.KindDetail> getKindDetailsList();

        int getKindDetailsValue(int i);

        List<Integer> getKindDetailsValueList();

        int getKindValue();

        String getMetadata();

        ByteString getMetadataBytes();

        String getName();

        ByteString getNameBytes();

        ParticipantPermission getPermission();

        String getRegion();

        ByteString getRegionBytes();

        String getSid();

        ByteString getSidBytes();

        ParticipantInfo.State getState();

        int getStateValue();

        TrackInfo getTracks(int i);

        int getTracksCount();

        List<TrackInfo> getTracksList();

        int getVersion();

        boolean hasPermission();
    }

    public interface ParticipantPermissionOrBuilder extends MessageLiteOrBuilder {
        @Deprecated
        boolean getAgent();

        boolean getCanPublish();

        boolean getCanPublishData();

        TrackSource getCanPublishSources(int i);

        int getCanPublishSourcesCount();

        List<TrackSource> getCanPublishSourcesList();

        int getCanPublishSourcesValue(int i);

        List<Integer> getCanPublishSourcesValueList();

        boolean getCanSubscribe();

        boolean getCanSubscribeMetrics();

        boolean getCanUpdateMetadata();

        boolean getHidden();

        @Deprecated
        boolean getRecorder();
    }

    public interface ParticipantTracksOrBuilder extends MessageLiteOrBuilder {
        String getParticipantSid();

        ByteString getParticipantSidBytes();

        String getTrackSids(int i);

        ByteString getTrackSidsBytes(int i);

        int getTrackSidsCount();

        List<String> getTrackSidsList();
    }

    public interface PlayoutDelayOrBuilder extends MessageLiteOrBuilder {
        boolean getEnabled();

        int getMax();

        int getMin();
    }

    public interface RTCPSenderReportStateOrBuilder extends MessageLiteOrBuilder {
        long getAt();

        long getAtAdjusted();

        long getNtpTimestamp();

        long getOctets();

        int getPackets();

        int getRtpTimestamp();

        long getRtpTimestampExt();
    }

    public interface RTPDriftOrBuilder extends MessageLiteOrBuilder {
        double getClockRate();

        double getDriftMs();

        long getDriftSamples();

        double getDuration();

        Timestamp getEndTime();

        long getEndTimestamp();

        long getRtpClockTicks();

        Timestamp getStartTime();

        long getStartTimestamp();

        boolean hasEndTime();

        boolean hasStartTime();
    }

    public interface RTPForwarderStateOrBuilder extends MessageLiteOrBuilder {
        RTPForwarderState.CodecMungerCase getCodecMungerCase();

        long getDummyStartTimestampOffset();

        long getExtFirstTimestamp();

        long getPreStartTime();

        int getReferenceLayerSpatial();

        RTPMungerState getRtpMunger();

        RTCPSenderReportState getSenderReportState(int i);

        int getSenderReportStateCount();

        List<RTCPSenderReportState> getSenderReportStateList();

        boolean getStarted();

        VP8MungerState getVp8Munger();

        boolean hasRtpMunger();

        boolean hasVp8Munger();
    }

    public interface RTPMungerStateOrBuilder extends MessageLiteOrBuilder {
        long getExtLastSequenceNumber();

        long getExtLastTimestamp();

        long getExtSecondLastSequenceNumber();

        long getExtSecondLastTimestamp();

        boolean getLastMarker();

        boolean getSecondLastMarker();
    }

    public interface RTPStatsOrBuilder extends MessageLiteOrBuilder {
        boolean containsGapHistogram(int i);

        double getBitrate();

        double getBitrateDuplicate();

        double getBitratePadding();

        long getBytes();

        long getBytesDuplicate();

        long getBytesPadding();

        double getDuration();

        Timestamp getEndTime();

        int getFirs();

        double getFrameRate();

        int getFrames();

        @Deprecated
        Map<Integer, Integer> getGapHistogram();

        int getGapHistogramCount();

        Map<Integer, Integer> getGapHistogramMap();

        int getGapHistogramOrDefault(int i, int i2);

        int getGapHistogramOrThrow(int i);

        long getHeaderBytes();

        long getHeaderBytesDuplicate();

        long getHeaderBytesPadding();

        double getJitterCurrent();

        double getJitterMax();

        int getKeyFrames();

        Timestamp getLastFir();

        Timestamp getLastKeyFrame();

        Timestamp getLastLayerLockPli();

        Timestamp getLastPli();

        int getLayerLockPlis();

        int getNackAcks();

        int getNackMisses();

        int getNackRepeated();

        int getNacks();

        RTPDrift getNtpReportDrift();

        RTPDrift getPacketDrift();

        double getPacketDuplicateRate();

        float getPacketLossPercentage();

        double getPacketLossRate();

        double getPacketPaddingRate();

        double getPacketRate();

        int getPackets();

        int getPacketsDuplicate();

        int getPacketsLost();

        int getPacketsOutOfOrder();

        int getPacketsPadding();

        int getPlis();

        RTPDrift getRebasedReportDrift();

        RTPDrift getReceivedReportDrift();

        int getRttCurrent();

        int getRttMax();

        Timestamp getStartTime();

        boolean hasEndTime();

        boolean hasLastFir();

        boolean hasLastKeyFrame();

        boolean hasLastLayerLockPli();

        boolean hasLastPli();

        boolean hasNtpReportDrift();

        boolean hasPacketDrift();

        boolean hasRebasedReportDrift();

        boolean hasReceivedReportDrift();

        boolean hasStartTime();
    }

    public interface RoomOrBuilder extends MessageLiteOrBuilder {
        boolean getActiveRecording();

        long getCreationTime();

        long getCreationTimeMs();

        int getDepartureTimeout();

        int getEmptyTimeout();

        Codec getEnabledCodecs(int i);

        int getEnabledCodecsCount();

        List<Codec> getEnabledCodecsList();

        int getMaxParticipants();

        String getMetadata();

        ByteString getMetadataBytes();

        String getName();

        ByteString getNameBytes();

        int getNumParticipants();

        int getNumPublishers();

        String getSid();

        ByteString getSidBytes();

        String getTurnPassword();

        ByteString getTurnPasswordBytes();

        TimedVersion getVersion();

        boolean hasVersion();
    }

    public interface RpcAckOrBuilder extends MessageLiteOrBuilder {
        String getRequestId();

        ByteString getRequestIdBytes();
    }

    public interface RpcErrorOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        String getData();

        ByteString getDataBytes();

        String getMessage();

        ByteString getMessageBytes();
    }

    public interface RpcRequestOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();

        String getMethod();

        ByteString getMethodBytes();

        String getPayload();

        ByteString getPayloadBytes();

        int getResponseTimeoutMs();

        int getVersion();
    }

    public interface RpcResponseOrBuilder extends MessageLiteOrBuilder {
        RpcError getError();

        String getPayload();

        ByteString getPayloadBytes();

        String getRequestId();

        ByteString getRequestIdBytes();

        RpcResponse.ValueCase getValueCase();

        boolean hasError();

        boolean hasPayload();
    }

    public interface ServerInfoOrBuilder extends MessageLiteOrBuilder {
        int getAgentProtocol();

        String getDebugInfo();

        ByteString getDebugInfoBytes();

        ServerInfo.Edition getEdition();

        int getEditionValue();

        String getNodeId();

        ByteString getNodeIdBytes();

        int getProtocol();

        String getRegion();

        ByteString getRegionBytes();

        String getVersion();

        ByteString getVersionBytes();
    }

    public interface SimulcastCodecInfoOrBuilder extends MessageLiteOrBuilder {
        String getCid();

        ByteString getCidBytes();

        VideoLayer getLayers(int i);

        int getLayersCount();

        List<VideoLayer> getLayersList();

        String getMid();

        ByteString getMidBytes();

        String getMimeType();

        ByteString getMimeTypeBytes();

        String getSdpCid();

        ByteString getSdpCidBytes();

        VideoLayer.Mode getVideoLayerMode();

        int getVideoLayerModeValue();
    }

    public interface SipDTMFOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        String getDigit();

        ByteString getDigitBytes();
    }

    public interface SpeakerInfoOrBuilder extends MessageLiteOrBuilder {
        boolean getActive();

        float getLevel();

        String getSid();

        ByteString getSidBytes();
    }

    public interface SubscribedAudioCodecOrBuilder extends MessageLiteOrBuilder {
        String getCodec();

        ByteString getCodecBytes();

        boolean getEnabled();
    }

    public interface TimedVersionOrBuilder extends MessageLiteOrBuilder {
        int getTicks();

        long getUnixMicro();
    }

    public interface TokenPaginationOrBuilder extends MessageLiteOrBuilder {
        String getToken();

        ByteString getTokenBytes();
    }

    public interface TrackInfoOrBuilder extends MessageLiteOrBuilder {
        AudioTrackFeature getAudioFeatures(int i);

        int getAudioFeaturesCount();

        List<AudioTrackFeature> getAudioFeaturesList();

        int getAudioFeaturesValue(int i);

        List<Integer> getAudioFeaturesValueList();

        BackupCodecPolicy getBackupCodecPolicy();

        int getBackupCodecPolicyValue();

        SimulcastCodecInfo getCodecs(int i);

        int getCodecsCount();

        List<SimulcastCodecInfo> getCodecsList();

        @Deprecated
        boolean getDisableDtx();

        boolean getDisableRed();

        Encryption.Type getEncryption();

        int getEncryptionValue();

        @Deprecated
        int getHeight();

        @Deprecated
        VideoLayer getLayers(int i);

        @Deprecated
        int getLayersCount();

        @Deprecated
        List<VideoLayer> getLayersList();

        String getMid();

        ByteString getMidBytes();

        String getMimeType();

        ByteString getMimeTypeBytes();

        boolean getMuted();

        String getName();

        ByteString getNameBytes();

        String getSid();

        ByteString getSidBytes();

        @Deprecated
        boolean getSimulcast();

        TrackSource getSource();

        int getSourceValue();

        @Deprecated
        boolean getStereo();

        String getStream();

        ByteString getStreamBytes();

        TrackType getType();

        int getTypeValue();

        TimedVersion getVersion();

        @Deprecated
        int getWidth();

        boolean hasVersion();
    }

    public interface TranscriptionOrBuilder extends MessageLiteOrBuilder {
        TranscriptionSegment getSegments(int i);

        int getSegmentsCount();

        List<TranscriptionSegment> getSegmentsList();

        String getTrackId();

        ByteString getTrackIdBytes();

        String getTranscribedParticipantIdentity();

        ByteString getTranscribedParticipantIdentityBytes();
    }

    public interface TranscriptionSegmentOrBuilder extends MessageLiteOrBuilder {
        long getEndTime();

        boolean getFinal();

        String getId();

        ByteString getIdBytes();

        String getLanguage();

        ByteString getLanguageBytes();

        long getStartTime();

        String getText();

        ByteString getTextBytes();
    }

    public interface UserPacketOrBuilder extends MessageLiteOrBuilder {
        @Deprecated
        String getDestinationIdentities(int i);

        @Deprecated
        ByteString getDestinationIdentitiesBytes(int i);

        @Deprecated
        int getDestinationIdentitiesCount();

        @Deprecated
        List<String> getDestinationIdentitiesList();

        @Deprecated
        String getDestinationSids(int i);

        @Deprecated
        ByteString getDestinationSidsBytes(int i);

        @Deprecated
        int getDestinationSidsCount();

        @Deprecated
        List<String> getDestinationSidsList();

        long getEndTime();

        String getId();

        ByteString getIdBytes();

        ByteString getNonce();

        @Deprecated
        String getParticipantIdentity();

        @Deprecated
        ByteString getParticipantIdentityBytes();

        @Deprecated
        String getParticipantSid();

        @Deprecated
        ByteString getParticipantSidBytes();

        ByteString getPayload();

        long getStartTime();

        String getTopic();

        ByteString getTopicBytes();

        boolean hasEndTime();

        boolean hasId();

        boolean hasStartTime();

        boolean hasTopic();
    }

    public interface VP8MungerStateOrBuilder extends MessageLiteOrBuilder {
        int getExtLastPictureId();

        boolean getKeyIdxUsed();

        int getLastKeyIdx();

        int getLastTl0PicIdx();

        boolean getPictureIdUsed();

        boolean getTidUsed();

        boolean getTl0PicIdxUsed();
    }

    public interface VideoConfigurationOrBuilder extends MessageLiteOrBuilder {
        ClientConfigSetting getHardwareEncoder();

        int getHardwareEncoderValue();
    }

    public interface VideoLayerOrBuilder extends MessageLiteOrBuilder {
        int getBitrate();

        int getHeight();

        VideoQuality getQuality();

        int getQualityValue();

        String getRid();

        ByteString getRidBytes();

        int getSpatialLayer();

        int getSsrc();

        int getWidth();
    }

    public interface WebhookConfigOrBuilder extends MessageLiteOrBuilder {
        String getSigningKey();

        ByteString getSigningKeyBytes();

        String getUrl();

        ByteString getUrlBytes();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private LivekitModels() {
    }

    public enum AudioCodec implements Internal.EnumLite {
        DEFAULT_AC(0),
        OPUS(1),
        AAC(2),
        AC_MP3(3),
        UNRECOGNIZED(-1);

        public static final int AAC_VALUE = 2;
        public static final int AC_MP3_VALUE = 3;
        public static final int DEFAULT_AC_VALUE = 0;
        public static final int OPUS_VALUE = 1;
        private static final Internal.EnumLiteMap<AudioCodec> internalValueMap = new Internal.EnumLiteMap<AudioCodec>() { // from class: livekit.LivekitModels.AudioCodec.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AudioCodec findValueByNumber(int i) {
                return AudioCodec.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static AudioCodec valueOf(int i) {
            return forNumber(i);
        }

        public static AudioCodec forNumber(int i) {
            if (i == 0) {
                return DEFAULT_AC;
            }
            if (i == 1) {
                return OPUS;
            }
            if (i == 2) {
                return AAC;
            }
            if (i != 3) {
                return null;
            }
            return AC_MP3;
        }

        public static Internal.EnumLiteMap<AudioCodec> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return AudioCodecVerifier.INSTANCE;
        }

        private static final class AudioCodecVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new AudioCodecVerifier();

            private AudioCodecVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return AudioCodec.forNumber(i) != null;
            }
        }

        AudioCodec(int i) {
            this.value = i;
        }
    }

    public enum VideoCodec implements Internal.EnumLite {
        DEFAULT_VC(0),
        H264_BASELINE(1),
        H264_MAIN(2),
        H264_HIGH(3),
        VP8(4),
        UNRECOGNIZED(-1);

        public static final int DEFAULT_VC_VALUE = 0;
        public static final int H264_BASELINE_VALUE = 1;
        public static final int H264_HIGH_VALUE = 3;
        public static final int H264_MAIN_VALUE = 2;
        public static final int VP8_VALUE = 4;
        private static final Internal.EnumLiteMap<VideoCodec> internalValueMap = new Internal.EnumLiteMap<VideoCodec>() { // from class: livekit.LivekitModels.VideoCodec.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public VideoCodec findValueByNumber(int i) {
                return VideoCodec.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static VideoCodec valueOf(int i) {
            return forNumber(i);
        }

        public static VideoCodec forNumber(int i) {
            if (i == 0) {
                return DEFAULT_VC;
            }
            if (i == 1) {
                return H264_BASELINE;
            }
            if (i == 2) {
                return H264_MAIN;
            }
            if (i == 3) {
                return H264_HIGH;
            }
            if (i != 4) {
                return null;
            }
            return VP8;
        }

        public static Internal.EnumLiteMap<VideoCodec> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return VideoCodecVerifier.INSTANCE;
        }

        private static final class VideoCodecVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new VideoCodecVerifier();

            private VideoCodecVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return VideoCodec.forNumber(i) != null;
            }
        }

        VideoCodec(int i) {
            this.value = i;
        }
    }

    public enum ImageCodec implements Internal.EnumLite {
        IC_DEFAULT(0),
        IC_JPEG(1),
        UNRECOGNIZED(-1);

        public static final int IC_DEFAULT_VALUE = 0;
        public static final int IC_JPEG_VALUE = 1;
        private static final Internal.EnumLiteMap<ImageCodec> internalValueMap = new Internal.EnumLiteMap<ImageCodec>() { // from class: livekit.LivekitModels.ImageCodec.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ImageCodec findValueByNumber(int i) {
                return ImageCodec.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ImageCodec valueOf(int i) {
            return forNumber(i);
        }

        public static ImageCodec forNumber(int i) {
            if (i == 0) {
                return IC_DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return IC_JPEG;
        }

        public static Internal.EnumLiteMap<ImageCodec> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ImageCodecVerifier.INSTANCE;
        }

        private static final class ImageCodecVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ImageCodecVerifier();

            private ImageCodecVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ImageCodec.forNumber(i) != null;
            }
        }

        ImageCodec(int i) {
            this.value = i;
        }
    }

    public enum BackupCodecPolicy implements Internal.EnumLite {
        PREFER_REGRESSION(0),
        SIMULCAST(1),
        REGRESSION(2),
        UNRECOGNIZED(-1);

        public static final int PREFER_REGRESSION_VALUE = 0;
        public static final int REGRESSION_VALUE = 2;
        public static final int SIMULCAST_VALUE = 1;
        private static final Internal.EnumLiteMap<BackupCodecPolicy> internalValueMap = new Internal.EnumLiteMap<BackupCodecPolicy>() { // from class: livekit.LivekitModels.BackupCodecPolicy.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public BackupCodecPolicy findValueByNumber(int i) {
                return BackupCodecPolicy.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static BackupCodecPolicy valueOf(int i) {
            return forNumber(i);
        }

        public static BackupCodecPolicy forNumber(int i) {
            if (i == 0) {
                return PREFER_REGRESSION;
            }
            if (i == 1) {
                return SIMULCAST;
            }
            if (i != 2) {
                return null;
            }
            return REGRESSION;
        }

        public static Internal.EnumLiteMap<BackupCodecPolicy> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return BackupCodecPolicyVerifier.INSTANCE;
        }

        private static final class BackupCodecPolicyVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new BackupCodecPolicyVerifier();

            private BackupCodecPolicyVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return BackupCodecPolicy.forNumber(i) != null;
            }
        }

        BackupCodecPolicy(int i) {
            this.value = i;
        }
    }

    public enum TrackType implements Internal.EnumLite {
        AUDIO(0),
        VIDEO(1),
        DATA(2),
        UNRECOGNIZED(-1);

        public static final int AUDIO_VALUE = 0;
        public static final int DATA_VALUE = 2;
        public static final int VIDEO_VALUE = 1;
        private static final Internal.EnumLiteMap<TrackType> internalValueMap = new Internal.EnumLiteMap<TrackType>() { // from class: livekit.LivekitModels.TrackType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TrackType findValueByNumber(int i) {
                return TrackType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static TrackType valueOf(int i) {
            return forNumber(i);
        }

        public static TrackType forNumber(int i) {
            if (i == 0) {
                return AUDIO;
            }
            if (i == 1) {
                return VIDEO;
            }
            if (i != 2) {
                return null;
            }
            return DATA;
        }

        public static Internal.EnumLiteMap<TrackType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TrackTypeVerifier.INSTANCE;
        }

        private static final class TrackTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new TrackTypeVerifier();

            private TrackTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return TrackType.forNumber(i) != null;
            }
        }

        TrackType(int i) {
            this.value = i;
        }
    }

    public enum TrackSource implements Internal.EnumLite {
        UNKNOWN(0),
        CAMERA(1),
        MICROPHONE(2),
        SCREEN_SHARE(3),
        SCREEN_SHARE_AUDIO(4),
        UNRECOGNIZED(-1);

        public static final int CAMERA_VALUE = 1;
        public static final int MICROPHONE_VALUE = 2;
        public static final int SCREEN_SHARE_AUDIO_VALUE = 4;
        public static final int SCREEN_SHARE_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<TrackSource> internalValueMap = new Internal.EnumLiteMap<TrackSource>() { // from class: livekit.LivekitModels.TrackSource.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TrackSource findValueByNumber(int i) {
                return TrackSource.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static TrackSource valueOf(int i) {
            return forNumber(i);
        }

        public static TrackSource forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CAMERA;
            }
            if (i == 2) {
                return MICROPHONE;
            }
            if (i == 3) {
                return SCREEN_SHARE;
            }
            if (i != 4) {
                return null;
            }
            return SCREEN_SHARE_AUDIO;
        }

        public static Internal.EnumLiteMap<TrackSource> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TrackSourceVerifier.INSTANCE;
        }

        private static final class TrackSourceVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new TrackSourceVerifier();

            private TrackSourceVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return TrackSource.forNumber(i) != null;
            }
        }

        TrackSource(int i) {
            this.value = i;
        }
    }

    public enum VideoQuality implements Internal.EnumLite {
        LOW(0),
        MEDIUM(1),
        HIGH(2),
        OFF(3),
        UNRECOGNIZED(-1);

        public static final int HIGH_VALUE = 2;
        public static final int LOW_VALUE = 0;
        public static final int MEDIUM_VALUE = 1;
        public static final int OFF_VALUE = 3;
        private static final Internal.EnumLiteMap<VideoQuality> internalValueMap = new Internal.EnumLiteMap<VideoQuality>() { // from class: livekit.LivekitModels.VideoQuality.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public VideoQuality findValueByNumber(int i) {
                return VideoQuality.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static VideoQuality valueOf(int i) {
            return forNumber(i);
        }

        public static VideoQuality forNumber(int i) {
            if (i == 0) {
                return LOW;
            }
            if (i == 1) {
                return MEDIUM;
            }
            if (i == 2) {
                return HIGH;
            }
            if (i != 3) {
                return null;
            }
            return OFF;
        }

        public static Internal.EnumLiteMap<VideoQuality> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return VideoQualityVerifier.INSTANCE;
        }

        private static final class VideoQualityVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new VideoQualityVerifier();

            private VideoQualityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return VideoQuality.forNumber(i) != null;
            }
        }

        VideoQuality(int i) {
            this.value = i;
        }
    }

    public enum ConnectionQuality implements Internal.EnumLite {
        POOR(0),
        GOOD(1),
        EXCELLENT(2),
        LOST(3),
        UNRECOGNIZED(-1);

        public static final int EXCELLENT_VALUE = 2;
        public static final int GOOD_VALUE = 1;
        public static final int LOST_VALUE = 3;
        public static final int POOR_VALUE = 0;
        private static final Internal.EnumLiteMap<ConnectionQuality> internalValueMap = new Internal.EnumLiteMap<ConnectionQuality>() { // from class: livekit.LivekitModels.ConnectionQuality.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ConnectionQuality findValueByNumber(int i) {
                return ConnectionQuality.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ConnectionQuality valueOf(int i) {
            return forNumber(i);
        }

        public static ConnectionQuality forNumber(int i) {
            if (i == 0) {
                return POOR;
            }
            if (i == 1) {
                return GOOD;
            }
            if (i == 2) {
                return EXCELLENT;
            }
            if (i != 3) {
                return null;
            }
            return LOST;
        }

        public static Internal.EnumLiteMap<ConnectionQuality> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ConnectionQualityVerifier.INSTANCE;
        }

        private static final class ConnectionQualityVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ConnectionQualityVerifier();

            private ConnectionQualityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ConnectionQuality.forNumber(i) != null;
            }
        }

        ConnectionQuality(int i) {
            this.value = i;
        }
    }

    public enum ClientConfigSetting implements Internal.EnumLite {
        UNSET(0),
        DISABLED(1),
        ENABLED(2),
        UNRECOGNIZED(-1);

        public static final int DISABLED_VALUE = 1;
        public static final int ENABLED_VALUE = 2;
        public static final int UNSET_VALUE = 0;
        private static final Internal.EnumLiteMap<ClientConfigSetting> internalValueMap = new Internal.EnumLiteMap<ClientConfigSetting>() { // from class: livekit.LivekitModels.ClientConfigSetting.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ClientConfigSetting findValueByNumber(int i) {
                return ClientConfigSetting.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ClientConfigSetting valueOf(int i) {
            return forNumber(i);
        }

        public static ClientConfigSetting forNumber(int i) {
            if (i == 0) {
                return UNSET;
            }
            if (i == 1) {
                return DISABLED;
            }
            if (i != 2) {
                return null;
            }
            return ENABLED;
        }

        public static Internal.EnumLiteMap<ClientConfigSetting> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ClientConfigSettingVerifier.INSTANCE;
        }

        private static final class ClientConfigSettingVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ClientConfigSettingVerifier();

            private ClientConfigSettingVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ClientConfigSetting.forNumber(i) != null;
            }
        }

        ClientConfigSetting(int i) {
            this.value = i;
        }
    }

    public enum DisconnectReason implements Internal.EnumLite {
        UNKNOWN_REASON(0),
        CLIENT_INITIATED(1),
        DUPLICATE_IDENTITY(2),
        SERVER_SHUTDOWN(3),
        PARTICIPANT_REMOVED(4),
        ROOM_DELETED(5),
        STATE_MISMATCH(6),
        JOIN_FAILURE(7),
        MIGRATION(8),
        SIGNAL_CLOSE(9),
        ROOM_CLOSED(10),
        USER_UNAVAILABLE(11),
        USER_REJECTED(12),
        SIP_TRUNK_FAILURE(13),
        CONNECTION_TIMEOUT(14),
        MEDIA_FAILURE(15),
        UNRECOGNIZED(-1);

        public static final int CLIENT_INITIATED_VALUE = 1;
        public static final int CONNECTION_TIMEOUT_VALUE = 14;
        public static final int DUPLICATE_IDENTITY_VALUE = 2;
        public static final int JOIN_FAILURE_VALUE = 7;
        public static final int MEDIA_FAILURE_VALUE = 15;
        public static final int MIGRATION_VALUE = 8;
        public static final int PARTICIPANT_REMOVED_VALUE = 4;
        public static final int ROOM_CLOSED_VALUE = 10;
        public static final int ROOM_DELETED_VALUE = 5;
        public static final int SERVER_SHUTDOWN_VALUE = 3;
        public static final int SIGNAL_CLOSE_VALUE = 9;
        public static final int SIP_TRUNK_FAILURE_VALUE = 13;
        public static final int STATE_MISMATCH_VALUE = 6;
        public static final int UNKNOWN_REASON_VALUE = 0;
        public static final int USER_REJECTED_VALUE = 12;
        public static final int USER_UNAVAILABLE_VALUE = 11;
        private static final Internal.EnumLiteMap<DisconnectReason> internalValueMap = new Internal.EnumLiteMap<DisconnectReason>() { // from class: livekit.LivekitModels.DisconnectReason.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DisconnectReason findValueByNumber(int i) {
                return DisconnectReason.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DisconnectReason valueOf(int i) {
            return forNumber(i);
        }

        public static DisconnectReason forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_REASON;
                case 1:
                    return CLIENT_INITIATED;
                case 2:
                    return DUPLICATE_IDENTITY;
                case 3:
                    return SERVER_SHUTDOWN;
                case 4:
                    return PARTICIPANT_REMOVED;
                case 5:
                    return ROOM_DELETED;
                case 6:
                    return STATE_MISMATCH;
                case 7:
                    return JOIN_FAILURE;
                case 8:
                    return MIGRATION;
                case 9:
                    return SIGNAL_CLOSE;
                case 10:
                    return ROOM_CLOSED;
                case 11:
                    return USER_UNAVAILABLE;
                case 12:
                    return USER_REJECTED;
                case 13:
                    return SIP_TRUNK_FAILURE;
                case 14:
                    return CONNECTION_TIMEOUT;
                case 15:
                    return MEDIA_FAILURE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<DisconnectReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return DisconnectReasonVerifier.INSTANCE;
        }

        private static final class DisconnectReasonVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new DisconnectReasonVerifier();

            private DisconnectReasonVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DisconnectReason.forNumber(i) != null;
            }
        }

        DisconnectReason(int i) {
            this.value = i;
        }
    }

    public enum ReconnectReason implements Internal.EnumLite {
        RR_UNKNOWN(0),
        RR_SIGNAL_DISCONNECTED(1),
        RR_PUBLISHER_FAILED(2),
        RR_SUBSCRIBER_FAILED(3),
        RR_SWITCH_CANDIDATE(4),
        UNRECOGNIZED(-1);

        public static final int RR_PUBLISHER_FAILED_VALUE = 2;
        public static final int RR_SIGNAL_DISCONNECTED_VALUE = 1;
        public static final int RR_SUBSCRIBER_FAILED_VALUE = 3;
        public static final int RR_SWITCH_CANDIDATE_VALUE = 4;
        public static final int RR_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<ReconnectReason> internalValueMap = new Internal.EnumLiteMap<ReconnectReason>() { // from class: livekit.LivekitModels.ReconnectReason.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ReconnectReason findValueByNumber(int i) {
                return ReconnectReason.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ReconnectReason valueOf(int i) {
            return forNumber(i);
        }

        public static ReconnectReason forNumber(int i) {
            if (i == 0) {
                return RR_UNKNOWN;
            }
            if (i == 1) {
                return RR_SIGNAL_DISCONNECTED;
            }
            if (i == 2) {
                return RR_PUBLISHER_FAILED;
            }
            if (i == 3) {
                return RR_SUBSCRIBER_FAILED;
            }
            if (i != 4) {
                return null;
            }
            return RR_SWITCH_CANDIDATE;
        }

        public static Internal.EnumLiteMap<ReconnectReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ReconnectReasonVerifier.INSTANCE;
        }

        private static final class ReconnectReasonVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ReconnectReasonVerifier();

            private ReconnectReasonVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ReconnectReason.forNumber(i) != null;
            }
        }

        ReconnectReason(int i) {
            this.value = i;
        }
    }

    public enum SubscriptionError implements Internal.EnumLite {
        SE_UNKNOWN(0),
        SE_CODEC_UNSUPPORTED(1),
        SE_TRACK_NOTFOUND(2),
        UNRECOGNIZED(-1);

        public static final int SE_CODEC_UNSUPPORTED_VALUE = 1;
        public static final int SE_TRACK_NOTFOUND_VALUE = 2;
        public static final int SE_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<SubscriptionError> internalValueMap = new Internal.EnumLiteMap<SubscriptionError>() { // from class: livekit.LivekitModels.SubscriptionError.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SubscriptionError findValueByNumber(int i) {
                return SubscriptionError.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static SubscriptionError valueOf(int i) {
            return forNumber(i);
        }

        public static SubscriptionError forNumber(int i) {
            if (i == 0) {
                return SE_UNKNOWN;
            }
            if (i == 1) {
                return SE_CODEC_UNSUPPORTED;
            }
            if (i != 2) {
                return null;
            }
            return SE_TRACK_NOTFOUND;
        }

        public static Internal.EnumLiteMap<SubscriptionError> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return SubscriptionErrorVerifier.INSTANCE;
        }

        private static final class SubscriptionErrorVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new SubscriptionErrorVerifier();

            private SubscriptionErrorVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return SubscriptionError.forNumber(i) != null;
            }
        }

        SubscriptionError(int i) {
            this.value = i;
        }
    }

    public enum AudioTrackFeature implements Internal.EnumLite {
        TF_STEREO(0),
        TF_NO_DTX(1),
        TF_AUTO_GAIN_CONTROL(2),
        TF_ECHO_CANCELLATION(3),
        TF_NOISE_SUPPRESSION(4),
        TF_ENHANCED_NOISE_CANCELLATION(5),
        TF_PRECONNECT_BUFFER(6),
        UNRECOGNIZED(-1);

        public static final int TF_AUTO_GAIN_CONTROL_VALUE = 2;
        public static final int TF_ECHO_CANCELLATION_VALUE = 3;
        public static final int TF_ENHANCED_NOISE_CANCELLATION_VALUE = 5;
        public static final int TF_NOISE_SUPPRESSION_VALUE = 4;
        public static final int TF_NO_DTX_VALUE = 1;
        public static final int TF_PRECONNECT_BUFFER_VALUE = 6;
        public static final int TF_STEREO_VALUE = 0;
        private static final Internal.EnumLiteMap<AudioTrackFeature> internalValueMap = new Internal.EnumLiteMap<AudioTrackFeature>() { // from class: livekit.LivekitModels.AudioTrackFeature.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AudioTrackFeature findValueByNumber(int i) {
                return AudioTrackFeature.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static AudioTrackFeature valueOf(int i) {
            return forNumber(i);
        }

        public static AudioTrackFeature forNumber(int i) {
            switch (i) {
                case 0:
                    return TF_STEREO;
                case 1:
                    return TF_NO_DTX;
                case 2:
                    return TF_AUTO_GAIN_CONTROL;
                case 3:
                    return TF_ECHO_CANCELLATION;
                case 4:
                    return TF_NOISE_SUPPRESSION;
                case 5:
                    return TF_ENHANCED_NOISE_CANCELLATION;
                case 6:
                    return TF_PRECONNECT_BUFFER;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<AudioTrackFeature> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return AudioTrackFeatureVerifier.INSTANCE;
        }

        private static final class AudioTrackFeatureVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new AudioTrackFeatureVerifier();

            private AudioTrackFeatureVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return AudioTrackFeature.forNumber(i) != null;
            }
        }

        AudioTrackFeature(int i) {
            this.value = i;
        }
    }

    public static final class Pagination extends GeneratedMessageLite<Pagination, Builder> implements PaginationOrBuilder {
        public static final int AFTER_ID_FIELD_NUMBER = 1;
        private static final Pagination DEFAULT_INSTANCE;
        public static final int LIMIT_FIELD_NUMBER = 2;
        private static volatile Parser<Pagination> PARSER;
        private String afterId_ = "";
        private int limit_;

        private Pagination() {
        }

        @Override // livekit.LivekitModels.PaginationOrBuilder
        public String getAfterId() {
            return this.afterId_;
        }

        @Override // livekit.LivekitModels.PaginationOrBuilder
        public ByteString getAfterIdBytes() {
            return ByteString.copyFromUtf8(this.afterId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAfterId(String str) {
            str.getClass();
            this.afterId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAfterId() {
            this.afterId_ = getDefaultInstance().getAfterId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAfterIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.afterId_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.PaginationOrBuilder
        public int getLimit() {
            return this.limit_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimit(int i) {
            this.limit_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimit() {
            this.limit_ = 0;
        }

        public static Pagination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Pagination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Pagination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Pagination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Pagination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Pagination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Pagination parseFrom(InputStream inputStream) throws IOException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pagination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pagination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Pagination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pagination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pagination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pagination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Pagination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Pagination pagination) {
            return DEFAULT_INSTANCE.createBuilder(pagination);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Pagination, Builder> implements PaginationOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Pagination.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.PaginationOrBuilder
            public String getAfterId() {
                return ((Pagination) this.instance).getAfterId();
            }

            @Override // livekit.LivekitModels.PaginationOrBuilder
            public ByteString getAfterIdBytes() {
                return ((Pagination) this.instance).getAfterIdBytes();
            }

            public Builder setAfterId(String str) {
                copyOnWrite();
                ((Pagination) this.instance).setAfterId(str);
                return this;
            }

            public Builder clearAfterId() {
                copyOnWrite();
                ((Pagination) this.instance).clearAfterId();
                return this;
            }

            public Builder setAfterIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Pagination) this.instance).setAfterIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.PaginationOrBuilder
            public int getLimit() {
                return ((Pagination) this.instance).getLimit();
            }

            public Builder setLimit(int i) {
                copyOnWrite();
                ((Pagination) this.instance).setLimit(i);
                return this;
            }

            public Builder clearLimit() {
                copyOnWrite();
                ((Pagination) this.instance).clearLimit();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Pagination();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"afterId_", "limit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Pagination> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Pagination.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Pagination pagination = new Pagination();
            DEFAULT_INSTANCE = pagination;
            GeneratedMessageLite.registerDefaultInstance(Pagination.class, pagination);
        }

        public static Pagination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Pagination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: livekit.LivekitModels$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class TokenPagination extends GeneratedMessageLite<TokenPagination, Builder> implements TokenPaginationOrBuilder {
        private static final TokenPagination DEFAULT_INSTANCE;
        private static volatile Parser<TokenPagination> PARSER = null;
        public static final int TOKEN_FIELD_NUMBER = 1;
        private String token_ = "";

        private TokenPagination() {
        }

        @Override // livekit.LivekitModels.TokenPaginationOrBuilder
        public String getToken() {
            return this.token_;
        }

        @Override // livekit.LivekitModels.TokenPaginationOrBuilder
        public ByteString getTokenBytes() {
            return ByteString.copyFromUtf8(this.token_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToken(String str) {
            str.getClass();
            this.token_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToken() {
            this.token_ = getDefaultInstance().getToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.token_ = byteString.toStringUtf8();
        }

        public static TokenPagination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TokenPagination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TokenPagination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenPagination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TokenPagination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenPagination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TokenPagination parseFrom(InputStream inputStream) throws IOException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenPagination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TokenPagination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenPagination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenPagination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TokenPagination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TokenPagination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TokenPagination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TokenPagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TokenPagination tokenPagination) {
            return DEFAULT_INSTANCE.createBuilder(tokenPagination);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TokenPagination, Builder> implements TokenPaginationOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(TokenPagination.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.TokenPaginationOrBuilder
            public String getToken() {
                return ((TokenPagination) this.instance).getToken();
            }

            @Override // livekit.LivekitModels.TokenPaginationOrBuilder
            public ByteString getTokenBytes() {
                return ((TokenPagination) this.instance).getTokenBytes();
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((TokenPagination) this.instance).setToken(str);
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((TokenPagination) this.instance).clearToken();
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenPagination) this.instance).setTokenBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenPagination();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"token_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TokenPagination> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (TokenPagination.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            TokenPagination tokenPagination = new TokenPagination();
            DEFAULT_INSTANCE = tokenPagination;
            GeneratedMessageLite.registerDefaultInstance(TokenPagination.class, tokenPagination);
        }

        public static TokenPagination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TokenPagination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ListUpdate extends GeneratedMessageLite<ListUpdate, Builder> implements ListUpdateOrBuilder {
        public static final int ADD_FIELD_NUMBER = 2;
        public static final int CLEAR_FIELD_NUMBER = 4;
        private static final ListUpdate DEFAULT_INSTANCE;
        private static volatile Parser<ListUpdate> PARSER = null;
        public static final int REMOVE_FIELD_NUMBER = 3;
        public static final int SET_FIELD_NUMBER = 1;
        private boolean clear_;
        private Internal.ProtobufList<String> set_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> add_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> remove_ = GeneratedMessageLite.emptyProtobufList();

        private ListUpdate() {
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public List<String> getSetList() {
            return this.set_;
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public int getSetCount() {
            return this.set_.size();
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public String getSet(int i) {
            return this.set_.get(i);
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public ByteString getSetBytes(int i) {
            return ByteString.copyFromUtf8(this.set_.get(i));
        }

        private void ensureSetIsMutable() {
            Internal.ProtobufList<String> protobufList = this.set_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.set_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSet(int i, String str) {
            str.getClass();
            ensureSetIsMutable();
            this.set_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSet(String str) {
            str.getClass();
            ensureSetIsMutable();
            this.set_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSet(Iterable<String> iterable) {
            ensureSetIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.set_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSet() {
            this.set_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSetBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureSetIsMutable();
            this.set_.add(byteString.toStringUtf8());
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public List<String> getAddList() {
            return this.add_;
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public int getAddCount() {
            return this.add_.size();
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public String getAdd(int i) {
            return this.add_.get(i);
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public ByteString getAddBytes(int i) {
            return ByteString.copyFromUtf8(this.add_.get(i));
        }

        private void ensureAddIsMutable() {
            Internal.ProtobufList<String> protobufList = this.add_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.add_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdd(int i, String str) {
            str.getClass();
            ensureAddIsMutable();
            this.add_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdd(String str) {
            str.getClass();
            ensureAddIsMutable();
            this.add_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdd(Iterable<String> iterable) {
            ensureAddIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.add_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdd() {
            this.add_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAddBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureAddIsMutable();
            this.add_.add(byteString.toStringUtf8());
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public List<String> getRemoveList() {
            return this.remove_;
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public int getRemoveCount() {
            return this.remove_.size();
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public String getRemove(int i) {
            return this.remove_.get(i);
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public ByteString getRemoveBytes(int i) {
            return ByteString.copyFromUtf8(this.remove_.get(i));
        }

        private void ensureRemoveIsMutable() {
            Internal.ProtobufList<String> protobufList = this.remove_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.remove_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemove(int i, String str) {
            str.getClass();
            ensureRemoveIsMutable();
            this.remove_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRemove(String str) {
            str.getClass();
            ensureRemoveIsMutable();
            this.remove_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRemove(Iterable<String> iterable) {
            ensureRemoveIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.remove_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemove() {
            this.remove_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRemoveBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureRemoveIsMutable();
            this.remove_.add(byteString.toStringUtf8());
        }

        @Override // livekit.LivekitModels.ListUpdateOrBuilder
        public boolean getClear() {
            return this.clear_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClear(boolean z) {
            this.clear_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClear() {
            this.clear_ = false;
        }

        public static ListUpdate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ListUpdate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ListUpdate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListUpdate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ListUpdate parseFrom(InputStream inputStream) throws IOException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListUpdate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListUpdate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListUpdate parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListUpdate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ListUpdate listUpdate) {
            return DEFAULT_INSTANCE.createBuilder(listUpdate);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ListUpdate, Builder> implements ListUpdateOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ListUpdate.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public List<String> getSetList() {
                return Collections.unmodifiableList(((ListUpdate) this.instance).getSetList());
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public int getSetCount() {
                return ((ListUpdate) this.instance).getSetCount();
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public String getSet(int i) {
                return ((ListUpdate) this.instance).getSet(i);
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public ByteString getSetBytes(int i) {
                return ((ListUpdate) this.instance).getSetBytes(i);
            }

            public Builder setSet(int i, String str) {
                copyOnWrite();
                ((ListUpdate) this.instance).setSet(i, str);
                return this;
            }

            public Builder addSet(String str) {
                copyOnWrite();
                ((ListUpdate) this.instance).addSet(str);
                return this;
            }

            public Builder addAllSet(Iterable<String> iterable) {
                copyOnWrite();
                ((ListUpdate) this.instance).addAllSet(iterable);
                return this;
            }

            public Builder clearSet() {
                copyOnWrite();
                ((ListUpdate) this.instance).clearSet();
                return this;
            }

            public Builder addSetBytes(ByteString byteString) {
                copyOnWrite();
                ((ListUpdate) this.instance).addSetBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public List<String> getAddList() {
                return Collections.unmodifiableList(((ListUpdate) this.instance).getAddList());
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public int getAddCount() {
                return ((ListUpdate) this.instance).getAddCount();
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public String getAdd(int i) {
                return ((ListUpdate) this.instance).getAdd(i);
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public ByteString getAddBytes(int i) {
                return ((ListUpdate) this.instance).getAddBytes(i);
            }

            public Builder setAdd(int i, String str) {
                copyOnWrite();
                ((ListUpdate) this.instance).setAdd(i, str);
                return this;
            }

            public Builder addAdd(String str) {
                copyOnWrite();
                ((ListUpdate) this.instance).addAdd(str);
                return this;
            }

            public Builder addAllAdd(Iterable<String> iterable) {
                copyOnWrite();
                ((ListUpdate) this.instance).addAllAdd(iterable);
                return this;
            }

            public Builder clearAdd() {
                copyOnWrite();
                ((ListUpdate) this.instance).clearAdd();
                return this;
            }

            public Builder addAddBytes(ByteString byteString) {
                copyOnWrite();
                ((ListUpdate) this.instance).addAddBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public List<String> getRemoveList() {
                return Collections.unmodifiableList(((ListUpdate) this.instance).getRemoveList());
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public int getRemoveCount() {
                return ((ListUpdate) this.instance).getRemoveCount();
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public String getRemove(int i) {
                return ((ListUpdate) this.instance).getRemove(i);
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public ByteString getRemoveBytes(int i) {
                return ((ListUpdate) this.instance).getRemoveBytes(i);
            }

            public Builder setRemove(int i, String str) {
                copyOnWrite();
                ((ListUpdate) this.instance).setRemove(i, str);
                return this;
            }

            public Builder addRemove(String str) {
                copyOnWrite();
                ((ListUpdate) this.instance).addRemove(str);
                return this;
            }

            public Builder addAllRemove(Iterable<String> iterable) {
                copyOnWrite();
                ((ListUpdate) this.instance).addAllRemove(iterable);
                return this;
            }

            public Builder clearRemove() {
                copyOnWrite();
                ((ListUpdate) this.instance).clearRemove();
                return this;
            }

            public Builder addRemoveBytes(ByteString byteString) {
                copyOnWrite();
                ((ListUpdate) this.instance).addRemoveBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ListUpdateOrBuilder
            public boolean getClear() {
                return ((ListUpdate) this.instance).getClear();
            }

            public Builder setClear(boolean z) {
                copyOnWrite();
                ((ListUpdate) this.instance).setClear(z);
                return this;
            }

            public Builder clearClear() {
                copyOnWrite();
                ((ListUpdate) this.instance).clearClear();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListUpdate();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003Ț\u0004\u0007", new Object[]{"set_", "add_", "remove_", "clear_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListUpdate> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ListUpdate.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ListUpdate listUpdate = new ListUpdate();
            DEFAULT_INSTANCE = listUpdate;
            GeneratedMessageLite.registerDefaultInstance(ListUpdate.class, listUpdate);
        }

        public static ListUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ListUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Room extends GeneratedMessageLite<Room, Builder> implements RoomOrBuilder {
        public static final int ACTIVE_RECORDING_FIELD_NUMBER = 10;
        public static final int CREATION_TIME_FIELD_NUMBER = 5;
        public static final int CREATION_TIME_MS_FIELD_NUMBER = 15;
        private static final Room DEFAULT_INSTANCE;
        public static final int DEPARTURE_TIMEOUT_FIELD_NUMBER = 14;
        public static final int EMPTY_TIMEOUT_FIELD_NUMBER = 3;
        public static final int ENABLED_CODECS_FIELD_NUMBER = 7;
        public static final int MAX_PARTICIPANTS_FIELD_NUMBER = 4;
        public static final int METADATA_FIELD_NUMBER = 8;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUM_PARTICIPANTS_FIELD_NUMBER = 9;
        public static final int NUM_PUBLISHERS_FIELD_NUMBER = 11;
        private static volatile Parser<Room> PARSER = null;
        public static final int SID_FIELD_NUMBER = 1;
        public static final int TURN_PASSWORD_FIELD_NUMBER = 6;
        public static final int VERSION_FIELD_NUMBER = 13;
        private boolean activeRecording_;
        private long creationTimeMs_;
        private long creationTime_;
        private int departureTimeout_;
        private int emptyTimeout_;
        private int maxParticipants_;
        private int numParticipants_;
        private int numPublishers_;
        private TimedVersion version_;
        private String sid_ = "";
        private String name_ = "";
        private String turnPassword_ = "";
        private Internal.ProtobufList<Codec> enabledCodecs_ = emptyProtobufList();
        private String metadata_ = "";

        private Room() {
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public String getSid() {
            return this.sid_;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8(this.sid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSid(String str) {
            str.getClass();
            this.sid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSid() {
            this.sid_ = getDefaultInstance().getSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public int getEmptyTimeout() {
            return this.emptyTimeout_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmptyTimeout(int i) {
            this.emptyTimeout_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEmptyTimeout() {
            this.emptyTimeout_ = 0;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public int getDepartureTimeout() {
            return this.departureTimeout_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDepartureTimeout(int i) {
            this.departureTimeout_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDepartureTimeout() {
            this.departureTimeout_ = 0;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public int getMaxParticipants() {
            return this.maxParticipants_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxParticipants(int i) {
            this.maxParticipants_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxParticipants() {
            this.maxParticipants_ = 0;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public long getCreationTime() {
            return this.creationTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreationTime(long j) {
            this.creationTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreationTime() {
            this.creationTime_ = 0L;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public long getCreationTimeMs() {
            return this.creationTimeMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreationTimeMs(long j) {
            this.creationTimeMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreationTimeMs() {
            this.creationTimeMs_ = 0L;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public String getTurnPassword() {
            return this.turnPassword_;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public ByteString getTurnPasswordBytes() {
            return ByteString.copyFromUtf8(this.turnPassword_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnPassword(String str) {
            str.getClass();
            this.turnPassword_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTurnPassword() {
            this.turnPassword_ = getDefaultInstance().getTurnPassword();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnPasswordBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.turnPassword_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public List<Codec> getEnabledCodecsList() {
            return this.enabledCodecs_;
        }

        public List<? extends CodecOrBuilder> getEnabledCodecsOrBuilderList() {
            return this.enabledCodecs_;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public int getEnabledCodecsCount() {
            return this.enabledCodecs_.size();
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public Codec getEnabledCodecs(int i) {
            return this.enabledCodecs_.get(i);
        }

        public CodecOrBuilder getEnabledCodecsOrBuilder(int i) {
            return this.enabledCodecs_.get(i);
        }

        private void ensureEnabledCodecsIsMutable() {
            Internal.ProtobufList<Codec> protobufList = this.enabledCodecs_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.enabledCodecs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabledCodecs(int i, Codec codec) {
            codec.getClass();
            ensureEnabledCodecsIsMutable();
            this.enabledCodecs_.set(i, codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnabledCodecs(Codec codec) {
            codec.getClass();
            ensureEnabledCodecsIsMutable();
            this.enabledCodecs_.add(codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnabledCodecs(int i, Codec codec) {
            codec.getClass();
            ensureEnabledCodecsIsMutable();
            this.enabledCodecs_.add(i, codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnabledCodecs(Iterable<? extends Codec> iterable) {
            ensureEnabledCodecsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.enabledCodecs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabledCodecs() {
            this.enabledCodecs_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnabledCodecs(int i) {
            ensureEnabledCodecsIsMutable();
            this.enabledCodecs_.remove(i);
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public String getMetadata() {
            return this.metadata_;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public ByteString getMetadataBytes() {
            return ByteString.copyFromUtf8(this.metadata_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadata(String str) {
            str.getClass();
            this.metadata_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadata_ = getDefaultInstance().getMetadata();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.metadata_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public int getNumParticipants() {
            return this.numParticipants_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumParticipants(int i) {
            this.numParticipants_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumParticipants() {
            this.numParticipants_ = 0;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public int getNumPublishers() {
            return this.numPublishers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumPublishers(int i) {
            this.numPublishers_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumPublishers() {
            this.numPublishers_ = 0;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public boolean getActiveRecording() {
            return this.activeRecording_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveRecording(boolean z) {
            this.activeRecording_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActiveRecording() {
            this.activeRecording_ = false;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public boolean hasVersion() {
            return this.version_ != null;
        }

        @Override // livekit.LivekitModels.RoomOrBuilder
        public TimedVersion getVersion() {
            TimedVersion timedVersion = this.version_;
            return timedVersion == null ? TimedVersion.getDefaultInstance() : timedVersion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(TimedVersion timedVersion) {
            timedVersion.getClass();
            this.version_ = timedVersion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVersion(TimedVersion timedVersion) {
            timedVersion.getClass();
            TimedVersion timedVersion2 = this.version_;
            if (timedVersion2 != null && timedVersion2 != TimedVersion.getDefaultInstance()) {
                this.version_ = TimedVersion.newBuilder(this.version_).mergeFrom((TimedVersion.Builder) timedVersion).buildPartial();
            } else {
                this.version_ = timedVersion;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = null;
        }

        public static Room parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Room parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Room parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Room parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Room parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Room parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Room parseFrom(InputStream inputStream) throws IOException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Room parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Room parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Room) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Room parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Room) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Room parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Room parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Room) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Room room) {
            return DEFAULT_INSTANCE.createBuilder(room);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Room, Builder> implements RoomOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Room.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public String getSid() {
                return ((Room) this.instance).getSid();
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public ByteString getSidBytes() {
                return ((Room) this.instance).getSidBytes();
            }

            public Builder setSid(String str) {
                copyOnWrite();
                ((Room) this.instance).setSid(str);
                return this;
            }

            public Builder clearSid() {
                copyOnWrite();
                ((Room) this.instance).clearSid();
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                copyOnWrite();
                ((Room) this.instance).setSidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public String getName() {
                return ((Room) this.instance).getName();
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public ByteString getNameBytes() {
                return ((Room) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Room) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Room) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Room) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public int getEmptyTimeout() {
                return ((Room) this.instance).getEmptyTimeout();
            }

            public Builder setEmptyTimeout(int i) {
                copyOnWrite();
                ((Room) this.instance).setEmptyTimeout(i);
                return this;
            }

            public Builder clearEmptyTimeout() {
                copyOnWrite();
                ((Room) this.instance).clearEmptyTimeout();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public int getDepartureTimeout() {
                return ((Room) this.instance).getDepartureTimeout();
            }

            public Builder setDepartureTimeout(int i) {
                copyOnWrite();
                ((Room) this.instance).setDepartureTimeout(i);
                return this;
            }

            public Builder clearDepartureTimeout() {
                copyOnWrite();
                ((Room) this.instance).clearDepartureTimeout();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public int getMaxParticipants() {
                return ((Room) this.instance).getMaxParticipants();
            }

            public Builder setMaxParticipants(int i) {
                copyOnWrite();
                ((Room) this.instance).setMaxParticipants(i);
                return this;
            }

            public Builder clearMaxParticipants() {
                copyOnWrite();
                ((Room) this.instance).clearMaxParticipants();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public long getCreationTime() {
                return ((Room) this.instance).getCreationTime();
            }

            public Builder setCreationTime(long j) {
                copyOnWrite();
                ((Room) this.instance).setCreationTime(j);
                return this;
            }

            public Builder clearCreationTime() {
                copyOnWrite();
                ((Room) this.instance).clearCreationTime();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public long getCreationTimeMs() {
                return ((Room) this.instance).getCreationTimeMs();
            }

            public Builder setCreationTimeMs(long j) {
                copyOnWrite();
                ((Room) this.instance).setCreationTimeMs(j);
                return this;
            }

            public Builder clearCreationTimeMs() {
                copyOnWrite();
                ((Room) this.instance).clearCreationTimeMs();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public String getTurnPassword() {
                return ((Room) this.instance).getTurnPassword();
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public ByteString getTurnPasswordBytes() {
                return ((Room) this.instance).getTurnPasswordBytes();
            }

            public Builder setTurnPassword(String str) {
                copyOnWrite();
                ((Room) this.instance).setTurnPassword(str);
                return this;
            }

            public Builder clearTurnPassword() {
                copyOnWrite();
                ((Room) this.instance).clearTurnPassword();
                return this;
            }

            public Builder setTurnPasswordBytes(ByteString byteString) {
                copyOnWrite();
                ((Room) this.instance).setTurnPasswordBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public List<Codec> getEnabledCodecsList() {
                return Collections.unmodifiableList(((Room) this.instance).getEnabledCodecsList());
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public int getEnabledCodecsCount() {
                return ((Room) this.instance).getEnabledCodecsCount();
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public Codec getEnabledCodecs(int i) {
                return ((Room) this.instance).getEnabledCodecs(i);
            }

            public Builder setEnabledCodecs(int i, Codec codec) {
                copyOnWrite();
                ((Room) this.instance).setEnabledCodecs(i, codec);
                return this;
            }

            public Builder setEnabledCodecs(int i, Codec.Builder builder) {
                copyOnWrite();
                ((Room) this.instance).setEnabledCodecs(i, builder.build());
                return this;
            }

            public Builder addEnabledCodecs(Codec codec) {
                copyOnWrite();
                ((Room) this.instance).addEnabledCodecs(codec);
                return this;
            }

            public Builder addEnabledCodecs(int i, Codec codec) {
                copyOnWrite();
                ((Room) this.instance).addEnabledCodecs(i, codec);
                return this;
            }

            public Builder addEnabledCodecs(Codec.Builder builder) {
                copyOnWrite();
                ((Room) this.instance).addEnabledCodecs(builder.build());
                return this;
            }

            public Builder addEnabledCodecs(int i, Codec.Builder builder) {
                copyOnWrite();
                ((Room) this.instance).addEnabledCodecs(i, builder.build());
                return this;
            }

            public Builder addAllEnabledCodecs(Iterable<? extends Codec> iterable) {
                copyOnWrite();
                ((Room) this.instance).addAllEnabledCodecs(iterable);
                return this;
            }

            public Builder clearEnabledCodecs() {
                copyOnWrite();
                ((Room) this.instance).clearEnabledCodecs();
                return this;
            }

            public Builder removeEnabledCodecs(int i) {
                copyOnWrite();
                ((Room) this.instance).removeEnabledCodecs(i);
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public String getMetadata() {
                return ((Room) this.instance).getMetadata();
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public ByteString getMetadataBytes() {
                return ((Room) this.instance).getMetadataBytes();
            }

            public Builder setMetadata(String str) {
                copyOnWrite();
                ((Room) this.instance).setMetadata(str);
                return this;
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((Room) this.instance).clearMetadata();
                return this;
            }

            public Builder setMetadataBytes(ByteString byteString) {
                copyOnWrite();
                ((Room) this.instance).setMetadataBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public int getNumParticipants() {
                return ((Room) this.instance).getNumParticipants();
            }

            public Builder setNumParticipants(int i) {
                copyOnWrite();
                ((Room) this.instance).setNumParticipants(i);
                return this;
            }

            public Builder clearNumParticipants() {
                copyOnWrite();
                ((Room) this.instance).clearNumParticipants();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public int getNumPublishers() {
                return ((Room) this.instance).getNumPublishers();
            }

            public Builder setNumPublishers(int i) {
                copyOnWrite();
                ((Room) this.instance).setNumPublishers(i);
                return this;
            }

            public Builder clearNumPublishers() {
                copyOnWrite();
                ((Room) this.instance).clearNumPublishers();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public boolean getActiveRecording() {
                return ((Room) this.instance).getActiveRecording();
            }

            public Builder setActiveRecording(boolean z) {
                copyOnWrite();
                ((Room) this.instance).setActiveRecording(z);
                return this;
            }

            public Builder clearActiveRecording() {
                copyOnWrite();
                ((Room) this.instance).clearActiveRecording();
                return this;
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public boolean hasVersion() {
                return ((Room) this.instance).hasVersion();
            }

            @Override // livekit.LivekitModels.RoomOrBuilder
            public TimedVersion getVersion() {
                return ((Room) this.instance).getVersion();
            }

            public Builder setVersion(TimedVersion timedVersion) {
                copyOnWrite();
                ((Room) this.instance).setVersion(timedVersion);
                return this;
            }

            public Builder setVersion(TimedVersion.Builder builder) {
                copyOnWrite();
                ((Room) this.instance).setVersion(builder.build());
                return this;
            }

            public Builder mergeVersion(TimedVersion timedVersion) {
                copyOnWrite();
                ((Room) this.instance).mergeVersion(timedVersion);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Room) this.instance).clearVersion();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Room();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000f\u000e\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u000b\u0005\u0002\u0006Ȉ\u0007\u001b\bȈ\t\u000b\n\u0007\u000b\u000b\r\t\u000e\u000b\u000f\u0002", new Object[]{"sid_", "name_", "emptyTimeout_", "maxParticipants_", "creationTime_", "turnPassword_", "enabledCodecs_", Codec.class, "metadata_", "numParticipants_", "activeRecording_", "numPublishers_", "version_", "departureTimeout_", "creationTimeMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Room> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Room.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Room room = new Room();
            DEFAULT_INSTANCE = room;
            GeneratedMessageLite.registerDefaultInstance(Room.class, room);
        }

        public static Room getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Room> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Codec extends GeneratedMessageLite<Codec, Builder> implements CodecOrBuilder {
        private static final Codec DEFAULT_INSTANCE;
        public static final int FMTP_LINE_FIELD_NUMBER = 2;
        public static final int MIME_FIELD_NUMBER = 1;
        private static volatile Parser<Codec> PARSER;
        private String mime_ = "";
        private String fmtpLine_ = "";

        private Codec() {
        }

        @Override // livekit.LivekitModels.CodecOrBuilder
        public String getMime() {
            return this.mime_;
        }

        @Override // livekit.LivekitModels.CodecOrBuilder
        public ByteString getMimeBytes() {
            return ByteString.copyFromUtf8(this.mime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMime(String str) {
            str.getClass();
            this.mime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMime() {
            this.mime_ = getDefaultInstance().getMime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMimeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mime_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.CodecOrBuilder
        public String getFmtpLine() {
            return this.fmtpLine_;
        }

        @Override // livekit.LivekitModels.CodecOrBuilder
        public ByteString getFmtpLineBytes() {
            return ByteString.copyFromUtf8(this.fmtpLine_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFmtpLine(String str) {
            str.getClass();
            this.fmtpLine_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFmtpLine() {
            this.fmtpLine_ = getDefaultInstance().getFmtpLine();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFmtpLineBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.fmtpLine_ = byteString.toStringUtf8();
        }

        public static Codec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Codec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Codec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Codec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Codec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Codec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Codec parseFrom(InputStream inputStream) throws IOException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Codec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Codec parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Codec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Codec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Codec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Codec parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Codec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Codec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Codec codec) {
            return DEFAULT_INSTANCE.createBuilder(codec);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Codec, Builder> implements CodecOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Codec.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.CodecOrBuilder
            public String getMime() {
                return ((Codec) this.instance).getMime();
            }

            @Override // livekit.LivekitModels.CodecOrBuilder
            public ByteString getMimeBytes() {
                return ((Codec) this.instance).getMimeBytes();
            }

            public Builder setMime(String str) {
                copyOnWrite();
                ((Codec) this.instance).setMime(str);
                return this;
            }

            public Builder clearMime() {
                copyOnWrite();
                ((Codec) this.instance).clearMime();
                return this;
            }

            public Builder setMimeBytes(ByteString byteString) {
                copyOnWrite();
                ((Codec) this.instance).setMimeBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.CodecOrBuilder
            public String getFmtpLine() {
                return ((Codec) this.instance).getFmtpLine();
            }

            @Override // livekit.LivekitModels.CodecOrBuilder
            public ByteString getFmtpLineBytes() {
                return ((Codec) this.instance).getFmtpLineBytes();
            }

            public Builder setFmtpLine(String str) {
                copyOnWrite();
                ((Codec) this.instance).setFmtpLine(str);
                return this;
            }

            public Builder clearFmtpLine() {
                copyOnWrite();
                ((Codec) this.instance).clearFmtpLine();
                return this;
            }

            public Builder setFmtpLineBytes(ByteString byteString) {
                copyOnWrite();
                ((Codec) this.instance).setFmtpLineBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Codec();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"mime_", "fmtpLine_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Codec> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Codec.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Codec codec = new Codec();
            DEFAULT_INSTANCE = codec;
            GeneratedMessageLite.registerDefaultInstance(Codec.class, codec);
        }

        public static Codec getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Codec> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class PlayoutDelay extends GeneratedMessageLite<PlayoutDelay, Builder> implements PlayoutDelayOrBuilder {
        private static final PlayoutDelay DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_FIELD_NUMBER = 3;
        public static final int MIN_FIELD_NUMBER = 2;
        private static volatile Parser<PlayoutDelay> PARSER;
        private boolean enabled_;
        private int max_;
        private int min_;

        private PlayoutDelay() {
        }

        @Override // livekit.LivekitModels.PlayoutDelayOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        @Override // livekit.LivekitModels.PlayoutDelayOrBuilder
        public int getMin() {
            return this.min_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMin(int i) {
            this.min_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMin() {
            this.min_ = 0;
        }

        @Override // livekit.LivekitModels.PlayoutDelayOrBuilder
        public int getMax() {
            return this.max_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMax(int i) {
            this.max_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMax() {
            this.max_ = 0;
        }

        public static PlayoutDelay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PlayoutDelay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PlayoutDelay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PlayoutDelay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PlayoutDelay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlayoutDelay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PlayoutDelay parseFrom(InputStream inputStream) throws IOException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayoutDelay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlayoutDelay parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PlayoutDelay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayoutDelay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlayoutDelay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlayoutDelay parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PlayoutDelay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlayoutDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PlayoutDelay playoutDelay) {
            return DEFAULT_INSTANCE.createBuilder(playoutDelay);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PlayoutDelay, Builder> implements PlayoutDelayOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(PlayoutDelay.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.PlayoutDelayOrBuilder
            public boolean getEnabled() {
                return ((PlayoutDelay) this.instance).getEnabled();
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                ((PlayoutDelay) this.instance).setEnabled(z);
                return this;
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((PlayoutDelay) this.instance).clearEnabled();
                return this;
            }

            @Override // livekit.LivekitModels.PlayoutDelayOrBuilder
            public int getMin() {
                return ((PlayoutDelay) this.instance).getMin();
            }

            public Builder setMin(int i) {
                copyOnWrite();
                ((PlayoutDelay) this.instance).setMin(i);
                return this;
            }

            public Builder clearMin() {
                copyOnWrite();
                ((PlayoutDelay) this.instance).clearMin();
                return this;
            }

            @Override // livekit.LivekitModels.PlayoutDelayOrBuilder
            public int getMax() {
                return ((PlayoutDelay) this.instance).getMax();
            }

            public Builder setMax(int i) {
                copyOnWrite();
                ((PlayoutDelay) this.instance).setMax(i);
                return this;
            }

            public Builder clearMax() {
                copyOnWrite();
                ((PlayoutDelay) this.instance).clearMax();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PlayoutDelay();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b", new Object[]{"enabled_", "min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PlayoutDelay> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (PlayoutDelay.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            PlayoutDelay playoutDelay = new PlayoutDelay();
            DEFAULT_INSTANCE = playoutDelay;
            GeneratedMessageLite.registerDefaultInstance(PlayoutDelay.class, playoutDelay);
        }

        public static PlayoutDelay getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PlayoutDelay> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ParticipantPermission extends GeneratedMessageLite<ParticipantPermission, Builder> implements ParticipantPermissionOrBuilder {
        public static final int AGENT_FIELD_NUMBER = 11;
        public static final int CAN_PUBLISH_DATA_FIELD_NUMBER = 3;
        public static final int CAN_PUBLISH_FIELD_NUMBER = 2;
        public static final int CAN_PUBLISH_SOURCES_FIELD_NUMBER = 9;
        public static final int CAN_SUBSCRIBE_FIELD_NUMBER = 1;
        public static final int CAN_SUBSCRIBE_METRICS_FIELD_NUMBER = 12;
        public static final int CAN_UPDATE_METADATA_FIELD_NUMBER = 10;
        private static final ParticipantPermission DEFAULT_INSTANCE;
        public static final int HIDDEN_FIELD_NUMBER = 7;
        private static volatile Parser<ParticipantPermission> PARSER = null;
        public static final int RECORDER_FIELD_NUMBER = 8;
        private static final Internal.ListAdapter.Converter<Integer, TrackSource> canPublishSources_converter_ = new Internal.ListAdapter.Converter<Integer, TrackSource>() { // from class: livekit.LivekitModels.ParticipantPermission.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public TrackSource convert(Integer num) {
                TrackSource forNumber = TrackSource.forNumber(num.intValue());
                return forNumber == null ? TrackSource.UNRECOGNIZED : forNumber;
            }
        };
        private boolean agent_;
        private boolean canPublishData_;
        private int canPublishSourcesMemoizedSerializedSize;
        private Internal.IntList canPublishSources_ = emptyIntList();
        private boolean canPublish_;
        private boolean canSubscribeMetrics_;
        private boolean canSubscribe_;
        private boolean canUpdateMetadata_;
        private boolean hidden_;
        private boolean recorder_;

        private ParticipantPermission() {
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public boolean getCanSubscribe() {
            return this.canSubscribe_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanSubscribe(boolean z) {
            this.canSubscribe_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanSubscribe() {
            this.canSubscribe_ = false;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public boolean getCanPublish() {
            return this.canPublish_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanPublish(boolean z) {
            this.canPublish_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanPublish() {
            this.canPublish_ = false;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public boolean getCanPublishData() {
            return this.canPublishData_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanPublishData(boolean z) {
            this.canPublishData_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanPublishData() {
            this.canPublishData_ = false;
        }

        static {
            ParticipantPermission participantPermission = new ParticipantPermission();
            DEFAULT_INSTANCE = participantPermission;
            GeneratedMessageLite.registerDefaultInstance(ParticipantPermission.class, participantPermission);
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public List<TrackSource> getCanPublishSourcesList() {
            return new Internal.ListAdapter(this.canPublishSources_, canPublishSources_converter_);
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public int getCanPublishSourcesCount() {
            return this.canPublishSources_.size();
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public TrackSource getCanPublishSources(int i) {
            TrackSource forNumber = TrackSource.forNumber(this.canPublishSources_.getInt(i));
            return forNumber == null ? TrackSource.UNRECOGNIZED : forNumber;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public List<Integer> getCanPublishSourcesValueList() {
            return this.canPublishSources_;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public int getCanPublishSourcesValue(int i) {
            return this.canPublishSources_.getInt(i);
        }

        private void ensureCanPublishSourcesIsMutable() {
            Internal.IntList intList = this.canPublishSources_;
            if (intList.isModifiable()) {
                return;
            }
            this.canPublishSources_ = GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanPublishSources(int i, TrackSource trackSource) {
            trackSource.getClass();
            ensureCanPublishSourcesIsMutable();
            this.canPublishSources_.setInt(i, trackSource.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCanPublishSources(TrackSource trackSource) {
            trackSource.getClass();
            ensureCanPublishSourcesIsMutable();
            this.canPublishSources_.addInt(trackSource.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCanPublishSources(Iterable<? extends TrackSource> iterable) {
            ensureCanPublishSourcesIsMutable();
            Iterator<? extends TrackSource> it = iterable.iterator();
            while (it.hasNext()) {
                this.canPublishSources_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanPublishSources() {
            this.canPublishSources_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanPublishSourcesValue(int i, int i2) {
            ensureCanPublishSourcesIsMutable();
            this.canPublishSources_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCanPublishSourcesValue(int i) {
            ensureCanPublishSourcesIsMutable();
            this.canPublishSources_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCanPublishSourcesValue(Iterable<Integer> iterable) {
            ensureCanPublishSourcesIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.canPublishSources_.addInt(it.next().intValue());
            }
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public boolean getHidden() {
            return this.hidden_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHidden(boolean z) {
            this.hidden_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHidden() {
            this.hidden_ = false;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        @Deprecated
        public boolean getRecorder() {
            return this.recorder_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecorder(boolean z) {
            this.recorder_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecorder() {
            this.recorder_ = false;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public boolean getCanUpdateMetadata() {
            return this.canUpdateMetadata_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanUpdateMetadata(boolean z) {
            this.canUpdateMetadata_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanUpdateMetadata() {
            this.canUpdateMetadata_ = false;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        @Deprecated
        public boolean getAgent() {
            return this.agent_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgent(boolean z) {
            this.agent_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAgent() {
            this.agent_ = false;
        }

        @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
        public boolean getCanSubscribeMetrics() {
            return this.canSubscribeMetrics_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanSubscribeMetrics(boolean z) {
            this.canSubscribeMetrics_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanSubscribeMetrics() {
            this.canSubscribeMetrics_ = false;
        }

        public static ParticipantPermission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ParticipantPermission parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ParticipantPermission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ParticipantPermission parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ParticipantPermission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ParticipantPermission parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ParticipantPermission parseFrom(InputStream inputStream) throws IOException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParticipantPermission parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParticipantPermission parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ParticipantPermission) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParticipantPermission parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantPermission) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParticipantPermission parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ParticipantPermission parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ParticipantPermission participantPermission) {
            return DEFAULT_INSTANCE.createBuilder(participantPermission);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ParticipantPermission, Builder> implements ParticipantPermissionOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ParticipantPermission.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public boolean getCanSubscribe() {
                return ((ParticipantPermission) this.instance).getCanSubscribe();
            }

            public Builder setCanSubscribe(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setCanSubscribe(z);
                return this;
            }

            public Builder clearCanSubscribe() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearCanSubscribe();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public boolean getCanPublish() {
                return ((ParticipantPermission) this.instance).getCanPublish();
            }

            public Builder setCanPublish(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setCanPublish(z);
                return this;
            }

            public Builder clearCanPublish() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearCanPublish();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public boolean getCanPublishData() {
                return ((ParticipantPermission) this.instance).getCanPublishData();
            }

            public Builder setCanPublishData(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setCanPublishData(z);
                return this;
            }

            public Builder clearCanPublishData() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearCanPublishData();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public List<TrackSource> getCanPublishSourcesList() {
                return ((ParticipantPermission) this.instance).getCanPublishSourcesList();
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public int getCanPublishSourcesCount() {
                return ((ParticipantPermission) this.instance).getCanPublishSourcesCount();
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public TrackSource getCanPublishSources(int i) {
                return ((ParticipantPermission) this.instance).getCanPublishSources(i);
            }

            public Builder setCanPublishSources(int i, TrackSource trackSource) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setCanPublishSources(i, trackSource);
                return this;
            }

            public Builder addCanPublishSources(TrackSource trackSource) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).addCanPublishSources(trackSource);
                return this;
            }

            public Builder addAllCanPublishSources(Iterable<? extends TrackSource> iterable) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).addAllCanPublishSources(iterable);
                return this;
            }

            public Builder clearCanPublishSources() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearCanPublishSources();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public List<Integer> getCanPublishSourcesValueList() {
                return Collections.unmodifiableList(((ParticipantPermission) this.instance).getCanPublishSourcesValueList());
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public int getCanPublishSourcesValue(int i) {
                return ((ParticipantPermission) this.instance).getCanPublishSourcesValue(i);
            }

            public Builder setCanPublishSourcesValue(int i, int i2) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setCanPublishSourcesValue(i, i2);
                return this;
            }

            public Builder addCanPublishSourcesValue(int i) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).addCanPublishSourcesValue(i);
                return this;
            }

            public Builder addAllCanPublishSourcesValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).addAllCanPublishSourcesValue(iterable);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public boolean getHidden() {
                return ((ParticipantPermission) this.instance).getHidden();
            }

            public Builder setHidden(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setHidden(z);
                return this;
            }

            public Builder clearHidden() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearHidden();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            @Deprecated
            public boolean getRecorder() {
                return ((ParticipantPermission) this.instance).getRecorder();
            }

            @Deprecated
            public Builder setRecorder(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setRecorder(z);
                return this;
            }

            @Deprecated
            public Builder clearRecorder() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearRecorder();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public boolean getCanUpdateMetadata() {
                return ((ParticipantPermission) this.instance).getCanUpdateMetadata();
            }

            public Builder setCanUpdateMetadata(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setCanUpdateMetadata(z);
                return this;
            }

            public Builder clearCanUpdateMetadata() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearCanUpdateMetadata();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            @Deprecated
            public boolean getAgent() {
                return ((ParticipantPermission) this.instance).getAgent();
            }

            @Deprecated
            public Builder setAgent(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setAgent(z);
                return this;
            }

            @Deprecated
            public Builder clearAgent() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearAgent();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantPermissionOrBuilder
            public boolean getCanSubscribeMetrics() {
                return ((ParticipantPermission) this.instance).getCanSubscribeMetrics();
            }

            public Builder setCanSubscribeMetrics(boolean z) {
                copyOnWrite();
                ((ParticipantPermission) this.instance).setCanSubscribeMetrics(z);
                return this;
            }

            public Builder clearCanSubscribeMetrics() {
                copyOnWrite();
                ((ParticipantPermission) this.instance).clearCanSubscribeMetrics();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ParticipantPermission();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\f\t\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0007\u0007\b\u0007\t,\n\u0007\u000b\u0007\f\u0007", new Object[]{"canSubscribe_", "canPublish_", "canPublishData_", "hidden_", "recorder_", "canPublishSources_", "canUpdateMetadata_", "agent_", "canSubscribeMetrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ParticipantPermission> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ParticipantPermission.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static ParticipantPermission getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ParticipantPermission> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ParticipantInfo extends GeneratedMessageLite<ParticipantInfo, Builder> implements ParticipantInfoOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 15;
        private static final ParticipantInfo DEFAULT_INSTANCE;
        public static final int DISCONNECT_REASON_FIELD_NUMBER = 16;
        public static final int IDENTITY_FIELD_NUMBER = 2;
        public static final int IS_PUBLISHER_FIELD_NUMBER = 13;
        public static final int JOINED_AT_FIELD_NUMBER = 6;
        public static final int JOINED_AT_MS_FIELD_NUMBER = 17;
        public static final int KIND_DETAILS_FIELD_NUMBER = 18;
        public static final int KIND_FIELD_NUMBER = 14;
        public static final int METADATA_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 9;
        private static volatile Parser<ParticipantInfo> PARSER = null;
        public static final int PERMISSION_FIELD_NUMBER = 11;
        public static final int REGION_FIELD_NUMBER = 12;
        public static final int SID_FIELD_NUMBER = 1;
        public static final int STATE_FIELD_NUMBER = 3;
        public static final int TRACKS_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 10;
        private static final Internal.ListAdapter.Converter<Integer, KindDetail> kindDetails_converter_ = new Internal.ListAdapter.Converter<Integer, KindDetail>() { // from class: livekit.LivekitModels.ParticipantInfo.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public KindDetail convert(Integer num) {
                KindDetail forNumber = KindDetail.forNumber(num.intValue());
                return forNumber == null ? KindDetail.UNRECOGNIZED : forNumber;
            }
        };
        private int disconnectReason_;
        private boolean isPublisher_;
        private long joinedAtMs_;
        private long joinedAt_;
        private int kindDetailsMemoizedSerializedSize;
        private int kind_;
        private ParticipantPermission permission_;
        private int state_;
        private int version_;
        private MapFieldLite<String, String> attributes_ = MapFieldLite.emptyMapField();
        private String sid_ = "";
        private String identity_ = "";
        private Internal.ProtobufList<TrackInfo> tracks_ = emptyProtobufList();
        private String metadata_ = "";
        private String name_ = "";
        private String region_ = "";
        private Internal.IntList kindDetails_ = emptyIntList();

        private ParticipantInfo() {
        }

        public enum State implements Internal.EnumLite {
            JOINING(0),
            JOINED(1),
            ACTIVE(2),
            DISCONNECTED(3),
            UNRECOGNIZED(-1);

            public static final int ACTIVE_VALUE = 2;
            public static final int DISCONNECTED_VALUE = 3;
            public static final int JOINED_VALUE = 1;
            public static final int JOINING_VALUE = 0;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: livekit.LivekitModels.ParticipantInfo.State.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i) {
                    return State.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static State valueOf(int i) {
                return forNumber(i);
            }

            public static State forNumber(int i) {
                if (i == 0) {
                    return JOINING;
                }
                if (i == 1) {
                    return JOINED;
                }
                if (i == 2) {
                    return ACTIVE;
                }
                if (i != 3) {
                    return null;
                }
                return DISCONNECTED;
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return StateVerifier.INSTANCE;
            }

            private static final class StateVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new StateVerifier();

                private StateVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return State.forNumber(i) != null;
                }
            }

            State(int i) {
                this.value = i;
            }
        }

        public enum Kind implements Internal.EnumLite {
            STANDARD(0),
            INGRESS(1),
            EGRESS(2),
            SIP(3),
            AGENT(4),
            UNRECOGNIZED(-1);

            public static final int AGENT_VALUE = 4;
            public static final int EGRESS_VALUE = 2;
            public static final int INGRESS_VALUE = 1;
            public static final int SIP_VALUE = 3;
            public static final int STANDARD_VALUE = 0;
            private static final Internal.EnumLiteMap<Kind> internalValueMap = new Internal.EnumLiteMap<Kind>() { // from class: livekit.LivekitModels.ParticipantInfo.Kind.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Kind findValueByNumber(int i) {
                    return Kind.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Kind valueOf(int i) {
                return forNumber(i);
            }

            public static Kind forNumber(int i) {
                if (i == 0) {
                    return STANDARD;
                }
                if (i == 1) {
                    return INGRESS;
                }
                if (i == 2) {
                    return EGRESS;
                }
                if (i == 3) {
                    return SIP;
                }
                if (i != 4) {
                    return null;
                }
                return AGENT;
            }

            public static Internal.EnumLiteMap<Kind> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return KindVerifier.INSTANCE;
            }

            private static final class KindVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new KindVerifier();

                private KindVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Kind.forNumber(i) != null;
                }
            }

            Kind(int i) {
                this.value = i;
            }
        }

        public enum KindDetail implements Internal.EnumLite {
            CLOUD_AGENT(0),
            FORWARDED(1),
            UNRECOGNIZED(-1);

            public static final int CLOUD_AGENT_VALUE = 0;
            public static final int FORWARDED_VALUE = 1;
            private static final Internal.EnumLiteMap<KindDetail> internalValueMap = new Internal.EnumLiteMap<KindDetail>() { // from class: livekit.LivekitModels.ParticipantInfo.KindDetail.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public KindDetail findValueByNumber(int i) {
                    return KindDetail.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static KindDetail valueOf(int i) {
                return forNumber(i);
            }

            public static KindDetail forNumber(int i) {
                if (i == 0) {
                    return CLOUD_AGENT;
                }
                if (i != 1) {
                    return null;
                }
                return FORWARDED;
            }

            public static Internal.EnumLiteMap<KindDetail> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return KindDetailVerifier.INSTANCE;
            }

            private static final class KindDetailVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new KindDetailVerifier();

                private KindDetailVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return KindDetail.forNumber(i) != null;
                }
            }

            KindDetail(int i) {
                this.value = i;
            }
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public String getSid() {
            return this.sid_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8(this.sid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSid(String str) {
            str.getClass();
            this.sid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSid() {
            this.sid_ = getDefaultInstance().getSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public String getIdentity() {
            return this.identity_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public ByteString getIdentityBytes() {
            return ByteString.copyFromUtf8(this.identity_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentity(String str) {
            str.getClass();
            this.identity_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentity() {
            this.identity_ = getDefaultInstance().getIdentity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentityBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.identity_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getStateValue() {
            return this.state_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public State getState() {
            State forNumber = State.forNumber(this.state_);
            return forNumber == null ? State.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateValue(int i) {
            this.state_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(State state) {
            this.state_ = state.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public List<TrackInfo> getTracksList() {
            return this.tracks_;
        }

        public List<? extends TrackInfoOrBuilder> getTracksOrBuilderList() {
            return this.tracks_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getTracksCount() {
            return this.tracks_.size();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public TrackInfo getTracks(int i) {
            return this.tracks_.get(i);
        }

        public TrackInfoOrBuilder getTracksOrBuilder(int i) {
            return this.tracks_.get(i);
        }

        private void ensureTracksIsMutable() {
            Internal.ProtobufList<TrackInfo> protobufList = this.tracks_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tracks_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTracks(int i, TrackInfo trackInfo) {
            trackInfo.getClass();
            ensureTracksIsMutable();
            this.tracks_.set(i, trackInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTracks(TrackInfo trackInfo) {
            trackInfo.getClass();
            ensureTracksIsMutable();
            this.tracks_.add(trackInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTracks(int i, TrackInfo trackInfo) {
            trackInfo.getClass();
            ensureTracksIsMutable();
            this.tracks_.add(i, trackInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTracks(Iterable<? extends TrackInfo> iterable) {
            ensureTracksIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tracks_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTracks() {
            this.tracks_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTracks(int i) {
            ensureTracksIsMutable();
            this.tracks_.remove(i);
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public String getMetadata() {
            return this.metadata_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public ByteString getMetadataBytes() {
            return ByteString.copyFromUtf8(this.metadata_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadata(String str) {
            str.getClass();
            this.metadata_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadata_ = getDefaultInstance().getMetadata();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.metadata_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public long getJoinedAt() {
            return this.joinedAt_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJoinedAt(long j) {
            this.joinedAt_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJoinedAt() {
            this.joinedAt_ = 0L;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public long getJoinedAtMs() {
            return this.joinedAtMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJoinedAtMs(long j) {
            this.joinedAtMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJoinedAtMs() {
            this.joinedAtMs_ = 0L;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getVersion() {
            return this.version_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public boolean hasPermission() {
            return this.permission_ != null;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public ParticipantPermission getPermission() {
            ParticipantPermission participantPermission = this.permission_;
            return participantPermission == null ? ParticipantPermission.getDefaultInstance() : participantPermission;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPermission(ParticipantPermission participantPermission) {
            participantPermission.getClass();
            this.permission_ = participantPermission;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePermission(ParticipantPermission participantPermission) {
            participantPermission.getClass();
            ParticipantPermission participantPermission2 = this.permission_;
            if (participantPermission2 != null && participantPermission2 != ParticipantPermission.getDefaultInstance()) {
                this.permission_ = ParticipantPermission.newBuilder(this.permission_).mergeFrom((ParticipantPermission.Builder) participantPermission).buildPartial();
            } else {
                this.permission_ = participantPermission;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPermission() {
            this.permission_ = null;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public String getRegion() {
            return this.region_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public ByteString getRegionBytes() {
            return ByteString.copyFromUtf8(this.region_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegion(String str) {
            str.getClass();
            this.region_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegion() {
            this.region_ = getDefaultInstance().getRegion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.region_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public boolean getIsPublisher() {
            return this.isPublisher_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsPublisher(boolean z) {
            this.isPublisher_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsPublisher() {
            this.isPublisher_ = false;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getKindValue() {
            return this.kind_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public Kind getKind() {
            Kind forNumber = Kind.forNumber(this.kind_);
            return forNumber == null ? Kind.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKindValue(int i) {
            this.kind_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKind(Kind kind) {
            this.kind_ = kind.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKind() {
            this.kind_ = 0;
        }

        private static final class AttributesDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private AttributesDefaultEntryHolder() {
            }
        }

        private MapFieldLite<String, String> internalGetAttributes() {
            return this.attributes_;
        }

        private MapFieldLite<String, String> internalGetMutableAttributes() {
            if (!this.attributes_.isMutable()) {
                this.attributes_ = this.attributes_.mutableCopy();
            }
            return this.attributes_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getAttributesCount() {
            return internalGetAttributes().size();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public boolean containsAttributes(String str) {
            str.getClass();
            return internalGetAttributes().containsKey(str);
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        @Deprecated
        public Map<String, String> getAttributes() {
            return getAttributesMap();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public Map<String, String> getAttributesMap() {
            return Collections.unmodifiableMap(internalGetAttributes());
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public String getAttributesOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetAttributes = internalGetAttributes();
            return internalGetAttributes.containsKey(str) ? internalGetAttributes.get(str) : str2;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public String getAttributesOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetAttributes = internalGetAttributes();
            if (!internalGetAttributes.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return internalGetAttributes.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableAttributesMap() {
            return internalGetMutableAttributes();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getDisconnectReasonValue() {
            return this.disconnectReason_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public DisconnectReason getDisconnectReason() {
            DisconnectReason forNumber = DisconnectReason.forNumber(this.disconnectReason_);
            return forNumber == null ? DisconnectReason.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisconnectReasonValue(int i) {
            this.disconnectReason_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisconnectReason(DisconnectReason disconnectReason) {
            this.disconnectReason_ = disconnectReason.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisconnectReason() {
            this.disconnectReason_ = 0;
        }

        static {
            ParticipantInfo participantInfo = new ParticipantInfo();
            DEFAULT_INSTANCE = participantInfo;
            GeneratedMessageLite.registerDefaultInstance(ParticipantInfo.class, participantInfo);
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public List<KindDetail> getKindDetailsList() {
            return new Internal.ListAdapter(this.kindDetails_, kindDetails_converter_);
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getKindDetailsCount() {
            return this.kindDetails_.size();
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public KindDetail getKindDetails(int i) {
            KindDetail forNumber = KindDetail.forNumber(this.kindDetails_.getInt(i));
            return forNumber == null ? KindDetail.UNRECOGNIZED : forNumber;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public List<Integer> getKindDetailsValueList() {
            return this.kindDetails_;
        }

        @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
        public int getKindDetailsValue(int i) {
            return this.kindDetails_.getInt(i);
        }

        private void ensureKindDetailsIsMutable() {
            Internal.IntList intList = this.kindDetails_;
            if (intList.isModifiable()) {
                return;
            }
            this.kindDetails_ = GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKindDetails(int i, KindDetail kindDetail) {
            kindDetail.getClass();
            ensureKindDetailsIsMutable();
            this.kindDetails_.setInt(i, kindDetail.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addKindDetails(KindDetail kindDetail) {
            kindDetail.getClass();
            ensureKindDetailsIsMutable();
            this.kindDetails_.addInt(kindDetail.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllKindDetails(Iterable<? extends KindDetail> iterable) {
            ensureKindDetailsIsMutable();
            Iterator<? extends KindDetail> it = iterable.iterator();
            while (it.hasNext()) {
                this.kindDetails_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKindDetails() {
            this.kindDetails_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKindDetailsValue(int i, int i2) {
            ensureKindDetailsIsMutable();
            this.kindDetails_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addKindDetailsValue(int i) {
            ensureKindDetailsIsMutable();
            this.kindDetails_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllKindDetailsValue(Iterable<Integer> iterable) {
            ensureKindDetailsIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.kindDetails_.addInt(it.next().intValue());
            }
        }

        public static ParticipantInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ParticipantInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ParticipantInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ParticipantInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ParticipantInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ParticipantInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ParticipantInfo parseFrom(InputStream inputStream) throws IOException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParticipantInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParticipantInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ParticipantInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParticipantInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParticipantInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ParticipantInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ParticipantInfo participantInfo) {
            return DEFAULT_INSTANCE.createBuilder(participantInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ParticipantInfo, Builder> implements ParticipantInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ParticipantInfo.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public String getSid() {
                return ((ParticipantInfo) this.instance).getSid();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public ByteString getSidBytes() {
                return ((ParticipantInfo) this.instance).getSidBytes();
            }

            public Builder setSid(String str) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setSid(str);
                return this;
            }

            public Builder clearSid() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearSid();
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setSidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public String getIdentity() {
                return ((ParticipantInfo) this.instance).getIdentity();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public ByteString getIdentityBytes() {
                return ((ParticipantInfo) this.instance).getIdentityBytes();
            }

            public Builder setIdentity(String str) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setIdentity(str);
                return this;
            }

            public Builder clearIdentity() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearIdentity();
                return this;
            }

            public Builder setIdentityBytes(ByteString byteString) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setIdentityBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getStateValue() {
                return ((ParticipantInfo) this.instance).getStateValue();
            }

            public Builder setStateValue(int i) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setStateValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public State getState() {
                return ((ParticipantInfo) this.instance).getState();
            }

            public Builder setState(State state) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setState(state);
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearState();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public List<TrackInfo> getTracksList() {
                return Collections.unmodifiableList(((ParticipantInfo) this.instance).getTracksList());
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getTracksCount() {
                return ((ParticipantInfo) this.instance).getTracksCount();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public TrackInfo getTracks(int i) {
                return ((ParticipantInfo) this.instance).getTracks(i);
            }

            public Builder setTracks(int i, TrackInfo trackInfo) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setTracks(i, trackInfo);
                return this;
            }

            public Builder setTracks(int i, TrackInfo.Builder builder) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setTracks(i, builder.build());
                return this;
            }

            public Builder addTracks(TrackInfo trackInfo) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addTracks(trackInfo);
                return this;
            }

            public Builder addTracks(int i, TrackInfo trackInfo) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addTracks(i, trackInfo);
                return this;
            }

            public Builder addTracks(TrackInfo.Builder builder) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addTracks(builder.build());
                return this;
            }

            public Builder addTracks(int i, TrackInfo.Builder builder) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addTracks(i, builder.build());
                return this;
            }

            public Builder addAllTracks(Iterable<? extends TrackInfo> iterable) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addAllTracks(iterable);
                return this;
            }

            public Builder clearTracks() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearTracks();
                return this;
            }

            public Builder removeTracks(int i) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).removeTracks(i);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public String getMetadata() {
                return ((ParticipantInfo) this.instance).getMetadata();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public ByteString getMetadataBytes() {
                return ((ParticipantInfo) this.instance).getMetadataBytes();
            }

            public Builder setMetadata(String str) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setMetadata(str);
                return this;
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearMetadata();
                return this;
            }

            public Builder setMetadataBytes(ByteString byteString) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setMetadataBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public long getJoinedAt() {
                return ((ParticipantInfo) this.instance).getJoinedAt();
            }

            public Builder setJoinedAt(long j) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setJoinedAt(j);
                return this;
            }

            public Builder clearJoinedAt() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearJoinedAt();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public long getJoinedAtMs() {
                return ((ParticipantInfo) this.instance).getJoinedAtMs();
            }

            public Builder setJoinedAtMs(long j) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setJoinedAtMs(j);
                return this;
            }

            public Builder clearJoinedAtMs() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearJoinedAtMs();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public String getName() {
                return ((ParticipantInfo) this.instance).getName();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public ByteString getNameBytes() {
                return ((ParticipantInfo) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getVersion() {
                return ((ParticipantInfo) this.instance).getVersion();
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setVersion(i);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearVersion();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public boolean hasPermission() {
                return ((ParticipantInfo) this.instance).hasPermission();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public ParticipantPermission getPermission() {
                return ((ParticipantInfo) this.instance).getPermission();
            }

            public Builder setPermission(ParticipantPermission participantPermission) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setPermission(participantPermission);
                return this;
            }

            public Builder setPermission(ParticipantPermission.Builder builder) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setPermission(builder.build());
                return this;
            }

            public Builder mergePermission(ParticipantPermission participantPermission) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).mergePermission(participantPermission);
                return this;
            }

            public Builder clearPermission() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearPermission();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public String getRegion() {
                return ((ParticipantInfo) this.instance).getRegion();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public ByteString getRegionBytes() {
                return ((ParticipantInfo) this.instance).getRegionBytes();
            }

            public Builder setRegion(String str) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setRegion(str);
                return this;
            }

            public Builder clearRegion() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearRegion();
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setRegionBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public boolean getIsPublisher() {
                return ((ParticipantInfo) this.instance).getIsPublisher();
            }

            public Builder setIsPublisher(boolean z) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setIsPublisher(z);
                return this;
            }

            public Builder clearIsPublisher() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearIsPublisher();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getKindValue() {
                return ((ParticipantInfo) this.instance).getKindValue();
            }

            public Builder setKindValue(int i) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setKindValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public Kind getKind() {
                return ((ParticipantInfo) this.instance).getKind();
            }

            public Builder setKind(Kind kind) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setKind(kind);
                return this;
            }

            public Builder clearKind() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearKind();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getAttributesCount() {
                return ((ParticipantInfo) this.instance).getAttributesMap().size();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public boolean containsAttributes(String str) {
                str.getClass();
                return ((ParticipantInfo) this.instance).getAttributesMap().containsKey(str);
            }

            public Builder clearAttributes() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).getMutableAttributesMap().clear();
                return this;
            }

            public Builder removeAttributes(String str) {
                str.getClass();
                copyOnWrite();
                ((ParticipantInfo) this.instance).getMutableAttributesMap().remove(str);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            @Deprecated
            public Map<String, String> getAttributes() {
                return getAttributesMap();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public Map<String, String> getAttributesMap() {
                return Collections.unmodifiableMap(((ParticipantInfo) this.instance).getAttributesMap());
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public String getAttributesOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> attributesMap = ((ParticipantInfo) this.instance).getAttributesMap();
                return attributesMap.containsKey(str) ? attributesMap.get(str) : str2;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public String getAttributesOrThrow(String str) {
                str.getClass();
                Map<String, String> attributesMap = ((ParticipantInfo) this.instance).getAttributesMap();
                if (!attributesMap.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return attributesMap.get(str);
            }

            public Builder putAttributes(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((ParticipantInfo) this.instance).getMutableAttributesMap().put(str, str2);
                return this;
            }

            public Builder putAllAttributes(Map<String, String> map) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).getMutableAttributesMap().putAll(map);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getDisconnectReasonValue() {
                return ((ParticipantInfo) this.instance).getDisconnectReasonValue();
            }

            public Builder setDisconnectReasonValue(int i) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setDisconnectReasonValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public DisconnectReason getDisconnectReason() {
                return ((ParticipantInfo) this.instance).getDisconnectReason();
            }

            public Builder setDisconnectReason(DisconnectReason disconnectReason) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setDisconnectReason(disconnectReason);
                return this;
            }

            public Builder clearDisconnectReason() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearDisconnectReason();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public List<KindDetail> getKindDetailsList() {
                return ((ParticipantInfo) this.instance).getKindDetailsList();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getKindDetailsCount() {
                return ((ParticipantInfo) this.instance).getKindDetailsCount();
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public KindDetail getKindDetails(int i) {
                return ((ParticipantInfo) this.instance).getKindDetails(i);
            }

            public Builder setKindDetails(int i, KindDetail kindDetail) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setKindDetails(i, kindDetail);
                return this;
            }

            public Builder addKindDetails(KindDetail kindDetail) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addKindDetails(kindDetail);
                return this;
            }

            public Builder addAllKindDetails(Iterable<? extends KindDetail> iterable) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addAllKindDetails(iterable);
                return this;
            }

            public Builder clearKindDetails() {
                copyOnWrite();
                ((ParticipantInfo) this.instance).clearKindDetails();
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public List<Integer> getKindDetailsValueList() {
                return Collections.unmodifiableList(((ParticipantInfo) this.instance).getKindDetailsValueList());
            }

            @Override // livekit.LivekitModels.ParticipantInfoOrBuilder
            public int getKindDetailsValue(int i) {
                return ((ParticipantInfo) this.instance).getKindDetailsValue(i);
            }

            public Builder setKindDetailsValue(int i, int i2) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).setKindDetailsValue(i, i2);
                return this;
            }

            public Builder addKindDetailsValue(int i) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addKindDetailsValue(i);
                return this;
            }

            public Builder addAllKindDetailsValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((ParticipantInfo) this.instance).addAllKindDetailsValue(iterable);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ParticipantInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0012\u0010\u0001\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u001b\u0005Ȉ\u0006\u0002\tȈ\n\u000b\u000b\t\fȈ\r\u0007\u000e\f\u000f2\u0010\f\u0011\u0002\u0012,", new Object[]{"sid_", "identity_", "state_", "tracks_", TrackInfo.class, "metadata_", "joinedAt_", "name_", "version_", "permission_", "region_", "isPublisher_", "kind_", "attributes_", AttributesDefaultEntryHolder.defaultEntry, "disconnectReason_", "joinedAtMs_", "kindDetails_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ParticipantInfo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ParticipantInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static ParticipantInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ParticipantInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Encryption extends GeneratedMessageLite<Encryption, Builder> implements EncryptionOrBuilder {
        private static final Encryption DEFAULT_INSTANCE;
        private static volatile Parser<Encryption> PARSER;

        private Encryption() {
        }

        public enum Type implements Internal.EnumLite {
            NONE(0),
            GCM(1),
            CUSTOM(2),
            UNRECOGNIZED(-1);

            public static final int CUSTOM_VALUE = 2;
            public static final int GCM_VALUE = 1;
            public static final int NONE_VALUE = 0;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: livekit.LivekitModels.Encryption.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return NONE;
                }
                if (i == 1) {
                    return GCM;
                }
                if (i != 2) {
                    return null;
                }
                return CUSTOM;
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return TypeVerifier.INSTANCE;
            }

            private static final class TypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new TypeVerifier();

                private TypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Type.forNumber(i) != null;
                }
            }

            Type(int i) {
                this.value = i;
            }
        }

        public static Encryption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Encryption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Encryption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Encryption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Encryption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Encryption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Encryption parseFrom(InputStream inputStream) throws IOException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Encryption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Encryption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Encryption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Encryption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Encryption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Encryption parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Encryption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Encryption encryption) {
            return DEFAULT_INSTANCE.createBuilder(encryption);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Encryption, Builder> implements EncryptionOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Encryption.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Encryption();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Encryption> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Encryption.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Encryption encryption = new Encryption();
            DEFAULT_INSTANCE = encryption;
            GeneratedMessageLite.registerDefaultInstance(Encryption.class, encryption);
        }

        public static Encryption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Encryption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SimulcastCodecInfo extends GeneratedMessageLite<SimulcastCodecInfo, Builder> implements SimulcastCodecInfoOrBuilder {
        public static final int CID_FIELD_NUMBER = 3;
        private static final SimulcastCodecInfo DEFAULT_INSTANCE;
        public static final int LAYERS_FIELD_NUMBER = 4;
        public static final int MID_FIELD_NUMBER = 2;
        public static final int MIME_TYPE_FIELD_NUMBER = 1;
        private static volatile Parser<SimulcastCodecInfo> PARSER = null;
        public static final int SDP_CID_FIELD_NUMBER = 6;
        public static final int VIDEO_LAYER_MODE_FIELD_NUMBER = 5;
        private int videoLayerMode_;
        private String mimeType_ = "";
        private String mid_ = "";
        private String cid_ = "";
        private Internal.ProtobufList<VideoLayer> layers_ = emptyProtobufList();
        private String sdpCid_ = "";

        private SimulcastCodecInfo() {
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public String getMimeType() {
            return this.mimeType_;
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public ByteString getMimeTypeBytes() {
            return ByteString.copyFromUtf8(this.mimeType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMimeType(String str) {
            str.getClass();
            this.mimeType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMimeType() {
            this.mimeType_ = getDefaultInstance().getMimeType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMimeTypeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mimeType_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public String getMid() {
            return this.mid_;
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public ByteString getMidBytes() {
            return ByteString.copyFromUtf8(this.mid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMid(String str) {
            str.getClass();
            this.mid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMid() {
            this.mid_ = getDefaultInstance().getMid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public String getCid() {
            return this.cid_;
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public ByteString getCidBytes() {
            return ByteString.copyFromUtf8(this.cid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCid(String str) {
            str.getClass();
            this.cid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCid() {
            this.cid_ = getDefaultInstance().getCid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.cid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public List<VideoLayer> getLayersList() {
            return this.layers_;
        }

        public List<? extends VideoLayerOrBuilder> getLayersOrBuilderList() {
            return this.layers_;
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public int getLayersCount() {
            return this.layers_.size();
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public VideoLayer getLayers(int i) {
            return this.layers_.get(i);
        }

        public VideoLayerOrBuilder getLayersOrBuilder(int i) {
            return this.layers_.get(i);
        }

        private void ensureLayersIsMutable() {
            Internal.ProtobufList<VideoLayer> protobufList = this.layers_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.layers_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLayers(int i, VideoLayer videoLayer) {
            videoLayer.getClass();
            ensureLayersIsMutable();
            this.layers_.set(i, videoLayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLayers(VideoLayer videoLayer) {
            videoLayer.getClass();
            ensureLayersIsMutable();
            this.layers_.add(videoLayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLayers(int i, VideoLayer videoLayer) {
            videoLayer.getClass();
            ensureLayersIsMutable();
            this.layers_.add(i, videoLayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLayers(Iterable<? extends VideoLayer> iterable) {
            ensureLayersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.layers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLayers() {
            this.layers_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLayers(int i) {
            ensureLayersIsMutable();
            this.layers_.remove(i);
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public int getVideoLayerModeValue() {
            return this.videoLayerMode_;
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public VideoLayer.Mode getVideoLayerMode() {
            VideoLayer.Mode forNumber = VideoLayer.Mode.forNumber(this.videoLayerMode_);
            return forNumber == null ? VideoLayer.Mode.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoLayerModeValue(int i) {
            this.videoLayerMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoLayerMode(VideoLayer.Mode mode) {
            this.videoLayerMode_ = mode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoLayerMode() {
            this.videoLayerMode_ = 0;
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public String getSdpCid() {
            return this.sdpCid_;
        }

        @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
        public ByteString getSdpCidBytes() {
            return ByteString.copyFromUtf8(this.sdpCid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdpCid(String str) {
            str.getClass();
            this.sdpCid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdpCid() {
            this.sdpCid_ = getDefaultInstance().getSdpCid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdpCidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sdpCid_ = byteString.toStringUtf8();
        }

        public static SimulcastCodecInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SimulcastCodecInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SimulcastCodecInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SimulcastCodecInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SimulcastCodecInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SimulcastCodecInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SimulcastCodecInfo parseFrom(InputStream inputStream) throws IOException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SimulcastCodecInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SimulcastCodecInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SimulcastCodecInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SimulcastCodecInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimulcastCodecInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SimulcastCodecInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SimulcastCodecInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimulcastCodecInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SimulcastCodecInfo simulcastCodecInfo) {
            return DEFAULT_INSTANCE.createBuilder(simulcastCodecInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SimulcastCodecInfo, Builder> implements SimulcastCodecInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SimulcastCodecInfo.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public String getMimeType() {
                return ((SimulcastCodecInfo) this.instance).getMimeType();
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public ByteString getMimeTypeBytes() {
                return ((SimulcastCodecInfo) this.instance).getMimeTypeBytes();
            }

            public Builder setMimeType(String str) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setMimeType(str);
                return this;
            }

            public Builder clearMimeType() {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).clearMimeType();
                return this;
            }

            public Builder setMimeTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setMimeTypeBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public String getMid() {
                return ((SimulcastCodecInfo) this.instance).getMid();
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public ByteString getMidBytes() {
                return ((SimulcastCodecInfo) this.instance).getMidBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setMid(str);
                return this;
            }

            public Builder clearMid() {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).clearMid();
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setMidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public String getCid() {
                return ((SimulcastCodecInfo) this.instance).getCid();
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public ByteString getCidBytes() {
                return ((SimulcastCodecInfo) this.instance).getCidBytes();
            }

            public Builder setCid(String str) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setCid(str);
                return this;
            }

            public Builder clearCid() {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).clearCid();
                return this;
            }

            public Builder setCidBytes(ByteString byteString) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setCidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public List<VideoLayer> getLayersList() {
                return Collections.unmodifiableList(((SimulcastCodecInfo) this.instance).getLayersList());
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public int getLayersCount() {
                return ((SimulcastCodecInfo) this.instance).getLayersCount();
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public VideoLayer getLayers(int i) {
                return ((SimulcastCodecInfo) this.instance).getLayers(i);
            }

            public Builder setLayers(int i, VideoLayer videoLayer) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setLayers(i, videoLayer);
                return this;
            }

            public Builder setLayers(int i, VideoLayer.Builder builder) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setLayers(i, builder.build());
                return this;
            }

            public Builder addLayers(VideoLayer videoLayer) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).addLayers(videoLayer);
                return this;
            }

            public Builder addLayers(int i, VideoLayer videoLayer) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).addLayers(i, videoLayer);
                return this;
            }

            public Builder addLayers(VideoLayer.Builder builder) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).addLayers(builder.build());
                return this;
            }

            public Builder addLayers(int i, VideoLayer.Builder builder) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).addLayers(i, builder.build());
                return this;
            }

            public Builder addAllLayers(Iterable<? extends VideoLayer> iterable) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).addAllLayers(iterable);
                return this;
            }

            public Builder clearLayers() {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).clearLayers();
                return this;
            }

            public Builder removeLayers(int i) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).removeLayers(i);
                return this;
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public int getVideoLayerModeValue() {
                return ((SimulcastCodecInfo) this.instance).getVideoLayerModeValue();
            }

            public Builder setVideoLayerModeValue(int i) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setVideoLayerModeValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public VideoLayer.Mode getVideoLayerMode() {
                return ((SimulcastCodecInfo) this.instance).getVideoLayerMode();
            }

            public Builder setVideoLayerMode(VideoLayer.Mode mode) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setVideoLayerMode(mode);
                return this;
            }

            public Builder clearVideoLayerMode() {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).clearVideoLayerMode();
                return this;
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public String getSdpCid() {
                return ((SimulcastCodecInfo) this.instance).getSdpCid();
            }

            @Override // livekit.LivekitModels.SimulcastCodecInfoOrBuilder
            public ByteString getSdpCidBytes() {
                return ((SimulcastCodecInfo) this.instance).getSdpCidBytes();
            }

            public Builder setSdpCid(String str) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setSdpCid(str);
                return this;
            }

            public Builder clearSdpCid() {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).clearSdpCid();
                return this;
            }

            public Builder setSdpCidBytes(ByteString byteString) {
                copyOnWrite();
                ((SimulcastCodecInfo) this.instance).setSdpCidBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SimulcastCodecInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005\f\u0006Ȉ", new Object[]{"mimeType_", "mid_", "cid_", "layers_", VideoLayer.class, "videoLayerMode_", "sdpCid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SimulcastCodecInfo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (SimulcastCodecInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            SimulcastCodecInfo simulcastCodecInfo = new SimulcastCodecInfo();
            DEFAULT_INSTANCE = simulcastCodecInfo;
            GeneratedMessageLite.registerDefaultInstance(SimulcastCodecInfo.class, simulcastCodecInfo);
        }

        public static SimulcastCodecInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SimulcastCodecInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class TrackInfo extends GeneratedMessageLite<TrackInfo, Builder> implements TrackInfoOrBuilder {
        public static final int AUDIO_FEATURES_FIELD_NUMBER = 19;
        public static final int BACKUP_CODEC_POLICY_FIELD_NUMBER = 20;
        public static final int CODECS_FIELD_NUMBER = 13;
        private static final TrackInfo DEFAULT_INSTANCE;
        public static final int DISABLE_DTX_FIELD_NUMBER = 8;
        public static final int DISABLE_RED_FIELD_NUMBER = 15;
        public static final int ENCRYPTION_FIELD_NUMBER = 16;
        public static final int HEIGHT_FIELD_NUMBER = 6;
        public static final int LAYERS_FIELD_NUMBER = 10;
        public static final int MID_FIELD_NUMBER = 12;
        public static final int MIME_TYPE_FIELD_NUMBER = 11;
        public static final int MUTED_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile Parser<TrackInfo> PARSER = null;
        public static final int SID_FIELD_NUMBER = 1;
        public static final int SIMULCAST_FIELD_NUMBER = 7;
        public static final int SOURCE_FIELD_NUMBER = 9;
        public static final int STEREO_FIELD_NUMBER = 14;
        public static final int STREAM_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 18;
        public static final int WIDTH_FIELD_NUMBER = 5;
        private static final Internal.ListAdapter.Converter<Integer, AudioTrackFeature> audioFeatures_converter_ = new Internal.ListAdapter.Converter<Integer, AudioTrackFeature>() { // from class: livekit.LivekitModels.TrackInfo.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AudioTrackFeature convert(Integer num) {
                AudioTrackFeature forNumber = AudioTrackFeature.forNumber(num.intValue());
                return forNumber == null ? AudioTrackFeature.UNRECOGNIZED : forNumber;
            }
        };
        private int audioFeaturesMemoizedSerializedSize;
        private int backupCodecPolicy_;
        private boolean disableDtx_;
        private boolean disableRed_;
        private int encryption_;
        private int height_;
        private boolean muted_;
        private boolean simulcast_;
        private int source_;
        private boolean stereo_;
        private int type_;
        private TimedVersion version_;
        private int width_;
        private String sid_ = "";
        private String name_ = "";
        private Internal.ProtobufList<VideoLayer> layers_ = emptyProtobufList();
        private String mimeType_ = "";
        private String mid_ = "";
        private Internal.ProtobufList<SimulcastCodecInfo> codecs_ = emptyProtobufList();
        private String stream_ = "";
        private Internal.IntList audioFeatures_ = emptyIntList();

        private TrackInfo() {
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public String getSid() {
            return this.sid_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8(this.sid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSid(String str) {
            str.getClass();
            this.sid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSid() {
            this.sid_ = getDefaultInstance().getSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public TrackType getType() {
            TrackType forNumber = TrackType.forNumber(this.type_);
            return forNumber == null ? TrackType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(TrackType trackType) {
            this.type_ = trackType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public boolean getMuted() {
            return this.muted_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuted(boolean z) {
            this.muted_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMuted() {
            this.muted_ = false;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public int getWidth() {
            return this.width_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i) {
            this.width_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public int getHeight() {
            return this.height_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i) {
            this.height_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public boolean getSimulcast() {
            return this.simulcast_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSimulcast(boolean z) {
            this.simulcast_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSimulcast() {
            this.simulcast_ = false;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public boolean getDisableDtx() {
            return this.disableDtx_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisableDtx(boolean z) {
            this.disableDtx_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisableDtx() {
            this.disableDtx_ = false;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public int getSourceValue() {
            return this.source_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public TrackSource getSource() {
            TrackSource forNumber = TrackSource.forNumber(this.source_);
            return forNumber == null ? TrackSource.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceValue(int i) {
            this.source_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(TrackSource trackSource) {
            this.source_ = trackSource.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public List<VideoLayer> getLayersList() {
            return this.layers_;
        }

        @Deprecated
        public List<? extends VideoLayerOrBuilder> getLayersOrBuilderList() {
            return this.layers_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public int getLayersCount() {
            return this.layers_.size();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public VideoLayer getLayers(int i) {
            return this.layers_.get(i);
        }

        @Deprecated
        public VideoLayerOrBuilder getLayersOrBuilder(int i) {
            return this.layers_.get(i);
        }

        private void ensureLayersIsMutable() {
            Internal.ProtobufList<VideoLayer> protobufList = this.layers_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.layers_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLayers(int i, VideoLayer videoLayer) {
            videoLayer.getClass();
            ensureLayersIsMutable();
            this.layers_.set(i, videoLayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLayers(VideoLayer videoLayer) {
            videoLayer.getClass();
            ensureLayersIsMutable();
            this.layers_.add(videoLayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLayers(int i, VideoLayer videoLayer) {
            videoLayer.getClass();
            ensureLayersIsMutable();
            this.layers_.add(i, videoLayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLayers(Iterable<? extends VideoLayer> iterable) {
            ensureLayersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.layers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLayers() {
            this.layers_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLayers(int i) {
            ensureLayersIsMutable();
            this.layers_.remove(i);
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public String getMimeType() {
            return this.mimeType_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public ByteString getMimeTypeBytes() {
            return ByteString.copyFromUtf8(this.mimeType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMimeType(String str) {
            str.getClass();
            this.mimeType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMimeType() {
            this.mimeType_ = getDefaultInstance().getMimeType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMimeTypeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mimeType_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public String getMid() {
            return this.mid_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public ByteString getMidBytes() {
            return ByteString.copyFromUtf8(this.mid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMid(String str) {
            str.getClass();
            this.mid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMid() {
            this.mid_ = getDefaultInstance().getMid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public List<SimulcastCodecInfo> getCodecsList() {
            return this.codecs_;
        }

        public List<? extends SimulcastCodecInfoOrBuilder> getCodecsOrBuilderList() {
            return this.codecs_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public int getCodecsCount() {
            return this.codecs_.size();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public SimulcastCodecInfo getCodecs(int i) {
            return this.codecs_.get(i);
        }

        public SimulcastCodecInfoOrBuilder getCodecsOrBuilder(int i) {
            return this.codecs_.get(i);
        }

        private void ensureCodecsIsMutable() {
            Internal.ProtobufList<SimulcastCodecInfo> protobufList = this.codecs_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.codecs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodecs(int i, SimulcastCodecInfo simulcastCodecInfo) {
            simulcastCodecInfo.getClass();
            ensureCodecsIsMutable();
            this.codecs_.set(i, simulcastCodecInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCodecs(SimulcastCodecInfo simulcastCodecInfo) {
            simulcastCodecInfo.getClass();
            ensureCodecsIsMutable();
            this.codecs_.add(simulcastCodecInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCodecs(int i, SimulcastCodecInfo simulcastCodecInfo) {
            simulcastCodecInfo.getClass();
            ensureCodecsIsMutable();
            this.codecs_.add(i, simulcastCodecInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCodecs(Iterable<? extends SimulcastCodecInfo> iterable) {
            ensureCodecsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.codecs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodecs() {
            this.codecs_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCodecs(int i) {
            ensureCodecsIsMutable();
            this.codecs_.remove(i);
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        @Deprecated
        public boolean getStereo() {
            return this.stereo_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStereo(boolean z) {
            this.stereo_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStereo() {
            this.stereo_ = false;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public boolean getDisableRed() {
            return this.disableRed_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisableRed(boolean z) {
            this.disableRed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisableRed() {
            this.disableRed_ = false;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public int getEncryptionValue() {
            return this.encryption_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public Encryption.Type getEncryption() {
            Encryption.Type forNumber = Encryption.Type.forNumber(this.encryption_);
            return forNumber == null ? Encryption.Type.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptionValue(int i) {
            this.encryption_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryption(Encryption.Type type) {
            this.encryption_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryption() {
            this.encryption_ = 0;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public String getStream() {
            return this.stream_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public ByteString getStreamBytes() {
            return ByteString.copyFromUtf8(this.stream_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStream(String str) {
            str.getClass();
            this.stream_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStream() {
            this.stream_ = getDefaultInstance().getStream();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStreamBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.stream_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public boolean hasVersion() {
            return this.version_ != null;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public TimedVersion getVersion() {
            TimedVersion timedVersion = this.version_;
            return timedVersion == null ? TimedVersion.getDefaultInstance() : timedVersion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(TimedVersion timedVersion) {
            timedVersion.getClass();
            this.version_ = timedVersion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVersion(TimedVersion timedVersion) {
            timedVersion.getClass();
            TimedVersion timedVersion2 = this.version_;
            if (timedVersion2 != null && timedVersion2 != TimedVersion.getDefaultInstance()) {
                this.version_ = TimedVersion.newBuilder(this.version_).mergeFrom((TimedVersion.Builder) timedVersion).buildPartial();
            } else {
                this.version_ = timedVersion;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = null;
        }

        static {
            TrackInfo trackInfo = new TrackInfo();
            DEFAULT_INSTANCE = trackInfo;
            GeneratedMessageLite.registerDefaultInstance(TrackInfo.class, trackInfo);
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public List<AudioTrackFeature> getAudioFeaturesList() {
            return new Internal.ListAdapter(this.audioFeatures_, audioFeatures_converter_);
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public int getAudioFeaturesCount() {
            return this.audioFeatures_.size();
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public AudioTrackFeature getAudioFeatures(int i) {
            AudioTrackFeature forNumber = AudioTrackFeature.forNumber(this.audioFeatures_.getInt(i));
            return forNumber == null ? AudioTrackFeature.UNRECOGNIZED : forNumber;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public List<Integer> getAudioFeaturesValueList() {
            return this.audioFeatures_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public int getAudioFeaturesValue(int i) {
            return this.audioFeatures_.getInt(i);
        }

        private void ensureAudioFeaturesIsMutable() {
            Internal.IntList intList = this.audioFeatures_;
            if (intList.isModifiable()) {
                return;
            }
            this.audioFeatures_ = GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioFeatures(int i, AudioTrackFeature audioTrackFeature) {
            audioTrackFeature.getClass();
            ensureAudioFeaturesIsMutable();
            this.audioFeatures_.setInt(i, audioTrackFeature.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudioFeatures(AudioTrackFeature audioTrackFeature) {
            audioTrackFeature.getClass();
            ensureAudioFeaturesIsMutable();
            this.audioFeatures_.addInt(audioTrackFeature.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAudioFeatures(Iterable<? extends AudioTrackFeature> iterable) {
            ensureAudioFeaturesIsMutable();
            Iterator<? extends AudioTrackFeature> it = iterable.iterator();
            while (it.hasNext()) {
                this.audioFeatures_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioFeatures() {
            this.audioFeatures_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioFeaturesValue(int i, int i2) {
            ensureAudioFeaturesIsMutable();
            this.audioFeatures_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudioFeaturesValue(int i) {
            ensureAudioFeaturesIsMutable();
            this.audioFeatures_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAudioFeaturesValue(Iterable<Integer> iterable) {
            ensureAudioFeaturesIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.audioFeatures_.addInt(it.next().intValue());
            }
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public int getBackupCodecPolicyValue() {
            return this.backupCodecPolicy_;
        }

        @Override // livekit.LivekitModels.TrackInfoOrBuilder
        public BackupCodecPolicy getBackupCodecPolicy() {
            BackupCodecPolicy forNumber = BackupCodecPolicy.forNumber(this.backupCodecPolicy_);
            return forNumber == null ? BackupCodecPolicy.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackupCodecPolicyValue(int i) {
            this.backupCodecPolicy_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackupCodecPolicy(BackupCodecPolicy backupCodecPolicy) {
            this.backupCodecPolicy_ = backupCodecPolicy.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackupCodecPolicy() {
            this.backupCodecPolicy_ = 0;
        }

        public static TrackInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TrackInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TrackInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TrackInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TrackInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TrackInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TrackInfo parseFrom(InputStream inputStream) throws IOException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TrackInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TrackInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TrackInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TrackInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TrackInfo trackInfo) {
            return DEFAULT_INSTANCE.createBuilder(trackInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TrackInfo, Builder> implements TrackInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(TrackInfo.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public String getSid() {
                return ((TrackInfo) this.instance).getSid();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public ByteString getSidBytes() {
                return ((TrackInfo) this.instance).getSidBytes();
            }

            public Builder setSid(String str) {
                copyOnWrite();
                ((TrackInfo) this.instance).setSid(str);
                return this;
            }

            public Builder clearSid() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearSid();
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                copyOnWrite();
                ((TrackInfo) this.instance).setSidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public int getTypeValue() {
                return ((TrackInfo) this.instance).getTypeValue();
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).setTypeValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public TrackType getType() {
                return ((TrackInfo) this.instance).getType();
            }

            public Builder setType(TrackType trackType) {
                copyOnWrite();
                ((TrackInfo) this.instance).setType(trackType);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearType();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public String getName() {
                return ((TrackInfo) this.instance).getName();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public ByteString getNameBytes() {
                return ((TrackInfo) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((TrackInfo) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TrackInfo) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public boolean getMuted() {
                return ((TrackInfo) this.instance).getMuted();
            }

            public Builder setMuted(boolean z) {
                copyOnWrite();
                ((TrackInfo) this.instance).setMuted(z);
                return this;
            }

            public Builder clearMuted() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearMuted();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public int getWidth() {
                return ((TrackInfo) this.instance).getWidth();
            }

            @Deprecated
            public Builder setWidth(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).setWidth(i);
                return this;
            }

            @Deprecated
            public Builder clearWidth() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearWidth();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public int getHeight() {
                return ((TrackInfo) this.instance).getHeight();
            }

            @Deprecated
            public Builder setHeight(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).setHeight(i);
                return this;
            }

            @Deprecated
            public Builder clearHeight() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearHeight();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public boolean getSimulcast() {
                return ((TrackInfo) this.instance).getSimulcast();
            }

            @Deprecated
            public Builder setSimulcast(boolean z) {
                copyOnWrite();
                ((TrackInfo) this.instance).setSimulcast(z);
                return this;
            }

            @Deprecated
            public Builder clearSimulcast() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearSimulcast();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public boolean getDisableDtx() {
                return ((TrackInfo) this.instance).getDisableDtx();
            }

            @Deprecated
            public Builder setDisableDtx(boolean z) {
                copyOnWrite();
                ((TrackInfo) this.instance).setDisableDtx(z);
                return this;
            }

            @Deprecated
            public Builder clearDisableDtx() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearDisableDtx();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public int getSourceValue() {
                return ((TrackInfo) this.instance).getSourceValue();
            }

            public Builder setSourceValue(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).setSourceValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public TrackSource getSource() {
                return ((TrackInfo) this.instance).getSource();
            }

            public Builder setSource(TrackSource trackSource) {
                copyOnWrite();
                ((TrackInfo) this.instance).setSource(trackSource);
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearSource();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public List<VideoLayer> getLayersList() {
                return Collections.unmodifiableList(((TrackInfo) this.instance).getLayersList());
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public int getLayersCount() {
                return ((TrackInfo) this.instance).getLayersCount();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public VideoLayer getLayers(int i) {
                return ((TrackInfo) this.instance).getLayers(i);
            }

            @Deprecated
            public Builder setLayers(int i, VideoLayer videoLayer) {
                copyOnWrite();
                ((TrackInfo) this.instance).setLayers(i, videoLayer);
                return this;
            }

            @Deprecated
            public Builder setLayers(int i, VideoLayer.Builder builder) {
                copyOnWrite();
                ((TrackInfo) this.instance).setLayers(i, builder.build());
                return this;
            }

            @Deprecated
            public Builder addLayers(VideoLayer videoLayer) {
                copyOnWrite();
                ((TrackInfo) this.instance).addLayers(videoLayer);
                return this;
            }

            @Deprecated
            public Builder addLayers(int i, VideoLayer videoLayer) {
                copyOnWrite();
                ((TrackInfo) this.instance).addLayers(i, videoLayer);
                return this;
            }

            @Deprecated
            public Builder addLayers(VideoLayer.Builder builder) {
                copyOnWrite();
                ((TrackInfo) this.instance).addLayers(builder.build());
                return this;
            }

            @Deprecated
            public Builder addLayers(int i, VideoLayer.Builder builder) {
                copyOnWrite();
                ((TrackInfo) this.instance).addLayers(i, builder.build());
                return this;
            }

            @Deprecated
            public Builder addAllLayers(Iterable<? extends VideoLayer> iterable) {
                copyOnWrite();
                ((TrackInfo) this.instance).addAllLayers(iterable);
                return this;
            }

            @Deprecated
            public Builder clearLayers() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearLayers();
                return this;
            }

            @Deprecated
            public Builder removeLayers(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).removeLayers(i);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public String getMimeType() {
                return ((TrackInfo) this.instance).getMimeType();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public ByteString getMimeTypeBytes() {
                return ((TrackInfo) this.instance).getMimeTypeBytes();
            }

            public Builder setMimeType(String str) {
                copyOnWrite();
                ((TrackInfo) this.instance).setMimeType(str);
                return this;
            }

            public Builder clearMimeType() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearMimeType();
                return this;
            }

            public Builder setMimeTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((TrackInfo) this.instance).setMimeTypeBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public String getMid() {
                return ((TrackInfo) this.instance).getMid();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public ByteString getMidBytes() {
                return ((TrackInfo) this.instance).getMidBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((TrackInfo) this.instance).setMid(str);
                return this;
            }

            public Builder clearMid() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearMid();
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((TrackInfo) this.instance).setMidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public List<SimulcastCodecInfo> getCodecsList() {
                return Collections.unmodifiableList(((TrackInfo) this.instance).getCodecsList());
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public int getCodecsCount() {
                return ((TrackInfo) this.instance).getCodecsCount();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public SimulcastCodecInfo getCodecs(int i) {
                return ((TrackInfo) this.instance).getCodecs(i);
            }

            public Builder setCodecs(int i, SimulcastCodecInfo simulcastCodecInfo) {
                copyOnWrite();
                ((TrackInfo) this.instance).setCodecs(i, simulcastCodecInfo);
                return this;
            }

            public Builder setCodecs(int i, SimulcastCodecInfo.Builder builder) {
                copyOnWrite();
                ((TrackInfo) this.instance).setCodecs(i, builder.build());
                return this;
            }

            public Builder addCodecs(SimulcastCodecInfo simulcastCodecInfo) {
                copyOnWrite();
                ((TrackInfo) this.instance).addCodecs(simulcastCodecInfo);
                return this;
            }

            public Builder addCodecs(int i, SimulcastCodecInfo simulcastCodecInfo) {
                copyOnWrite();
                ((TrackInfo) this.instance).addCodecs(i, simulcastCodecInfo);
                return this;
            }

            public Builder addCodecs(SimulcastCodecInfo.Builder builder) {
                copyOnWrite();
                ((TrackInfo) this.instance).addCodecs(builder.build());
                return this;
            }

            public Builder addCodecs(int i, SimulcastCodecInfo.Builder builder) {
                copyOnWrite();
                ((TrackInfo) this.instance).addCodecs(i, builder.build());
                return this;
            }

            public Builder addAllCodecs(Iterable<? extends SimulcastCodecInfo> iterable) {
                copyOnWrite();
                ((TrackInfo) this.instance).addAllCodecs(iterable);
                return this;
            }

            public Builder clearCodecs() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearCodecs();
                return this;
            }

            public Builder removeCodecs(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).removeCodecs(i);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            @Deprecated
            public boolean getStereo() {
                return ((TrackInfo) this.instance).getStereo();
            }

            @Deprecated
            public Builder setStereo(boolean z) {
                copyOnWrite();
                ((TrackInfo) this.instance).setStereo(z);
                return this;
            }

            @Deprecated
            public Builder clearStereo() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearStereo();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public boolean getDisableRed() {
                return ((TrackInfo) this.instance).getDisableRed();
            }

            public Builder setDisableRed(boolean z) {
                copyOnWrite();
                ((TrackInfo) this.instance).setDisableRed(z);
                return this;
            }

            public Builder clearDisableRed() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearDisableRed();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public int getEncryptionValue() {
                return ((TrackInfo) this.instance).getEncryptionValue();
            }

            public Builder setEncryptionValue(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).setEncryptionValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public Encryption.Type getEncryption() {
                return ((TrackInfo) this.instance).getEncryption();
            }

            public Builder setEncryption(Encryption.Type type) {
                copyOnWrite();
                ((TrackInfo) this.instance).setEncryption(type);
                return this;
            }

            public Builder clearEncryption() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearEncryption();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public String getStream() {
                return ((TrackInfo) this.instance).getStream();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public ByteString getStreamBytes() {
                return ((TrackInfo) this.instance).getStreamBytes();
            }

            public Builder setStream(String str) {
                copyOnWrite();
                ((TrackInfo) this.instance).setStream(str);
                return this;
            }

            public Builder clearStream() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearStream();
                return this;
            }

            public Builder setStreamBytes(ByteString byteString) {
                copyOnWrite();
                ((TrackInfo) this.instance).setStreamBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public boolean hasVersion() {
                return ((TrackInfo) this.instance).hasVersion();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public TimedVersion getVersion() {
                return ((TrackInfo) this.instance).getVersion();
            }

            public Builder setVersion(TimedVersion timedVersion) {
                copyOnWrite();
                ((TrackInfo) this.instance).setVersion(timedVersion);
                return this;
            }

            public Builder setVersion(TimedVersion.Builder builder) {
                copyOnWrite();
                ((TrackInfo) this.instance).setVersion(builder.build());
                return this;
            }

            public Builder mergeVersion(TimedVersion timedVersion) {
                copyOnWrite();
                ((TrackInfo) this.instance).mergeVersion(timedVersion);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearVersion();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public List<AudioTrackFeature> getAudioFeaturesList() {
                return ((TrackInfo) this.instance).getAudioFeaturesList();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public int getAudioFeaturesCount() {
                return ((TrackInfo) this.instance).getAudioFeaturesCount();
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public AudioTrackFeature getAudioFeatures(int i) {
                return ((TrackInfo) this.instance).getAudioFeatures(i);
            }

            public Builder setAudioFeatures(int i, AudioTrackFeature audioTrackFeature) {
                copyOnWrite();
                ((TrackInfo) this.instance).setAudioFeatures(i, audioTrackFeature);
                return this;
            }

            public Builder addAudioFeatures(AudioTrackFeature audioTrackFeature) {
                copyOnWrite();
                ((TrackInfo) this.instance).addAudioFeatures(audioTrackFeature);
                return this;
            }

            public Builder addAllAudioFeatures(Iterable<? extends AudioTrackFeature> iterable) {
                copyOnWrite();
                ((TrackInfo) this.instance).addAllAudioFeatures(iterable);
                return this;
            }

            public Builder clearAudioFeatures() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearAudioFeatures();
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public List<Integer> getAudioFeaturesValueList() {
                return Collections.unmodifiableList(((TrackInfo) this.instance).getAudioFeaturesValueList());
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public int getAudioFeaturesValue(int i) {
                return ((TrackInfo) this.instance).getAudioFeaturesValue(i);
            }

            public Builder setAudioFeaturesValue(int i, int i2) {
                copyOnWrite();
                ((TrackInfo) this.instance).setAudioFeaturesValue(i, i2);
                return this;
            }

            public Builder addAudioFeaturesValue(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).addAudioFeaturesValue(i);
                return this;
            }

            public Builder addAllAudioFeaturesValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((TrackInfo) this.instance).addAllAudioFeaturesValue(iterable);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public int getBackupCodecPolicyValue() {
                return ((TrackInfo) this.instance).getBackupCodecPolicyValue();
            }

            public Builder setBackupCodecPolicyValue(int i) {
                copyOnWrite();
                ((TrackInfo) this.instance).setBackupCodecPolicyValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.TrackInfoOrBuilder
            public BackupCodecPolicy getBackupCodecPolicy() {
                return ((TrackInfo) this.instance).getBackupCodecPolicy();
            }

            public Builder setBackupCodecPolicy(BackupCodecPolicy backupCodecPolicy) {
                copyOnWrite();
                ((TrackInfo) this.instance).setBackupCodecPolicy(backupCodecPolicy);
                return this;
            }

            public Builder clearBackupCodecPolicy() {
                copyOnWrite();
                ((TrackInfo) this.instance).clearBackupCodecPolicy();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TrackInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0000\u0001\u0014\u0014\u0000\u0003\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0007\u0005\u000b\u0006\u000b\u0007\u0007\b\u0007\t\f\n\u001b\u000bȈ\fȈ\r\u001b\u000e\u0007\u000f\u0007\u0010\f\u0011Ȉ\u0012\t\u0013,\u0014\f", new Object[]{"sid_", "type_", "name_", "muted_", "width_", "height_", "simulcast_", "disableDtx_", "source_", "layers_", VideoLayer.class, "mimeType_", "mid_", "codecs_", SimulcastCodecInfo.class, "stereo_", "disableRed_", "encryption_", "stream_", "version_", "audioFeatures_", "backupCodecPolicy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TrackInfo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (TrackInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static TrackInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TrackInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class VideoLayer extends GeneratedMessageLite<VideoLayer, Builder> implements VideoLayerOrBuilder {
        public static final int BITRATE_FIELD_NUMBER = 4;
        private static final VideoLayer DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 3;
        private static volatile Parser<VideoLayer> PARSER = null;
        public static final int QUALITY_FIELD_NUMBER = 1;
        public static final int RID_FIELD_NUMBER = 7;
        public static final int SPATIAL_LAYER_FIELD_NUMBER = 6;
        public static final int SSRC_FIELD_NUMBER = 5;
        public static final int WIDTH_FIELD_NUMBER = 2;
        private int bitrate_;
        private int height_;
        private int quality_;
        private String rid_ = "";
        private int spatialLayer_;
        private int ssrc_;
        private int width_;

        private VideoLayer() {
        }

        public enum Mode implements Internal.EnumLite {
            MODE_UNUSED(0),
            ONE_SPATIAL_LAYER_PER_STREAM(1),
            MULTIPLE_SPATIAL_LAYERS_PER_STREAM(2),
            ONE_SPATIAL_LAYER_PER_STREAM_INCOMPLETE_RTCP_SR(3),
            UNRECOGNIZED(-1);

            public static final int MODE_UNUSED_VALUE = 0;
            public static final int MULTIPLE_SPATIAL_LAYERS_PER_STREAM_VALUE = 2;
            public static final int ONE_SPATIAL_LAYER_PER_STREAM_INCOMPLETE_RTCP_SR_VALUE = 3;
            public static final int ONE_SPATIAL_LAYER_PER_STREAM_VALUE = 1;
            private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: livekit.LivekitModels.VideoLayer.Mode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Mode findValueByNumber(int i) {
                    return Mode.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Mode valueOf(int i) {
                return forNumber(i);
            }

            public static Mode forNumber(int i) {
                if (i == 0) {
                    return MODE_UNUSED;
                }
                if (i == 1) {
                    return ONE_SPATIAL_LAYER_PER_STREAM;
                }
                if (i == 2) {
                    return MULTIPLE_SPATIAL_LAYERS_PER_STREAM;
                }
                if (i != 3) {
                    return null;
                }
                return ONE_SPATIAL_LAYER_PER_STREAM_INCOMPLETE_RTCP_SR;
            }

            public static Internal.EnumLiteMap<Mode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return ModeVerifier.INSTANCE;
            }

            private static final class ModeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new ModeVerifier();

                private ModeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Mode.forNumber(i) != null;
                }
            }

            Mode(int i) {
                this.value = i;
            }
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public int getQualityValue() {
            return this.quality_;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public VideoQuality getQuality() {
            VideoQuality forNumber = VideoQuality.forNumber(this.quality_);
            return forNumber == null ? VideoQuality.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQualityValue(int i) {
            this.quality_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuality(VideoQuality videoQuality) {
            this.quality_ = videoQuality.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuality() {
            this.quality_ = 0;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public int getWidth() {
            return this.width_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i) {
            this.width_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public int getHeight() {
            return this.height_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i) {
            this.height_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public int getBitrate() {
            return this.bitrate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBitrate(int i) {
            this.bitrate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBitrate() {
            this.bitrate_ = 0;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public int getSsrc() {
            return this.ssrc_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsrc(int i) {
            this.ssrc_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSsrc() {
            this.ssrc_ = 0;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public int getSpatialLayer() {
            return this.spatialLayer_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpatialLayer(int i) {
            this.spatialLayer_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpatialLayer() {
            this.spatialLayer_ = 0;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public String getRid() {
            return this.rid_;
        }

        @Override // livekit.LivekitModels.VideoLayerOrBuilder
        public ByteString getRidBytes() {
            return ByteString.copyFromUtf8(this.rid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRid(String str) {
            str.getClass();
            this.rid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRid() {
            this.rid_ = getDefaultInstance().getRid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.rid_ = byteString.toStringUtf8();
        }

        public static VideoLayer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static VideoLayer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VideoLayer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VideoLayer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VideoLayer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoLayer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VideoLayer parseFrom(InputStream inputStream) throws IOException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoLayer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoLayer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoLayer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoLayer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoLayer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoLayer parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VideoLayer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(VideoLayer videoLayer) {
            return DEFAULT_INSTANCE.createBuilder(videoLayer);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VideoLayer, Builder> implements VideoLayerOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(VideoLayer.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public int getQualityValue() {
                return ((VideoLayer) this.instance).getQualityValue();
            }

            public Builder setQualityValue(int i) {
                copyOnWrite();
                ((VideoLayer) this.instance).setQualityValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public VideoQuality getQuality() {
                return ((VideoLayer) this.instance).getQuality();
            }

            public Builder setQuality(VideoQuality videoQuality) {
                copyOnWrite();
                ((VideoLayer) this.instance).setQuality(videoQuality);
                return this;
            }

            public Builder clearQuality() {
                copyOnWrite();
                ((VideoLayer) this.instance).clearQuality();
                return this;
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public int getWidth() {
                return ((VideoLayer) this.instance).getWidth();
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                ((VideoLayer) this.instance).setWidth(i);
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((VideoLayer) this.instance).clearWidth();
                return this;
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public int getHeight() {
                return ((VideoLayer) this.instance).getHeight();
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((VideoLayer) this.instance).setHeight(i);
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((VideoLayer) this.instance).clearHeight();
                return this;
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public int getBitrate() {
                return ((VideoLayer) this.instance).getBitrate();
            }

            public Builder setBitrate(int i) {
                copyOnWrite();
                ((VideoLayer) this.instance).setBitrate(i);
                return this;
            }

            public Builder clearBitrate() {
                copyOnWrite();
                ((VideoLayer) this.instance).clearBitrate();
                return this;
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public int getSsrc() {
                return ((VideoLayer) this.instance).getSsrc();
            }

            public Builder setSsrc(int i) {
                copyOnWrite();
                ((VideoLayer) this.instance).setSsrc(i);
                return this;
            }

            public Builder clearSsrc() {
                copyOnWrite();
                ((VideoLayer) this.instance).clearSsrc();
                return this;
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public int getSpatialLayer() {
                return ((VideoLayer) this.instance).getSpatialLayer();
            }

            public Builder setSpatialLayer(int i) {
                copyOnWrite();
                ((VideoLayer) this.instance).setSpatialLayer(i);
                return this;
            }

            public Builder clearSpatialLayer() {
                copyOnWrite();
                ((VideoLayer) this.instance).clearSpatialLayer();
                return this;
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public String getRid() {
                return ((VideoLayer) this.instance).getRid();
            }

            @Override // livekit.LivekitModels.VideoLayerOrBuilder
            public ByteString getRidBytes() {
                return ((VideoLayer) this.instance).getRidBytes();
            }

            public Builder setRid(String str) {
                copyOnWrite();
                ((VideoLayer) this.instance).setRid(str);
                return this;
            }

            public Builder clearRid() {
                copyOnWrite();
                ((VideoLayer) this.instance).clearRid();
                return this;
            }

            public Builder setRidBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoLayer) this.instance).setRidBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoLayer();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u0004\u0007Ȉ", new Object[]{"quality_", "width_", "height_", "bitrate_", "ssrc_", "spatialLayer_", "rid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VideoLayer> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (VideoLayer.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            VideoLayer videoLayer = new VideoLayer();
            DEFAULT_INSTANCE = videoLayer;
            GeneratedMessageLite.registerDefaultInstance(VideoLayer.class, videoLayer);
        }

        public static VideoLayer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<VideoLayer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DataPacket extends GeneratedMessageLite<DataPacket, Builder> implements DataPacketOrBuilder {
        public static final int CHAT_MESSAGE_FIELD_NUMBER = 9;
        private static final DataPacket DEFAULT_INSTANCE;
        public static final int DESTINATION_IDENTITIES_FIELD_NUMBER = 5;
        public static final int ENCRYPTED_PACKET_FIELD_NUMBER = 18;
        public static final int KIND_FIELD_NUMBER = 1;
        public static final int METRICS_FIELD_NUMBER = 8;
        private static volatile Parser<DataPacket> PARSER = null;
        public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 4;
        public static final int PARTICIPANT_SID_FIELD_NUMBER = 17;
        public static final int RPC_ACK_FIELD_NUMBER = 11;
        public static final int RPC_REQUEST_FIELD_NUMBER = 10;
        public static final int RPC_RESPONSE_FIELD_NUMBER = 12;
        public static final int SEQUENCE_FIELD_NUMBER = 16;
        public static final int SIP_DTMF_FIELD_NUMBER = 6;
        public static final int SPEAKER_FIELD_NUMBER = 3;
        public static final int STREAM_CHUNK_FIELD_NUMBER = 14;
        public static final int STREAM_HEADER_FIELD_NUMBER = 13;
        public static final int STREAM_TRAILER_FIELD_NUMBER = 15;
        public static final int TRANSCRIPTION_FIELD_NUMBER = 7;
        public static final int USER_FIELD_NUMBER = 2;
        private int kind_;
        private int sequence_;
        private Object value_;
        private int valueCase_ = 0;
        private String participantIdentity_ = "";
        private Internal.ProtobufList<String> destinationIdentities_ = GeneratedMessageLite.emptyProtobufList();
        private String participantSid_ = "";

        private DataPacket() {
        }

        public enum Kind implements Internal.EnumLite {
            RELIABLE(0),
            LOSSY(1),
            UNRECOGNIZED(-1);

            public static final int LOSSY_VALUE = 1;
            public static final int RELIABLE_VALUE = 0;
            private static final Internal.EnumLiteMap<Kind> internalValueMap = new Internal.EnumLiteMap<Kind>() { // from class: livekit.LivekitModels.DataPacket.Kind.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Kind findValueByNumber(int i) {
                    return Kind.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Kind valueOf(int i) {
                return forNumber(i);
            }

            public static Kind forNumber(int i) {
                if (i == 0) {
                    return RELIABLE;
                }
                if (i != 1) {
                    return null;
                }
                return LOSSY;
            }

            public static Internal.EnumLiteMap<Kind> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return KindVerifier.INSTANCE;
            }

            private static final class KindVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new KindVerifier();

                private KindVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Kind.forNumber(i) != null;
                }
            }

            Kind(int i) {
                this.value = i;
            }
        }

        public enum ValueCase {
            USER(2),
            SPEAKER(3),
            SIP_DTMF(6),
            TRANSCRIPTION(7),
            METRICS(8),
            CHAT_MESSAGE(9),
            RPC_REQUEST(10),
            RPC_ACK(11),
            RPC_RESPONSE(12),
            STREAM_HEADER(13),
            STREAM_CHUNK(14),
            STREAM_TRAILER(15),
            ENCRYPTED_PACKET(18),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 18) {
                    return ENCRYPTED_PACKET;
                }
                if (i == 2) {
                    return USER;
                }
                if (i == 3) {
                    return SPEAKER;
                }
                switch (i) {
                    case 6:
                        return SIP_DTMF;
                    case 7:
                        return TRANSCRIPTION;
                    case 8:
                        return METRICS;
                    case 9:
                        return CHAT_MESSAGE;
                    case 10:
                        return RPC_REQUEST;
                    case 11:
                        return RPC_ACK;
                    case 12:
                        return RPC_RESPONSE;
                    case 13:
                        return STREAM_HEADER;
                    case 14:
                        return STREAM_CHUNK;
                    case 15:
                        return STREAM_TRAILER;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        @Deprecated
        public int getKindValue() {
            return this.kind_;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        @Deprecated
        public Kind getKind() {
            Kind forNumber = Kind.forNumber(this.kind_);
            return forNumber == null ? Kind.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKindValue(int i) {
            this.kind_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKind(Kind kind) {
            this.kind_ = kind.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKind() {
            this.kind_ = 0;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public String getParticipantIdentity() {
            return this.participantIdentity_;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public ByteString getParticipantIdentityBytes() {
            return ByteString.copyFromUtf8(this.participantIdentity_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantIdentity(String str) {
            str.getClass();
            this.participantIdentity_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParticipantIdentity() {
            this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantIdentityBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.participantIdentity_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public List<String> getDestinationIdentitiesList() {
            return this.destinationIdentities_;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public int getDestinationIdentitiesCount() {
            return this.destinationIdentities_.size();
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public String getDestinationIdentities(int i) {
            return this.destinationIdentities_.get(i);
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public ByteString getDestinationIdentitiesBytes(int i) {
            return ByteString.copyFromUtf8(this.destinationIdentities_.get(i));
        }

        private void ensureDestinationIdentitiesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.destinationIdentities_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.destinationIdentities_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDestinationIdentities(int i, String str) {
            str.getClass();
            ensureDestinationIdentitiesIsMutable();
            this.destinationIdentities_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDestinationIdentities(String str) {
            str.getClass();
            ensureDestinationIdentitiesIsMutable();
            this.destinationIdentities_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDestinationIdentities(Iterable<String> iterable) {
            ensureDestinationIdentitiesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.destinationIdentities_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDestinationIdentities() {
            this.destinationIdentities_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDestinationIdentitiesBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureDestinationIdentitiesIsMutable();
            this.destinationIdentities_.add(byteString.toStringUtf8());
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasUser() {
            return this.valueCase_ == 2;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public UserPacket getUser() {
            if (this.valueCase_ == 2) {
                return (UserPacket) this.value_;
            }
            return UserPacket.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUser(UserPacket userPacket) {
            userPacket.getClass();
            this.value_ = userPacket;
            this.valueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUser(UserPacket userPacket) {
            userPacket.getClass();
            if (this.valueCase_ == 2 && this.value_ != UserPacket.getDefaultInstance()) {
                this.value_ = UserPacket.newBuilder((UserPacket) this.value_).mergeFrom((UserPacket.Builder) userPacket).buildPartial();
            } else {
                this.value_ = userPacket;
            }
            this.valueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUser() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        @Deprecated
        public boolean hasSpeaker() {
            return this.valueCase_ == 3;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        @Deprecated
        public ActiveSpeakerUpdate getSpeaker() {
            if (this.valueCase_ == 3) {
                return (ActiveSpeakerUpdate) this.value_;
            }
            return ActiveSpeakerUpdate.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeaker(ActiveSpeakerUpdate activeSpeakerUpdate) {
            activeSpeakerUpdate.getClass();
            this.value_ = activeSpeakerUpdate;
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSpeaker(ActiveSpeakerUpdate activeSpeakerUpdate) {
            activeSpeakerUpdate.getClass();
            if (this.valueCase_ == 3 && this.value_ != ActiveSpeakerUpdate.getDefaultInstance()) {
                this.value_ = ActiveSpeakerUpdate.newBuilder((ActiveSpeakerUpdate) this.value_).mergeFrom((ActiveSpeakerUpdate.Builder) activeSpeakerUpdate).buildPartial();
            } else {
                this.value_ = activeSpeakerUpdate;
            }
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeaker() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasSipDtmf() {
            return this.valueCase_ == 6;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public SipDTMF getSipDtmf() {
            if (this.valueCase_ == 6) {
                return (SipDTMF) this.value_;
            }
            return SipDTMF.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSipDtmf(SipDTMF sipDTMF) {
            sipDTMF.getClass();
            this.value_ = sipDTMF;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSipDtmf(SipDTMF sipDTMF) {
            sipDTMF.getClass();
            if (this.valueCase_ == 6 && this.value_ != SipDTMF.getDefaultInstance()) {
                this.value_ = SipDTMF.newBuilder((SipDTMF) this.value_).mergeFrom((SipDTMF.Builder) sipDTMF).buildPartial();
            } else {
                this.value_ = sipDTMF;
            }
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSipDtmf() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasTranscription() {
            return this.valueCase_ == 7;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public Transcription getTranscription() {
            if (this.valueCase_ == 7) {
                return (Transcription) this.value_;
            }
            return Transcription.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranscription(Transcription transcription) {
            transcription.getClass();
            this.value_ = transcription;
            this.valueCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTranscription(Transcription transcription) {
            transcription.getClass();
            if (this.valueCase_ == 7 && this.value_ != Transcription.getDefaultInstance()) {
                this.value_ = Transcription.newBuilder((Transcription) this.value_).mergeFrom((Transcription.Builder) transcription).buildPartial();
            } else {
                this.value_ = transcription;
            }
            this.valueCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTranscription() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasMetrics() {
            return this.valueCase_ == 8;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public LivekitMetrics.MetricsBatch getMetrics() {
            if (this.valueCase_ == 8) {
                return (LivekitMetrics.MetricsBatch) this.value_;
            }
            return LivekitMetrics.MetricsBatch.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(LivekitMetrics.MetricsBatch metricsBatch) {
            metricsBatch.getClass();
            this.value_ = metricsBatch;
            this.valueCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMetrics(LivekitMetrics.MetricsBatch metricsBatch) {
            metricsBatch.getClass();
            if (this.valueCase_ == 8 && this.value_ != LivekitMetrics.MetricsBatch.getDefaultInstance()) {
                this.value_ = LivekitMetrics.MetricsBatch.newBuilder((LivekitMetrics.MetricsBatch) this.value_).mergeFrom((LivekitMetrics.MetricsBatch.Builder) metricsBatch).buildPartial();
            } else {
                this.value_ = metricsBatch;
            }
            this.valueCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            if (this.valueCase_ == 8) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasChatMessage() {
            return this.valueCase_ == 9;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public ChatMessage getChatMessage() {
            if (this.valueCase_ == 9) {
                return (ChatMessage) this.value_;
            }
            return ChatMessage.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatMessage(ChatMessage chatMessage) {
            chatMessage.getClass();
            this.value_ = chatMessage;
            this.valueCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeChatMessage(ChatMessage chatMessage) {
            chatMessage.getClass();
            if (this.valueCase_ == 9 && this.value_ != ChatMessage.getDefaultInstance()) {
                this.value_ = ChatMessage.newBuilder((ChatMessage) this.value_).mergeFrom((ChatMessage.Builder) chatMessage).buildPartial();
            } else {
                this.value_ = chatMessage;
            }
            this.valueCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatMessage() {
            if (this.valueCase_ == 9) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasRpcRequest() {
            return this.valueCase_ == 10;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public RpcRequest getRpcRequest() {
            if (this.valueCase_ == 10) {
                return (RpcRequest) this.value_;
            }
            return RpcRequest.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRpcRequest(RpcRequest rpcRequest) {
            rpcRequest.getClass();
            this.value_ = rpcRequest;
            this.valueCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRpcRequest(RpcRequest rpcRequest) {
            rpcRequest.getClass();
            if (this.valueCase_ == 10 && this.value_ != RpcRequest.getDefaultInstance()) {
                this.value_ = RpcRequest.newBuilder((RpcRequest) this.value_).mergeFrom((RpcRequest.Builder) rpcRequest).buildPartial();
            } else {
                this.value_ = rpcRequest;
            }
            this.valueCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRpcRequest() {
            if (this.valueCase_ == 10) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasRpcAck() {
            return this.valueCase_ == 11;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public RpcAck getRpcAck() {
            if (this.valueCase_ == 11) {
                return (RpcAck) this.value_;
            }
            return RpcAck.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRpcAck(RpcAck rpcAck) {
            rpcAck.getClass();
            this.value_ = rpcAck;
            this.valueCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRpcAck(RpcAck rpcAck) {
            rpcAck.getClass();
            if (this.valueCase_ == 11 && this.value_ != RpcAck.getDefaultInstance()) {
                this.value_ = RpcAck.newBuilder((RpcAck) this.value_).mergeFrom((RpcAck.Builder) rpcAck).buildPartial();
            } else {
                this.value_ = rpcAck;
            }
            this.valueCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRpcAck() {
            if (this.valueCase_ == 11) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasRpcResponse() {
            return this.valueCase_ == 12;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public RpcResponse getRpcResponse() {
            if (this.valueCase_ == 12) {
                return (RpcResponse) this.value_;
            }
            return RpcResponse.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRpcResponse(RpcResponse rpcResponse) {
            rpcResponse.getClass();
            this.value_ = rpcResponse;
            this.valueCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRpcResponse(RpcResponse rpcResponse) {
            rpcResponse.getClass();
            if (this.valueCase_ == 12 && this.value_ != RpcResponse.getDefaultInstance()) {
                this.value_ = RpcResponse.newBuilder((RpcResponse) this.value_).mergeFrom((RpcResponse.Builder) rpcResponse).buildPartial();
            } else {
                this.value_ = rpcResponse;
            }
            this.valueCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRpcResponse() {
            if (this.valueCase_ == 12) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasStreamHeader() {
            return this.valueCase_ == 13;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public DataStream.Header getStreamHeader() {
            if (this.valueCase_ == 13) {
                return (DataStream.Header) this.value_;
            }
            return DataStream.Header.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStreamHeader(DataStream.Header header) {
            header.getClass();
            this.value_ = header;
            this.valueCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStreamHeader(DataStream.Header header) {
            header.getClass();
            if (this.valueCase_ == 13 && this.value_ != DataStream.Header.getDefaultInstance()) {
                this.value_ = DataStream.Header.newBuilder((DataStream.Header) this.value_).mergeFrom((DataStream.Header.Builder) header).buildPartial();
            } else {
                this.value_ = header;
            }
            this.valueCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStreamHeader() {
            if (this.valueCase_ == 13) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasStreamChunk() {
            return this.valueCase_ == 14;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public DataStream.Chunk getStreamChunk() {
            if (this.valueCase_ == 14) {
                return (DataStream.Chunk) this.value_;
            }
            return DataStream.Chunk.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStreamChunk(DataStream.Chunk chunk) {
            chunk.getClass();
            this.value_ = chunk;
            this.valueCase_ = 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStreamChunk(DataStream.Chunk chunk) {
            chunk.getClass();
            if (this.valueCase_ == 14 && this.value_ != DataStream.Chunk.getDefaultInstance()) {
                this.value_ = DataStream.Chunk.newBuilder((DataStream.Chunk) this.value_).mergeFrom((DataStream.Chunk.Builder) chunk).buildPartial();
            } else {
                this.value_ = chunk;
            }
            this.valueCase_ = 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStreamChunk() {
            if (this.valueCase_ == 14) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasStreamTrailer() {
            return this.valueCase_ == 15;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public DataStream.Trailer getStreamTrailer() {
            if (this.valueCase_ == 15) {
                return (DataStream.Trailer) this.value_;
            }
            return DataStream.Trailer.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStreamTrailer(DataStream.Trailer trailer) {
            trailer.getClass();
            this.value_ = trailer;
            this.valueCase_ = 15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStreamTrailer(DataStream.Trailer trailer) {
            trailer.getClass();
            if (this.valueCase_ == 15 && this.value_ != DataStream.Trailer.getDefaultInstance()) {
                this.value_ = DataStream.Trailer.newBuilder((DataStream.Trailer) this.value_).mergeFrom((DataStream.Trailer.Builder) trailer).buildPartial();
            } else {
                this.value_ = trailer;
            }
            this.valueCase_ = 15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStreamTrailer() {
            if (this.valueCase_ == 15) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public boolean hasEncryptedPacket() {
            return this.valueCase_ == 18;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public EncryptedPacket getEncryptedPacket() {
            if (this.valueCase_ == 18) {
                return (EncryptedPacket) this.value_;
            }
            return EncryptedPacket.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptedPacket(EncryptedPacket encryptedPacket) {
            encryptedPacket.getClass();
            this.value_ = encryptedPacket;
            this.valueCase_ = 18;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEncryptedPacket(EncryptedPacket encryptedPacket) {
            encryptedPacket.getClass();
            if (this.valueCase_ == 18 && this.value_ != EncryptedPacket.getDefaultInstance()) {
                this.value_ = EncryptedPacket.newBuilder((EncryptedPacket) this.value_).mergeFrom((EncryptedPacket.Builder) encryptedPacket).buildPartial();
            } else {
                this.value_ = encryptedPacket;
            }
            this.valueCase_ = 18;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptedPacket() {
            if (this.valueCase_ == 18) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public int getSequence() {
            return this.sequence_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSequence(int i) {
            this.sequence_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public String getParticipantSid() {
            return this.participantSid_;
        }

        @Override // livekit.LivekitModels.DataPacketOrBuilder
        public ByteString getParticipantSidBytes() {
            return ByteString.copyFromUtf8(this.participantSid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantSid(String str) {
            str.getClass();
            this.participantSid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParticipantSid() {
            this.participantSid_ = getDefaultInstance().getParticipantSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantSidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.participantSid_ = byteString.toStringUtf8();
        }

        public static DataPacket parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DataPacket parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DataPacket parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DataPacket parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DataPacket parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataPacket parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DataPacket parseFrom(InputStream inputStream) throws IOException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPacket parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DataPacket parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DataPacket) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPacket parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataPacket) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DataPacket parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DataPacket parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataPacket dataPacket) {
            return DEFAULT_INSTANCE.createBuilder(dataPacket);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DataPacket, Builder> implements DataPacketOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(DataPacket.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public ValueCase getValueCase() {
                return ((DataPacket) this.instance).getValueCase();
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DataPacket) this.instance).clearValue();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            @Deprecated
            public int getKindValue() {
                return ((DataPacket) this.instance).getKindValue();
            }

            @Deprecated
            public Builder setKindValue(int i) {
                copyOnWrite();
                ((DataPacket) this.instance).setKindValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            @Deprecated
            public Kind getKind() {
                return ((DataPacket) this.instance).getKind();
            }

            @Deprecated
            public Builder setKind(Kind kind) {
                copyOnWrite();
                ((DataPacket) this.instance).setKind(kind);
                return this;
            }

            @Deprecated
            public Builder clearKind() {
                copyOnWrite();
                ((DataPacket) this.instance).clearKind();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public String getParticipantIdentity() {
                return ((DataPacket) this.instance).getParticipantIdentity();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public ByteString getParticipantIdentityBytes() {
                return ((DataPacket) this.instance).getParticipantIdentityBytes();
            }

            public Builder setParticipantIdentity(String str) {
                copyOnWrite();
                ((DataPacket) this.instance).setParticipantIdentity(str);
                return this;
            }

            public Builder clearParticipantIdentity() {
                copyOnWrite();
                ((DataPacket) this.instance).clearParticipantIdentity();
                return this;
            }

            public Builder setParticipantIdentityBytes(ByteString byteString) {
                copyOnWrite();
                ((DataPacket) this.instance).setParticipantIdentityBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public List<String> getDestinationIdentitiesList() {
                return Collections.unmodifiableList(((DataPacket) this.instance).getDestinationIdentitiesList());
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public int getDestinationIdentitiesCount() {
                return ((DataPacket) this.instance).getDestinationIdentitiesCount();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public String getDestinationIdentities(int i) {
                return ((DataPacket) this.instance).getDestinationIdentities(i);
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public ByteString getDestinationIdentitiesBytes(int i) {
                return ((DataPacket) this.instance).getDestinationIdentitiesBytes(i);
            }

            public Builder setDestinationIdentities(int i, String str) {
                copyOnWrite();
                ((DataPacket) this.instance).setDestinationIdentities(i, str);
                return this;
            }

            public Builder addDestinationIdentities(String str) {
                copyOnWrite();
                ((DataPacket) this.instance).addDestinationIdentities(str);
                return this;
            }

            public Builder addAllDestinationIdentities(Iterable<String> iterable) {
                copyOnWrite();
                ((DataPacket) this.instance).addAllDestinationIdentities(iterable);
                return this;
            }

            public Builder clearDestinationIdentities() {
                copyOnWrite();
                ((DataPacket) this.instance).clearDestinationIdentities();
                return this;
            }

            public Builder addDestinationIdentitiesBytes(ByteString byteString) {
                copyOnWrite();
                ((DataPacket) this.instance).addDestinationIdentitiesBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasUser() {
                return ((DataPacket) this.instance).hasUser();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public UserPacket getUser() {
                return ((DataPacket) this.instance).getUser();
            }

            public Builder setUser(UserPacket userPacket) {
                copyOnWrite();
                ((DataPacket) this.instance).setUser(userPacket);
                return this;
            }

            public Builder setUser(UserPacket.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setUser(builder.build());
                return this;
            }

            public Builder mergeUser(UserPacket userPacket) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeUser(userPacket);
                return this;
            }

            public Builder clearUser() {
                copyOnWrite();
                ((DataPacket) this.instance).clearUser();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            @Deprecated
            public boolean hasSpeaker() {
                return ((DataPacket) this.instance).hasSpeaker();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            @Deprecated
            public ActiveSpeakerUpdate getSpeaker() {
                return ((DataPacket) this.instance).getSpeaker();
            }

            @Deprecated
            public Builder setSpeaker(ActiveSpeakerUpdate activeSpeakerUpdate) {
                copyOnWrite();
                ((DataPacket) this.instance).setSpeaker(activeSpeakerUpdate);
                return this;
            }

            @Deprecated
            public Builder setSpeaker(ActiveSpeakerUpdate.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setSpeaker(builder.build());
                return this;
            }

            @Deprecated
            public Builder mergeSpeaker(ActiveSpeakerUpdate activeSpeakerUpdate) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeSpeaker(activeSpeakerUpdate);
                return this;
            }

            @Deprecated
            public Builder clearSpeaker() {
                copyOnWrite();
                ((DataPacket) this.instance).clearSpeaker();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasSipDtmf() {
                return ((DataPacket) this.instance).hasSipDtmf();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public SipDTMF getSipDtmf() {
                return ((DataPacket) this.instance).getSipDtmf();
            }

            public Builder setSipDtmf(SipDTMF sipDTMF) {
                copyOnWrite();
                ((DataPacket) this.instance).setSipDtmf(sipDTMF);
                return this;
            }

            public Builder setSipDtmf(SipDTMF.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setSipDtmf(builder.build());
                return this;
            }

            public Builder mergeSipDtmf(SipDTMF sipDTMF) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeSipDtmf(sipDTMF);
                return this;
            }

            public Builder clearSipDtmf() {
                copyOnWrite();
                ((DataPacket) this.instance).clearSipDtmf();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasTranscription() {
                return ((DataPacket) this.instance).hasTranscription();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public Transcription getTranscription() {
                return ((DataPacket) this.instance).getTranscription();
            }

            public Builder setTranscription(Transcription transcription) {
                copyOnWrite();
                ((DataPacket) this.instance).setTranscription(transcription);
                return this;
            }

            public Builder setTranscription(Transcription.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setTranscription(builder.build());
                return this;
            }

            public Builder mergeTranscription(Transcription transcription) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeTranscription(transcription);
                return this;
            }

            public Builder clearTranscription() {
                copyOnWrite();
                ((DataPacket) this.instance).clearTranscription();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasMetrics() {
                return ((DataPacket) this.instance).hasMetrics();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public LivekitMetrics.MetricsBatch getMetrics() {
                return ((DataPacket) this.instance).getMetrics();
            }

            public Builder setMetrics(LivekitMetrics.MetricsBatch metricsBatch) {
                copyOnWrite();
                ((DataPacket) this.instance).setMetrics(metricsBatch);
                return this;
            }

            public Builder setMetrics(LivekitMetrics.MetricsBatch.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setMetrics(builder.build());
                return this;
            }

            public Builder mergeMetrics(LivekitMetrics.MetricsBatch metricsBatch) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeMetrics(metricsBatch);
                return this;
            }

            public Builder clearMetrics() {
                copyOnWrite();
                ((DataPacket) this.instance).clearMetrics();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasChatMessage() {
                return ((DataPacket) this.instance).hasChatMessage();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public ChatMessage getChatMessage() {
                return ((DataPacket) this.instance).getChatMessage();
            }

            public Builder setChatMessage(ChatMessage chatMessage) {
                copyOnWrite();
                ((DataPacket) this.instance).setChatMessage(chatMessage);
                return this;
            }

            public Builder setChatMessage(ChatMessage.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setChatMessage(builder.build());
                return this;
            }

            public Builder mergeChatMessage(ChatMessage chatMessage) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeChatMessage(chatMessage);
                return this;
            }

            public Builder clearChatMessage() {
                copyOnWrite();
                ((DataPacket) this.instance).clearChatMessage();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasRpcRequest() {
                return ((DataPacket) this.instance).hasRpcRequest();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public RpcRequest getRpcRequest() {
                return ((DataPacket) this.instance).getRpcRequest();
            }

            public Builder setRpcRequest(RpcRequest rpcRequest) {
                copyOnWrite();
                ((DataPacket) this.instance).setRpcRequest(rpcRequest);
                return this;
            }

            public Builder setRpcRequest(RpcRequest.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setRpcRequest(builder.build());
                return this;
            }

            public Builder mergeRpcRequest(RpcRequest rpcRequest) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeRpcRequest(rpcRequest);
                return this;
            }

            public Builder clearRpcRequest() {
                copyOnWrite();
                ((DataPacket) this.instance).clearRpcRequest();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasRpcAck() {
                return ((DataPacket) this.instance).hasRpcAck();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public RpcAck getRpcAck() {
                return ((DataPacket) this.instance).getRpcAck();
            }

            public Builder setRpcAck(RpcAck rpcAck) {
                copyOnWrite();
                ((DataPacket) this.instance).setRpcAck(rpcAck);
                return this;
            }

            public Builder setRpcAck(RpcAck.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setRpcAck(builder.build());
                return this;
            }

            public Builder mergeRpcAck(RpcAck rpcAck) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeRpcAck(rpcAck);
                return this;
            }

            public Builder clearRpcAck() {
                copyOnWrite();
                ((DataPacket) this.instance).clearRpcAck();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasRpcResponse() {
                return ((DataPacket) this.instance).hasRpcResponse();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public RpcResponse getRpcResponse() {
                return ((DataPacket) this.instance).getRpcResponse();
            }

            public Builder setRpcResponse(RpcResponse rpcResponse) {
                copyOnWrite();
                ((DataPacket) this.instance).setRpcResponse(rpcResponse);
                return this;
            }

            public Builder setRpcResponse(RpcResponse.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setRpcResponse(builder.build());
                return this;
            }

            public Builder mergeRpcResponse(RpcResponse rpcResponse) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeRpcResponse(rpcResponse);
                return this;
            }

            public Builder clearRpcResponse() {
                copyOnWrite();
                ((DataPacket) this.instance).clearRpcResponse();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasStreamHeader() {
                return ((DataPacket) this.instance).hasStreamHeader();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public DataStream.Header getStreamHeader() {
                return ((DataPacket) this.instance).getStreamHeader();
            }

            public Builder setStreamHeader(DataStream.Header header) {
                copyOnWrite();
                ((DataPacket) this.instance).setStreamHeader(header);
                return this;
            }

            public Builder setStreamHeader(DataStream.Header.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setStreamHeader(builder.build());
                return this;
            }

            public Builder mergeStreamHeader(DataStream.Header header) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeStreamHeader(header);
                return this;
            }

            public Builder clearStreamHeader() {
                copyOnWrite();
                ((DataPacket) this.instance).clearStreamHeader();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasStreamChunk() {
                return ((DataPacket) this.instance).hasStreamChunk();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public DataStream.Chunk getStreamChunk() {
                return ((DataPacket) this.instance).getStreamChunk();
            }

            public Builder setStreamChunk(DataStream.Chunk chunk) {
                copyOnWrite();
                ((DataPacket) this.instance).setStreamChunk(chunk);
                return this;
            }

            public Builder setStreamChunk(DataStream.Chunk.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setStreamChunk(builder.build());
                return this;
            }

            public Builder mergeStreamChunk(DataStream.Chunk chunk) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeStreamChunk(chunk);
                return this;
            }

            public Builder clearStreamChunk() {
                copyOnWrite();
                ((DataPacket) this.instance).clearStreamChunk();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasStreamTrailer() {
                return ((DataPacket) this.instance).hasStreamTrailer();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public DataStream.Trailer getStreamTrailer() {
                return ((DataPacket) this.instance).getStreamTrailer();
            }

            public Builder setStreamTrailer(DataStream.Trailer trailer) {
                copyOnWrite();
                ((DataPacket) this.instance).setStreamTrailer(trailer);
                return this;
            }

            public Builder setStreamTrailer(DataStream.Trailer.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setStreamTrailer(builder.build());
                return this;
            }

            public Builder mergeStreamTrailer(DataStream.Trailer trailer) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeStreamTrailer(trailer);
                return this;
            }

            public Builder clearStreamTrailer() {
                copyOnWrite();
                ((DataPacket) this.instance).clearStreamTrailer();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public boolean hasEncryptedPacket() {
                return ((DataPacket) this.instance).hasEncryptedPacket();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public EncryptedPacket getEncryptedPacket() {
                return ((DataPacket) this.instance).getEncryptedPacket();
            }

            public Builder setEncryptedPacket(EncryptedPacket encryptedPacket) {
                copyOnWrite();
                ((DataPacket) this.instance).setEncryptedPacket(encryptedPacket);
                return this;
            }

            public Builder setEncryptedPacket(EncryptedPacket.Builder builder) {
                copyOnWrite();
                ((DataPacket) this.instance).setEncryptedPacket(builder.build());
                return this;
            }

            public Builder mergeEncryptedPacket(EncryptedPacket encryptedPacket) {
                copyOnWrite();
                ((DataPacket) this.instance).mergeEncryptedPacket(encryptedPacket);
                return this;
            }

            public Builder clearEncryptedPacket() {
                copyOnWrite();
                ((DataPacket) this.instance).clearEncryptedPacket();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public int getSequence() {
                return ((DataPacket) this.instance).getSequence();
            }

            public Builder setSequence(int i) {
                copyOnWrite();
                ((DataPacket) this.instance).setSequence(i);
                return this;
            }

            public Builder clearSequence() {
                copyOnWrite();
                ((DataPacket) this.instance).clearSequence();
                return this;
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public String getParticipantSid() {
                return ((DataPacket) this.instance).getParticipantSid();
            }

            @Override // livekit.LivekitModels.DataPacketOrBuilder
            public ByteString getParticipantSidBytes() {
                return ((DataPacket) this.instance).getParticipantSidBytes();
            }

            public Builder setParticipantSid(String str) {
                copyOnWrite();
                ((DataPacket) this.instance).setParticipantSid(str);
                return this;
            }

            public Builder clearParticipantSid() {
                copyOnWrite();
                ((DataPacket) this.instance).clearParticipantSid();
                return this;
            }

            public Builder setParticipantSidBytes(ByteString byteString) {
                copyOnWrite();
                ((DataPacket) this.instance).setParticipantSidBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DataPacket();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005Ț\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010\u000b\u0011Ȉ\u0012<\u0000", new Object[]{"value_", "valueCase_", "kind_", UserPacket.class, ActiveSpeakerUpdate.class, "participantIdentity_", "destinationIdentities_", SipDTMF.class, Transcription.class, LivekitMetrics.MetricsBatch.class, ChatMessage.class, RpcRequest.class, RpcAck.class, RpcResponse.class, DataStream.Header.class, DataStream.Chunk.class, DataStream.Trailer.class, "sequence_", "participantSid_", EncryptedPacket.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DataPacket> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (DataPacket.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            DataPacket dataPacket = new DataPacket();
            DEFAULT_INSTANCE = dataPacket;
            GeneratedMessageLite.registerDefaultInstance(DataPacket.class, dataPacket);
        }

        public static DataPacket getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DataPacket> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class EncryptedPacket extends GeneratedMessageLite<EncryptedPacket, Builder> implements EncryptedPacketOrBuilder {
        private static final EncryptedPacket DEFAULT_INSTANCE;
        public static final int ENCRYPTED_VALUE_FIELD_NUMBER = 4;
        public static final int ENCRYPTION_TYPE_FIELD_NUMBER = 1;
        public static final int IV_FIELD_NUMBER = 2;
        public static final int KEY_INDEX_FIELD_NUMBER = 3;
        private static volatile Parser<EncryptedPacket> PARSER;
        private int encryptionType_;
        private int keyIndex_;
        private ByteString iv_ = ByteString.EMPTY;
        private ByteString encryptedValue_ = ByteString.EMPTY;

        private EncryptedPacket() {
        }

        @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
        public int getEncryptionTypeValue() {
            return this.encryptionType_;
        }

        @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
        public Encryption.Type getEncryptionType() {
            Encryption.Type forNumber = Encryption.Type.forNumber(this.encryptionType_);
            return forNumber == null ? Encryption.Type.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptionTypeValue(int i) {
            this.encryptionType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptionType(Encryption.Type type) {
            this.encryptionType_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptionType() {
            this.encryptionType_ = 0;
        }

        @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
        public ByteString getIv() {
            return this.iv_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIv(ByteString byteString) {
            byteString.getClass();
            this.iv_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIv() {
            this.iv_ = getDefaultInstance().getIv();
        }

        @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
        public int getKeyIndex() {
            return this.keyIndex_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyIndex(int i) {
            this.keyIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyIndex() {
            this.keyIndex_ = 0;
        }

        @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
        public ByteString getEncryptedValue() {
            return this.encryptedValue_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptedValue(ByteString byteString) {
            byteString.getClass();
            this.encryptedValue_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptedValue() {
            this.encryptedValue_ = getDefaultInstance().getEncryptedValue();
        }

        public static EncryptedPacket parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EncryptedPacket parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EncryptedPacket parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EncryptedPacket parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EncryptedPacket parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EncryptedPacket parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EncryptedPacket parseFrom(InputStream inputStream) throws IOException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptedPacket parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EncryptedPacket parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EncryptedPacket) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptedPacket parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptedPacket) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EncryptedPacket parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EncryptedPacket parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptedPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(EncryptedPacket encryptedPacket) {
            return DEFAULT_INSTANCE.createBuilder(encryptedPacket);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<EncryptedPacket, Builder> implements EncryptedPacketOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(EncryptedPacket.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
            public int getEncryptionTypeValue() {
                return ((EncryptedPacket) this.instance).getEncryptionTypeValue();
            }

            public Builder setEncryptionTypeValue(int i) {
                copyOnWrite();
                ((EncryptedPacket) this.instance).setEncryptionTypeValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
            public Encryption.Type getEncryptionType() {
                return ((EncryptedPacket) this.instance).getEncryptionType();
            }

            public Builder setEncryptionType(Encryption.Type type) {
                copyOnWrite();
                ((EncryptedPacket) this.instance).setEncryptionType(type);
                return this;
            }

            public Builder clearEncryptionType() {
                copyOnWrite();
                ((EncryptedPacket) this.instance).clearEncryptionType();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
            public ByteString getIv() {
                return ((EncryptedPacket) this.instance).getIv();
            }

            public Builder setIv(ByteString byteString) {
                copyOnWrite();
                ((EncryptedPacket) this.instance).setIv(byteString);
                return this;
            }

            public Builder clearIv() {
                copyOnWrite();
                ((EncryptedPacket) this.instance).clearIv();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
            public int getKeyIndex() {
                return ((EncryptedPacket) this.instance).getKeyIndex();
            }

            public Builder setKeyIndex(int i) {
                copyOnWrite();
                ((EncryptedPacket) this.instance).setKeyIndex(i);
                return this;
            }

            public Builder clearKeyIndex() {
                copyOnWrite();
                ((EncryptedPacket) this.instance).clearKeyIndex();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketOrBuilder
            public ByteString getEncryptedValue() {
                return ((EncryptedPacket) this.instance).getEncryptedValue();
            }

            public Builder setEncryptedValue(ByteString byteString) {
                copyOnWrite();
                ((EncryptedPacket) this.instance).setEncryptedValue(byteString);
                return this;
            }

            public Builder clearEncryptedValue() {
                copyOnWrite();
                ((EncryptedPacket) this.instance).clearEncryptedValue();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EncryptedPacket();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\n\u0003\u000b\u0004\n", new Object[]{"encryptionType_", "iv_", "keyIndex_", "encryptedValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EncryptedPacket> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (EncryptedPacket.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            EncryptedPacket encryptedPacket = new EncryptedPacket();
            DEFAULT_INSTANCE = encryptedPacket;
            GeneratedMessageLite.registerDefaultInstance(EncryptedPacket.class, encryptedPacket);
        }

        public static EncryptedPacket getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<EncryptedPacket> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class EncryptedPacketPayload extends GeneratedMessageLite<EncryptedPacketPayload, Builder> implements EncryptedPacketPayloadOrBuilder {
        public static final int CHAT_MESSAGE_FIELD_NUMBER = 3;
        private static final EncryptedPacketPayload DEFAULT_INSTANCE;
        private static volatile Parser<EncryptedPacketPayload> PARSER = null;
        public static final int RPC_ACK_FIELD_NUMBER = 5;
        public static final int RPC_REQUEST_FIELD_NUMBER = 4;
        public static final int RPC_RESPONSE_FIELD_NUMBER = 6;
        public static final int STREAM_CHUNK_FIELD_NUMBER = 8;
        public static final int STREAM_HEADER_FIELD_NUMBER = 7;
        public static final int STREAM_TRAILER_FIELD_NUMBER = 9;
        public static final int USER_FIELD_NUMBER = 1;
        private int valueCase_ = 0;
        private Object value_;

        private EncryptedPacketPayload() {
        }

        public enum ValueCase {
            USER(1),
            CHAT_MESSAGE(3),
            RPC_REQUEST(4),
            RPC_ACK(5),
            RPC_RESPONSE(6),
            STREAM_HEADER(7),
            STREAM_CHUNK(8),
            STREAM_TRAILER(9),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static ValueCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return USER;
                    case 2:
                    default:
                        return null;
                    case 3:
                        return CHAT_MESSAGE;
                    case 4:
                        return RPC_REQUEST;
                    case 5:
                        return RPC_ACK;
                    case 6:
                        return RPC_RESPONSE;
                    case 7:
                        return STREAM_HEADER;
                    case 8:
                        return STREAM_CHUNK;
                    case 9:
                        return STREAM_TRAILER;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasUser() {
            return this.valueCase_ == 1;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public UserPacket getUser() {
            if (this.valueCase_ == 1) {
                return (UserPacket) this.value_;
            }
            return UserPacket.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUser(UserPacket userPacket) {
            userPacket.getClass();
            this.value_ = userPacket;
            this.valueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUser(UserPacket userPacket) {
            userPacket.getClass();
            if (this.valueCase_ == 1 && this.value_ != UserPacket.getDefaultInstance()) {
                this.value_ = UserPacket.newBuilder((UserPacket) this.value_).mergeFrom((UserPacket.Builder) userPacket).buildPartial();
            } else {
                this.value_ = userPacket;
            }
            this.valueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUser() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasChatMessage() {
            return this.valueCase_ == 3;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public ChatMessage getChatMessage() {
            if (this.valueCase_ == 3) {
                return (ChatMessage) this.value_;
            }
            return ChatMessage.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatMessage(ChatMessage chatMessage) {
            chatMessage.getClass();
            this.value_ = chatMessage;
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeChatMessage(ChatMessage chatMessage) {
            chatMessage.getClass();
            if (this.valueCase_ == 3 && this.value_ != ChatMessage.getDefaultInstance()) {
                this.value_ = ChatMessage.newBuilder((ChatMessage) this.value_).mergeFrom((ChatMessage.Builder) chatMessage).buildPartial();
            } else {
                this.value_ = chatMessage;
            }
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatMessage() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasRpcRequest() {
            return this.valueCase_ == 4;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public RpcRequest getRpcRequest() {
            if (this.valueCase_ == 4) {
                return (RpcRequest) this.value_;
            }
            return RpcRequest.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRpcRequest(RpcRequest rpcRequest) {
            rpcRequest.getClass();
            this.value_ = rpcRequest;
            this.valueCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRpcRequest(RpcRequest rpcRequest) {
            rpcRequest.getClass();
            if (this.valueCase_ == 4 && this.value_ != RpcRequest.getDefaultInstance()) {
                this.value_ = RpcRequest.newBuilder((RpcRequest) this.value_).mergeFrom((RpcRequest.Builder) rpcRequest).buildPartial();
            } else {
                this.value_ = rpcRequest;
            }
            this.valueCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRpcRequest() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasRpcAck() {
            return this.valueCase_ == 5;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public RpcAck getRpcAck() {
            if (this.valueCase_ == 5) {
                return (RpcAck) this.value_;
            }
            return RpcAck.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRpcAck(RpcAck rpcAck) {
            rpcAck.getClass();
            this.value_ = rpcAck;
            this.valueCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRpcAck(RpcAck rpcAck) {
            rpcAck.getClass();
            if (this.valueCase_ == 5 && this.value_ != RpcAck.getDefaultInstance()) {
                this.value_ = RpcAck.newBuilder((RpcAck) this.value_).mergeFrom((RpcAck.Builder) rpcAck).buildPartial();
            } else {
                this.value_ = rpcAck;
            }
            this.valueCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRpcAck() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasRpcResponse() {
            return this.valueCase_ == 6;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public RpcResponse getRpcResponse() {
            if (this.valueCase_ == 6) {
                return (RpcResponse) this.value_;
            }
            return RpcResponse.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRpcResponse(RpcResponse rpcResponse) {
            rpcResponse.getClass();
            this.value_ = rpcResponse;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRpcResponse(RpcResponse rpcResponse) {
            rpcResponse.getClass();
            if (this.valueCase_ == 6 && this.value_ != RpcResponse.getDefaultInstance()) {
                this.value_ = RpcResponse.newBuilder((RpcResponse) this.value_).mergeFrom((RpcResponse.Builder) rpcResponse).buildPartial();
            } else {
                this.value_ = rpcResponse;
            }
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRpcResponse() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasStreamHeader() {
            return this.valueCase_ == 7;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public DataStream.Header getStreamHeader() {
            if (this.valueCase_ == 7) {
                return (DataStream.Header) this.value_;
            }
            return DataStream.Header.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStreamHeader(DataStream.Header header) {
            header.getClass();
            this.value_ = header;
            this.valueCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStreamHeader(DataStream.Header header) {
            header.getClass();
            if (this.valueCase_ == 7 && this.value_ != DataStream.Header.getDefaultInstance()) {
                this.value_ = DataStream.Header.newBuilder((DataStream.Header) this.value_).mergeFrom((DataStream.Header.Builder) header).buildPartial();
            } else {
                this.value_ = header;
            }
            this.valueCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStreamHeader() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasStreamChunk() {
            return this.valueCase_ == 8;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public DataStream.Chunk getStreamChunk() {
            if (this.valueCase_ == 8) {
                return (DataStream.Chunk) this.value_;
            }
            return DataStream.Chunk.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStreamChunk(DataStream.Chunk chunk) {
            chunk.getClass();
            this.value_ = chunk;
            this.valueCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStreamChunk(DataStream.Chunk chunk) {
            chunk.getClass();
            if (this.valueCase_ == 8 && this.value_ != DataStream.Chunk.getDefaultInstance()) {
                this.value_ = DataStream.Chunk.newBuilder((DataStream.Chunk) this.value_).mergeFrom((DataStream.Chunk.Builder) chunk).buildPartial();
            } else {
                this.value_ = chunk;
            }
            this.valueCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStreamChunk() {
            if (this.valueCase_ == 8) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public boolean hasStreamTrailer() {
            return this.valueCase_ == 9;
        }

        @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
        public DataStream.Trailer getStreamTrailer() {
            if (this.valueCase_ == 9) {
                return (DataStream.Trailer) this.value_;
            }
            return DataStream.Trailer.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStreamTrailer(DataStream.Trailer trailer) {
            trailer.getClass();
            this.value_ = trailer;
            this.valueCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStreamTrailer(DataStream.Trailer trailer) {
            trailer.getClass();
            if (this.valueCase_ == 9 && this.value_ != DataStream.Trailer.getDefaultInstance()) {
                this.value_ = DataStream.Trailer.newBuilder((DataStream.Trailer) this.value_).mergeFrom((DataStream.Trailer.Builder) trailer).buildPartial();
            } else {
                this.value_ = trailer;
            }
            this.valueCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStreamTrailer() {
            if (this.valueCase_ == 9) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public static EncryptedPacketPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EncryptedPacketPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EncryptedPacketPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EncryptedPacketPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EncryptedPacketPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EncryptedPacketPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EncryptedPacketPayload parseFrom(InputStream inputStream) throws IOException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptedPacketPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EncryptedPacketPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EncryptedPacketPayload) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptedPacketPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptedPacketPayload) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EncryptedPacketPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EncryptedPacketPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptedPacketPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(EncryptedPacketPayload encryptedPacketPayload) {
            return DEFAULT_INSTANCE.createBuilder(encryptedPacketPayload);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<EncryptedPacketPayload, Builder> implements EncryptedPacketPayloadOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(EncryptedPacketPayload.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public ValueCase getValueCase() {
                return ((EncryptedPacketPayload) this.instance).getValueCase();
            }

            public Builder clearValue() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearValue();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasUser() {
                return ((EncryptedPacketPayload) this.instance).hasUser();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public UserPacket getUser() {
                return ((EncryptedPacketPayload) this.instance).getUser();
            }

            public Builder setUser(UserPacket userPacket) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setUser(userPacket);
                return this;
            }

            public Builder setUser(UserPacket.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setUser(builder.build());
                return this;
            }

            public Builder mergeUser(UserPacket userPacket) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeUser(userPacket);
                return this;
            }

            public Builder clearUser() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearUser();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasChatMessage() {
                return ((EncryptedPacketPayload) this.instance).hasChatMessage();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public ChatMessage getChatMessage() {
                return ((EncryptedPacketPayload) this.instance).getChatMessage();
            }

            public Builder setChatMessage(ChatMessage chatMessage) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setChatMessage(chatMessage);
                return this;
            }

            public Builder setChatMessage(ChatMessage.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setChatMessage(builder.build());
                return this;
            }

            public Builder mergeChatMessage(ChatMessage chatMessage) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeChatMessage(chatMessage);
                return this;
            }

            public Builder clearChatMessage() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearChatMessage();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasRpcRequest() {
                return ((EncryptedPacketPayload) this.instance).hasRpcRequest();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public RpcRequest getRpcRequest() {
                return ((EncryptedPacketPayload) this.instance).getRpcRequest();
            }

            public Builder setRpcRequest(RpcRequest rpcRequest) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setRpcRequest(rpcRequest);
                return this;
            }

            public Builder setRpcRequest(RpcRequest.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setRpcRequest(builder.build());
                return this;
            }

            public Builder mergeRpcRequest(RpcRequest rpcRequest) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeRpcRequest(rpcRequest);
                return this;
            }

            public Builder clearRpcRequest() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearRpcRequest();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasRpcAck() {
                return ((EncryptedPacketPayload) this.instance).hasRpcAck();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public RpcAck getRpcAck() {
                return ((EncryptedPacketPayload) this.instance).getRpcAck();
            }

            public Builder setRpcAck(RpcAck rpcAck) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setRpcAck(rpcAck);
                return this;
            }

            public Builder setRpcAck(RpcAck.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setRpcAck(builder.build());
                return this;
            }

            public Builder mergeRpcAck(RpcAck rpcAck) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeRpcAck(rpcAck);
                return this;
            }

            public Builder clearRpcAck() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearRpcAck();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasRpcResponse() {
                return ((EncryptedPacketPayload) this.instance).hasRpcResponse();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public RpcResponse getRpcResponse() {
                return ((EncryptedPacketPayload) this.instance).getRpcResponse();
            }

            public Builder setRpcResponse(RpcResponse rpcResponse) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setRpcResponse(rpcResponse);
                return this;
            }

            public Builder setRpcResponse(RpcResponse.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setRpcResponse(builder.build());
                return this;
            }

            public Builder mergeRpcResponse(RpcResponse rpcResponse) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeRpcResponse(rpcResponse);
                return this;
            }

            public Builder clearRpcResponse() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearRpcResponse();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasStreamHeader() {
                return ((EncryptedPacketPayload) this.instance).hasStreamHeader();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public DataStream.Header getStreamHeader() {
                return ((EncryptedPacketPayload) this.instance).getStreamHeader();
            }

            public Builder setStreamHeader(DataStream.Header header) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setStreamHeader(header);
                return this;
            }

            public Builder setStreamHeader(DataStream.Header.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setStreamHeader(builder.build());
                return this;
            }

            public Builder mergeStreamHeader(DataStream.Header header) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeStreamHeader(header);
                return this;
            }

            public Builder clearStreamHeader() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearStreamHeader();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasStreamChunk() {
                return ((EncryptedPacketPayload) this.instance).hasStreamChunk();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public DataStream.Chunk getStreamChunk() {
                return ((EncryptedPacketPayload) this.instance).getStreamChunk();
            }

            public Builder setStreamChunk(DataStream.Chunk chunk) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setStreamChunk(chunk);
                return this;
            }

            public Builder setStreamChunk(DataStream.Chunk.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setStreamChunk(builder.build());
                return this;
            }

            public Builder mergeStreamChunk(DataStream.Chunk chunk) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeStreamChunk(chunk);
                return this;
            }

            public Builder clearStreamChunk() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearStreamChunk();
                return this;
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public boolean hasStreamTrailer() {
                return ((EncryptedPacketPayload) this.instance).hasStreamTrailer();
            }

            @Override // livekit.LivekitModels.EncryptedPacketPayloadOrBuilder
            public DataStream.Trailer getStreamTrailer() {
                return ((EncryptedPacketPayload) this.instance).getStreamTrailer();
            }

            public Builder setStreamTrailer(DataStream.Trailer trailer) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setStreamTrailer(trailer);
                return this;
            }

            public Builder setStreamTrailer(DataStream.Trailer.Builder builder) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).setStreamTrailer(builder.build());
                return this;
            }

            public Builder mergeStreamTrailer(DataStream.Trailer trailer) {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).mergeStreamTrailer(trailer);
                return this;
            }

            public Builder clearStreamTrailer() {
                copyOnWrite();
                ((EncryptedPacketPayload) this.instance).clearStreamTrailer();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EncryptedPacketPayload();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\t\b\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"value_", "valueCase_", UserPacket.class, ChatMessage.class, RpcRequest.class, RpcAck.class, RpcResponse.class, DataStream.Header.class, DataStream.Chunk.class, DataStream.Trailer.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EncryptedPacketPayload> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (EncryptedPacketPayload.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            EncryptedPacketPayload encryptedPacketPayload = new EncryptedPacketPayload();
            DEFAULT_INSTANCE = encryptedPacketPayload;
            GeneratedMessageLite.registerDefaultInstance(EncryptedPacketPayload.class, encryptedPacketPayload);
        }

        public static EncryptedPacketPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<EncryptedPacketPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Deprecated
    public static final class ActiveSpeakerUpdate extends GeneratedMessageLite<ActiveSpeakerUpdate, Builder> implements ActiveSpeakerUpdateOrBuilder {
        private static final ActiveSpeakerUpdate DEFAULT_INSTANCE;
        private static volatile Parser<ActiveSpeakerUpdate> PARSER = null;
        public static final int SPEAKERS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<SpeakerInfo> speakers_ = emptyProtobufList();

        private ActiveSpeakerUpdate() {
        }

        @Override // livekit.LivekitModels.ActiveSpeakerUpdateOrBuilder
        public List<SpeakerInfo> getSpeakersList() {
            return this.speakers_;
        }

        public List<? extends SpeakerInfoOrBuilder> getSpeakersOrBuilderList() {
            return this.speakers_;
        }

        @Override // livekit.LivekitModels.ActiveSpeakerUpdateOrBuilder
        public int getSpeakersCount() {
            return this.speakers_.size();
        }

        @Override // livekit.LivekitModels.ActiveSpeakerUpdateOrBuilder
        public SpeakerInfo getSpeakers(int i) {
            return this.speakers_.get(i);
        }

        public SpeakerInfoOrBuilder getSpeakersOrBuilder(int i) {
            return this.speakers_.get(i);
        }

        private void ensureSpeakersIsMutable() {
            Internal.ProtobufList<SpeakerInfo> protobufList = this.speakers_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.speakers_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeakers(int i, SpeakerInfo speakerInfo) {
            speakerInfo.getClass();
            ensureSpeakersIsMutable();
            this.speakers_.set(i, speakerInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpeakers(SpeakerInfo speakerInfo) {
            speakerInfo.getClass();
            ensureSpeakersIsMutable();
            this.speakers_.add(speakerInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpeakers(int i, SpeakerInfo speakerInfo) {
            speakerInfo.getClass();
            ensureSpeakersIsMutable();
            this.speakers_.add(i, speakerInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpeakers(Iterable<? extends SpeakerInfo> iterable) {
            ensureSpeakersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.speakers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeakers() {
            this.speakers_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSpeakers(int i) {
            ensureSpeakersIsMutable();
            this.speakers_.remove(i);
        }

        public static ActiveSpeakerUpdate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ActiveSpeakerUpdate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ActiveSpeakerUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ActiveSpeakerUpdate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ActiveSpeakerUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ActiveSpeakerUpdate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ActiveSpeakerUpdate parseFrom(InputStream inputStream) throws IOException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActiveSpeakerUpdate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActiveSpeakerUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ActiveSpeakerUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActiveSpeakerUpdate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ActiveSpeakerUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActiveSpeakerUpdate parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ActiveSpeakerUpdate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ActiveSpeakerUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ActiveSpeakerUpdate activeSpeakerUpdate) {
            return DEFAULT_INSTANCE.createBuilder(activeSpeakerUpdate);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ActiveSpeakerUpdate, Builder> implements ActiveSpeakerUpdateOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ActiveSpeakerUpdate.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ActiveSpeakerUpdateOrBuilder
            public List<SpeakerInfo> getSpeakersList() {
                return Collections.unmodifiableList(((ActiveSpeakerUpdate) this.instance).getSpeakersList());
            }

            @Override // livekit.LivekitModels.ActiveSpeakerUpdateOrBuilder
            public int getSpeakersCount() {
                return ((ActiveSpeakerUpdate) this.instance).getSpeakersCount();
            }

            @Override // livekit.LivekitModels.ActiveSpeakerUpdateOrBuilder
            public SpeakerInfo getSpeakers(int i) {
                return ((ActiveSpeakerUpdate) this.instance).getSpeakers(i);
            }

            public Builder setSpeakers(int i, SpeakerInfo speakerInfo) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).setSpeakers(i, speakerInfo);
                return this;
            }

            public Builder setSpeakers(int i, SpeakerInfo.Builder builder) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).setSpeakers(i, builder.build());
                return this;
            }

            public Builder addSpeakers(SpeakerInfo speakerInfo) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).addSpeakers(speakerInfo);
                return this;
            }

            public Builder addSpeakers(int i, SpeakerInfo speakerInfo) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).addSpeakers(i, speakerInfo);
                return this;
            }

            public Builder addSpeakers(SpeakerInfo.Builder builder) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).addSpeakers(builder.build());
                return this;
            }

            public Builder addSpeakers(int i, SpeakerInfo.Builder builder) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).addSpeakers(i, builder.build());
                return this;
            }

            public Builder addAllSpeakers(Iterable<? extends SpeakerInfo> iterable) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).addAllSpeakers(iterable);
                return this;
            }

            public Builder clearSpeakers() {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).clearSpeakers();
                return this;
            }

            public Builder removeSpeakers(int i) {
                copyOnWrite();
                ((ActiveSpeakerUpdate) this.instance).removeSpeakers(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ActiveSpeakerUpdate();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"speakers_", SpeakerInfo.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ActiveSpeakerUpdate> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ActiveSpeakerUpdate.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ActiveSpeakerUpdate activeSpeakerUpdate = new ActiveSpeakerUpdate();
            DEFAULT_INSTANCE = activeSpeakerUpdate;
            GeneratedMessageLite.registerDefaultInstance(ActiveSpeakerUpdate.class, activeSpeakerUpdate);
        }

        public static ActiveSpeakerUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ActiveSpeakerUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SpeakerInfo extends GeneratedMessageLite<SpeakerInfo, Builder> implements SpeakerInfoOrBuilder {
        public static final int ACTIVE_FIELD_NUMBER = 3;
        private static final SpeakerInfo DEFAULT_INSTANCE;
        public static final int LEVEL_FIELD_NUMBER = 2;
        private static volatile Parser<SpeakerInfo> PARSER = null;
        public static final int SID_FIELD_NUMBER = 1;
        private boolean active_;
        private float level_;
        private String sid_ = "";

        private SpeakerInfo() {
        }

        @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
        public String getSid() {
            return this.sid_;
        }

        @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8(this.sid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSid(String str) {
            str.getClass();
            this.sid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSid() {
            this.sid_ = getDefaultInstance().getSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
        public float getLevel() {
            return this.level_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(float f) {
            this.level_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0.0f;
        }

        @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
        public boolean getActive() {
            return this.active_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActive(boolean z) {
            this.active_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActive() {
            this.active_ = false;
        }

        public static SpeakerInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SpeakerInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SpeakerInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SpeakerInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SpeakerInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SpeakerInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SpeakerInfo parseFrom(InputStream inputStream) throws IOException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeakerInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeakerInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SpeakerInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeakerInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeakerInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SpeakerInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SpeakerInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpeakerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SpeakerInfo speakerInfo) {
            return DEFAULT_INSTANCE.createBuilder(speakerInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SpeakerInfo, Builder> implements SpeakerInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SpeakerInfo.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
            public String getSid() {
                return ((SpeakerInfo) this.instance).getSid();
            }

            @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
            public ByteString getSidBytes() {
                return ((SpeakerInfo) this.instance).getSidBytes();
            }

            public Builder setSid(String str) {
                copyOnWrite();
                ((SpeakerInfo) this.instance).setSid(str);
                return this;
            }

            public Builder clearSid() {
                copyOnWrite();
                ((SpeakerInfo) this.instance).clearSid();
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                copyOnWrite();
                ((SpeakerInfo) this.instance).setSidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
            public float getLevel() {
                return ((SpeakerInfo) this.instance).getLevel();
            }

            public Builder setLevel(float f) {
                copyOnWrite();
                ((SpeakerInfo) this.instance).setLevel(f);
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((SpeakerInfo) this.instance).clearLevel();
                return this;
            }

            @Override // livekit.LivekitModels.SpeakerInfoOrBuilder
            public boolean getActive() {
                return ((SpeakerInfo) this.instance).getActive();
            }

            public Builder setActive(boolean z) {
                copyOnWrite();
                ((SpeakerInfo) this.instance).setActive(z);
                return this;
            }

            public Builder clearActive() {
                copyOnWrite();
                ((SpeakerInfo) this.instance).clearActive();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SpeakerInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0001\u0003\u0007", new Object[]{"sid_", "level_", "active_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SpeakerInfo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (SpeakerInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            SpeakerInfo speakerInfo = new SpeakerInfo();
            DEFAULT_INSTANCE = speakerInfo;
            GeneratedMessageLite.registerDefaultInstance(SpeakerInfo.class, speakerInfo);
        }

        public static SpeakerInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SpeakerInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class UserPacket extends GeneratedMessageLite<UserPacket, Builder> implements UserPacketOrBuilder {
        private static final UserPacket DEFAULT_INSTANCE;
        public static final int DESTINATION_IDENTITIES_FIELD_NUMBER = 6;
        public static final int DESTINATION_SIDS_FIELD_NUMBER = 3;
        public static final int END_TIME_FIELD_NUMBER = 10;
        public static final int ID_FIELD_NUMBER = 8;
        public static final int NONCE_FIELD_NUMBER = 11;
        private static volatile Parser<UserPacket> PARSER = null;
        public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 5;
        public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int START_TIME_FIELD_NUMBER = 9;
        public static final int TOPIC_FIELD_NUMBER = 4;
        private int bitField0_;
        private long endTime_;
        private long startTime_;
        private String participantSid_ = "";
        private String participantIdentity_ = "";
        private ByteString payload_ = ByteString.EMPTY;
        private Internal.ProtobufList<String> destinationSids_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> destinationIdentities_ = GeneratedMessageLite.emptyProtobufList();
        private String topic_ = "";
        private String id_ = "";
        private ByteString nonce_ = ByteString.EMPTY;

        private UserPacket() {
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public String getParticipantSid() {
            return this.participantSid_;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public ByteString getParticipantSidBytes() {
            return ByteString.copyFromUtf8(this.participantSid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantSid(String str) {
            str.getClass();
            this.participantSid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParticipantSid() {
            this.participantSid_ = getDefaultInstance().getParticipantSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantSidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.participantSid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public String getParticipantIdentity() {
            return this.participantIdentity_;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public ByteString getParticipantIdentityBytes() {
            return ByteString.copyFromUtf8(this.participantIdentity_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantIdentity(String str) {
            str.getClass();
            this.participantIdentity_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParticipantIdentity() {
            this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantIdentityBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.participantIdentity_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public List<String> getDestinationSidsList() {
            return this.destinationSids_;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public int getDestinationSidsCount() {
            return this.destinationSids_.size();
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public String getDestinationSids(int i) {
            return this.destinationSids_.get(i);
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public ByteString getDestinationSidsBytes(int i) {
            return ByteString.copyFromUtf8(this.destinationSids_.get(i));
        }

        private void ensureDestinationSidsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.destinationSids_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.destinationSids_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDestinationSids(int i, String str) {
            str.getClass();
            ensureDestinationSidsIsMutable();
            this.destinationSids_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDestinationSids(String str) {
            str.getClass();
            ensureDestinationSidsIsMutable();
            this.destinationSids_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDestinationSids(Iterable<String> iterable) {
            ensureDestinationSidsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.destinationSids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDestinationSids() {
            this.destinationSids_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDestinationSidsBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureDestinationSidsIsMutable();
            this.destinationSids_.add(byteString.toStringUtf8());
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public List<String> getDestinationIdentitiesList() {
            return this.destinationIdentities_;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public int getDestinationIdentitiesCount() {
            return this.destinationIdentities_.size();
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public String getDestinationIdentities(int i) {
            return this.destinationIdentities_.get(i);
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        @Deprecated
        public ByteString getDestinationIdentitiesBytes(int i) {
            return ByteString.copyFromUtf8(this.destinationIdentities_.get(i));
        }

        private void ensureDestinationIdentitiesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.destinationIdentities_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.destinationIdentities_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDestinationIdentities(int i, String str) {
            str.getClass();
            ensureDestinationIdentitiesIsMutable();
            this.destinationIdentities_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDestinationIdentities(String str) {
            str.getClass();
            ensureDestinationIdentitiesIsMutable();
            this.destinationIdentities_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDestinationIdentities(Iterable<String> iterable) {
            ensureDestinationIdentitiesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.destinationIdentities_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDestinationIdentities() {
            this.destinationIdentities_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDestinationIdentitiesBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureDestinationIdentitiesIsMutable();
            this.destinationIdentities_.add(byteString.toStringUtf8());
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public boolean hasTopic() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public String getTopic() {
            return this.topic_;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public ByteString getTopicBytes() {
            return ByteString.copyFromUtf8(this.topic_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopic(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.topic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopic() {
            this.bitField0_ &= -2;
            this.topic_ = getDefaultInstance().getTopic();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.topic_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -3;
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public boolean hasStartTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(long j) {
            this.bitField0_ |= 4;
            this.startTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -5;
            this.startTime_ = 0L;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public boolean hasEndTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public long getEndTime() {
            return this.endTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(long j) {
            this.bitField0_ |= 8;
            this.endTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.bitField0_ &= -9;
            this.endTime_ = 0L;
        }

        @Override // livekit.LivekitModels.UserPacketOrBuilder
        public ByteString getNonce() {
            return this.nonce_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNonce(ByteString byteString) {
            byteString.getClass();
            this.nonce_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = getDefaultInstance().getNonce();
        }

        public static UserPacket parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static UserPacket parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UserPacket parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UserPacket parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UserPacket parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserPacket parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UserPacket parseFrom(InputStream inputStream) throws IOException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserPacket parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UserPacket parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserPacket) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserPacket parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserPacket) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UserPacket parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UserPacket parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserPacket) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UserPacket userPacket) {
            return DEFAULT_INSTANCE.createBuilder(userPacket);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<UserPacket, Builder> implements UserPacketOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(UserPacket.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public String getParticipantSid() {
                return ((UserPacket) this.instance).getParticipantSid();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public ByteString getParticipantSidBytes() {
                return ((UserPacket) this.instance).getParticipantSidBytes();
            }

            @Deprecated
            public Builder setParticipantSid(String str) {
                copyOnWrite();
                ((UserPacket) this.instance).setParticipantSid(str);
                return this;
            }

            @Deprecated
            public Builder clearParticipantSid() {
                copyOnWrite();
                ((UserPacket) this.instance).clearParticipantSid();
                return this;
            }

            @Deprecated
            public Builder setParticipantSidBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).setParticipantSidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public String getParticipantIdentity() {
                return ((UserPacket) this.instance).getParticipantIdentity();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public ByteString getParticipantIdentityBytes() {
                return ((UserPacket) this.instance).getParticipantIdentityBytes();
            }

            @Deprecated
            public Builder setParticipantIdentity(String str) {
                copyOnWrite();
                ((UserPacket) this.instance).setParticipantIdentity(str);
                return this;
            }

            @Deprecated
            public Builder clearParticipantIdentity() {
                copyOnWrite();
                ((UserPacket) this.instance).clearParticipantIdentity();
                return this;
            }

            @Deprecated
            public Builder setParticipantIdentityBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).setParticipantIdentityBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public ByteString getPayload() {
                return ((UserPacket) this.instance).getPayload();
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).setPayload(byteString);
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((UserPacket) this.instance).clearPayload();
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public List<String> getDestinationSidsList() {
                return Collections.unmodifiableList(((UserPacket) this.instance).getDestinationSidsList());
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public int getDestinationSidsCount() {
                return ((UserPacket) this.instance).getDestinationSidsCount();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public String getDestinationSids(int i) {
                return ((UserPacket) this.instance).getDestinationSids(i);
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public ByteString getDestinationSidsBytes(int i) {
                return ((UserPacket) this.instance).getDestinationSidsBytes(i);
            }

            @Deprecated
            public Builder setDestinationSids(int i, String str) {
                copyOnWrite();
                ((UserPacket) this.instance).setDestinationSids(i, str);
                return this;
            }

            @Deprecated
            public Builder addDestinationSids(String str) {
                copyOnWrite();
                ((UserPacket) this.instance).addDestinationSids(str);
                return this;
            }

            @Deprecated
            public Builder addAllDestinationSids(Iterable<String> iterable) {
                copyOnWrite();
                ((UserPacket) this.instance).addAllDestinationSids(iterable);
                return this;
            }

            @Deprecated
            public Builder clearDestinationSids() {
                copyOnWrite();
                ((UserPacket) this.instance).clearDestinationSids();
                return this;
            }

            @Deprecated
            public Builder addDestinationSidsBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).addDestinationSidsBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public List<String> getDestinationIdentitiesList() {
                return Collections.unmodifiableList(((UserPacket) this.instance).getDestinationIdentitiesList());
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public int getDestinationIdentitiesCount() {
                return ((UserPacket) this.instance).getDestinationIdentitiesCount();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public String getDestinationIdentities(int i) {
                return ((UserPacket) this.instance).getDestinationIdentities(i);
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            @Deprecated
            public ByteString getDestinationIdentitiesBytes(int i) {
                return ((UserPacket) this.instance).getDestinationIdentitiesBytes(i);
            }

            @Deprecated
            public Builder setDestinationIdentities(int i, String str) {
                copyOnWrite();
                ((UserPacket) this.instance).setDestinationIdentities(i, str);
                return this;
            }

            @Deprecated
            public Builder addDestinationIdentities(String str) {
                copyOnWrite();
                ((UserPacket) this.instance).addDestinationIdentities(str);
                return this;
            }

            @Deprecated
            public Builder addAllDestinationIdentities(Iterable<String> iterable) {
                copyOnWrite();
                ((UserPacket) this.instance).addAllDestinationIdentities(iterable);
                return this;
            }

            @Deprecated
            public Builder clearDestinationIdentities() {
                copyOnWrite();
                ((UserPacket) this.instance).clearDestinationIdentities();
                return this;
            }

            @Deprecated
            public Builder addDestinationIdentitiesBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).addDestinationIdentitiesBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public boolean hasTopic() {
                return ((UserPacket) this.instance).hasTopic();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public String getTopic() {
                return ((UserPacket) this.instance).getTopic();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public ByteString getTopicBytes() {
                return ((UserPacket) this.instance).getTopicBytes();
            }

            public Builder setTopic(String str) {
                copyOnWrite();
                ((UserPacket) this.instance).setTopic(str);
                return this;
            }

            public Builder clearTopic() {
                copyOnWrite();
                ((UserPacket) this.instance).clearTopic();
                return this;
            }

            public Builder setTopicBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).setTopicBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public boolean hasId() {
                return ((UserPacket) this.instance).hasId();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public String getId() {
                return ((UserPacket) this.instance).getId();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public ByteString getIdBytes() {
                return ((UserPacket) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((UserPacket) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((UserPacket) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public boolean hasStartTime() {
                return ((UserPacket) this.instance).hasStartTime();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public long getStartTime() {
                return ((UserPacket) this.instance).getStartTime();
            }

            public Builder setStartTime(long j) {
                copyOnWrite();
                ((UserPacket) this.instance).setStartTime(j);
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((UserPacket) this.instance).clearStartTime();
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public boolean hasEndTime() {
                return ((UserPacket) this.instance).hasEndTime();
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public long getEndTime() {
                return ((UserPacket) this.instance).getEndTime();
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((UserPacket) this.instance).setEndTime(j);
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((UserPacket) this.instance).clearEndTime();
                return this;
            }

            @Override // livekit.LivekitModels.UserPacketOrBuilder
            public ByteString getNonce() {
                return ((UserPacket) this.instance).getNonce();
            }

            public Builder setNonce(ByteString byteString) {
                copyOnWrite();
                ((UserPacket) this.instance).setNonce(byteString);
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((UserPacket) this.instance).clearNonce();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserPacket();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0000\u0001Ȉ\u0002\n\u0003Ț\u0004ለ\u0000\u0005Ȉ\u0006Ț\bለ\u0001\tဃ\u0002\nဃ\u0003\u000b\n", new Object[]{"bitField0_", "participantSid_", "payload_", "destinationSids_", "topic_", "participantIdentity_", "destinationIdentities_", "id_", "startTime_", "endTime_", "nonce_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UserPacket> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (UserPacket.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            UserPacket userPacket = new UserPacket();
            DEFAULT_INSTANCE = userPacket;
            GeneratedMessageLite.registerDefaultInstance(UserPacket.class, userPacket);
        }

        public static UserPacket getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<UserPacket> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SipDTMF extends GeneratedMessageLite<SipDTMF, Builder> implements SipDTMFOrBuilder {
        public static final int CODE_FIELD_NUMBER = 3;
        private static final SipDTMF DEFAULT_INSTANCE;
        public static final int DIGIT_FIELD_NUMBER = 4;
        private static volatile Parser<SipDTMF> PARSER;
        private int code_;
        private String digit_ = "";

        private SipDTMF() {
        }

        @Override // livekit.LivekitModels.SipDTMFOrBuilder
        public int getCode() {
            return this.code_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        @Override // livekit.LivekitModels.SipDTMFOrBuilder
        public String getDigit() {
            return this.digit_;
        }

        @Override // livekit.LivekitModels.SipDTMFOrBuilder
        public ByteString getDigitBytes() {
            return ByteString.copyFromUtf8(this.digit_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDigit(String str) {
            str.getClass();
            this.digit_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDigit() {
            this.digit_ = getDefaultInstance().getDigit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDigitBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.digit_ = byteString.toStringUtf8();
        }

        public static SipDTMF parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SipDTMF parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SipDTMF parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SipDTMF parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SipDTMF parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SipDTMF parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SipDTMF parseFrom(InputStream inputStream) throws IOException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SipDTMF parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SipDTMF parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SipDTMF) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SipDTMF parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SipDTMF) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SipDTMF parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SipDTMF parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SipDTMF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SipDTMF sipDTMF) {
            return DEFAULT_INSTANCE.createBuilder(sipDTMF);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SipDTMF, Builder> implements SipDTMFOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SipDTMF.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.SipDTMFOrBuilder
            public int getCode() {
                return ((SipDTMF) this.instance).getCode();
            }

            public Builder setCode(int i) {
                copyOnWrite();
                ((SipDTMF) this.instance).setCode(i);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((SipDTMF) this.instance).clearCode();
                return this;
            }

            @Override // livekit.LivekitModels.SipDTMFOrBuilder
            public String getDigit() {
                return ((SipDTMF) this.instance).getDigit();
            }

            @Override // livekit.LivekitModels.SipDTMFOrBuilder
            public ByteString getDigitBytes() {
                return ((SipDTMF) this.instance).getDigitBytes();
            }

            public Builder setDigit(String str) {
                copyOnWrite();
                ((SipDTMF) this.instance).setDigit(str);
                return this;
            }

            public Builder clearDigit() {
                copyOnWrite();
                ((SipDTMF) this.instance).clearDigit();
                return this;
            }

            public Builder setDigitBytes(ByteString byteString) {
                copyOnWrite();
                ((SipDTMF) this.instance).setDigitBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SipDTMF();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u000b\u0004Ȉ", new Object[]{"code_", "digit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SipDTMF> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (SipDTMF.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            SipDTMF sipDTMF = new SipDTMF();
            DEFAULT_INSTANCE = sipDTMF;
            GeneratedMessageLite.registerDefaultInstance(SipDTMF.class, sipDTMF);
        }

        public static SipDTMF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SipDTMF> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Transcription extends GeneratedMessageLite<Transcription, Builder> implements TranscriptionOrBuilder {
        private static final Transcription DEFAULT_INSTANCE;
        private static volatile Parser<Transcription> PARSER = null;
        public static final int SEGMENTS_FIELD_NUMBER = 4;
        public static final int TRACK_ID_FIELD_NUMBER = 3;
        public static final int TRANSCRIBED_PARTICIPANT_IDENTITY_FIELD_NUMBER = 2;
        private String transcribedParticipantIdentity_ = "";
        private String trackId_ = "";
        private Internal.ProtobufList<TranscriptionSegment> segments_ = emptyProtobufList();

        private Transcription() {
        }

        @Override // livekit.LivekitModels.TranscriptionOrBuilder
        public String getTranscribedParticipantIdentity() {
            return this.transcribedParticipantIdentity_;
        }

        @Override // livekit.LivekitModels.TranscriptionOrBuilder
        public ByteString getTranscribedParticipantIdentityBytes() {
            return ByteString.copyFromUtf8(this.transcribedParticipantIdentity_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranscribedParticipantIdentity(String str) {
            str.getClass();
            this.transcribedParticipantIdentity_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTranscribedParticipantIdentity() {
            this.transcribedParticipantIdentity_ = getDefaultInstance().getTranscribedParticipantIdentity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranscribedParticipantIdentityBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.transcribedParticipantIdentity_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TranscriptionOrBuilder
        public String getTrackId() {
            return this.trackId_;
        }

        @Override // livekit.LivekitModels.TranscriptionOrBuilder
        public ByteString getTrackIdBytes() {
            return ByteString.copyFromUtf8(this.trackId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackId(String str) {
            str.getClass();
            this.trackId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackId() {
            this.trackId_ = getDefaultInstance().getTrackId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.trackId_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TranscriptionOrBuilder
        public List<TranscriptionSegment> getSegmentsList() {
            return this.segments_;
        }

        public List<? extends TranscriptionSegmentOrBuilder> getSegmentsOrBuilderList() {
            return this.segments_;
        }

        @Override // livekit.LivekitModels.TranscriptionOrBuilder
        public int getSegmentsCount() {
            return this.segments_.size();
        }

        @Override // livekit.LivekitModels.TranscriptionOrBuilder
        public TranscriptionSegment getSegments(int i) {
            return this.segments_.get(i);
        }

        public TranscriptionSegmentOrBuilder getSegmentsOrBuilder(int i) {
            return this.segments_.get(i);
        }

        private void ensureSegmentsIsMutable() {
            Internal.ProtobufList<TranscriptionSegment> protobufList = this.segments_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.segments_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSegments(int i, TranscriptionSegment transcriptionSegment) {
            transcriptionSegment.getClass();
            ensureSegmentsIsMutable();
            this.segments_.set(i, transcriptionSegment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSegments(TranscriptionSegment transcriptionSegment) {
            transcriptionSegment.getClass();
            ensureSegmentsIsMutable();
            this.segments_.add(transcriptionSegment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSegments(int i, TranscriptionSegment transcriptionSegment) {
            transcriptionSegment.getClass();
            ensureSegmentsIsMutable();
            this.segments_.add(i, transcriptionSegment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSegments(Iterable<? extends TranscriptionSegment> iterable) {
            ensureSegmentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.segments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSegments() {
            this.segments_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSegments(int i) {
            ensureSegmentsIsMutable();
            this.segments_.remove(i);
        }

        public static Transcription parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Transcription parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Transcription parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Transcription parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Transcription parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Transcription parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Transcription parseFrom(InputStream inputStream) throws IOException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Transcription parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Transcription parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Transcription) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Transcription parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Transcription) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Transcription parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Transcription parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Transcription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Transcription transcription) {
            return DEFAULT_INSTANCE.createBuilder(transcription);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Transcription, Builder> implements TranscriptionOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Transcription.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.TranscriptionOrBuilder
            public String getTranscribedParticipantIdentity() {
                return ((Transcription) this.instance).getTranscribedParticipantIdentity();
            }

            @Override // livekit.LivekitModels.TranscriptionOrBuilder
            public ByteString getTranscribedParticipantIdentityBytes() {
                return ((Transcription) this.instance).getTranscribedParticipantIdentityBytes();
            }

            public Builder setTranscribedParticipantIdentity(String str) {
                copyOnWrite();
                ((Transcription) this.instance).setTranscribedParticipantIdentity(str);
                return this;
            }

            public Builder clearTranscribedParticipantIdentity() {
                copyOnWrite();
                ((Transcription) this.instance).clearTranscribedParticipantIdentity();
                return this;
            }

            public Builder setTranscribedParticipantIdentityBytes(ByteString byteString) {
                copyOnWrite();
                ((Transcription) this.instance).setTranscribedParticipantIdentityBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TranscriptionOrBuilder
            public String getTrackId() {
                return ((Transcription) this.instance).getTrackId();
            }

            @Override // livekit.LivekitModels.TranscriptionOrBuilder
            public ByteString getTrackIdBytes() {
                return ((Transcription) this.instance).getTrackIdBytes();
            }

            public Builder setTrackId(String str) {
                copyOnWrite();
                ((Transcription) this.instance).setTrackId(str);
                return this;
            }

            public Builder clearTrackId() {
                copyOnWrite();
                ((Transcription) this.instance).clearTrackId();
                return this;
            }

            public Builder setTrackIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Transcription) this.instance).setTrackIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TranscriptionOrBuilder
            public List<TranscriptionSegment> getSegmentsList() {
                return Collections.unmodifiableList(((Transcription) this.instance).getSegmentsList());
            }

            @Override // livekit.LivekitModels.TranscriptionOrBuilder
            public int getSegmentsCount() {
                return ((Transcription) this.instance).getSegmentsCount();
            }

            @Override // livekit.LivekitModels.TranscriptionOrBuilder
            public TranscriptionSegment getSegments(int i) {
                return ((Transcription) this.instance).getSegments(i);
            }

            public Builder setSegments(int i, TranscriptionSegment transcriptionSegment) {
                copyOnWrite();
                ((Transcription) this.instance).setSegments(i, transcriptionSegment);
                return this;
            }

            public Builder setSegments(int i, TranscriptionSegment.Builder builder) {
                copyOnWrite();
                ((Transcription) this.instance).setSegments(i, builder.build());
                return this;
            }

            public Builder addSegments(TranscriptionSegment transcriptionSegment) {
                copyOnWrite();
                ((Transcription) this.instance).addSegments(transcriptionSegment);
                return this;
            }

            public Builder addSegments(int i, TranscriptionSegment transcriptionSegment) {
                copyOnWrite();
                ((Transcription) this.instance).addSegments(i, transcriptionSegment);
                return this;
            }

            public Builder addSegments(TranscriptionSegment.Builder builder) {
                copyOnWrite();
                ((Transcription) this.instance).addSegments(builder.build());
                return this;
            }

            public Builder addSegments(int i, TranscriptionSegment.Builder builder) {
                copyOnWrite();
                ((Transcription) this.instance).addSegments(i, builder.build());
                return this;
            }

            public Builder addAllSegments(Iterable<? extends TranscriptionSegment> iterable) {
                copyOnWrite();
                ((Transcription) this.instance).addAllSegments(iterable);
                return this;
            }

            public Builder clearSegments() {
                copyOnWrite();
                ((Transcription) this.instance).clearSegments();
                return this;
            }

            public Builder removeSegments(int i) {
                copyOnWrite();
                ((Transcription) this.instance).removeSegments(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transcription();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"transcribedParticipantIdentity_", "trackId_", "segments_", TranscriptionSegment.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Transcription> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Transcription.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Transcription transcription = new Transcription();
            DEFAULT_INSTANCE = transcription;
            GeneratedMessageLite.registerDefaultInstance(Transcription.class, transcription);
        }

        public static Transcription getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Transcription> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class TranscriptionSegment extends GeneratedMessageLite<TranscriptionSegment, Builder> implements TranscriptionSegmentOrBuilder {
        private static final TranscriptionSegment DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 4;
        public static final int FINAL_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LANGUAGE_FIELD_NUMBER = 6;
        private static volatile Parser<TranscriptionSegment> PARSER = null;
        public static final int START_TIME_FIELD_NUMBER = 3;
        public static final int TEXT_FIELD_NUMBER = 2;
        private long endTime_;
        private boolean final_;
        private long startTime_;
        private String id_ = "";
        private String text_ = "";
        private String language_ = "";

        private TranscriptionSegment() {
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(long j) {
            this.startTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = 0L;
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public long getEndTime() {
            return this.endTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(long j) {
            this.endTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = 0L;
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public boolean getFinal() {
            return this.final_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFinal(boolean z) {
            this.final_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFinal() {
            this.final_ = false;
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        public static TranscriptionSegment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TranscriptionSegment parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TranscriptionSegment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TranscriptionSegment parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TranscriptionSegment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranscriptionSegment parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TranscriptionSegment parseFrom(InputStream inputStream) throws IOException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranscriptionSegment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranscriptionSegment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranscriptionSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranscriptionSegment parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranscriptionSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranscriptionSegment parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TranscriptionSegment parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranscriptionSegment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TranscriptionSegment transcriptionSegment) {
            return DEFAULT_INSTANCE.createBuilder(transcriptionSegment);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TranscriptionSegment, Builder> implements TranscriptionSegmentOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(TranscriptionSegment.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public String getId() {
                return ((TranscriptionSegment) this.instance).getId();
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public ByteString getIdBytes() {
                return ((TranscriptionSegment) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public String getText() {
                return ((TranscriptionSegment) this.instance).getText();
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public ByteString getTextBytes() {
                return ((TranscriptionSegment) this.instance).getTextBytes();
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setText(str);
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).clearText();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setTextBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public long getStartTime() {
                return ((TranscriptionSegment) this.instance).getStartTime();
            }

            public Builder setStartTime(long j) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setStartTime(j);
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).clearStartTime();
                return this;
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public long getEndTime() {
                return ((TranscriptionSegment) this.instance).getEndTime();
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setEndTime(j);
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).clearEndTime();
                return this;
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public boolean getFinal() {
                return ((TranscriptionSegment) this.instance).getFinal();
            }

            public Builder setFinal(boolean z) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setFinal(z);
                return this;
            }

            public Builder clearFinal() {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).clearFinal();
                return this;
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public String getLanguage() {
                return ((TranscriptionSegment) this.instance).getLanguage();
            }

            @Override // livekit.LivekitModels.TranscriptionSegmentOrBuilder
            public ByteString getLanguageBytes() {
                return ((TranscriptionSegment) this.instance).getLanguageBytes();
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setLanguage(str);
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).clearLanguage();
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) {
                copyOnWrite();
                ((TranscriptionSegment) this.instance).setLanguageBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TranscriptionSegment();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u0003\u0005\u0007\u0006Ȉ", new Object[]{"id_", "text_", "startTime_", "endTime_", "final_", "language_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TranscriptionSegment> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (TranscriptionSegment.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            TranscriptionSegment transcriptionSegment = new TranscriptionSegment();
            DEFAULT_INSTANCE = transcriptionSegment;
            GeneratedMessageLite.registerDefaultInstance(TranscriptionSegment.class, transcriptionSegment);
        }

        public static TranscriptionSegment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TranscriptionSegment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ChatMessage extends GeneratedMessageLite<ChatMessage, Builder> implements ChatMessageOrBuilder {
        private static final ChatMessage DEFAULT_INSTANCE;
        public static final int DELETED_FIELD_NUMBER = 5;
        public static final int EDIT_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int GENERATED_FIELD_NUMBER = 6;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 4;
        private static volatile Parser<ChatMessage> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean deleted_;
        private long editTimestamp_;
        private boolean generated_;
        private String id_ = "";
        private String message_ = "";
        private long timestamp_;

        private ChatMessage() {
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public boolean hasEditTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public long getEditTimestamp() {
            return this.editTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditTimestamp(long j) {
            this.bitField0_ |= 1;
            this.editTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditTimestamp() {
            this.bitField0_ &= -2;
            this.editTimestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public boolean getDeleted() {
            return this.deleted_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeleted(boolean z) {
            this.deleted_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeleted() {
            this.deleted_ = false;
        }

        @Override // livekit.LivekitModels.ChatMessageOrBuilder
        public boolean getGenerated() {
            return this.generated_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGenerated(boolean z) {
            this.generated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGenerated() {
            this.generated_ = false;
        }

        public static ChatMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ChatMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ChatMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ChatMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ChatMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ChatMessage parseFrom(InputStream inputStream) throws IOException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ChatMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChatMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ChatMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ChatMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ChatMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ChatMessage chatMessage) {
            return DEFAULT_INSTANCE.createBuilder(chatMessage);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ChatMessage, Builder> implements ChatMessageOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ChatMessage.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public String getId() {
                return ((ChatMessage) this.instance).getId();
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public ByteString getIdBytes() {
                return ((ChatMessage) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((ChatMessage) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((ChatMessage) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMessage) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public long getTimestamp() {
                return ((ChatMessage) this.instance).getTimestamp();
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((ChatMessage) this.instance).setTimestamp(j);
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((ChatMessage) this.instance).clearTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public boolean hasEditTimestamp() {
                return ((ChatMessage) this.instance).hasEditTimestamp();
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public long getEditTimestamp() {
                return ((ChatMessage) this.instance).getEditTimestamp();
            }

            public Builder setEditTimestamp(long j) {
                copyOnWrite();
                ((ChatMessage) this.instance).setEditTimestamp(j);
                return this;
            }

            public Builder clearEditTimestamp() {
                copyOnWrite();
                ((ChatMessage) this.instance).clearEditTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public String getMessage() {
                return ((ChatMessage) this.instance).getMessage();
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public ByteString getMessageBytes() {
                return ((ChatMessage) this.instance).getMessageBytes();
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((ChatMessage) this.instance).setMessage(str);
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((ChatMessage) this.instance).clearMessage();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((ChatMessage) this.instance).setMessageBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public boolean getDeleted() {
                return ((ChatMessage) this.instance).getDeleted();
            }

            public Builder setDeleted(boolean z) {
                copyOnWrite();
                ((ChatMessage) this.instance).setDeleted(z);
                return this;
            }

            public Builder clearDeleted() {
                copyOnWrite();
                ((ChatMessage) this.instance).clearDeleted();
                return this;
            }

            @Override // livekit.LivekitModels.ChatMessageOrBuilder
            public boolean getGenerated() {
                return ((ChatMessage) this.instance).getGenerated();
            }

            public Builder setGenerated(boolean z) {
                copyOnWrite();
                ((ChatMessage) this.instance).setGenerated(z);
                return this;
            }

            public Builder clearGenerated() {
                copyOnWrite();
                ((ChatMessage) this.instance).clearGenerated();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဂ\u0000\u0004Ȉ\u0005\u0007\u0006\u0007", new Object[]{"bitField0_", "id_", "timestamp_", "editTimestamp_", "message_", "deleted_", "generated_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ChatMessage> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ChatMessage.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ChatMessage chatMessage = new ChatMessage();
            DEFAULT_INSTANCE = chatMessage;
            GeneratedMessageLite.registerDefaultInstance(ChatMessage.class, chatMessage);
        }

        public static ChatMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ChatMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RpcRequest extends GeneratedMessageLite<RpcRequest, Builder> implements RpcRequestOrBuilder {
        private static final RpcRequest DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile Parser<RpcRequest> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 3;
        public static final int RESPONSE_TIMEOUT_MS_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 5;
        private String id_ = "";
        private String method_ = "";
        private String payload_ = "";
        private int responseTimeoutMs_;
        private int version_;

        private RpcRequest() {
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public String getMethod() {
            return this.method_;
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public ByteString getMethodBytes() {
            return ByteString.copyFromUtf8(this.method_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethod(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = getDefaultInstance().getMethod();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethodBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.method_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public String getPayload() {
            return this.payload_;
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public ByteString getPayloadBytes() {
            return ByteString.copyFromUtf8(this.payload_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(String str) {
            str.getClass();
            this.payload_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayloadBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.payload_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public int getResponseTimeoutMs() {
            return this.responseTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponseTimeoutMs(int i) {
            this.responseTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponseTimeoutMs() {
            this.responseTimeoutMs_ = 0;
        }

        @Override // livekit.LivekitModels.RpcRequestOrBuilder
        public int getVersion() {
            return this.version_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static RpcRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RpcRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RpcRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RpcRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RpcRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RpcRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RpcRequest parseFrom(InputStream inputStream) throws IOException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RpcRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RpcRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RpcRequest rpcRequest) {
            return DEFAULT_INSTANCE.createBuilder(rpcRequest);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RpcRequest, Builder> implements RpcRequestOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RpcRequest.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public String getId() {
                return ((RpcRequest) this.instance).getId();
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public ByteString getIdBytes() {
                return ((RpcRequest) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((RpcRequest) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((RpcRequest) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcRequest) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public String getMethod() {
                return ((RpcRequest) this.instance).getMethod();
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public ByteString getMethodBytes() {
                return ((RpcRequest) this.instance).getMethodBytes();
            }

            public Builder setMethod(String str) {
                copyOnWrite();
                ((RpcRequest) this.instance).setMethod(str);
                return this;
            }

            public Builder clearMethod() {
                copyOnWrite();
                ((RpcRequest) this.instance).clearMethod();
                return this;
            }

            public Builder setMethodBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcRequest) this.instance).setMethodBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public String getPayload() {
                return ((RpcRequest) this.instance).getPayload();
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public ByteString getPayloadBytes() {
                return ((RpcRequest) this.instance).getPayloadBytes();
            }

            public Builder setPayload(String str) {
                copyOnWrite();
                ((RpcRequest) this.instance).setPayload(str);
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((RpcRequest) this.instance).clearPayload();
                return this;
            }

            public Builder setPayloadBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcRequest) this.instance).setPayloadBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public int getResponseTimeoutMs() {
                return ((RpcRequest) this.instance).getResponseTimeoutMs();
            }

            public Builder setResponseTimeoutMs(int i) {
                copyOnWrite();
                ((RpcRequest) this.instance).setResponseTimeoutMs(i);
                return this;
            }

            public Builder clearResponseTimeoutMs() {
                copyOnWrite();
                ((RpcRequest) this.instance).clearResponseTimeoutMs();
                return this;
            }

            @Override // livekit.LivekitModels.RpcRequestOrBuilder
            public int getVersion() {
                return ((RpcRequest) this.instance).getVersion();
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((RpcRequest) this.instance).setVersion(i);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((RpcRequest) this.instance).clearVersion();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RpcRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005\u000b", new Object[]{"id_", "method_", "payload_", "responseTimeoutMs_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RpcRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RpcRequest.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RpcRequest rpcRequest = new RpcRequest();
            DEFAULT_INSTANCE = rpcRequest;
            GeneratedMessageLite.registerDefaultInstance(RpcRequest.class, rpcRequest);
        }

        public static RpcRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RpcRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RpcAck extends GeneratedMessageLite<RpcAck, Builder> implements RpcAckOrBuilder {
        private static final RpcAck DEFAULT_INSTANCE;
        private static volatile Parser<RpcAck> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 1;
        private String requestId_ = "";

        private RpcAck() {
        }

        @Override // livekit.LivekitModels.RpcAckOrBuilder
        public String getRequestId() {
            return this.requestId_;
        }

        @Override // livekit.LivekitModels.RpcAckOrBuilder
        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(String str) {
            str.getClass();
            this.requestId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        public static RpcAck parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RpcAck parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RpcAck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RpcAck parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RpcAck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RpcAck parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RpcAck parseFrom(InputStream inputStream) throws IOException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcAck parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcAck parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RpcAck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcAck parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcAck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcAck parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RpcAck parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RpcAck rpcAck) {
            return DEFAULT_INSTANCE.createBuilder(rpcAck);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RpcAck, Builder> implements RpcAckOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RpcAck.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RpcAckOrBuilder
            public String getRequestId() {
                return ((RpcAck) this.instance).getRequestId();
            }

            @Override // livekit.LivekitModels.RpcAckOrBuilder
            public ByteString getRequestIdBytes() {
                return ((RpcAck) this.instance).getRequestIdBytes();
            }

            public Builder setRequestId(String str) {
                copyOnWrite();
                ((RpcAck) this.instance).setRequestId(str);
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((RpcAck) this.instance).clearRequestId();
                return this;
            }

            public Builder setRequestIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcAck) this.instance).setRequestIdBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RpcAck();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"requestId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RpcAck> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RpcAck.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RpcAck rpcAck = new RpcAck();
            DEFAULT_INSTANCE = rpcAck;
            GeneratedMessageLite.registerDefaultInstance(RpcAck.class, rpcAck);
        }

        public static RpcAck getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RpcAck> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RpcResponse extends GeneratedMessageLite<RpcResponse, Builder> implements RpcResponseOrBuilder {
        private static final RpcResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        private static volatile Parser<RpcResponse> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int REQUEST_ID_FIELD_NUMBER = 1;
        private Object value_;
        private int valueCase_ = 0;
        private String requestId_ = "";

        private RpcResponse() {
        }

        public enum ValueCase {
            PAYLOAD(2),
            ERROR(3),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 2) {
                    return PAYLOAD;
                }
                if (i != 3) {
                    return null;
                }
                return ERROR;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public String getRequestId() {
            return this.requestId_;
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(String str) {
            str.getClass();
            this.requestId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public boolean hasPayload() {
            return this.valueCase_ == 2;
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public String getPayload() {
            if (this.valueCase_ == 2) {
                return (String) this.value_;
            }
            return "";
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public ByteString getPayloadBytes() {
            String str;
            if (this.valueCase_ != 2) {
                str = "";
            } else {
                str = (String) this.value_;
            }
            return ByteString.copyFromUtf8(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(String str) {
            str.getClass();
            this.valueCase_ = 2;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayloadBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
            this.valueCase_ = 2;
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public boolean hasError() {
            return this.valueCase_ == 3;
        }

        @Override // livekit.LivekitModels.RpcResponseOrBuilder
        public RpcError getError() {
            if (this.valueCase_ == 3) {
                return (RpcError) this.value_;
            }
            return RpcError.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(RpcError rpcError) {
            rpcError.getClass();
            this.value_ = rpcError;
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(RpcError rpcError) {
            rpcError.getClass();
            if (this.valueCase_ == 3 && this.value_ != RpcError.getDefaultInstance()) {
                this.value_ = RpcError.newBuilder((RpcError) this.value_).mergeFrom((RpcError.Builder) rpcError).buildPartial();
            } else {
                this.value_ = rpcError;
            }
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public static RpcResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RpcResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RpcResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RpcResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RpcResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RpcResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RpcResponse parseFrom(InputStream inputStream) throws IOException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RpcResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RpcResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RpcResponse rpcResponse) {
            return DEFAULT_INSTANCE.createBuilder(rpcResponse);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RpcResponse, Builder> implements RpcResponseOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RpcResponse.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public ValueCase getValueCase() {
                return ((RpcResponse) this.instance).getValueCase();
            }

            public Builder clearValue() {
                copyOnWrite();
                ((RpcResponse) this.instance).clearValue();
                return this;
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public String getRequestId() {
                return ((RpcResponse) this.instance).getRequestId();
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public ByteString getRequestIdBytes() {
                return ((RpcResponse) this.instance).getRequestIdBytes();
            }

            public Builder setRequestId(String str) {
                copyOnWrite();
                ((RpcResponse) this.instance).setRequestId(str);
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((RpcResponse) this.instance).clearRequestId();
                return this;
            }

            public Builder setRequestIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcResponse) this.instance).setRequestIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public boolean hasPayload() {
                return ((RpcResponse) this.instance).hasPayload();
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public String getPayload() {
                return ((RpcResponse) this.instance).getPayload();
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public ByteString getPayloadBytes() {
                return ((RpcResponse) this.instance).getPayloadBytes();
            }

            public Builder setPayload(String str) {
                copyOnWrite();
                ((RpcResponse) this.instance).setPayload(str);
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((RpcResponse) this.instance).clearPayload();
                return this;
            }

            public Builder setPayloadBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcResponse) this.instance).setPayloadBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public boolean hasError() {
                return ((RpcResponse) this.instance).hasError();
            }

            @Override // livekit.LivekitModels.RpcResponseOrBuilder
            public RpcError getError() {
                return ((RpcResponse) this.instance).getError();
            }

            public Builder setError(RpcError rpcError) {
                copyOnWrite();
                ((RpcResponse) this.instance).setError(rpcError);
                return this;
            }

            public Builder setError(RpcError.Builder builder) {
                copyOnWrite();
                ((RpcResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder mergeError(RpcError rpcError) {
                copyOnWrite();
                ((RpcResponse) this.instance).mergeError(rpcError);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((RpcResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RpcResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003<\u0000", new Object[]{"value_", "valueCase_", "requestId_", RpcError.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RpcResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RpcResponse.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RpcResponse rpcResponse = new RpcResponse();
            DEFAULT_INSTANCE = rpcResponse;
            GeneratedMessageLite.registerDefaultInstance(RpcResponse.class, rpcResponse);
        }

        public static RpcResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RpcResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RpcError extends GeneratedMessageLite<RpcError, Builder> implements RpcErrorOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 3;
        private static final RpcError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser<RpcError> PARSER;
        private int code_;
        private String message_ = "";
        private String data_ = "";

        private RpcError() {
        }

        @Override // livekit.LivekitModels.RpcErrorOrBuilder
        public int getCode() {
            return this.code_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        @Override // livekit.LivekitModels.RpcErrorOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // livekit.LivekitModels.RpcErrorOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.RpcErrorOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // livekit.LivekitModels.RpcErrorOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
        }

        public static RpcError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RpcError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RpcError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RpcError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RpcError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RpcError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RpcError parseFrom(InputStream inputStream) throws IOException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RpcError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RpcError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RpcError parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RpcError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RpcError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RpcError rpcError) {
            return DEFAULT_INSTANCE.createBuilder(rpcError);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RpcError, Builder> implements RpcErrorOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RpcError.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RpcErrorOrBuilder
            public int getCode() {
                return ((RpcError) this.instance).getCode();
            }

            public Builder setCode(int i) {
                copyOnWrite();
                ((RpcError) this.instance).setCode(i);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((RpcError) this.instance).clearCode();
                return this;
            }

            @Override // livekit.LivekitModels.RpcErrorOrBuilder
            public String getMessage() {
                return ((RpcError) this.instance).getMessage();
            }

            @Override // livekit.LivekitModels.RpcErrorOrBuilder
            public ByteString getMessageBytes() {
                return ((RpcError) this.instance).getMessageBytes();
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((RpcError) this.instance).setMessage(str);
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((RpcError) this.instance).clearMessage();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcError) this.instance).setMessageBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.RpcErrorOrBuilder
            public String getData() {
                return ((RpcError) this.instance).getData();
            }

            @Override // livekit.LivekitModels.RpcErrorOrBuilder
            public ByteString getDataBytes() {
                return ((RpcError) this.instance).getDataBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((RpcError) this.instance).setData(str);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((RpcError) this.instance).clearData();
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((RpcError) this.instance).setDataBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RpcError();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ", new Object[]{"code_", "message_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RpcError> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RpcError.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RpcError rpcError = new RpcError();
            DEFAULT_INSTANCE = rpcError;
            GeneratedMessageLite.registerDefaultInstance(RpcError.class, rpcError);
        }

        public static RpcError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RpcError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ParticipantTracks extends GeneratedMessageLite<ParticipantTracks, Builder> implements ParticipantTracksOrBuilder {
        private static final ParticipantTracks DEFAULT_INSTANCE;
        private static volatile Parser<ParticipantTracks> PARSER = null;
        public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
        public static final int TRACK_SIDS_FIELD_NUMBER = 2;
        private String participantSid_ = "";
        private Internal.ProtobufList<String> trackSids_ = GeneratedMessageLite.emptyProtobufList();

        private ParticipantTracks() {
        }

        @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
        public String getParticipantSid() {
            return this.participantSid_;
        }

        @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
        public ByteString getParticipantSidBytes() {
            return ByteString.copyFromUtf8(this.participantSid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantSid(String str) {
            str.getClass();
            this.participantSid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParticipantSid() {
            this.participantSid_ = getDefaultInstance().getParticipantSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantSidBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.participantSid_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
        public List<String> getTrackSidsList() {
            return this.trackSids_;
        }

        @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
        public int getTrackSidsCount() {
            return this.trackSids_.size();
        }

        @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
        public String getTrackSids(int i) {
            return this.trackSids_.get(i);
        }

        @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
        public ByteString getTrackSidsBytes(int i) {
            return ByteString.copyFromUtf8(this.trackSids_.get(i));
        }

        private void ensureTrackSidsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.trackSids_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.trackSids_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackSids(int i, String str) {
            str.getClass();
            ensureTrackSidsIsMutable();
            this.trackSids_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrackSids(String str) {
            str.getClass();
            ensureTrackSidsIsMutable();
            this.trackSids_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrackSids(Iterable<String> iterable) {
            ensureTrackSidsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.trackSids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackSids() {
            this.trackSids_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrackSidsBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureTrackSidsIsMutable();
            this.trackSids_.add(byteString.toStringUtf8());
        }

        public static ParticipantTracks parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ParticipantTracks parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ParticipantTracks parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ParticipantTracks parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ParticipantTracks parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ParticipantTracks parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ParticipantTracks parseFrom(InputStream inputStream) throws IOException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParticipantTracks parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParticipantTracks parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ParticipantTracks) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParticipantTracks parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantTracks) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParticipantTracks parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ParticipantTracks parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParticipantTracks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ParticipantTracks participantTracks) {
            return DEFAULT_INSTANCE.createBuilder(participantTracks);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ParticipantTracks, Builder> implements ParticipantTracksOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ParticipantTracks.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
            public String getParticipantSid() {
                return ((ParticipantTracks) this.instance).getParticipantSid();
            }

            @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
            public ByteString getParticipantSidBytes() {
                return ((ParticipantTracks) this.instance).getParticipantSidBytes();
            }

            public Builder setParticipantSid(String str) {
                copyOnWrite();
                ((ParticipantTracks) this.instance).setParticipantSid(str);
                return this;
            }

            public Builder clearParticipantSid() {
                copyOnWrite();
                ((ParticipantTracks) this.instance).clearParticipantSid();
                return this;
            }

            public Builder setParticipantSidBytes(ByteString byteString) {
                copyOnWrite();
                ((ParticipantTracks) this.instance).setParticipantSidBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
            public List<String> getTrackSidsList() {
                return Collections.unmodifiableList(((ParticipantTracks) this.instance).getTrackSidsList());
            }

            @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
            public int getTrackSidsCount() {
                return ((ParticipantTracks) this.instance).getTrackSidsCount();
            }

            @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
            public String getTrackSids(int i) {
                return ((ParticipantTracks) this.instance).getTrackSids(i);
            }

            @Override // livekit.LivekitModels.ParticipantTracksOrBuilder
            public ByteString getTrackSidsBytes(int i) {
                return ((ParticipantTracks) this.instance).getTrackSidsBytes(i);
            }

            public Builder setTrackSids(int i, String str) {
                copyOnWrite();
                ((ParticipantTracks) this.instance).setTrackSids(i, str);
                return this;
            }

            public Builder addTrackSids(String str) {
                copyOnWrite();
                ((ParticipantTracks) this.instance).addTrackSids(str);
                return this;
            }

            public Builder addAllTrackSids(Iterable<String> iterable) {
                copyOnWrite();
                ((ParticipantTracks) this.instance).addAllTrackSids(iterable);
                return this;
            }

            public Builder clearTrackSids() {
                copyOnWrite();
                ((ParticipantTracks) this.instance).clearTrackSids();
                return this;
            }

            public Builder addTrackSidsBytes(ByteString byteString) {
                copyOnWrite();
                ((ParticipantTracks) this.instance).addTrackSidsBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ParticipantTracks();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"participantSid_", "trackSids_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ParticipantTracks> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ParticipantTracks.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ParticipantTracks participantTracks = new ParticipantTracks();
            DEFAULT_INSTANCE = participantTracks;
            GeneratedMessageLite.registerDefaultInstance(ParticipantTracks.class, participantTracks);
        }

        public static ParticipantTracks getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ParticipantTracks> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ServerInfo extends GeneratedMessageLite<ServerInfo, Builder> implements ServerInfoOrBuilder {
        public static final int AGENT_PROTOCOL_FIELD_NUMBER = 7;
        public static final int DEBUG_INFO_FIELD_NUMBER = 6;
        private static final ServerInfo DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 1;
        public static final int NODE_ID_FIELD_NUMBER = 5;
        private static volatile Parser<ServerInfo> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int REGION_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int agentProtocol_;
        private int edition_;
        private int protocol_;
        private String version_ = "";
        private String region_ = "";
        private String nodeId_ = "";
        private String debugInfo_ = "";

        private ServerInfo() {
        }

        public enum Edition implements Internal.EnumLite {
            Standard(0),
            Cloud(1),
            UNRECOGNIZED(-1);

            public static final int Cloud_VALUE = 1;
            public static final int Standard_VALUE = 0;
            private static final Internal.EnumLiteMap<Edition> internalValueMap = new Internal.EnumLiteMap<Edition>() { // from class: livekit.LivekitModels.ServerInfo.Edition.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Edition findValueByNumber(int i) {
                    return Edition.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Edition valueOf(int i) {
                return forNumber(i);
            }

            public static Edition forNumber(int i) {
                if (i == 0) {
                    return Standard;
                }
                if (i != 1) {
                    return null;
                }
                return Cloud;
            }

            public static Internal.EnumLiteMap<Edition> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return EditionVerifier.INSTANCE;
            }

            private static final class EditionVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new EditionVerifier();

                private EditionVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Edition.forNumber(i) != null;
                }
            }

            Edition(int i) {
                this.value = i;
            }
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public int getEditionValue() {
            return this.edition_;
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public Edition getEdition() {
            Edition forNumber = Edition.forNumber(this.edition_);
            return forNumber == null ? Edition.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionValue(int i) {
            this.edition_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEdition(Edition edition) {
            this.edition_ = edition.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEdition() {
            this.edition_ = 0;
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public int getProtocol() {
            return this.protocol_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocol(int i) {
            this.protocol_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = 0;
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public String getRegion() {
            return this.region_;
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public ByteString getRegionBytes() {
            return ByteString.copyFromUtf8(this.region_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegion(String str) {
            str.getClass();
            this.region_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegion() {
            this.region_ = getDefaultInstance().getRegion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.region_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public String getNodeId() {
            return this.nodeId_;
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public ByteString getNodeIdBytes() {
            return ByteString.copyFromUtf8(this.nodeId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodeId(String str) {
            str.getClass();
            this.nodeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNodeId() {
            this.nodeId_ = getDefaultInstance().getNodeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodeIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.nodeId_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public String getDebugInfo() {
            return this.debugInfo_;
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public ByteString getDebugInfoBytes() {
            return ByteString.copyFromUtf8(this.debugInfo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugInfo(String str) {
            str.getClass();
            this.debugInfo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugInfo() {
            this.debugInfo_ = getDefaultInstance().getDebugInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugInfoBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.debugInfo_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ServerInfoOrBuilder
        public int getAgentProtocol() {
            return this.agentProtocol_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgentProtocol(int i) {
            this.agentProtocol_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAgentProtocol() {
            this.agentProtocol_ = 0;
        }

        public static ServerInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ServerInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ServerInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ServerInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ServerInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServerInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ServerInfo parseFrom(InputStream inputStream) throws IOException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServerInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServerInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServerInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ServerInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ServerInfo serverInfo) {
            return DEFAULT_INSTANCE.createBuilder(serverInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ServerInfo, Builder> implements ServerInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ServerInfo.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public int getEditionValue() {
                return ((ServerInfo) this.instance).getEditionValue();
            }

            public Builder setEditionValue(int i) {
                copyOnWrite();
                ((ServerInfo) this.instance).setEditionValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public Edition getEdition() {
                return ((ServerInfo) this.instance).getEdition();
            }

            public Builder setEdition(Edition edition) {
                copyOnWrite();
                ((ServerInfo) this.instance).setEdition(edition);
                return this;
            }

            public Builder clearEdition() {
                copyOnWrite();
                ((ServerInfo) this.instance).clearEdition();
                return this;
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public String getVersion() {
                return ((ServerInfo) this.instance).getVersion();
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public ByteString getVersionBytes() {
                return ((ServerInfo) this.instance).getVersionBytes();
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((ServerInfo) this.instance).setVersion(str);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((ServerInfo) this.instance).clearVersion();
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((ServerInfo) this.instance).setVersionBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public int getProtocol() {
                return ((ServerInfo) this.instance).getProtocol();
            }

            public Builder setProtocol(int i) {
                copyOnWrite();
                ((ServerInfo) this.instance).setProtocol(i);
                return this;
            }

            public Builder clearProtocol() {
                copyOnWrite();
                ((ServerInfo) this.instance).clearProtocol();
                return this;
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public String getRegion() {
                return ((ServerInfo) this.instance).getRegion();
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public ByteString getRegionBytes() {
                return ((ServerInfo) this.instance).getRegionBytes();
            }

            public Builder setRegion(String str) {
                copyOnWrite();
                ((ServerInfo) this.instance).setRegion(str);
                return this;
            }

            public Builder clearRegion() {
                copyOnWrite();
                ((ServerInfo) this.instance).clearRegion();
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                copyOnWrite();
                ((ServerInfo) this.instance).setRegionBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public String getNodeId() {
                return ((ServerInfo) this.instance).getNodeId();
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public ByteString getNodeIdBytes() {
                return ((ServerInfo) this.instance).getNodeIdBytes();
            }

            public Builder setNodeId(String str) {
                copyOnWrite();
                ((ServerInfo) this.instance).setNodeId(str);
                return this;
            }

            public Builder clearNodeId() {
                copyOnWrite();
                ((ServerInfo) this.instance).clearNodeId();
                return this;
            }

            public Builder setNodeIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ServerInfo) this.instance).setNodeIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public String getDebugInfo() {
                return ((ServerInfo) this.instance).getDebugInfo();
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public ByteString getDebugInfoBytes() {
                return ((ServerInfo) this.instance).getDebugInfoBytes();
            }

            public Builder setDebugInfo(String str) {
                copyOnWrite();
                ((ServerInfo) this.instance).setDebugInfo(str);
                return this;
            }

            public Builder clearDebugInfo() {
                copyOnWrite();
                ((ServerInfo) this.instance).clearDebugInfo();
                return this;
            }

            public Builder setDebugInfoBytes(ByteString byteString) {
                copyOnWrite();
                ((ServerInfo) this.instance).setDebugInfoBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ServerInfoOrBuilder
            public int getAgentProtocol() {
                return ((ServerInfo) this.instance).getAgentProtocol();
            }

            public Builder setAgentProtocol(int i) {
                copyOnWrite();
                ((ServerInfo) this.instance).setAgentProtocol(i);
                return this;
            }

            public Builder clearAgentProtocol() {
                copyOnWrite();
                ((ServerInfo) this.instance).clearAgentProtocol();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServerInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"edition_", "version_", "protocol_", "region_", "nodeId_", "debugInfo_", "agentProtocol_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ServerInfo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ServerInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ServerInfo serverInfo = new ServerInfo();
            DEFAULT_INSTANCE = serverInfo;
            GeneratedMessageLite.registerDefaultInstance(ServerInfo.class, serverInfo);
        }

        public static ServerInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ServerInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ClientInfo extends GeneratedMessageLite<ClientInfo, Builder> implements ClientInfoOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 9;
        public static final int BROWSER_FIELD_NUMBER = 7;
        public static final int BROWSER_VERSION_FIELD_NUMBER = 8;
        private static final ClientInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 6;
        public static final int NETWORK_FIELD_NUMBER = 10;
        public static final int OS_FIELD_NUMBER = 4;
        public static final int OS_VERSION_FIELD_NUMBER = 5;
        public static final int OTHER_SDKS_FIELD_NUMBER = 11;
        private static volatile Parser<ClientInfo> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SDK_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int protocol_;
        private int sdk_;
        private String version_ = "";
        private String os_ = "";
        private String osVersion_ = "";
        private String deviceModel_ = "";
        private String browser_ = "";
        private String browserVersion_ = "";
        private String address_ = "";
        private String network_ = "";
        private String otherSdks_ = "";

        private ClientInfo() {
        }

        public enum SDK implements Internal.EnumLite {
            UNKNOWN(0),
            JS(1),
            SWIFT(2),
            ANDROID(3),
            FLUTTER(4),
            GO(5),
            UNITY(6),
            REACT_NATIVE(7),
            RUST(8),
            PYTHON(9),
            CPP(10),
            UNITY_WEB(11),
            NODE(12),
            UNREAL(13),
            ESP32(14),
            UNRECOGNIZED(-1);

            public static final int ANDROID_VALUE = 3;
            public static final int CPP_VALUE = 10;
            public static final int ESP32_VALUE = 14;
            public static final int FLUTTER_VALUE = 4;
            public static final int GO_VALUE = 5;
            public static final int JS_VALUE = 1;
            public static final int NODE_VALUE = 12;
            public static final int PYTHON_VALUE = 9;
            public static final int REACT_NATIVE_VALUE = 7;
            public static final int RUST_VALUE = 8;
            public static final int SWIFT_VALUE = 2;
            public static final int UNITY_VALUE = 6;
            public static final int UNITY_WEB_VALUE = 11;
            public static final int UNKNOWN_VALUE = 0;
            public static final int UNREAL_VALUE = 13;
            private static final Internal.EnumLiteMap<SDK> internalValueMap = new Internal.EnumLiteMap<SDK>() { // from class: livekit.LivekitModels.ClientInfo.SDK.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SDK findValueByNumber(int i) {
                    return SDK.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static SDK valueOf(int i) {
                return forNumber(i);
            }

            public static SDK forNumber(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return JS;
                    case 2:
                        return SWIFT;
                    case 3:
                        return ANDROID;
                    case 4:
                        return FLUTTER;
                    case 5:
                        return GO;
                    case 6:
                        return UNITY;
                    case 7:
                        return REACT_NATIVE;
                    case 8:
                        return RUST;
                    case 9:
                        return PYTHON;
                    case 10:
                        return CPP;
                    case 11:
                        return UNITY_WEB;
                    case 12:
                        return NODE;
                    case 13:
                        return UNREAL;
                    case 14:
                        return ESP32;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<SDK> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return SDKVerifier.INSTANCE;
            }

            private static final class SDKVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new SDKVerifier();

                private SDKVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return SDK.forNumber(i) != null;
                }
            }

            SDK(int i) {
                this.value = i;
            }
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public int getSdkValue() {
            return this.sdk_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public SDK getSdk() {
            SDK forNumber = SDK.forNumber(this.sdk_);
            return forNumber == null ? SDK.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkValue(int i) {
            this.sdk_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdk(SDK sdk) {
            this.sdk_ = sdk.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdk() {
            this.sdk_ = 0;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public int getProtocol() {
            return this.protocol_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocol(int i) {
            this.protocol_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = 0;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getOs() {
            return this.os_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.os_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getBrowser() {
            return this.browser_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getBrowserBytes() {
            return ByteString.copyFromUtf8(this.browser_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowser(String str) {
            str.getClass();
            this.browser_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrowser() {
            this.browser_ = getDefaultInstance().getBrowser();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowserBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.browser_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getBrowserVersion() {
            return this.browserVersion_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getBrowserVersionBytes() {
            return ByteString.copyFromUtf8(this.browserVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowserVersion(String str) {
            str.getClass();
            this.browserVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrowserVersion() {
            this.browserVersion_ = getDefaultInstance().getBrowserVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowserVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.browserVersion_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.address_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getNetwork() {
            return this.network_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getNetworkBytes() {
            return ByteString.copyFromUtf8(this.network_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetwork(String str) {
            str.getClass();
            this.network_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetwork() {
            this.network_ = getDefaultInstance().getNetwork();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.network_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public String getOtherSdks() {
            return this.otherSdks_;
        }

        @Override // livekit.LivekitModels.ClientInfoOrBuilder
        public ByteString getOtherSdksBytes() {
            return ByteString.copyFromUtf8(this.otherSdks_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherSdks(String str) {
            str.getClass();
            this.otherSdks_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherSdks() {
            this.otherSdks_ = getDefaultInstance().getOtherSdks();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherSdksBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.otherSdks_ = byteString.toStringUtf8();
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(InputStream inputStream) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ClientInfo clientInfo) {
            return DEFAULT_INSTANCE.createBuilder(clientInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ClientInfo, Builder> implements ClientInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ClientInfo.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public int getSdkValue() {
                return ((ClientInfo) this.instance).getSdkValue();
            }

            public Builder setSdkValue(int i) {
                copyOnWrite();
                ((ClientInfo) this.instance).setSdkValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public SDK getSdk() {
                return ((ClientInfo) this.instance).getSdk();
            }

            public Builder setSdk(SDK sdk) {
                copyOnWrite();
                ((ClientInfo) this.instance).setSdk(sdk);
                return this;
            }

            public Builder clearSdk() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearSdk();
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getVersion() {
                return ((ClientInfo) this.instance).getVersion();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getVersionBytes() {
                return ((ClientInfo) this.instance).getVersionBytes();
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setVersion(str);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearVersion();
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setVersionBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public int getProtocol() {
                return ((ClientInfo) this.instance).getProtocol();
            }

            public Builder setProtocol(int i) {
                copyOnWrite();
                ((ClientInfo) this.instance).setProtocol(i);
                return this;
            }

            public Builder clearProtocol() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearProtocol();
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getOs() {
                return ((ClientInfo) this.instance).getOs();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getOsBytes() {
                return ((ClientInfo) this.instance).getOsBytes();
            }

            public Builder setOs(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setOs(str);
                return this;
            }

            public Builder clearOs() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearOs();
                return this;
            }

            public Builder setOsBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setOsBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getOsVersion() {
                return ((ClientInfo) this.instance).getOsVersion();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getOsVersionBytes() {
                return ((ClientInfo) this.instance).getOsVersionBytes();
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setOsVersion(str);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearOsVersion();
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getDeviceModel() {
                return ((ClientInfo) this.instance).getDeviceModel();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((ClientInfo) this.instance).getDeviceModelBytes();
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearDeviceModel();
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getBrowser() {
                return ((ClientInfo) this.instance).getBrowser();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getBrowserBytes() {
                return ((ClientInfo) this.instance).getBrowserBytes();
            }

            public Builder setBrowser(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setBrowser(str);
                return this;
            }

            public Builder clearBrowser() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearBrowser();
                return this;
            }

            public Builder setBrowserBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setBrowserBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getBrowserVersion() {
                return ((ClientInfo) this.instance).getBrowserVersion();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getBrowserVersionBytes() {
                return ((ClientInfo) this.instance).getBrowserVersionBytes();
            }

            public Builder setBrowserVersion(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setBrowserVersion(str);
                return this;
            }

            public Builder clearBrowserVersion() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearBrowserVersion();
                return this;
            }

            public Builder setBrowserVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setBrowserVersionBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getAddress() {
                return ((ClientInfo) this.instance).getAddress();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getAddressBytes() {
                return ((ClientInfo) this.instance).getAddressBytes();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setAddress(str);
                return this;
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearAddress();
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setAddressBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getNetwork() {
                return ((ClientInfo) this.instance).getNetwork();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getNetworkBytes() {
                return ((ClientInfo) this.instance).getNetworkBytes();
            }

            public Builder setNetwork(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setNetwork(str);
                return this;
            }

            public Builder clearNetwork() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearNetwork();
                return this;
            }

            public Builder setNetworkBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setNetworkBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public String getOtherSdks() {
                return ((ClientInfo) this.instance).getOtherSdks();
            }

            @Override // livekit.LivekitModels.ClientInfoOrBuilder
            public ByteString getOtherSdksBytes() {
                return ((ClientInfo) this.instance).getOtherSdksBytes();
            }

            public Builder setOtherSdks(String str) {
                copyOnWrite();
                ((ClientInfo) this.instance).setOtherSdks(str);
                return this;
            }

            public Builder clearOtherSdks() {
                copyOnWrite();
                ((ClientInfo) this.instance).clearOtherSdks();
                return this;
            }

            public Builder setOtherSdksBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientInfo) this.instance).setOtherSdksBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ", new Object[]{"sdk_", "version_", "protocol_", "os_", "osVersion_", "deviceModel_", "browser_", "browserVersion_", "address_", "network_", "otherSdks_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientInfo> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ClientInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ClientInfo clientInfo = new ClientInfo();
            DEFAULT_INSTANCE = clientInfo;
            GeneratedMessageLite.registerDefaultInstance(ClientInfo.class, clientInfo);
        }

        public static ClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ClientInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ClientConfiguration extends GeneratedMessageLite<ClientConfiguration, Builder> implements ClientConfigurationOrBuilder {
        private static final ClientConfiguration DEFAULT_INSTANCE;
        public static final int DISABLED_CODECS_FIELD_NUMBER = 4;
        public static final int FORCE_RELAY_FIELD_NUMBER = 5;
        private static volatile Parser<ClientConfiguration> PARSER = null;
        public static final int RESUME_CONNECTION_FIELD_NUMBER = 3;
        public static final int SCREEN_FIELD_NUMBER = 2;
        public static final int VIDEO_FIELD_NUMBER = 1;
        private DisabledCodecs disabledCodecs_;
        private int forceRelay_;
        private int resumeConnection_;
        private VideoConfiguration screen_;
        private VideoConfiguration video_;

        private ClientConfiguration() {
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public boolean hasVideo() {
            return this.video_ != null;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public VideoConfiguration getVideo() {
            VideoConfiguration videoConfiguration = this.video_;
            return videoConfiguration == null ? VideoConfiguration.getDefaultInstance() : videoConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideo(VideoConfiguration videoConfiguration) {
            videoConfiguration.getClass();
            this.video_ = videoConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVideo(VideoConfiguration videoConfiguration) {
            videoConfiguration.getClass();
            VideoConfiguration videoConfiguration2 = this.video_;
            if (videoConfiguration2 != null && videoConfiguration2 != VideoConfiguration.getDefaultInstance()) {
                this.video_ = VideoConfiguration.newBuilder(this.video_).mergeFrom((VideoConfiguration.Builder) videoConfiguration).buildPartial();
            } else {
                this.video_ = videoConfiguration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideo() {
            this.video_ = null;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public boolean hasScreen() {
            return this.screen_ != null;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public VideoConfiguration getScreen() {
            VideoConfiguration videoConfiguration = this.screen_;
            return videoConfiguration == null ? VideoConfiguration.getDefaultInstance() : videoConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreen(VideoConfiguration videoConfiguration) {
            videoConfiguration.getClass();
            this.screen_ = videoConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeScreen(VideoConfiguration videoConfiguration) {
            videoConfiguration.getClass();
            VideoConfiguration videoConfiguration2 = this.screen_;
            if (videoConfiguration2 != null && videoConfiguration2 != VideoConfiguration.getDefaultInstance()) {
                this.screen_ = VideoConfiguration.newBuilder(this.screen_).mergeFrom((VideoConfiguration.Builder) videoConfiguration).buildPartial();
            } else {
                this.screen_ = videoConfiguration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreen() {
            this.screen_ = null;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public int getResumeConnectionValue() {
            return this.resumeConnection_;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public ClientConfigSetting getResumeConnection() {
            ClientConfigSetting forNumber = ClientConfigSetting.forNumber(this.resumeConnection_);
            return forNumber == null ? ClientConfigSetting.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResumeConnectionValue(int i) {
            this.resumeConnection_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResumeConnection(ClientConfigSetting clientConfigSetting) {
            this.resumeConnection_ = clientConfigSetting.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResumeConnection() {
            this.resumeConnection_ = 0;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public boolean hasDisabledCodecs() {
            return this.disabledCodecs_ != null;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public DisabledCodecs getDisabledCodecs() {
            DisabledCodecs disabledCodecs = this.disabledCodecs_;
            return disabledCodecs == null ? DisabledCodecs.getDefaultInstance() : disabledCodecs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisabledCodecs(DisabledCodecs disabledCodecs) {
            disabledCodecs.getClass();
            this.disabledCodecs_ = disabledCodecs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDisabledCodecs(DisabledCodecs disabledCodecs) {
            disabledCodecs.getClass();
            DisabledCodecs disabledCodecs2 = this.disabledCodecs_;
            if (disabledCodecs2 != null && disabledCodecs2 != DisabledCodecs.getDefaultInstance()) {
                this.disabledCodecs_ = DisabledCodecs.newBuilder(this.disabledCodecs_).mergeFrom((DisabledCodecs.Builder) disabledCodecs).buildPartial();
            } else {
                this.disabledCodecs_ = disabledCodecs;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisabledCodecs() {
            this.disabledCodecs_ = null;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public int getForceRelayValue() {
            return this.forceRelay_;
        }

        @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
        public ClientConfigSetting getForceRelay() {
            ClientConfigSetting forNumber = ClientConfigSetting.forNumber(this.forceRelay_);
            return forNumber == null ? ClientConfigSetting.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceRelayValue(int i) {
            this.forceRelay_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForceRelay(ClientConfigSetting clientConfigSetting) {
            this.forceRelay_ = clientConfigSetting.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForceRelay() {
            this.forceRelay_ = 0;
        }

        public static ClientConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ClientConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ClientConfiguration clientConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(clientConfiguration);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ClientConfiguration, Builder> implements ClientConfigurationOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ClientConfiguration.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public boolean hasVideo() {
                return ((ClientConfiguration) this.instance).hasVideo();
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public VideoConfiguration getVideo() {
                return ((ClientConfiguration) this.instance).getVideo();
            }

            public Builder setVideo(VideoConfiguration videoConfiguration) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setVideo(videoConfiguration);
                return this;
            }

            public Builder setVideo(VideoConfiguration.Builder builder) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setVideo(builder.build());
                return this;
            }

            public Builder mergeVideo(VideoConfiguration videoConfiguration) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).mergeVideo(videoConfiguration);
                return this;
            }

            public Builder clearVideo() {
                copyOnWrite();
                ((ClientConfiguration) this.instance).clearVideo();
                return this;
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public boolean hasScreen() {
                return ((ClientConfiguration) this.instance).hasScreen();
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public VideoConfiguration getScreen() {
                return ((ClientConfiguration) this.instance).getScreen();
            }

            public Builder setScreen(VideoConfiguration videoConfiguration) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setScreen(videoConfiguration);
                return this;
            }

            public Builder setScreen(VideoConfiguration.Builder builder) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setScreen(builder.build());
                return this;
            }

            public Builder mergeScreen(VideoConfiguration videoConfiguration) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).mergeScreen(videoConfiguration);
                return this;
            }

            public Builder clearScreen() {
                copyOnWrite();
                ((ClientConfiguration) this.instance).clearScreen();
                return this;
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public int getResumeConnectionValue() {
                return ((ClientConfiguration) this.instance).getResumeConnectionValue();
            }

            public Builder setResumeConnectionValue(int i) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setResumeConnectionValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public ClientConfigSetting getResumeConnection() {
                return ((ClientConfiguration) this.instance).getResumeConnection();
            }

            public Builder setResumeConnection(ClientConfigSetting clientConfigSetting) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setResumeConnection(clientConfigSetting);
                return this;
            }

            public Builder clearResumeConnection() {
                copyOnWrite();
                ((ClientConfiguration) this.instance).clearResumeConnection();
                return this;
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public boolean hasDisabledCodecs() {
                return ((ClientConfiguration) this.instance).hasDisabledCodecs();
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public DisabledCodecs getDisabledCodecs() {
                return ((ClientConfiguration) this.instance).getDisabledCodecs();
            }

            public Builder setDisabledCodecs(DisabledCodecs disabledCodecs) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setDisabledCodecs(disabledCodecs);
                return this;
            }

            public Builder setDisabledCodecs(DisabledCodecs.Builder builder) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setDisabledCodecs(builder.build());
                return this;
            }

            public Builder mergeDisabledCodecs(DisabledCodecs disabledCodecs) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).mergeDisabledCodecs(disabledCodecs);
                return this;
            }

            public Builder clearDisabledCodecs() {
                copyOnWrite();
                ((ClientConfiguration) this.instance).clearDisabledCodecs();
                return this;
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public int getForceRelayValue() {
                return ((ClientConfiguration) this.instance).getForceRelayValue();
            }

            public Builder setForceRelayValue(int i) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setForceRelayValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.ClientConfigurationOrBuilder
            public ClientConfigSetting getForceRelay() {
                return ((ClientConfiguration) this.instance).getForceRelay();
            }

            public Builder setForceRelay(ClientConfigSetting clientConfigSetting) {
                copyOnWrite();
                ((ClientConfiguration) this.instance).setForceRelay(clientConfigSetting);
                return this;
            }

            public Builder clearForceRelay() {
                copyOnWrite();
                ((ClientConfiguration) this.instance).clearForceRelay();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientConfiguration();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f\u0004\t\u0005\f", new Object[]{"video_", "screen_", "resumeConnection_", "disabledCodecs_", "forceRelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ClientConfiguration.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ClientConfiguration clientConfiguration = new ClientConfiguration();
            DEFAULT_INSTANCE = clientConfiguration;
            GeneratedMessageLite.registerDefaultInstance(ClientConfiguration.class, clientConfiguration);
        }

        public static ClientConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ClientConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class VideoConfiguration extends GeneratedMessageLite<VideoConfiguration, Builder> implements VideoConfigurationOrBuilder {
        private static final VideoConfiguration DEFAULT_INSTANCE;
        public static final int HARDWARE_ENCODER_FIELD_NUMBER = 1;
        private static volatile Parser<VideoConfiguration> PARSER;
        private int hardwareEncoder_;

        private VideoConfiguration() {
        }

        @Override // livekit.LivekitModels.VideoConfigurationOrBuilder
        public int getHardwareEncoderValue() {
            return this.hardwareEncoder_;
        }

        @Override // livekit.LivekitModels.VideoConfigurationOrBuilder
        public ClientConfigSetting getHardwareEncoder() {
            ClientConfigSetting forNumber = ClientConfigSetting.forNumber(this.hardwareEncoder_);
            return forNumber == null ? ClientConfigSetting.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardwareEncoderValue(int i) {
            this.hardwareEncoder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardwareEncoder(ClientConfigSetting clientConfigSetting) {
            this.hardwareEncoder_ = clientConfigSetting.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHardwareEncoder() {
            this.hardwareEncoder_ = 0;
        }

        public static VideoConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static VideoConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VideoConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VideoConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VideoConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VideoConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VideoConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VideoConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(VideoConfiguration videoConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(videoConfiguration);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VideoConfiguration, Builder> implements VideoConfigurationOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(VideoConfiguration.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.VideoConfigurationOrBuilder
            public int getHardwareEncoderValue() {
                return ((VideoConfiguration) this.instance).getHardwareEncoderValue();
            }

            public Builder setHardwareEncoderValue(int i) {
                copyOnWrite();
                ((VideoConfiguration) this.instance).setHardwareEncoderValue(i);
                return this;
            }

            @Override // livekit.LivekitModels.VideoConfigurationOrBuilder
            public ClientConfigSetting getHardwareEncoder() {
                return ((VideoConfiguration) this.instance).getHardwareEncoder();
            }

            public Builder setHardwareEncoder(ClientConfigSetting clientConfigSetting) {
                copyOnWrite();
                ((VideoConfiguration) this.instance).setHardwareEncoder(clientConfigSetting);
                return this;
            }

            public Builder clearHardwareEncoder() {
                copyOnWrite();
                ((VideoConfiguration) this.instance).clearHardwareEncoder();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoConfiguration();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hardwareEncoder_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VideoConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (VideoConfiguration.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            VideoConfiguration videoConfiguration = new VideoConfiguration();
            DEFAULT_INSTANCE = videoConfiguration;
            GeneratedMessageLite.registerDefaultInstance(VideoConfiguration.class, videoConfiguration);
        }

        public static VideoConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<VideoConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DisabledCodecs extends GeneratedMessageLite<DisabledCodecs, Builder> implements DisabledCodecsOrBuilder {
        public static final int CODECS_FIELD_NUMBER = 1;
        private static final DisabledCodecs DEFAULT_INSTANCE;
        private static volatile Parser<DisabledCodecs> PARSER = null;
        public static final int PUBLISH_FIELD_NUMBER = 2;
        private Internal.ProtobufList<Codec> codecs_ = emptyProtobufList();
        private Internal.ProtobufList<Codec> publish_ = emptyProtobufList();

        private DisabledCodecs() {
        }

        @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
        public List<Codec> getCodecsList() {
            return this.codecs_;
        }

        public List<? extends CodecOrBuilder> getCodecsOrBuilderList() {
            return this.codecs_;
        }

        @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
        public int getCodecsCount() {
            return this.codecs_.size();
        }

        @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
        public Codec getCodecs(int i) {
            return this.codecs_.get(i);
        }

        public CodecOrBuilder getCodecsOrBuilder(int i) {
            return this.codecs_.get(i);
        }

        private void ensureCodecsIsMutable() {
            Internal.ProtobufList<Codec> protobufList = this.codecs_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.codecs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodecs(int i, Codec codec) {
            codec.getClass();
            ensureCodecsIsMutable();
            this.codecs_.set(i, codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCodecs(Codec codec) {
            codec.getClass();
            ensureCodecsIsMutable();
            this.codecs_.add(codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCodecs(int i, Codec codec) {
            codec.getClass();
            ensureCodecsIsMutable();
            this.codecs_.add(i, codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCodecs(Iterable<? extends Codec> iterable) {
            ensureCodecsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.codecs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodecs() {
            this.codecs_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCodecs(int i) {
            ensureCodecsIsMutable();
            this.codecs_.remove(i);
        }

        @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
        public List<Codec> getPublishList() {
            return this.publish_;
        }

        public List<? extends CodecOrBuilder> getPublishOrBuilderList() {
            return this.publish_;
        }

        @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
        public int getPublishCount() {
            return this.publish_.size();
        }

        @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
        public Codec getPublish(int i) {
            return this.publish_.get(i);
        }

        public CodecOrBuilder getPublishOrBuilder(int i) {
            return this.publish_.get(i);
        }

        private void ensurePublishIsMutable() {
            Internal.ProtobufList<Codec> protobufList = this.publish_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.publish_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublish(int i, Codec codec) {
            codec.getClass();
            ensurePublishIsMutable();
            this.publish_.set(i, codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublish(Codec codec) {
            codec.getClass();
            ensurePublishIsMutable();
            this.publish_.add(codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublish(int i, Codec codec) {
            codec.getClass();
            ensurePublishIsMutable();
            this.publish_.add(i, codec);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPublish(Iterable<? extends Codec> iterable) {
            ensurePublishIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.publish_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublish() {
            this.publish_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePublish(int i) {
            ensurePublishIsMutable();
            this.publish_.remove(i);
        }

        public static DisabledCodecs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DisabledCodecs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DisabledCodecs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DisabledCodecs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DisabledCodecs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DisabledCodecs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DisabledCodecs parseFrom(InputStream inputStream) throws IOException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisabledCodecs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisabledCodecs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisabledCodecs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisabledCodecs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisabledCodecs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisabledCodecs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DisabledCodecs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisabledCodecs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DisabledCodecs disabledCodecs) {
            return DEFAULT_INSTANCE.createBuilder(disabledCodecs);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DisabledCodecs, Builder> implements DisabledCodecsOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(DisabledCodecs.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
            public List<Codec> getCodecsList() {
                return Collections.unmodifiableList(((DisabledCodecs) this.instance).getCodecsList());
            }

            @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
            public int getCodecsCount() {
                return ((DisabledCodecs) this.instance).getCodecsCount();
            }

            @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
            public Codec getCodecs(int i) {
                return ((DisabledCodecs) this.instance).getCodecs(i);
            }

            public Builder setCodecs(int i, Codec codec) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).setCodecs(i, codec);
                return this;
            }

            public Builder setCodecs(int i, Codec.Builder builder) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).setCodecs(i, builder.build());
                return this;
            }

            public Builder addCodecs(Codec codec) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addCodecs(codec);
                return this;
            }

            public Builder addCodecs(int i, Codec codec) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addCodecs(i, codec);
                return this;
            }

            public Builder addCodecs(Codec.Builder builder) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addCodecs(builder.build());
                return this;
            }

            public Builder addCodecs(int i, Codec.Builder builder) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addCodecs(i, builder.build());
                return this;
            }

            public Builder addAllCodecs(Iterable<? extends Codec> iterable) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addAllCodecs(iterable);
                return this;
            }

            public Builder clearCodecs() {
                copyOnWrite();
                ((DisabledCodecs) this.instance).clearCodecs();
                return this;
            }

            public Builder removeCodecs(int i) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).removeCodecs(i);
                return this;
            }

            @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
            public List<Codec> getPublishList() {
                return Collections.unmodifiableList(((DisabledCodecs) this.instance).getPublishList());
            }

            @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
            public int getPublishCount() {
                return ((DisabledCodecs) this.instance).getPublishCount();
            }

            @Override // livekit.LivekitModels.DisabledCodecsOrBuilder
            public Codec getPublish(int i) {
                return ((DisabledCodecs) this.instance).getPublish(i);
            }

            public Builder setPublish(int i, Codec codec) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).setPublish(i, codec);
                return this;
            }

            public Builder setPublish(int i, Codec.Builder builder) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).setPublish(i, builder.build());
                return this;
            }

            public Builder addPublish(Codec codec) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addPublish(codec);
                return this;
            }

            public Builder addPublish(int i, Codec codec) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addPublish(i, codec);
                return this;
            }

            public Builder addPublish(Codec.Builder builder) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addPublish(builder.build());
                return this;
            }

            public Builder addPublish(int i, Codec.Builder builder) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addPublish(i, builder.build());
                return this;
            }

            public Builder addAllPublish(Iterable<? extends Codec> iterable) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).addAllPublish(iterable);
                return this;
            }

            public Builder clearPublish() {
                copyOnWrite();
                ((DisabledCodecs) this.instance).clearPublish();
                return this;
            }

            public Builder removePublish(int i) {
                copyOnWrite();
                ((DisabledCodecs) this.instance).removePublish(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DisabledCodecs();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"codecs_", Codec.class, "publish_", Codec.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DisabledCodecs> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (DisabledCodecs.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            DisabledCodecs disabledCodecs = new DisabledCodecs();
            DEFAULT_INSTANCE = disabledCodecs;
            GeneratedMessageLite.registerDefaultInstance(DisabledCodecs.class, disabledCodecs);
        }

        public static DisabledCodecs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DisabledCodecs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RTPDrift extends GeneratedMessageLite<RTPDrift, Builder> implements RTPDriftOrBuilder {
        public static final int CLOCK_RATE_FIELD_NUMBER = 9;
        private static final RTPDrift DEFAULT_INSTANCE;
        public static final int DRIFT_MS_FIELD_NUMBER = 8;
        public static final int DRIFT_SAMPLES_FIELD_NUMBER = 7;
        public static final int DURATION_FIELD_NUMBER = 3;
        public static final int END_TIMESTAMP_FIELD_NUMBER = 5;
        public static final int END_TIME_FIELD_NUMBER = 2;
        private static volatile Parser<RTPDrift> PARSER = null;
        public static final int RTP_CLOCK_TICKS_FIELD_NUMBER = 6;
        public static final int START_TIMESTAMP_FIELD_NUMBER = 4;
        public static final int START_TIME_FIELD_NUMBER = 1;
        private double clockRate_;
        private double driftMs_;
        private long driftSamples_;
        private double duration_;
        private Timestamp endTime_;
        private long endTimestamp_;
        private long rtpClockTicks_;
        private Timestamp startTime_;
        private long startTimestamp_;

        private RTPDrift() {
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public boolean hasStartTime() {
            return this.startTime_ != null;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public Timestamp getStartTime() {
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(Timestamp timestamp) {
            timestamp.getClass();
            this.startTime_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStartTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.startTime_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.startTime_ = Timestamp.newBuilder(this.startTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.startTime_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = null;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public boolean hasEndTime() {
            return this.endTime_ != null;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public Timestamp getEndTime() {
            Timestamp timestamp = this.endTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(Timestamp timestamp) {
            timestamp.getClass();
            this.endTime_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEndTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.endTime_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.endTime_ = Timestamp.newBuilder(this.endTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.endTime_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = null;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public double getDuration() {
            return this.duration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(double d) {
            this.duration_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public long getStartTimestamp() {
            return this.startTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimestamp(long j) {
            this.startTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTimestamp() {
            this.startTimestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public long getEndTimestamp() {
            return this.endTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTimestamp(long j) {
            this.endTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTimestamp() {
            this.endTimestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public long getRtpClockTicks() {
            return this.rtpClockTicks_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtpClockTicks(long j) {
            this.rtpClockTicks_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtpClockTicks() {
            this.rtpClockTicks_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public long getDriftSamples() {
            return this.driftSamples_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDriftSamples(long j) {
            this.driftSamples_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDriftSamples() {
            this.driftSamples_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public double getDriftMs() {
            return this.driftMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDriftMs(double d) {
            this.driftMs_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDriftMs() {
            this.driftMs_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPDriftOrBuilder
        public double getClockRate() {
            return this.clockRate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockRate(double d) {
            this.clockRate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockRate() {
            this.clockRate_ = 0.0d;
        }

        public static RTPDrift parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RTPDrift parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RTPDrift parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RTPDrift parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RTPDrift parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RTPDrift parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RTPDrift parseFrom(InputStream inputStream) throws IOException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPDrift parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPDrift parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RTPDrift) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPDrift parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPDrift) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPDrift parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RTPDrift parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPDrift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RTPDrift rTPDrift) {
            return DEFAULT_INSTANCE.createBuilder(rTPDrift);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RTPDrift, Builder> implements RTPDriftOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RTPDrift.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public boolean hasStartTime() {
                return ((RTPDrift) this.instance).hasStartTime();
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public Timestamp getStartTime() {
                return ((RTPDrift) this.instance).getStartTime();
            }

            public Builder setStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPDrift) this.instance).setStartTime(timestamp);
                return this;
            }

            public Builder setStartTime(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPDrift) this.instance).setStartTime(builder.build());
                return this;
            }

            public Builder mergeStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPDrift) this.instance).mergeStartTime(timestamp);
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearStartTime();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public boolean hasEndTime() {
                return ((RTPDrift) this.instance).hasEndTime();
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public Timestamp getEndTime() {
                return ((RTPDrift) this.instance).getEndTime();
            }

            public Builder setEndTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPDrift) this.instance).setEndTime(timestamp);
                return this;
            }

            public Builder setEndTime(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPDrift) this.instance).setEndTime(builder.build());
                return this;
            }

            public Builder mergeEndTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPDrift) this.instance).mergeEndTime(timestamp);
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearEndTime();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public double getDuration() {
                return ((RTPDrift) this.instance).getDuration();
            }

            public Builder setDuration(double d) {
                copyOnWrite();
                ((RTPDrift) this.instance).setDuration(d);
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearDuration();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public long getStartTimestamp() {
                return ((RTPDrift) this.instance).getStartTimestamp();
            }

            public Builder setStartTimestamp(long j) {
                copyOnWrite();
                ((RTPDrift) this.instance).setStartTimestamp(j);
                return this;
            }

            public Builder clearStartTimestamp() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearStartTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public long getEndTimestamp() {
                return ((RTPDrift) this.instance).getEndTimestamp();
            }

            public Builder setEndTimestamp(long j) {
                copyOnWrite();
                ((RTPDrift) this.instance).setEndTimestamp(j);
                return this;
            }

            public Builder clearEndTimestamp() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearEndTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public long getRtpClockTicks() {
                return ((RTPDrift) this.instance).getRtpClockTicks();
            }

            public Builder setRtpClockTicks(long j) {
                copyOnWrite();
                ((RTPDrift) this.instance).setRtpClockTicks(j);
                return this;
            }

            public Builder clearRtpClockTicks() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearRtpClockTicks();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public long getDriftSamples() {
                return ((RTPDrift) this.instance).getDriftSamples();
            }

            public Builder setDriftSamples(long j) {
                copyOnWrite();
                ((RTPDrift) this.instance).setDriftSamples(j);
                return this;
            }

            public Builder clearDriftSamples() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearDriftSamples();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public double getDriftMs() {
                return ((RTPDrift) this.instance).getDriftMs();
            }

            public Builder setDriftMs(double d) {
                copyOnWrite();
                ((RTPDrift) this.instance).setDriftMs(d);
                return this;
            }

            public Builder clearDriftMs() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearDriftMs();
                return this;
            }

            @Override // livekit.LivekitModels.RTPDriftOrBuilder
            public double getClockRate() {
                return ((RTPDrift) this.instance).getClockRate();
            }

            public Builder setClockRate(double d) {
                copyOnWrite();
                ((RTPDrift) this.instance).setClockRate(d);
                return this;
            }

            public Builder clearClockRate() {
                copyOnWrite();
                ((RTPDrift) this.instance).clearClockRate();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RTPDrift();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0000\u0004\u0003\u0005\u0003\u0006\u0003\u0007\u0002\b\u0000\t\u0000", new Object[]{"startTime_", "endTime_", "duration_", "startTimestamp_", "endTimestamp_", "rtpClockTicks_", "driftSamples_", "driftMs_", "clockRate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RTPDrift> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RTPDrift.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RTPDrift rTPDrift = new RTPDrift();
            DEFAULT_INSTANCE = rTPDrift;
            GeneratedMessageLite.registerDefaultInstance(RTPDrift.class, rTPDrift);
        }

        public static RTPDrift getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RTPDrift> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RTPStats extends GeneratedMessageLite<RTPStats, Builder> implements RTPStatsOrBuilder {
        public static final int BITRATE_DUPLICATE_FIELD_NUMBER = 14;
        public static final int BITRATE_FIELD_NUMBER = 7;
        public static final int BITRATE_PADDING_FIELD_NUMBER = 18;
        public static final int BYTES_DUPLICATE_FIELD_NUMBER = 13;
        public static final int BYTES_FIELD_NUMBER = 6;
        public static final int BYTES_PADDING_FIELD_NUMBER = 17;
        private static final RTPStats DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 3;
        public static final int END_TIME_FIELD_NUMBER = 2;
        public static final int FIRS_FIELD_NUMBER = 29;
        public static final int FRAMES_FIELD_NUMBER = 20;
        public static final int FRAME_RATE_FIELD_NUMBER = 21;
        public static final int GAP_HISTOGRAM_FIELD_NUMBER = 24;
        public static final int HEADER_BYTES_DUPLICATE_FIELD_NUMBER = 40;
        public static final int HEADER_BYTES_FIELD_NUMBER = 39;
        public static final int HEADER_BYTES_PADDING_FIELD_NUMBER = 41;
        public static final int JITTER_CURRENT_FIELD_NUMBER = 22;
        public static final int JITTER_MAX_FIELD_NUMBER = 23;
        public static final int KEY_FRAMES_FIELD_NUMBER = 33;
        public static final int LAST_FIR_FIELD_NUMBER = 30;
        public static final int LAST_KEY_FRAME_FIELD_NUMBER = 34;
        public static final int LAST_LAYER_LOCK_PLI_FIELD_NUMBER = 36;
        public static final int LAST_PLI_FIELD_NUMBER = 28;
        public static final int LAYER_LOCK_PLIS_FIELD_NUMBER = 35;
        public static final int NACKS_FIELD_NUMBER = 25;
        public static final int NACK_ACKS_FIELD_NUMBER = 37;
        public static final int NACK_MISSES_FIELD_NUMBER = 26;
        public static final int NACK_REPEATED_FIELD_NUMBER = 38;
        public static final int NTP_REPORT_DRIFT_FIELD_NUMBER = 45;
        public static final int PACKETS_DUPLICATE_FIELD_NUMBER = 11;
        public static final int PACKETS_FIELD_NUMBER = 4;
        public static final int PACKETS_LOST_FIELD_NUMBER = 8;
        public static final int PACKETS_OUT_OF_ORDER_FIELD_NUMBER = 19;
        public static final int PACKETS_PADDING_FIELD_NUMBER = 15;
        public static final int PACKET_DRIFT_FIELD_NUMBER = 44;
        public static final int PACKET_DUPLICATE_RATE_FIELD_NUMBER = 12;
        public static final int PACKET_LOSS_PERCENTAGE_FIELD_NUMBER = 10;
        public static final int PACKET_LOSS_RATE_FIELD_NUMBER = 9;
        public static final int PACKET_PADDING_RATE_FIELD_NUMBER = 16;
        public static final int PACKET_RATE_FIELD_NUMBER = 5;
        private static volatile Parser<RTPStats> PARSER = null;
        public static final int PLIS_FIELD_NUMBER = 27;
        public static final int REBASED_REPORT_DRIFT_FIELD_NUMBER = 46;
        public static final int RECEIVED_REPORT_DRIFT_FIELD_NUMBER = 47;
        public static final int RTT_CURRENT_FIELD_NUMBER = 31;
        public static final int RTT_MAX_FIELD_NUMBER = 32;
        public static final int START_TIME_FIELD_NUMBER = 1;
        private double bitrateDuplicate_;
        private double bitratePadding_;
        private double bitrate_;
        private long bytesDuplicate_;
        private long bytesPadding_;
        private long bytes_;
        private double duration_;
        private Timestamp endTime_;
        private int firs_;
        private double frameRate_;
        private int frames_;
        private MapFieldLite<Integer, Integer> gapHistogram_ = MapFieldLite.emptyMapField();
        private long headerBytesDuplicate_;
        private long headerBytesPadding_;
        private long headerBytes_;
        private double jitterCurrent_;
        private double jitterMax_;
        private int keyFrames_;
        private Timestamp lastFir_;
        private Timestamp lastKeyFrame_;
        private Timestamp lastLayerLockPli_;
        private Timestamp lastPli_;
        private int layerLockPlis_;
        private int nackAcks_;
        private int nackMisses_;
        private int nackRepeated_;
        private int nacks_;
        private RTPDrift ntpReportDrift_;
        private RTPDrift packetDrift_;
        private double packetDuplicateRate_;
        private float packetLossPercentage_;
        private double packetLossRate_;
        private double packetPaddingRate_;
        private double packetRate_;
        private int packetsDuplicate_;
        private int packetsLost_;
        private int packetsOutOfOrder_;
        private int packetsPadding_;
        private int packets_;
        private int plis_;
        private RTPDrift rebasedReportDrift_;
        private RTPDrift receivedReportDrift_;
        private int rttCurrent_;
        private int rttMax_;
        private Timestamp startTime_;

        private RTPStats() {
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasStartTime() {
            return this.startTime_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public Timestamp getStartTime() {
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(Timestamp timestamp) {
            timestamp.getClass();
            this.startTime_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStartTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.startTime_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.startTime_ = Timestamp.newBuilder(this.startTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.startTime_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasEndTime() {
            return this.endTime_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public Timestamp getEndTime() {
            Timestamp timestamp = this.endTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(Timestamp timestamp) {
            timestamp.getClass();
            this.endTime_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEndTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.endTime_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.endTime_ = Timestamp.newBuilder(this.endTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.endTime_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getDuration() {
            return this.duration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(double d) {
            this.duration_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getPackets() {
            return this.packets_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackets(int i) {
            this.packets_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackets() {
            this.packets_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getPacketRate() {
            return this.packetRate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketRate(double d) {
            this.packetRate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketRate() {
            this.packetRate_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public long getBytes() {
            return this.bytes_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytes(long j) {
            this.bytes_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytes() {
            this.bytes_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public long getHeaderBytes() {
            return this.headerBytes_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderBytes(long j) {
            this.headerBytes_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeaderBytes() {
            this.headerBytes_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getBitrate() {
            return this.bitrate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBitrate(double d) {
            this.bitrate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBitrate() {
            this.bitrate_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getPacketsLost() {
            return this.packetsLost_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketsLost(int i) {
            this.packetsLost_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketsLost() {
            this.packetsLost_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getPacketLossRate() {
            return this.packetLossRate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketLossRate(double d) {
            this.packetLossRate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketLossRate() {
            this.packetLossRate_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public float getPacketLossPercentage() {
            return this.packetLossPercentage_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketLossPercentage(float f) {
            this.packetLossPercentage_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketLossPercentage() {
            this.packetLossPercentage_ = 0.0f;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getPacketsDuplicate() {
            return this.packetsDuplicate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketsDuplicate(int i) {
            this.packetsDuplicate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketsDuplicate() {
            this.packetsDuplicate_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getPacketDuplicateRate() {
            return this.packetDuplicateRate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketDuplicateRate(double d) {
            this.packetDuplicateRate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketDuplicateRate() {
            this.packetDuplicateRate_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public long getBytesDuplicate() {
            return this.bytesDuplicate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytesDuplicate(long j) {
            this.bytesDuplicate_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytesDuplicate() {
            this.bytesDuplicate_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public long getHeaderBytesDuplicate() {
            return this.headerBytesDuplicate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderBytesDuplicate(long j) {
            this.headerBytesDuplicate_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeaderBytesDuplicate() {
            this.headerBytesDuplicate_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getBitrateDuplicate() {
            return this.bitrateDuplicate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBitrateDuplicate(double d) {
            this.bitrateDuplicate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBitrateDuplicate() {
            this.bitrateDuplicate_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getPacketsPadding() {
            return this.packetsPadding_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketsPadding(int i) {
            this.packetsPadding_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketsPadding() {
            this.packetsPadding_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getPacketPaddingRate() {
            return this.packetPaddingRate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketPaddingRate(double d) {
            this.packetPaddingRate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketPaddingRate() {
            this.packetPaddingRate_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public long getBytesPadding() {
            return this.bytesPadding_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytesPadding(long j) {
            this.bytesPadding_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytesPadding() {
            this.bytesPadding_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public long getHeaderBytesPadding() {
            return this.headerBytesPadding_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderBytesPadding(long j) {
            this.headerBytesPadding_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeaderBytesPadding() {
            this.headerBytesPadding_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getBitratePadding() {
            return this.bitratePadding_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBitratePadding(double d) {
            this.bitratePadding_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBitratePadding() {
            this.bitratePadding_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getPacketsOutOfOrder() {
            return this.packetsOutOfOrder_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketsOutOfOrder(int i) {
            this.packetsOutOfOrder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketsOutOfOrder() {
            this.packetsOutOfOrder_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getFrames() {
            return this.frames_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrames(int i) {
            this.frames_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrames() {
            this.frames_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getFrameRate() {
            return this.frameRate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameRate(double d) {
            this.frameRate_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameRate() {
            this.frameRate_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getJitterCurrent() {
            return this.jitterCurrent_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJitterCurrent(double d) {
            this.jitterCurrent_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJitterCurrent() {
            this.jitterCurrent_ = 0.0d;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public double getJitterMax() {
            return this.jitterMax_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJitterMax(double d) {
            this.jitterMax_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJitterMax() {
            this.jitterMax_ = 0.0d;
        }

        private static final class GapHistogramDefaultEntryHolder {
            static final MapEntryLite<Integer, Integer> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT32, 0, WireFormat.FieldType.UINT32, 0);

            private GapHistogramDefaultEntryHolder() {
            }
        }

        private MapFieldLite<Integer, Integer> internalGetGapHistogram() {
            return this.gapHistogram_;
        }

        private MapFieldLite<Integer, Integer> internalGetMutableGapHistogram() {
            if (!this.gapHistogram_.isMutable()) {
                this.gapHistogram_ = this.gapHistogram_.mutableCopy();
            }
            return this.gapHistogram_;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getGapHistogramCount() {
            return internalGetGapHistogram().size();
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean containsGapHistogram(int i) {
            return internalGetGapHistogram().containsKey(Integer.valueOf(i));
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        @Deprecated
        public Map<Integer, Integer> getGapHistogram() {
            return getGapHistogramMap();
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public Map<Integer, Integer> getGapHistogramMap() {
            return Collections.unmodifiableMap(internalGetGapHistogram());
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getGapHistogramOrDefault(int i, int i2) {
            MapFieldLite<Integer, Integer> internalGetGapHistogram = internalGetGapHistogram();
            return internalGetGapHistogram.containsKey(Integer.valueOf(i)) ? internalGetGapHistogram.get(Integer.valueOf(i)).intValue() : i2;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getGapHistogramOrThrow(int i) {
            MapFieldLite<Integer, Integer> internalGetGapHistogram = internalGetGapHistogram();
            if (!internalGetGapHistogram.containsKey(Integer.valueOf(i))) {
                throw new IllegalArgumentException();
            }
            return internalGetGapHistogram.get(Integer.valueOf(i)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, Integer> getMutableGapHistogramMap() {
            return internalGetMutableGapHistogram();
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getNacks() {
            return this.nacks_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNacks(int i) {
            this.nacks_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNacks() {
            this.nacks_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getNackAcks() {
            return this.nackAcks_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNackAcks(int i) {
            this.nackAcks_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNackAcks() {
            this.nackAcks_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getNackMisses() {
            return this.nackMisses_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNackMisses(int i) {
            this.nackMisses_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNackMisses() {
            this.nackMisses_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getNackRepeated() {
            return this.nackRepeated_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNackRepeated(int i) {
            this.nackRepeated_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNackRepeated() {
            this.nackRepeated_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getPlis() {
            return this.plis_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlis(int i) {
            this.plis_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlis() {
            this.plis_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasLastPli() {
            return this.lastPli_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public Timestamp getLastPli() {
            Timestamp timestamp = this.lastPli_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastPli(Timestamp timestamp) {
            timestamp.getClass();
            this.lastPli_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLastPli(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.lastPli_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.lastPli_ = Timestamp.newBuilder(this.lastPli_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.lastPli_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastPli() {
            this.lastPli_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getFirs() {
            return this.firs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirs(int i) {
            this.firs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirs() {
            this.firs_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasLastFir() {
            return this.lastFir_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public Timestamp getLastFir() {
            Timestamp timestamp = this.lastFir_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastFir(Timestamp timestamp) {
            timestamp.getClass();
            this.lastFir_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLastFir(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.lastFir_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.lastFir_ = Timestamp.newBuilder(this.lastFir_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.lastFir_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastFir() {
            this.lastFir_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getRttCurrent() {
            return this.rttCurrent_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRttCurrent(int i) {
            this.rttCurrent_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRttCurrent() {
            this.rttCurrent_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getRttMax() {
            return this.rttMax_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRttMax(int i) {
            this.rttMax_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRttMax() {
            this.rttMax_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getKeyFrames() {
            return this.keyFrames_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyFrames(int i) {
            this.keyFrames_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyFrames() {
            this.keyFrames_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasLastKeyFrame() {
            return this.lastKeyFrame_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public Timestamp getLastKeyFrame() {
            Timestamp timestamp = this.lastKeyFrame_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastKeyFrame(Timestamp timestamp) {
            timestamp.getClass();
            this.lastKeyFrame_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLastKeyFrame(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.lastKeyFrame_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.lastKeyFrame_ = Timestamp.newBuilder(this.lastKeyFrame_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.lastKeyFrame_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastKeyFrame() {
            this.lastKeyFrame_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public int getLayerLockPlis() {
            return this.layerLockPlis_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLayerLockPlis(int i) {
            this.layerLockPlis_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLayerLockPlis() {
            this.layerLockPlis_ = 0;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasLastLayerLockPli() {
            return this.lastLayerLockPli_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public Timestamp getLastLayerLockPli() {
            Timestamp timestamp = this.lastLayerLockPli_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastLayerLockPli(Timestamp timestamp) {
            timestamp.getClass();
            this.lastLayerLockPli_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLastLayerLockPli(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.lastLayerLockPli_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.lastLayerLockPli_ = Timestamp.newBuilder(this.lastLayerLockPli_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.lastLayerLockPli_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastLayerLockPli() {
            this.lastLayerLockPli_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasPacketDrift() {
            return this.packetDrift_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public RTPDrift getPacketDrift() {
            RTPDrift rTPDrift = this.packetDrift_;
            return rTPDrift == null ? RTPDrift.getDefaultInstance() : rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacketDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            this.packetDrift_ = rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePacketDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            RTPDrift rTPDrift2 = this.packetDrift_;
            if (rTPDrift2 != null && rTPDrift2 != RTPDrift.getDefaultInstance()) {
                this.packetDrift_ = RTPDrift.newBuilder(this.packetDrift_).mergeFrom((RTPDrift.Builder) rTPDrift).buildPartial();
            } else {
                this.packetDrift_ = rTPDrift;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacketDrift() {
            this.packetDrift_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasNtpReportDrift() {
            return this.ntpReportDrift_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public RTPDrift getNtpReportDrift() {
            RTPDrift rTPDrift = this.ntpReportDrift_;
            return rTPDrift == null ? RTPDrift.getDefaultInstance() : rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNtpReportDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            this.ntpReportDrift_ = rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNtpReportDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            RTPDrift rTPDrift2 = this.ntpReportDrift_;
            if (rTPDrift2 != null && rTPDrift2 != RTPDrift.getDefaultInstance()) {
                this.ntpReportDrift_ = RTPDrift.newBuilder(this.ntpReportDrift_).mergeFrom((RTPDrift.Builder) rTPDrift).buildPartial();
            } else {
                this.ntpReportDrift_ = rTPDrift;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNtpReportDrift() {
            this.ntpReportDrift_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasRebasedReportDrift() {
            return this.rebasedReportDrift_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public RTPDrift getRebasedReportDrift() {
            RTPDrift rTPDrift = this.rebasedReportDrift_;
            return rTPDrift == null ? RTPDrift.getDefaultInstance() : rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebasedReportDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            this.rebasedReportDrift_ = rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRebasedReportDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            RTPDrift rTPDrift2 = this.rebasedReportDrift_;
            if (rTPDrift2 != null && rTPDrift2 != RTPDrift.getDefaultInstance()) {
                this.rebasedReportDrift_ = RTPDrift.newBuilder(this.rebasedReportDrift_).mergeFrom((RTPDrift.Builder) rTPDrift).buildPartial();
            } else {
                this.rebasedReportDrift_ = rTPDrift;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebasedReportDrift() {
            this.rebasedReportDrift_ = null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public boolean hasReceivedReportDrift() {
            return this.receivedReportDrift_ != null;
        }

        @Override // livekit.LivekitModels.RTPStatsOrBuilder
        public RTPDrift getReceivedReportDrift() {
            RTPDrift rTPDrift = this.receivedReportDrift_;
            return rTPDrift == null ? RTPDrift.getDefaultInstance() : rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceivedReportDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            this.receivedReportDrift_ = rTPDrift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReceivedReportDrift(RTPDrift rTPDrift) {
            rTPDrift.getClass();
            RTPDrift rTPDrift2 = this.receivedReportDrift_;
            if (rTPDrift2 != null && rTPDrift2 != RTPDrift.getDefaultInstance()) {
                this.receivedReportDrift_ = RTPDrift.newBuilder(this.receivedReportDrift_).mergeFrom((RTPDrift.Builder) rTPDrift).buildPartial();
            } else {
                this.receivedReportDrift_ = rTPDrift;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceivedReportDrift() {
            this.receivedReportDrift_ = null;
        }

        public static RTPStats parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RTPStats parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RTPStats parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RTPStats parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RTPStats parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RTPStats parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RTPStats parseFrom(InputStream inputStream) throws IOException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPStats parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPStats parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RTPStats) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPStats parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPStats) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPStats parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RTPStats parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RTPStats rTPStats) {
            return DEFAULT_INSTANCE.createBuilder(rTPStats);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RTPStats, Builder> implements RTPStatsOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RTPStats.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasStartTime() {
                return ((RTPStats) this.instance).hasStartTime();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public Timestamp getStartTime() {
                return ((RTPStats) this.instance).getStartTime();
            }

            public Builder setStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).setStartTime(timestamp);
                return this;
            }

            public Builder setStartTime(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setStartTime(builder.build());
                return this;
            }

            public Builder mergeStartTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeStartTime(timestamp);
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((RTPStats) this.instance).clearStartTime();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasEndTime() {
                return ((RTPStats) this.instance).hasEndTime();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public Timestamp getEndTime() {
                return ((RTPStats) this.instance).getEndTime();
            }

            public Builder setEndTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).setEndTime(timestamp);
                return this;
            }

            public Builder setEndTime(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setEndTime(builder.build());
                return this;
            }

            public Builder mergeEndTime(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeEndTime(timestamp);
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((RTPStats) this.instance).clearEndTime();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getDuration() {
                return ((RTPStats) this.instance).getDuration();
            }

            public Builder setDuration(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setDuration(d);
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((RTPStats) this.instance).clearDuration();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getPackets() {
                return ((RTPStats) this.instance).getPackets();
            }

            public Builder setPackets(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setPackets(i);
                return this;
            }

            public Builder clearPackets() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPackets();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getPacketRate() {
                return ((RTPStats) this.instance).getPacketRate();
            }

            public Builder setPacketRate(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketRate(d);
                return this;
            }

            public Builder clearPacketRate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketRate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public long getBytes() {
                return ((RTPStats) this.instance).getBytes();
            }

            public Builder setBytes(long j) {
                copyOnWrite();
                ((RTPStats) this.instance).setBytes(j);
                return this;
            }

            public Builder clearBytes() {
                copyOnWrite();
                ((RTPStats) this.instance).clearBytes();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public long getHeaderBytes() {
                return ((RTPStats) this.instance).getHeaderBytes();
            }

            public Builder setHeaderBytes(long j) {
                copyOnWrite();
                ((RTPStats) this.instance).setHeaderBytes(j);
                return this;
            }

            public Builder clearHeaderBytes() {
                copyOnWrite();
                ((RTPStats) this.instance).clearHeaderBytes();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getBitrate() {
                return ((RTPStats) this.instance).getBitrate();
            }

            public Builder setBitrate(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setBitrate(d);
                return this;
            }

            public Builder clearBitrate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearBitrate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getPacketsLost() {
                return ((RTPStats) this.instance).getPacketsLost();
            }

            public Builder setPacketsLost(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketsLost(i);
                return this;
            }

            public Builder clearPacketsLost() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketsLost();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getPacketLossRate() {
                return ((RTPStats) this.instance).getPacketLossRate();
            }

            public Builder setPacketLossRate(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketLossRate(d);
                return this;
            }

            public Builder clearPacketLossRate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketLossRate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public float getPacketLossPercentage() {
                return ((RTPStats) this.instance).getPacketLossPercentage();
            }

            public Builder setPacketLossPercentage(float f) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketLossPercentage(f);
                return this;
            }

            public Builder clearPacketLossPercentage() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketLossPercentage();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getPacketsDuplicate() {
                return ((RTPStats) this.instance).getPacketsDuplicate();
            }

            public Builder setPacketsDuplicate(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketsDuplicate(i);
                return this;
            }

            public Builder clearPacketsDuplicate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketsDuplicate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getPacketDuplicateRate() {
                return ((RTPStats) this.instance).getPacketDuplicateRate();
            }

            public Builder setPacketDuplicateRate(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketDuplicateRate(d);
                return this;
            }

            public Builder clearPacketDuplicateRate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketDuplicateRate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public long getBytesDuplicate() {
                return ((RTPStats) this.instance).getBytesDuplicate();
            }

            public Builder setBytesDuplicate(long j) {
                copyOnWrite();
                ((RTPStats) this.instance).setBytesDuplicate(j);
                return this;
            }

            public Builder clearBytesDuplicate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearBytesDuplicate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public long getHeaderBytesDuplicate() {
                return ((RTPStats) this.instance).getHeaderBytesDuplicate();
            }

            public Builder setHeaderBytesDuplicate(long j) {
                copyOnWrite();
                ((RTPStats) this.instance).setHeaderBytesDuplicate(j);
                return this;
            }

            public Builder clearHeaderBytesDuplicate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearHeaderBytesDuplicate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getBitrateDuplicate() {
                return ((RTPStats) this.instance).getBitrateDuplicate();
            }

            public Builder setBitrateDuplicate(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setBitrateDuplicate(d);
                return this;
            }

            public Builder clearBitrateDuplicate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearBitrateDuplicate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getPacketsPadding() {
                return ((RTPStats) this.instance).getPacketsPadding();
            }

            public Builder setPacketsPadding(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketsPadding(i);
                return this;
            }

            public Builder clearPacketsPadding() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketsPadding();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getPacketPaddingRate() {
                return ((RTPStats) this.instance).getPacketPaddingRate();
            }

            public Builder setPacketPaddingRate(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketPaddingRate(d);
                return this;
            }

            public Builder clearPacketPaddingRate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketPaddingRate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public long getBytesPadding() {
                return ((RTPStats) this.instance).getBytesPadding();
            }

            public Builder setBytesPadding(long j) {
                copyOnWrite();
                ((RTPStats) this.instance).setBytesPadding(j);
                return this;
            }

            public Builder clearBytesPadding() {
                copyOnWrite();
                ((RTPStats) this.instance).clearBytesPadding();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public long getHeaderBytesPadding() {
                return ((RTPStats) this.instance).getHeaderBytesPadding();
            }

            public Builder setHeaderBytesPadding(long j) {
                copyOnWrite();
                ((RTPStats) this.instance).setHeaderBytesPadding(j);
                return this;
            }

            public Builder clearHeaderBytesPadding() {
                copyOnWrite();
                ((RTPStats) this.instance).clearHeaderBytesPadding();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getBitratePadding() {
                return ((RTPStats) this.instance).getBitratePadding();
            }

            public Builder setBitratePadding(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setBitratePadding(d);
                return this;
            }

            public Builder clearBitratePadding() {
                copyOnWrite();
                ((RTPStats) this.instance).clearBitratePadding();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getPacketsOutOfOrder() {
                return ((RTPStats) this.instance).getPacketsOutOfOrder();
            }

            public Builder setPacketsOutOfOrder(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketsOutOfOrder(i);
                return this;
            }

            public Builder clearPacketsOutOfOrder() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketsOutOfOrder();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getFrames() {
                return ((RTPStats) this.instance).getFrames();
            }

            public Builder setFrames(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setFrames(i);
                return this;
            }

            public Builder clearFrames() {
                copyOnWrite();
                ((RTPStats) this.instance).clearFrames();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getFrameRate() {
                return ((RTPStats) this.instance).getFrameRate();
            }

            public Builder setFrameRate(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setFrameRate(d);
                return this;
            }

            public Builder clearFrameRate() {
                copyOnWrite();
                ((RTPStats) this.instance).clearFrameRate();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getJitterCurrent() {
                return ((RTPStats) this.instance).getJitterCurrent();
            }

            public Builder setJitterCurrent(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setJitterCurrent(d);
                return this;
            }

            public Builder clearJitterCurrent() {
                copyOnWrite();
                ((RTPStats) this.instance).clearJitterCurrent();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public double getJitterMax() {
                return ((RTPStats) this.instance).getJitterMax();
            }

            public Builder setJitterMax(double d) {
                copyOnWrite();
                ((RTPStats) this.instance).setJitterMax(d);
                return this;
            }

            public Builder clearJitterMax() {
                copyOnWrite();
                ((RTPStats) this.instance).clearJitterMax();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getGapHistogramCount() {
                return ((RTPStats) this.instance).getGapHistogramMap().size();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean containsGapHistogram(int i) {
                return ((RTPStats) this.instance).getGapHistogramMap().containsKey(Integer.valueOf(i));
            }

            public Builder clearGapHistogram() {
                copyOnWrite();
                ((RTPStats) this.instance).getMutableGapHistogramMap().clear();
                return this;
            }

            public Builder removeGapHistogram(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).getMutableGapHistogramMap().remove(Integer.valueOf(i));
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            @Deprecated
            public Map<Integer, Integer> getGapHistogram() {
                return getGapHistogramMap();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public Map<Integer, Integer> getGapHistogramMap() {
                return Collections.unmodifiableMap(((RTPStats) this.instance).getGapHistogramMap());
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getGapHistogramOrDefault(int i, int i2) {
                Map<Integer, Integer> gapHistogramMap = ((RTPStats) this.instance).getGapHistogramMap();
                return gapHistogramMap.containsKey(Integer.valueOf(i)) ? gapHistogramMap.get(Integer.valueOf(i)).intValue() : i2;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getGapHistogramOrThrow(int i) {
                Map<Integer, Integer> gapHistogramMap = ((RTPStats) this.instance).getGapHistogramMap();
                if (!gapHistogramMap.containsKey(Integer.valueOf(i))) {
                    throw new IllegalArgumentException();
                }
                return gapHistogramMap.get(Integer.valueOf(i)).intValue();
            }

            public Builder putGapHistogram(int i, int i2) {
                copyOnWrite();
                ((RTPStats) this.instance).getMutableGapHistogramMap().put(Integer.valueOf(i), Integer.valueOf(i2));
                return this;
            }

            public Builder putAllGapHistogram(Map<Integer, Integer> map) {
                copyOnWrite();
                ((RTPStats) this.instance).getMutableGapHistogramMap().putAll(map);
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getNacks() {
                return ((RTPStats) this.instance).getNacks();
            }

            public Builder setNacks(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setNacks(i);
                return this;
            }

            public Builder clearNacks() {
                copyOnWrite();
                ((RTPStats) this.instance).clearNacks();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getNackAcks() {
                return ((RTPStats) this.instance).getNackAcks();
            }

            public Builder setNackAcks(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setNackAcks(i);
                return this;
            }

            public Builder clearNackAcks() {
                copyOnWrite();
                ((RTPStats) this.instance).clearNackAcks();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getNackMisses() {
                return ((RTPStats) this.instance).getNackMisses();
            }

            public Builder setNackMisses(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setNackMisses(i);
                return this;
            }

            public Builder clearNackMisses() {
                copyOnWrite();
                ((RTPStats) this.instance).clearNackMisses();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getNackRepeated() {
                return ((RTPStats) this.instance).getNackRepeated();
            }

            public Builder setNackRepeated(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setNackRepeated(i);
                return this;
            }

            public Builder clearNackRepeated() {
                copyOnWrite();
                ((RTPStats) this.instance).clearNackRepeated();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getPlis() {
                return ((RTPStats) this.instance).getPlis();
            }

            public Builder setPlis(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setPlis(i);
                return this;
            }

            public Builder clearPlis() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPlis();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasLastPli() {
                return ((RTPStats) this.instance).hasLastPli();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public Timestamp getLastPli() {
                return ((RTPStats) this.instance).getLastPli();
            }

            public Builder setLastPli(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastPli(timestamp);
                return this;
            }

            public Builder setLastPli(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastPli(builder.build());
                return this;
            }

            public Builder mergeLastPli(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeLastPli(timestamp);
                return this;
            }

            public Builder clearLastPli() {
                copyOnWrite();
                ((RTPStats) this.instance).clearLastPli();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getFirs() {
                return ((RTPStats) this.instance).getFirs();
            }

            public Builder setFirs(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setFirs(i);
                return this;
            }

            public Builder clearFirs() {
                copyOnWrite();
                ((RTPStats) this.instance).clearFirs();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasLastFir() {
                return ((RTPStats) this.instance).hasLastFir();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public Timestamp getLastFir() {
                return ((RTPStats) this.instance).getLastFir();
            }

            public Builder setLastFir(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastFir(timestamp);
                return this;
            }

            public Builder setLastFir(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastFir(builder.build());
                return this;
            }

            public Builder mergeLastFir(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeLastFir(timestamp);
                return this;
            }

            public Builder clearLastFir() {
                copyOnWrite();
                ((RTPStats) this.instance).clearLastFir();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getRttCurrent() {
                return ((RTPStats) this.instance).getRttCurrent();
            }

            public Builder setRttCurrent(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setRttCurrent(i);
                return this;
            }

            public Builder clearRttCurrent() {
                copyOnWrite();
                ((RTPStats) this.instance).clearRttCurrent();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getRttMax() {
                return ((RTPStats) this.instance).getRttMax();
            }

            public Builder setRttMax(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setRttMax(i);
                return this;
            }

            public Builder clearRttMax() {
                copyOnWrite();
                ((RTPStats) this.instance).clearRttMax();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getKeyFrames() {
                return ((RTPStats) this.instance).getKeyFrames();
            }

            public Builder setKeyFrames(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setKeyFrames(i);
                return this;
            }

            public Builder clearKeyFrames() {
                copyOnWrite();
                ((RTPStats) this.instance).clearKeyFrames();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasLastKeyFrame() {
                return ((RTPStats) this.instance).hasLastKeyFrame();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public Timestamp getLastKeyFrame() {
                return ((RTPStats) this.instance).getLastKeyFrame();
            }

            public Builder setLastKeyFrame(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastKeyFrame(timestamp);
                return this;
            }

            public Builder setLastKeyFrame(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastKeyFrame(builder.build());
                return this;
            }

            public Builder mergeLastKeyFrame(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeLastKeyFrame(timestamp);
                return this;
            }

            public Builder clearLastKeyFrame() {
                copyOnWrite();
                ((RTPStats) this.instance).clearLastKeyFrame();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public int getLayerLockPlis() {
                return ((RTPStats) this.instance).getLayerLockPlis();
            }

            public Builder setLayerLockPlis(int i) {
                copyOnWrite();
                ((RTPStats) this.instance).setLayerLockPlis(i);
                return this;
            }

            public Builder clearLayerLockPlis() {
                copyOnWrite();
                ((RTPStats) this.instance).clearLayerLockPlis();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasLastLayerLockPli() {
                return ((RTPStats) this.instance).hasLastLayerLockPli();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public Timestamp getLastLayerLockPli() {
                return ((RTPStats) this.instance).getLastLayerLockPli();
            }

            public Builder setLastLayerLockPli(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastLayerLockPli(timestamp);
                return this;
            }

            public Builder setLastLayerLockPli(Timestamp.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setLastLayerLockPli(builder.build());
                return this;
            }

            public Builder mergeLastLayerLockPli(Timestamp timestamp) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeLastLayerLockPli(timestamp);
                return this;
            }

            public Builder clearLastLayerLockPli() {
                copyOnWrite();
                ((RTPStats) this.instance).clearLastLayerLockPli();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasPacketDrift() {
                return ((RTPStats) this.instance).hasPacketDrift();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public RTPDrift getPacketDrift() {
                return ((RTPStats) this.instance).getPacketDrift();
            }

            public Builder setPacketDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketDrift(rTPDrift);
                return this;
            }

            public Builder setPacketDrift(RTPDrift.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setPacketDrift(builder.build());
                return this;
            }

            public Builder mergePacketDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).mergePacketDrift(rTPDrift);
                return this;
            }

            public Builder clearPacketDrift() {
                copyOnWrite();
                ((RTPStats) this.instance).clearPacketDrift();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasNtpReportDrift() {
                return ((RTPStats) this.instance).hasNtpReportDrift();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public RTPDrift getNtpReportDrift() {
                return ((RTPStats) this.instance).getNtpReportDrift();
            }

            public Builder setNtpReportDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).setNtpReportDrift(rTPDrift);
                return this;
            }

            public Builder setNtpReportDrift(RTPDrift.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setNtpReportDrift(builder.build());
                return this;
            }

            public Builder mergeNtpReportDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeNtpReportDrift(rTPDrift);
                return this;
            }

            public Builder clearNtpReportDrift() {
                copyOnWrite();
                ((RTPStats) this.instance).clearNtpReportDrift();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasRebasedReportDrift() {
                return ((RTPStats) this.instance).hasRebasedReportDrift();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public RTPDrift getRebasedReportDrift() {
                return ((RTPStats) this.instance).getRebasedReportDrift();
            }

            public Builder setRebasedReportDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).setRebasedReportDrift(rTPDrift);
                return this;
            }

            public Builder setRebasedReportDrift(RTPDrift.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setRebasedReportDrift(builder.build());
                return this;
            }

            public Builder mergeRebasedReportDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeRebasedReportDrift(rTPDrift);
                return this;
            }

            public Builder clearRebasedReportDrift() {
                copyOnWrite();
                ((RTPStats) this.instance).clearRebasedReportDrift();
                return this;
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public boolean hasReceivedReportDrift() {
                return ((RTPStats) this.instance).hasReceivedReportDrift();
            }

            @Override // livekit.LivekitModels.RTPStatsOrBuilder
            public RTPDrift getReceivedReportDrift() {
                return ((RTPStats) this.instance).getReceivedReportDrift();
            }

            public Builder setReceivedReportDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).setReceivedReportDrift(rTPDrift);
                return this;
            }

            public Builder setReceivedReportDrift(RTPDrift.Builder builder) {
                copyOnWrite();
                ((RTPStats) this.instance).setReceivedReportDrift(builder.build());
                return this;
            }

            public Builder mergeReceivedReportDrift(RTPDrift rTPDrift) {
                copyOnWrite();
                ((RTPStats) this.instance).mergeReceivedReportDrift(rTPDrift);
                return this;
            }

            public Builder clearReceivedReportDrift() {
                copyOnWrite();
                ((RTPStats) this.instance).clearReceivedReportDrift();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RTPStats();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000-\u0000\u0000\u0001/-\u0001\u0000\u0000\u0001\t\u0002\t\u0003\u0000\u0004\u000b\u0005\u0000\u0006\u0003\u0007\u0000\b\u000b\t\u0000\n\u0001\u000b\u000b\f\u0000\r\u0003\u000e\u0000\u000f\u000b\u0010\u0000\u0011\u0003\u0012\u0000\u0013\u000b\u0014\u000b\u0015\u0000\u0016\u0000\u0017\u0000\u00182\u0019\u000b\u001a\u000b\u001b\u000b\u001c\t\u001d\u000b\u001e\t\u001f\u000b \u000b!\u000b\"\t#\u000b$\t%\u000b&\u000b'\u0003(\u0003)\u0003,\t-\t.\t/\t", new Object[]{"startTime_", "endTime_", "duration_", "packets_", "packetRate_", "bytes_", "bitrate_", "packetsLost_", "packetLossRate_", "packetLossPercentage_", "packetsDuplicate_", "packetDuplicateRate_", "bytesDuplicate_", "bitrateDuplicate_", "packetsPadding_", "packetPaddingRate_", "bytesPadding_", "bitratePadding_", "packetsOutOfOrder_", "frames_", "frameRate_", "jitterCurrent_", "jitterMax_", "gapHistogram_", GapHistogramDefaultEntryHolder.defaultEntry, "nacks_", "nackMisses_", "plis_", "lastPli_", "firs_", "lastFir_", "rttCurrent_", "rttMax_", "keyFrames_", "lastKeyFrame_", "layerLockPlis_", "lastLayerLockPli_", "nackAcks_", "nackRepeated_", "headerBytes_", "headerBytesDuplicate_", "headerBytesPadding_", "packetDrift_", "ntpReportDrift_", "rebasedReportDrift_", "receivedReportDrift_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RTPStats> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RTPStats.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RTPStats rTPStats = new RTPStats();
            DEFAULT_INSTANCE = rTPStats;
            GeneratedMessageLite.registerDefaultInstance(RTPStats.class, rTPStats);
        }

        public static RTPStats getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RTPStats> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RTCPSenderReportState extends GeneratedMessageLite<RTCPSenderReportState, Builder> implements RTCPSenderReportStateOrBuilder {
        public static final int AT_ADJUSTED_FIELD_NUMBER = 5;
        public static final int AT_FIELD_NUMBER = 4;
        private static final RTCPSenderReportState DEFAULT_INSTANCE;
        public static final int NTP_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int OCTETS_FIELD_NUMBER = 7;
        public static final int PACKETS_FIELD_NUMBER = 6;
        private static volatile Parser<RTCPSenderReportState> PARSER = null;
        public static final int RTP_TIMESTAMP_EXT_FIELD_NUMBER = 2;
        public static final int RTP_TIMESTAMP_FIELD_NUMBER = 1;
        private long atAdjusted_;
        private long at_;
        private long ntpTimestamp_;
        private long octets_;
        private int packets_;
        private long rtpTimestampExt_;
        private int rtpTimestamp_;

        private RTCPSenderReportState() {
        }

        @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
        public int getRtpTimestamp() {
            return this.rtpTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtpTimestamp(int i) {
            this.rtpTimestamp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtpTimestamp() {
            this.rtpTimestamp_ = 0;
        }

        @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
        public long getRtpTimestampExt() {
            return this.rtpTimestampExt_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtpTimestampExt(long j) {
            this.rtpTimestampExt_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtpTimestampExt() {
            this.rtpTimestampExt_ = 0L;
        }

        @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
        public long getNtpTimestamp() {
            return this.ntpTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNtpTimestamp(long j) {
            this.ntpTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNtpTimestamp() {
            this.ntpTimestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
        public long getAt() {
            return this.at_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAt(long j) {
            this.at_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAt() {
            this.at_ = 0L;
        }

        @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
        public long getAtAdjusted() {
            return this.atAdjusted_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAtAdjusted(long j) {
            this.atAdjusted_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAtAdjusted() {
            this.atAdjusted_ = 0L;
        }

        @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
        public int getPackets() {
            return this.packets_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackets(int i) {
            this.packets_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackets() {
            this.packets_ = 0;
        }

        @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
        public long getOctets() {
            return this.octets_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOctets(long j) {
            this.octets_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOctets() {
            this.octets_ = 0L;
        }

        public static RTCPSenderReportState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RTCPSenderReportState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RTCPSenderReportState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RTCPSenderReportState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RTCPSenderReportState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RTCPSenderReportState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RTCPSenderReportState parseFrom(InputStream inputStream) throws IOException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTCPSenderReportState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTCPSenderReportState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RTCPSenderReportState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTCPSenderReportState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTCPSenderReportState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTCPSenderReportState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RTCPSenderReportState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTCPSenderReportState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RTCPSenderReportState rTCPSenderReportState) {
            return DEFAULT_INSTANCE.createBuilder(rTCPSenderReportState);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RTCPSenderReportState, Builder> implements RTCPSenderReportStateOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RTCPSenderReportState.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
            public int getRtpTimestamp() {
                return ((RTCPSenderReportState) this.instance).getRtpTimestamp();
            }

            public Builder setRtpTimestamp(int i) {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).setRtpTimestamp(i);
                return this;
            }

            public Builder clearRtpTimestamp() {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).clearRtpTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
            public long getRtpTimestampExt() {
                return ((RTCPSenderReportState) this.instance).getRtpTimestampExt();
            }

            public Builder setRtpTimestampExt(long j) {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).setRtpTimestampExt(j);
                return this;
            }

            public Builder clearRtpTimestampExt() {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).clearRtpTimestampExt();
                return this;
            }

            @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
            public long getNtpTimestamp() {
                return ((RTCPSenderReportState) this.instance).getNtpTimestamp();
            }

            public Builder setNtpTimestamp(long j) {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).setNtpTimestamp(j);
                return this;
            }

            public Builder clearNtpTimestamp() {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).clearNtpTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
            public long getAt() {
                return ((RTCPSenderReportState) this.instance).getAt();
            }

            public Builder setAt(long j) {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).setAt(j);
                return this;
            }

            public Builder clearAt() {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).clearAt();
                return this;
            }

            @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
            public long getAtAdjusted() {
                return ((RTCPSenderReportState) this.instance).getAtAdjusted();
            }

            public Builder setAtAdjusted(long j) {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).setAtAdjusted(j);
                return this;
            }

            public Builder clearAtAdjusted() {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).clearAtAdjusted();
                return this;
            }

            @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
            public int getPackets() {
                return ((RTCPSenderReportState) this.instance).getPackets();
            }

            public Builder setPackets(int i) {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).setPackets(i);
                return this;
            }

            public Builder clearPackets() {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).clearPackets();
                return this;
            }

            @Override // livekit.LivekitModels.RTCPSenderReportStateOrBuilder
            public long getOctets() {
                return ((RTCPSenderReportState) this.instance).getOctets();
            }

            public Builder setOctets(long j) {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).setOctets(j);
                return this;
            }

            public Builder clearOctets() {
                copyOnWrite();
                ((RTCPSenderReportState) this.instance).clearOctets();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RTCPSenderReportState();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003\u0003\u0004\u0002\u0005\u0002\u0006\u000b\u0007\u0003", new Object[]{"rtpTimestamp_", "rtpTimestampExt_", "ntpTimestamp_", "at_", "atAdjusted_", "packets_", "octets_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RTCPSenderReportState> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RTCPSenderReportState.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RTCPSenderReportState rTCPSenderReportState = new RTCPSenderReportState();
            DEFAULT_INSTANCE = rTCPSenderReportState;
            GeneratedMessageLite.registerDefaultInstance(RTCPSenderReportState.class, rTCPSenderReportState);
        }

        public static RTCPSenderReportState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RTCPSenderReportState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RTPForwarderState extends GeneratedMessageLite<RTPForwarderState, Builder> implements RTPForwarderStateOrBuilder {
        private static final RTPForwarderState DEFAULT_INSTANCE;
        public static final int DUMMY_START_TIMESTAMP_OFFSET_FIELD_NUMBER = 5;
        public static final int EXT_FIRST_TIMESTAMP_FIELD_NUMBER = 4;
        private static volatile Parser<RTPForwarderState> PARSER = null;
        public static final int PRE_START_TIME_FIELD_NUMBER = 3;
        public static final int REFERENCE_LAYER_SPATIAL_FIELD_NUMBER = 2;
        public static final int RTP_MUNGER_FIELD_NUMBER = 6;
        public static final int SENDER_REPORT_STATE_FIELD_NUMBER = 8;
        public static final int STARTED_FIELD_NUMBER = 1;
        public static final int VP8_MUNGER_FIELD_NUMBER = 7;
        private Object codecMunger_;
        private long dummyStartTimestampOffset_;
        private long extFirstTimestamp_;
        private long preStartTime_;
        private int referenceLayerSpatial_;
        private RTPMungerState rtpMunger_;
        private boolean started_;
        private int codecMungerCase_ = 0;
        private Internal.ProtobufList<RTCPSenderReportState> senderReportState_ = emptyProtobufList();

        private RTPForwarderState() {
        }

        public enum CodecMungerCase {
            VP8_MUNGER(7),
            CODECMUNGER_NOT_SET(0);

            private final int value;

            CodecMungerCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static CodecMungerCase valueOf(int i) {
                return forNumber(i);
            }

            public static CodecMungerCase forNumber(int i) {
                if (i == 0) {
                    return CODECMUNGER_NOT_SET;
                }
                if (i != 7) {
                    return null;
                }
                return VP8_MUNGER;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public CodecMungerCase getCodecMungerCase() {
            return CodecMungerCase.forNumber(this.codecMungerCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodecMunger() {
            this.codecMungerCase_ = 0;
            this.codecMunger_ = null;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public boolean getStarted() {
            return this.started_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarted(boolean z) {
            this.started_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarted() {
            this.started_ = false;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public int getReferenceLayerSpatial() {
            return this.referenceLayerSpatial_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReferenceLayerSpatial(int i) {
            this.referenceLayerSpatial_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReferenceLayerSpatial() {
            this.referenceLayerSpatial_ = 0;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public long getPreStartTime() {
            return this.preStartTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreStartTime(long j) {
            this.preStartTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreStartTime() {
            this.preStartTime_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public long getExtFirstTimestamp() {
            return this.extFirstTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtFirstTimestamp(long j) {
            this.extFirstTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtFirstTimestamp() {
            this.extFirstTimestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public long getDummyStartTimestampOffset() {
            return this.dummyStartTimestampOffset_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDummyStartTimestampOffset(long j) {
            this.dummyStartTimestampOffset_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDummyStartTimestampOffset() {
            this.dummyStartTimestampOffset_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public boolean hasRtpMunger() {
            return this.rtpMunger_ != null;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public RTPMungerState getRtpMunger() {
            RTPMungerState rTPMungerState = this.rtpMunger_;
            return rTPMungerState == null ? RTPMungerState.getDefaultInstance() : rTPMungerState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRtpMunger(RTPMungerState rTPMungerState) {
            rTPMungerState.getClass();
            this.rtpMunger_ = rTPMungerState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRtpMunger(RTPMungerState rTPMungerState) {
            rTPMungerState.getClass();
            RTPMungerState rTPMungerState2 = this.rtpMunger_;
            if (rTPMungerState2 != null && rTPMungerState2 != RTPMungerState.getDefaultInstance()) {
                this.rtpMunger_ = RTPMungerState.newBuilder(this.rtpMunger_).mergeFrom((RTPMungerState.Builder) rTPMungerState).buildPartial();
            } else {
                this.rtpMunger_ = rTPMungerState;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRtpMunger() {
            this.rtpMunger_ = null;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public boolean hasVp8Munger() {
            return this.codecMungerCase_ == 7;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public VP8MungerState getVp8Munger() {
            if (this.codecMungerCase_ == 7) {
                return (VP8MungerState) this.codecMunger_;
            }
            return VP8MungerState.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVp8Munger(VP8MungerState vP8MungerState) {
            vP8MungerState.getClass();
            this.codecMunger_ = vP8MungerState;
            this.codecMungerCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVp8Munger(VP8MungerState vP8MungerState) {
            vP8MungerState.getClass();
            if (this.codecMungerCase_ == 7 && this.codecMunger_ != VP8MungerState.getDefaultInstance()) {
                this.codecMunger_ = VP8MungerState.newBuilder((VP8MungerState) this.codecMunger_).mergeFrom((VP8MungerState.Builder) vP8MungerState).buildPartial();
            } else {
                this.codecMunger_ = vP8MungerState;
            }
            this.codecMungerCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVp8Munger() {
            if (this.codecMungerCase_ == 7) {
                this.codecMungerCase_ = 0;
                this.codecMunger_ = null;
            }
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public List<RTCPSenderReportState> getSenderReportStateList() {
            return this.senderReportState_;
        }

        public List<? extends RTCPSenderReportStateOrBuilder> getSenderReportStateOrBuilderList() {
            return this.senderReportState_;
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public int getSenderReportStateCount() {
            return this.senderReportState_.size();
        }

        @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
        public RTCPSenderReportState getSenderReportState(int i) {
            return this.senderReportState_.get(i);
        }

        public RTCPSenderReportStateOrBuilder getSenderReportStateOrBuilder(int i) {
            return this.senderReportState_.get(i);
        }

        private void ensureSenderReportStateIsMutable() {
            Internal.ProtobufList<RTCPSenderReportState> protobufList = this.senderReportState_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.senderReportState_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderReportState(int i, RTCPSenderReportState rTCPSenderReportState) {
            rTCPSenderReportState.getClass();
            ensureSenderReportStateIsMutable();
            this.senderReportState_.set(i, rTCPSenderReportState);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSenderReportState(RTCPSenderReportState rTCPSenderReportState) {
            rTCPSenderReportState.getClass();
            ensureSenderReportStateIsMutable();
            this.senderReportState_.add(rTCPSenderReportState);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSenderReportState(int i, RTCPSenderReportState rTCPSenderReportState) {
            rTCPSenderReportState.getClass();
            ensureSenderReportStateIsMutable();
            this.senderReportState_.add(i, rTCPSenderReportState);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSenderReportState(Iterable<? extends RTCPSenderReportState> iterable) {
            ensureSenderReportStateIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.senderReportState_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderReportState() {
            this.senderReportState_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSenderReportState(int i) {
            ensureSenderReportStateIsMutable();
            this.senderReportState_.remove(i);
        }

        public static RTPForwarderState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RTPForwarderState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RTPForwarderState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RTPForwarderState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RTPForwarderState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RTPForwarderState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RTPForwarderState parseFrom(InputStream inputStream) throws IOException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPForwarderState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPForwarderState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RTPForwarderState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPForwarderState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPForwarderState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPForwarderState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RTPForwarderState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPForwarderState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RTPForwarderState rTPForwarderState) {
            return DEFAULT_INSTANCE.createBuilder(rTPForwarderState);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RTPForwarderState, Builder> implements RTPForwarderStateOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RTPForwarderState.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public CodecMungerCase getCodecMungerCase() {
                return ((RTPForwarderState) this.instance).getCodecMungerCase();
            }

            public Builder clearCodecMunger() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearCodecMunger();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public boolean getStarted() {
                return ((RTPForwarderState) this.instance).getStarted();
            }

            public Builder setStarted(boolean z) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setStarted(z);
                return this;
            }

            public Builder clearStarted() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearStarted();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public int getReferenceLayerSpatial() {
                return ((RTPForwarderState) this.instance).getReferenceLayerSpatial();
            }

            public Builder setReferenceLayerSpatial(int i) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setReferenceLayerSpatial(i);
                return this;
            }

            public Builder clearReferenceLayerSpatial() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearReferenceLayerSpatial();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public long getPreStartTime() {
                return ((RTPForwarderState) this.instance).getPreStartTime();
            }

            public Builder setPreStartTime(long j) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setPreStartTime(j);
                return this;
            }

            public Builder clearPreStartTime() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearPreStartTime();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public long getExtFirstTimestamp() {
                return ((RTPForwarderState) this.instance).getExtFirstTimestamp();
            }

            public Builder setExtFirstTimestamp(long j) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setExtFirstTimestamp(j);
                return this;
            }

            public Builder clearExtFirstTimestamp() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearExtFirstTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public long getDummyStartTimestampOffset() {
                return ((RTPForwarderState) this.instance).getDummyStartTimestampOffset();
            }

            public Builder setDummyStartTimestampOffset(long j) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setDummyStartTimestampOffset(j);
                return this;
            }

            public Builder clearDummyStartTimestampOffset() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearDummyStartTimestampOffset();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public boolean hasRtpMunger() {
                return ((RTPForwarderState) this.instance).hasRtpMunger();
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public RTPMungerState getRtpMunger() {
                return ((RTPForwarderState) this.instance).getRtpMunger();
            }

            public Builder setRtpMunger(RTPMungerState rTPMungerState) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setRtpMunger(rTPMungerState);
                return this;
            }

            public Builder setRtpMunger(RTPMungerState.Builder builder) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setRtpMunger(builder.build());
                return this;
            }

            public Builder mergeRtpMunger(RTPMungerState rTPMungerState) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).mergeRtpMunger(rTPMungerState);
                return this;
            }

            public Builder clearRtpMunger() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearRtpMunger();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public boolean hasVp8Munger() {
                return ((RTPForwarderState) this.instance).hasVp8Munger();
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public VP8MungerState getVp8Munger() {
                return ((RTPForwarderState) this.instance).getVp8Munger();
            }

            public Builder setVp8Munger(VP8MungerState vP8MungerState) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setVp8Munger(vP8MungerState);
                return this;
            }

            public Builder setVp8Munger(VP8MungerState.Builder builder) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setVp8Munger(builder.build());
                return this;
            }

            public Builder mergeVp8Munger(VP8MungerState vP8MungerState) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).mergeVp8Munger(vP8MungerState);
                return this;
            }

            public Builder clearVp8Munger() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearVp8Munger();
                return this;
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public List<RTCPSenderReportState> getSenderReportStateList() {
                return Collections.unmodifiableList(((RTPForwarderState) this.instance).getSenderReportStateList());
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public int getSenderReportStateCount() {
                return ((RTPForwarderState) this.instance).getSenderReportStateCount();
            }

            @Override // livekit.LivekitModels.RTPForwarderStateOrBuilder
            public RTCPSenderReportState getSenderReportState(int i) {
                return ((RTPForwarderState) this.instance).getSenderReportState(i);
            }

            public Builder setSenderReportState(int i, RTCPSenderReportState rTCPSenderReportState) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setSenderReportState(i, rTCPSenderReportState);
                return this;
            }

            public Builder setSenderReportState(int i, RTCPSenderReportState.Builder builder) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).setSenderReportState(i, builder.build());
                return this;
            }

            public Builder addSenderReportState(RTCPSenderReportState rTCPSenderReportState) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).addSenderReportState(rTCPSenderReportState);
                return this;
            }

            public Builder addSenderReportState(int i, RTCPSenderReportState rTCPSenderReportState) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).addSenderReportState(i, rTCPSenderReportState);
                return this;
            }

            public Builder addSenderReportState(RTCPSenderReportState.Builder builder) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).addSenderReportState(builder.build());
                return this;
            }

            public Builder addSenderReportState(int i, RTCPSenderReportState.Builder builder) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).addSenderReportState(i, builder.build());
                return this;
            }

            public Builder addAllSenderReportState(Iterable<? extends RTCPSenderReportState> iterable) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).addAllSenderReportState(iterable);
                return this;
            }

            public Builder clearSenderReportState() {
                copyOnWrite();
                ((RTPForwarderState) this.instance).clearSenderReportState();
                return this;
            }

            public Builder removeSenderReportState(int i) {
                copyOnWrite();
                ((RTPForwarderState) this.instance).removeSenderReportState(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RTPForwarderState();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002\u0004\u0003\u0002\u0004\u0003\u0005\u0003\u0006\t\u0007<\u0000\b\u001b", new Object[]{"codecMunger_", "codecMungerCase_", "started_", "referenceLayerSpatial_", "preStartTime_", "extFirstTimestamp_", "dummyStartTimestampOffset_", "rtpMunger_", VP8MungerState.class, "senderReportState_", RTCPSenderReportState.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RTPForwarderState> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RTPForwarderState.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RTPForwarderState rTPForwarderState = new RTPForwarderState();
            DEFAULT_INSTANCE = rTPForwarderState;
            GeneratedMessageLite.registerDefaultInstance(RTPForwarderState.class, rTPForwarderState);
        }

        public static RTPForwarderState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RTPForwarderState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RTPMungerState extends GeneratedMessageLite<RTPMungerState, Builder> implements RTPMungerStateOrBuilder {
        private static final RTPMungerState DEFAULT_INSTANCE;
        public static final int EXT_LAST_SEQUENCE_NUMBER_FIELD_NUMBER = 1;
        public static final int EXT_LAST_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int EXT_SECOND_LAST_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
        public static final int EXT_SECOND_LAST_TIMESTAMP_FIELD_NUMBER = 4;
        public static final int LAST_MARKER_FIELD_NUMBER = 5;
        private static volatile Parser<RTPMungerState> PARSER = null;
        public static final int SECOND_LAST_MARKER_FIELD_NUMBER = 6;
        private long extLastSequenceNumber_;
        private long extLastTimestamp_;
        private long extSecondLastSequenceNumber_;
        private long extSecondLastTimestamp_;
        private boolean lastMarker_;
        private boolean secondLastMarker_;

        private RTPMungerState() {
        }

        @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
        public long getExtLastSequenceNumber() {
            return this.extLastSequenceNumber_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtLastSequenceNumber(long j) {
            this.extLastSequenceNumber_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtLastSequenceNumber() {
            this.extLastSequenceNumber_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
        public long getExtSecondLastSequenceNumber() {
            return this.extSecondLastSequenceNumber_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtSecondLastSequenceNumber(long j) {
            this.extSecondLastSequenceNumber_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtSecondLastSequenceNumber() {
            this.extSecondLastSequenceNumber_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
        public long getExtLastTimestamp() {
            return this.extLastTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtLastTimestamp(long j) {
            this.extLastTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtLastTimestamp() {
            this.extLastTimestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
        public long getExtSecondLastTimestamp() {
            return this.extSecondLastTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtSecondLastTimestamp(long j) {
            this.extSecondLastTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtSecondLastTimestamp() {
            this.extSecondLastTimestamp_ = 0L;
        }

        @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
        public boolean getLastMarker() {
            return this.lastMarker_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastMarker(boolean z) {
            this.lastMarker_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastMarker() {
            this.lastMarker_ = false;
        }

        @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
        public boolean getSecondLastMarker() {
            return this.secondLastMarker_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondLastMarker(boolean z) {
            this.secondLastMarker_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondLastMarker() {
            this.secondLastMarker_ = false;
        }

        public static RTPMungerState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RTPMungerState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RTPMungerState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RTPMungerState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RTPMungerState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RTPMungerState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RTPMungerState parseFrom(InputStream inputStream) throws IOException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPMungerState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPMungerState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RTPMungerState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RTPMungerState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPMungerState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RTPMungerState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RTPMungerState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RTPMungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RTPMungerState rTPMungerState) {
            return DEFAULT_INSTANCE.createBuilder(rTPMungerState);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RTPMungerState, Builder> implements RTPMungerStateOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RTPMungerState.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
            public long getExtLastSequenceNumber() {
                return ((RTPMungerState) this.instance).getExtLastSequenceNumber();
            }

            public Builder setExtLastSequenceNumber(long j) {
                copyOnWrite();
                ((RTPMungerState) this.instance).setExtLastSequenceNumber(j);
                return this;
            }

            public Builder clearExtLastSequenceNumber() {
                copyOnWrite();
                ((RTPMungerState) this.instance).clearExtLastSequenceNumber();
                return this;
            }

            @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
            public long getExtSecondLastSequenceNumber() {
                return ((RTPMungerState) this.instance).getExtSecondLastSequenceNumber();
            }

            public Builder setExtSecondLastSequenceNumber(long j) {
                copyOnWrite();
                ((RTPMungerState) this.instance).setExtSecondLastSequenceNumber(j);
                return this;
            }

            public Builder clearExtSecondLastSequenceNumber() {
                copyOnWrite();
                ((RTPMungerState) this.instance).clearExtSecondLastSequenceNumber();
                return this;
            }

            @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
            public long getExtLastTimestamp() {
                return ((RTPMungerState) this.instance).getExtLastTimestamp();
            }

            public Builder setExtLastTimestamp(long j) {
                copyOnWrite();
                ((RTPMungerState) this.instance).setExtLastTimestamp(j);
                return this;
            }

            public Builder clearExtLastTimestamp() {
                copyOnWrite();
                ((RTPMungerState) this.instance).clearExtLastTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
            public long getExtSecondLastTimestamp() {
                return ((RTPMungerState) this.instance).getExtSecondLastTimestamp();
            }

            public Builder setExtSecondLastTimestamp(long j) {
                copyOnWrite();
                ((RTPMungerState) this.instance).setExtSecondLastTimestamp(j);
                return this;
            }

            public Builder clearExtSecondLastTimestamp() {
                copyOnWrite();
                ((RTPMungerState) this.instance).clearExtSecondLastTimestamp();
                return this;
            }

            @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
            public boolean getLastMarker() {
                return ((RTPMungerState) this.instance).getLastMarker();
            }

            public Builder setLastMarker(boolean z) {
                copyOnWrite();
                ((RTPMungerState) this.instance).setLastMarker(z);
                return this;
            }

            public Builder clearLastMarker() {
                copyOnWrite();
                ((RTPMungerState) this.instance).clearLastMarker();
                return this;
            }

            @Override // livekit.LivekitModels.RTPMungerStateOrBuilder
            public boolean getSecondLastMarker() {
                return ((RTPMungerState) this.instance).getSecondLastMarker();
            }

            public Builder setSecondLastMarker(boolean z) {
                copyOnWrite();
                ((RTPMungerState) this.instance).setSecondLastMarker(z);
                return this;
            }

            public Builder clearSecondLastMarker() {
                copyOnWrite();
                ((RTPMungerState) this.instance).clearSecondLastMarker();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RTPMungerState();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0003\u0005\u0007\u0006\u0007", new Object[]{"extLastSequenceNumber_", "extSecondLastSequenceNumber_", "extLastTimestamp_", "extSecondLastTimestamp_", "lastMarker_", "secondLastMarker_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RTPMungerState> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (RTPMungerState.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RTPMungerState rTPMungerState = new RTPMungerState();
            DEFAULT_INSTANCE = rTPMungerState;
            GeneratedMessageLite.registerDefaultInstance(RTPMungerState.class, rTPMungerState);
        }

        public static RTPMungerState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RTPMungerState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class VP8MungerState extends GeneratedMessageLite<VP8MungerState, Builder> implements VP8MungerStateOrBuilder {
        private static final VP8MungerState DEFAULT_INSTANCE;
        public static final int EXT_LAST_PICTURE_ID_FIELD_NUMBER = 1;
        public static final int KEY_IDX_USED_FIELD_NUMBER = 7;
        public static final int LAST_KEY_IDX_FIELD_NUMBER = 6;
        public static final int LAST_TL0_PIC_IDX_FIELD_NUMBER = 3;
        private static volatile Parser<VP8MungerState> PARSER = null;
        public static final int PICTURE_ID_USED_FIELD_NUMBER = 2;
        public static final int TID_USED_FIELD_NUMBER = 5;
        public static final int TL0_PIC_IDX_USED_FIELD_NUMBER = 4;
        private int extLastPictureId_;
        private boolean keyIdxUsed_;
        private int lastKeyIdx_;
        private int lastTl0PicIdx_;
        private boolean pictureIdUsed_;
        private boolean tidUsed_;
        private boolean tl0PicIdxUsed_;

        private VP8MungerState() {
        }

        @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
        public int getExtLastPictureId() {
            return this.extLastPictureId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtLastPictureId(int i) {
            this.extLastPictureId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtLastPictureId() {
            this.extLastPictureId_ = 0;
        }

        @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
        public boolean getPictureIdUsed() {
            return this.pictureIdUsed_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPictureIdUsed(boolean z) {
            this.pictureIdUsed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPictureIdUsed() {
            this.pictureIdUsed_ = false;
        }

        @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
        public int getLastTl0PicIdx() {
            return this.lastTl0PicIdx_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastTl0PicIdx(int i) {
            this.lastTl0PicIdx_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastTl0PicIdx() {
            this.lastTl0PicIdx_ = 0;
        }

        @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
        public boolean getTl0PicIdxUsed() {
            return this.tl0PicIdxUsed_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTl0PicIdxUsed(boolean z) {
            this.tl0PicIdxUsed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTl0PicIdxUsed() {
            this.tl0PicIdxUsed_ = false;
        }

        @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
        public boolean getTidUsed() {
            return this.tidUsed_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTidUsed(boolean z) {
            this.tidUsed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTidUsed() {
            this.tidUsed_ = false;
        }

        @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
        public int getLastKeyIdx() {
            return this.lastKeyIdx_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastKeyIdx(int i) {
            this.lastKeyIdx_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastKeyIdx() {
            this.lastKeyIdx_ = 0;
        }

        @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
        public boolean getKeyIdxUsed() {
            return this.keyIdxUsed_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyIdxUsed(boolean z) {
            this.keyIdxUsed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyIdxUsed() {
            this.keyIdxUsed_ = false;
        }

        public static VP8MungerState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static VP8MungerState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VP8MungerState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VP8MungerState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VP8MungerState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VP8MungerState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VP8MungerState parseFrom(InputStream inputStream) throws IOException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VP8MungerState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VP8MungerState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VP8MungerState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VP8MungerState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VP8MungerState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VP8MungerState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VP8MungerState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VP8MungerState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(VP8MungerState vP8MungerState) {
            return DEFAULT_INSTANCE.createBuilder(vP8MungerState);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VP8MungerState, Builder> implements VP8MungerStateOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(VP8MungerState.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
            public int getExtLastPictureId() {
                return ((VP8MungerState) this.instance).getExtLastPictureId();
            }

            public Builder setExtLastPictureId(int i) {
                copyOnWrite();
                ((VP8MungerState) this.instance).setExtLastPictureId(i);
                return this;
            }

            public Builder clearExtLastPictureId() {
                copyOnWrite();
                ((VP8MungerState) this.instance).clearExtLastPictureId();
                return this;
            }

            @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
            public boolean getPictureIdUsed() {
                return ((VP8MungerState) this.instance).getPictureIdUsed();
            }

            public Builder setPictureIdUsed(boolean z) {
                copyOnWrite();
                ((VP8MungerState) this.instance).setPictureIdUsed(z);
                return this;
            }

            public Builder clearPictureIdUsed() {
                copyOnWrite();
                ((VP8MungerState) this.instance).clearPictureIdUsed();
                return this;
            }

            @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
            public int getLastTl0PicIdx() {
                return ((VP8MungerState) this.instance).getLastTl0PicIdx();
            }

            public Builder setLastTl0PicIdx(int i) {
                copyOnWrite();
                ((VP8MungerState) this.instance).setLastTl0PicIdx(i);
                return this;
            }

            public Builder clearLastTl0PicIdx() {
                copyOnWrite();
                ((VP8MungerState) this.instance).clearLastTl0PicIdx();
                return this;
            }

            @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
            public boolean getTl0PicIdxUsed() {
                return ((VP8MungerState) this.instance).getTl0PicIdxUsed();
            }

            public Builder setTl0PicIdxUsed(boolean z) {
                copyOnWrite();
                ((VP8MungerState) this.instance).setTl0PicIdxUsed(z);
                return this;
            }

            public Builder clearTl0PicIdxUsed() {
                copyOnWrite();
                ((VP8MungerState) this.instance).clearTl0PicIdxUsed();
                return this;
            }

            @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
            public boolean getTidUsed() {
                return ((VP8MungerState) this.instance).getTidUsed();
            }

            public Builder setTidUsed(boolean z) {
                copyOnWrite();
                ((VP8MungerState) this.instance).setTidUsed(z);
                return this;
            }

            public Builder clearTidUsed() {
                copyOnWrite();
                ((VP8MungerState) this.instance).clearTidUsed();
                return this;
            }

            @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
            public int getLastKeyIdx() {
                return ((VP8MungerState) this.instance).getLastKeyIdx();
            }

            public Builder setLastKeyIdx(int i) {
                copyOnWrite();
                ((VP8MungerState) this.instance).setLastKeyIdx(i);
                return this;
            }

            public Builder clearLastKeyIdx() {
                copyOnWrite();
                ((VP8MungerState) this.instance).clearLastKeyIdx();
                return this;
            }

            @Override // livekit.LivekitModels.VP8MungerStateOrBuilder
            public boolean getKeyIdxUsed() {
                return ((VP8MungerState) this.instance).getKeyIdxUsed();
            }

            public Builder setKeyIdxUsed(boolean z) {
                copyOnWrite();
                ((VP8MungerState) this.instance).setKeyIdxUsed(z);
                return this;
            }

            public Builder clearKeyIdxUsed() {
                copyOnWrite();
                ((VP8MungerState) this.instance).clearKeyIdxUsed();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new VP8MungerState();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u000b\u0004\u0007\u0005\u0007\u0006\u000b\u0007\u0007", new Object[]{"extLastPictureId_", "pictureIdUsed_", "lastTl0PicIdx_", "tl0PicIdxUsed_", "tidUsed_", "lastKeyIdx_", "keyIdxUsed_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VP8MungerState> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (VP8MungerState.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            VP8MungerState vP8MungerState = new VP8MungerState();
            DEFAULT_INSTANCE = vP8MungerState;
            GeneratedMessageLite.registerDefaultInstance(VP8MungerState.class, vP8MungerState);
        }

        public static VP8MungerState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<VP8MungerState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class TimedVersion extends GeneratedMessageLite<TimedVersion, Builder> implements TimedVersionOrBuilder {
        private static final TimedVersion DEFAULT_INSTANCE;
        private static volatile Parser<TimedVersion> PARSER = null;
        public static final int TICKS_FIELD_NUMBER = 2;
        public static final int UNIX_MICRO_FIELD_NUMBER = 1;
        private int ticks_;
        private long unixMicro_;

        private TimedVersion() {
        }

        @Override // livekit.LivekitModels.TimedVersionOrBuilder
        public long getUnixMicro() {
            return this.unixMicro_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnixMicro(long j) {
            this.unixMicro_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnixMicro() {
            this.unixMicro_ = 0L;
        }

        @Override // livekit.LivekitModels.TimedVersionOrBuilder
        public int getTicks() {
            return this.ticks_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTicks(int i) {
            this.ticks_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTicks() {
            this.ticks_ = 0;
        }

        public static TimedVersion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TimedVersion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TimedVersion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimedVersion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TimedVersion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimedVersion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TimedVersion parseFrom(InputStream inputStream) throws IOException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimedVersion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimedVersion parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimedVersion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimedVersion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimedVersion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimedVersion parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TimedVersion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimedVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TimedVersion timedVersion) {
            return DEFAULT_INSTANCE.createBuilder(timedVersion);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TimedVersion, Builder> implements TimedVersionOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(TimedVersion.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.TimedVersionOrBuilder
            public long getUnixMicro() {
                return ((TimedVersion) this.instance).getUnixMicro();
            }

            public Builder setUnixMicro(long j) {
                copyOnWrite();
                ((TimedVersion) this.instance).setUnixMicro(j);
                return this;
            }

            public Builder clearUnixMicro() {
                copyOnWrite();
                ((TimedVersion) this.instance).clearUnixMicro();
                return this;
            }

            @Override // livekit.LivekitModels.TimedVersionOrBuilder
            public int getTicks() {
                return ((TimedVersion) this.instance).getTicks();
            }

            public Builder setTicks(int i) {
                copyOnWrite();
                ((TimedVersion) this.instance).setTicks(i);
                return this;
            }

            public Builder clearTicks() {
                copyOnWrite();
                ((TimedVersion) this.instance).clearTicks();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimedVersion();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"unixMicro_", "ticks_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimedVersion> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (TimedVersion.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            TimedVersion timedVersion = new TimedVersion();
            DEFAULT_INSTANCE = timedVersion;
            GeneratedMessageLite.registerDefaultInstance(TimedVersion.class, timedVersion);
        }

        public static TimedVersion getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TimedVersion> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DataStream extends GeneratedMessageLite<DataStream, Builder> implements DataStreamOrBuilder {
        private static final DataStream DEFAULT_INSTANCE;
        private static volatile Parser<DataStream> PARSER;

        public interface ByteHeaderOrBuilder extends MessageLiteOrBuilder {
            String getName();

            ByteString getNameBytes();
        }

        public interface ChunkOrBuilder extends MessageLiteOrBuilder {
            long getChunkIndex();

            ByteString getContent();

            @Deprecated
            ByteString getIv();

            String getStreamId();

            ByteString getStreamIdBytes();

            int getVersion();

            @Deprecated
            boolean hasIv();
        }

        public interface HeaderOrBuilder extends MessageLiteOrBuilder {
            boolean containsAttributes(String str);

            @Deprecated
            Map<String, String> getAttributes();

            int getAttributesCount();

            Map<String, String> getAttributesMap();

            String getAttributesOrDefault(String str, String str2);

            String getAttributesOrThrow(String str);

            ByteHeader getByteHeader();

            Header.ContentHeaderCase getContentHeaderCase();

            @Deprecated
            Encryption.Type getEncryptionType();

            @Deprecated
            int getEncryptionTypeValue();

            String getMimeType();

            ByteString getMimeTypeBytes();

            String getStreamId();

            ByteString getStreamIdBytes();

            TextHeader getTextHeader();

            long getTimestamp();

            String getTopic();

            ByteString getTopicBytes();

            long getTotalLength();

            boolean hasByteHeader();

            boolean hasTextHeader();

            boolean hasTotalLength();
        }

        public interface TextHeaderOrBuilder extends MessageLiteOrBuilder {
            String getAttachedStreamIds(int i);

            ByteString getAttachedStreamIdsBytes(int i);

            int getAttachedStreamIdsCount();

            List<String> getAttachedStreamIdsList();

            boolean getGenerated();

            OperationType getOperationType();

            int getOperationTypeValue();

            String getReplyToStreamId();

            ByteString getReplyToStreamIdBytes();

            int getVersion();
        }

        public interface TrailerOrBuilder extends MessageLiteOrBuilder {
            boolean containsAttributes(String str);

            @Deprecated
            Map<String, String> getAttributes();

            int getAttributesCount();

            Map<String, String> getAttributesMap();

            String getAttributesOrDefault(String str, String str2);

            String getAttributesOrThrow(String str);

            String getReason();

            ByteString getReasonBytes();

            String getStreamId();

            ByteString getStreamIdBytes();
        }

        private DataStream() {
        }

        public enum OperationType implements Internal.EnumLite {
            CREATE(0),
            UPDATE(1),
            DELETE(2),
            REACTION(3),
            UNRECOGNIZED(-1);

            public static final int CREATE_VALUE = 0;
            public static final int DELETE_VALUE = 2;
            public static final int REACTION_VALUE = 3;
            public static final int UPDATE_VALUE = 1;
            private static final Internal.EnumLiteMap<OperationType> internalValueMap = new Internal.EnumLiteMap<OperationType>() { // from class: livekit.LivekitModels.DataStream.OperationType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OperationType findValueByNumber(int i) {
                    return OperationType.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static OperationType valueOf(int i) {
                return forNumber(i);
            }

            public static OperationType forNumber(int i) {
                if (i == 0) {
                    return CREATE;
                }
                if (i == 1) {
                    return UPDATE;
                }
                if (i == 2) {
                    return DELETE;
                }
                if (i != 3) {
                    return null;
                }
                return REACTION;
            }

            public static Internal.EnumLiteMap<OperationType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OperationTypeVerifier.INSTANCE;
            }

            private static final class OperationTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OperationTypeVerifier();

                private OperationTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return OperationType.forNumber(i) != null;
                }
            }

            OperationType(int i) {
                this.value = i;
            }
        }

        public static final class TextHeader extends GeneratedMessageLite<TextHeader, Builder> implements TextHeaderOrBuilder {
            public static final int ATTACHED_STREAM_IDS_FIELD_NUMBER = 4;
            private static final TextHeader DEFAULT_INSTANCE;
            public static final int GENERATED_FIELD_NUMBER = 5;
            public static final int OPERATION_TYPE_FIELD_NUMBER = 1;
            private static volatile Parser<TextHeader> PARSER = null;
            public static final int REPLY_TO_STREAM_ID_FIELD_NUMBER = 3;
            public static final int VERSION_FIELD_NUMBER = 2;
            private boolean generated_;
            private int operationType_;
            private int version_;
            private String replyToStreamId_ = "";
            private Internal.ProtobufList<String> attachedStreamIds_ = GeneratedMessageLite.emptyProtobufList();

            private TextHeader() {
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public int getOperationTypeValue() {
                return this.operationType_;
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public OperationType getOperationType() {
                OperationType forNumber = OperationType.forNumber(this.operationType_);
                return forNumber == null ? OperationType.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOperationTypeValue(int i) {
                this.operationType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOperationType(OperationType operationType) {
                this.operationType_ = operationType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOperationType() {
                this.operationType_ = 0;
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public int getVersion() {
                return this.version_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVersion(int i) {
                this.version_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVersion() {
                this.version_ = 0;
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public String getReplyToStreamId() {
                return this.replyToStreamId_;
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public ByteString getReplyToStreamIdBytes() {
                return ByteString.copyFromUtf8(this.replyToStreamId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReplyToStreamId(String str) {
                str.getClass();
                this.replyToStreamId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReplyToStreamId() {
                this.replyToStreamId_ = getDefaultInstance().getReplyToStreamId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReplyToStreamIdBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.replyToStreamId_ = byteString.toStringUtf8();
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public List<String> getAttachedStreamIdsList() {
                return this.attachedStreamIds_;
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public int getAttachedStreamIdsCount() {
                return this.attachedStreamIds_.size();
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public String getAttachedStreamIds(int i) {
                return this.attachedStreamIds_.get(i);
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public ByteString getAttachedStreamIdsBytes(int i) {
                return ByteString.copyFromUtf8(this.attachedStreamIds_.get(i));
            }

            private void ensureAttachedStreamIdsIsMutable() {
                Internal.ProtobufList<String> protobufList = this.attachedStreamIds_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.attachedStreamIds_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAttachedStreamIds(int i, String str) {
                str.getClass();
                ensureAttachedStreamIdsIsMutable();
                this.attachedStreamIds_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAttachedStreamIds(String str) {
                str.getClass();
                ensureAttachedStreamIdsIsMutable();
                this.attachedStreamIds_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllAttachedStreamIds(Iterable<String> iterable) {
                ensureAttachedStreamIdsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.attachedStreamIds_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAttachedStreamIds() {
                this.attachedStreamIds_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAttachedStreamIdsBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                ensureAttachedStreamIdsIsMutable();
                this.attachedStreamIds_.add(byteString.toStringUtf8());
            }

            @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
            public boolean getGenerated() {
                return this.generated_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGenerated(boolean z) {
                this.generated_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGenerated() {
                this.generated_ = false;
            }

            public static TextHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static TextHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TextHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TextHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TextHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TextHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TextHeader parseFrom(InputStream inputStream) throws IOException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TextHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TextHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (TextHeader) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TextHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (TextHeader) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TextHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TextHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (TextHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(TextHeader textHeader) {
                return DEFAULT_INSTANCE.createBuilder(textHeader);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<TextHeader, Builder> implements TextHeaderOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(TextHeader.DEFAULT_INSTANCE);
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public int getOperationTypeValue() {
                    return ((TextHeader) this.instance).getOperationTypeValue();
                }

                public Builder setOperationTypeValue(int i) {
                    copyOnWrite();
                    ((TextHeader) this.instance).setOperationTypeValue(i);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public OperationType getOperationType() {
                    return ((TextHeader) this.instance).getOperationType();
                }

                public Builder setOperationType(OperationType operationType) {
                    copyOnWrite();
                    ((TextHeader) this.instance).setOperationType(operationType);
                    return this;
                }

                public Builder clearOperationType() {
                    copyOnWrite();
                    ((TextHeader) this.instance).clearOperationType();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public int getVersion() {
                    return ((TextHeader) this.instance).getVersion();
                }

                public Builder setVersion(int i) {
                    copyOnWrite();
                    ((TextHeader) this.instance).setVersion(i);
                    return this;
                }

                public Builder clearVersion() {
                    copyOnWrite();
                    ((TextHeader) this.instance).clearVersion();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public String getReplyToStreamId() {
                    return ((TextHeader) this.instance).getReplyToStreamId();
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public ByteString getReplyToStreamIdBytes() {
                    return ((TextHeader) this.instance).getReplyToStreamIdBytes();
                }

                public Builder setReplyToStreamId(String str) {
                    copyOnWrite();
                    ((TextHeader) this.instance).setReplyToStreamId(str);
                    return this;
                }

                public Builder clearReplyToStreamId() {
                    copyOnWrite();
                    ((TextHeader) this.instance).clearReplyToStreamId();
                    return this;
                }

                public Builder setReplyToStreamIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((TextHeader) this.instance).setReplyToStreamIdBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public List<String> getAttachedStreamIdsList() {
                    return Collections.unmodifiableList(((TextHeader) this.instance).getAttachedStreamIdsList());
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public int getAttachedStreamIdsCount() {
                    return ((TextHeader) this.instance).getAttachedStreamIdsCount();
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public String getAttachedStreamIds(int i) {
                    return ((TextHeader) this.instance).getAttachedStreamIds(i);
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public ByteString getAttachedStreamIdsBytes(int i) {
                    return ((TextHeader) this.instance).getAttachedStreamIdsBytes(i);
                }

                public Builder setAttachedStreamIds(int i, String str) {
                    copyOnWrite();
                    ((TextHeader) this.instance).setAttachedStreamIds(i, str);
                    return this;
                }

                public Builder addAttachedStreamIds(String str) {
                    copyOnWrite();
                    ((TextHeader) this.instance).addAttachedStreamIds(str);
                    return this;
                }

                public Builder addAllAttachedStreamIds(Iterable<String> iterable) {
                    copyOnWrite();
                    ((TextHeader) this.instance).addAllAttachedStreamIds(iterable);
                    return this;
                }

                public Builder clearAttachedStreamIds() {
                    copyOnWrite();
                    ((TextHeader) this.instance).clearAttachedStreamIds();
                    return this;
                }

                public Builder addAttachedStreamIdsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((TextHeader) this.instance).addAttachedStreamIdsBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TextHeaderOrBuilder
                public boolean getGenerated() {
                    return ((TextHeader) this.instance).getGenerated();
                }

                public Builder setGenerated(boolean z) {
                    copyOnWrite();
                    ((TextHeader) this.instance).setGenerated(z);
                    return this;
                }

                public Builder clearGenerated() {
                    copyOnWrite();
                    ((TextHeader) this.instance).clearGenerated();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TextHeader();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003Ȉ\u0004Ț\u0005\u0007", new Object[]{"operationType_", "version_", "replyToStreamId_", "attachedStreamIds_", "generated_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TextHeader> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (TextHeader.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                TextHeader textHeader = new TextHeader();
                DEFAULT_INSTANCE = textHeader;
                GeneratedMessageLite.registerDefaultInstance(TextHeader.class, textHeader);
            }

            public static TextHeader getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<TextHeader> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class ByteHeader extends GeneratedMessageLite<ByteHeader, Builder> implements ByteHeaderOrBuilder {
            private static final ByteHeader DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile Parser<ByteHeader> PARSER;
            private String name_ = "";

            private ByteHeader() {
            }

            @Override // livekit.LivekitModels.DataStream.ByteHeaderOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // livekit.LivekitModels.DataStream.ByteHeaderOrBuilder
            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(String str) {
                str.getClass();
                this.name_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            public static ByteHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static ByteHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ByteHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ByteHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ByteHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ByteHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ByteHeader parseFrom(InputStream inputStream) throws IOException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ByteHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ByteHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ByteHeader) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ByteHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ByteHeader) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ByteHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ByteHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ByteHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(ByteHeader byteHeader) {
                return DEFAULT_INSTANCE.createBuilder(byteHeader);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<ByteHeader, Builder> implements ByteHeaderOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(ByteHeader.DEFAULT_INSTANCE);
                }

                @Override // livekit.LivekitModels.DataStream.ByteHeaderOrBuilder
                public String getName() {
                    return ((ByteHeader) this.instance).getName();
                }

                @Override // livekit.LivekitModels.DataStream.ByteHeaderOrBuilder
                public ByteString getNameBytes() {
                    return ((ByteHeader) this.instance).getNameBytes();
                }

                public Builder setName(String str) {
                    copyOnWrite();
                    ((ByteHeader) this.instance).setName(str);
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((ByteHeader) this.instance).clearName();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ByteHeader) this.instance).setNameBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ByteHeader();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ByteHeader> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (ByteHeader.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                ByteHeader byteHeader = new ByteHeader();
                DEFAULT_INSTANCE = byteHeader;
                GeneratedMessageLite.registerDefaultInstance(ByteHeader.class, byteHeader);
            }

            public static ByteHeader getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<ByteHeader> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Header extends GeneratedMessageLite<Header, Builder> implements HeaderOrBuilder {
            public static final int ATTRIBUTES_FIELD_NUMBER = 8;
            public static final int BYTE_HEADER_FIELD_NUMBER = 10;
            private static final Header DEFAULT_INSTANCE;
            public static final int ENCRYPTION_TYPE_FIELD_NUMBER = 7;
            public static final int MIME_TYPE_FIELD_NUMBER = 4;
            private static volatile Parser<Header> PARSER = null;
            public static final int STREAM_ID_FIELD_NUMBER = 1;
            public static final int TEXT_HEADER_FIELD_NUMBER = 9;
            public static final int TIMESTAMP_FIELD_NUMBER = 2;
            public static final int TOPIC_FIELD_NUMBER = 3;
            public static final int TOTAL_LENGTH_FIELD_NUMBER = 5;
            private int bitField0_;
            private Object contentHeader_;
            private int encryptionType_;
            private long timestamp_;
            private long totalLength_;
            private int contentHeaderCase_ = 0;
            private MapFieldLite<String, String> attributes_ = MapFieldLite.emptyMapField();
            private String streamId_ = "";
            private String topic_ = "";
            private String mimeType_ = "";

            private Header() {
            }

            public enum ContentHeaderCase {
                TEXT_HEADER(9),
                BYTE_HEADER(10),
                CONTENTHEADER_NOT_SET(0);

                private final int value;

                ContentHeaderCase(int i) {
                    this.value = i;
                }

                @Deprecated
                public static ContentHeaderCase valueOf(int i) {
                    return forNumber(i);
                }

                public static ContentHeaderCase forNumber(int i) {
                    if (i == 0) {
                        return CONTENTHEADER_NOT_SET;
                    }
                    if (i == 9) {
                        return TEXT_HEADER;
                    }
                    if (i != 10) {
                        return null;
                    }
                    return BYTE_HEADER;
                }

                public int getNumber() {
                    return this.value;
                }
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public ContentHeaderCase getContentHeaderCase() {
                return ContentHeaderCase.forNumber(this.contentHeaderCase_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContentHeader() {
                this.contentHeaderCase_ = 0;
                this.contentHeader_ = null;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public String getStreamId() {
                return this.streamId_;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public ByteString getStreamIdBytes() {
                return ByteString.copyFromUtf8(this.streamId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStreamId() {
                this.streamId_ = getDefaultInstance().getStreamId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStreamIdBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.streamId_ = byteString.toStringUtf8();
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTimestamp(long j) {
                this.timestamp_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTimestamp() {
                this.timestamp_ = 0L;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public String getTopic() {
                return this.topic_;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public ByteString getTopicBytes() {
                return ByteString.copyFromUtf8(this.topic_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTopic(String str) {
                str.getClass();
                this.topic_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTopic() {
                this.topic_ = getDefaultInstance().getTopic();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTopicBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.topic_ = byteString.toStringUtf8();
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public String getMimeType() {
                return this.mimeType_;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public ByteString getMimeTypeBytes() {
                return ByteString.copyFromUtf8(this.mimeType_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMimeType(String str) {
                str.getClass();
                this.mimeType_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMimeType() {
                this.mimeType_ = getDefaultInstance().getMimeType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMimeTypeBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.mimeType_ = byteString.toStringUtf8();
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public boolean hasTotalLength() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public long getTotalLength() {
                return this.totalLength_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTotalLength(long j) {
                this.bitField0_ |= 1;
                this.totalLength_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTotalLength() {
                this.bitField0_ &= -2;
                this.totalLength_ = 0L;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            @Deprecated
            public int getEncryptionTypeValue() {
                return this.encryptionType_;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            @Deprecated
            public Encryption.Type getEncryptionType() {
                Encryption.Type forNumber = Encryption.Type.forNumber(this.encryptionType_);
                return forNumber == null ? Encryption.Type.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEncryptionTypeValue(int i) {
                this.encryptionType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEncryptionType(Encryption.Type type) {
                this.encryptionType_ = type.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEncryptionType() {
                this.encryptionType_ = 0;
            }

            private static final class AttributesDefaultEntryHolder {
                static final MapEntryLite<String, String> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

                private AttributesDefaultEntryHolder() {
                }
            }

            private MapFieldLite<String, String> internalGetAttributes() {
                return this.attributes_;
            }

            private MapFieldLite<String, String> internalGetMutableAttributes() {
                if (!this.attributes_.isMutable()) {
                    this.attributes_ = this.attributes_.mutableCopy();
                }
                return this.attributes_;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public int getAttributesCount() {
                return internalGetAttributes().size();
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public boolean containsAttributes(String str) {
                str.getClass();
                return internalGetAttributes().containsKey(str);
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            @Deprecated
            public Map<String, String> getAttributes() {
                return getAttributesMap();
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public Map<String, String> getAttributesMap() {
                return Collections.unmodifiableMap(internalGetAttributes());
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public String getAttributesOrDefault(String str, String str2) {
                str.getClass();
                MapFieldLite<String, String> internalGetAttributes = internalGetAttributes();
                return internalGetAttributes.containsKey(str) ? internalGetAttributes.get(str) : str2;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public String getAttributesOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, String> internalGetAttributes = internalGetAttributes();
                if (!internalGetAttributes.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return internalGetAttributes.get(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Map<String, String> getMutableAttributesMap() {
                return internalGetMutableAttributes();
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public boolean hasTextHeader() {
                return this.contentHeaderCase_ == 9;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public TextHeader getTextHeader() {
                if (this.contentHeaderCase_ == 9) {
                    return (TextHeader) this.contentHeader_;
                }
                return TextHeader.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTextHeader(TextHeader textHeader) {
                textHeader.getClass();
                this.contentHeader_ = textHeader;
                this.contentHeaderCase_ = 9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeTextHeader(TextHeader textHeader) {
                textHeader.getClass();
                if (this.contentHeaderCase_ == 9 && this.contentHeader_ != TextHeader.getDefaultInstance()) {
                    this.contentHeader_ = TextHeader.newBuilder((TextHeader) this.contentHeader_).mergeFrom((TextHeader.Builder) textHeader).buildPartial();
                } else {
                    this.contentHeader_ = textHeader;
                }
                this.contentHeaderCase_ = 9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTextHeader() {
                if (this.contentHeaderCase_ == 9) {
                    this.contentHeaderCase_ = 0;
                    this.contentHeader_ = null;
                }
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public boolean hasByteHeader() {
                return this.contentHeaderCase_ == 10;
            }

            @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
            public ByteHeader getByteHeader() {
                if (this.contentHeaderCase_ == 10) {
                    return (ByteHeader) this.contentHeader_;
                }
                return ByteHeader.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setByteHeader(ByteHeader byteHeader) {
                byteHeader.getClass();
                this.contentHeader_ = byteHeader;
                this.contentHeaderCase_ = 10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeByteHeader(ByteHeader byteHeader) {
                byteHeader.getClass();
                if (this.contentHeaderCase_ == 10 && this.contentHeader_ != ByteHeader.getDefaultInstance()) {
                    this.contentHeader_ = ByteHeader.newBuilder((ByteHeader) this.contentHeader_).mergeFrom((ByteHeader.Builder) byteHeader).buildPartial();
                } else {
                    this.contentHeader_ = byteHeader;
                }
                this.contentHeaderCase_ = 10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearByteHeader() {
                if (this.contentHeaderCase_ == 10) {
                    this.contentHeaderCase_ = 0;
                    this.contentHeader_ = null;
                }
            }

            public static Header parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Header parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Header parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Header parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Header parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Header parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Header parseFrom(InputStream inputStream) throws IOException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Header parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Header parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Header) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Header parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Header) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Header parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Header parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Header header) {
                return DEFAULT_INSTANCE.createBuilder(header);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Header, Builder> implements HeaderOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(Header.DEFAULT_INSTANCE);
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public ContentHeaderCase getContentHeaderCase() {
                    return ((Header) this.instance).getContentHeaderCase();
                }

                public Builder clearContentHeader() {
                    copyOnWrite();
                    ((Header) this.instance).clearContentHeader();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public String getStreamId() {
                    return ((Header) this.instance).getStreamId();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public ByteString getStreamIdBytes() {
                    return ((Header) this.instance).getStreamIdBytes();
                }

                public Builder setStreamId(String str) {
                    copyOnWrite();
                    ((Header) this.instance).setStreamId(str);
                    return this;
                }

                public Builder clearStreamId() {
                    copyOnWrite();
                    ((Header) this.instance).clearStreamId();
                    return this;
                }

                public Builder setStreamIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Header) this.instance).setStreamIdBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public long getTimestamp() {
                    return ((Header) this.instance).getTimestamp();
                }

                public Builder setTimestamp(long j) {
                    copyOnWrite();
                    ((Header) this.instance).setTimestamp(j);
                    return this;
                }

                public Builder clearTimestamp() {
                    copyOnWrite();
                    ((Header) this.instance).clearTimestamp();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public String getTopic() {
                    return ((Header) this.instance).getTopic();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public ByteString getTopicBytes() {
                    return ((Header) this.instance).getTopicBytes();
                }

                public Builder setTopic(String str) {
                    copyOnWrite();
                    ((Header) this.instance).setTopic(str);
                    return this;
                }

                public Builder clearTopic() {
                    copyOnWrite();
                    ((Header) this.instance).clearTopic();
                    return this;
                }

                public Builder setTopicBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Header) this.instance).setTopicBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public String getMimeType() {
                    return ((Header) this.instance).getMimeType();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public ByteString getMimeTypeBytes() {
                    return ((Header) this.instance).getMimeTypeBytes();
                }

                public Builder setMimeType(String str) {
                    copyOnWrite();
                    ((Header) this.instance).setMimeType(str);
                    return this;
                }

                public Builder clearMimeType() {
                    copyOnWrite();
                    ((Header) this.instance).clearMimeType();
                    return this;
                }

                public Builder setMimeTypeBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Header) this.instance).setMimeTypeBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public boolean hasTotalLength() {
                    return ((Header) this.instance).hasTotalLength();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public long getTotalLength() {
                    return ((Header) this.instance).getTotalLength();
                }

                public Builder setTotalLength(long j) {
                    copyOnWrite();
                    ((Header) this.instance).setTotalLength(j);
                    return this;
                }

                public Builder clearTotalLength() {
                    copyOnWrite();
                    ((Header) this.instance).clearTotalLength();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                @Deprecated
                public int getEncryptionTypeValue() {
                    return ((Header) this.instance).getEncryptionTypeValue();
                }

                @Deprecated
                public Builder setEncryptionTypeValue(int i) {
                    copyOnWrite();
                    ((Header) this.instance).setEncryptionTypeValue(i);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                @Deprecated
                public Encryption.Type getEncryptionType() {
                    return ((Header) this.instance).getEncryptionType();
                }

                @Deprecated
                public Builder setEncryptionType(Encryption.Type type) {
                    copyOnWrite();
                    ((Header) this.instance).setEncryptionType(type);
                    return this;
                }

                @Deprecated
                public Builder clearEncryptionType() {
                    copyOnWrite();
                    ((Header) this.instance).clearEncryptionType();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public int getAttributesCount() {
                    return ((Header) this.instance).getAttributesMap().size();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public boolean containsAttributes(String str) {
                    str.getClass();
                    return ((Header) this.instance).getAttributesMap().containsKey(str);
                }

                public Builder clearAttributes() {
                    copyOnWrite();
                    ((Header) this.instance).getMutableAttributesMap().clear();
                    return this;
                }

                public Builder removeAttributes(String str) {
                    str.getClass();
                    copyOnWrite();
                    ((Header) this.instance).getMutableAttributesMap().remove(str);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                @Deprecated
                public Map<String, String> getAttributes() {
                    return getAttributesMap();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public Map<String, String> getAttributesMap() {
                    return Collections.unmodifiableMap(((Header) this.instance).getAttributesMap());
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public String getAttributesOrDefault(String str, String str2) {
                    str.getClass();
                    Map<String, String> attributesMap = ((Header) this.instance).getAttributesMap();
                    return attributesMap.containsKey(str) ? attributesMap.get(str) : str2;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public String getAttributesOrThrow(String str) {
                    str.getClass();
                    Map<String, String> attributesMap = ((Header) this.instance).getAttributesMap();
                    if (!attributesMap.containsKey(str)) {
                        throw new IllegalArgumentException();
                    }
                    return attributesMap.get(str);
                }

                public Builder putAttributes(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    copyOnWrite();
                    ((Header) this.instance).getMutableAttributesMap().put(str, str2);
                    return this;
                }

                public Builder putAllAttributes(Map<String, String> map) {
                    copyOnWrite();
                    ((Header) this.instance).getMutableAttributesMap().putAll(map);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public boolean hasTextHeader() {
                    return ((Header) this.instance).hasTextHeader();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public TextHeader getTextHeader() {
                    return ((Header) this.instance).getTextHeader();
                }

                public Builder setTextHeader(TextHeader textHeader) {
                    copyOnWrite();
                    ((Header) this.instance).setTextHeader(textHeader);
                    return this;
                }

                public Builder setTextHeader(TextHeader.Builder builder) {
                    copyOnWrite();
                    ((Header) this.instance).setTextHeader(builder.build());
                    return this;
                }

                public Builder mergeTextHeader(TextHeader textHeader) {
                    copyOnWrite();
                    ((Header) this.instance).mergeTextHeader(textHeader);
                    return this;
                }

                public Builder clearTextHeader() {
                    copyOnWrite();
                    ((Header) this.instance).clearTextHeader();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public boolean hasByteHeader() {
                    return ((Header) this.instance).hasByteHeader();
                }

                @Override // livekit.LivekitModels.DataStream.HeaderOrBuilder
                public ByteHeader getByteHeader() {
                    return ((Header) this.instance).getByteHeader();
                }

                public Builder setByteHeader(ByteHeader byteHeader) {
                    copyOnWrite();
                    ((Header) this.instance).setByteHeader(byteHeader);
                    return this;
                }

                public Builder setByteHeader(ByteHeader.Builder builder) {
                    copyOnWrite();
                    ((Header) this.instance).setByteHeader(builder.build());
                    return this;
                }

                public Builder mergeByteHeader(ByteHeader byteHeader) {
                    copyOnWrite();
                    ((Header) this.instance).mergeByteHeader(byteHeader);
                    return this;
                }

                public Builder clearByteHeader() {
                    copyOnWrite();
                    ((Header) this.instance).clearByteHeader();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Header();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\n\t\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005ဃ\u0000\u0007\f\b2\t<\u0000\n<\u0000", new Object[]{"contentHeader_", "contentHeaderCase_", "bitField0_", "streamId_", "timestamp_", "topic_", "mimeType_", "totalLength_", "encryptionType_", "attributes_", AttributesDefaultEntryHolder.defaultEntry, TextHeader.class, ByteHeader.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Header> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (Header.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Header header = new Header();
                DEFAULT_INSTANCE = header;
                GeneratedMessageLite.registerDefaultInstance(Header.class, header);
            }

            public static Header getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Header> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Chunk extends GeneratedMessageLite<Chunk, Builder> implements ChunkOrBuilder {
            public static final int CHUNK_INDEX_FIELD_NUMBER = 2;
            public static final int CONTENT_FIELD_NUMBER = 3;
            private static final Chunk DEFAULT_INSTANCE;
            public static final int IV_FIELD_NUMBER = 5;
            private static volatile Parser<Chunk> PARSER = null;
            public static final int STREAM_ID_FIELD_NUMBER = 1;
            public static final int VERSION_FIELD_NUMBER = 4;
            private int bitField0_;
            private long chunkIndex_;
            private int version_;
            private String streamId_ = "";
            private ByteString content_ = ByteString.EMPTY;
            private ByteString iv_ = ByteString.EMPTY;

            private Chunk() {
            }

            @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
            public String getStreamId() {
                return this.streamId_;
            }

            @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
            public ByteString getStreamIdBytes() {
                return ByteString.copyFromUtf8(this.streamId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStreamId() {
                this.streamId_ = getDefaultInstance().getStreamId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStreamIdBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.streamId_ = byteString.toStringUtf8();
            }

            @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
            public long getChunkIndex() {
                return this.chunkIndex_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChunkIndex(long j) {
                this.chunkIndex_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChunkIndex() {
                this.chunkIndex_ = 0L;
            }

            @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
            public ByteString getContent() {
                return this.content_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContent(ByteString byteString) {
                byteString.getClass();
                this.content_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContent() {
                this.content_ = getDefaultInstance().getContent();
            }

            @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
            public int getVersion() {
                return this.version_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVersion(int i) {
                this.version_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVersion() {
                this.version_ = 0;
            }

            @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
            @Deprecated
            public boolean hasIv() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
            @Deprecated
            public ByteString getIv() {
                return this.iv_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIv(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.iv_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIv() {
                this.bitField0_ &= -2;
                this.iv_ = getDefaultInstance().getIv();
            }

            public static Chunk parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Chunk parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Chunk parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Chunk parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Chunk parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Chunk parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Chunk parseFrom(InputStream inputStream) throws IOException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Chunk parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Chunk parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Chunk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Chunk parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Chunk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Chunk parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Chunk parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Chunk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Chunk chunk) {
                return DEFAULT_INSTANCE.createBuilder(chunk);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Chunk, Builder> implements ChunkOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(Chunk.DEFAULT_INSTANCE);
                }

                @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
                public String getStreamId() {
                    return ((Chunk) this.instance).getStreamId();
                }

                @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
                public ByteString getStreamIdBytes() {
                    return ((Chunk) this.instance).getStreamIdBytes();
                }

                public Builder setStreamId(String str) {
                    copyOnWrite();
                    ((Chunk) this.instance).setStreamId(str);
                    return this;
                }

                public Builder clearStreamId() {
                    copyOnWrite();
                    ((Chunk) this.instance).clearStreamId();
                    return this;
                }

                public Builder setStreamIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Chunk) this.instance).setStreamIdBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
                public long getChunkIndex() {
                    return ((Chunk) this.instance).getChunkIndex();
                }

                public Builder setChunkIndex(long j) {
                    copyOnWrite();
                    ((Chunk) this.instance).setChunkIndex(j);
                    return this;
                }

                public Builder clearChunkIndex() {
                    copyOnWrite();
                    ((Chunk) this.instance).clearChunkIndex();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
                public ByteString getContent() {
                    return ((Chunk) this.instance).getContent();
                }

                public Builder setContent(ByteString byteString) {
                    copyOnWrite();
                    ((Chunk) this.instance).setContent(byteString);
                    return this;
                }

                public Builder clearContent() {
                    copyOnWrite();
                    ((Chunk) this.instance).clearContent();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
                public int getVersion() {
                    return ((Chunk) this.instance).getVersion();
                }

                public Builder setVersion(int i) {
                    copyOnWrite();
                    ((Chunk) this.instance).setVersion(i);
                    return this;
                }

                public Builder clearVersion() {
                    copyOnWrite();
                    ((Chunk) this.instance).clearVersion();
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
                @Deprecated
                public boolean hasIv() {
                    return ((Chunk) this.instance).hasIv();
                }

                @Override // livekit.LivekitModels.DataStream.ChunkOrBuilder
                @Deprecated
                public ByteString getIv() {
                    return ((Chunk) this.instance).getIv();
                }

                @Deprecated
                public Builder setIv(ByteString byteString) {
                    copyOnWrite();
                    ((Chunk) this.instance).setIv(byteString);
                    return this;
                }

                @Deprecated
                public Builder clearIv() {
                    copyOnWrite();
                    ((Chunk) this.instance).clearIv();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Chunk();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\n\u0004\u0004\u0005ည\u0000", new Object[]{"bitField0_", "streamId_", "chunkIndex_", "content_", "version_", "iv_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Chunk> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (Chunk.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Chunk chunk = new Chunk();
                DEFAULT_INSTANCE = chunk;
                GeneratedMessageLite.registerDefaultInstance(Chunk.class, chunk);
            }

            public static Chunk getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Chunk> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Trailer extends GeneratedMessageLite<Trailer, Builder> implements TrailerOrBuilder {
            public static final int ATTRIBUTES_FIELD_NUMBER = 3;
            private static final Trailer DEFAULT_INSTANCE;
            private static volatile Parser<Trailer> PARSER = null;
            public static final int REASON_FIELD_NUMBER = 2;
            public static final int STREAM_ID_FIELD_NUMBER = 1;
            private MapFieldLite<String, String> attributes_ = MapFieldLite.emptyMapField();
            private String streamId_ = "";
            private String reason_ = "";

            private Trailer() {
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public String getStreamId() {
                return this.streamId_;
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public ByteString getStreamIdBytes() {
                return ByteString.copyFromUtf8(this.streamId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStreamId() {
                this.streamId_ = getDefaultInstance().getStreamId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStreamIdBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.streamId_ = byteString.toStringUtf8();
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public String getReason() {
                return this.reason_;
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public ByteString getReasonBytes() {
                return ByteString.copyFromUtf8(this.reason_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReason(String str) {
                str.getClass();
                this.reason_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReason() {
                this.reason_ = getDefaultInstance().getReason();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReasonBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.reason_ = byteString.toStringUtf8();
            }

            private static final class AttributesDefaultEntryHolder {
                static final MapEntryLite<String, String> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

                private AttributesDefaultEntryHolder() {
                }
            }

            private MapFieldLite<String, String> internalGetAttributes() {
                return this.attributes_;
            }

            private MapFieldLite<String, String> internalGetMutableAttributes() {
                if (!this.attributes_.isMutable()) {
                    this.attributes_ = this.attributes_.mutableCopy();
                }
                return this.attributes_;
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public int getAttributesCount() {
                return internalGetAttributes().size();
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public boolean containsAttributes(String str) {
                str.getClass();
                return internalGetAttributes().containsKey(str);
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            @Deprecated
            public Map<String, String> getAttributes() {
                return getAttributesMap();
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public Map<String, String> getAttributesMap() {
                return Collections.unmodifiableMap(internalGetAttributes());
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public String getAttributesOrDefault(String str, String str2) {
                str.getClass();
                MapFieldLite<String, String> internalGetAttributes = internalGetAttributes();
                return internalGetAttributes.containsKey(str) ? internalGetAttributes.get(str) : str2;
            }

            @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
            public String getAttributesOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, String> internalGetAttributes = internalGetAttributes();
                if (!internalGetAttributes.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return internalGetAttributes.get(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Map<String, String> getMutableAttributesMap() {
                return internalGetMutableAttributes();
            }

            public static Trailer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Trailer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Trailer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Trailer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Trailer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Trailer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Trailer parseFrom(InputStream inputStream) throws IOException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Trailer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Trailer parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Trailer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Trailer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Trailer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Trailer parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Trailer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Trailer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Trailer trailer) {
                return DEFAULT_INSTANCE.createBuilder(trailer);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Trailer, Builder> implements TrailerOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(Trailer.DEFAULT_INSTANCE);
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public String getStreamId() {
                    return ((Trailer) this.instance).getStreamId();
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public ByteString getStreamIdBytes() {
                    return ((Trailer) this.instance).getStreamIdBytes();
                }

                public Builder setStreamId(String str) {
                    copyOnWrite();
                    ((Trailer) this.instance).setStreamId(str);
                    return this;
                }

                public Builder clearStreamId() {
                    copyOnWrite();
                    ((Trailer) this.instance).clearStreamId();
                    return this;
                }

                public Builder setStreamIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Trailer) this.instance).setStreamIdBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public String getReason() {
                    return ((Trailer) this.instance).getReason();
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public ByteString getReasonBytes() {
                    return ((Trailer) this.instance).getReasonBytes();
                }

                public Builder setReason(String str) {
                    copyOnWrite();
                    ((Trailer) this.instance).setReason(str);
                    return this;
                }

                public Builder clearReason() {
                    copyOnWrite();
                    ((Trailer) this.instance).clearReason();
                    return this;
                }

                public Builder setReasonBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Trailer) this.instance).setReasonBytes(byteString);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public int getAttributesCount() {
                    return ((Trailer) this.instance).getAttributesMap().size();
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public boolean containsAttributes(String str) {
                    str.getClass();
                    return ((Trailer) this.instance).getAttributesMap().containsKey(str);
                }

                public Builder clearAttributes() {
                    copyOnWrite();
                    ((Trailer) this.instance).getMutableAttributesMap().clear();
                    return this;
                }

                public Builder removeAttributes(String str) {
                    str.getClass();
                    copyOnWrite();
                    ((Trailer) this.instance).getMutableAttributesMap().remove(str);
                    return this;
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                @Deprecated
                public Map<String, String> getAttributes() {
                    return getAttributesMap();
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public Map<String, String> getAttributesMap() {
                    return Collections.unmodifiableMap(((Trailer) this.instance).getAttributesMap());
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public String getAttributesOrDefault(String str, String str2) {
                    str.getClass();
                    Map<String, String> attributesMap = ((Trailer) this.instance).getAttributesMap();
                    return attributesMap.containsKey(str) ? attributesMap.get(str) : str2;
                }

                @Override // livekit.LivekitModels.DataStream.TrailerOrBuilder
                public String getAttributesOrThrow(String str) {
                    str.getClass();
                    Map<String, String> attributesMap = ((Trailer) this.instance).getAttributesMap();
                    if (!attributesMap.containsKey(str)) {
                        throw new IllegalArgumentException();
                    }
                    return attributesMap.get(str);
                }

                public Builder putAttributes(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    copyOnWrite();
                    ((Trailer) this.instance).getMutableAttributesMap().put(str, str2);
                    return this;
                }

                public Builder putAllAttributes(Map<String, String> map) {
                    copyOnWrite();
                    ((Trailer) this.instance).getMutableAttributesMap().putAll(map);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Trailer();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"streamId_", "reason_", "attributes_", AttributesDefaultEntryHolder.defaultEntry});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Trailer> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (Trailer.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Trailer trailer = new Trailer();
                DEFAULT_INSTANCE = trailer;
                GeneratedMessageLite.registerDefaultInstance(Trailer.class, trailer);
            }

            public static Trailer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Trailer> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static DataStream parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DataStream parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DataStream parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DataStream parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DataStream parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataStream parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DataStream parseFrom(InputStream inputStream) throws IOException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataStream parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DataStream parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DataStream) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataStream parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataStream) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DataStream parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DataStream parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataStream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataStream dataStream) {
            return DEFAULT_INSTANCE.createBuilder(dataStream);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DataStream, Builder> implements DataStreamOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(DataStream.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DataStream();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DataStream> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (DataStream.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            DataStream dataStream = new DataStream();
            DEFAULT_INSTANCE = dataStream;
            GeneratedMessageLite.registerDefaultInstance(DataStream.class, dataStream);
        }

        public static DataStream getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DataStream> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class WebhookConfig extends GeneratedMessageLite<WebhookConfig, Builder> implements WebhookConfigOrBuilder {
        private static final WebhookConfig DEFAULT_INSTANCE;
        private static volatile Parser<WebhookConfig> PARSER = null;
        public static final int SIGNING_KEY_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";
        private String signingKey_ = "";

        private WebhookConfig() {
        }

        @Override // livekit.LivekitModels.WebhookConfigOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // livekit.LivekitModels.WebhookConfigOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.WebhookConfigOrBuilder
        public String getSigningKey() {
            return this.signingKey_;
        }

        @Override // livekit.LivekitModels.WebhookConfigOrBuilder
        public ByteString getSigningKeyBytes() {
            return ByteString.copyFromUtf8(this.signingKey_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSigningKey(String str) {
            str.getClass();
            this.signingKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSigningKey() {
            this.signingKey_ = getDefaultInstance().getSigningKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSigningKeyBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.signingKey_ = byteString.toStringUtf8();
        }

        public static WebhookConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static WebhookConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebhookConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebhookConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebhookConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebhookConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebhookConfig parseFrom(InputStream inputStream) throws IOException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebhookConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebhookConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WebhookConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebhookConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebhookConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebhookConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebhookConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebhookConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WebhookConfig webhookConfig) {
            return DEFAULT_INSTANCE.createBuilder(webhookConfig);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<WebhookConfig, Builder> implements WebhookConfigOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(WebhookConfig.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.WebhookConfigOrBuilder
            public String getUrl() {
                return ((WebhookConfig) this.instance).getUrl();
            }

            @Override // livekit.LivekitModels.WebhookConfigOrBuilder
            public ByteString getUrlBytes() {
                return ((WebhookConfig) this.instance).getUrlBytes();
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((WebhookConfig) this.instance).setUrl(str);
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((WebhookConfig) this.instance).clearUrl();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((WebhookConfig) this.instance).setUrlBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.WebhookConfigOrBuilder
            public String getSigningKey() {
                return ((WebhookConfig) this.instance).getSigningKey();
            }

            @Override // livekit.LivekitModels.WebhookConfigOrBuilder
            public ByteString getSigningKeyBytes() {
                return ((WebhookConfig) this.instance).getSigningKeyBytes();
            }

            public Builder setSigningKey(String str) {
                copyOnWrite();
                ((WebhookConfig) this.instance).setSigningKey(str);
                return this;
            }

            public Builder clearSigningKey() {
                copyOnWrite();
                ((WebhookConfig) this.instance).clearSigningKey();
                return this;
            }

            public Builder setSigningKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((WebhookConfig) this.instance).setSigningKeyBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebhookConfig();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"url_", "signingKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebhookConfig> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (WebhookConfig.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            WebhookConfig webhookConfig = new WebhookConfig();
            DEFAULT_INSTANCE = webhookConfig;
            GeneratedMessageLite.registerDefaultInstance(WebhookConfig.class, webhookConfig);
        }

        public static WebhookConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<WebhookConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SubscribedAudioCodec extends GeneratedMessageLite<SubscribedAudioCodec, Builder> implements SubscribedAudioCodecOrBuilder {
        public static final int CODEC_FIELD_NUMBER = 1;
        private static final SubscribedAudioCodec DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 2;
        private static volatile Parser<SubscribedAudioCodec> PARSER;
        private String codec_ = "";
        private boolean enabled_;

        private SubscribedAudioCodec() {
        }

        @Override // livekit.LivekitModels.SubscribedAudioCodecOrBuilder
        public String getCodec() {
            return this.codec_;
        }

        @Override // livekit.LivekitModels.SubscribedAudioCodecOrBuilder
        public ByteString getCodecBytes() {
            return ByteString.copyFromUtf8(this.codec_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodec(String str) {
            str.getClass();
            this.codec_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodec() {
            this.codec_ = getDefaultInstance().getCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodecBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.codec_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitModels.SubscribedAudioCodecOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        public static SubscribedAudioCodec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SubscribedAudioCodec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SubscribedAudioCodec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SubscribedAudioCodec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SubscribedAudioCodec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SubscribedAudioCodec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SubscribedAudioCodec parseFrom(InputStream inputStream) throws IOException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SubscribedAudioCodec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SubscribedAudioCodec parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SubscribedAudioCodec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SubscribedAudioCodec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SubscribedAudioCodec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SubscribedAudioCodec parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SubscribedAudioCodec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SubscribedAudioCodec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SubscribedAudioCodec subscribedAudioCodec) {
            return DEFAULT_INSTANCE.createBuilder(subscribedAudioCodec);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SubscribedAudioCodec, Builder> implements SubscribedAudioCodecOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SubscribedAudioCodec.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitModels.SubscribedAudioCodecOrBuilder
            public String getCodec() {
                return ((SubscribedAudioCodec) this.instance).getCodec();
            }

            @Override // livekit.LivekitModels.SubscribedAudioCodecOrBuilder
            public ByteString getCodecBytes() {
                return ((SubscribedAudioCodec) this.instance).getCodecBytes();
            }

            public Builder setCodec(String str) {
                copyOnWrite();
                ((SubscribedAudioCodec) this.instance).setCodec(str);
                return this;
            }

            public Builder clearCodec() {
                copyOnWrite();
                ((SubscribedAudioCodec) this.instance).clearCodec();
                return this;
            }

            public Builder setCodecBytes(ByteString byteString) {
                copyOnWrite();
                ((SubscribedAudioCodec) this.instance).setCodecBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitModels.SubscribedAudioCodecOrBuilder
            public boolean getEnabled() {
                return ((SubscribedAudioCodec) this.instance).getEnabled();
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                ((SubscribedAudioCodec) this.instance).setEnabled(z);
                return this;
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((SubscribedAudioCodec) this.instance).clearEnabled();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SubscribedAudioCodec();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"codec_", "enabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SubscribedAudioCodec> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (SubscribedAudioCodec.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            SubscribedAudioCodec subscribedAudioCodec = new SubscribedAudioCodec();
            DEFAULT_INSTANCE = subscribedAudioCodec;
            GeneratedMessageLite.registerDefaultInstance(SubscribedAudioCodec.class, subscribedAudioCodec);
        }

        public static SubscribedAudioCodec getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SubscribedAudioCodec> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
