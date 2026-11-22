package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdPostBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\t\u0010F\u001a\u00020\fHÆ\u0003J\t\u0010G\u001a\u00020\fHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003Jy\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\nHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010/\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u001c\u00102\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010'R\u001c\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010'R\u001c\u00108\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010'R\u001c\u0010;\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010'¨\u0006O"}, d2 = {"Lcom/wakeup/common/network/entity/other/AdPostBean;", "", "deviceModel", "", "systemVersion", "uniqueMark", "appVersion", "userId", "userAccount", "adPopType", "", "adPopTime", "", "adPopStartTime", "adPopEndTime", "operType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJLjava/lang/String;)V", "getDeviceModel", "()Ljava/lang/String;", "getSystemVersion", "getUniqueMark", "getAppVersion", "getUserId", "getUserAccount", "getAdPopType", "()I", "getAdPopTime", "()J", "getAdPopStartTime", "getAdPopEndTime", "getOperType", "dataSource", "getDataSource", "appName", "getAppName", "deviceNetwork", "getDeviceNetwork", "setDeviceNetwork", "(Ljava/lang/String;)V", "longitude", "", "getLongitude", "()Ljava/lang/Double;", "setLongitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "latitude", "getLatitude", "setLatitude", "appRegion", "getAppRegion", "setAppRegion", "productId", "getProductId", "setProductId", "snCode", "getSnCode", "setSnCode", "code", "getCode", "setCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdPostBean {
    private final long adPopEndTime;
    private final long adPopStartTime;
    private final long adPopTime;
    private final int adPopType;
    private final String appName;
    private String appRegion;
    private final String appVersion;
    private String code;
    private final String dataSource;
    private final String deviceModel;
    private String deviceNetwork;
    private Double latitude;
    private Double longitude;
    private final String operType;
    private String productId;
    private String snCode;
    private final String systemVersion;
    private final String uniqueMark;
    private final String userAccount;
    private final String userId;

    /* renamed from: component1, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component10, reason: from getter */
    public final long getAdPopEndTime() {
        return this.adPopEndTime;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOperType() {
        return this.operType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUniqueMark() {
        return this.uniqueMark;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUserAccount() {
        return this.userAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAdPopType() {
        return this.adPopType;
    }

    /* renamed from: component8, reason: from getter */
    public final long getAdPopTime() {
        return this.adPopTime;
    }

    /* renamed from: component9, reason: from getter */
    public final long getAdPopStartTime() {
        return this.adPopStartTime;
    }

    public final AdPostBean copy(String deviceModel, String systemVersion, String uniqueMark, String appVersion, String userId, String userAccount, int adPopType, long adPopTime, long adPopStartTime, long adPopEndTime, String operType) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(systemVersion, "systemVersion");
        Intrinsics.checkNotNullParameter(uniqueMark, "uniqueMark");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(operType, "operType");
        return new AdPostBean(deviceModel, systemVersion, uniqueMark, appVersion, userId, userAccount, adPopType, adPopTime, adPopStartTime, adPopEndTime, operType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdPostBean)) {
            return false;
        }
        AdPostBean adPostBean = (AdPostBean) other;
        return Intrinsics.areEqual(this.deviceModel, adPostBean.deviceModel) && Intrinsics.areEqual(this.systemVersion, adPostBean.systemVersion) && Intrinsics.areEqual(this.uniqueMark, adPostBean.uniqueMark) && Intrinsics.areEqual(this.appVersion, adPostBean.appVersion) && Intrinsics.areEqual(this.userId, adPostBean.userId) && Intrinsics.areEqual(this.userAccount, adPostBean.userAccount) && this.adPopType == adPostBean.adPopType && this.adPopTime == adPostBean.adPopTime && this.adPopStartTime == adPostBean.adPopStartTime && this.adPopEndTime == adPostBean.adPopEndTime && Intrinsics.areEqual(this.operType, adPostBean.operType);
    }

    public int hashCode() {
        int hashCode = ((((((((this.deviceModel.hashCode() * 31) + this.systemVersion.hashCode()) * 31) + this.uniqueMark.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.userId.hashCode()) * 31;
        String str = this.userAccount;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.adPopType)) * 31) + Long.hashCode(this.adPopTime)) * 31) + Long.hashCode(this.adPopStartTime)) * 31) + Long.hashCode(this.adPopEndTime)) * 31) + this.operType.hashCode();
    }

    public String toString() {
        return "AdPostBean(deviceModel=" + this.deviceModel + ", systemVersion=" + this.systemVersion + ", uniqueMark=" + this.uniqueMark + ", appVersion=" + this.appVersion + ", userId=" + this.userId + ", userAccount=" + this.userAccount + ", adPopType=" + this.adPopType + ", adPopTime=" + this.adPopTime + ", adPopStartTime=" + this.adPopStartTime + ", adPopEndTime=" + this.adPopEndTime + ", operType=" + this.operType + Separators.RPAREN;
    }

    public AdPostBean(String deviceModel, String systemVersion, String uniqueMark, String appVersion, String userId, String str, int i, long j, long j2, long j3, String operType) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(systemVersion, "systemVersion");
        Intrinsics.checkNotNullParameter(uniqueMark, "uniqueMark");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(operType, "operType");
        this.deviceModel = deviceModel;
        this.systemVersion = systemVersion;
        this.uniqueMark = uniqueMark;
        this.appVersion = appVersion;
        this.userId = userId;
        this.userAccount = str;
        this.adPopType = i;
        this.adPopTime = j;
        this.adPopStartTime = j2;
        this.adPopEndTime = j3;
        this.operType = operType;
        this.dataSource = "android";
        this.appName = "Wearfit Pro";
        this.deviceNetwork = "";
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public final String getUniqueMark() {
        return this.uniqueMark;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserAccount() {
        return this.userAccount;
    }

    public final int getAdPopType() {
        return this.adPopType;
    }

    public final long getAdPopTime() {
        return this.adPopTime;
    }

    public final long getAdPopStartTime() {
        return this.adPopStartTime;
    }

    public final long getAdPopEndTime() {
        return this.adPopEndTime;
    }

    public final String getOperType() {
        return this.operType;
    }

    public final String getDataSource() {
        return this.dataSource;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getDeviceNetwork() {
        return this.deviceNetwork;
    }

    public final void setDeviceNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceNetwork = str;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(Double d) {
        this.longitude = d;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(Double d) {
        this.latitude = d;
    }

    public final String getAppRegion() {
        return this.appRegion;
    }

    public final void setAppRegion(String str) {
        this.appRegion = str;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final String getSnCode() {
        return this.snCode;
    }

    public final void setSnCode(String str) {
        this.snCode = str;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        this.code = str;
    }
}
