package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;

/* loaded from: classes6.dex */
public class MessageGetRequest implements JsonSerializable {
    private final String lastBySubject;
    private final String nextBySubject;
    private final long sequence;

    public static MessageGetRequest forSequence(long j) {
        return new MessageGetRequest(j, null, null);
    }

    public static MessageGetRequest lastForSubject(String str) {
        return new MessageGetRequest(-1L, str, null);
    }

    public static MessageGetRequest firstForSubject(String str) {
        return new MessageGetRequest(-1L, null, str);
    }

    public static MessageGetRequest nextForSubject(long j, String str) {
        return new MessageGetRequest(j, null, str);
    }

    @Deprecated
    public static byte[] seqBytes(long j) {
        return forSequence(j).serialize();
    }

    @Deprecated
    public static byte[] lastBySubjectBytes(String str) {
        return lastForSubject(str).serialize();
    }

    @Deprecated
    public MessageGetRequest(long j) {
        this(j, null, null);
    }

    @Deprecated
    public MessageGetRequest(String str) {
        this(-1L, str, null);
    }

    private MessageGetRequest(long j, String str, String str2) {
        this.sequence = j;
        this.lastBySubject = str;
        this.nextBySubject = str2;
    }

    public long getSequence() {
        return this.sequence;
    }

    public String getLastBySubject() {
        return this.lastBySubject;
    }

    public String getNextBySubject() {
        return this.nextBySubject;
    }

    public boolean isSequenceOnly() {
        return this.sequence > 0 && this.nextBySubject == null;
    }

    public boolean isLastBySubject() {
        return this.lastBySubject != null;
    }

    public boolean isNextBySubject() {
        return this.nextBySubject != null;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, ApiConstants.SEQ, Long.valueOf(this.sequence));
        JsonUtils.addField(beginJson, ApiConstants.LAST_BY_SUBJECT, this.lastBySubject);
        JsonUtils.addField(beginJson, ApiConstants.NEXT_BY_SUBJECT, this.nextBySubject);
        return JsonUtils.endJson(beginJson).toString();
    }
}
