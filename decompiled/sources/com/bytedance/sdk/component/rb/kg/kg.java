package com.bytedance.sdk.component.rb.kg;

import com.bytedance.sdk.component.rb.rb;
import com.bytedance.sdk.component.rb.zu;

/* loaded from: classes13.dex */
public class kg implements rb {
    private String fxn;
    private boolean gff;
    private zu hm;
    private boolean kg;

    public kg(String str, boolean z, boolean z2, zu zuVar) {
        this.fxn = str;
        this.kg = z;
        this.gff = z2;
        this.hm = zuVar;
    }

    @Override // com.bytedance.sdk.component.rb.rb
    public String fxn() {
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.rb.rb
    public boolean kg() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.rb.rb
    public boolean gff() {
        return this.gff;
    }
}
