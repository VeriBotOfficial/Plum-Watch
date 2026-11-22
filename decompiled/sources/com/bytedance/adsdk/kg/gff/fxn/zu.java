package com.bytedance.adsdk.kg.gff.fxn;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
abstract class zu<V, O> implements rlu<V, O> {
    final List<com.bytedance.adsdk.kg.sg.fxn<V>> fxn;

    zu(List<com.bytedance.adsdk.kg.sg.fxn<V>> list) {
        this.fxn = list;
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public List<com.bytedance.adsdk.kg.sg.fxn<V>> gff() {
        return this.fxn;
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public boolean kg() {
        return this.fxn.isEmpty() || (this.fxn.size() == 1 && this.fxn.get(0).rb());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.fxn.isEmpty()) {
            sb.append("values=").append(Arrays.toString(this.fxn.toArray()));
        }
        return sb.toString();
    }
}
