package com.baidu.mapauto.auth;

import java.util.Map;

/* loaded from: classes13.dex */
public interface ILicenseAuthListener {
    void onError(int i, String str, Exception exc);

    void onSuccess(Map<String, Integer> map);
}
