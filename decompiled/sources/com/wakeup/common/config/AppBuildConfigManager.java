package com.wakeup.common.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppBuildConfigManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u000bJ\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/config/AppBuildConfigManager;", "", "<init>", "()V", "sProvider", "Lcom/wakeup/common/config/AppBuildConfigProvider;", "init", "", "provider", "getProvider", "getWxAppId", "", "getWxAppSecret", "getQqLoginAppId", "getUmengAppKey", "isOverseas", "", "getUmengAuthSDKInfo", "getChannel", "getAppTypeAppNameCN", "getAppTypeAppName", "getAppTypeCompanyCN", "getAppTypeCompany", "getAppTypeAbbreviationCN", "getAppTypeAbbreviation", "getAppTypeAddressCN", "getAppTypeAddress", "getAppTypeCustomerServiceEmail", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppBuildConfigManager {
    public static final AppBuildConfigManager INSTANCE = new AppBuildConfigManager();
    private static AppBuildConfigProvider sProvider;

    private AppBuildConfigManager() {
    }

    public final void init(AppBuildConfigProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        sProvider = provider;
    }

    private final AppBuildConfigProvider getProvider() {
        AppBuildConfigProvider appBuildConfigProvider = sProvider;
        if (appBuildConfigProvider != null) {
            return appBuildConfigProvider;
        }
        throw new IllegalStateException("AppBuildConfigProvider not initialized. Call AppBuildConfigManager.init() in Application.onCreate()");
    }

    public final String getWxAppId() {
        return getProvider().getWxAppId();
    }

    public final String getWxAppSecret() {
        return getProvider().getWxAppSecret();
    }

    public final String getQqLoginAppId() {
        return getProvider().getQqLoginAppId();
    }

    public final String getUmengAppKey(boolean isOverseas) {
        return getProvider().getUmengAppKey(isOverseas);
    }

    public final String getUmengAuthSDKInfo() {
        return getProvider().getUmengAuthSDKInfo();
    }

    public final String getChannel() {
        return getProvider().getChannel();
    }

    public final String getAppTypeAppNameCN() {
        return getProvider().getAppTypeAppNameCN();
    }

    public final String getAppTypeAppName() {
        return getProvider().getAppTypeAppName();
    }

    public final String getAppTypeCompanyCN() {
        return getProvider().getAppTypeCompanyCN();
    }

    public final String getAppTypeCompany() {
        return getProvider().getAppTypeCompany();
    }

    public final String getAppTypeAbbreviationCN() {
        return getProvider().getAppTypeAbbreviationCN();
    }

    public final String getAppTypeAbbreviation() {
        return getProvider().getAppTypeAbbreviation();
    }

    public final String getAppTypeAddressCN() {
        return getProvider().getAppTypeAddressCN();
    }

    public final String getAppTypeAddress() {
        return getProvider().getAppTypeAddress();
    }

    public final String getAppTypeCustomerServiceEmail() {
        return getProvider().getAppTypeCustomerServiceEmail();
    }
}
