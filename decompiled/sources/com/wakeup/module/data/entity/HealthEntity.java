package com.wakeup.module.data.entity;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: HealthEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003Jc\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0006HÖ\u0001J\t\u00105\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014¨\u00066"}, d2 = {"Lcom/wakeup/module/data/entity/HealthEntity;", "", "id", "", "time", "uid", "", "mac", "", "type", "value", "Lorg/json/JSONObject;", "otherValue", "syncState", l.a.ac, "<init>", "(JJILjava/lang/String;ILorg/json/JSONObject;Lorg/json/JSONObject;IJ)V", "getId", "()J", "setId", "(J)V", "getTime", "setTime", "getUid", "()I", "getMac", "()Ljava/lang/String;", "getType", "setType", "(I)V", "getValue", "()Lorg/json/JSONObject;", "setValue", "(Lorg/json/JSONObject;)V", "getOtherValue", "getSyncState", "setSyncState", "getUpdateTime", "setUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HealthEntity {
    private long id;
    private final String mac;
    private final JSONObject otherValue;
    private int syncState;
    private long time;
    private int type;
    private final int uid;
    private long updateTime;
    private JSONObject value;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final JSONObject getValue() {
        return this.value;
    }

    /* renamed from: component7, reason: from getter */
    public final JSONObject getOtherValue() {
        return this.otherValue;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSyncState() {
        return this.syncState;
    }

    /* renamed from: component9, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final HealthEntity copy(long id2, long time, int uid, String mac, int type, JSONObject value, JSONObject otherValue, int syncState, long updateTime) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        return new HealthEntity(id2, time, uid, mac, type, value, otherValue, syncState, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthEntity)) {
            return false;
        }
        HealthEntity healthEntity = (HealthEntity) other;
        return this.id == healthEntity.id && this.time == healthEntity.time && this.uid == healthEntity.uid && Intrinsics.areEqual(this.mac, healthEntity.mac) && this.type == healthEntity.type && Intrinsics.areEqual(this.value, healthEntity.value) && Intrinsics.areEqual(this.otherValue, healthEntity.otherValue) && this.syncState == healthEntity.syncState && this.updateTime == healthEntity.updateTime;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.uid)) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.value.hashCode()) * 31) + this.otherValue.hashCode()) * 31) + Integer.hashCode(this.syncState)) * 31) + Long.hashCode(this.updateTime);
    }

    public String toString() {
        return "HealthEntity(id=" + this.id + ", time=" + this.time + ", uid=" + this.uid + ", mac=" + this.mac + ", type=" + this.type + ", value=" + this.value + ", otherValue=" + this.otherValue + ", syncState=" + this.syncState + ", updateTime=" + this.updateTime + Separators.RPAREN;
    }

    public HealthEntity(long j, long j2, int i, String mac, int i2, JSONObject value, JSONObject otherValue, int i3, long j3) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        this.id = j;
        this.time = j2;
        this.uid = i;
        this.mac = mac;
        this.type = i2;
        this.value = value;
        this.otherValue = otherValue;
        this.syncState = i3;
        this.updateTime = j3;
    }

    public /* synthetic */ HealthEntity(long j, long j2, int i, String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, int i3, long j3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, j2, i, str, i2, jSONObject, jSONObject2, i3, j3);
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final int getUid() {
        return this.uid;
    }

    public final String getMac() {
        return this.mac;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final JSONObject getValue() {
        return this.value;
    }

    public final void setValue(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.value = jSONObject;
    }

    public final JSONObject getOtherValue() {
        return this.otherValue;
    }

    public final int getSyncState() {
        return this.syncState;
    }

    public final void setSyncState(int i) {
        this.syncState = i;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }
}
