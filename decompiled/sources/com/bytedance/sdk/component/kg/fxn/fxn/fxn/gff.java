package com.bytedance.sdk.component.kg.fxn.fxn.fxn;

import com.bytedance.sdk.component.kg.fxn.mvp;
import com.bytedance.sdk.component.kg.fxn.tw;
import com.bytedance.sdk.component.kg.fxn.zu;
import java.io.IOException;
import java.util.List;

/* loaded from: classes13.dex */
public class gff implements tw.fxn {
    List<com.bytedance.sdk.component.kg.fxn.tw> fxn;
    int gff = 0;
    mvp kg;

    gff(List<com.bytedance.sdk.component.kg.fxn.tw> list, mvp mvpVar) {
        this.fxn = list;
        this.kg = mvpVar;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.tw.fxn
    public mvp fxn() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.tw.fxn
    public zu fxn(mvp mvpVar) throws IOException {
        this.kg = mvpVar;
        int i = this.gff + 1;
        this.gff = i;
        if (i >= this.fxn.size()) {
            return null;
        }
        return this.fxn.get(this.gff).fxn(this);
    }
}
