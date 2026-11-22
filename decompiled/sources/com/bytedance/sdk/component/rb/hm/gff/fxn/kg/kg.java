package com.bytedance.sdk.component.rb.hm.gff.fxn.kg;

import com.bytedance.sdk.component.rb.je;

/* loaded from: classes13.dex */
public class kg implements je {
    private long fxn = 1048576;
    private int gff;
    private com.bytedance.sdk.component.rb.hm.gff.fxn.gff<String, byte[]> hm;
    private int kg;

    public kg(int i, int i2) {
        this.gff = i;
        this.kg = i2;
        this.hm = new com.bytedance.sdk.component.rb.hm.gff.fxn.gff<>(this.kg);
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean fxn(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.fxn) {
                    return false;
                }
                this.hm.fxn(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public byte[] fxn(String str) {
        try {
            return this.hm.fxn((com.bytedance.sdk.component.rb.hm.gff.fxn.gff<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean kg(String str) {
        return this.hm.fxn((com.bytedance.sdk.component.rb.hm.gff.fxn.gff<String, byte[]>) str) != null;
    }
}
