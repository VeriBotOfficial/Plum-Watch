package com.bytedance.adsdk.kg.gff.kg;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class jq implements gff {
    private final String fxn;
    private final boolean gff;
    private final fxn kg;

    public enum fxn {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static fxn fxn(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public jq(String str, fxn fxnVar, boolean z) {
        this.fxn = str;
        this.kg = fxnVar;
        this.gff = z;
    }

    public String fxn() {
        return this.fxn;
    }

    public fxn kg() {
        return this.kg;
    }

    public boolean gff() {
        return this.gff;
    }

    @Override // com.bytedance.adsdk.kg.gff.kg.gff
    public com.bytedance.adsdk.kg.fxn.fxn.gff fxn(com.bytedance.adsdk.kg.jq jqVar, com.bytedance.adsdk.kg.sg sgVar, com.bytedance.adsdk.kg.gff.gff.fxn fxnVar) {
        return new com.bytedance.adsdk.kg.fxn.fxn.mvp(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.kg + AbstractJsonLexerKt.END_OBJ;
    }
}
