package com.sifli.siflicore.result;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public class SFResult {
    private SFError error;
    private boolean success;

    public SFResult(boolean z, SFError sFError) {
        this.success = z;
        this.error = sFError;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public SFError getError() {
        return this.error;
    }

    public void setError(SFError sFError) {
        this.error = sFError;
    }
}
