package com.xmly.businesssdk.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewConfigImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xmly/businesssdk/config/WebViewConfigImpl;", "", "()V", "createDebugConfig", "Lcom/xmly/businesssdk/config/WebViewConfig;", "createDefault", "createFromSdkConfig", "sdkConfig", "Lcom/xmly/businesssdk/config/BusinessSdkConfig;", "createProductionConfig", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewConfigImpl {
    public static final WebViewConfigImpl INSTANCE = new WebViewConfigImpl();

    private WebViewConfigImpl() {
    }

    public final WebViewConfig createDebugConfig() {
        return new WebViewConfig(true, true, true, true, true, 0, null, 96, null);
    }

    public final WebViewConfig createDefault() {
        return new WebViewConfig(false, false, false, false, false, 0, null, 127, null);
    }

    public final WebViewConfig createFromSdkConfig(BusinessSdkConfig sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        return new WebViewConfig(sdkConfig.getDebugMode(), true, true, false, false, 0, null, 120, null);
    }

    public final WebViewConfig createProductionConfig() {
        return new WebViewConfig(false, true, true, false, false, 0, null, 96, null);
    }
}
