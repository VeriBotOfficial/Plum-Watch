package com.bytedance.sdk.component.rb.gff.fxn.kg;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.rb.rmu;

/* loaded from: classes13.dex */
public class hm implements rmu {
    private final rmu fxn;
    private final com.bytedance.sdk.component.rb.gff.fxn.kg kg;

    public hm(rmu rmuVar) {
        this(rmuVar, null);
    }

    public hm(rmu rmuVar, com.bytedance.sdk.component.rb.gff.fxn.kg kgVar) {
        this.fxn = rmuVar;
        this.kg = kgVar;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean fxn(String str, Bitmap bitmap) {
        boolean fxn = this.fxn.fxn(str, bitmap);
        if (this.kg != null) {
            Boolean.valueOf(fxn);
        }
        return fxn;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public Bitmap fxn(String str) {
        return this.fxn.fxn(str);
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean kg(String str) {
        return this.fxn.kg(str);
    }
}
