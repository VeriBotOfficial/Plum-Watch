package io.nats.client;

/* loaded from: classes6.dex */
public interface ConnectionListener {
    void connectionEvent(Connection connection, Events events);

    public enum Events {
        CONNECTED("nats: connection opened"),
        CLOSED("nats: connection closed"),
        DISCONNECTED("nats: connection disconnected"),
        RECONNECTED("nats: connection reconnected"),
        RESUBSCRIBED("nats: subscriptions re-established"),
        DISCOVERED_SERVERS("nats: discovered servers"),
        LAME_DUCK("nats: lame duck mode");

        private String event;

        Events(String str) {
            this.event = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.event;
        }
    }
}
