package com.bytedance.sdk.component.adexpress.dynamic.rb;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.kg.rlu;
import com.facebook.react.uimanager.ViewProps;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class kg {
    private int bh;
    private rlu jq;
    private double rb;

    /* renamed from: sg, reason: collision with root package name */
    private double f9337sg;
    private String tw;
    public Map<String, gff> fxn = new HashMap();
    public Map<String, gff> kg = new HashMap();
    public Map<String, gff> gff = new HashMap();
    private double hm = Math.random();

    public kg(double d, int i, double d2, String str, rlu rluVar) {
        this.rb = d;
        this.bh = i;
        this.f9337sg = d2;
        this.tw = str;
        this.jq = rluVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.adexpress.dynamic.rb.kg.gff fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.tw r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.hm.rb r0 = r13.hie()
            java.lang.String r0 = r0.gff()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.hm.rb r0 = r13.hie()
            com.bytedance.sdk.component.adexpress.dynamic.hm.bh r0 = r0.rb()
            java.lang.String r0 = r0.vts()
            if (r0 != 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff r13 = new com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff
            r13.<init>(r1, r1)
            return r13
        L23:
            com.bytedance.sdk.component.adexpress.dynamic.hm.rb r0 = r13.hie()
            java.lang.String r0 = r0.kg()
            java.lang.String r2 = "creative-playable-bait"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L39
            com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff r13 = new com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff
            r13.<init>(r1, r1)
            return r13
        L39:
            float r0 = r13.tw()
            float r1 = r13.jq()
            com.bytedance.sdk.component.adexpress.dynamic.hm.rb r2 = r13.hie()
            com.bytedance.sdk.component.adexpress.dynamic.hm.bh r2 = r2.rb()
            java.lang.String r3 = r2.zn()
            java.lang.String r2 = r2.mve()
            int r4 = r13.rlu()
            float r4 = (float) r4
            int r5 = r13.zu()
            float r5 = (float) r5
            float r6 = r13.ckl()
            float r7 = r13.xdg()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L86
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff r13 = r12.kg(r13, r0, r1)
            float r13 = r13.kg
        L83:
            float r1 = r13 + r7
            goto Lb7
        L86:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L9f
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff r13 = r12.kg(r13, r14, r0)
            float r14 = r13.fxn
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r13 = r13.kg
            goto L83
        L9f:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto Lb6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff r13 = r12.kg(r13, r0, r1)
            float r13 = r13.kg
            goto L83
        Lb6:
            r14 = r0
        Lb7:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto Ld9
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto Ld7
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto Led
        Ld7:
            r15 = r13
            goto Led
        Ld9:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto Le5
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto Led
        Le5:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto Lec
            goto Led
        Lec:
            r15 = r1
        Led:
            com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff r13 = new com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff
            r13.<init>()
            r13.fxn = r14
            r13.kg = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.rb.kg.fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.tw, float, float):com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff");
    }

    public gff kg(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar, float f, float f2) {
        gff gffVar = new gff();
        if (twVar.hie().rb() == null) {
            return gffVar;
        }
        gff rb = rb(twVar, f, f2);
        float f3 = rb.fxn;
        float f4 = rb.kg;
        gffVar.fxn = Math.min(f3, f);
        gffVar.kg = Math.min(f4, f2);
        return gffVar;
    }

    private gff rb(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar, float f, float f2) {
        String str = twVar.gff() + "_" + f + "_" + f2;
        if (this.gff.containsKey(str)) {
            return this.gff.get(str);
        }
        gff bh = bh(twVar, f, f2);
        this.gff.put(str, bh);
        return bh;
    }

    private gff bh(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar, float f, float f2) {
        new gff();
        com.bytedance.sdk.component.adexpress.dynamic.hm.bh rb = twVar.hie().rb();
        twVar.hie().gff();
        rb.fqt();
        float je = rb.je();
        int kwc = rb.kwc();
        double fsb = rb.fsb();
        int fe = rb.fe();
        boolean kee = rb.kee();
        boolean ln = rb.ln();
        int ps = rb.ps();
        C0473kg c0473kg = new C0473kg();
        c0473kg.fxn = je;
        c0473kg.kg = kwc;
        c0473kg.gff = fe;
        c0473kg.hm = fsb;
        c0473kg.rb = f;
        return fxn(twVar.hie().gff(), c0473kg, kee, ln, ps, twVar);
    }

    private gff fxn(String str, C0473kg c0473kg, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        return dgx.fxn(str, twVar.hie().kg(), C0473kg.fxn(c0473kg).toString(), z, z2, i, twVar, this.rb, this.bh, this.f9337sg, this.tw, this.jq);
    }

    public gff gff(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar, float f, float f2) {
        if (twVar == null) {
            return null;
        }
        gff fxn2 = fxn(twVar);
        if (fxn2 != null && (fxn2.fxn != 0.0f || fxn2.kg != 0.0f)) {
            return fxn2;
        }
        gff hm = hm(twVar, f, f2);
        fxn(twVar, hm);
        return hm;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.adexpress.dynamic.rb.kg.gff hm(com.bytedance.sdk.component.adexpress.dynamic.hm.tw r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.rb.kg.hm(com.bytedance.sdk.component.adexpress.dynamic.hm.tw, float, float):com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff");
    }

    private void fxn(List<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (fxn(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list2 : list) {
            fxn fxnVar = new fxn();
            boolean fxn2 = fxn(list2, !z);
            fxnVar.fxn = fxn2 ? 1.0f : kg(list2, f, f2).kg;
            fxnVar.kg = !fxn2;
            arrayList.add(fxnVar);
        }
        List<fxn> fxn3 = hie.fxn(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((fxn) arrayList.get(i)).fxn != fxn3.get(i).fxn) {
                List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list3 = list.get(i);
                gff(list3);
                kg(list3, f, fxn3.get(i).fxn);
            }
        }
    }

    private boolean kg(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> rmu;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().hie().rb().zn(), ViewProps.FLEX)) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar : list) {
                if (TextUtils.equals(twVar.hie().rb().zn(), "auto") && (rmu = twVar.rmu()) != null) {
                    int i = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list2 : rmu) {
                        i++;
                        if (!kg(list2)) {
                            break;
                        }
                        if (i == list2.size()) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
    }

    private gff kg(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list, float f, float f2) {
        gff fxn2 = fxn(list);
        if (fxn2 != null && (fxn2.fxn != 0.0f || fxn2.kg != 0.0f)) {
            return fxn2;
        }
        gff gff2 = gff(list, f, f2);
        fxn(list, gff2);
        return gff2;
    }

    private gff gff(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list, float f, float f2) {
        float f3;
        hm(list);
        gff gffVar = new gff();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.hm.bh rb = twVar.hie().rb();
            if (rb.kwn() == 1 || rb.kwn() == 2) {
                arrayList.add(twVar);
            }
            if (rb.kwn() != 1 && rb.kwn() != 2) {
                arrayList2.add(twVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gff((com.bytedance.sdk.component.adexpress.dynamic.hm.tw) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return gffVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(gff(it2.next(), f, f2).fxn));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar2 = arrayList2.get(i);
            String zn = twVar2.hie().rb().zn();
            float tw = twVar2.tw();
            boolean equals = TextUtils.equals(zn, ViewProps.FLEX);
            if (TextUtils.equals(zn, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> rmu = twVar2.rmu();
                if (rmu != null && rmu.size() > 0) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> it3 = rmu.iterator();
                    while (it3.hasNext()) {
                        if (kg(it3.next())) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            fxn fxnVar = new fxn();
            if (!equals) {
                tw = ((Float) arrayList3.get(i)).floatValue();
            }
            fxnVar.fxn = tw;
            fxnVar.kg = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            fxnVar.gff = f3;
            arrayList4.add(fxnVar);
            i++;
        }
        fxn(arrayList4, f, arrayList2);
        List<fxn> fxn2 = hie.fxn(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += fxn2.get(i2).fxn;
            if (((Float) arrayList3.get(i2)).floatValue() != fxn2.get(i2).fxn) {
                hm(arrayList2.get(i2));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i3++;
            if (!kg(it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        f3 = z ? f2 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar3 = arrayList2.get(i4);
            gff gff2 = gff(twVar3, fxn2.get(i4).fxn, f2);
            if (!kg(twVar3)) {
                f3 = Math.max(f3, gff2.kg);
            }
            arrayList5.add(gff2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((gff) it5.next()).kg));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar4 = arrayList2.get(i5);
                if (kg(twVar4) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    hm(twVar4);
                    gff(twVar4, fxn2.get(i5).fxn, f3);
                }
            }
        }
        gffVar.fxn = f4;
        gffVar.kg = f3;
        return gffVar;
    }

    private boolean kg(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        if (twVar == null) {
            return false;
        }
        if (TextUtils.equals(twVar.hie().rb().mve(), ViewProps.FLEX)) {
            return true;
        }
        return gff(twVar);
    }

    private boolean gff(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> rmu;
        if (!twVar.je() && TextUtils.equals(twVar.hie().rb().mve(), "auto") && (rmu = twVar.rmu()) != null && rmu.size() > 0) {
            if (rmu.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> it = rmu.get(0).iterator();
                while (it.hasNext()) {
                    if (!kg(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> it2 = rmu.iterator();
            while (it2.hasNext()) {
                if (fxn(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean fxn(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list, boolean z) {
        for (com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.hm.bh rb = twVar.hie().rb();
            String mve = rb.mve();
            if (TextUtils.equals(mve, ViewProps.FLEX) || (z && ((TextUtils.equals(rb.zn(), ViewProps.FLEX) && TextUtils.equals(rb.mve(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.hm.rb.fxn.get(twVar.hie().kg()).intValue() == 7) || TextUtils.equals(mve, ViewProps.FLEX)))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> it = list.iterator();
        while (it.hasNext()) {
            if (gff(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void fxn(List<fxn> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list2) {
        float f2 = 0.0f;
        for (fxn fxnVar : list) {
            if (fxnVar.kg) {
                f2 += fxnVar.fxn;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).kg && list2.get(i2).iwp()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    fxn fxnVar2 = list.get(i3);
                    if (fxnVar2.kg && list2.get(i3).iwp()) {
                        fxnVar2.fxn -= ceil;
                    }
                }
            }
        }
    }

    public void fxn() {
        this.gff.clear();
        this.fxn.clear();
        this.kg.clear();
    }

    public gff fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        return this.fxn.get(rb(twVar));
    }

    public gff fxn(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list) {
        return this.kg.get(hm(list));
    }

    private void hm(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        this.fxn.remove(rb(twVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> rmu = twVar.rmu();
        if (rmu == null || rmu.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>> it = rmu.iterator();
        while (it.hasNext()) {
            gff(it.next());
        }
    }

    private void gff(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.kg.remove(hm(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> it = list.iterator();
        while (it.hasNext()) {
            hm(it.next());
        }
    }

    private String rb(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        return twVar.gff();
    }

    private String hm(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String gff2 = list.get(i).gff();
            if (i < list.size() - 1) {
                sb.append(gff2).append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            } else {
                sb.append(gff2);
            }
        }
        return sb.toString();
    }

    private void fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar, gff gffVar) {
        this.fxn.put(rb(twVar), gffVar);
    }

    private void fxn(List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> list, gff gffVar) {
        this.kg.put(hm(list), gffVar);
    }

    static class gff {
        float fxn;
        float kg;

        public gff() {
        }

        public gff(float f, float f2) {
            this.fxn = f;
            this.kg = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.fxn + ", height=" + this.kg + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.rb.kg$kg, reason: collision with other inner class name */
    static class C0473kg {
        float fxn;
        int gff;
        double hm;
        int kg;
        float rb;

        C0473kg() {
        }

        static JSONObject fxn(C0473kg c0473kg) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0473kg.fxn);
                jSONObject.put(ViewProps.LETTER_SPACING, c0473kg.kg);
                jSONObject.put(ViewProps.LINE_HEIGHT, c0473kg.hm);
                jSONObject.put(ViewProps.MAX_WIDTH, c0473kg.rb);
                jSONObject.put("fontWeight", c0473kg.gff);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    static class fxn implements Cloneable {
        float fxn;
        float gff;
        boolean kg;

        fxn() {
        }

        public Object clone() {
            try {
                return (fxn) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }
}
