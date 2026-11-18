package com.baidu.platform.comapi.license;

import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface ILicenseAuthManagerListener {
    void onError(String str, String str2, int r3, int r4, String str3);

    void onSuccess(String str, String str2, int r3, Map<String, Integer> map);
}
