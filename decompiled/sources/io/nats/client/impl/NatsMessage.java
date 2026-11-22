package io.nats.client.impl;

import io.nats.client.Connection;
import io.nats.client.Message;
import io.nats.client.Subscription;
import io.nats.client.support.ByteArrayBuilder;
import io.nats.client.support.NatsConstants;
import io.nats.client.support.Status;
import io.nats.client.support.Validator;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.TimeoutException;
import org.xmind.core.IMeta;

/* loaded from: classes6.dex */
public class NatsMessage implements Message {
    protected static final String NOT_A_JET_STREAM_MESSAGE = "Message is not a JetStream message";
    protected int controlLineLength;
    protected byte[] data;
    protected int dataLen;
    protected int headerLen;
    protected Headers headers;
    protected AckType lastAck;
    NatsMessage next;
    protected ByteArrayBuilder protocolBab;
    protected String replyTo;
    protected String sid;
    protected int sizeInBytes;
    protected String subject;
    protected NatsSubscription subscription;
    protected boolean utf8mode;

    @Override // io.nats.client.Message
    public void ack() {
    }

    @Override // io.nats.client.Message
    public void ackSync(Duration duration) throws InterruptedException, TimeoutException {
    }

    @Override // io.nats.client.Message
    public Status getStatus() {
        return null;
    }

    @Override // io.nats.client.Message
    public void inProgress() {
    }

    @Override // io.nats.client.Message
    public boolean isJetStream() {
        return false;
    }

    boolean isProtocol() {
        return false;
    }

    @Override // io.nats.client.Message
    public boolean isStatusMessage() {
        return false;
    }

    @Override // io.nats.client.Message
    public void nak() {
    }

    @Override // io.nats.client.Message
    public void nakWithDelay(long j) {
    }

    @Override // io.nats.client.Message
    public void nakWithDelay(Duration duration) {
    }

    @Override // io.nats.client.Message
    public void term() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected NatsMessage() {
        this((byte[]) null);
    }

    protected NatsMessage(byte[] bArr) {
        this.sizeInBytes = -1;
        this.headerLen = 0;
        bArr = bArr == null ? NatsConstants.EMPTY_BODY : bArr;
        this.data = bArr;
        this.dataLen = bArr.length;
    }

    @Deprecated
    public NatsMessage(String str, String str2, byte[] bArr, boolean z) {
        this(str, str2, (Headers) null, bArr);
        this.utf8mode = z;
    }

    @Deprecated
    public NatsMessage(String str, String str2, Headers headers, byte[] bArr, boolean z) {
        this(str, str2, headers, bArr);
        this.utf8mode = z;
    }

    public NatsMessage(String str, String str2, byte[] bArr) {
        this(str, str2, (Headers) null, bArr);
    }

    public NatsMessage(String str, String str2, Headers headers, byte[] bArr) {
        this(bArr);
        this.subject = Validator.validateSubject(str, true);
        this.replyTo = Validator.validateReplyTo(str2, false);
        this.headers = headers;
        this.utf8mode = false;
        finishConstruct();
    }

    public NatsMessage(Message message) {
        this(message.getData());
        this.subject = message.getSubject();
        this.replyTo = message.getReplyTo();
        this.headers = message.getHeaders();
        this.utf8mode = message.isUtf8mode();
        finishConstruct();
    }

    protected void finishConstruct() {
        String str = this.replyTo;
        int length = str == null ? 0 : str.length();
        Headers headers = this.headers;
        if (headers != null && !headers.isEmpty()) {
            this.headerLen = this.headers.serializedLength();
        } else {
            this.headerLen = 0;
        }
        int i = this.headerLen + this.dataLen;
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder((this.subject.length() * 2) + 32 + length + i);
        if (this.headerLen > 0) {
            byteArrayBuilder.append(NatsConstants.HPUB_SP_BYTES, 0, NatsConstants.HPUB_SP_BYTES_LEN);
        } else {
            byteArrayBuilder.append(NatsConstants.PUB_SP_BYTES, 0, NatsConstants.PUB_SP_BYTES_LEN);
        }
        byteArrayBuilder.append(this.subject.getBytes(StandardCharsets.UTF_8)).append((byte) 32);
        if (length > 0) {
            byteArrayBuilder.append(this.replyTo.getBytes(StandardCharsets.UTF_8)).append((byte) 32);
        }
        int i2 = this.headerLen;
        if (i2 > 0) {
            byteArrayBuilder.append(Integer.toString(i2).getBytes(StandardCharsets.US_ASCII)).append((byte) 32);
        }
        byteArrayBuilder.append(Integer.toString(i).getBytes(StandardCharsets.US_ASCII));
        this.protocolBab = byteArrayBuilder;
        int length2 = byteArrayBuilder.length() + 2;
        this.controlLineLength = length2;
        this.sizeInBytes = length2 + i + 2;
    }

    long getSizeInBytes() {
        return this.sizeInBytes;
    }

