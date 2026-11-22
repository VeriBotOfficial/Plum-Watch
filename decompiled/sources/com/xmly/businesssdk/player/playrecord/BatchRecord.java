package com.xmly.businesssdk.player.playrecord;

import com.anythink.core.common.h.aq;
import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchRecord.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014Jz\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012¨\u0006<"}, d2 = {"Lcom/xmly/businesssdk/player/playrecord/BatchRecord;", "", "track_id", "", "duration", "played_secs", "started_at", "", "play_type", "albumId", aq.h, "topic_id", "scene_id", "channel_id", "(IIIJIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAlbumId", "()I", "setAlbumId", "(I)V", "getBusiness_type", "()Ljava/lang/Integer;", "setBusiness_type", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getChannel_id", "setChannel_id", "getDuration", "setDuration", "getPlay_type", "setPlay_type", "getPlayed_secs", "setPlayed_secs", "getScene_id", "setScene_id", "getStarted_at", "()J", "setStarted_at", "(J)V", "getTopic_id", "setTopic_id", "getTrack_id", "setTrack_id", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIIJIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xmly/businesssdk/player/playrecord/BatchRecord;", "equals", "", "other", "hashCode", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BatchRecord {

    @SerializedName("album_id")
    private int albumId;

    @SerializedName(aq.h)
    private Integer business_type;

    @SerializedName("channel_id")
    private Integer channel_id;

    @SerializedName("duration")
    private int duration;

    @SerializedName("play_type")
    private int play_type;

    @SerializedName("played_secs")
    private int played_secs;

    @SerializedName("scene_id")
    private Integer scene_id;

    @SerializedName("started_at")
    private long started_at;

    @SerializedName("topic_id")
    private Integer topic_id;

    @SerializedName("track_id")
    private int track_id;

    public BatchRecord() {
        this(0, 0, 0, 0L, 0, 0, null, null, null, null, 1023, null);
    }

    public BatchRecord(int i, int i2, int i3, long j, int i4, int i5, Integer num, Integer num2, Integer num3, Integer num4) {
        this.track_id = i;
        this.duration = i2;
        this.played_secs = i3;
        this.started_at = j;
        this.play_type = i4;
        this.albumId = i5;
        this.business_type = num;
        this.topic_id = num2;
        this.scene_id = num3;
        this.channel_id = num4;
    }

    public static /* synthetic */ BatchRecord copy$default(BatchRecord batchRecord, int i, int i2, int i3, long j, int i4, int i5, Integer num, Integer num2, Integer num3, Integer num4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = batchRecord.track_id;
        }
        if ((i6 & 2) != 0) {
            i2 = batchRecord.duration;
        }
        if ((i6 & 4) != 0) {
            i3 = batchRecord.played_secs;
        }
        if ((i6 & 8) != 0) {
            j = batchRecord.started_at;
        }
        if ((i6 & 16) != 0) {
            i4 = batchRecord.play_type;
        }
        if ((i6 & 32) != 0) {
            i5 = batchRecord.albumId;
        }
        if ((i6 & 64) != 0) {
            num = batchRecord.business_type;
        }
        if ((i6 & 128) != 0) {
            num2 = batchRecord.topic_id;
        }
        if ((i6 & 256) != 0) {
            num3 = batchRecord.scene_id;
        }
        if ((i6 & 512) != 0) {
            num4 = batchRecord.channel_id;
        }
        Integer num5 = num3;
        Integer num6 = num4;
        long j2 = j;
        int i7 = i3;
        return batchRecord.copy(i, i2, i7, j2, i4, i5, num, num2, num5, num6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTrack_id() {
        return this.track_id;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getChannel_id() {
        return this.channel_id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPlayed_secs() {
        return this.played_secs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStarted_at() {
        return this.started_at;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPlay_type() {
        return this.play_type;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getBusiness_type() {
        return this.business_type;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getTopic_id() {
        return this.topic_id;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getScene_id() {
        return this.scene_id;
    }

    public final BatchRecord copy(int track_id, int duration, int played_secs, long started_at, int play_type, int albumId, Integer business_type, Integer topic_id, Integer scene_id, Integer channel_id) {
        return new BatchRecord(track_id, duration, played_secs, started_at, play_type, albumId, business_type, topic_id, scene_id, channel_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchRecord)) {
            return false;
        }
        BatchRecord batchRecord = (BatchRecord) other;
        return this.track_id == batchRecord.track_id && this.duration == batchRecord.duration && this.played_secs == batchRecord.played_secs && this.started_at == batchRecord.started_at && this.play_type == batchRecord.play_type && this.albumId == batchRecord.albumId && Intrinsics.areEqual(this.business_type, batchRecord.business_type) && Intrinsics.areEqual(this.topic_id, batchRecord.topic_id) && Intrinsics.areEqual(this.scene_id, batchRecord.scene_id) && Intrinsics.areEqual(this.channel_id, batchRecord.channel_id);
    }

    public final int getAlbumId() {
        return this.albumId;
    }

    public final Integer getBusiness_type() {
        return this.business_type;
    }

    public final Integer getChannel_id() {
        return this.channel_id;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getPlay_type() {
        return this.play_type;
    }

    public final int getPlayed_secs() {
        return this.played_secs;
    }

    public final Integer getScene_id() {
        return this.scene_id;
    }

    public final long getStarted_at() {
        return this.started_at;
    }

    public final Integer getTopic_id() {
        return this.topic_id;
    }

    public final int getTrack_id() {
        return this.track_id;
    }

    public int hashCode() {
        int a2 = b.a(this.albumId, b.a(this.play_type, a.a(this.started_at, b.a(this.played_secs, b.a(this.duration, Integer.hashCode(this.track_id) * 31, 31), 31), 31), 31), 31);
        Integer num = this.business_type;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.topic_id;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.scene_id;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.channel_id;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setAlbumId(int i) {
        this.albumId = i;
    }

    public final void setBusiness_type(Integer num) {
        this.business_type = num;
    }

    public final void setChannel_id(Integer num) {
        this.channel_id = num;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setPlay_type(int i) {
        this.play_type = i;
    }

    public final void setPlayed_secs(int i) {
        this.played_secs = i;
    }

    public final void setScene_id(Integer num) {
        this.scene_id = num;
    }

    public final void setStarted_at(long j) {
        this.started_at = j;
    }

    public final void setTopic_id(Integer num) {
        this.topic_id = num;
    }

    public final void setTrack_id(int i) {
        this.track_id = i;
    }

    public String toString() {
        return c.a("BatchRecord(track_id=").append(this.track_id).append(", duration=").append(this.duration).append(", played_secs=").append(this.played_secs).append(", started_at=").append(this.started_at).append(", play_type=").append(this.play_type).append(", albumId=").append(this.albumId).append(", business_type=").append(this.business_type).append(", topic_id=").append(this.topic_id).append(", scene_id=").append(this.scene_id).append(", channel_id=").append(this.channel_id).append(')').toString();
    }

    public /* synthetic */ BatchRecord(int i, int i2, int i3, long j, int i4, int i5, Integer num, Integer num2, Integer num3, Integer num4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? null : num, (i6 & 128) != 0 ? null : num2, (i6 & 256) != 0 ? null : num3, (i6 & 512) != 0 ? null : num4);
    }
}
