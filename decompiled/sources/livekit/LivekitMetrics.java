package livekit;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class LivekitMetrics {

    public interface EventMetricOrBuilder extends MessageLiteOrBuilder {
        long getEndTimestampMs();

        int getLabel();

        String getMetadata();

        ByteString getMetadataBytes();

        Timestamp getNormalizedEndTimestamp();

        Timestamp getNormalizedStartTimestamp();

        int getParticipantIdentity();

        int getRid();

        long getStartTimestampMs();

        int getTrackSid();

        boolean hasEndTimestampMs();

        boolean hasNormalizedEndTimestamp();

        boolean hasNormalizedStartTimestamp();
    }

    public interface MetricSampleOrBuilder extends MessageLiteOrBuilder {
        Timestamp getNormalizedTimestamp();

        long getTimestampMs();

        float getValue();

        boolean hasNormalizedTimestamp();
    }

    public interface MetricsBatchOrBuilder extends MessageLiteOrBuilder {
        EventMetric getEvents(int i);

        int getEventsCount();

        List<EventMetric> getEventsList();

        Timestamp getNormalizedTimestamp();

        String getStrData(int i);

        ByteString getStrDataBytes(int i);

        int getStrDataCount();

        List<String> getStrDataList();

        TimeSeriesMetric getTimeSeries(int i);

        int getTimeSeriesCount();

        List<TimeSeriesMetric> getTimeSeriesList();

        long getTimestampMs();

        boolean hasNormalizedTimestamp();
    }

    public interface MetricsRecordingHeaderOrBuilder extends MessageLiteOrBuilder {
        boolean getEnableUserDataTraining();

        String getRoomId();

        ByteString getRoomIdBytes();

        boolean hasEnableUserDataTraining();
    }

    public interface TimeSeriesMetricOrBuilder extends MessageLiteOrBuilder {
        int getLabel();

        int getParticipantIdentity();

        int getRid();

        MetricSample getSamples(int i);

        int getSamplesCount();

        List<MetricSample> getSamplesList();

        int getTrackSid();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private LivekitMetrics() {
    }

    public enum MetricLabel implements Internal.EnumLite {
        AGENTS_LLM_TTFT(0),
        AGENTS_STT_TTFT(1),
        AGENTS_TTS_TTFB(2),
        CLIENT_VIDEO_SUBSCRIBER_FREEZE_COUNT(3),
        CLIENT_VIDEO_SUBSCRIBER_TOTAL_FREEZE_DURATION(4),
        CLIENT_VIDEO_SUBSCRIBER_PAUSE_COUNT(5),
        CLIENT_VIDEO_SUBSCRIBER_TOTAL_PAUSES_DURATION(6),
        CLIENT_AUDIO_SUBSCRIBER_CONCEALED_SAMPLES(7),
        CLIENT_AUDIO_SUBSCRIBER_SILENT_CONCEALED_SAMPLES(8),
        CLIENT_AUDIO_SUBSCRIBER_CONCEALMENT_EVENTS(9),
        CLIENT_AUDIO_SUBSCRIBER_INTERRUPTION_COUNT(10),
        CLIENT_AUDIO_SUBSCRIBER_TOTAL_INTERRUPTION_DURATION(11),
        CLIENT_SUBSCRIBER_JITTER_BUFFER_DELAY(12),
        CLIENT_SUBSCRIBER_JITTER_BUFFER_EMITTED_COUNT(13),
        CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_BANDWIDTH(14),
        CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_CPU(15),
        CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_OTHER(16),
        PUBLISHER_RTT(17),
        SERVER_MESH_RTT(18),
        SUBSCRIBER_RTT(19),
        METRIC_LABEL_PREDEFINED_MAX_VALUE(4096),
        UNRECOGNIZED(-1);

        public static final int AGENTS_LLM_TTFT_VALUE = 0;
        public static final int AGENTS_STT_TTFT_VALUE = 1;
        public static final int AGENTS_TTS_TTFB_VALUE = 2;
        public static final int CLIENT_AUDIO_SUBSCRIBER_CONCEALED_SAMPLES_VALUE = 7;
        public static final int CLIENT_AUDIO_SUBSCRIBER_CONCEALMENT_EVENTS_VALUE = 9;
        public static final int CLIENT_AUDIO_SUBSCRIBER_INTERRUPTION_COUNT_VALUE = 10;
        public static final int CLIENT_AUDIO_SUBSCRIBER_SILENT_CONCEALED_SAMPLES_VALUE = 8;
        public static final int CLIENT_AUDIO_SUBSCRIBER_TOTAL_INTERRUPTION_DURATION_VALUE = 11;
        public static final int CLIENT_SUBSCRIBER_JITTER_BUFFER_DELAY_VALUE = 12;
        public static final int CLIENT_SUBSCRIBER_JITTER_BUFFER_EMITTED_COUNT_VALUE = 13;
        public static final int CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_BANDWIDTH_VALUE = 14;
        public static final int CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_CPU_VALUE = 15;
        public static final int CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_OTHER_VALUE = 16;
        public static final int CLIENT_VIDEO_SUBSCRIBER_FREEZE_COUNT_VALUE = 3;
        public static final int CLIENT_VIDEO_SUBSCRIBER_PAUSE_COUNT_VALUE = 5;
        public static final int CLIENT_VIDEO_SUBSCRIBER_TOTAL_FREEZE_DURATION_VALUE = 4;
        public static final int CLIENT_VIDEO_SUBSCRIBER_TOTAL_PAUSES_DURATION_VALUE = 6;
        public static final int METRIC_LABEL_PREDEFINED_MAX_VALUE_VALUE = 4096;
        public static final int PUBLISHER_RTT_VALUE = 17;
        public static final int SERVER_MESH_RTT_VALUE = 18;
        public static final int SUBSCRIBER_RTT_VALUE = 19;
        private static final Internal.EnumLiteMap<MetricLabel> internalValueMap = new Internal.EnumLiteMap<MetricLabel>() { // from class: livekit.LivekitMetrics.MetricLabel.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MetricLabel findValueByNumber(int i) {
                return MetricLabel.forNumber(i);
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
        public static MetricLabel valueOf(int i) {
            return forNumber(i);
        }

        public static MetricLabel forNumber(int i) {
            if (i != 4096) {
                switch (i) {
                    case 0:
                        return AGENTS_LLM_TTFT;
                    case 1:
                        return AGENTS_STT_TTFT;
                    case 2:
                        return AGENTS_TTS_TTFB;
                    case 3:
                        return CLIENT_VIDEO_SUBSCRIBER_FREEZE_COUNT;
                    case 4:
                        return CLIENT_VIDEO_SUBSCRIBER_TOTAL_FREEZE_DURATION;
                    case 5:
                        return CLIENT_VIDEO_SUBSCRIBER_PAUSE_COUNT;
                    case 6:
                        return CLIENT_VIDEO_SUBSCRIBER_TOTAL_PAUSES_DURATION;
                    case 7:
                        return CLIENT_AUDIO_SUBSCRIBER_CONCEALED_SAMPLES;
                    case 8:
                        return CLIENT_AUDIO_SUBSCRIBER_SILENT_CONCEALED_SAMPLES;
                    case 9:
                        return CLIENT_AUDIO_SUBSCRIBER_CONCEALMENT_EVENTS;
                    case 10:
                        return CLIENT_AUDIO_SUBSCRIBER_INTERRUPTION_COUNT;
                    case 11:
                        return CLIENT_AUDIO_SUBSCRIBER_TOTAL_INTERRUPTION_DURATION;
                    case 12:
                        return CLIENT_SUBSCRIBER_JITTER_BUFFER_DELAY;
                    case 13:
                        return CLIENT_SUBSCRIBER_JITTER_BUFFER_EMITTED_COUNT;
                    case 14:
                        return CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_BANDWIDTH;
                    case 15:
                        return CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_CPU;
                    case 16:
                        return CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_OTHER;
                    case 17:
                        return PUBLISHER_RTT;
                    case 18:
                        return SERVER_MESH_RTT;
                    case 19:
                        return SUBSCRIBER_RTT;
                    default:
                        return null;
                }
            }
            return METRIC_LABEL_PREDEFINED_MAX_VALUE;
        }

        public static Internal.EnumLiteMap<MetricLabel> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return MetricLabelVerifier.INSTANCE;
        }

        private static final class MetricLabelVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new MetricLabelVerifier();

            private MetricLabelVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return MetricLabel.forNumber(i) != null;
            }
        }

        MetricLabel(int i) {
            this.value = i;
        }
    }

    public static final class MetricsBatch extends GeneratedMessageLite<MetricsBatch, Builder> implements MetricsBatchOrBuilder {
        private static final MetricsBatch DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int NORMALIZED_TIMESTAMP_FIELD_NUMBER = 2;
        private static volatile Parser<MetricsBatch> PARSER = null;
        public static final int STR_DATA_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
        public static final int TIME_SERIES_FIELD_NUMBER = 4;
        private Timestamp normalizedTimestamp_;
        private long timestampMs_;
        private Internal.ProtobufList<String> strData_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<TimeSeriesMetric> timeSeries_ = emptyProtobufList();
        private Internal.ProtobufList<EventMetric> events_ = emptyProtobufList();

        private MetricsBatch() {
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public long getTimestampMs() {
            return this.timestampMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampMs(long j) {
            this.timestampMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampMs() {
            this.timestampMs_ = 0L;
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public boolean hasNormalizedTimestamp() {
            return this.normalizedTimestamp_ != null;
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public Timestamp getNormalizedTimestamp() {
            Timestamp timestamp = this.normalizedTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNormalizedTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.normalizedTimestamp_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNormalizedTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.normalizedTimestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.normalizedTimestamp_ = Timestamp.newBuilder(this.normalizedTimestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.normalizedTimestamp_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNormalizedTimestamp() {
            this.normalizedTimestamp_ = null;
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public List<String> getStrDataList() {
            return this.strData_;
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public int getStrDataCount() {
            return this.strData_.size();
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public String getStrData(int i) {
            return this.strData_.get(i);
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public ByteString getStrDataBytes(int i) {
            return ByteString.copyFromUtf8(this.strData_.get(i));
        }

        private void ensureStrDataIsMutable() {
            Internal.ProtobufList<String> protobufList = this.strData_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.strData_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStrData(int i, String str) {
            str.getClass();
            ensureStrDataIsMutable();
            this.strData_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStrData(String str) {
            str.getClass();
            ensureStrDataIsMutable();
            this.strData_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStrData(Iterable<String> iterable) {
            ensureStrDataIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.strData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStrData() {
            this.strData_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStrDataBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureStrDataIsMutable();
            this.strData_.add(byteString.toStringUtf8());
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public List<TimeSeriesMetric> getTimeSeriesList() {
            return this.timeSeries_;
        }

        public List<? extends TimeSeriesMetricOrBuilder> getTimeSeriesOrBuilderList() {
            return this.timeSeries_;
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public int getTimeSeriesCount() {
            return this.timeSeries_.size();
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public TimeSeriesMetric getTimeSeries(int i) {
            return this.timeSeries_.get(i);
        }

        public TimeSeriesMetricOrBuilder getTimeSeriesOrBuilder(int i) {
            return this.timeSeries_.get(i);
        }

        private void ensureTimeSeriesIsMutable() {
            Internal.ProtobufList<TimeSeriesMetric> protobufList = this.timeSeries_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.timeSeries_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeSeries(int i, TimeSeriesMetric timeSeriesMetric) {
            timeSeriesMetric.getClass();
            ensureTimeSeriesIsMutable();
            this.timeSeries_.set(i, timeSeriesMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTimeSeries(TimeSeriesMetric timeSeriesMetric) {
            timeSeriesMetric.getClass();
            ensureTimeSeriesIsMutable();
            this.timeSeries_.add(timeSeriesMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTimeSeries(int i, TimeSeriesMetric timeSeriesMetric) {
            timeSeriesMetric.getClass();
            ensureTimeSeriesIsMutable();
            this.timeSeries_.add(i, timeSeriesMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTimeSeries(Iterable<? extends TimeSeriesMetric> iterable) {
            ensureTimeSeriesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.timeSeries_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeSeries() {
            this.timeSeries_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTimeSeries(int i) {
            ensureTimeSeriesIsMutable();
            this.timeSeries_.remove(i);
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public List<EventMetric> getEventsList() {
            return this.events_;
        }

        public List<? extends EventMetricOrBuilder> getEventsOrBuilderList() {
            return this.events_;
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public int getEventsCount() {
            return this.events_.size();
        }

        @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
        public EventMetric getEvents(int i) {
            return this.events_.get(i);
        }

        public EventMetricOrBuilder getEventsOrBuilder(int i) {
            return this.events_.get(i);
        }

        private void ensureEventsIsMutable() {
            Internal.ProtobufList<EventMetric> protobufList = this.events_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(int i, EventMetric eventMetric) {
            eventMetric.getClass();
            ensureEventsIsMutable();
            this.events_.set(i, eventMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(EventMetric eventMetric) {
            eventMetric.getClass();
            ensureEventsIsMutable();
            this.events_.add(eventMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(int i, EventMetric eventMetric) {
            eventMetric.getClass();
            ensureEventsIsMutable();
            this.events_.add(i, eventMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEvents(Iterable<? extends EventMetric> iterable) {
            ensureEventsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEvents(int i) {
            ensureEventsIsMutable();
            this.events_.remove(i);
        }

        public static MetricsBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MetricsBatch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MetricsBatch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MetricsBatch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MetricsBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricsBatch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MetricsBatch parseFrom(InputStream inputStream) throws IOException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricsBatch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricsBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricsBatch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricsBatch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricsBatch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricsBatch parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MetricsBatch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricsBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MetricsBatch metricsBatch) {
            return DEFAULT_INSTANCE.createBuilder(metricsBatch);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MetricsBatch, Builder> implements MetricsBatchOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(MetricsBatch.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public long getTimestampMs() {
                return ((MetricsBatch) this.instance).getTimestampMs();
            }

            public Builder setTimestampMs(long j) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setTimestampMs(j);
                return this;
            }

            public Builder clearTimestampMs() {
                copyOnWrite();
                ((MetricsBatch) this.instance).clearTimestampMs();
                return this;
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public boolean hasNormalizedTimestamp() {
                return ((MetricsBatch) this.instance).hasNormalizedTimestamp();
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public Timestamp getNormalizedTimestamp() {
                return ((MetricsBatch) this.instance).getNormalizedTimestamp();
            }

            public Builder setNormalizedTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setNormalizedTimestamp(timestamp);
                return this;
            }

            public Builder setNormalizedTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setNormalizedTimestamp(builder.build());
                return this;
            }

            public Builder mergeNormalizedTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((MetricsBatch) this.instance).mergeNormalizedTimestamp(timestamp);
                return this;
            }

            public Builder clearNormalizedTimestamp() {
                copyOnWrite();
                ((MetricsBatch) this.instance).clearNormalizedTimestamp();
                return this;
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public List<String> getStrDataList() {
                return Collections.unmodifiableList(((MetricsBatch) this.instance).getStrDataList());
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public int getStrDataCount() {
                return ((MetricsBatch) this.instance).getStrDataCount();
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public String getStrData(int i) {
                return ((MetricsBatch) this.instance).getStrData(i);
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public ByteString getStrDataBytes(int i) {
                return ((MetricsBatch) this.instance).getStrDataBytes(i);
            }

            public Builder setStrData(int i, String str) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setStrData(i, str);
                return this;
            }

            public Builder addStrData(String str) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addStrData(str);
                return this;
            }

            public Builder addAllStrData(Iterable<String> iterable) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addAllStrData(iterable);
                return this;
            }

            public Builder clearStrData() {
                copyOnWrite();
                ((MetricsBatch) this.instance).clearStrData();
                return this;
            }

            public Builder addStrDataBytes(ByteString byteString) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addStrDataBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public List<TimeSeriesMetric> getTimeSeriesList() {
                return Collections.unmodifiableList(((MetricsBatch) this.instance).getTimeSeriesList());
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public int getTimeSeriesCount() {
                return ((MetricsBatch) this.instance).getTimeSeriesCount();
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public TimeSeriesMetric getTimeSeries(int i) {
                return ((MetricsBatch) this.instance).getTimeSeries(i);
            }

            public Builder setTimeSeries(int i, TimeSeriesMetric timeSeriesMetric) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setTimeSeries(i, timeSeriesMetric);
                return this;
            }

            public Builder setTimeSeries(int i, TimeSeriesMetric.Builder builder) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setTimeSeries(i, builder.build());
                return this;
            }

            public Builder addTimeSeries(TimeSeriesMetric timeSeriesMetric) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addTimeSeries(timeSeriesMetric);
                return this;
            }

            public Builder addTimeSeries(int i, TimeSeriesMetric timeSeriesMetric) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addTimeSeries(i, timeSeriesMetric);
                return this;
            }

            public Builder addTimeSeries(TimeSeriesMetric.Builder builder) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addTimeSeries(builder.build());
                return this;
            }

            public Builder addTimeSeries(int i, TimeSeriesMetric.Builder builder) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addTimeSeries(i, builder.build());
                return this;
            }

            public Builder addAllTimeSeries(Iterable<? extends TimeSeriesMetric> iterable) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addAllTimeSeries(iterable);
                return this;
            }

            public Builder clearTimeSeries() {
                copyOnWrite();
                ((MetricsBatch) this.instance).clearTimeSeries();
                return this;
            }

            public Builder removeTimeSeries(int i) {
                copyOnWrite();
                ((MetricsBatch) this.instance).removeTimeSeries(i);
                return this;
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public List<EventMetric> getEventsList() {
                return Collections.unmodifiableList(((MetricsBatch) this.instance).getEventsList());
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public int getEventsCount() {
                return ((MetricsBatch) this.instance).getEventsCount();
            }

            @Override // livekit.LivekitMetrics.MetricsBatchOrBuilder
            public EventMetric getEvents(int i) {
                return ((MetricsBatch) this.instance).getEvents(i);
            }

            public Builder setEvents(int i, EventMetric eventMetric) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setEvents(i, eventMetric);
                return this;
            }

            public Builder setEvents(int i, EventMetric.Builder builder) {
                copyOnWrite();
                ((MetricsBatch) this.instance).setEvents(i, builder.build());
                return this;
            }

            public Builder addEvents(EventMetric eventMetric) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addEvents(eventMetric);
                return this;
            }

            public Builder addEvents(int i, EventMetric eventMetric) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addEvents(i, eventMetric);
                return this;
            }

            public Builder addEvents(EventMetric.Builder builder) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addEvents(builder.build());
                return this;
            }

            public Builder addEvents(int i, EventMetric.Builder builder) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addEvents(i, builder.build());
                return this;
            }

            public Builder addAllEvents(Iterable<? extends EventMetric> iterable) {
                copyOnWrite();
                ((MetricsBatch) this.instance).addAllEvents(iterable);
                return this;
            }

            public Builder clearEvents() {
                copyOnWrite();
                ((MetricsBatch) this.instance).clearEvents();
                return this;
            }

            public Builder removeEvents(int i) {
                copyOnWrite();
                ((MetricsBatch) this.instance).removeEvents(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MetricsBatch();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\t\u0003Ț\u0004\u001b\u0005\u001b", new Object[]{"timestampMs_", "normalizedTimestamp_", "strData_", "timeSeries_", TimeSeriesMetric.class, "events_", EventMetric.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MetricsBatch> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MetricsBatch.class) {
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
            MetricsBatch metricsBatch = new MetricsBatch();
            DEFAULT_INSTANCE = metricsBatch;
            GeneratedMessageLite.registerDefaultInstance(MetricsBatch.class, metricsBatch);
        }

        public static MetricsBatch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MetricsBatch> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: livekit.LivekitMetrics$1, reason: invalid class name */
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

    public static final class TimeSeriesMetric extends GeneratedMessageLite<TimeSeriesMetric, Builder> implements TimeSeriesMetricOrBuilder {
        private static final TimeSeriesMetric DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile Parser<TimeSeriesMetric> PARSER = null;
        public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 2;
        public static final int RID_FIELD_NUMBER = 5;
        public static final int SAMPLES_FIELD_NUMBER = 4;
        public static final int TRACK_SID_FIELD_NUMBER = 3;
        private int label_;
        private int participantIdentity_;
        private int rid_;
        private Internal.ProtobufList<MetricSample> samples_ = emptyProtobufList();
        private int trackSid_;

        private TimeSeriesMetric() {
        }

        @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
        public int getLabel() {
            return this.label_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabel(int i) {
            this.label_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabel() {
            this.label_ = 0;
        }

        @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
        public int getParticipantIdentity() {
            return this.participantIdentity_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantIdentity(int i) {
            this.participantIdentity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParticipantIdentity() {
            this.participantIdentity_ = 0;
        }

        @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
        public int getTrackSid() {
            return this.trackSid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackSid(int i) {
            this.trackSid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackSid() {
            this.trackSid_ = 0;
        }

        @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
        public List<MetricSample> getSamplesList() {
            return this.samples_;
        }

        public List<? extends MetricSampleOrBuilder> getSamplesOrBuilderList() {
            return this.samples_;
        }

        @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
        public int getSamplesCount() {
            return this.samples_.size();
        }

        @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
        public MetricSample getSamples(int i) {
            return this.samples_.get(i);
        }

        public MetricSampleOrBuilder getSamplesOrBuilder(int i) {
            return this.samples_.get(i);
        }

        private void ensureSamplesIsMutable() {
            Internal.ProtobufList<MetricSample> protobufList = this.samples_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.samples_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSamples(int i, MetricSample metricSample) {
            metricSample.getClass();
            ensureSamplesIsMutable();
            this.samples_.set(i, metricSample);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSamples(MetricSample metricSample) {
            metricSample.getClass();
            ensureSamplesIsMutable();
            this.samples_.add(metricSample);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSamples(int i, MetricSample metricSample) {
            metricSample.getClass();
            ensureSamplesIsMutable();
            this.samples_.add(i, metricSample);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSamples(Iterable<? extends MetricSample> iterable) {
            ensureSamplesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.samples_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSamples() {
            this.samples_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSamples(int i) {
            ensureSamplesIsMutable();
            this.samples_.remove(i);
        }

        @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
        public int getRid() {
            return this.rid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRid(int i) {
            this.rid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRid() {
            this.rid_ = 0;
        }

        public static TimeSeriesMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TimeSeriesMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TimeSeriesMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimeSeriesMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TimeSeriesMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimeSeriesMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TimeSeriesMetric parseFrom(InputStream inputStream) throws IOException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeSeriesMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimeSeriesMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimeSeriesMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeSeriesMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimeSeriesMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimeSeriesMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TimeSeriesMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimeSeriesMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TimeSeriesMetric timeSeriesMetric) {
            return DEFAULT_INSTANCE.createBuilder(timeSeriesMetric);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TimeSeriesMetric, Builder> implements TimeSeriesMetricOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(TimeSeriesMetric.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
            public int getLabel() {
                return ((TimeSeriesMetric) this.instance).getLabel();
            }

            public Builder setLabel(int i) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).setLabel(i);
                return this;
            }

            public Builder clearLabel() {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).clearLabel();
                return this;
            }

            @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
            public int getParticipantIdentity() {
                return ((TimeSeriesMetric) this.instance).getParticipantIdentity();
            }

            public Builder setParticipantIdentity(int i) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).setParticipantIdentity(i);
                return this;
            }

            public Builder clearParticipantIdentity() {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).clearParticipantIdentity();
                return this;
            }

            @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
            public int getTrackSid() {
                return ((TimeSeriesMetric) this.instance).getTrackSid();
            }

            public Builder setTrackSid(int i) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).setTrackSid(i);
                return this;
            }

            public Builder clearTrackSid() {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).clearTrackSid();
                return this;
            }

            @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
            public List<MetricSample> getSamplesList() {
                return Collections.unmodifiableList(((TimeSeriesMetric) this.instance).getSamplesList());
            }

            @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
            public int getSamplesCount() {
                return ((TimeSeriesMetric) this.instance).getSamplesCount();
            }

            @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
            public MetricSample getSamples(int i) {
                return ((TimeSeriesMetric) this.instance).getSamples(i);
            }

            public Builder setSamples(int i, MetricSample metricSample) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).setSamples(i, metricSample);
                return this;
            }

            public Builder setSamples(int i, MetricSample.Builder builder) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).setSamples(i, builder.build());
                return this;
            }

            public Builder addSamples(MetricSample metricSample) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).addSamples(metricSample);
                return this;
            }

            public Builder addSamples(int i, MetricSample metricSample) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).addSamples(i, metricSample);
                return this;
            }

            public Builder addSamples(MetricSample.Builder builder) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).addSamples(builder.build());
                return this;
            }

            public Builder addSamples(int i, MetricSample.Builder builder) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).addSamples(i, builder.build());
                return this;
            }

            public Builder addAllSamples(Iterable<? extends MetricSample> iterable) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).addAllSamples(iterable);
                return this;
            }

            public Builder clearSamples() {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).clearSamples();
                return this;
            }

            public Builder removeSamples(int i) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).removeSamples(i);
                return this;
            }

            @Override // livekit.LivekitMetrics.TimeSeriesMetricOrBuilder
            public int getRid() {
                return ((TimeSeriesMetric) this.instance).getRid();
            }

            public Builder setRid(int i) {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).setRid(i);
                return this;
            }

            public Builder clearRid() {
                copyOnWrite();
                ((TimeSeriesMetric) this.instance).clearRid();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimeSeriesMetric();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u001b\u0005\u000b", new Object[]{"label_", "participantIdentity_", "trackSid_", "samples_", MetricSample.class, "rid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimeSeriesMetric> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (TimeSeriesMetric.class) {
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
            TimeSeriesMetric timeSeriesMetric = new TimeSeriesMetric();
            DEFAULT_INSTANCE = timeSeriesMetric;
            GeneratedMessageLite.registerDefaultInstance(TimeSeriesMetric.class, timeSeriesMetric);
        }

        public static TimeSeriesMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TimeSeriesMetric> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MetricSample extends GeneratedMessageLite<MetricSample, Builder> implements MetricSampleOrBuilder {
        private static final MetricSample DEFAULT_INSTANCE;
        public static final int NORMALIZED_TIMESTAMP_FIELD_NUMBER = 2;
        private static volatile Parser<MetricSample> PARSER = null;
        public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private Timestamp normalizedTimestamp_;
        private long timestampMs_;
        private float value_;

        private MetricSample() {
        }

        @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
        public long getTimestampMs() {
            return this.timestampMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampMs(long j) {
            this.timestampMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampMs() {
            this.timestampMs_ = 0L;
        }

        @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
        public boolean hasNormalizedTimestamp() {
            return this.normalizedTimestamp_ != null;
        }

        @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
        public Timestamp getNormalizedTimestamp() {
            Timestamp timestamp = this.normalizedTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNormalizedTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.normalizedTimestamp_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNormalizedTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.normalizedTimestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.normalizedTimestamp_ = Timestamp.newBuilder(this.normalizedTimestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.normalizedTimestamp_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNormalizedTimestamp() {
            this.normalizedTimestamp_ = null;
        }

        @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
        public float getValue() {
            return this.value_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(float f) {
            this.value_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0f;
        }

        public static MetricSample parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MetricSample parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MetricSample parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MetricSample parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MetricSample parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricSample parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MetricSample parseFrom(InputStream inputStream) throws IOException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricSample parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricSample parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricSample) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricSample parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricSample) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricSample parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MetricSample parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MetricSample metricSample) {
            return DEFAULT_INSTANCE.createBuilder(metricSample);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MetricSample, Builder> implements MetricSampleOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(MetricSample.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
            public long getTimestampMs() {
                return ((MetricSample) this.instance).getTimestampMs();
            }

            public Builder setTimestampMs(long j) {
                copyOnWrite();
                ((MetricSample) this.instance).setTimestampMs(j);
                return this;
            }

            public Builder clearTimestampMs() {
                copyOnWrite();
                ((MetricSample) this.instance).clearTimestampMs();
                return this;
            }

            @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
            public boolean hasNormalizedTimestamp() {
                return ((MetricSample) this.instance).hasNormalizedTimestamp();
            }

            @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
            public Timestamp getNormalizedTimestamp() {
                return ((MetricSample) this.instance).getNormalizedTimestamp();
            }

            public Builder setNormalizedTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((MetricSample) this.instance).setNormalizedTimestamp(timestamp);
                return this;
            }

            public Builder setNormalizedTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((MetricSample) this.instance).setNormalizedTimestamp(builder.build());
                return this;
            }

            public Builder mergeNormalizedTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((MetricSample) this.instance).mergeNormalizedTimestamp(timestamp);
                return this;
            }

            public Builder clearNormalizedTimestamp() {
                copyOnWrite();
                ((MetricSample) this.instance).clearNormalizedTimestamp();
                return this;
            }

            @Override // livekit.LivekitMetrics.MetricSampleOrBuilder
            public float getValue() {
                return ((MetricSample) this.instance).getValue();
            }

            public Builder setValue(float f) {
                copyOnWrite();
                ((MetricSample) this.instance).setValue(f);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((MetricSample) this.instance).clearValue();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MetricSample();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\t\u0003\u0001", new Object[]{"timestampMs_", "normalizedTimestamp_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MetricSample> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MetricSample.class) {
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
            MetricSample metricSample = new MetricSample();
            DEFAULT_INSTANCE = metricSample;
            GeneratedMessageLite.registerDefaultInstance(MetricSample.class, metricSample);
        }

        public static MetricSample getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MetricSample> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class EventMetric extends GeneratedMessageLite<EventMetric, Builder> implements EventMetricOrBuilder {
        private static final EventMetric DEFAULT_INSTANCE;
        public static final int END_TIMESTAMP_MS_FIELD_NUMBER = 5;
        public static final int LABEL_FIELD_NUMBER = 1;
        public static final int METADATA_FIELD_NUMBER = 8;
        public static final int NORMALIZED_END_TIMESTAMP_FIELD_NUMBER = 7;
        public static final int NORMALIZED_START_TIMESTAMP_FIELD_NUMBER = 6;
        private static volatile Parser<EventMetric> PARSER = null;
        public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 2;
        public static final int RID_FIELD_NUMBER = 9;
        public static final int START_TIMESTAMP_MS_FIELD_NUMBER = 4;
        public static final int TRACK_SID_FIELD_NUMBER = 3;
        private int bitField0_;
        private long endTimestampMs_;
        private int label_;
        private String metadata_ = "";
        private Timestamp normalizedEndTimestamp_;
        private Timestamp normalizedStartTimestamp_;
        private int participantIdentity_;
        private int rid_;
        private long startTimestampMs_;
        private int trackSid_;

        private EventMetric() {
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public int getLabel() {
            return this.label_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabel(int i) {
            this.label_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabel() {
            this.label_ = 0;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public int getParticipantIdentity() {
            return this.participantIdentity_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParticipantIdentity(int i) {
            this.participantIdentity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParticipantIdentity() {
            this.participantIdentity_ = 0;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public int getTrackSid() {
            return this.trackSid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackSid(int i) {
            this.trackSid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackSid() {
            this.trackSid_ = 0;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public long getStartTimestampMs() {
            return this.startTimestampMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimestampMs(long j) {
            this.startTimestampMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTimestampMs() {
            this.startTimestampMs_ = 0L;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public boolean hasEndTimestampMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public long getEndTimestampMs() {
            return this.endTimestampMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTimestampMs(long j) {
            this.bitField0_ |= 1;
            this.endTimestampMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTimestampMs() {
            this.bitField0_ &= -2;
            this.endTimestampMs_ = 0L;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public boolean hasNormalizedStartTimestamp() {
            return this.normalizedStartTimestamp_ != null;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public Timestamp getNormalizedStartTimestamp() {
            Timestamp timestamp = this.normalizedStartTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNormalizedStartTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.normalizedStartTimestamp_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNormalizedStartTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.normalizedStartTimestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.normalizedStartTimestamp_ = Timestamp.newBuilder(this.normalizedStartTimestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.normalizedStartTimestamp_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNormalizedStartTimestamp() {
            this.normalizedStartTimestamp_ = null;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public boolean hasNormalizedEndTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public Timestamp getNormalizedEndTimestamp() {
            Timestamp timestamp = this.normalizedEndTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNormalizedEndTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.normalizedEndTimestamp_ = timestamp;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNormalizedEndTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.normalizedEndTimestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.normalizedEndTimestamp_ = Timestamp.newBuilder(this.normalizedEndTimestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.normalizedEndTimestamp_ = timestamp;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNormalizedEndTimestamp() {
            this.normalizedEndTimestamp_ = null;
            this.bitField0_ &= -3;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public String getMetadata() {
            return this.metadata_;
        }

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
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

        @Override // livekit.LivekitMetrics.EventMetricOrBuilder
        public int getRid() {
            return this.rid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRid(int i) {
            this.rid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRid() {
            this.rid_ = 0;
        }

        public static EventMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EventMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EventMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EventMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EventMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EventMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EventMetric parseFrom(InputStream inputStream) throws IOException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EventMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(EventMetric eventMetric) {
            return DEFAULT_INSTANCE.createBuilder(eventMetric);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<EventMetric, Builder> implements EventMetricOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(EventMetric.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public int getLabel() {
                return ((EventMetric) this.instance).getLabel();
            }

            public Builder setLabel(int i) {
                copyOnWrite();
                ((EventMetric) this.instance).setLabel(i);
                return this;
            }

            public Builder clearLabel() {
                copyOnWrite();
                ((EventMetric) this.instance).clearLabel();
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public int getParticipantIdentity() {
                return ((EventMetric) this.instance).getParticipantIdentity();
            }

            public Builder setParticipantIdentity(int i) {
                copyOnWrite();
                ((EventMetric) this.instance).setParticipantIdentity(i);
                return this;
            }

            public Builder clearParticipantIdentity() {
                copyOnWrite();
                ((EventMetric) this.instance).clearParticipantIdentity();
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public int getTrackSid() {
                return ((EventMetric) this.instance).getTrackSid();
            }

            public Builder setTrackSid(int i) {
                copyOnWrite();
                ((EventMetric) this.instance).setTrackSid(i);
                return this;
            }

            public Builder clearTrackSid() {
                copyOnWrite();
                ((EventMetric) this.instance).clearTrackSid();
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public long getStartTimestampMs() {
                return ((EventMetric) this.instance).getStartTimestampMs();
            }

            public Builder setStartTimestampMs(long j) {
                copyOnWrite();
                ((EventMetric) this.instance).setStartTimestampMs(j);
                return this;
            }

            public Builder clearStartTimestampMs() {
                copyOnWrite();
                ((EventMetric) this.instance).clearStartTimestampMs();
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public boolean hasEndTimestampMs() {
                return ((EventMetric) this.instance).hasEndTimestampMs();
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public long getEndTimestampMs() {
                return ((EventMetric) this.instance).getEndTimestampMs();
            }

            public Builder setEndTimestampMs(long j) {
                copyOnWrite();
                ((EventMetric) this.instance).setEndTimestampMs(j);
                return this;
            }

            public Builder clearEndTimestampMs() {
                copyOnWrite();
                ((EventMetric) this.instance).clearEndTimestampMs();
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public boolean hasNormalizedStartTimestamp() {
                return ((EventMetric) this.instance).hasNormalizedStartTimestamp();
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public Timestamp getNormalizedStartTimestamp() {
                return ((EventMetric) this.instance).getNormalizedStartTimestamp();
            }

            public Builder setNormalizedStartTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((EventMetric) this.instance).setNormalizedStartTimestamp(timestamp);
                return this;
            }

            public Builder setNormalizedStartTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((EventMetric) this.instance).setNormalizedStartTimestamp(builder.build());
                return this;
            }

            public Builder mergeNormalizedStartTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((EventMetric) this.instance).mergeNormalizedStartTimestamp(timestamp);
                return this;
            }

            public Builder clearNormalizedStartTimestamp() {
                copyOnWrite();
                ((EventMetric) this.instance).clearNormalizedStartTimestamp();
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public boolean hasNormalizedEndTimestamp() {
                return ((EventMetric) this.instance).hasNormalizedEndTimestamp();
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public Timestamp getNormalizedEndTimestamp() {
                return ((EventMetric) this.instance).getNormalizedEndTimestamp();
            }

            public Builder setNormalizedEndTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((EventMetric) this.instance).setNormalizedEndTimestamp(timestamp);
                return this;
            }

            public Builder setNormalizedEndTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((EventMetric) this.instance).setNormalizedEndTimestamp(builder.build());
                return this;
            }

            public Builder mergeNormalizedEndTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((EventMetric) this.instance).mergeNormalizedEndTimestamp(timestamp);
                return this;
            }

            public Builder clearNormalizedEndTimestamp() {
                copyOnWrite();
                ((EventMetric) this.instance).clearNormalizedEndTimestamp();
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public String getMetadata() {
                return ((EventMetric) this.instance).getMetadata();
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public ByteString getMetadataBytes() {
                return ((EventMetric) this.instance).getMetadataBytes();
            }

            public Builder setMetadata(String str) {
                copyOnWrite();
                ((EventMetric) this.instance).setMetadata(str);
                return this;
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((EventMetric) this.instance).clearMetadata();
                return this;
            }

            public Builder setMetadataBytes(ByteString byteString) {
                copyOnWrite();
                ((EventMetric) this.instance).setMetadataBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitMetrics.EventMetricOrBuilder
            public int getRid() {
                return ((EventMetric) this.instance).getRid();
            }

            public Builder setRid(int i) {
                copyOnWrite();
                ((EventMetric) this.instance).setRid(i);
                return this;
            }

            public Builder clearRid() {
                copyOnWrite();
                ((EventMetric) this.instance).clearRid();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EventMetric();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u0002\u0005ဂ\u0000\u0006\t\u0007ဉ\u0001\bȈ\t\u000b", new Object[]{"bitField0_", "label_", "participantIdentity_", "trackSid_", "startTimestampMs_", "endTimestampMs_", "normalizedStartTimestamp_", "normalizedEndTimestamp_", "metadata_", "rid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EventMetric> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (EventMetric.class) {
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
            EventMetric eventMetric = new EventMetric();
            DEFAULT_INSTANCE = eventMetric;
            GeneratedMessageLite.registerDefaultInstance(EventMetric.class, eventMetric);
        }

        public static EventMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<EventMetric> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MetricsRecordingHeader extends GeneratedMessageLite<MetricsRecordingHeader, Builder> implements MetricsRecordingHeaderOrBuilder {
        private static final MetricsRecordingHeader DEFAULT_INSTANCE;
        public static final int ENABLE_USER_DATA_TRAINING_FIELD_NUMBER = 2;
        private static volatile Parser<MetricsRecordingHeader> PARSER = null;
        public static final int ROOM_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean enableUserDataTraining_;
        private String roomId_ = "";

        private MetricsRecordingHeader() {
        }

        @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
        public boolean hasEnableUserDataTraining() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
        public boolean getEnableUserDataTraining() {
            return this.enableUserDataTraining_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableUserDataTraining(boolean z) {
            this.bitField0_ |= 1;
            this.enableUserDataTraining_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableUserDataTraining() {
            this.bitField0_ &= -2;
            this.enableUserDataTraining_ = false;
        }

        public static MetricsRecordingHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MetricsRecordingHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MetricsRecordingHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MetricsRecordingHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MetricsRecordingHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricsRecordingHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MetricsRecordingHeader parseFrom(InputStream inputStream) throws IOException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricsRecordingHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricsRecordingHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricsRecordingHeader) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricsRecordingHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricsRecordingHeader) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MetricsRecordingHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MetricsRecordingHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricsRecordingHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MetricsRecordingHeader metricsRecordingHeader) {
            return DEFAULT_INSTANCE.createBuilder(metricsRecordingHeader);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MetricsRecordingHeader, Builder> implements MetricsRecordingHeaderOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(MetricsRecordingHeader.DEFAULT_INSTANCE);
            }

            @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
            public String getRoomId() {
                return ((MetricsRecordingHeader) this.instance).getRoomId();
            }

            @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
            public ByteString getRoomIdBytes() {
                return ((MetricsRecordingHeader) this.instance).getRoomIdBytes();
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((MetricsRecordingHeader) this.instance).setRoomId(str);
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((MetricsRecordingHeader) this.instance).clearRoomId();
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MetricsRecordingHeader) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
            public boolean hasEnableUserDataTraining() {
                return ((MetricsRecordingHeader) this.instance).hasEnableUserDataTraining();
            }

            @Override // livekit.LivekitMetrics.MetricsRecordingHeaderOrBuilder
            public boolean getEnableUserDataTraining() {
                return ((MetricsRecordingHeader) this.instance).getEnableUserDataTraining();
            }

            public Builder setEnableUserDataTraining(boolean z) {
                copyOnWrite();
                ((MetricsRecordingHeader) this.instance).setEnableUserDataTraining(z);
                return this;
            }

            public Builder clearEnableUserDataTraining() {
                copyOnWrite();
                ((MetricsRecordingHeader) this.instance).clearEnableUserDataTraining();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MetricsRecordingHeader();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဇ\u0000", new Object[]{"bitField0_", "roomId_", "enableUserDataTraining_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MetricsRecordingHeader> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MetricsRecordingHeader.class) {
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
            MetricsRecordingHeader metricsRecordingHeader = new MetricsRecordingHeader();
            DEFAULT_INSTANCE = metricsRecordingHeader;
            GeneratedMessageLite.registerDefaultInstance(MetricsRecordingHeader.class, metricsRecordingHeader);
        }

        public static MetricsRecordingHeader getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MetricsRecordingHeader> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
