package com.bytedance.adsdk.kg.gff.kg;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class xdg implements gff {
    private final String fxn;
    private final boolean gff;
    private final List<gff> kg;

    public xdg(String str, List<gff> list, boolean z) {
        this.fxn = str;
        this.kg = list;
        this.gff = z;
    }

    public String fxn() {
        return this.fxn;
    }

    public List<gff> kg() {
        return this.kg;
    }

    public boolean gff() {
        return this.gff;
    }

    @Override // com.bytedance.adsdk.kg.gff.kg.gff
    public com.bytedance.adsdk.kg.fxn.fxn.gff fxn(com.bytedance.adsdk.kg.jq jqVar, com.bytedance.adsdk.kg.sg sgVar, com.bytedance.adsdk.kg.gff.gff.fxn fxnVar) {
        return new com.bytedance.adsdk.kg.fxn.fxn.hm(jqVar, fxnVar, this, sgVar);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.fxn + "' Shapes: " + Arrays.toString(this.kg.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
