package com.bytedance.sdk.openadsdk.core.dgx.fxn;

import android.text.TextUtils;
import com.bytedance.sdk.component.tw.tw;
import com.bytedance.sdk.openadsdk.core.jq;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.utils.yws;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg {
    private static volatile kg fxn;

    public interface fxn {
        void fxn(int i, String str, String str2);

        void fxn(JSONObject jSONObject, String str);
    }

    public static kg fxn() {
        if (fxn == null) {
            synchronized (kg.class) {
                if (fxn == null) {
                    fxn = new kg();
                }
            }
        }
        return fxn;
    }

    public void fxn(com.bytedance.sdk.openadsdk.core.dgx.tw.fxn fxnVar, String str) {
        if (fxnVar == null || TextUtils.isEmpty(fxnVar.fxn())) {
            return;
        }
        final String str2 = str + "_" + fxnVar.fxn();
        final String gff = fxnVar.gff();
        final String kg = fxnVar.kg();
        final String hm = fxnVar.hm();
        String rb = fxnVar.rb();
        if (TextUtils.isEmpty(rb)) {
            if (str.equals("ad")) {
                rb = jq.kg().hm();
            } else if (str.equals("adv3")) {
                rb = jq.kg().hm() + "_v3";
            }
        }
        final String str3 = rb;
        yws.fxn(new tw("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.1
            @Override // java.lang.Runnable
            public void run() {
                kg.this.fxn(str2, gff, kg, hm, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(String str, String str2, String str3, String str4, String str5) {
        if (fxn(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            kg(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            fxn(str2, str, str3, str5, (fxn) null);
        } else {
            kg(str2, str3, str5, str4, str);
        }
    }

    public void fxn(String str, String str2, String str3, String str4, String str5, final fxn fxnVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (fxnVar != null) {
                fxnVar.fxn(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn fxn2 = fxn(str6, str4);
        if (fxn2 == null || TextUtils.isEmpty(fxn2.rb())) {
            fxn(str2, str6, str4, str5, new fxn() { // from class: com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.2
                @Override // com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.fxn
                public void fxn(JSONObject jSONObject, String str7) {
                    fxn fxnVar2 = fxnVar;
                    if (fxnVar2 != null) {
                        fxnVar2.fxn(jSONObject, str7);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.fxn
                public void fxn(int i, String str7, String str8) {
                    fxn fxnVar2 = fxnVar;
                    if (fxnVar2 != null) {
                        fxnVar2.fxn(i, str7, str8);
                    }
                }
            });
            return;
        }
        fxn(fxn2);
        if (fxnVar != null) {
            try {
                fxnVar.fxn(new JSONObject(fxn2.rb()), "local");
            } catch (JSONException unused) {
                fxnVar.fxn(2, "parse json exception data is " + fxn2.rb(), "local");
            }
        }
    }

    private void fxn(final String str, final String str2, final String str3, final String str4, final fxn fxnVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (fxnVar != null) {
                fxnVar.fxn(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.sg.kg.kg gff = com.bytedance.sdk.openadsdk.je.kg.kg().gff().gff();
            gff.kg(str);
            gff.fxn(7);
            gff.fxn("load_ug_t");
            gff.fxn(new com.bytedance.sdk.component.sg.fxn.fxn() { // from class: com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.3
                @Override // com.bytedance.sdk.component.sg.fxn.fxn
                public void fxn(com.bytedance.sdk.component.sg.kg.gff gffVar, com.bytedance.sdk.component.sg.kg kgVar) {
                    if (kgVar == null) {
                        return;
                    }
                    if (kgVar.bh()) {
                        String hm = kgVar.hm();
                        if (TextUtils.isEmpty(hm)) {
                            fxn fxnVar2 = fxnVar;
                            if (fxnVar2 != null) {
                                fxnVar2.fxn(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        gff.fxn().fxn(new com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn().fxn(str2).kg(str3).gff(str).rb(str4).hm(hm).fxn(Long.valueOf(System.currentTimeMillis())));
                        kg.this.kg();
                        if (fxnVar != null) {
                            try {
                                fxnVar.fxn(new JSONObject(hm), "net");
                                return;
                            } catch (JSONException unused) {
                                fxnVar.fxn(2, "parse json exception data is".concat(String.valueOf(hm)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    fxn fxnVar3 = fxnVar;
                    if (fxnVar3 != null) {
                        fxnVar3.fxn(3, "net code error code is " + kgVar.fxn() + " message is " + kgVar.kg(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.sg.fxn.fxn
                public void fxn(com.bytedance.sdk.component.sg.kg.gff gffVar, IOException iOException) {
                    fxn fxnVar2 = fxnVar;
                    if (fxnVar2 != null) {
                        fxnVar2.fxn(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn> fxn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return gff.fxn().fxn(str);
    }

    public String fxn(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn fxn2 = fxn(str + "_" + str2, str3);
        if (fxn2 == null) {
            return null;
        }
        fxn(fxn2);
        return fxn2.rb();
    }

    private com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn fxn(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return gff.fxn().fxn(str, str2);
    }

    private void kg(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn fxnVar = new com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn();
        fxnVar.gff(str).rb(str3).hm(str4).kg(str2).fxn(str5).fxn(Long.valueOf(System.currentTimeMillis()));
        gff.fxn().fxn(fxnVar);
        kg();
    }

    private void fxn(final com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn fxnVar) {
        fxnVar.fxn(Long.valueOf(System.currentTimeMillis()));
        yws.fxn(new tw("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.4
            @Override // java.lang.Runnable
            public void run() {
                gff.fxn().fxn(fxnVar);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg() {
        int hm = rmu.hm().hm();
        if (hm <= 0) {
            hm = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn> kg = gff.fxn().kg();
        if (kg == null || kg.isEmpty() || hm >= kg.size()) {
            if (kg == null) {
                return;
            }
            kg.size();
            return;
        }
        int size = (int) (kg.size() - (hm * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn fxnVar : kg) {
            treeMap.put(fxnVar.hm(), fxnVar);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn fxnVar2 = (com.bytedance.sdk.openadsdk.core.dgx.fxn.fxn) entry.getValue();
                if (fxnVar2 != null) {
                    hashSet.add(fxnVar2.fxn());
                }
            }
        }
        fxn(hashSet);
    }

    public void fxn(Set<String> set) {
        try {
            gff.fxn().fxn(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
