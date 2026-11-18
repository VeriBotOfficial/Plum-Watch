package com.baidu.mapauto.auth;

import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface ILicenseAuthListener {
    void onError(int r1, String str, Exception exc);

    void onSuccess(Map<String, Integer> map);
}
