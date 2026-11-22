package com.bytedance.adsdk.fxn.kg;

import com.bytedance.adsdk.fxn.kg.gff.fxn.bh;
import com.bytedance.adsdk.fxn.kg.gff.fxn.gff;
import com.bytedance.adsdk.fxn.kg.gff.fxn.hie;
import com.bytedance.adsdk.fxn.kg.gff.fxn.hm;
import com.bytedance.adsdk.fxn.kg.gff.fxn.jq;
import com.bytedance.adsdk.fxn.kg.gff.fxn.kg;
import com.bytedance.adsdk.fxn.kg.gff.fxn.rb;
import com.bytedance.adsdk.fxn.kg.gff.fxn.sg;
import com.bytedance.adsdk.fxn.kg.gff.fxn.tw;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn {
    private static final com.bytedance.adsdk.fxn.kg.gff.fxn fxn;
    private com.bytedance.adsdk.fxn.kg.kg.fxn gff;
    private Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> hm = new LinkedList();
    private final com.bytedance.adsdk.fxn.kg.gff.fxn kg;
    private String rb;

    static {
        int i = 8;
        bh[] bhVarArr = {new hie(), new hm(), new jq(), new kg(), new rb(), new com.bytedance.adsdk.fxn.kg.gff.fxn.fxn(), new sg(), new gff(), new tw()};
        final com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar = new com.bytedance.adsdk.fxn.kg.gff.fxn() { // from class: com.bytedance.adsdk.fxn.kg.fxn.1
            @Override // com.bytedance.adsdk.fxn.kg.gff.fxn
            public int fxn(String str, int i2, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final bh bhVar = bhVarArr[i];
            i--;
            fxnVar = new com.bytedance.adsdk.fxn.kg.gff.fxn() { // from class: com.bytedance.adsdk.fxn.kg.fxn.2
                @Override // com.bytedance.adsdk.fxn.kg.gff.fxn
                public int fxn(String str, int i2, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque) {
                    return bh.this.fxn(str, i2, deque, fxnVar);
                }
            };
        }
        fxn = fxnVar;
    }

    private fxn(String str, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar) {
        this.kg = fxnVar;
        this.rb = str;
        try {
            fxn();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.fxn.fxn.kg(str, e);
        }
    }

    public static fxn fxn(String str) {
        return new fxn(str, fxn);
    }

    private void fxn() {
        int length = this.rb.length();
        int i = 0;
        while (i < length) {
            int fxn2 = this.kg.fxn(this.rb, i, this.hm);
            if (fxn2 == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.rb.substring(0, i));
            }
            i = fxn2;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.fxn.kg.kg.fxn pollFirst = this.hm.pollFirst();
            if (pollFirst != null) {
                arrayList.add(0, pollFirst);
            } else {
                this.gff = com.bytedance.adsdk.fxn.kg.rb.kg.fxn(arrayList, this.rb, i);
                this.hm = null;
                return;
            }
        }
    }

    public <T> T fxn(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("default_key", jSONObject);
        return (T) fxn(hashMap);
    }

    public <T> T fxn(Map<String, JSONObject> map) {
        return (T) this.gff.fxn(map);
    }
}
