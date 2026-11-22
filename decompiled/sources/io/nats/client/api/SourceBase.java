package io.nats.client.api;

import io.nats.client.JetStreamOptions;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.time.ZonedDateTime;

/* loaded from: classes6.dex */
abstract class SourceBase implements JsonSerializable {
    private final External external;
    private final String filterSubject;
    private final String name;
    private final long startSeq;
    private final ZonedDateTime startTime;

    SourceBase(JsonValue jsonValue) {
        this.name = JsonValueUtils.readString(jsonValue, "name");
        this.startSeq = JsonValueUtils.readLong(jsonValue, ApiConstants.OPT_START_SEQ, 0L);
        this.startTime = JsonValueUtils.readDate(jsonValue, ApiConstants.OPT_START_TIME);
        this.filterSubject = JsonValueUtils.readString(jsonValue, ApiConstants.FILTER_SUBJECT);
        this.external = External.optionalInstance(JsonValueUtils.readValue(jsonValue, "external"));
    }

    SourceBase(SourceBaseBuilder sourceBaseBuilder) {
        this.name = sourceBaseBuilder.name;
        this.startSeq = sourceBaseBuilder.startSeq;
        this.startTime = sourceBaseBuilder.startTime;
        this.filterSubject = sourceBaseBuilder.filterSubject;
        this.external = sourceBaseBuilder.external;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, "name", this.name);
        long j = this.startSeq;
        if (j > 0) {
            JsonUtils.addField(beginJson, ApiConstants.OPT_START_SEQ, Long.valueOf(j));
        }
        JsonUtils.addField(beginJson, ApiConstants.OPT_START_TIME, this.startTime);
        JsonUtils.addField(beginJson, ApiConstants.FILTER_SUBJECT, this.filterSubject);
        JsonUtils.addField(beginJson, "external", this.external);
        return JsonUtils.endJson(beginJson).toString();
    }

    public String getSourceName() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public long getStartSeq() {
        return this.startSeq;
    }

    public ZonedDateTime getStartTime() {
        return this.startTime;
    }

    public String getFilterSubject() {
        return this.filterSubject;
    }

    public External getExternal() {
        return this.external;
    }

    public String toString() {
        return JsonUtils.toKey(getClass()) + toJson();
    }

    public static abstract class SourceBaseBuilder<T> {
        External external;
        String filterSubject;
        String name;
        long startSeq;
        ZonedDateTime startTime;

        abstract T getThis();

        public SourceBaseBuilder() {
        }

        public SourceBaseBuilder(SourceBase sourceBase) {
            this.name = sourceBase.name;
            this.startSeq = sourceBase.startSeq;
            this.startTime = sourceBase.startTime;
            this.filterSubject = sourceBase.filterSubject;
            this.external = sourceBase.external;
        }

        public T sourceName(String str) {
            this.name = str;
            return getThis();
        }

        public T name(String str) {
            this.name = str;
            return getThis();
        }

        public T startSeq(long j) {
            this.startSeq = j;
            return getThis();
        }

        public T startTime(ZonedDateTime zonedDateTime) {
            this.startTime = zonedDateTime;
            return getThis();
        }

        public T filterSubject(String str) {
            this.filterSubject = str;
            return getThis();
        }

        public T external(External external) {
            this.external = external;
            return getThis();
        }

        public T domain(String str) {
            String convertDomainToPrefix = JetStreamOptions.convertDomainToPrefix(str);
            this.external = convertDomainToPrefix == null ? null : External.builder().api(convertDomainToPrefix).build();
            return getThis();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SourceBase sourceBase = (SourceBase) obj;
            if (this.startSeq != sourceBase.startSeq) {
                return false;
            }
            String str = this.name;
            if (str == null ? sourceBase.name != null : !str.equals(sourceBase.name)) {
                return false;
            }
            ZonedDateTime zonedDateTime = this.startTime;
            if (zonedDateTime == null ? sourceBase.startTime != null : !zonedDateTime.equals(sourceBase.startTime)) {
                return false;
            }
            String str2 = this.filterSubject;
            if (str2 == null ? sourceBase.filterSubject != null : !str2.equals(sourceBase.filterSubject)) {
                return false;
            }
            External external = this.external;
            External external2 = sourceBase.external;
            if (external != null) {
                return external.equals(external2);
            }
            if (external2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.startSeq;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        ZonedDateTime zonedDateTime = this.startTime;
        int hashCode2 = (i + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31;
        String str2 = this.filterSubject;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        External external = this.external;
        return hashCode3 + (external != null ? external.hashCode() : 0);
    }
}
