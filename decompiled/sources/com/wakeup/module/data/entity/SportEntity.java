package com.wakeup.module.data.entity;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SportEntity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\t\u0010F\u001a\u00020\u0010HÆ\u0003J\t\u0010G\u001a\u00020\u0010HÆ\u0003J\t\u0010H\u001a\u00020\u0010HÆ\u0003J\t\u0010I\u001a\u00020\u0010HÆ\u0003J\t\u0010J\u001a\u00020\u0010HÆ\u0003J\t\u0010K\u001a\u00020\u0017HÆ\u0003J\t\u0010L\u001a\u00020\u0017HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003JÇ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\u0005HÖ\u0001J\t\u0010T\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0016\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u00109R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 ¨\u0006U"}, d2 = {"Lcom/wakeup/module/data/entity/SportEntity;", "", "id", "", "uid", "", "mac", "", "time", "type", "distance", "step", "duration", Constants.BundleKey.KCAL, "", "altitudes", "Lorg/json/JSONArray;", "paces", "heartRates", "locations", "stepFrequencs", "seconds", "courseRecord", "Lorg/json/JSONObject;", "expand", "syncState", l.a.ac, "<init>", "(JILjava/lang/String;JIIIJFLorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONObject;Lorg/json/JSONObject;IJ)V", "getId", "()J", "setId", "(J)V", "getUid", "()I", "getMac", "()Ljava/lang/String;", "getTime", "setTime", "getType", "getDistance", "getStep", "getDuration", "getKcal", "()F", "getAltitudes", "()Lorg/json/JSONArray;", "getPaces", "getHeartRates", "getLocations", "getStepFrequencs", "getSeconds", "getCourseRecord", "()Lorg/json/JSONObject;", "getExpand", "getSyncState", "setSyncState", "(I)V", "getUpdateTime", "setUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SportEntity {
    private final JSONArray altitudes;
    private final JSONObject courseRecord;
    private final int distance;
    private final long duration;
    private final JSONObject expand;
    private final JSONArray heartRates;
    private long id;
    private final float kcal;
    private final JSONArray locations;
    private final String mac;
    private final JSONArray paces;
    private final JSONArray seconds;
    private final int step;
    private final JSONArray stepFrequencs;
    private int syncState;
    private long time;
    private final int type;
    private final int uid;
    private long updateTime;

    public static /* synthetic */ SportEntity copy$default(SportEntity sportEntity, long j, int i, String str, long j2, int i2, int i3, int i4, long j3, float f, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONObject jSONObject, JSONObject jSONObject2, int i5, long j4, int i6, Object obj) {
        long j5;
        int i7;
        JSONArray jSONArray7;
        long j6 = (i6 & 1) != 0 ? sportEntity.id : j;
        int i8 = (i6 & 2) != 0 ? sportEntity.uid : i;
        String str2 = (i6 & 4) != 0 ? sportEntity.mac : str;
        long j7 = (i6 & 8) != 0 ? sportEntity.time : j2;
        int i9 = (i6 & 16) != 0 ? sportEntity.type : i2;
        int i10 = (i6 & 32) != 0 ? sportEntity.distance : i3;
        int i11 = (i6 & 64) != 0 ? sportEntity.step : i4;
        long j8 = (i6 & 128) != 0 ? sportEntity.duration : j3;
        float f2 = (i6 & 256) != 0 ? sportEntity.kcal : f;
        JSONArray jSONArray8 = (i6 & 512) != 0 ? sportEntity.altitudes : jSONArray;
        JSONArray jSONArray9 = (i6 & 1024) != 0 ? sportEntity.paces : jSONArray2;
        long j9 = j6;
        JSONArray jSONArray10 = (i6 & 2048) != 0 ? sportEntity.heartRates : jSONArray3;
        JSONArray jSONArray11 = (i6 & 4096) != 0 ? sportEntity.locations : jSONArray4;
        JSONArray jSONArray12 = jSONArray10;
        JSONArray jSONArray13 = (i6 & 8192) != 0 ? sportEntity.stepFrequencs : jSONArray5;
        JSONArray jSONArray14 = (i6 & 16384) != 0 ? sportEntity.seconds : jSONArray6;
        JSONObject jSONObject3 = (i6 & 32768) != 0 ? sportEntity.courseRecord : jSONObject;
        JSONObject jSONObject4 = (i6 & 65536) != 0 ? sportEntity.expand : jSONObject2;
        int i12 = (i6 & 131072) != 0 ? sportEntity.syncState : i5;
        if ((i6 & 262144) != 0) {
            jSONArray7 = jSONArray14;
            i7 = i12;
            j5 = sportEntity.updateTime;
        } else {
            j5 = j4;
            i7 = i12;
            jSONArray7 = jSONArray14;
        }
        return sportEntity.copy(j9, i8, str2, j7, i9, i10, i11, j8, f2, jSONArray8, jSONArray9, jSONArray12, jSONArray11, jSONArray13, jSONArray7, jSONObject3, jSONObject4, i7, j5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final JSONArray getAltitudes() {
        return this.altitudes;
    }

    /* renamed from: component11, reason: from getter */
    public final JSONArray getPaces() {
        return this.paces;
    }

    /* renamed from: component12, reason: from getter */
    public final JSONArray getHeartRates() {
        return this.heartRates;
    }

    /* renamed from: component13, reason: from getter */
    public final JSONArray getLocations() {
        return this.locations;
    }

    /* renamed from: component14, reason: from getter */
    public final JSONArray getStepFrequencs() {
        return this.stepFrequencs;
    }

    /* renamed from: component15, reason: from getter */
    public final JSONArray getSeconds() {
        return this.seconds;
    }

    /* renamed from: component16, reason: from getter */
    public final JSONObject getCourseRecord() {
        return this.courseRecord;
    }

    /* renamed from: component17, reason: from getter */
    public final JSONObject getExpand() {
        return this.expand;
    }

    /* renamed from: component18, reason: from getter */
    public final int getSyncState() {
        return this.syncState;
    }

    /* renamed from: component19, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* renamed from: component7, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* renamed from: component8, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component9, reason: from getter */
    public final float getKcal() {
        return this.kcal;
    }

    public final SportEntity copy(long id2, int uid, String mac, long time, int type, int distance, int step, long duration, float kcal, JSONArray altitudes, JSONArray paces, JSONArray heartRates, JSONArray locations, JSONArray stepFrequencs, JSONArray seconds, JSONObject courseRecord, JSONObject expand, int syncState, long updateTime) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(altitudes, "altitudes");
        Intrinsics.checkNotNullParameter(paces, "paces");
        Intrinsics.checkNotNullParameter(heartRates, "heartRates");
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(stepFrequencs, "stepFrequencs");
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        Intrinsics.checkNotNullParameter(courseRecord, "courseRecord");
        Intrinsics.checkNotNullParameter(expand, "expand");
        return new SportEntity(id2, uid, mac, time, type, distance, step, duration, kcal, altitudes, paces, heartRates, locations, stepFrequencs, seconds, courseRecord, expand, syncState, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportEntity)) {
            return false;
        }
        SportEntity sportEntity = (SportEntity) other;
        return this.id == sportEntity.id && this.uid == sportEntity.uid && Intrinsics.areEqual(this.mac, sportEntity.mac) && this.time == sportEntity.time && this.type == sportEntity.type && this.distance == sportEntity.distance && this.step == sportEntity.step && this.duration == sportEntity.duration && Float.compare(this.kcal, sportEntity.kcal) == 0 && Intrinsics.areEqual(this.altitudes, sportEntity.altitudes) && Intrinsics.areEqual(this.paces, sportEntity.paces) && Intrinsics.areEqual(this.heartRates, sportEntity.heartRates) && Intrinsics.areEqual(this.locations, sportEntity.locations) && Intrinsics.areEqual(this.stepFrequencs, sportEntity.stepFrequencs) && Intrinsics.areEqual(this.seconds, sportEntity.seconds) && Intrinsics.areEqual(this.courseRecord, sportEntity.courseRecord) && Intrinsics.areEqual(this.expand, sportEntity.expand) && this.syncState == sportEntity.syncState && this.updateTime == sportEntity.updateTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.uid)) * 31) + this.mac.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.step)) * 31) + Long.hashCode(this.duration)) * 31) + Float.hashCode(this.kcal)) * 31) + this.altitudes.hashCode()) * 31) + this.paces.hashCode()) * 31) + this.heartRates.hashCode()) * 31) + this.locations.hashCode()) * 31) + this.stepFrequencs.hashCode()) * 31) + this.seconds.hashCode()) * 31) + this.courseRecord.hashCode()) * 31) + this.expand.hashCode()) * 31) + Integer.hashCode(this.syncState)) * 31) + Long.hashCode(this.updateTime);
    }

    public String toString() {
        return "SportEntity(id=" + this.id + ", uid=" + this.uid + ", mac=" + this.mac + ", time=" + this.time + ", type=" + this.type + ", distance=" + this.distance + ", step=" + this.step + ", duration=" + this.duration + ", kcal=" + this.kcal + ", altitudes=" + this.altitudes + ", paces=" + this.paces + ", heartRates=" + this.heartRates + ", locations=" + this.locations + ", stepFrequencs=" + this.stepFrequencs + ", seconds=" + this.seconds + ", courseRecord=" + this.courseRecord + ", expand=" + this.expand + ", syncState=" + this.syncState + ", updateTime=" + this.updateTime + Separators.RPAREN;
    }

    public SportEntity(long j, int i, String mac, long j2, int i2, int i3, int i4, long j3, float f, JSONArray altitudes, JSONArray paces, JSONArray heartRates, JSONArray locations, JSONArray stepFrequencs, JSONArray seconds, JSONObject courseRecord, JSONObject expand, int i5, long j4) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(altitudes, "altitudes");
        Intrinsics.checkNotNullParameter(paces, "paces");
        Intrinsics.checkNotNullParameter(heartRates, "heartRates");
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(stepFrequencs, "stepFrequencs");
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        Intrinsics.checkNotNullParameter(courseRecord, "courseRecord");
        Intrinsics.checkNotNullParameter(expand, "expand");
        this.id = j;
        this.uid = i;
        this.mac = mac;
        this.time = j2;
        this.type = i2;
        this.distance = i3;
        this.step = i4;
        this.duration = j3;
        this.kcal = f;
        this.altitudes = altitudes;
        this.paces = paces;
        this.heartRates = heartRates;
        this.locations = locations;
        this.stepFrequencs = stepFrequencs;
        this.seconds = seconds;
        this.courseRecord = courseRecord;
        this.expand = expand;
        this.syncState = i5;
        this.updateTime = j4;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final int getUid() {
        return this.uid;
    }

    public /* synthetic */ SportEntity(long j, int i, String str, long j2, int i2, int i3, int i4, long j3, float f, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONObject jSONObject, JSONObject jSONObject2, int i5, long j4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : j, i, (i6 & 4) != 0 ? "" : str, j2, i2, i3, i4, j3, f, (i6 & 512) != 0 ? new JSONArray() : jSONArray, (i6 & 1024) != 0 ? new JSONArray() : jSONArray2, (i6 & 2048) != 0 ? new JSONArray() : jSONArray3, (i6 & 4096) != 0 ? new JSONArray() : jSONArray4, (i6 & 8192) != 0 ? new JSONArray() : jSONArray5, (i6 & 16384) != 0 ? new JSONArray() : jSONArray6, (32768 & i6) != 0 ? new JSONObject() : jSONObject, (i6 & 65536) != 0 ? new JSONObject() : jSONObject2, i5, j4);
    }

    public final String getMac() {
        return this.mac;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final int getType() {
        return this.type;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getStep() {
        return this.step;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final float getKcal() {
        return this.kcal;
    }

    public final JSONArray getAltitudes() {
        return this.altitudes;
    }

    public final JSONArray getPaces() {
        return this.paces;
    }

    public final JSONArray getHeartRates() {
        return this.heartRates;
    }

    public final JSONArray getLocations() {
        return this.locations;
    }

    public final JSONArray getStepFrequencs() {
        return this.stepFrequencs;
    }

    public final JSONArray getSeconds() {
        return this.seconds;
    }

    public final JSONObject getCourseRecord() {
        return this.courseRecord;
    }

    public final JSONObject getExpand() {
        return this.expand;
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
