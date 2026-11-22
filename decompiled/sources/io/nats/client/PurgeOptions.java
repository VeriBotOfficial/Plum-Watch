package io.nats.client;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.Validator;

/* loaded from: classes6.dex */
public class PurgeOptions implements JsonSerializable {
    protected final long keep;
    protected final long seq;
    protected final String subject;

    private PurgeOptions(String str, long j, long j2) {
        this.subject = str;
        this.seq = j;
        this.keep = j2;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, "filter", this.subject);
        JsonUtils.addField(beginJson, ApiConstants.SEQ, Long.valueOf(this.seq));
        JsonUtils.addField(beginJson, ApiConstants.KEEP, Long.valueOf(this.keep));
        return JsonUtils.endJson(beginJson).toString();
    }

    public String getSubject() {
        return this.subject;
    }

    public long getSequence() {
        return this.seq;
    }

    public long getKeep() {
        return this.keep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurgeOptions subject(String str) {
        return new Builder().subject(str).build();
    }

    public static class Builder {
        private String subject;
        private long seq = -1;
        private long keep = -1;

        public Builder subject(String str) {
            this.subject = Validator.validateSubject(str, false);
            return this;
        }

        public Builder sequence(long j) {
            this.seq = j;
            return this;
        }

        public Builder keep(long j) {
            this.keep = j;
            return this;
        }

        public PurgeOptions build() {
            Validator.validateSubject(this.subject, false);
            if (this.seq > 0 && this.keep > 0) {
                throw new IllegalArgumentException("seq and keep are mutually exclusive.");
            }
            return new PurgeOptions(this.subject, this.seq, this.keep);
        }
    }
}
