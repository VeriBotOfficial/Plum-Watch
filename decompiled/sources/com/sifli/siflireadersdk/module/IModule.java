package com.sifli.siflireadersdk.module;

import com.sifli.siflireadersdk.error.SFError;
import com.sifli.siflireadersdk.task.SFReaderBLETaskBase;

/* loaded from: classes16.dex */
public interface IModule {
    void clear();

    SFReaderBLETaskBase getCurrentTask();

    String getName();

    void onBleDisconnected(SFError sFError);

    void onBleFailedToConnect(SFError sFError);

    void onBleHandShake();

    void onBleSearchTimeout();

    void onNotifyData(byte[] bArr);
}
