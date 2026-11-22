package com.bytedance.sdk.component.kg.fxn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class rb extends rlu {
    List<String> fxn;
    List<String> kg;

    rb(List<String> list, List<String> list2) {
        this.fxn = list;
        this.kg = list2;
    }

    public static final class fxn {
        private final List<String> fxn = new ArrayList();
        private final List<String> kg = new ArrayList();

        public fxn fxn(String str, String str2) {
            this.fxn.add(str);
            this.kg.add(str2);
            return this;
        }

        public rb fxn() {
            return new rb(this.fxn, this.kg);
        }
    }
}
