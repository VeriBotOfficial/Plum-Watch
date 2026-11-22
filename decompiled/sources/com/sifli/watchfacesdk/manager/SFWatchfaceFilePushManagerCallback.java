package com.sifli.watchfacesdk.manager;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes17.dex */
public interface SFWatchfaceFilePushManagerCallback {
    void onComplete(boolean z, SFError sFError);

    void onManagerStatusChanged(int i);

    void onProgress(long j, long j2);
}
