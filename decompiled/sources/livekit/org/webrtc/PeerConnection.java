package livekit.org.webrtc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpTransceiver;

/* loaded from: classes8.dex */
public class PeerConnection {
    public static final int PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS = 32768;
    private final List<MediaStream> localStreams;
    private final long nativePeerConnection;
    private List<RtpReceiver> receivers;
    private List<RtpSender> senders;
    private List<RtpTransceiver> transceivers;

    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    public enum KeyType {
        RSA,
        ECDSA
    }

    public interface Observer {
        void onAddStream(MediaStream stream);

        default void onAddTrack(RtpReceiver receiver, MediaStream[] mediaStreams) {
        }

        default void onConnectionChange(PeerConnectionState newState) {
        }

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate candidate);

        default void onIceCandidateError(IceCandidateErrorEvent event) {
        }

        void onIceCandidatesRemoved(IceCandidate[] candidates);

        void onIceConnectionChange(IceConnectionState newState);

        void onIceConnectionReceivingChange(boolean receiving);

        void onIceGatheringChange(IceGatheringState newState);

        void onRemoveStream(MediaStream stream);

        default void onRemoveTrack(RtpReceiver receiver) {
        }

        void onRenegotiationNeeded();

        default void onSelectedCandidatePairChanged(CandidatePairChangeEvent event) {
        }

        void onSignalingChange(SignalingState newState);

        default void onStandardizedIceConnectionChange(IceConnectionState newState) {
        }

        default void onTrack(RtpTransceiver transceiver) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PortAllocatorFlags {
    }

    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    private native boolean nativeAddIceCandidate(String sdpMid, int sdpMLineIndex, String iceCandidateSdp);

    private native void nativeAddIceCandidateWithObserver(String sdpMid, int sdpMLineIndex, String iceCandidateSdp, AddIceObserver observer);

    private native boolean nativeAddLocalStream(long stream);

    private native RtpSender nativeAddTrack(long track, List<String> streamIds);

    private native RtpTransceiver nativeAddTransceiverOfType(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit init);

    private native RtpTransceiver nativeAddTransceiverWithTrack(long track, RtpTransceiver.RtpTransceiverInit init);

    private native void nativeClose();

    private native PeerConnectionState nativeConnectionState();

    private native void nativeCreateAnswer(SdpObserver observer, MediaConstraints constraints);

    private native DataChannel nativeCreateDataChannel(String label, DataChannel.Init init);

    private native void nativeCreateOffer(SdpObserver observer, MediaConstraints constraints);

    private static native long nativeCreatePeerConnectionObserver(Observer observer);

    private native RtpSender nativeCreateSender(String kind, String stream_id);

    private static native void nativeFreeOwnedPeerConnection(long ownedPeerConnection);

    private native RtcCertificatePem nativeGetCertificate();

    private native SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native List<RtpReceiver> nativeGetReceivers();

    private native SessionDescription nativeGetRemoteDescription();

    private native List<RtpSender> nativeGetSenders();

    private native List<RtpTransceiver> nativeGetTransceivers();

    private native IceConnectionState nativeIceConnectionState();

    private native IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(RTCStatsCollectorCallback callback);

    private native void nativeNewGetStatsReceiver(long receiver, RTCStatsCollectorCallback callback);

    private native void nativeNewGetStatsSender(long sender, RTCStatsCollectorCallback callback);

    private native boolean nativeOldGetStats(StatsObserver observer, long nativeTrack);

    private native boolean nativeRemoveIceCandidates(final IceCandidate[] candidates);

    private native void nativeRemoveLocalStream(long stream);

    private native boolean nativeRemoveTrack(long sender);

    private native void nativeRestartIce();

    private native void nativeSetAudioPlayout(boolean playout);

    private native void nativeSetAudioRecording(boolean recording);

    private native boolean nativeSetBitrate(Integer min, Integer current, Integer max);

    private native boolean nativeSetConfiguration(RTCConfiguration config);

    private native void nativeSetLocalDescription(SdpObserver observer, SessionDescription sdp);

    private native void nativeSetLocalDescriptionAutomatically(SdpObserver observer);

    private native void nativeSetRemoteDescription(SdpObserver observer, SessionDescription sdp);

    private native SignalingState nativeSignalingState();

    private native boolean nativeStartRtcEventLog(int file_descriptor, int max_size_bytes);

