package com.bytedance.sdk.component.tw;

/* loaded from: classes13.dex */
public class rb {
    private static hie fxn = new hie() { // from class: com.bytedance.sdk.component.tw.rb.1
        @Override // com.bytedance.sdk.component.tw.hie
        public jq createThreadFactory(int i, String str) {
            return new jq(i, str);
        }
    };

    public static void fxn(hie hieVar) {
        fxn = hieVar;
    }

    public static hie fxn() {
        return fxn;
    }
}
