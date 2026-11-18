package com.baidu.ar.auth;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface IAuthenticateCallback {
    void onAvailFeaturesChanged(List<Integer> list);

    void onFeatureRejected(int r1);

    void onResult(boolean z, List<Integer> list);
}
