package com.sifli.siflicore.blecore.queue;

/* JADX INFO: loaded from: classes11.dex */
public class GBDevice {
    private final String mAddress;
    private State state;

    public GBDevice(String str) {
        this.mAddress = str;
    }

    public String getAddress() {
        return this.mAddress;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isConnected() {
        return this.state == State.CONNECTED;
    }

    public enum State {
        NOT_CONNECTED(0),
        WAITING_FOR_RECONNECT(1),
        WAITING_FOR_SCAN(2),
        SCANNED(3),
        CONNECTING(4),
        CONNECTED(5),
        INITIALIZING(6),
        AUTHENTICATION_REQUIRED(7),
        AUTHENTICATING(8),
        INITIALIZED(9, 10);

        private int simpleStringId;
        private int stringId;

        State(int r3, int r4) {
            this.stringId = r3;
            this.simpleStringId = r4;
        }

        State(int r3) {
            this(r3, r3);
        }

        public int getStringId() {
            return this.stringId;
        }

        public int getSimpleStringId() {
            return this.simpleStringId;
        }

        public boolean equalsOrHigherThan(State state) {
            return compareTo(state) >= 0;
        }
    }
}
