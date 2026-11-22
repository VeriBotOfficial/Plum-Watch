package com.sifli.siflicore.task;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public interface SFTaskCallback {
    void bleTaskOnProcess(SFTaskBase sFTaskBase, long j, long j2);

    void bleTaskOnTaskCompete(SFTaskBase sFTaskBase, boolean z, SFError sFError);
}
