package com.bytedance.sdk.openadsdk.hm.fxn;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class zu {
    public static zu fxn = new zu();
    private final Map<String, fxn> gff = new HashMap();
    private volatile boolean hm;
    private fxn kg;

    private int kg() {
        fxn fxnVar = this.kg;
        if (fxnVar != null) {
            return fxnVar.fxn();
        }
        return 3;
    }

    private int gff() {
        fxn fxnVar = this.kg;
        if (fxnVar != null) {
            return fxnVar.kg();
        }
        return 30;
    }

    public void fxn(fxn fxnVar) {
        this.kg = fxnVar;
    }

    public void fxn(String str, fxn fxnVar) {
        if (TextUtils.isEmpty(str) || fxnVar == null) {
            return;
        }
        this.gff.put(str, fxnVar);
    }

    public int fxn(String str) {
        if (!fxn()) {
            return 4;
        }
        fxn fxnVar = this.gff.get(str);
        if (fxnVar == null) {
            return kg();
        }
        return fxnVar.fxn();
    }

    public int kg(String str) {
        fxn fxnVar = this.gff.get(str);
        if (fxnVar == null) {
            return gff();
        }
        return fxnVar.kg();
    }

    public boolean fxn() {
        return this.hm;
    }

    public void fxn(boolean z) {
        this.hm = z;
    }

    public static class fxn {
        private final int fxn;
        private final int kg;

        public fxn(int i, int i2) {
            this.fxn = (i < 0 || i > 5) ? 3 : i;
            this.kg = i2 < 10 ? 30 : i2;
        }

        public int fxn() {
            return this.fxn;
        }

        public int kg() {
            return this.kg;
        }
    }
}
