package com.wakeup.feature.sport.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTrailEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0006J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/wakeup/feature/sport/bean/CustomTrailEntity;", "", "mapType", "", "trailType", "musicUrl", "", "<init>", "(IILjava/lang/String;)V", "getMapType", "()I", "setMapType", "(I)V", "getTrailType", "setTrailType", "getMusicUrl", "()Ljava/lang/String;", "setMusicUrl", "(Ljava/lang/String;)V", "getTrailColorStr", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomTrailEntity {
    public static final int MAP_TYPE_AUTUMN = 2;
    public static final int MAP_TYPE_DEF = 0;
    public static final int MAP_TYPE_SATELLITE = 1;
    public static final int MAP_TYPE_SUMMER = 3;
    public static final int TRAIL_TYPE_HU = 2;
    public static final int TRAIL_TYPE_NORMAL = 0;
    public static final int TRAIL_TYPE_RUN = 3;
    public static final int TRAIL_TYPE_YEAR = 1;
    private int mapType;
    private String musicUrl;
    private int trailType;

    public CustomTrailEntity() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ CustomTrailEntity copy$default(CustomTrailEntity customTrailEntity, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = customTrailEntity.mapType;
        }
        if ((i3 & 2) != 0) {
            i2 = customTrailEntity.trailType;
        }
        if ((i3 & 4) != 0) {
            str = customTrailEntity.musicUrl;
        }
        return customTrailEntity.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMapType() {
        return this.mapType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTrailType() {
        return this.trailType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMusicUrl() {
        return this.musicUrl;
    }

    public final CustomTrailEntity copy(int mapType, int trailType, String musicUrl) {
        Intrinsics.checkNotNullParameter(musicUrl, "musicUrl");
        return new CustomTrailEntity(mapType, trailType, musicUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTrailEntity)) {
            return false;
        }
        CustomTrailEntity customTrailEntity = (CustomTrailEntity) other;
        return this.mapType == customTrailEntity.mapType && this.trailType == customTrailEntity.trailType && Intrinsics.areEqual(this.musicUrl, customTrailEntity.musicUrl);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mapType) * 31) + Integer.hashCode(this.trailType)) * 31) + this.musicUrl.hashCode();
    }

    public String toString() {
        return "CustomTrailEntity(mapType=" + this.mapType + ", trailType=" + this.trailType + ", musicUrl=" + this.musicUrl + Separators.RPAREN;
    }

    public CustomTrailEntity(int i, int i2, String musicUrl) {
        Intrinsics.checkNotNullParameter(musicUrl, "musicUrl");
        this.mapType = i;
        this.trailType = i2;
        this.musicUrl = musicUrl;
    }

    public final int getMapType() {
        return this.mapType;
    }

    public final void setMapType(int i) {
        this.mapType = i;
    }

    public final int getTrailType() {
        return this.trailType;
    }

    public final void setTrailType(int i) {
        this.trailType = i;
    }

    public /* synthetic */ CustomTrailEntity(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }

    public final String getMusicUrl() {
        return this.musicUrl;
    }

    public final void setMusicUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.musicUrl = str;
    }

    public final String getTrailColorStr() {
        return "#1EC972";
    }
}
