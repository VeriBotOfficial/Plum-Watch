package com.sifli.siflireadersdk.task;

import com.sifli.siflireadersdk.error.SFError;

/* loaded from: classes17.dex */
public interface SFReaderBLETaskCallback {
    void bleTaskOnProcess(SFReaderBLETaskBase sFReaderBLETaskBase, long j, long j2);

    void bleTaskOnTaskCompete(SFReaderBLETaskBase sFReaderBLETaskBase, boolean z, SFError sFError);
}
