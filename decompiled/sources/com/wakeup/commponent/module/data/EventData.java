package com.wakeup.commponent.module.data;

import android.gov.nist.core.Separators;
import android.os.Build;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.constants.HttpConstants;
import com.heytap.mcssdk.constant.b;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.phancy.mini.core.resource.MiniPack;
import com.wakeup.common.Constants;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.utils.DateUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: EventData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 p2\u00020\u0001:\u0001pBù\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\bHÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0005HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u001dHÆ\u0003Jù\u0001\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010k\u001a\u00020l2\b\u0010m\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010n\u001a\u00020\bHÖ\u0001J\t\u0010o\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010#\"\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010+R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u00102R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u0010+R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010#\"\u0004\b:\u0010+R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010#\"\u0004\b<\u0010+R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010!\"\u0004\b@\u00102R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010#\"\u0004\bB\u0010+R\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010#\"\u0004\bG\u0010+R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010#\"\u0004\bI\u0010+R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010#\"\u0004\bK\u0010+R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010#\"\u0004\bM\u0010+R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006q"}, d2 = {"Lcom/wakeup/commponent/module/data/EventData;", "", "id", "", "brand", "", "model", "versionSdk", "", "optKey", "optType", "otherValue", Constants.BundleKey.TIMESTAMP, "create_time", "userId", "userName", "cityName", "provinceName", "deviceNumber", "remainIntegral", "residenceTime", "app_version", HttpConstants.HTTP_OS_TYPE, "areaType", "countryName", MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, "provinceCode", "cityCode", "defaultValue", "Lorg/json/JSONObject;", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getId", "()J", "getBrand", "()Ljava/lang/String;", "getModel", "getVersionSdk", "()I", "setVersionSdk", "(I)V", "getOptKey", "setOptKey", "(Ljava/lang/String;)V", "getOptType", "setOptType", "getOtherValue", "setOtherValue", "getTimeStamp", "setTimeStamp", "(J)V", "getCreate_time", "setCreate_time", "getUserId", "setUserId", "getUserName", "getCityName", "getProvinceName", "setProvinceName", "getDeviceNumber", "setDeviceNumber", "getRemainIntegral", "setRemainIntegral", "getResidenceTime", "setResidenceTime", "getApp_version", "setApp_version", "getOs_type", "setOs_type", "getAreaType", "getCountryName", "setCountryName", "getCountryCode", "setCountryCode", "getProvinceCode", "setProvinceCode", "getCityCode", "setCityCode", "getDefaultValue", "()Lorg/json/JSONObject;", "setDefaultValue", "(Lorg/json/JSONObject;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EventData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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
    private final long id;
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

    public EventData() {
        this(0L, null, null, 0, null, 0, null, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777215, null);
    }

    public EventData(long j) {
        this(j, null, null, 0, null, 0, null, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777214, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand) {
        this(j, brand, null, 0, null, 0, null, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777212, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model) {
        this(j, brand, model, 0, null, 0, null, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777208, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i) {
        this(j, brand, model, i, null, 0, null, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777200, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey) {
        this(j, brand, model, i, optKey, 0, null, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777184, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2) {
        this(j, brand, model, i, optKey, i2, null, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777152, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue) {
        this(j, brand, model, i, optKey, i2, otherValue, 0L, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16777088, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, null, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16776960, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, 0, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16776704, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, null, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16776192, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, null, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16775168, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, null, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16773120, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, null, 0, 0L, null, 0, 0, null, null, null, null, null, 16769024, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, 0, 0L, null, 0, 0, null, null, null, null, null, 16760832, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(deviceNumber, "deviceNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, 0L, null, 0, 0, null, null, null, null, null, 16744448, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(deviceNumber, "deviceNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, null, 0, 0, null, null, null, null, null, 16711680, null);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(optKey, "optKey");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(create_time, "create_time");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(deviceNumber, "deviceNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, app_version, 0, 0, null, null, null, null, null, 16646144, null);
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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, app_version, i5, 0, null, null, null, null, null, 16515072, null);
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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5, int i6) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, app_version, i5, i6, null, null, null, null, null, 16252928, null);
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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5, int i6, String countryName) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, app_version, i5, i6, countryName, null, null, null, null, 15728640, null);
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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5, int i6, String countryName, String countryCode) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, app_version, i5, i6, countryName, countryCode, null, null, null, 14680064, null);
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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5, int i6, String countryName, String countryCode, String provinceCode) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, app_version, i5, i6, countryName, countryCode, provinceCode, null, null, Const.I_UP_WIFI, null);
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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5, int i6, String countryName, String countryCode, String provinceCode, String cityCode) {
        this(j, brand, model, i, optKey, i2, otherValue, j2, create_time, i3, userName, cityName, provinceName, deviceNumber, i4, j3, app_version, i5, i6, countryName, countryCode, provinceCode, cityCode, null, 8388608, null);
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
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, long j, String str, String str2, int i, String str3, int i2, String str4, long j2, String str5, int i3, String str6, String str7, String str8, String str9, int i4, long j3, String str10, int i5, int i6, String str11, String str12, String str13, String str14, JSONObject jSONObject, int i7, Object obj) {
        JSONObject jSONObject2;
        String str15;
        long j4 = (i7 & 1) != 0 ? eventData.id : j;
        String str16 = (i7 & 2) != 0 ? eventData.brand : str;
        String str17 = (i7 & 4) != 0 ? eventData.model : str2;
        int i8 = (i7 & 8) != 0 ? eventData.versionSdk : i;
        String str18 = (i7 & 16) != 0 ? eventData.optKey : str3;
        int i9 = (i7 & 32) != 0 ? eventData.optType : i2;
        String str19 = (i7 & 64) != 0 ? eventData.otherValue : str4;
        long j5 = (i7 & 128) != 0 ? eventData.timeStamp : j2;
        String str20 = (i7 & 256) != 0 ? eventData.create_time : str5;
        int i10 = (i7 & 512) != 0 ? eventData.userId : i3;
        String str21 = (i7 & 1024) != 0 ? eventData.userName : str6;
        String str22 = (i7 & 2048) != 0 ? eventData.cityName : str7;
        long j6 = j4;
        String str23 = (i7 & 4096) != 0 ? eventData.provinceName : str8;
        String str24 = (i7 & 8192) != 0 ? eventData.deviceNumber : str9;
        String str25 = str23;
        int i11 = (i7 & 16384) != 0 ? eventData.remainIntegral : i4;
        long j7 = (i7 & 32768) != 0 ? eventData.residenceTime : j3;
        String str26 = (i7 & 65536) != 0 ? eventData.app_version : str10;
        int i12 = (i7 & 131072) != 0 ? eventData.os_type : i5;
        String str27 = str26;
        int i13 = (i7 & 262144) != 0 ? eventData.areaType : i6;
        String str28 = (i7 & 524288) != 0 ? eventData.countryName : str11;
        String str29 = (i7 & 1048576) != 0 ? eventData.countryCode : str12;
        String str30 = (i7 & 2097152) != 0 ? eventData.provinceCode : str13;
        String str31 = (i7 & 4194304) != 0 ? eventData.cityCode : str14;
        if ((i7 & 8388608) != 0) {
            str15 = str31;
            jSONObject2 = eventData.defaultValue;
        } else {
            jSONObject2 = jSONObject;
            str15 = str31;
        }
        return eventData.copy(j6, str16, str17, i8, str18, i9, str19, j5, str20, i10, str21, str22, str25, str24, i11, j7, str27, i12, i13, str28, str29, str30, str15, jSONObject2);
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

    public final EventData copy(long id2, String brand, String model, int versionSdk, String optKey, int optType, String otherValue, long timeStamp, String create_time, int userId, String userName, String cityName, String provinceName, String deviceNumber, int remainIntegral, long residenceTime, String app_version, int os_type, int areaType, String countryName, String countryCode, String provinceCode, String cityCode, JSONObject defaultValue) {
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
        return new EventData(id2, brand, model, versionSdk, optKey, optType, otherValue, timeStamp, create_time, userId, userName, cityName, provinceName, deviceNumber, remainIntegral, residenceTime, app_version, os_type, areaType, countryName, countryCode, provinceCode, cityCode, defaultValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) other;
        return this.id == eventData.id && Intrinsics.areEqual(this.brand, eventData.brand) && Intrinsics.areEqual(this.model, eventData.model) && this.versionSdk == eventData.versionSdk && Intrinsics.areEqual(this.optKey, eventData.optKey) && this.optType == eventData.optType && Intrinsics.areEqual(this.otherValue, eventData.otherValue) && this.timeStamp == eventData.timeStamp && Intrinsics.areEqual(this.create_time, eventData.create_time) && this.userId == eventData.userId && Intrinsics.areEqual(this.userName, eventData.userName) && Intrinsics.areEqual(this.cityName, eventData.cityName) && Intrinsics.areEqual(this.provinceName, eventData.provinceName) && Intrinsics.areEqual(this.deviceNumber, eventData.deviceNumber) && this.remainIntegral == eventData.remainIntegral && this.residenceTime == eventData.residenceTime && Intrinsics.areEqual(this.app_version, eventData.app_version) && this.os_type == eventData.os_type && this.areaType == eventData.areaType && Intrinsics.areEqual(this.countryName, eventData.countryName) && Intrinsics.areEqual(this.countryCode, eventData.countryCode) && Intrinsics.areEqual(this.provinceCode, eventData.provinceCode) && Intrinsics.areEqual(this.cityCode, eventData.cityCode) && Intrinsics.areEqual(this.defaultValue, eventData.defaultValue);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.brand.hashCode()) * 31) + this.model.hashCode()) * 31) + Integer.hashCode(this.versionSdk)) * 31) + this.optKey.hashCode()) * 31) + Integer.hashCode(this.optType)) * 31) + this.otherValue.hashCode()) * 31) + Long.hashCode(this.timeStamp)) * 31) + this.create_time.hashCode()) * 31) + Integer.hashCode(this.userId)) * 31) + this.userName.hashCode()) * 31) + this.cityName.hashCode()) * 31) + this.provinceName.hashCode()) * 31) + this.deviceNumber.hashCode()) * 31) + Integer.hashCode(this.remainIntegral)) * 31) + Long.hashCode(this.residenceTime)) * 31) + this.app_version.hashCode()) * 31) + Integer.hashCode(this.os_type)) * 31) + Integer.hashCode(this.areaType)) * 31) + this.countryName.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.provinceCode.hashCode()) * 31) + this.cityCode.hashCode()) * 31) + this.defaultValue.hashCode();
    }

    public String toString() {
        return "EventData(id=" + this.id + ", brand=" + this.brand + ", model=" + this.model + ", versionSdk=" + this.versionSdk + ", optKey=" + this.optKey + ", optType=" + this.optType + ", otherValue=" + this.otherValue + ", timeStamp=" + this.timeStamp + ", create_time=" + this.create_time + ", userId=" + this.userId + ", userName=" + this.userName + ", cityName=" + this.cityName + ", provinceName=" + this.provinceName + ", deviceNumber=" + this.deviceNumber + ", remainIntegral=" + this.remainIntegral + ", residenceTime=" + this.residenceTime + ", app_version=" + this.app_version + ", os_type=" + this.os_type + ", areaType=" + this.areaType + ", countryName=" + this.countryName + ", countryCode=" + this.countryCode + ", provinceCode=" + this.provinceCode + ", cityCode=" + this.cityCode + ", defaultValue=" + this.defaultValue + Separators.RPAREN;
    }

    public EventData(long j, String brand, String model, int i, String optKey, int i2, String otherValue, long j2, String create_time, int i3, String userName, String cityName, String provinceName, String deviceNumber, int i4, long j3, String app_version, int i5, int i6, String countryName, String countryCode, String provinceCode, String cityCode, JSONObject defaultValue) {
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

    public /* synthetic */ EventData(long j, String str, String str2, int i, String str3, int i2, String str4, long j2, String str5, int i3, String str6, String str7, String str8, String str9, int i4, long j3, String str10, int i5, int i6, String str11, String str12, String str13, String str14, JSONObject jSONObject, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? "" : str3, (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? "" : str4, (i7 & 128) != 0 ? 0L : j2, (i7 & 256) != 0 ? "" : str5, (i7 & 512) != 0 ? 0 : i3, (i7 & 1024) != 0 ? "" : str6, (i7 & 2048) != 0 ? "" : str7, (i7 & 4096) != 0 ? "" : str8, (i7 & 8192) != 0 ? "" : str9, (i7 & 16384) != 0 ? 0 : i4, (i7 & 32768) != 0 ? 0L : j3, (i7 & 65536) != 0 ? "" : str10, (i7 & 131072) != 0 ? 1 : i5, (i7 & 262144) == 0 ? i6 : 1, (i7 & 524288) != 0 ? "" : str11, (i7 & 1048576) != 0 ? "" : str12, (i7 & 2097152) != 0 ? "" : str13, (i7 & 4194304) == 0 ? str14 : "", (i7 & 8388608) != 0 ? new JSONObject() : jSONObject);
    }

    public final long getId() {
        return this.id;
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

    public final JSONObject getDefaultValue() {
        return this.defaultValue;
    }

    public final void setDefaultValue(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.defaultValue = jSONObject;
    }

    /* compiled from: EventData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¨\u0006\u0017"}, d2 = {"Lcom/wakeup/commponent/module/data/EventData$Companion;", "", "<init>", "()V", "createEventData", "Lcom/wakeup/commponent/module/data/EventData;", "optType", "", b.k, "", "residenceTime", "", "otherValue", "deviceNumber", "cityName", "provinceName", "app_version", "isOverseas", "", "countryName", MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, "provinceCode", "cityCode", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EventData createEventData(int optType, String eventId, long residenceTime, String otherValue, String deviceNumber, String cityName, String provinceName, String app_version, boolean isOverseas, String countryName, String countryCode, String provinceCode, String cityCode) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(otherValue, "otherValue");
            Intrinsics.checkNotNullParameter(deviceNumber, "deviceNumber");
            Intrinsics.checkNotNullParameter(cityName, "cityName");
            Intrinsics.checkNotNullParameter(provinceName, "provinceName");
            Intrinsics.checkNotNullParameter(app_version, "app_version");
            Intrinsics.checkNotNullParameter(countryName, "countryName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
            Intrinsics.checkNotNullParameter(cityCode, "cityCode");
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            int i = Build.VERSION.SDK_INT;
            long currentTimeMillis = System.currentTimeMillis();
            String dateUtil = DateUtil.toString(System.currentTimeMillis(), MiniPack.BUILD_TIME_FORMAT);
            Intrinsics.checkNotNullExpressionValue(dateUtil, "toString(...)");
            int uid = UserDao.getUser() != null ? UserDao.getUser().getUid() : 0;
            String nickname = UserDao.getUser() != null ? UserDao.getUser().getNickname() : "";
            Intrinsics.checkNotNull(nickname);
            return new EventData(0L, BRAND, MODEL, i, eventId, optType, otherValue, currentTimeMillis, dateUtil, uid, nickname, cityName, provinceName, deviceNumber, UserDao.getUser() != null ? UserDao.getUser().getIntegralScore() : 0, residenceTime, app_version, 1, isOverseas ? 2 : 1, countryName, countryCode, provinceCode, cityCode, new JSONObject(), 1, null);
        }
    }
}
