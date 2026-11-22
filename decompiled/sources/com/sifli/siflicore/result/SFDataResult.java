package com.sifli.siflicore.result;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public class SFDataResult extends SFResult {
    private byte[] data;

    public SFDataResult(boolean z, byte[] bArr, SFError sFError) {
        super(z, sFError);
        this.data = bArr;
    }

    public byte[] getData() {
        return this.data;
    }
}