    private native void nativeStopRtcEventLog();

    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        static IceGatheringState fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        static IceConnectionState fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        static PeerConnectionState fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        static SignalingState fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public static class IceServer {
        public final String hostname;
        public final String password;
        public final List<String> tlsAlpnProtocols;
        public final TlsCertPolicy tlsCertPolicy;
        public final List<String> tlsEllipticCurves;

        @Deprecated
        public final String uri;
        public final List<String> urls;
        public final String username;

        @Deprecated
        public IceServer(String uri) {
            this(uri, "", "");
        }

        @Deprecated
        public IceServer(String uri, String username, String password) {
            this(uri, username, password, TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        @Deprecated
        public IceServer(String uri, String username, String password, TlsCertPolicy tlsCertPolicy) {
            this(uri, username, password, tlsCertPolicy, "");
        }

        @Deprecated
        public IceServer(String uri, String username, String password, TlsCertPolicy tlsCertPolicy, String hostname) {
            this(uri, Collections.singletonList(uri), username, password, tlsCertPolicy, hostname, null, null);
        }

        private IceServer(String uri, List<String> urls, String username, String password, TlsCertPolicy tlsCertPolicy, String hostname, List<String> tlsAlpnProtocols, List<String> tlsEllipticCurves) {
            if (uri == null || urls == null || urls.isEmpty()) {
                throw new IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
            }
            Iterator<String> it = urls.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new IllegalArgumentException("urls element is null: " + String.valueOf(urls));
                }
            }
            if (username == null) {
                throw new IllegalArgumentException("username == null");
            }
            if (password == null) {
                throw new IllegalArgumentException("password == null");
            }
            if (hostname == null) {
                throw new IllegalArgumentException("hostname == null");
            }
            this.uri = uri;
            this.urls = urls;
            this.username = username;
            this.password = password;
            this.tlsCertPolicy = tlsCertPolicy;
            this.hostname = hostname;
            this.tlsAlpnProtocols = tlsAlpnProtocols;
            this.tlsEllipticCurves = tlsEllipticCurves;
        }

        public String toString() {
            return String.valueOf(this.urls) + " [" + this.username + ":" + this.password + "] [" + String.valueOf(this.tlsCertPolicy) + "] [" + this.hostname + "] [" + String.valueOf(this.tlsAlpnProtocols) + "] [" + String.valueOf(this.tlsEllipticCurves) + "]";
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IceServer)) {
                return false;
            }
            IceServer iceServer = (IceServer) obj;
            return this.uri.equals(iceServer.uri) && this.urls.equals(iceServer.urls) && this.username.equals(iceServer.username) && this.password.equals(iceServer.password) && this.tlsCertPolicy.equals(iceServer.tlsCertPolicy) && this.hostname.equals(iceServer.hostname) && this.tlsAlpnProtocols.equals(iceServer.tlsAlpnProtocols) && this.tlsEllipticCurves.equals(iceServer.tlsEllipticCurves);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.uri, this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves});
        }

        public static Builder builder(String uri) {
            return new Builder(Collections.singletonList(uri));
        }

        public static Builder builder(List<String> urls) {
            return new Builder(urls);
        }

        public static class Builder {
            private String hostname;
            private String password;
            private List<String> tlsAlpnProtocols;
            private TlsCertPolicy tlsCertPolicy;
            private List<String> tlsEllipticCurves;
            private final List<String> urls;
            private String username;

            private Builder(List<String> urls) {
                this.username = "";
                this.password = "";
                this.tlsCertPolicy = TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = "";
                if (urls == null || urls.isEmpty()) {
                    throw new IllegalArgumentException("urls == null || urls.isEmpty(): " + String.valueOf(urls));
                }
                this.urls = urls;
            }

            public Builder setUsername(String username) {
                this.username = username;
                return this;
            }

            public Builder setPassword(String password) {
                this.password = password;
                return this;
            }

            public Builder setTlsCertPolicy(TlsCertPolicy tlsCertPolicy) {
                this.tlsCertPolicy = tlsCertPolicy;
                return this;
            }

            public Builder setHostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            public Builder setTlsAlpnProtocols(List<String> tlsAlpnProtocols) {
                this.tlsAlpnProtocols = tlsAlpnProtocols;
                return this;
            }

            public Builder setTlsEllipticCurves(List<String> tlsEllipticCurves) {
                this.tlsEllipticCurves = tlsEllipticCurves;
                return this;
            }

            public IceServer createIceServer() {
                return new IceServer(this.urls.get(0), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves);
            }
        }

        List<String> getUrls() {
            return this.urls;
        }

        String getUsername() {
            return this.username;
        }

        String getPassword() {
            return this.password;
        }

        TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        String getHostname() {
            return this.hostname;
        }

        List<String> getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        List<String> getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }
    }

    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32),
        CELLULAR_2G(64),
        CELLULAR_3G(128),
        CELLULAR_4G(256),
        CELLULAR_5G(512);

        private static final Map<Integer, AdapterType> BY_BITMASK = new HashMap();
        public final Integer bitMask;

        static {
            for (AdapterType adapterType : values()) {
                BY_BITMASK.put(adapterType.bitMask, adapterType);
            }
        }

        AdapterType(Integer bitMask) {
            this.bitMask = bitMask;
        }

        static AdapterType fromNativeIndex(int nativeIndex) {
            return BY_BITMASK.get(Integer.valueOf(nativeIndex));
        }
    }

    public static class RTCConfiguration {
        public RtcCertificatePem certificate;
        public List<IceServer> iceServers;
        public TurnCustomizer turnCustomizer;
        public IceTransportsType iceTransportsType = IceTransportsType.ALL;
        public BundlePolicy bundlePolicy = BundlePolicy.BALANCED;
        public RtcpMuxPolicy rtcpMuxPolicy = RtcpMuxPolicy.REQUIRE;
        public TcpCandidatePolicy tcpCandidatePolicy = TcpCandidatePolicy.ENABLED;
        public CandidateNetworkPolicy candidateNetworkPolicy = CandidateNetworkPolicy.ALL;
        public int audioJitterBufferMaxPackets = 200;
        public boolean audioJitterBufferFastAccelerate = false;
        public int iceConnectionReceivingTimeout = -1;
        public int iceBackupCandidatePairPingInterval = -1;
        public KeyType keyType = KeyType.ECDSA;
        public ContinualGatheringPolicy continualGatheringPolicy = ContinualGatheringPolicy.GATHER_ONCE;
        public int iceCandidatePoolSize = 0;

        @Deprecated
        public boolean pruneTurnPorts = false;
        public PortPrunePolicy turnPortPrunePolicy = PortPrunePolicy.NO_PRUNE;
        public boolean presumeWritableWhenFullyRelayed = false;
        public boolean surfaceIceCandidatesOnIceTransportTypeChanged = false;
        public Integer iceCheckIntervalStrongConnectivityMs = null;
        public Integer iceCheckIntervalWeakConnectivityMs = null;
        public Integer iceCheckMinInterval = null;
        public Integer iceUnwritableTimeMs = null;
        public Integer iceUnwritableMinChecks = null;
        public Integer stunCandidateKeepaliveIntervalMs = null;
        public Integer stableWritableConnectionPingIntervalMs = null;
        public boolean disableIPv6OnWifi = false;
        public int maxIPv6Networks = 5;
        public boolean enableDscp = false;
        public boolean enableCpuOveruseDetection = true;
        public boolean suspendBelowMinBitrate = false;
        public Integer screencastMinBitrate = null;
        public AdapterType networkPreference = AdapterType.UNKNOWN;
        public SdpSemantics sdpSemantics = SdpSemantics.UNIFIED_PLAN;
        public CryptoOptions cryptoOptions = null;
        public String turnLoggingId = null;
        public boolean enableImplicitRollback = false;
        public boolean offerExtmapAllowMixed = true;
        public int portAllocatorMinPort = 0;
        public int portAllocatorMaxPort = 0;
        public int portAllocatorFlags = 0;
        public boolean enableIceGatheringOnAnyAddressPorts = false;

        public RTCConfiguration(List<IceServer> iceServers) {
            this.iceServers = iceServers;
        }

        IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        List<IceServer> getIceServers() {
            return this.iceServers;
        }

        BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        PortPrunePolicy getTurnPortPrunePolicy() {
            return this.turnPortPrunePolicy;
        }

        RtcCertificatePem getCertificate() {
            return this.certificate;
        }

        RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        KeyType getKeyType() {
            return this.keyType;
        }

        ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
            return this.surfaceIceCandidatesOnIceTransportTypeChanged;
        }

        Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        Integer getStableWritableConnectionPingIntervalMs() {
            return this.stableWritableConnectionPingIntervalMs;
        }

        boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }

        boolean getEnableDscp() {
            return this.enableDscp;
        }

        boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        CryptoOptions getCryptoOptions() {
            return this.cryptoOptions;
        }

        String getTurnLoggingId() {
            return this.turnLoggingId;
        }

        boolean getEnableImplicitRollback() {
            return this.enableImplicitRollback;
        }

        boolean getOfferExtmapAllowMixed() {
            return this.offerExtmapAllowMixed;
        }

        int getPortAllocatorMinPort() {
            return this.portAllocatorMinPort;
        }

        int getPortAllocatorMaxPort() {
            return this.portAllocatorMaxPort;
        }

        int getPortAllocatorFlags() {
            return this.portAllocatorFlags;
        }

        boolean getEnableIceGatheringOnAnyAddressPorts() {
            return this.enableIceGatheringOnAnyAddressPorts;
        }
    }

    public PeerConnection(NativePeerConnectionFactory factory) {
        this(factory.createNativePeerConnection());
    }

    PeerConnection(long nativePeerConnection) {
        this.localStreams = new ArrayList();
        this.senders = new ArrayList();
        this.receivers = new ArrayList();
        this.transceivers = new ArrayList();
        this.nativePeerConnection = nativePeerConnection;
    }

    public SessionDescription getLocalDescription() {
        return nativeGetLocalDescription();
    }

    public SessionDescription getRemoteDescription() {
        return nativeGetRemoteDescription();
    }

    public RtcCertificatePem getCertificate() {
        return nativeGetCertificate();
    }

    public DataChannel createDataChannel(String label, DataChannel.Init init) {
        return nativeCreateDataChannel(label, init);
    }

    public void createOffer(SdpObserver observer, MediaConstraints constraints) {
        nativeCreateOffer(observer, constraints);
    }

    public void createAnswer(SdpObserver observer, MediaConstraints constraints) {
        nativeCreateAnswer(observer, constraints);
    }

    public void setLocalDescription(SdpObserver observer) {
        nativeSetLocalDescriptionAutomatically(observer);
    }

    public void setLocalDescription(SdpObserver observer, SessionDescription sdp) {
        nativeSetLocalDescription(observer, sdp);
    }

    public void setRemoteDescription(SdpObserver observer, SessionDescription sdp) {
        nativeSetRemoteDescription(observer, sdp);
    }

    public void restartIce() {
        nativeRestartIce();
    }

    public void setAudioPlayout(boolean playout) {
        nativeSetAudioPlayout(playout);
    }

    public void setAudioRecording(boolean recording) {
        nativeSetAudioRecording(recording);
    }

    public boolean setConfiguration(RTCConfiguration config) {
        return nativeSetConfiguration(config);
    }

    public boolean addIceCandidate(IceCandidate candidate) {
        return nativeAddIceCandidate(candidate.sdpMid, candidate.sdpMLineIndex, candidate.sdp);
    }

    public void addIceCandidate(IceCandidate candidate, AddIceObserver observer) {
        nativeAddIceCandidateWithObserver(candidate.sdpMid, candidate.sdpMLineIndex, candidate.sdp, observer);
    }

    public boolean removeIceCandidates(final IceCandidate[] candidates) {
        return nativeRemoveIceCandidates(candidates);
    }

    public boolean addStream(MediaStream stream) {
        if (!nativeAddLocalStream(stream.getNativeMediaStream())) {
            return false;
        }
        this.localStreams.add(stream);
        return true;
    }

    public void removeStream(MediaStream stream) {
        nativeRemoveLocalStream(stream.getNativeMediaStream());
        this.localStreams.remove(stream);
    }

    public RtpSender createSender(String kind, String stream_id) {
        RtpSender nativeCreateSender = nativeCreateSender(kind, stream_id);
        if (nativeCreateSender != null) {
            this.senders.add(nativeCreateSender);
        }
        return nativeCreateSender;
    }

    public List<RtpSender> getSenders() {
        Iterator<RtpSender> it = this.senders.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        List<RtpSender> nativeGetSenders = nativeGetSenders();
        this.senders = nativeGetSenders;
        return Collections.unmodifiableList(nativeGetSenders);
    }

    public List<RtpReceiver> getReceivers() {
        Iterator<RtpReceiver> it = this.receivers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        List<RtpReceiver> nativeGetReceivers = nativeGetReceivers();
        this.receivers = nativeGetReceivers;
        return Collections.unmodifiableList(nativeGetReceivers);
    }

    public List<RtpTransceiver> getTransceivers() {
        Iterator<RtpTransceiver> it = this.transceivers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        List<RtpTransceiver> nativeGetTransceivers = nativeGetTransceivers();
        this.transceivers = nativeGetTransceivers;
        return Collections.unmodifiableList(nativeGetTransceivers);
    }

    public RtpSender addTrack(MediaStreamTrack track) {
        return addTrack(track, Collections.emptyList());
    }

    public RtpSender addTrack(MediaStreamTrack track, List<String> streamIds) {
        if (track == null || streamIds == null) {
            throw new NullPointerException("No MediaStreamTrack specified in addTrack.");
        }
        RtpSender nativeAddTrack = nativeAddTrack(track.getNativeMediaStreamTrack(), streamIds);
        if (nativeAddTrack == null) {
            throw new IllegalStateException("C++ addTrack failed.");
        }
        this.senders.add(nativeAddTrack);
        return nativeAddTrack;
    }

    public boolean removeTrack(RtpSender sender) {
        if (sender == null) {
            throw new NullPointerException("No RtpSender specified for removeTrack.");
        }
        return nativeRemoveTrack(sender.getNativeRtpSender());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack track) {
        return addTransceiver(track, new RtpTransceiver.RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack track, RtpTransceiver.RtpTransceiverInit init) {
        if (track == null) {
            throw new NullPointerException("No MediaStreamTrack specified for addTransceiver.");
        }
        if (init == null) {
            init = new RtpTransceiver.RtpTransceiverInit();
        }
        RtpTransceiver nativeAddTransceiverWithTrack = nativeAddTransceiverWithTrack(track.getNativeMediaStreamTrack(), init);
        if (nativeAddTransceiverWithTrack == null) {
            throw new IllegalStateException("C++ addTransceiver failed.");
        }
        this.transceivers.add(nativeAddTransceiverWithTrack);
        return nativeAddTransceiverWithTrack;
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType) {
        return addTransceiver(mediaType, new RtpTransceiver.RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit init) {
        if (mediaType == null) {
            throw new NullPointerException("No MediaType specified for addTransceiver.");
        }
        if (init == null) {
            init = new RtpTransceiver.RtpTransceiverInit();
        }
        RtpTransceiver nativeAddTransceiverOfType = nativeAddTransceiverOfType(mediaType, init);
        if (nativeAddTransceiverOfType == null) {
            throw new IllegalStateException("C++ addTransceiver failed.");
        }
        this.transceivers.add(nativeAddTransceiverOfType);
        return nativeAddTransceiverOfType;
    }

    @Deprecated
    public boolean getStats(StatsObserver observer, MediaStreamTrack track) {
        return nativeOldGetStats(observer, track == null ? 0L : track.getNativeMediaStreamTrack());
    }

    public void getStats(RTCStatsCollectorCallback callback) {
        nativeNewGetStats(callback);
    }

    public void getStats(RtpSender sender, RTCStatsCollectorCallback callback) {
        nativeNewGetStatsSender(sender.getNativeRtpSender(), callback);
    }

    public void getStats(RtpReceiver receiver, RTCStatsCollectorCallback callback) {
        nativeNewGetStatsReceiver(receiver.getNativeRtpReceiver(), callback);
    }

    public boolean setBitrate(Integer min, Integer current, Integer max) {
        return nativeSetBitrate(min, current, max);
    }

    public boolean startRtcEventLog(int file_descriptor, int max_size_bytes) {
        return nativeStartRtcEventLog(file_descriptor, max_size_bytes);
    }

    public void stopRtcEventLog() {
        nativeStopRtcEventLog();
    }

    public SignalingState signalingState() {
        return nativeSignalingState();
    }

    public IceConnectionState iceConnectionState() {
        return nativeIceConnectionState();
    }

    public PeerConnectionState connectionState() {
        return nativeConnectionState();
    }

    public IceGatheringState iceGatheringState() {
        return nativeIceGatheringState();
    }

    public void close() {
        nativeClose();
    }

    public void dispose() {
        close();
        for (MediaStream mediaStream : this.localStreams) {
            nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
            mediaStream.dispose();
        }
        this.localStreams.clear();
        Iterator<RtpSender> it = this.senders.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.senders.clear();
        Iterator<RtpReceiver> it2 = this.receivers.iterator();
        while (it2.hasNext()) {
            it2.next().dispose();
        }
        Iterator<RtpTransceiver> it3 = this.transceivers.iterator();
        while (it3.hasNext()) {
            it3.next().dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        nativeFreeOwnedPeerConnection(this.nativePeerConnection);
    }

    public long getNativePeerConnection() {
        return nativeGetNativePeerConnection();
    }

    long getNativeOwnedPeerConnection() {
        return this.nativePeerConnection;
    }

    public static long createNativePeerConnectionObserver(Observer observer) {
        return nativeCreatePeerConnectionObserver(observer);
    }
}
