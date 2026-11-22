package com.phancy.mini.service.builtin;

import com.phancy.mini.BuildConfig;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.service.BaseService;
import com.phancy.mini.service.IBuiltinAppService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuiltinAppService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/phancy/mini/service/builtin/BuiltinAppService;", "Lcom/phancy/mini/service/BaseService;", "Lcom/phancy/mini/service/IBuiltinAppService;", "()V", "getAppBundleMD5", "", "appId", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public class BuiltinAppService extends BaseService implements IBuiltinAppService {
    @Override // com.phancy.mini.service.IBuiltinAppService
    public String getAppBundleMD5(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        if (Intrinsics.areEqual(appId, MiniSDK.MINI_DEMO_APP_ID)) {
            return BuildConfig.MINI_DEMO_APP_MD5;
        }
        return null;
    }
}
