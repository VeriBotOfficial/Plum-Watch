package com.sifli.siflireadersdk.reader;

import com.sifli.siflireadersdk.error.SFError;
import com.sifli.siflireadersdk.result.SFReaderResult;

/* loaded from: classes16.dex */
public interface SFReaderShellCallback {
    void onManagerStatusChanged(int i);

    void readerShellComplete(boolean z, SFReaderResult sFReaderResult, SFError sFError);

    void readerShellOnProgress(long j, long j2);
}
