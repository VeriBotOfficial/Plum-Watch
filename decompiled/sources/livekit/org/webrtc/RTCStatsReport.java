package livekit.org.webrtc;

import java.util.Map;

/* loaded from: classes8.dex */
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long timestampUs, Map<String, RTCStats> stats) {
        this.timestampUs = timestampUs;
        this.stats = stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ timestampUs: ");
        sb.append(this.timestampUs).append(", stats: [\n");
        boolean z = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z) {
                sb.append(",\n");
            }
            sb.append(rTCStats);
            z = false;
        }
        sb.append(" ] }");
        return sb.toString();
    }

    private static RTCStatsReport create(long timestampUs, Map stats) {
        return new RTCStatsReport(timestampUs, stats);
    }
}
