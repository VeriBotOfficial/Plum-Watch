package com.bytedance.adsdk.kg;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public class je {
    private boolean fxn = false;
    private final Set<Object> kg = new fxn();
    private final Map<String, com.bytedance.adsdk.kg.bh.hm> gff = new HashMap();
    private final Comparator<Pair<String, Float>> hm = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.kg.je.1
        @Override // java.util.Comparator
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    void fxn(boolean z) {
        this.fxn = z;
    }

    public void fxn(String str, float f) {
        if (this.fxn) {
            com.bytedance.adsdk.kg.bh.hm hmVar = this.gff.get(str);
            if (hmVar == null) {
                hmVar = new com.bytedance.adsdk.kg.bh.hm();
                this.gff.put(str, hmVar);
            }
            hmVar.fxn(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.kg.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
