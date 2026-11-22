package com.sifli.siflicore.result;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public class SFIntResult extends SFResult {
    private int data;

    public SFIntResult(boolean z, int i, SFError sFError) {
        super(z, sFError);
        this.data = i;
    }

    public int getData() {
        return this.data;
    }
}
