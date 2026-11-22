package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    public interface Observer {
        void onBufferedAmountChange(long previousAmount);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] data, boolean binary);

    private native State nativeState();

    private native void nativeUnregisterObserver(long observer);

    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";

        /* renamed from: id, reason: collision with root package name */
        public int f18735id = -1;

        boolean getOrdered() {
            return this.ordered;
        }

        int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        String getProtocol() {
            return this.protocol;
        }

        boolean getNegotiated() {
            return this.negotiated;
        }

        int getId() {
            return this.f18735id;
        }
    }

    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        public Buffer(ByteBuffer data, boolean binary) {
            this.data = data;
            this.binary = binary;
        }
    }

    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        static State fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public DataChannel(long nativeDataChannel) {
        this.nativeDataChannel = nativeDataChannel;
    }

    public void registerObserver(Observer observer) {
        checkDataChannelExists();
        long j = this.nativeObserver;
        if (j != 0) {
            nativeUnregisterObserver(j);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
        this.nativeObserver = 0L;
    }

    public String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public int id() {
        checkDataChannelExists();
        return nativeId();
    }

    public State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    public boolean send(Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public void dispose() {
        checkDataChannelExists();
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0L;
    }

    long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }
}
