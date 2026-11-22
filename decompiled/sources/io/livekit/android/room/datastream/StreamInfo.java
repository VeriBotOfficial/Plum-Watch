package io.livekit.android.room.datastream;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitModels;

/* compiled from: StreamInfo.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001BE\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lio/livekit/android/room/datastream/StreamInfo;", "", "id", "", "topic", "timestampMs", "", "totalSize", "attributes", "", "encryptionType", "Llivekit/LivekitModels$Encryption$Type;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Llivekit/LivekitModels$Encryption$Type;)V", "getAttributes", "()Ljava/util/Map;", "getEncryptionType", "()Llivekit/LivekitModels$Encryption$Type;", "getId", "()Ljava/lang/String;", "getTimestampMs", "()J", "getTopic", "getTotalSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "Lio/livekit/android/room/datastream/ByteStreamInfo;", "Lio/livekit/android/room/datastream/TextStreamInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class StreamInfo {
    private final Map<String, String> attributes;
    private final LivekitModels.Encryption.Type encryptionType;
    private final String id;
    private final long timestampMs;
    private final String topic;
    private final Long totalSize;

    public /* synthetic */ StreamInfo(String str, String str2, long j, Long l, Map map, LivekitModels.Encryption.Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, l, map, type);
    }

    private StreamInfo(String str, String str2, long j, Long l, Map<String, String> map, LivekitModels.Encryption.Type type) {
        this.id = str;
        this.topic = str2;
        this.timestampMs = j;
        this.totalSize = l;
        this.attributes = map;
        this.encryptionType = type;
    }

    public String getId() {
        return this.id;
    }

    public String getTopic() {
        return this.topic;
    }

    public long getTimestampMs() {
        return this.timestampMs;
    }

    public Long getTotalSize() {
        return this.totalSize;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public LivekitModels.Encryption.Type getEncryptionType() {
        return this.encryptionType;
    }
}
