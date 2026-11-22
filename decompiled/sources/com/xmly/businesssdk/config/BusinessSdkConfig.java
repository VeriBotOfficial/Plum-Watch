package com.xmly.businesssdk.config;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import io.nats.client.support.ApiConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BusinessSdkConfig.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b(\b\u0086\b\u0018\u0000 72\u00020\u0001:\u000267B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0094\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\bHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00068"}, d2 = {"Lcom/xmly/businesssdk/config/BusinessSdkConfig;", "", "appId", "", "debugMode", "", "enableNotification", "notificationIconResId", "", "notificationClickActivity", "Ljava/lang/Class;", "useX5WebView", "webViewUrl", "useMediaSession", "moduleConfigs", "", "Lcom/xmly/businesssdk/config/ModuleConfig;", "thirdPartyUserId", "thirdPartyCtei", "(Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Class;ZLjava/lang/String;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getDebugMode", "()Z", "getEnableNotification", "getModuleConfigs", "()Ljava/util/Map;", "getNotificationClickActivity", "()Ljava/lang/Class;", "getNotificationIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getThirdPartyCtei", "getThirdPartyUserId", "getUseMediaSession", "getUseX5WebView", "getWebViewUrl", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Class;ZLjava/lang/String;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/xmly/businesssdk/config/BusinessSdkConfig;", "equals", "other", "hashCode", "toString", "Builder", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BusinessSdkConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String appId;
    private final boolean debugMode;
    private final boolean enableNotification;
    private final Map<String, ModuleConfig> moduleConfigs;
    private final transient Class<?> notificationClickActivity;
    private final Integer notificationIconResId;
    private final String thirdPartyCtei;
    private final String thirdPartyUserId;
    private final boolean useMediaSession;
    private final boolean useX5WebView;
    private final String webViewUrl;

    /* compiled from: BusinessSdkConfig.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00062\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010 \u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fJ\u0015\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0004J\u0010\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xmly/businesssdk/config/BusinessSdkConfig$Builder;", "", "()V", "appId", "", "debugMode", "", "enableNotification", "moduleConfigs", "", "Lcom/xmly/businesssdk/config/ModuleConfig;", "notificationClickActivity", "Ljava/lang/Class;", "notificationIconResId", "", "Ljava/lang/Integer;", "thirdPartyCtei", "thirdPartyUserId", "useMediaSession", "useX5WebView", "webViewUrl", "addModuleConfig", "moduleName", ViewProps.ENABLED, ApiConstants.OPTIONS, "", "build", "Lcom/xmly/businesssdk/config/BusinessSdkConfig;", "removeModuleConfig", "setAppId", "setDebugMode", "setEnableNotification", "setNotificationClickActivity", "activityClass", "setNotificationIconResId", "iconResId", "(Ljava/lang/Integer;)Lcom/xmly/businesssdk/config/BusinessSdkConfig$Builder;", "setThirdPartyCtei", "ctei", "setThirdPartyUserId", "userId", "setUseMediaSession", "setUseX5WebView", "setWebViewUrl", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private boolean debugMode;
        private Class<?> notificationClickActivity;
        private Integer notificationIconResId;
        private String thirdPartyCtei;
        private String thirdPartyUserId;
        private String appId = "";
        private boolean useX5WebView = true;
        private String webViewUrl = "";
        private boolean useMediaSession = true;
        private final Map<String, ModuleConfig> moduleConfigs = new LinkedHashMap();
        private boolean enableNotification = true;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder addModuleConfig$default(Builder builder, String str, boolean z, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return builder.addModuleConfig(str, z, map);
        }

        public final Builder addModuleConfig(String moduleName, boolean enabled, Map<String, ? extends Object> options) {
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(options, "options");
            this.moduleConfigs.put(moduleName, new ModuleConfig(moduleName, enabled, options));
            return this;
        }

        public final BusinessSdkConfig build() {
            if (StringsKt.isBlank(this.appId)) {
                throw new IllegalArgumentException("appId cannot be empty".toString());
            }
            return new BusinessSdkConfig(this.appId, this.debugMode, this.enableNotification, this.notificationIconResId, this.notificationClickActivity, this.useX5WebView, this.webViewUrl, this.useMediaSession, MapsKt.toMap(this.moduleConfigs), this.thirdPartyUserId, this.thirdPartyCtei);
        }

        public final Builder removeModuleConfig(String moduleName) {
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            this.moduleConfigs.remove(moduleName);
            return this;
        }

        public final Builder setAppId(String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.appId = appId;
            return this;
        }

        public final Builder setDebugMode(boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }

        public final Builder setEnableNotification(boolean enableNotification) {
            this.enableNotification = enableNotification;
            return this;
        }

        public final Builder setNotificationClickActivity(Class<?> activityClass) {
            this.notificationClickActivity = activityClass;
            return this;
        }

        public final Builder setNotificationIconResId(Integer iconResId) {
            this.notificationIconResId = iconResId;
            return this;
        }

        public final Builder setThirdPartyCtei(String ctei) {
            this.thirdPartyCtei = ctei;
            return this;
        }

        public final Builder setThirdPartyUserId(String userId) {
            this.thirdPartyUserId = userId;
            return this;
        }

        public final Builder setUseMediaSession(boolean useMediaSession) {
            this.useMediaSession = useMediaSession;
            return this;
        }

        public final Builder setUseX5WebView(boolean useX5WebView) {
            this.useX5WebView = useX5WebView;
            return this;
        }

        public final Builder setWebViewUrl(String webViewUrl) {
            Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
            this.webViewUrl = webViewUrl;
            return this;
        }
    }

    /* compiled from: BusinessSdkConfig.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xmly/businesssdk/config/BusinessSdkConfig$Companion;", "", "()V", "createDefault", "Lcom/xmly/businesssdk/config/BusinessSdkConfig;", "context", "Landroid/content/Context;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BusinessSdkConfig createDefault(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String packageName = context.getPackageName();
            Boolean bool = Boolean.TRUE;
            Map mapOf = MapsKt.mapOf(TuplesKt.to("core", new ModuleConfig("core", true, MapsKt.emptyMap())), TuplesKt.to("player", new ModuleConfig("player", true, MapsKt.mapOf(TuplesKt.to("useExoPlayer", bool), TuplesKt.to("enableCache", bool)))), TuplesKt.to("webview", new ModuleConfig("webview", true, MapsKt.mapOf(TuplesKt.to("useX5", bool)))));
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            return new BusinessSdkConfig(packageName, false, true, null, null, true, "", true, mapOf, null, null, 1536, null);
        }
    }

    public BusinessSdkConfig(String appId, boolean z, boolean z2, Integer num, Class<?> cls, boolean z3, String webViewUrl, boolean z4, Map<String, ModuleConfig> moduleConfigs, String str, String str2) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
        Intrinsics.checkNotNullParameter(moduleConfigs, "moduleConfigs");
        this.appId = appId;
        this.debugMode = z;
        this.enableNotification = z2;
        this.notificationIconResId = num;
        this.notificationClickActivity = cls;
        this.useX5WebView = z3;
        this.webViewUrl = webViewUrl;
        this.useMediaSession = z4;
        this.moduleConfigs = moduleConfigs;
        this.thirdPartyUserId = str;
        this.thirdPartyCtei = str2;
    }

    public static /* synthetic */ BusinessSdkConfig copy$default(BusinessSdkConfig businessSdkConfig, String str, boolean z, boolean z2, Integer num, Class cls, boolean z3, String str2, boolean z4, Map map, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = businessSdkConfig.appId;
        }
        if ((i & 2) != 0) {
            z = businessSdkConfig.debugMode;
        }
        if ((i & 4) != 0) {
            z2 = businessSdkConfig.enableNotification;
        }
        if ((i & 8) != 0) {
            num = businessSdkConfig.notificationIconResId;
        }
        if ((i & 16) != 0) {
            cls = businessSdkConfig.notificationClickActivity;
        }
        if ((i & 32) != 0) {
            z3 = businessSdkConfig.useX5WebView;
        }
        if ((i & 64) != 0) {
            str2 = businessSdkConfig.webViewUrl;
        }
        if ((i & 128) != 0) {
            z4 = businessSdkConfig.useMediaSession;
        }
        if ((i & 256) != 0) {
            map = businessSdkConfig.moduleConfigs;
        }
        if ((i & 512) != 0) {
            str3 = businessSdkConfig.thirdPartyUserId;
        }
        if ((i & 1024) != 0) {
            str4 = businessSdkConfig.thirdPartyCtei;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z5 = z4;
        Map map2 = map;
        boolean z6 = z3;
        String str7 = str2;
        Class cls2 = cls;
        boolean z7 = z2;
        return businessSdkConfig.copy(str, z, z7, num, cls2, z6, str7, z5, map2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getThirdPartyCtei() {
        return this.thirdPartyCtei;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDebugMode() {
        return this.debugMode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableNotification() {
        return this.enableNotification;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getNotificationIconResId() {
        return this.notificationIconResId;
    }

    public final Class<?> component5() {
        return this.notificationClickActivity;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUseX5WebView() {
        return this.useX5WebView;
    }

    /* renamed from: component7, reason: from getter */
    public final String getWebViewUrl() {
        return this.webViewUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getUseMediaSession() {
        return this.useMediaSession;
    }

    public final Map<String, ModuleConfig> component9() {
        return this.moduleConfigs;
    }

    public final BusinessSdkConfig copy(String appId, boolean debugMode, boolean enableNotification, Integer notificationIconResId, Class<?> notificationClickActivity, boolean useX5WebView, String webViewUrl, boolean useMediaSession, Map<String, ModuleConfig> moduleConfigs, String thirdPartyUserId, String thirdPartyCtei) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
        Intrinsics.checkNotNullParameter(moduleConfigs, "moduleConfigs");
        return new BusinessSdkConfig(appId, debugMode, enableNotification, notificationIconResId, notificationClickActivity, useX5WebView, webViewUrl, useMediaSession, moduleConfigs, thirdPartyUserId, thirdPartyCtei);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusinessSdkConfig)) {
            return false;
        }
        BusinessSdkConfig businessSdkConfig = (BusinessSdkConfig) other;
        return Intrinsics.areEqual(this.appId, businessSdkConfig.appId) && this.debugMode == businessSdkConfig.debugMode && this.enableNotification == businessSdkConfig.enableNotification && Intrinsics.areEqual(this.notificationIconResId, businessSdkConfig.notificationIconResId) && Intrinsics.areEqual(this.notificationClickActivity, businessSdkConfig.notificationClickActivity) && this.useX5WebView == businessSdkConfig.useX5WebView && Intrinsics.areEqual(this.webViewUrl, businessSdkConfig.webViewUrl) && this.useMediaSession == businessSdkConfig.useMediaSession && Intrinsics.areEqual(this.moduleConfigs, businessSdkConfig.moduleConfigs) && Intrinsics.areEqual(this.thirdPartyUserId, businessSdkConfig.thirdPartyUserId) && Intrinsics.areEqual(this.thirdPartyCtei, businessSdkConfig.thirdPartyCtei);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final boolean getDebugMode() {
        return this.debugMode;
    }

    public final boolean getEnableNotification() {
        return this.enableNotification;
    }

    public final Map<String, ModuleConfig> getModuleConfigs() {
        return this.moduleConfigs;
    }

    public final Class<?> getNotificationClickActivity() {
        return this.notificationClickActivity;
    }

    public final Integer getNotificationIconResId() {
        return this.notificationIconResId;
    }

    public final String getThirdPartyCtei() {
        return this.thirdPartyCtei;
    }

    public final String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public final boolean getUseMediaSession() {
        return this.useMediaSession;
    }

    public final boolean getUseX5WebView() {
        return this.useX5WebView;
    }

    public final String getWebViewUrl() {
        return this.webViewUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        boolean z = this.debugMode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.enableNotification;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Integer num = this.notificationIconResId;
        int hashCode2 = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        Class<?> cls = this.notificationClickActivity;
        int hashCode3 = (hashCode2 + (cls == null ? 0 : cls.hashCode())) * 31;
        boolean z3 = this.useX5WebView;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int a2 = a.a(this.webViewUrl, (hashCode3 + i5) * 31, 31);
        boolean z4 = this.useMediaSession;
        int hashCode4 = (this.moduleConfigs.hashCode() + ((a2 + (z4 ? 1 : z4 ? 1 : 0)) * 31)) * 31;
        String str = this.thirdPartyUserId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thirdPartyCtei;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessSdkConfig(appId=");
        sb.append(this.appId).append(", debugMode=").append(this.debugMode).append(", enableNotification=").append(this.enableNotification).append(", notificationIconResId=").append(this.notificationIconResId).append(", notificationClickActivity=").append(this.notificationClickActivity).append(", useX5WebView=").append(this.useX5WebView).append(", webViewUrl=").append(this.webViewUrl).append(", useMediaSession=").append(this.useMediaSession).append(", moduleConfigs=").append(this.moduleConfigs).append(", thirdPartyUserId=").append(this.thirdPartyUserId).append(", thirdPartyCtei=").append(this.thirdPartyCtei).append(')');
        return sb.toString();
    }

    public /* synthetic */ BusinessSdkConfig(String str, boolean z, boolean z2, Integer num, Class cls, boolean z3, String str2, boolean z4, Map map, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : cls, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? true : z4, (i & 256) != 0 ? MapsKt.emptyMap() : map, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4);
    }
}
