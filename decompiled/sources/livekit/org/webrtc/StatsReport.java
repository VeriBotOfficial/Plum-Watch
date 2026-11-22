package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class StatsReport {

    /* renamed from: id, reason: collision with root package name */
    public final String f18739id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        public Value(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.name).append(": ").append(this.value).append("]");
            return sb.toString();
        }
    }

    public StatsReport(String id2, String type, double timestamp, Value[] values) {
        this.f18739id = id2;
        this.type = type;
        this.timestamp = timestamp;
        this.values = values;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("id: ");
        sb.append(this.f18739id).append(", type: ").append(this.type).append(", timestamp: ").append(this.timestamp).append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i < valueArr.length) {
                sb.append(valueArr[i].toString()).append(", ");
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
