package io.nats.client.api;

import io.nats.client.support.Validator;
import java.time.ZonedDateTime;

/* loaded from: classes6.dex */
public class OrderedConsumerConfiguration {
    public static String DEFAULT_FILTER_SUBJECT = ">";
    private DeliverPolicy deliverPolicy;
    private Boolean headersOnly;
    private ReplayPolicy replayPolicy;
    private ZonedDateTime startTime;
    private Long startSequence = -1L;
    private String filterSubject = DEFAULT_FILTER_SUBJECT;

    public OrderedConsumerConfiguration filterSubject(String str) {
        this.filterSubject = Validator.emptyOrNullAs(str, DEFAULT_FILTER_SUBJECT);
        return this;
    }

    public OrderedConsumerConfiguration deliverPolicy(DeliverPolicy deliverPolicy) {
        this.deliverPolicy = deliverPolicy;
        return this;
    }

    public OrderedConsumerConfiguration startSequence(long j) {
        if (j < 1) {
            j = -1;
        }
        this.startSequence = Long.valueOf(j);
        return this;
    }

    public OrderedConsumerConfiguration startTime(ZonedDateTime zonedDateTime) {
        this.startTime = zonedDateTime;
        return this;
    }

    public OrderedConsumerConfiguration replayPolicy(ReplayPolicy replayPolicy) {
        this.replayPolicy = replayPolicy;
        return this;
    }

    public OrderedConsumerConfiguration headersOnly(Boolean bool) {
        this.headersOnly = (bool == null || !bool.booleanValue()) ? null : true;
        return this;
    }

    public String getFilterSubject() {
        return this.filterSubject;
    }

    public DeliverPolicy getDeliverPolicy() {
        return this.deliverPolicy;
    }

    public Long getStartSequence() {
        return this.startSequence;
    }

    public ZonedDateTime getStartTime() {
        return this.startTime;
    }

    public ReplayPolicy getReplayPolicy() {
        return this.replayPolicy;
    }

    public Boolean getHeadersOnly() {
        return this.headersOnly;
    }
}
