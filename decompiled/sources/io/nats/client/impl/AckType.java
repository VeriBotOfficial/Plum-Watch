package io.nats.client.impl;

import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public enum AckType {
    AckAck("+ACK", true),
    AckNak("-NAK", true),
    AckProgress("+WPI", false),
    AckTerm("+TERM", true),
    AckNext("+NXT", false);

    public final byte[] bytes;
    public final boolean terminal;
    public final String text;

    AckType(String str, boolean z) {
        this.text = str;
        this.bytes = str.getBytes(StandardCharsets.US_ASCII);
        this.terminal = z;
    }

    public byte[] bodyBytes(long j) {
        return j < 1 ? this.bytes : (this.text + " {\"delay\": " + j + "}").getBytes(StandardCharsets.US_ASCII);
    }
}
