package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\u0081\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00103\u001a\u00020\u00122\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u000eHÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, d2 = {"Lcom/wakeup/common/network/entity/gift/CheckinPointInfo;", "", "id", "", "city_id", "name", "", "description", "image_url", "latitude", "", "longitude", Const.JSON_KEY_ADDRESS, "point_group", "", "sort_order", "status", "checked", "", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;IIIZ)V", "getId", "()J", "getCity_id", "getName", "()Ljava/lang/String;", "getDescription", "getImage_url", "getLatitude", "()D", "getLongitude", "getAddress", "getPoint_group", "()I", "getSort_order", "getStatus", "getChecked", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CheckinPointInfo {
    private final String address;
    private final boolean checked;
    private final long city_id;
    private final String description;
    private final long id;
    private final String image_url;
    private final double latitude;
    private final double longitude;
    private final String name;
    private final int point_group;
    private final int sort_order;
    private final int status;

    public CheckinPointInfo() {
        this(0L, 0L, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, false, 4095, null);
    }

    public static /* synthetic */ CheckinPointInfo copy$default(CheckinPointInfo checkinPointInfo, long j, long j2, String str, String str2, String str3, double d, double d2, String str4, int i, int i2, int i3, boolean z, int i4, Object obj) {
        long j3 = (i4 & 1) != 0 ? checkinPointInfo.id : j;
        return checkinPointInfo.copy(j3, (i4 & 2) != 0 ? checkinPointInfo.city_id : j2, (i4 & 4) != 0 ? checkinPointInfo.name : str, (i4 & 8) != 0 ? checkinPointInfo.description : str2, (i4 & 16) != 0 ? checkinPointInfo.image_url : str3, (i4 & 32) != 0 ? checkinPointInfo.latitude : d, (i4 & 64) != 0 ? checkinPointInfo.longitude : d2, (i4 & 128) != 0 ? checkinPointInfo.address : str4, (i4 & 256) != 0 ? checkinPointInfo.point_group : i, (i4 & 512) != 0 ? checkinPointInfo.sort_order : i2, (i4 & 1024) != 0 ? checkinPointInfo.status : i3, (i4 & 2048) != 0 ? checkinPointInfo.checked : z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSort_order() {
        return this.sort_order;
    }

    /* renamed from: component11, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCity_id() {
        return this.city_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImage_url() {
        return this.image_url;
    }

    /* renamed from: component6, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component7, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPoint_group() {
        return this.point_group;
    }

    public final CheckinPointInfo copy(long id2, long city_id, String name, String description, String image_url, double latitude, double longitude, String address, int point_group, int sort_order, int status, boolean checked) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(address, "address");
        return new CheckinPointInfo(id2, city_id, name, description, image_url, latitude, longitude, address, point_group, sort_order, status, checked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckinPointInfo)) {
            return false;
        }
        CheckinPointInfo checkinPointInfo = (CheckinPointInfo) other;
        return this.id == checkinPointInfo.id && this.city_id == checkinPointInfo.city_id && Intrinsics.areEqual(this.name, checkinPointInfo.name) && Intrinsics.areEqual(this.description, checkinPointInfo.description) && Intrinsics.areEqual(this.image_url, checkinPointInfo.image_url) && Double.compare(this.latitude, checkinPointInfo.latitude) == 0 && Double.compare(this.longitude, checkinPointInfo.longitude) == 0 && Intrinsics.areEqual(this.address, checkinPointInfo.address) && this.point_group == checkinPointInfo.point_group && this.sort_order == checkinPointInfo.sort_order && this.status == checkinPointInfo.status && this.checked == checkinPointInfo.checked;
    }

    public int hashCode() {
        return (((((((((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.city_id)) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.image_url.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.point_group)) * 31) + Integer.hashCode(this.sort_order)) * 31) + Integer.hashCode(this.status)) * 31) + Boolean.hashCode(this.checked);
    }

    public String toString() {
        return "CheckinPointInfo(id=" + this.id + ", city_id=" + this.city_id + ", name=" + this.name + ", description=" + this.description + ", image_url=" + this.image_url + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", address=" + this.address + ", point_group=" + this.point_group + ", sort_order=" + this.sort_order + ", status=" + this.status + ", checked=" + this.checked + Separators.RPAREN;
    }

    public CheckinPointInfo(long j, long j2, String name, String description, String image_url, double d, double d2, String address, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(address, "address");
        this.id = j;
        this.city_id = j2;
        this.name = name;
        this.description = description;
        this.image_url = image_url;
        this.latitude = d;
        this.longitude = d2;
        this.address = address;
        this.point_group = i;
        this.sort_order = i2;
        this.status = i3;
        this.checked = z;
    }

    public /* synthetic */ CheckinPointInfo(long j, long j2, String str, String str2, String str3, double d, double d2, String str4, int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) == 0 ? j2 : 0L, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? 0.0d : d, (i4 & 64) == 0 ? d2 : 0.0d, (i4 & 128) == 0 ? str4 : "", (i4 & 256) != 0 ? 1 : i, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) != 0 ? 1 : i3, (i4 & 2048) != 0 ? false : z);
    }

    public final long getId() {
        return this.id;
    }

    public final long getCity_id() {
        return this.city_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getAddress() {
        return this.address;
    }

    public final int getPoint_group() {
        return this.point_group;
    }

    public final int getSort_order() {
        return this.sort_order;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean getChecked() {
        return this.checked;
    }
}
