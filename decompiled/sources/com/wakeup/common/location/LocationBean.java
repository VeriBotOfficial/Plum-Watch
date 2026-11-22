package com.wakeup.common.location;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationBean.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010+\u001a\u00020\bH\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J°\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b)\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001c¨\u0006B"}, d2 = {"Lcom/wakeup/common/location/LocationBean;", "Ljava/io/Serializable;", "lat", "", "lon", "time", "", MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, "", "countryName", "provinceCode", "province", "cityCode", "city", Const.JSON_KEY_ADDRESS, Const.JSON_KEY_ACCURACY, "", "altitude", "speed", "coorType", "<init>", "(DDJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/String;)V", "getLat", "()D", "getLon", "getTime", "()J", "getCountryCode", "()Ljava/lang/String;", "getCountryName", "getProvinceCode", "getProvince", "getCityCode", "getCity", "getAddress", "getAccuracy", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSpeed", "getCoorType", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(DDJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/String;)Lcom/wakeup/common/location/LocationBean;", "equals", "", "other", "", "hashCode", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LocationBean implements Serializable {
    private final Float accuracy;
    private final String address;
    private final Double altitude;
    private final String city;
    private final String cityCode;
    private final String coorType;
    private final String countryCode;
    private final String countryName;
    private final double lat;
    private final double lon;
    private final String province;
    private final String provinceCode;
    private final Float speed;
    private final long time;

    public static /* synthetic */ LocationBean copy$default(LocationBean locationBean, double d, double d2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, Float f, Double d3, Float f2, String str8, int i, Object obj) {
        double d4 = (i & 1) != 0 ? locationBean.lat : d;
        return locationBean.copy(d4, (i & 2) != 0 ? locationBean.lon : d2, (i & 4) != 0 ? locationBean.time : j, (i & 8) != 0 ? locationBean.countryCode : str, (i & 16) != 0 ? locationBean.countryName : str2, (i & 32) != 0 ? locationBean.provinceCode : str3, (i & 64) != 0 ? locationBean.province : str4, (i & 128) != 0 ? locationBean.cityCode : str5, (i & 256) != 0 ? locationBean.city : str6, (i & 512) != 0 ? locationBean.address : str7, (i & 1024) != 0 ? locationBean.accuracy : f, (i & 2048) != 0 ? locationBean.altitude : d3, (i & 4096) != 0 ? locationBean.speed : f2, (i & 8192) != 0 ? locationBean.coorType : str8);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component11, reason: from getter */
    public final Float getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    /* renamed from: component13, reason: from getter */
    public final Float getSpeed() {
        return this.speed;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCoorType() {
        return this.coorType;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final LocationBean copy(double lat, double lon, long time, String countryCode, String countryName, String provinceCode, String province, String cityCode, String city, String address, Float accuracy, Double altitude, Float speed, String coorType) {
        return new LocationBean(lat, lon, time, countryCode, countryName, provinceCode, province, cityCode, city, address, accuracy, altitude, speed, coorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationBean)) {
            return false;
        }
        LocationBean locationBean = (LocationBean) other;
        return Double.compare(this.lat, locationBean.lat) == 0 && Double.compare(this.lon, locationBean.lon) == 0 && this.time == locationBean.time && Intrinsics.areEqual(this.countryCode, locationBean.countryCode) && Intrinsics.areEqual(this.countryName, locationBean.countryName) && Intrinsics.areEqual(this.provinceCode, locationBean.provinceCode) && Intrinsics.areEqual(this.province, locationBean.province) && Intrinsics.areEqual(this.cityCode, locationBean.cityCode) && Intrinsics.areEqual(this.city, locationBean.city) && Intrinsics.areEqual(this.address, locationBean.address) && Intrinsics.areEqual((Object) this.accuracy, (Object) locationBean.accuracy) && Intrinsics.areEqual((Object) this.altitude, (Object) locationBean.altitude) && Intrinsics.areEqual((Object) this.speed, (Object) locationBean.speed) && Intrinsics.areEqual(this.coorType, locationBean.coorType);
    }

    public int hashCode() {
        int hashCode = ((((Double.hashCode(this.lat) * 31) + Double.hashCode(this.lon)) * 31) + Long.hashCode(this.time)) * 31;
        String str = this.countryCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.provinceCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.province;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cityCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f = this.accuracy;
        int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.altitude;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Float f2 = this.speed;
        int hashCode11 = (hashCode10 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str8 = this.coorType;
        return hashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public LocationBean(double d, double d2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, Float f, Double d3, Float f2, String str8) {
        this.lat = d;
        this.lon = d2;
        this.time = j;
        this.countryCode = str;
        this.countryName = str2;
        this.provinceCode = str3;
        this.province = str4;
        this.cityCode = str5;
        this.city = str6;
        this.address = str7;
        this.accuracy = f;
        this.altitude = d3;
        this.speed = f2;
        this.coorType = str8;
    }

    public /* synthetic */ LocationBean(double d, double d2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, Float f, Double d3, Float f2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, j, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : d3, (i & 4096) != 0 ? null : f2, (i & 8192) != 0 ? null : str8);
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final String getProvinceCode() {
        return this.provinceCode;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getAddress() {
        return this.address;
    }

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final Float getSpeed() {
        return this.speed;
    }

    public final String getCoorType() {
        return this.coorType;
    }

    public String toString() {
        return "LocationBean(lat=" + this.lat + ", lon=" + this.lon + ", time=" + this.time + ", countryCode=" + this.countryCode + ", countryName=" + this.countryName + ", provinceCode=" + this.provinceCode + ", province=" + this.province + ", cityCode=" + this.cityCode + ", city=" + this.city + ", address=" + this.address + ", accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", speed=" + this.speed + Separators.RPAREN;
    }
}
