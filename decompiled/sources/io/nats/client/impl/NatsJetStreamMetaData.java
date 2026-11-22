package io.nats.client.impl;

import android.gov.nist.core.Separators;
import java.time.ZonedDateTime;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class NatsJetStreamMetaData {
    private static final long NANO_FACTOR = 1000000000;
    private final String accountHash;
    private final String consumer;
    private final long consumerSeq;
    private final long delivered;
    private final String domain;
    private final long pending;
    private final String prefix;
    private final String stream;
    private final long streamSeq;
    private final ZonedDateTime timestamp;

    public String toString() {
        return "NatsJetStreamMetaData{prefix='" + this.prefix + "', domain='" + this.domain + "', stream='" + this.stream + "', consumer='" + this.consumer + "', delivered=" + this.delivered + ", streamSeq=" + this.streamSeq + ", consumerSeq=" + this.consumerSeq + ", timestamp=" + this.timestamp + ", pending=" + this.pending + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:12:0x003b, B:14:0x0042, B:15:0x0046, B:17:0x004a, B:18:0x004d, B:20:0x00a1, B:21:0x00ac), top: B:11:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:12:0x003b, B:14:0x0042, B:15:0x0046, B:17:0x004a, B:18:0x004d, B:20:0x00a1, B:21:0x00ac), top: B:11:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:12:0x003b, B:14:0x0042, B:15:0x0046, B:17:0x004a, B:18:0x004d, B:20:0x00a1, B:21:0x00ac), top: B:11:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NatsJetStreamMetaData(io.nats.client.impl.NatsMessage r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nats.client.impl.NatsJetStreamMetaData.<init>(io.nats.client.impl.NatsMessage):void");
    }

    public String getDomain() {
        return this.domain;
    }

    public String getStream() {
        return this.stream;
    }

    public String getConsumer() {
        return this.consumer;
    }

    public long deliveredCount() {
        return this.delivered;
    }

    public long streamSequence() {
        return this.streamSeq;
    }

    public long consumerSequence() {
        return this.consumerSeq;
    }

    public long pendingCount() {
        return this.pending;
    }

    public ZonedDateTime timestamp() {
        return this.timestamp;
    }

    String getAccountHash() {
        return this.accountHash;
    }

    private String notAJetStreamMessage(String str) {
        return "Message is not a JetStream message.  ReplySubject: <" + str + Separators.GREATER_THAN;
    }
}
