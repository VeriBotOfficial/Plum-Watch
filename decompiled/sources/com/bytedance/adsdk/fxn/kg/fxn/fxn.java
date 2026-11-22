package com.bytedance.adsdk.fxn.kg.fxn;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class fxn {
    private String fxn;
    private Object[] kg;

    public String fxn() {
        return this.fxn;
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public Object[] kg() {
        return this.kg;
    }

    public void fxn(Object[] objArr) {
        this.kg = objArr;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.fxn + "', args=" + Arrays.toString(this.kg) + AbstractJsonLexerKt.END_OBJ;
    }
}
