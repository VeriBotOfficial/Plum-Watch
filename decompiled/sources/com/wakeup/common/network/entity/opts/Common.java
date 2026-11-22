package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* compiled from: MessageEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0019\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003JÃ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001e¨\u0006E"}, d2 = {"Lcom/wakeup/common/network/entity/opts/Common;", "", RnBuryPointApi.KEY_CURR_TIME, "", "source", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "longitude", "latitude", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "country", "appVersion", "userId", RemoteMessageConst.Notification.CHANNEL_ID, "appId", "businessType", "model", "eId", "os", "osVersion", "networkType", "expIds", "<init>", "(JLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrTime", "()J", "getSource", "()Ljava/util/ArrayList;", "getLongitude", "()Ljava/lang/String;", "getLatitude", "getIp", "getCountry", "getAppVersion", "getUserId", "getChannelId", "getAppId", "getBusinessType", "getModel", "getEId", "getOs", "getOsVersion", "getNetworkType", "getExpIds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Common {
    private final String appId;
    private final String appVersion;
    private final String businessType;
    private final String channelId;
    private final String country;
    private final long currTime;
    private final String eId;
    private final String expIds;
    private final String ip;
    private final String latitude;
    private final String longitude;
    private final String model;
    private final String networkType;
    private final String os;
    private final String osVersion;
    private final ArrayList<String> source;
    private final String userId;

    public static /* synthetic */ Common copy$default(Common common, long j, ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        String str16;
        String str17;
        long j2 = (i & 1) != 0 ? common.currTime : j;
        ArrayList arrayList2 = (i & 2) != 0 ? common.source : arrayList;
        String str18 = (i & 4) != 0 ? common.longitude : str;
        String str19 = (i & 8) != 0 ? common.latitude : str2;
        String str20 = (i & 16) != 0 ? common.ip : str3;
        String str21 = (i & 32) != 0 ? common.country : str4;
        String str22 = (i & 64) != 0 ? common.appVersion : str5;
        String str23 = (i & 128) != 0 ? common.userId : str6;
        String str24 = (i & 256) != 0 ? common.channelId : str7;
        String str25 = (i & 512) != 0 ? common.appId : str8;
        String str26 = (i & 1024) != 0 ? common.businessType : str9;
        String str27 = (i & 2048) != 0 ? common.model : str10;
        String str28 = (i & 4096) != 0 ? common.eId : str11;
        long j3 = j2;
        String str29 = (i & 8192) != 0 ? common.os : str12;
        String str30 = (i & 16384) != 0 ? common.osVersion : str13;
        String str31 = (i & 32768) != 0 ? common.networkType : str14;
        if ((i & 65536) != 0) {
            str17 = str31;
            str16 = common.expIds;
        } else {
            str16 = str15;
            str17 = str31;
        }
        return common.copy(j3, arrayList2, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str17, str16);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCurrTime() {
        return this.currTime;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBusinessType() {
        return this.businessType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component13, reason: from getter */
    public final String getEId() {
        return this.eId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component15, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component16, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    /* renamed from: component17, reason: from getter */
    public final String getExpIds() {
        return this.expIds;
    }

    public final ArrayList<String> component2() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    public final Common copy(long currTime, ArrayList<String> source, String longitude, String latitude, String ip, String country, String appVersion, String userId, String channelId, String appId, String businessType, String model, String eId, String os, String osVersion, String networkType, String expIds) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(eId, "eId");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(expIds, "expIds");
        return new Common(currTime, source, longitude, latitude, ip, country, appVersion, userId, channelId, appId, businessType, model, eId, os, osVersion, networkType, expIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Common)) {
            return false;
        }
        Common common = (Common) other;
        return this.currTime == common.currTime && Intrinsics.areEqual(this.source, common.source) && Intrinsics.areEqual(this.longitude, common.longitude) && Intrinsics.areEqual(this.latitude, common.latitude) && Intrinsics.areEqual(this.ip, common.ip) && Intrinsics.areEqual(this.country, common.country) && Intrinsics.areEqual(this.appVersion, common.appVersion) && Intrinsics.areEqual(this.userId, common.userId) && Intrinsics.areEqual(this.channelId, common.channelId) && Intrinsics.areEqual(this.appId, common.appId) && Intrinsics.areEqual(this.businessType, common.businessType) && Intrinsics.areEqual(this.model, common.model) && Intrinsics.areEqual(this.eId, common.eId) && Intrinsics.areEqual(this.os, common.os) && Intrinsics.areEqual(this.osVersion, common.osVersion) && Intrinsics.areEqual(this.networkType, common.networkType) && Intrinsics.areEqual(this.expIds, common.expIds);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Long.hashCode(this.currTime) * 31) + this.source.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.ip.hashCode()) * 31) + this.country.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.channelId.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.model.hashCode()) * 31) + this.eId.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.networkType.hashCode()) * 31) + this.expIds.hashCode();
    }

    public String toString() {
        return "Common(currTime=" + this.currTime + ", source=" + this.source + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", ip=" + this.ip + ", country=" + this.country + ", appVersion=" + this.appVersion + ", userId=" + this.userId + ", channelId=" + this.channelId + ", appId=" + this.appId + ", businessType=" + this.businessType + ", model=" + this.model + ", eId=" + this.eId + ", os=" + this.os + ", osVersion=" + this.osVersion + ", networkType=" + this.networkType + ", expIds=" + this.expIds + Separators.RPAREN;
    }

    public Common(long j, ArrayList<String> source, String longitude, String latitude, String ip, String country, String appVersion, String userId, String channelId, String appId, String businessType, String model, String eId, String os, String osVersion, String networkType, String expIds) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(eId, "eId");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(expIds, "expIds");
        this.currTime = j;
        this.source = source;
        this.longitude = longitude;
        this.latitude = latitude;
        this.ip = ip;
        this.country = country;
        this.appVersion = appVersion;
        this.userId = userId;
        this.channelId = channelId;
        this.appId = appId;
        this.businessType = businessType;
        this.model = model;
        this.eId = eId;
        this.os = os;
        this.osVersion = osVersion;
        this.networkType = networkType;
        this.expIds = expIds;
    }

    public final long getCurrTime() {
        return this.currTime;
    }

    public final ArrayList<String> getSource() {
        return this.source;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBusinessType() {
        return this.businessType;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getEId() {
        return this.eId;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getExpIds() {
        return this.expIds;
    }
}
