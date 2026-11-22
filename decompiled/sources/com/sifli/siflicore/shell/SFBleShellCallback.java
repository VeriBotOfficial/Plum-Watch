package com.sifli.siflicore.shell;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public interface SFBleShellCallback {
    void bleShellComplete(boolean z, SFError sFError);

    void bleShellOnProgress(long j, long j2);

    void bleShellOnStatusChanged(int i);
}
