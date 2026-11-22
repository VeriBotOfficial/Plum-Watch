package com.baidu.platform.comapi.license;

import java.util.Map;

/* loaded from: classes13.dex */
public interface ILicenseAuthManagerListener {
    void onError(String str, String str2, int i, int i2, String str3);

    void onSuccess(String str, String str2, int i, Map<String, Integer> map);
}
