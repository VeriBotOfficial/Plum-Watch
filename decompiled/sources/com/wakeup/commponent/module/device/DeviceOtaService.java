package com.wakeup.commponent.module.device;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.base.BaseCallback;
import kotlin.Pair;

/* loaded from: classes2.dex */
public interface DeviceOtaService extends IProvider {
    void clearListener();

    boolean isInstalling();

    void setInstalling(boolean z);

    void startCustomFtp(String str, String str2, BaseCallback<Pair<Integer, String>> baseCallback);

    void startFOta(String str, BaseCallback<Pair<Integer, String>> baseCallback);

    void startNetFfp(String str, String str2, String str3, String str4, BaseCallback<Pair<Integer, String>> baseCallback);

    void startNordic(String str, String str2, String str3, BaseCallback<Pair<Integer, String>> baseCallback);

    void startSiChe(Context context, String str, String str2, BaseCallback<Pair<Integer, String>> baseCallback);
}
