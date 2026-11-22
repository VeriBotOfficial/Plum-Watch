package livekit.org.webrtc;

import java.util.List;
import java.util.Map;
import livekit.org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public class RtpParameters {
    public final List<Codec> codecs;
    public DegradationPreference degradationPreference;
    public final List<Encoding> encodings;
    private final List<HeaderExtension> headerExtensions;
    private final Rtcp rtcp;
    public final String transactionId;

    public enum DegradationPreference {
        MAINTAIN_FRAMERATE_AND_RESOLUTION,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED,
        DISABLED;

        static DegradationPreference fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public static class Encoding {
        public boolean active;
        public boolean adaptiveAudioPacketTime;
        public double bitratePriority;
        public Integer maxBitrateBps;
        public Integer maxFramerate;
        public Integer minBitrateBps;
        public int networkPriority;
        public Integer numTemporalLayers;
        public String rid;
        public String scalabilityMode;
        public Double scaleResolutionDownBy;
        public Long ssrc;

        public Encoding(String rid, boolean active, Double scaleResolutionDownBy) {
            this.bitratePriority = 1.0d;
            this.networkPriority = 1;
            this.rid = rid;
            this.active = active;
            this.scaleResolutionDownBy = scaleResolutionDownBy;
        }

        Encoding(String rid, boolean active, double bitratePriority, int networkPriority, Integer maxBitrateBps, Integer minBitrateBps, Integer maxFramerate, Integer numTemporalLayers, Double scaleResolutionDownBy, String scalabilityMode, Long ssrc, boolean adaptiveAudioPacketTime) {
            this.rid = rid;
            this.active = active;
            this.bitratePriority = bitratePriority;
            this.networkPriority = networkPriority;
            this.maxBitrateBps = maxBitrateBps;
            this.minBitrateBps = minBitrateBps;
            this.maxFramerate = maxFramerate;
            this.numTemporalLayers = numTemporalLayers;
            this.scaleResolutionDownBy = scaleResolutionDownBy;
            this.scalabilityMode = scalabilityMode;
            this.ssrc = ssrc;
            this.adaptiveAudioPacketTime = adaptiveAudioPacketTime;
        }

        String getRid() {
            return this.rid;
        }

        boolean getActive() {
            return this.active;
        }

        double getBitratePriority() {
            return this.bitratePriority;
        }

        int getNetworkPriority() {
            return this.networkPriority;
        }

        Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        Double getScaleResolutionDownBy() {
            return this.scaleResolutionDownBy;
        }

        String getScalabilityMode() {
            return this.scalabilityMode;
        }

        Long getSsrc() {
            return this.ssrc;
        }

        boolean getAdaptivePTime() {
            return this.adaptiveAudioPacketTime;
        }
    }

    public static class Codec {
        public Integer clockRate;
        MediaStreamTrack.MediaType kind;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int payloadType;

        Codec(int payloadType, String name, MediaStreamTrack.MediaType kind, Integer clockRate, Integer numChannels, Map<String, String> parameters) {
            this.payloadType = payloadType;
            this.name = name;
            this.kind = kind;
            this.clockRate = clockRate;
            this.numChannels = numChannels;
            this.parameters = parameters;
        }

        int getPayloadType() {
            return this.payloadType;
        }

        String getName() {
            return this.name;
        }

        MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        Integer getClockRate() {
            return this.clockRate;
        }

        Integer getNumChannels() {
            return this.numChannels;
        }

        Map getParameters() {
            return this.parameters;
        }
    }

    public static class Rtcp {
        private final String cname;
        private final boolean reducedSize;

        Rtcp(String cname, boolean reducedSize) {
            this.cname = cname;
            this.reducedSize = reducedSize;
        }

        public String getCname() {
            return this.cname;
        }

        public boolean getReducedSize() {
            return this.reducedSize;
        }
    }

    public static class HeaderExtension {
        private final boolean encrypted;

        /* renamed from: id, reason: collision with root package name */
        private final int f18738id;
        private final String uri;

        HeaderExtension(String uri, int id2, boolean encrypted) {
            this.uri = uri;
            this.f18738id = id2;
            this.encrypted = encrypted;
        }

        public String getUri() {
            return this.uri;
        }

        public int getId() {
            return this.f18738id;
        }

        public boolean getEncrypted() {
            return this.encrypted;
        }
    }

    RtpParameters(String transactionId, DegradationPreference degradationPreference, Rtcp rtcp, List<HeaderExtension> headerExtensions, List<Encoding> encodings, List<Codec> codecs) {
        this.transactionId = transactionId;
        this.degradationPreference = degradationPreference;
        this.rtcp = rtcp;
        this.headerExtensions = headerExtensions;
        this.encodings = encodings;
        this.codecs = codecs;
    }

    String getTransactionId() {
        return this.transactionId;
    }

    DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    public Rtcp getRtcp() {
        return this.rtcp;
    }

    public List<HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    List<Encoding> getEncodings() {
        return this.encodings;
    }

    List<Codec> getCodecs() {
        return this.codecs;
    }
}
