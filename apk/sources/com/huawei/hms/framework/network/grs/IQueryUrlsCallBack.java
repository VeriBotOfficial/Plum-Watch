package com.huawei.hms.framework.network.grs;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface IQueryUrlsCallBack {
    void onCallBackFail(int r1);

    void onCallBackSuccess(Map<String, String> map);
}
