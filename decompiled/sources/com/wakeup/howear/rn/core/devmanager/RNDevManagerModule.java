package com.wakeup.howear.rn.core.devmanager;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;

/* compiled from: RNDevManagerModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/rn/core/devmanager/RNDevManagerModule;", "Lcom/facebook/react/bridge/BaseJavaModule;", "<init>", "()V", "getName", "", "loadBundleByBundleUrl", "", "host", "jsMainModulePath", "load", "url", "feature-rn_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNDevManagerModule extends BaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNDevManager";
    }

    @ReactMethod
    public final void loadBundleByBundleUrl(String host, String jsMainModulePath) {
        String str;
        String str2 = host;
        if (str2 == null || str2.length() == 0 || (str = jsMainModulePath) == null || str.length() == 0) {
            return;
        }
        TaroDevManager.INSTANCE.loadBundleByBundleUrl(host, jsMainModulePath);
    }

    @ReactMethod
    public final void load(String url) {
        if (url != null) {
            TaroDevManager.INSTANCE.loadBundle(url);
        }
    }
}
