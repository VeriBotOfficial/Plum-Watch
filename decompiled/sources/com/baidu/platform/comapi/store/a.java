package com.baidu.platform.comapi.store;

import com.baidu.platform.comapi.cache.sp.AbsStoreClient;
import com.baidu.platform.comapi.cache.sp.SpStorageConfig;

/* compiled from: AbsMapConfigClient.java */
/* loaded from: classes13.dex */
class a extends AbsStoreClient {
    public a(String str) {
        super(new SpStorageConfig.Builder().setStorageName("map_config_record").setCacheModel(true).build(), str);
    }
}
