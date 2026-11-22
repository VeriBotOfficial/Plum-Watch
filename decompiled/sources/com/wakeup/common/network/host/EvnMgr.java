package com.wakeup.common.network.host;

import android.text.TextUtils;
import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EvnMgr.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007J\n\u0010\r\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u000f"}, d2 = {"Lcom/wakeup/common/network/host/EvnMgr;", "", "<init>", "()V", "isTest", "", "isMiniAppTest", "isMiniAppRelease", "getEnv", "Lcom/wakeup/common/network/host/EnvEnum;", "setEnv", "", "env", "getMiniAppEnv", "setMiniAppEnv", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EvnMgr {
    public static final EvnMgr INSTANCE = new EvnMgr();

    private EvnMgr() {
    }

    @JvmStatic
    public static final boolean isTest() {
        return getEnv() == EnvEnum.SIT;
    }

    @JvmStatic
    public static final boolean isMiniAppTest() {
        return getMiniAppEnv() == EnvEnum.SIT;
    }

    @JvmStatic
    public static final boolean isMiniAppRelease() {
        return getMiniAppEnv() == EnvEnum.PRO;
    }

    @JvmStatic
    public static final EnvEnum getEnv() {
        EnvEnum parse;
        String string = CacheManager.INSTANCE.getString("env");
        return (TextUtils.isEmpty(string) || (parse = EnvEnum.parse(string)) == null) ? EnvEnum.PRO : parse;
    }

    @JvmStatic
    public static final void setEnv(EnvEnum env) {
        Intrinsics.checkNotNullParameter(env, "env");
        CacheManager cacheManager = CacheManager.INSTANCE;
        String env2 = env.env;
        Intrinsics.checkNotNullExpressionValue(env2, "env");
        cacheManager.saveString("env", env2);
    }

    @JvmStatic
    public static final EnvEnum getMiniAppEnv() {
        EnvEnum parse;
        String string = CacheManager.INSTANCE.getString("mini_app_env");
        if (TextUtils.isEmpty(string) || (parse = EnvEnum.parse(string)) == null) {
            return null;
        }
        return parse;
    }

    @JvmStatic
    public static final void setMiniAppEnv(EnvEnum env) {
        if (env == null) {
            CacheManager.INSTANCE.saveString("mini_app_env", "");
            return;
        }
        CacheManager cacheManager = CacheManager.INSTANCE;
        String env2 = env.env;
        Intrinsics.checkNotNullExpressionValue(env2, "env");
        cacheManager.saveString("mini_app_env", env2);
    }
}
