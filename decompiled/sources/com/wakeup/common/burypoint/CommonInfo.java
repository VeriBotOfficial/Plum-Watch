package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* compiled from: CommonInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\bP\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\t\u0010N\u001a\u00020\u000bHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u000bHÆ\u0003J\t\u0010Y\u001a\u00020\u000bHÆ\u0003JÑ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bHÆ\u0001J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020_HÖ\u0001J\t\u0010`\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010+\"\u0004\bC\u0010-R\u001a\u0010\u0017\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-¨\u0006a"}, d2 = {"Lcom/wakeup/common/burypoint/CommonInfo;", "", "userId", "", "eId", "appVersion", "areaType", "country", "city", "province", "longitude", "", "latitude", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "networkType", "model", "os", "osVersion", "businessType", RemoteMessageConst.Notification.CHANNEL_ID, "appId", "expIds", "currentMemory", "totalMemory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getEId", "setEId", "getAppVersion", "setAppVersion", "getAreaType", "setAreaType", "getCountry", "setCountry", "getCity", "setCity", "getProvince", "setProvince", "getLongitude", "()D", "setLongitude", "(D)V", "getLatitude", "setLatitude", "getIp", "setIp", "getNetworkType", "setNetworkType", "getModel", "setModel", "getOs", "setOs", "getOsVersion", "setOsVersion", "getBusinessType", "setBusinessType", "getChannelId", "setChannelId", "getAppId", "setAppId", "getExpIds", "setExpIds", "getCurrentMemory", "setCurrentMemory", "getTotalMemory", "setTotalMemory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonInfo {
    private String appId;
    private String appVersion;
    private String areaType;
    private String businessType;
    private String channelId;
    private String city;
    private String country;
    private double currentMemory;
    private String eId;
    private String expIds;
    private String ip;
    private double latitude;
    private double longitude;
    private String model;
    private String networkType;
    private String os;
    private String osVersion;
    private String province;
    private double totalMemory;
    private String userId;

    public static /* synthetic */ CommonInfo copy$default(CommonInfo commonInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, double d, double d2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, double d3, double d4, int i, Object obj) {
        double d5;
        double d6;
        String str17 = (i & 1) != 0 ? commonInfo.userId : str;
        String str18 = (i & 2) != 0 ? commonInfo.eId : str2;
        String str19 = (i & 4) != 0 ? commonInfo.appVersion : str3;
        String str20 = (i & 8) != 0 ? commonInfo.areaType : str4;
        String str21 = (i & 16) != 0 ? commonInfo.country : str5;
        String str22 = (i & 32) != 0 ? commonInfo.city : str6;
        String str23 = (i & 64) != 0 ? commonInfo.province : str7;
        double d7 = (i & 128) != 0 ? commonInfo.longitude : d;
        double d8 = (i & 256) != 0 ? commonInfo.latitude : d2;
        String str24 = (i & 512) != 0 ? commonInfo.ip : str8;
        String str25 = (i & 1024) != 0 ? commonInfo.networkType : str9;
        String str26 = (i & 2048) != 0 ? commonInfo.model : str10;
        String str27 = str17;
        String str28 = (i & 4096) != 0 ? commonInfo.os : str11;
        String str29 = (i & 8192) != 0 ? commonInfo.osVersion : str12;
        String str30 = (i & 16384) != 0 ? commonInfo.businessType : str13;
        String str31 = (i & 32768) != 0 ? commonInfo.channelId : str14;
        String str32 = (i & 65536) != 0 ? commonInfo.appId : str15;
        String str33 = (i & 131072) != 0 ? commonInfo.expIds : str16;
        String str34 = str30;
        double d9 = (i & 262144) != 0 ? commonInfo.currentMemory : d3;
        if ((i & 524288) != 0) {
            d6 = d9;
            d5 = commonInfo.totalMemory;
        } else {
            d5 = d4;
            d6 = d9;
        }
        return commonInfo.copy(str27, str18, str19, str20, str21, str22, str23, d7, d8, str24, str25, str26, str28, str29, str34, str31, str32, str33, d6, d5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* renamed from: component11, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component13, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component14, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component15, reason: from getter */
    public final String getBusinessType() {
        return this.businessType;
    }

    /* renamed from: component16, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: component17, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getExpIds() {
        return this.expIds;
    }

    /* renamed from: component19, reason: from getter */
    public final double getCurrentMemory() {
        return this.currentMemory;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEId() {
        return this.eId;
    }

    /* renamed from: component20, reason: from getter */
    public final double getTotalMemory() {
        return this.totalMemory;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAreaType() {
        return this.areaType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    /* renamed from: component8, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component9, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    public final CommonInfo copy(String userId, String eId, String appVersion, String areaType, String country, String city, String province, double longitude, double latitude, String ip, String networkType, String model, String os, String osVersion, String businessType, String channelId, String appId, String expIds, double currentMemory, double totalMemory) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(eId, "eId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(areaType, "areaType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(expIds, "expIds");
        return new CommonInfo(userId, eId, appVersion, areaType, country, city, province, longitude, latitude, ip, networkType, model, os, osVersion, businessType, channelId, appId, expIds, currentMemory, totalMemory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonInfo)) {
            return false;
        }
        CommonInfo commonInfo = (CommonInfo) other;
        return Intrinsics.areEqual(this.userId, commonInfo.userId) && Intrinsics.areEqual(this.eId, commonInfo.eId) && Intrinsics.areEqual(this.appVersion, commonInfo.appVersion) && Intrinsics.areEqual(this.areaType, commonInfo.areaType) && Intrinsics.areEqual(this.country, commonInfo.country) && Intrinsics.areEqual(this.city, commonInfo.city) && Intrinsics.areEqual(this.province, commonInfo.province) && Double.compare(this.longitude, commonInfo.longitude) == 0 && Double.compare(this.latitude, commonInfo.latitude) == 0 && Intrinsics.areEqual(this.ip, commonInfo.ip) && Intrinsics.areEqual(this.networkType, commonInfo.networkType) && Intrinsics.areEqual(this.model, commonInfo.model) && Intrinsics.areEqual(this.os, commonInfo.os) && Intrinsics.areEqual(this.osVersion, commonInfo.osVersion) && Intrinsics.areEqual(this.businessType, commonInfo.businessType) && Intrinsics.areEqual(this.channelId, commonInfo.channelId) && Intrinsics.areEqual(this.appId, commonInfo.appId) && Intrinsics.areEqual(this.expIds, commonInfo.expIds) && Double.compare(this.currentMemory, commonInfo.currentMemory) == 0 && Double.compare(this.totalMemory, commonInfo.totalMemory) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.userId.hashCode() * 31) + this.eId.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.areaType.hashCode()) * 31) + this.country.hashCode()) * 31) + this.city.hashCode()) * 31) + this.province.hashCode()) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.latitude)) * 31) + this.ip.hashCode()) * 31) + this.networkType.hashCode()) * 31) + this.model.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.channelId.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.expIds.hashCode()) * 31) + Double.hashCode(this.currentMemory)) * 31) + Double.hashCode(this.totalMemory);
    }

    public String toString() {
        return "CommonInfo(userId=" + this.userId + ", eId=" + this.eId + ", appVersion=" + this.appVersion + ", areaType=" + this.areaType + ", country=" + this.country + ", city=" + this.city + ", province=" + this.province + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", ip=" + this.ip + ", networkType=" + this.networkType + ", model=" + this.model + ", os=" + this.os + ", osVersion=" + this.osVersion + ", businessType=" + this.businessType + ", channelId=" + this.channelId + ", appId=" + this.appId + ", expIds=" + this.expIds + ", currentMemory=" + this.currentMemory + ", totalMemory=" + this.totalMemory + Separators.RPAREN;
    }

    public CommonInfo(String userId, String eId, String appVersion, String areaType, String country, String city, String province, double d, double d2, String ip, String networkType, String model, String os, String osVersion, String businessType, String channelId, String appId, String expIds, double d3, double d4) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(eId, "eId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(areaType, "areaType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(expIds, "expIds");
        this.userId = userId;
        this.eId = eId;
        this.appVersion = appVersion;
        this.areaType = areaType;
        this.country = country;
        this.city = city;
        this.province = province;
        this.longitude = d;
        this.latitude = d2;
        this.ip = ip;
        this.networkType = networkType;
        this.model = model;
        this.os = os;
        this.osVersion = osVersion;
        this.businessType = businessType;
        this.channelId = channelId;
        this.appId = appId;
        this.expIds = expIds;
        this.currentMemory = d3;
        this.totalMemory = d4;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final String getEId() {
        return this.eId;
    }

    public final void setEId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eId = str;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final void setAppVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final String getAreaType() {
        return this.areaType;
    }

    public final void setAreaType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.areaType = str;
    }

    public final String getCountry() {
        return this.country;
    }

    public final void setCountry(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final String getCity() {
        return this.city;
    }

    public final void setCity(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final String getProvince() {
        return this.province;
    }

    public final void setProvince(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.province = str;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final String getIp() {
        return this.ip;
    }

    public final void setIp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ip = str;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final void setNetworkType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.networkType = str;
    }

    public final String getModel() {
        return this.model;
    }

    public final void setModel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final String getOs() {
        return this.os;
    }

    public final void setOs(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os = str;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final void setOsVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.osVersion = str;
    }

    public final String getBusinessType() {
        return this.businessType;
    }

    public final void setBusinessType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.businessType = str;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final void setChannelId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channelId = str;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appId = str;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final void setExpIds(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expIds = str;
    }

    public final double getCurrentMemory() {
        return this.currentMemory;
    }

    public final void setCurrentMemory(double d) {
        this.currentMemory = d;
    }

    public final double getTotalMemory() {
        return this.totalMemory;
    }

    public final void setTotalMemory(double d) {
        this.totalMemory = d;
    }
}
