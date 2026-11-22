package com.bytedance.sdk.component.rb.fxn;

import com.bytedance.sdk.component.rb.jq;
import com.bytedance.sdk.component.rb.mvp;
import com.bytedance.sdk.component.utils.xdg;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public class kg {
    public static mvp fxn() {
        return new mvp() { // from class: com.bytedance.sdk.component.rb.fxn.kg.1
            private WeakHashMap<String, String> fxn = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.rb.mvp
            public String fxn(jq jqVar) {
                return fxn(jqVar.fxn() + "#width=" + jqVar.kg() + "#height=" + jqVar.gff() + "#scaletype=" + jqVar.hm() + "#bitmapConfig=" + jqVar.rb());
            }

            @Override // com.bytedance.sdk.component.rb.mvp
            public String kg(jq jqVar) {
                return fxn(jqVar.fxn());
            }

            private String fxn(String str) {
                String str2 = this.fxn.get(str);
                if (str2 != null) {
                    return str2;
                }
                String fxn = xdg.fxn(str);
                this.fxn.put(str, fxn);
                return fxn;
            }
        };
    }
}
