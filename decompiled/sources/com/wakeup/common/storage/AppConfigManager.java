package com.wakeup.common.storage;

import com.wakeup.common.storage.model.AppConfig;

/* loaded from: classes2.dex */
public class AppConfigManager {
    private static final String CACHE_KEY = "cache_app_config";

    public static void init() {
        if (((AppConfig) CacheManager.INSTANCE.getData(CACHE_KEY, AppConfig.class)) == null) {
            CacheManager.INSTANCE.saveData(CACHE_KEY, new AppConfig(false, false));
        }
    }

    public static AppConfig getConfig() {
        if (((AppConfig) CacheManager.INSTANCE.getData(CACHE_KEY, AppConfig.class)) == null) {
            init();
        }
        return (AppConfig) CacheManager.INSTANCE.getData(CACHE_KEY, AppConfig.class);
    }

    public static void edit(AppConfig config) {
        CacheManager.INSTANCE.saveData(CACHE_KEY, config);
    }

    public static void removeConfig() {
        AppConfig config = getConfig();
        config.setAgreePrivacy(false);
        CacheManager.INSTANCE.saveData(CACHE_KEY, config);
    }
}
