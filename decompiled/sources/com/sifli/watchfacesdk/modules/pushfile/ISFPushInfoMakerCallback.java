package com.sifli.watchfacesdk.modules.pushfile;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes17.dex */
public interface ISFPushInfoMakerCallback {
    void onMakePushInfoFail(SFError sFError);

    void onMakePushInfoSuccess(SFPushInfos sFPushInfos);
}
