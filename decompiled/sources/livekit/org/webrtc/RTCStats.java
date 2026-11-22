package livekit.org.webrtc;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public class RTCStats {

    /* renamed from: id, reason: collision with root package name */
    private final String f18737id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long timestampUs, String type, String id2, Map<String, Object> members) {
        this.timestampUs = timestampUs;
        this.type = type;
        this.f18737id = id2;
        this.members = members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String getId() {
        return this.f18737id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ timestampUs: ").append(this.timestampUs).append(", type: ").append(this.type).append(", id: ").append(this.f18737id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            sb.append(", ").append(entry.getKey()).append(": ");
            appendValue(sb, entry.getValue());
        }
        sb.append(" }");
        return sb.toString();
    }

    private static void appendValue(StringBuilder builder, Object value) {
        if (value instanceof Object[]) {
            Object[] objArr = (Object[]) value;
            builder.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    builder.append(", ");
                }
                appendValue(builder, objArr[i]);
            }
            builder.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (value instanceof String) {
            builder.append('\"').append(value).append('\"');
        } else {
            builder.append(value);
        }
    }

    static RTCStats create(long timestampUs, String type, String id2, Map members) {
        return new RTCStats(timestampUs, type, id2, members);
    }
}
