package com.bytedance.sdk.component.rb.gff.fxn.kg;

import com.bytedance.sdk.component.rb.je;

/* loaded from: classes13.dex */
public class gff implements je {
    private int fxn;
    private com.bytedance.sdk.component.rb.gff.fxn.gff<String, byte[]> gff;
    private int kg;

    public gff(int i, int i2) {
        this.kg = i;
        this.fxn = i2;
        this.gff = new com.bytedance.sdk.component.rb.gff.fxn.gff<String, byte[]>(i) { // from class: com.bytedance.sdk.component.rb.gff.fxn.kg.gff.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.rb.gff.fxn.gff
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public int kg(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean fxn(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.gff.fxn(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public byte[] fxn(String str) {
        return this.gff.fxn((com.bytedance.sdk.component.rb.gff.fxn.gff<String, byte[]>) str);
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean kg(String str) {
        return this.gff.fxn((com.bytedance.sdk.component.rb.gff.fxn.gff<String, byte[]>) str) != null;
    }
}
