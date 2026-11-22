package com.wakeup.common.config;

import kotlin.Metadata;

/* compiled from: AppBuildConfigProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/config/AppBuildConfigProvider;", "", "getWxAppId", "", "getWxAppSecret", "getQqLoginAppId", "getUmengAppKey", "isOverseas", "", "getUmengAuthSDKInfo", "getChannel", "getAppTypeAppNameCN", "getAppTypeAppName", "getAppTypeCompanyCN", "getAppTypeCompany", "getAppTypeAbbreviationCN", "getAppTypeAbbreviation", "getAppTypeAddressCN", "getAppTypeAddress", "getAppTypeCustomerServiceEmail", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AppBuildConfigProvider {
    String getAppTypeAbbreviation();

    String getAppTypeAbbreviationCN();

    String getAppTypeAddress();

    String getAppTypeAddressCN();

    String getAppTypeAppName();

    String getAppTypeAppNameCN();

    String getAppTypeCompany();

    String getAppTypeCompanyCN();

    String getAppTypeCustomerServiceEmail();

    String getChannel();

    String getQqLoginAppId();

    String getUmengAppKey(boolean isOverseas);

    String getUmengAuthSDKInfo();

    String getWxAppId();

    String getWxAppSecret();
}
