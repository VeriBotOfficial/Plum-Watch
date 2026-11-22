package com.huawei.hms.feature.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* loaded from: classes14.dex */
public class e implements DynamicModule.VersionPolicy {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10349a = "e";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        if (remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.j) > 0) {
            Logger.i(f10349a, "Prefer remote: The version of remote module " + str + ":" + remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.j));
            return remoteModuleInfo;
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        if (localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.k) > 0) {
            Logger.i(f10349a, "Choose local: The version of local module " + str + ":" + localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.k));
            return localModuleInfo;
        }
        Logger.i(f10349a, "Cannot get module info in remote or local.");
        return new Bundle();
    }
}
