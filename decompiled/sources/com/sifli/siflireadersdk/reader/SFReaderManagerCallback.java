package com.sifli.siflireadersdk.reader;

import com.sifli.siflireadersdk.error.SFError;
import com.sifli.siflireadersdk.result.SFReaderResult;

/* loaded from: classes16.dex */
public interface SFReaderManagerCallback {
    void onComplete(boolean z, SFReaderResult sFReaderResult, SFError sFError);

    void onManagerStatusChanged(int i);

    void onProgress(long j, long j2);
}
