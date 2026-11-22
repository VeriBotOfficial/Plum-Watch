package io.agora.rtc2;

/* loaded from: classes6.dex */
public class RtcConnection {
    public String channelId;
    public int localUid;

    public enum CONNECTION_STATE_TYPE {
        CONNECTION_STATE_NOT_INITIALIZED(0),
        CONNECTION_STATE_DISCONNECTED(1),
        CONNECTION_STATE_CONNECTING(2),
        CONNECTION_STATE_CONNECTED(3),
        CONNECTION_STATE_RECONNECTING(4),
        CONNECTION_STATE_FAILED(5);

        private int value;

        CONNECTION_STATE_TYPE(int v) {
            this.value = v;
        }

        public static int getValue(CONNECTION_STATE_TYPE type) {
            return type.value;
        }
    }

    public RtcConnection() {
        this.channelId = "";
        this.localUid = 0;
    }

    public RtcConnection(String channelId, int uid) {
        this.channelId = channelId;
        this.localUid = uid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("channelId=");
        sb.append(this.channelId);
        sb.append("localUid=").append(this.localUid);
        return sb.toString();
    }
}
