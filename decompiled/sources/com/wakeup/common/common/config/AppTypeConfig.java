package com.wakeup.common.common.config;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.config.AppBuildConfigManager;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: AppTypeConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/common/config/AppTypeConfig;", "", "<init>", "()V", "TAG", "", "getAppType", "getAppTypeConfig", "putIfNotEmpty", "", "target", "Lorg/json/JSONObject;", "key", "value", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppTypeConfig {
    public static final AppTypeConfig INSTANCE = new AppTypeConfig();
    private static final String TAG = "AppTypeConfig";

    private AppTypeConfig() {
    }

    public final String getAppType() {
        String currentChannel = ChannelConfig.INSTANCE.getCurrentChannel();
        if (Intrinsics.areEqual(currentChannel, ChannelConfig.HF_GLASSES)) {
            return "wakeOk";
        }
        if (Intrinsics.areEqual(currentChannel, ChannelConfig.LENOVO)) {
            return ChannelConfig.LENOVO;
        }
        return "wk";
    }

    public final String getAppTypeConfig() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", getAppType());
        putIfNotEmpty(jSONObject, "appNameCN", AppBuildConfigManager.INSTANCE.getAppTypeAppNameCN());
        putIfNotEmpty(jSONObject, "appName", AppBuildConfigManager.INSTANCE.getAppTypeAppName());
        putIfNotEmpty(jSONObject, "companyCN", AppBuildConfigManager.INSTANCE.getAppTypeCompanyCN());
        putIfNotEmpty(jSONObject, "company", AppBuildConfigManager.INSTANCE.getAppTypeCompany());
        putIfNotEmpty(jSONObject, "abbreviationCN", AppBuildConfigManager.INSTANCE.getAppTypeAbbreviationCN());
        putIfNotEmpty(jSONObject, "abbreviation", AppBuildConfigManager.INSTANCE.getAppTypeAbbreviation());
        putIfNotEmpty(jSONObject, "addressCN", AppBuildConfigManager.INSTANCE.getAppTypeAddressCN());
        putIfNotEmpty(jSONObject, Const.JSON_KEY_ADDRESS, AppBuildConfigManager.INSTANCE.getAppTypeAddress());
        putIfNotEmpty(jSONObject, "email", AppBuildConfigManager.INSTANCE.getAppTypeCustomerServiceEmail());
        LogUtils.i(TAG, "---appTypeConfig---" + jSONObject);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    private final void putIfNotEmpty(JSONObject target, String key, String value) {
        target.put(key, value);
    }
}
