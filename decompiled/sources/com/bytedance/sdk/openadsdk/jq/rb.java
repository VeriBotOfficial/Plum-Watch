package com.bytedance.sdk.openadsdk.jq;

import com.bytedance.sdk.component.rb.jq;
import com.bytedance.sdk.component.rb.ud;

/* loaded from: classes14.dex */
public class rb implements ud {
    private static int fxn;
    private long gff;
    private boolean hm;
    private long kg = 0;
    private final String rb;

    private String gff(String str, jq jqVar) {
        return str;
    }

    public rb() {
        fxn++;
        this.rb = "image_request_" + fxn;
    }

    @Override // com.bytedance.sdk.component.rb.ud
    public void fxn(String str, jq jqVar) {
        if (!this.hm) {
            jqVar.fxn();
            jqVar.kg();
            jqVar.gff();
            this.hm = true;
        }
        this.kg = System.currentTimeMillis();
        gff(str, jqVar);
    }

    @Override // com.bytedance.sdk.component.rb.ud
    public void kg(String str, jq jqVar) {
        this.gff += System.currentTimeMillis() - this.kg;
        gff(str, jqVar);
    }
}