    byte[] getProtocolBytes() {
        return this.protocolBab.toByteArray();
    }

    int getControlLineLength() {
        return this.controlLineLength;
    }

    Headers getOrCreateHeaders() {
        if (this.headers == null) {
            this.headers = new Headers();
        }
        return this.headers;
    }

    void setSubscription(NatsSubscription natsSubscription) {
        this.subscription = natsSubscription;
    }

    NatsSubscription getNatsSubscription() {
        return this.subscription;
    }

    @Override // io.nats.client.Message
    public String getSID() {
        return this.sid;
    }

    @Override // io.nats.client.Message
    public Connection getConnection() {
        NatsSubscription natsSubscription = this.subscription;
        if (natsSubscription == null) {
            return null;
        }
        return natsSubscription.connection;
    }

    @Override // io.nats.client.Message
    public String getSubject() {
        return this.subject;
    }

    @Override // io.nats.client.Message
    public String getReplyTo() {
        return this.replyTo;
    }

    int copyNotEmptyHeaders(int i, byte[] bArr) {
        Headers headers = this.headers;
        if (headers == null || headers.isEmpty()) {
            return 0;
        }
        return this.headers.serializeToArray(i, bArr);
    }

    @Override // io.nats.client.Message
    public boolean hasHeaders() {
        Headers headers = this.headers;
        return (headers == null || headers.isEmpty()) ? false : true;
    }

    @Override // io.nats.client.Message
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.nats.client.Message
    public byte[] getData() {
        return this.data;
    }

    @Override // io.nats.client.Message
    public boolean isUtf8mode() {
        return this.utf8mode;
    }

    @Override // io.nats.client.Message
    public Subscription getSubscription() {
        return this.subscription;
    }

    @Override // io.nats.client.Message
    public AckType lastAck() {
        return this.lastAck;
    }

    @Override // io.nats.client.Message
    public NatsJetStreamMetaData metaData() {
        throw new IllegalStateException(NOT_A_JET_STREAM_MESSAGE);
    }

    @Override // io.nats.client.Message
    public long consumeByteCount() {
        String str = this.subject;
        if (str == null) {
            return 0L;
        }
        int length = str.length() + this.headerLen + this.dataLen;
        return length + (this.replyTo == null ? 0 : r1.length());
    }

    public String toString() {
        if (this.subject == null) {
            return "NatsMessage | " + protocolBytesToString();
        }
        return "NatsMessage |" + this.subject + "|" + replyToString() + "|" + dataToString() + "|";
    }

    String toDetailString() {
        return "NatsMessage:\n  subject='" + this.subject + "'\n  replyTo='" + replyToString() + "'\n  data=" + dataToString() + "\n  utf8mode=" + this.utf8mode + "\n  headers=" + headersToString() + "\n  sid='" + this.sid + "'\n  protocolBytes=" + protocolBytesToString() + "\n  sizeInBytes=" + this.sizeInBytes + "\n  headerLen=" + this.headerLen + "\n  dataLen=" + this.dataLen + "\n  subscription=" + this.subscription + "\n  next=" + nextToString();
    }

    private String headersToString() {
        return hasHeaders() ? new String(this.headers.getSerialized(), StandardCharsets.US_ASCII).replace("\r", "+").replace("\n", "+") : "";
    }

    private String dataToString() {
        if (this.data.length == 0) {
            return "<no data>";
        }
        String str = new String(this.data, StandardCharsets.UTF_8);
        int indexOf = str.indexOf("io.nats.jetstream.api");
        if (indexOf == -1) {
            return str.length() > 27 ? str.substring(0, 27) + "..." : str;
        }
        return str.substring(indexOf, str.indexOf(34, indexOf));
    }

    private String replyToString() {
        String str = this.replyTo;
        return str == null ? "<no reply>" : str;
    }

    private String protocolBytesToString() {
        ByteArrayBuilder byteArrayBuilder = this.protocolBab;
        if (byteArrayBuilder == null) {
            return null;
        }
        return byteArrayBuilder.toString();
    }

    private String nextToString() {
        return this.next == null ? IMeta.V_NO : IMeta.V_YES;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private byte[] data;
        private Headers headers;
        private String replyTo;
        private String subject;
        private boolean utf8mode;

        public Builder subject(String str) {
            this.subject = str;
            return this;
        }

        public Builder replyTo(String str) {
            this.replyTo = str;
            return this;
        }

        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        public Builder data(String str) {
            if (str != null) {
                this.data = str.getBytes(StandardCharsets.UTF_8);
            }
            return this;
        }

        public Builder data(String str, Charset charset) {
            this.data = str.getBytes(charset);
            return this;
        }

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        @Deprecated
        public Builder utf8mode(boolean z) {
            this.utf8mode = z;
            return this;
        }

        public NatsMessage build() {
            return new NatsMessage(this.subject, this.replyTo, this.headers, this.data, this.utf8mode);
        }
    }
}
