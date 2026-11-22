package com.sifli.watchfacesdk.manager;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes17.dex */
public interface SFPreviewVideoManagerCallback {
    void completeWithError(SFPreviewVideoManager sFPreviewVideoManager, SFError sFError);

    void onFps(SFPreviewVideoManager sFPreviewVideoManager, float f);

    void onImageMake(byte[] bArr);

    void updateManagerState(SFPreviewVideoManager sFPreviewVideoManager, int i);
}
