package io.livekit.android.room.datastream;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.LivekitModels;

/* compiled from: StreamInfo.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bBU\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003Jn\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\nHÖ\u0001R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lio/livekit/android/room/datastream/ByteStreamInfo;", "Lio/livekit/android/room/datastream/StreamInfo;", "header", "Llivekit/LivekitModels$DataStream$Header;", "byteHeader", "Llivekit/LivekitModels$DataStream$ByteHeader;", "encryptionType", "Llivekit/LivekitModels$Encryption$Type;", "(Llivekit/LivekitModels$DataStream$Header;Llivekit/LivekitModels$DataStream$ByteHeader;Llivekit/LivekitModels$Encryption$Type;)V", "id", "", "topic", "timestampMs", "", "totalSize", "attributes", "", "mimeType", "name", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Llivekit/LivekitModels$Encryption$Type;)V", "getAttributes", "()Ljava/util/Map;", "getEncryptionType", "()Llivekit/LivekitModels$Encryption$Type;", "getId", "()Ljava/lang/String;", "getMimeType", "getName", "getTimestampMs", "()J", "getTopic", "getTotalSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Llivekit/LivekitModels$Encryption$Type;)Lio/livekit/android/room/datastream/ByteStreamInfo;", "equals", "", "other", "", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ByteStreamInfo extends StreamInfo {
    private final Map<String, String> attributes;
    private final LivekitModels.Encryption.Type encryptionType;
    private final String id;
    private final String mimeType;
    private final String name;
    private final long timestampMs;
    private final String topic;
    private final Long totalSize;

    public static /* synthetic */ ByteStreamInfo copy$default(ByteStreamInfo byteStreamInfo, String str, String str2, long j, Long l, Map map, String str3, String str4, LivekitModels.Encryption.Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            str = byteStreamInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = byteStreamInfo.topic;
        }
        if ((i & 4) != 0) {
            j = byteStreamInfo.timestampMs;
        }
        if ((i & 8) != 0) {
            l = byteStreamInfo.totalSize;
        }
        if ((i & 16) != 0) {
            map = byteStreamInfo.attributes;
        }
        if ((i & 32) != 0) {
            str3 = byteStreamInfo.mimeType;
        }
        if ((i & 64) != 0) {
            str4 = byteStreamInfo.name;
        }
        if ((i & 128) != 0) {
            type = byteStreamInfo.encryptionType;
        }
        LivekitModels.Encryption.Type type2 = type;
        String str5 = str3;
        Long l2 = l;
        long j2 = j;
        return byteStreamInfo.copy(str, str2, j2, l2, map, str5, str4, type2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getTotalSize() {
        return this.totalSize;
    }

    public final Map<String, String> component5() {
        return this.attributes;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final LivekitModels.Encryption.Type getEncryptionType() {
        return this.encryptionType;
    }

    public final ByteStreamInfo copy(String id2, String topic, long timestampMs, Long totalSize, Map<String, String> attributes, String mimeType, String name, LivekitModels.Encryption.Type encryptionType) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(encryptionType, "encryptionType");
        return new ByteStreamInfo(id2, topic, timestampMs, totalSize, attributes, mimeType, name, encryptionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ByteStreamInfo)) {
            return false;
        }
        ByteStreamInfo byteStreamInfo = (ByteStreamInfo) other;
        return Intrinsics.areEqual(this.id, byteStreamInfo.id) && Intrinsics.areEqual(this.topic, byteStreamInfo.topic) && this.timestampMs == byteStreamInfo.timestampMs && Intrinsics.areEqual(this.totalSize, byteStreamInfo.totalSize) && Intrinsics.areEqual(this.attributes, byteStreamInfo.attributes) && Intrinsics.areEqual(this.mimeType, byteStreamInfo.mimeType) && Intrinsics.areEqual(this.name, byteStreamInfo.name) && this.encryptionType == byteStreamInfo.encryptionType;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.topic.hashCode()) * 31) + Long.hashCode(this.timestampMs)) * 31;
        Long l = this.totalSize;
        int hashCode2 = (((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.attributes.hashCode()) * 31) + this.mimeType.hashCode()) * 31;
        String str = this.name;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.encryptionType.hashCode();
    }

    public String toString() {
        return "ByteStreamInfo(id=" + this.id + ", topic=" + this.topic + ", timestampMs=" + this.timestampMs + ", totalSize=" + this.totalSize + ", attributes=" + this.attributes + ", mimeType=" + this.mimeType + ", name=" + this.name + ", encryptionType=" + this.encryptionType + ')';
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public String getId() {
        return this.id;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public String getTopic() {
        return this.topic;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public long getTimestampMs() {
        return this.timestampMs;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public Long getTotalSize() {
        return this.totalSize;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public LivekitModels.Encryption.Type getEncryptionType() {
        return this.encryptionType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamInfo(String id2, String topic, long j, Long l, Map<String, String> attributes, String mimeType, String str, LivekitModels.Encryption.Type encryptionType) {
        super(id2, topic, j, l, attributes, encryptionType, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(encryptionType, "encryptionType");
        this.id = id2;
        this.topic = topic;
        this.timestampMs = j;
        this.totalSize = l;
        this.attributes = attributes;
        this.mimeType = mimeType;
        this.name = str;
        this.encryptionType = encryptionType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ByteStreamInfo(livekit.LivekitModels.DataStream.Header r12, livekit.LivekitModels.DataStream.ByteHeader r13, livekit.LivekitModels.Encryption.Type r14) {
        /*
            r11 = this;
            java.lang.String r0 = "header"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "byteHeader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "encryptionType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r2 = r12.getStreamId()
            java.lang.String r0 = "getStreamId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r3 = r12.getTopic()
            java.lang.String r0 = "getTopic(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            long r4 = r12.getTimestamp()
            boolean r0 = r12.hasTotalLength()
            if (r0 == 0) goto L34
            long r0 = r12.getTotalLength()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L35
        L34:
            r0 = 0
        L35:
            r6 = r0
            java.util.Map r0 = r12.getAttributesMap()
            java.lang.String r1 = "getAttributesMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Map r7 = kotlin.collections.MapsKt.toMap(r0)
            java.lang.String r8 = r12.getMimeType()
            java.lang.String r12 = "getMimeType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r12)
            java.lang.String r9 = r13.getName()
            r1 = r11
            r10 = r14
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.room.datastream.ByteStreamInfo.<init>(livekit.LivekitModels$DataStream$Header, livekit.LivekitModels$DataStream$ByteHeader, livekit.LivekitModels$Encryption$Type):void");
    }
}
