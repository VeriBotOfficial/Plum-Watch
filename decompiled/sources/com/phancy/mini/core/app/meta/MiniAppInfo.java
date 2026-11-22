package com.phancy.mini.core.app.meta;

import com.alibaba.fastjson.JSONObject;
import com.phancy.mini.core.api.ApiError;
import com.phancy.mini.utils.JsonExtKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MiniAppInfo.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J1\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0014HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\nR\u001d\u0010 \u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\nR\u001d\u0010#\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b$\u0010\nR\u001b\u0010&\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b(\u0010)¨\u00065"}, d2 = {"Lcom/phancy/mini/core/app/meta/MiniAppInfo;", "", "appId", "", "appName", "appVersion", "infoData", "Lcom/alibaba/fastjson/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", "getAppId", "()Ljava/lang/String;", "getAppName", "getAppVersion", "appVersions", "Lcom/phancy/mini/core/app/meta/MiniVersions;", "getAppVersions", "()Lcom/phancy/mini/core/app/meta/MiniVersions;", "appVersions$delegate", "Lkotlin/Lazy;", "code", "", "getCode", "()I", "code$delegate", "iconUrl", "getIconUrl", "iconUrl$delegate", "getInfoData", "()Lcom/alibaba/fastjson/JSONObject;", MiniAppInfo.KEY_MAIN_BUNDLE_MD5, "getMainBundleMd5", "mainBundleMd5$delegate", "mainBundleUrl", "getMainBundleUrl", "mainBundleUrl$delegate", "miniFramework", "getMiniFramework", "miniFramework$delegate", ApiError.ERROR_MSG_OK, "", "getOk", "()Z", "ok$delegate", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MiniAppInfo {
    public static final int CODE_APP_NOT_EXITS = 10001;
    public static final int CODE_APP_NOT_LISTED = 10005;
    public static final int CODE_APP_REVIEW_REJECTED = 10007;
    public static final int CODE_APP_UNDER_REVIEW = 10006;
    public static final int CODE_CLIENT_NEED_UPDATE = 10002;
    public static final int CODE_INVALID_QR_CODE = 10003;
    public static final int CODE_OK = 0;
    public static final int CODE_TOO_MANY_REQUESTS = 10004;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_APP_ICON = "appIcon";
    public static final String KEY_APP_ID = "appId";
    public static final String KEY_APP_NAME = "appName";
    public static final String KEY_APP_VERSION = "appVersion";
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_MAIN_BUNDLE = "mainBundle";
    public static final String KEY_MAIN_BUNDLE_MD5 = "mainBundleMd5";
    public static final String KEY_MIN_FRAMEWORK = "minFramework";
    private static final String TAG = "MiniAppInfo";
    private final String appId;
    private final String appName;
    private final String appVersion;

    /* renamed from: appVersions$delegate, reason: from kotlin metadata */
    private final Lazy appVersions;

    /* renamed from: code$delegate, reason: from kotlin metadata */
    private final Lazy code;

    /* renamed from: iconUrl$delegate, reason: from kotlin metadata */
    private final Lazy iconUrl;
    private final JSONObject infoData;

    /* renamed from: mainBundleMd5$delegate, reason: from kotlin metadata */
    private final Lazy mainBundleMd5;

    /* renamed from: mainBundleUrl$delegate, reason: from kotlin metadata */
    private final Lazy mainBundleUrl;

    /* renamed from: miniFramework$delegate, reason: from kotlin metadata */
    private final Lazy miniFramework;

    /* renamed from: ok$delegate, reason: from kotlin metadata */
    private final Lazy ok;

    public static /* synthetic */ MiniAppInfo copy$default(MiniAppInfo miniAppInfo, String str, String str2, String str3, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = miniAppInfo.appId;
        }
        if ((i & 2) != 0) {
            str2 = miniAppInfo.appName;
        }
        if ((i & 4) != 0) {
            str3 = miniAppInfo.appVersion;
        }
        if ((i & 8) != 0) {
            jSONObject = miniAppInfo.infoData;
        }
        return miniAppInfo.copy(str, str2, str3, jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final JSONObject getInfoData() {
        return this.infoData;
    }

    public final MiniAppInfo copy(String appId, String appName, String appVersion, JSONObject infoData) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(infoData, "infoData");
        return new MiniAppInfo(appId, appName, appVersion, infoData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppInfo)) {
            return false;
        }
        MiniAppInfo miniAppInfo = (MiniAppInfo) other;
        return Intrinsics.areEqual(this.appId, miniAppInfo.appId) && Intrinsics.areEqual(this.appName, miniAppInfo.appName) && Intrinsics.areEqual(this.appVersion, miniAppInfo.appVersion) && Intrinsics.areEqual(this.infoData, miniAppInfo.infoData);
    }

    public int hashCode() {
        return (((((this.appId.hashCode() * 31) + this.appName.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.infoData.hashCode();
    }

    public String toString() {
        return "MiniAppInfo(appId=" + this.appId + ", appName=" + this.appName + ", appVersion=" + this.appVersion + ", infoData=" + this.infoData + ')';
    }

    public MiniAppInfo(String appId, String appName, String appVersion, JSONObject infoData) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(infoData, "infoData");
        this.appId = appId;
        this.appName = appName;
        this.appVersion = appVersion;
        this.infoData = infoData;
        this.appVersions = LazyKt.lazy(new Function0<MiniVersions>() { // from class: com.phancy.mini.core.app.meta.MiniAppInfo$appVersions$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MiniVersions invoke() {
                return new MiniVersions(MiniAppInfo.this.getAppVersion());
            }
        });
        this.mainBundleUrl = LazyKt.lazy(new Function0<String>() { // from class: com.phancy.mini.core.app.meta.MiniAppInfo$mainBundleUrl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return MiniAppInfo.this.getInfoData().getString(MiniAppInfo.KEY_MAIN_BUNDLE);
            }
        });
        this.mainBundleMd5 = LazyKt.lazy(new Function0<String>() { // from class: com.phancy.mini.core.app.meta.MiniAppInfo$mainBundleMd5$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return MiniAppInfo.this.getInfoData().getString(MiniAppInfo.KEY_MAIN_BUNDLE_MD5);
            }
        });
        this.code = LazyKt.lazy(new Function0<Integer>() { // from class: com.phancy.mini.core.app.meta.MiniAppInfo$code$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(JsonExtKt.optInt(MiniAppInfo.this.getInfoData(), "errorCode", 0));
            }
        });
        this.ok = LazyKt.lazy(new Function0<Boolean>() { // from class: com.phancy.mini.core.app.meta.MiniAppInfo$ok$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(MiniAppInfo.this.getCode() == 0);
            }
        });
        this.iconUrl = LazyKt.lazy(new Function0<String>() { // from class: com.phancy.mini.core.app.meta.MiniAppInfo$iconUrl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return MiniAppInfo.this.getInfoData().getString(MiniAppInfo.KEY_APP_ICON);
            }
        });
        this.miniFramework = LazyKt.lazy(new Function0<String>() { // from class: com.phancy.mini.core.app.meta.MiniAppInfo$miniFramework$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return MiniAppInfo.this.getInfoData().getString(MiniAppInfo.KEY_MIN_FRAMEWORK);
            }
        });
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final JSONObject getInfoData() {
        return this.infoData;
    }

    public final MiniVersions getAppVersions() {
        return (MiniVersions) this.appVersions.getValue();
    }

    public final String getMainBundleUrl() {
        return (String) this.mainBundleUrl.getValue();
    }

    public final String getMainBundleMd5() {
        return (String) this.mainBundleMd5.getValue();
    }

    public final int getCode() {
        return ((Number) this.code.getValue()).intValue();
    }

    public final boolean getOk() {
        return ((Boolean) this.ok.getValue()).booleanValue();
    }

    public final String getIconUrl() {
        return (String) this.iconUrl.getValue();
    }

    public final String getMiniFramework() {
        return (String) this.miniFramework.getValue();
    }

    /* compiled from: MiniAppInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/phancy/mini/core/app/meta/MiniAppInfo$Companion;", "", "()V", "CODE_APP_NOT_EXITS", "", "CODE_APP_NOT_LISTED", "CODE_APP_REVIEW_REJECTED", "CODE_APP_UNDER_REVIEW", "CODE_CLIENT_NEED_UPDATE", "CODE_INVALID_QR_CODE", "CODE_OK", "CODE_TOO_MANY_REQUESTS", "KEY_APP_ICON", "", "KEY_APP_ID", "KEY_APP_NAME", "KEY_APP_VERSION", "KEY_ERROR_CODE", "KEY_MAIN_BUNDLE", "KEY_MAIN_BUNDLE_MD5", "KEY_MIN_FRAMEWORK", "TAG", "from", "Lcom/phancy/mini/core/app/meta/MiniAppInfo;", "appInfo", "Lcom/alibaba/fastjson/JSONObject;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MiniAppInfo from(JSONObject appInfo) {
            String string = appInfo != null ? appInfo.getString("appId") : null;
            String string2 = appInfo != null ? appInfo.getString("appName") : null;
            String string3 = appInfo != null ? appInfo.getString("appVersion") : null;
            if (string == null || string2 == null || string3 == null) {
                return null;
            }
            return new MiniAppInfo(string, string2, string3, appInfo);
        }
    }
}
