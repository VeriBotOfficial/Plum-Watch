package com.sifli.siflicore.module;

import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.task.SFTaskBase;

/* loaded from: classes14.dex */
public interface IModule {
    void clear();

    SFTaskBase getCurrentTask();

    String getName();

    void onBleDisconnected(SFError sFError);

    void onBleFailedToConnect(SFError sFError);

    void onBleHandShake();

    void onBleSearchTimeout();

    void onBleWriteDone();

    void onNotifyData(byte[] bArr);
}
