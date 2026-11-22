package com.wakeup.module.data.entity;

import android.gov.nist.core.Separators;
import com.baidu.ar.constants.HttpConstants;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: EventEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\t\u0010f\u001a\u00020\u0005HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u001dHÆ\u0003Jù\u0001\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\bHÖ\u0001J\t\u0010p\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010-R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010-R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010(\"\u0004\b7\u0010*R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010-R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010-R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010-R\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010(\"\u0004\bE\u0010*R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010(R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010%\"\u0004\bH\u0010-R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010%\"\u0004\bJ\u0010-R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010%\"\u0004\bL\u0010-R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010%\"\u0004\bN\u0010-R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006q"}, d2 = {"Lcom/wakeup/module/data/entity/EventEntity;", "", "id", "", "brand", "", "model", "versionSdk", "", "optKey", "optType", "otherValue", Constants.BundleKey.TIMESTAMP, "create_time", "userId", "userName", "cityName", "provinceName", "deviceNumber", "remainIntegral", "residenceTime", "app_version", HttpConstants.HTTP_OS_TYPE, "areaType", "countryName", MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, "provinceCode", "cityCode", "defaultValue", "Lorg/json/JSONObject;", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getId", "()J", "setId", "(J)V", "getBrand", "()Ljava/lang/String;", "getModel", "getVersionSdk", "()I", "setVersionSdk", "(I)V", "getOptKey", "setOptKey", "(Ljava/lang/String;)V", "getOptType", "setOptType", "getOtherValue", "setOtherValue", "getTimeStamp", "setTimeStamp", "getCreate_time", "setCreate_time", "getUserId", "setUserId", "getUserName", "getCityName", "getProvinceName", "setProvinceName", "getDeviceNumber", "setDeviceNumber", "getRemainIntegral", "setRemainIntegral", "getResidenceTime", "setResidenceTime", "getApp_version", "setApp_version", "getOs_type", "setOs_type", "getAreaType", "getCountryName", "setCountryName", "getCountryCode", "setCountryCode", "getProvinceCode", "setProvinceCode", "getCityCode", "setCityCode", "getDefaultValue", "()Lorg/json/JSONObject;", "setDefaultValue", "(Lorg/json/JSONObject;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "", "other", "hashCode", "toString", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EventEntity {
    private String app_version;
    private final int areaType;
    private final String brand;
    private String cityCode;
    private final String cityName;
    private String countryCode;
    private String countryName;
    private String create_time;
    private JSONObject defaultValue;
    private String deviceNumber;
    private long id;
    private final String model;
    private String optKey;
    private int optType;
    private int os_type;
    private String otherValue;
    private String provinceCode;
    private String provinceName;
    private int remainIntegral;
    private long residenceTime;
    private long timeStamp;
    private int userId;
    private final String userName;
    private int versionSdk;

    public static /* synthetic */ EventEntity copy$default(EventEntity eventEntity, long j, String str, String str2, int i, String str3, int i2, String str4, long j2, String str5, int i3, String str6, String str7, String str8, String str9, int i4, long j3, String str10, int i5, int i6, String str11, String str12, String str13, String str14, JSONObject jSONObject, int i7, Object obj) {
        JSONObject jSONObject2;
        String str15;
        long j4 = (i7 & 1) != 0 ? eventEntity.id : j;
        String str16 = (i7 & 2) != 0 ? eventEntity.brand : str;
        String str17 = (i7 & 4) != 0 ? eventEntity.model : str2;
        int i8 = (i7 & 8) != 0 ? eventEntity.versionSdk : i;
        String str18 = (i7 & 16) != 0 ? eventEntity.optKey : str3;
        int i9 = (i7 & 32) != 0 ? eventEntity.optType : i2;
        String str19 = (i7 & 64) != 0 ? eventEntity.otherValue : str4;
        long j5 = (i7 & 128) != 0 ? eventEntity.timeStamp : j2;
        String str20 = (i7 & 256) != 0 ? eventEntity.create_time : str5;
        int i10 = (i7 & 512) != 0 ? eventEntity.userId : i3;
        String str21 = (i7 & 1024) != 0 ? eventEntity.userName : str6;
        String str22 = (i7 & 2048) != 0 ? eventEntity.cityName : str7;
        long j6 = j4;
        String str23 = (i7 & 4096) != 0 ? eventEntity.provinceName : str8;
        String str24 = (i7 & 8192) != 0 ? eventEntity.deviceNumber : str9;
        String str25 = str23;
        int i11 = (i7 & 16384) != 0 ? eventEntity.remainIntegral : i4;
        long j7 = (i7 & 32768) != 0 ? eventEntity.residenceTime : j3;
        String str26 = (i7 & 65536) != 0 ? eventEntity.app_version : str10;
        int i12 = (i7 & 131072) != 0 ? eventEntity.os_type : i5;
        String str27 = str26;
        int i13 = (i7 & 262144) != 0 ? eventEntity.areaType : i6;
        String str28 = (i7 & 524288) != 0 ? eventEntity.countryName : str11;
        String str29 = (i7 & 1048576) != 0 ? eventEntity.countryCode : str12;
        String str30 = (i7 & 2097152) != 0 ? eventEntity.provinceCode : str13;
        String str31 = (i7 & 4194304) != 0 ? eventEntity.cityCode : str14;
        if ((i7 & 8388608) != 0) {
            str15 = str31;
            jSONObject2 = eventEntity.defaultValue;
        } else {
            jSONObject2 = jSONObject;
            str15 = str31;
        }
        return eventEntity.copy(j6, str16, str17, i8, str18, i9, str19, j5, str20, i10, str21, str22, str25, str24, i11, j7, str27, i12, i13, str28, str29, str30, str15, jSONObject2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    /* renamed from: component13, reason: from getter */
    public final String getProvinceName() {
        return this.provinceName;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDeviceNumber() {
        return this.deviceNumber;
    }

    /* renamed from: component15, reason: from getter */
    public final int getRemainIntegral() {
        return this.remainIntegral;
    }

    /* renamed from: component16, reason: from getter */
    public final long getResidenceTime() {
        return this.residenceTime;
    }

    /* renamed from: component17, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    /* renamed from: component18, reason: from getter */
    public final int getOs_type() {
        return this.os_type;
    }

    /* renamed from: component19, reason: from getter */
    public final int getAreaType() {
        return this.areaType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: component20, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* renamed from: component21, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component22, reason: from getter */
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    /* renamed from: component23, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    /* renamed from: component24, reason: from getter */
    public final JSONObject getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVersionSdk() {
        return this.versionSdk;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOptKey() {
        return this.optKey;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOptType() {
        return this.optType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOtherValue() {
        return this.otherValue;
    }

    /* renamed from: component8, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCreate_time() {
        return this.create_time;
    }

    public final EventEntity copy(long id2, String brand, String model, int versionSdk, String optKey, int optType, String otherValue, long timeStamp, String create_time, int userId, String userName, String cityName, String provinceName, String deviceNumber, int remainIntegral, long residenceTime, String app_version, int os_type, int areaType, String countryName, String countryCode, String provinceCode, String cityCode, JSONObject defaultValue) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(deviceNumber, "deviceNumber");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return new EventEntity(id2, brand, model, versionSdk, optKey, optType, otherValue, timeStamp, create_time, userId, userName, cityName, provinceName, deviceNumber, remainIntegral, residenceTime, app_version, os_type, areaType, countryName, countryCode, provinceCode, cityCode, defaultValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventEntity)) {
            return false;
        }
        EventEntity eventEntity = (EventEntity) other;
        return this.id == eventEntity.id && Intrinsics.areEqual(this.brand, eventEntity.brand) && Intrinsics.areEqual(this.model, eventEntity.model) && this.versionSdk == eventEntity.versionSdk && Intrinsics.areEqual(this.optKey, eventEntity.optKey) && this.optType == eventEntity.optType && Intrinsics.areEqual(this.otherValue, eventEntity.otherValue) && this.timeStamp == eventEntity.timeStamp && Intrinsics.areEqual(this.create_time, eventEntity.create_time) && this.userId == eventEntity.userId && Intrinsics.areEqual(this.userName, eventEntity.userName) && Intrinsics.areEqual(this.cityName, eventEntity.cityName) && Intrinsics.areEqual(this.provinceName, eventEntity.provinceName) && Intrinsics.areEqual(this.deviceNumber, eventEntity.deviceNumber) && this.remainIntegral == eventEntity.remainIntegral && this.residenceTime == eventEntity.residenceTime && Intrinsics.areEqual(this.app_version, eventEntity.app_version) && this.os_type == eventEntity.os_type && this.areaType == eventEntity.areaType && Intrinsics.areEqual(this.countryName, eventEntity.countryName) && Intrinsics.areEqual(this.countryCode, eventEntity.countryCode) && Intrinsics.areEqual(this.provinceCode, eventEntity.provinceCode) && Intrinsics.areEqual(this.cityCode, eventEntity.cityCode) && Intrinsics.areEqual(this.defaultValue, eventEntity.defaultValue);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.brand.hashCode()) * 31) + this.model.hashCode()) * 31) + Integer.hashCode(this.versionSdk)) * 31) + this.optKey.hashCode()) * 31) + Integer.hashCode(this.optType)) * 31) + this.otherValue.hashCode()) * 31) + Long.hashCode(this.timeStamp)) * 31) + this.create_time.hashCode()) * 31) + Integer.hashCode(this.userId)) * 31) + this.userName.hashCode()) * 31) + this.cityName.hashCode()) * 31) + this.provinceName.hashCode()) * 31) + this.deviceNumber.hashCode()) * 31) + Integer.hashCode(this.remainIntegral)) * 31) + Long.hashCode(this.residenceTime)) * 31) + this.app_version.hashCode()) * 31) + Integer.hashCode(this.os_type)) * 31) + Integer.hashCode(this.areaType)) * 31) + this.countryName.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.provinceCode.hashCode()) * 31) + this.cityCode.hashCode()) * 31) + this.defaultValue.hashCode();
    }

    public String toString() {
        return "EventEntity(id=" + this.id + ", brand=" + this.brand + ", model=" + this.model + ", versionSdk=" + this.versionSdk + ", optKey=" + this.optKey + ", optType=" + this.optType + ", otherValue=" + this.otherValue + ", timeStamp=" + this.timeStamp + ", create_time=" + this.create_time + ", userId=" + this.userId + ", userName=" + this.userName + ", cityName=" + this.cityName + ", provinceName=" + this.provinceName + ", deviceNumber=" + this.deviceNumber + ", remainIntegral=" + this.remainIntegral + ", residenceTime=" + this.residenceTime + ", app_version=" + this.app_version + ", os_type=" + this.os_type + ", areaType=" + this.areaType + ", countryName=" + this.countryName + ", countryCode=" + this.countryCode + ", provinceCode=" + this.provinceCode + ", cityCode=" + this.cityCode + ", defaultValue=" + this.defaultValue + Separators.RPAREN;
    }

    public EventEntity(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5, int i6, String countryName, String countryCode, String provinceCode, String cityCode, JSONObject defaultValue) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(deviceNumber, "deviceNumber");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.id = j;
        this.brand = brand;
        this.model = model;
        this.versionSdk = i;
        this.optKey = optKey;
        this.optType = i2;
        this.otherValue = otherValue;
        this.timeStamp = j2;
        this.create_time = create_time;
        this.userId = i3;
        this.userName = userName;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.deviceNumber = deviceNumber;
        this.remainIntegral = i4;
        this.residenceTime = j3;
        this.app_version = app_version;
        this.os_type = i5;
        this.areaType = i6;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.provinceCode = provinceCode;
        this.cityCode = cityCode;
        this.defaultValue = defaultValue;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getModel() {
        return this.model;
    }

    public final int getVersionSdk() {
        return this.versionSdk;
    }

    public final void setVersionSdk(int i) {
        this.versionSdk = i;
    }

    public final String getOptKey() {
        return this.optKey;
    }

    public final void setOptKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.optKey = str;
    }

    public final int getOptType() {
        return this.optType;
    }

    public final void setOptType(int i) {
        this.optType = i;
    }

    public final String getOtherValue() {
        return this.otherValue;
    }

    public final void setOtherValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otherValue = str;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final String getCreate_time() {
        return this.create_time;
    }

    public final void setCreate_time(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.create_time = str;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getProvinceName() {
        return this.provinceName;
    }

    public final void setProvinceName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.provinceName = str;
    }

    public final String getDeviceNumber() {
        return this.deviceNumber;
    }

    public final void setDeviceNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceNumber = str;
    }

    public final int getRemainIntegral() {
        return this.remainIntegral;
    }

    public final void setRemainIntegral(int i) {
        this.remainIntegral = i;
    }

    public final long getResidenceTime() {
        return this.residenceTime;
    }

    public final void setResidenceTime(long j) {
        this.residenceTime = j;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final void setApp_version(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_version = str;
    }

    public final int getOs_type() {
        return this.os_type;
    }

    public final void setOs_type(int i) {
        this.os_type = i;
    }

    public final int getAreaType() {
        return this.areaType;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final void setCountryName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryName = str;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final String getProvinceCode() {
        return this.provinceCode;
    }

    public final void setProvinceCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.provinceCode = str;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final void setCityCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cityCode = str;
    }

    public /* synthetic */ EventEntity(long j, String str, String str2, int i, String str3, int i2, String str4, long j2, String str5, int i3, String str6, String str7, String str8, String str9, int i4, long j3, String str10, int i5, int i6, String str11, String str12, String str13, String str14, JSONObject jSONObject, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j, str, str2, i, str3, i2, str4, j2, str5, i3, str6, str7, str8, str9, i4, j3, str10, i5, i6, str11, str12, str13, str14, (i7 & 8388608) != 0 ? new JSONObject() : jSONObject);
    }

    public final JSONObject getDefaultValue() {
        return this.defaultValue;
    }

    public final void setDefaultValue(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.defaultValue = jSONObject;
    }
}
