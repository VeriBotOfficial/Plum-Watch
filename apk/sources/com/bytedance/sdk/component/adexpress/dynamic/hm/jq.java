package com.bytedance.sdk.component.adexpress.dynamic.hm;

import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class jq {
    public float fxn;
    public float kg;

    public jq(float f, float f2) {
        this.fxn = f;
        this.kg = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jq jqVar = (jq) obj;
            if (Float.compare(jqVar.fxn, this.fxn) == 0 && Float.compare(jqVar.kg, this.kg) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.fxn), Float.valueOf(this.kg)});
    }
}
