package com.wakeup.howear.config;

import com.wakeup.common.config.AppBuildConfigProvider;
import com.wakeup.howear.BuildConfig;
import kotlin.Metadata;

/* compiled from: AppBuildConfig.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016¨\u0006\u0016"}, d2 = {"Lcom/wakeup/howear/config/AppBuildConfig;", "Lcom/wakeup/common/config/AppBuildConfigProvider;", "<init>", "()V", "getWxAppId", "", "getWxAppSecret", "getQqLoginAppId", "getUmengAppKey", "isOverseas", "", "getUmengAuthSDKInfo", "getChannel", "getAppTypeAppNameCN", "getAppTypeAppName", "getAppTypeCompanyCN", "getAppTypeCompany", "getAppTypeAbbreviationCN", "getAppTypeAbbreviation", "getAppTypeAddressCN", "getAppTypeAddress", "getAppTypeCustomerServiceEmail", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppBuildConfig implements AppBuildConfigProvider {
    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getWxAppId() {
        return BuildConfig.WX_APP_ID;
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getWxAppSecret() {
        return BuildConfig.WX_APP_SECRET;
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getQqLoginAppId() {
        return BuildConfig.QQ_LOGIN_APP_ID;
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getUmengAppKey(boolean isOverseas) {
        if (isOverseas) {
            return BuildConfig.UMENG_APP_KEY_OVERSEAS;
        }
        return BuildConfig.UMENG_APP_KEY;
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getUmengAuthSDKInfo() {
        return BuildConfig.UMENG_AUTH_SDK_INFO;
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getChannel() {
        return "wp";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeAppNameCN() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeAppName() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeCompanyCN() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeCompany() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeAbbreviationCN() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeAbbreviation() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeAddressCN() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeAddress() {
        return "";
    }

    @Override // com.wakeup.common.config.AppBuildConfigProvider
    public String getAppTypeCustomerServiceEmail() {
        return BuildConfig.APP_INFO_SERVICE_EMAIL;
    }
}
