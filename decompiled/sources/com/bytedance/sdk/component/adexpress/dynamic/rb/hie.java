package com.bytedance.sdk.component.adexpress.dynamic.rb;

import com.bytedance.sdk.component.adexpress.dynamic.rb.kg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class hie {
    public static float fxn(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<kg.fxn> fxn(float f, List<kg.fxn> list) {
        ArrayList<kg.fxn> arrayList = new ArrayList();
        Iterator<kg.fxn> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((kg.fxn) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (kg.fxn fxnVar : arrayList) {
            if (fxnVar.kg) {
                i = (int) (i + fxnVar.fxn);
            } else {
                i2 = (int) (i2 + fxnVar.fxn);
                z = false;
            }
        }
        if (!z || f <= i) {
            float f2 = i;
            float f3 = f < f2 ? f / f2 : 1.0f;
            float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
            if (f4 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (kg.fxn fxnVar2 : arrayList) {
                    if (!fxnVar2.kg && fxnVar2.gff != 0.0f && fxnVar2.fxn * f4 > fxnVar2.gff) {
                        fxnVar2.fxn = fxnVar2.gff;
                        fxnVar2.kg = true;
                        z2 = true;
                    }
                    arrayList2.add(fxnVar2);
                }
                if (z2) {
                    return fxn(f, arrayList2);
                }
            }
            int i3 = 0;
            for (kg.fxn fxnVar3 : arrayList) {
                if (fxnVar3.kg) {
                    fxnVar3.fxn = fxn(fxnVar3.fxn * f3);
                } else {
                    fxnVar3.fxn = fxn(fxnVar3.fxn * f4);
                }
                i3 = (int) (i3 + fxnVar3.fxn);
            }
            float f5 = i3;
            if (f5 < f) {
                float f6 = f - f5;
                for (int i4 = 0; i4 < arrayList.size() && f6 > 0.0f; i4 = (i4 + 1) % arrayList.size()) {
                    kg.fxn fxnVar4 = (kg.fxn) arrayList.get(i4);
                    if ((f < f2 && fxnVar4.kg) || (f > f2 && !fxnVar4.kg)) {
                        fxnVar4.fxn += 0.0625f;
                        f6 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
