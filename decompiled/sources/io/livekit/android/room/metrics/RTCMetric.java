package io.livekit.android.room.metrics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import livekit.LivekitMetrics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RTCMetricsManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lio/livekit/android/room/metrics/RTCMetric;", "", "protoLabel", "Llivekit/LivekitMetrics$MetricLabel;", "statKey", "", "(Ljava/lang/String;ILlivekit/LivekitMetrics$MetricLabel;Ljava/lang/String;)V", "getProtoLabel", "()Llivekit/LivekitMetrics$MetricLabel;", "getStatKey", "()Ljava/lang/String;", "FREEZE_COUNT", "TOTAL_FREEZES_DURATION", "PAUSE_COUNT", "TOTAL_PAUSES_DURATION", "CONCEALED_SAMPLES", "SILENT_CONCEALED_SAMPLES", "CONCEALMENT_EVENTS", "JITTER_BUFFER_DELAY", "JITTER_BUFFER_EMITTED_COUNT", "QUALITY_LIMITATION_DURATION_BANDWIDTH", "QUALITY_LIMITATION_DURATION_CPU", "QUALITY_LIMITATION_DURATION_OTHER", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RTCMetric {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RTCMetric[] $VALUES;
    private final LivekitMetrics.MetricLabel protoLabel;
    private final String statKey;
    public static final RTCMetric FREEZE_COUNT = new RTCMetric("FREEZE_COUNT", 0, LivekitMetrics.MetricLabel.CLIENT_VIDEO_SUBSCRIBER_FREEZE_COUNT, "freezeCount");
    public static final RTCMetric TOTAL_FREEZES_DURATION = new RTCMetric("TOTAL_FREEZES_DURATION", 1, LivekitMetrics.MetricLabel.CLIENT_VIDEO_SUBSCRIBER_TOTAL_FREEZE_DURATION, "totalFreezesDuration");
    public static final RTCMetric PAUSE_COUNT = new RTCMetric("PAUSE_COUNT", 2, LivekitMetrics.MetricLabel.CLIENT_VIDEO_SUBSCRIBER_PAUSE_COUNT, "pauseCount");
    public static final RTCMetric TOTAL_PAUSES_DURATION = new RTCMetric("TOTAL_PAUSES_DURATION", 3, LivekitMetrics.MetricLabel.CLIENT_VIDEO_SUBSCRIBER_TOTAL_PAUSES_DURATION, "totalPausesDuration");
    public static final RTCMetric CONCEALED_SAMPLES = new RTCMetric("CONCEALED_SAMPLES", 4, LivekitMetrics.MetricLabel.CLIENT_AUDIO_SUBSCRIBER_CONCEALED_SAMPLES, "concealedSamples");
    public static final RTCMetric SILENT_CONCEALED_SAMPLES = new RTCMetric("SILENT_CONCEALED_SAMPLES", 5, LivekitMetrics.MetricLabel.CLIENT_AUDIO_SUBSCRIBER_SILENT_CONCEALED_SAMPLES, "silentConcealedSamples");
    public static final RTCMetric CONCEALMENT_EVENTS = new RTCMetric("CONCEALMENT_EVENTS", 6, LivekitMetrics.MetricLabel.CLIENT_AUDIO_SUBSCRIBER_CONCEALMENT_EVENTS, "concealmentEvents");
    public static final RTCMetric JITTER_BUFFER_DELAY = new RTCMetric("JITTER_BUFFER_DELAY", 7, LivekitMetrics.MetricLabel.CLIENT_SUBSCRIBER_JITTER_BUFFER_DELAY, "jitterBufferDelay");
    public static final RTCMetric JITTER_BUFFER_EMITTED_COUNT = new RTCMetric("JITTER_BUFFER_EMITTED_COUNT", 8, LivekitMetrics.MetricLabel.CLIENT_SUBSCRIBER_JITTER_BUFFER_EMITTED_COUNT, "jitterBufferEmittedCount");
    public static final RTCMetric QUALITY_LIMITATION_DURATION_BANDWIDTH = new RTCMetric("QUALITY_LIMITATION_DURATION_BANDWIDTH", 9, LivekitMetrics.MetricLabel.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_BANDWIDTH, "qualityLimitationDurations");
    public static final RTCMetric QUALITY_LIMITATION_DURATION_CPU = new RTCMetric("QUALITY_LIMITATION_DURATION_CPU", 10, LivekitMetrics.MetricLabel.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_CPU, "qualityLimitationDurations");
    public static final RTCMetric QUALITY_LIMITATION_DURATION_OTHER = new RTCMetric("QUALITY_LIMITATION_DURATION_OTHER", 11, LivekitMetrics.MetricLabel.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_OTHER, "qualityLimitationDurations");

    private static final /* synthetic */ RTCMetric[] $values() {
        return new RTCMetric[]{FREEZE_COUNT, TOTAL_FREEZES_DURATION, PAUSE_COUNT, TOTAL_PAUSES_DURATION, CONCEALED_SAMPLES, SILENT_CONCEALED_SAMPLES, CONCEALMENT_EVENTS, JITTER_BUFFER_DELAY, JITTER_BUFFER_EMITTED_COUNT, QUALITY_LIMITATION_DURATION_BANDWIDTH, QUALITY_LIMITATION_DURATION_CPU, QUALITY_LIMITATION_DURATION_OTHER};
    }

    public static EnumEntries<RTCMetric> getEntries() {
        return $ENTRIES;
    }

    public static RTCMetric valueOf(String str) {
        return (RTCMetric) Enum.valueOf(RTCMetric.class, str);
    }

    public static RTCMetric[] values() {
        return (RTCMetric[]) $VALUES.clone();
    }

    private RTCMetric(String str, int i, LivekitMetrics.MetricLabel metricLabel, String str2) {
        this.protoLabel = metricLabel;
        this.statKey = str2;
    }

    public final LivekitMetrics.MetricLabel getProtoLabel() {
        return this.protoLabel;
    }

    public final String getStatKey() {
        return this.statKey;
    }

    static {
        RTCMetric[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
