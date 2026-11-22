package com.xmly.businesssdk.trace.uploader.formatter;

import com.heytap.mcssdk.constant.b;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.xmly.businesssdk.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventFormatter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0013HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0005HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018¨\u0006;"}, d2 = {"Lcom/xmly/businesssdk/trace/uploader/formatter/GlobalData;", "", "clientSendTime", "", "appId", "", b.z, "deviceName", "userId", b.e, "channel", "version", "deviceId", "systemType", "deviceType", "isLogin", "currPage", "pageUrl", "ext", "Lcom/xmly/businesssdk/trace/uploader/formatter/ExtData;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xmly/businesssdk/trace/uploader/formatter/ExtData;)V", "getAppId", "()I", "getAppKey", "()Ljava/lang/String;", "getAppPackage", "getChannel", "getClientSendTime", "getCurrPage", "getDeviceId", "getDeviceName", "getDeviceType", "getExt", "()Lcom/xmly/businesssdk/trace/uploader/formatter/ExtData;", "getPageUrl", "getSystemType", "getUserId", MobileAdsBridge.versionMethodName, "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class GlobalData {
    private final int appId;
    private final String appKey;
    private final String appPackage;
    private final String channel;
    private final String clientSendTime;
    private final String currPage;
    private final String deviceId;
    private final String deviceName;
    private final String deviceType;
    private final ExtData ext;
    private final String isLogin;
    private final String pageUrl;
    private final String systemType;
    private final String userId;
    private final String version;

    public GlobalData(String clientSendTime, int i, String appKey, String deviceName, String userId, String appPackage, String channel, String version, String deviceId, String systemType, String deviceType, String isLogin, String currPage, String pageUrl, ExtData ext) {
        Intrinsics.checkNotNullParameter(clientSendTime, "clientSendTime");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(systemType, "systemType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(isLogin, "isLogin");
        Intrinsics.checkNotNullParameter(currPage, "currPage");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(ext, "ext");
        this.clientSendTime = clientSendTime;
        this.appId = i;
        this.appKey = appKey;
        this.deviceName = deviceName;
        this.userId = userId;
        this.appPackage = appPackage;
        this.channel = channel;
        this.version = version;
        this.deviceId = deviceId;
        this.systemType = systemType;
        this.deviceType = deviceType;
        this.isLogin = isLogin;
        this.currPage = currPage;
        this.pageUrl = pageUrl;
        this.ext = ext;
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientSendTime() {
        return this.clientSendTime;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSystemType() {
        return this.systemType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getIsLogin() {
        return this.isLogin;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCurrPage() {
        return this.currPage;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPageUrl() {
        return this.pageUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final ExtData getExt() {
        return this.ext;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAppId() {
        return this.appId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: component8, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final GlobalData copy(String clientSendTime, int appId, String appKey, String deviceName, String userId, String appPackage, String channel, String version, String deviceId, String systemType, String deviceType, String isLogin, String currPage, String pageUrl, ExtData ext) {
        Intrinsics.checkNotNullParameter(clientSendTime, "clientSendTime");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(systemType, "systemType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(isLogin, "isLogin");
        Intrinsics.checkNotNullParameter(currPage, "currPage");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(ext, "ext");
        return new GlobalData(clientSendTime, appId, appKey, deviceName, userId, appPackage, channel, version, deviceId, systemType, deviceType, isLogin, currPage, pageUrl, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalData)) {
            return false;
        }
        GlobalData globalData = (GlobalData) other;
        return Intrinsics.areEqual(this.clientSendTime, globalData.clientSendTime) && this.appId == globalData.appId && Intrinsics.areEqual(this.appKey, globalData.appKey) && Intrinsics.areEqual(this.deviceName, globalData.deviceName) && Intrinsics.areEqual(this.userId, globalData.userId) && Intrinsics.areEqual(this.appPackage, globalData.appPackage) && Intrinsics.areEqual(this.channel, globalData.channel) && Intrinsics.areEqual(this.version, globalData.version) && Intrinsics.areEqual(this.deviceId, globalData.deviceId) && Intrinsics.areEqual(this.systemType, globalData.systemType) && Intrinsics.areEqual(this.deviceType, globalData.deviceType) && Intrinsics.areEqual(this.isLogin, globalData.isLogin) && Intrinsics.areEqual(this.currPage, globalData.currPage) && Intrinsics.areEqual(this.pageUrl, globalData.pageUrl) && Intrinsics.areEqual(this.ext, globalData.ext);
    }

    public final int getAppId() {
        return this.appId;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAppPackage() {
        return this.appPackage;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getClientSendTime() {
        return this.clientSendTime;
    }

    public final String getCurrPage() {
        return this.currPage;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final ExtData getExt() {
        return this.ext;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getSystemType() {
        return this.systemType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return a.a(this.pageUrl, a.a(this.currPage, a.a(this.isLogin, a.a(this.deviceType, a.a(this.systemType, a.a(this.deviceId, a.a(this.version, a.a(this.channel, a.a(this.appPackage, a.a(this.userId, a.a(this.deviceName, a.a(this.appKey, com.xmly.businesssdk.config.b.a(this.appId, this.clientSendTime.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31) + this.ext.hashCode();
    }

    public final String isLogin() {
        return this.isLogin;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GlobalData(clientSendTime=");
        sb.append(this.clientSendTime).append(", appId=").append(this.appId).append(", appKey=").append(this.appKey).append(", deviceName=").append(this.deviceName).append(", userId=").append(this.userId).append(", appPackage=").append(this.appPackage).append(", channel=").append(this.channel).append(", version=").append(this.version).append(", deviceId=").append(this.deviceId).append(", systemType=").append(this.systemType).append(", deviceType=").append(this.deviceType).append(", isLogin=");
        sb.append(this.isLogin).append(", currPage=").append(this.currPage).append(", pageUrl=").append(this.pageUrl).append(", ext=").append(this.ext).append(')');
        return sb.toString();
    }
}
