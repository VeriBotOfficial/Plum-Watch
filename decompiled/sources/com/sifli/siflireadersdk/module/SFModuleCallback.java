package com.sifli.siflireadersdk.module;

import com.sifli.siflireadersdk.error.SFError;

/* loaded from: classes16.dex */
public interface SFModuleCallback {
    void sfModuleCompletion(IModule iModule, boolean z, SFError sFError);

    void sfModuleDisconnectRequest(IModule iModule);

    void sfModuleFileProgress(IModule iModule, long j, long j2);

    boolean sfModuleIsHandShake();

    void sfModuleReconnectRequest(IModule iModule);

    void sfModuleSendDataRequest(IModule iModule, byte[] bArr);
}
