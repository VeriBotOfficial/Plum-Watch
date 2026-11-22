package com.bytedance.sdk.openadsdk.core.jq.fxn;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.t;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.core.dgx.sg.gff;
import com.bytedance.sdk.openadsdk.core.ils;
import com.bytedance.sdk.openadsdk.core.jq;
import com.bytedance.sdk.openadsdk.core.model.je;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.core.model.rz;
import com.bytedance.sdk.openadsdk.core.model.ud;
import com.bytedance.sdk.openadsdk.core.mvp;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg {
    public static String fxn = "https://pag_open_icon_id/appicon.png";
    private static String kg = "";

    public static boolean gff() {
        return true;
    }

    public static String fxn() {
        return kg;
    }

    public static JSONObject fxn(float f, float f2, boolean z, jz jzVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put(t.aD, fxn(false, jzVar));
            jSONObject.put("template_Plugin", kg(jzVar.hx()));
            jSONObject.put("diff_template_Plugin", fxn(jzVar.hx()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject fxn(jz jzVar) {
        return fxn(jzVar, false, (JSONObject) null);
    }

    public static JSONObject fxn(jz jzVar, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jzVar == null) {
            return null;
        }
        try {
            jSONObject2 = fxn(jzVar, false, z);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject3 = new JSONObject();
            ils.kg(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject2.put("xAppInfo", jSONObject3);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            JSONObject kg2 = ils.kg(jzVar);
            kg2.put("language", mvp.kg());
            jSONObject2.put("xSetting", kg2);
            return jSONObject2;
        } catch (Throwable th) {
            new Object[]{"getDataInOtherScene", th.getMessage()};
            return jSONObject2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r2.length() <= r4.gff()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        r4 = r2.optJSONObject(r4.gff());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        r5 = new org.json.JSONObject(r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject fxn(com.bytedance.sdk.openadsdk.core.model.jz r4, boolean r5, boolean r6) {
        /*
            java.lang.String r0 = "creatives"
            r1 = 0
            if (r4 != 0) goto L6
            goto L62
        L6:
            java.lang.String r2 = r4.kut()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L62
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L63
            org.json.JSONArray r2 = r3.optJSONArray(r0)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L21
            if (r6 == 0) goto L1a
            goto L21
        L1a:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r4.<init>()     // Catch: java.lang.Throwable -> L63
            r1 = r4
            goto L46
        L21:
            if (r2 == 0) goto L41
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L63
            int r6 = r4.gff()     // Catch: java.lang.Throwable -> L63
            if (r5 <= r6) goto L41
            int r4 = r4.gff()     // Catch: java.lang.Throwable -> L63
            org.json.JSONObject r4 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L41
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L63
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L63
            goto L42
        L41:
            r5 = r1
        L42:
            if (r5 != 0) goto L45
            return r1
        L45:
            r1 = r5
        L46:
            if (r2 == 0) goto L59
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L63
            r5 = 1
            if (r4 <= r5) goto L59
            r4 = 0
            r2.remove(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "xRestCreatives"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L63
        L59:
            r3.remove(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "xRestResponse"
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L63
        L62:
            return r1
        L63:
            r4 = move-exception
            java.lang.String r5 = "TemplateUtils"
            java.lang.String r6 = "filterTemplateInfo"
            com.bytedance.sdk.component.utils.dx.fxn(r5, r6, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jq.fxn.kg.fxn(com.bytedance.sdk.openadsdk.core.model.jz, boolean, boolean):org.json.JSONObject");
    }

    public static JSONObject fxn(float f, float f2, boolean z, jz jzVar, String str, gff gffVar) {
        kg = "";
        JSONObject jSONObject = null;
        if (jzVar == null) {
            return null;
        }
        try {
            JSONObject fxn2 = fxn(jzVar, true, true);
            if (fxn2 == null) {
                return null;
            }
            try {
                fxn(fxn2, jzVar, str);
                JSONObject kg2 = ils.kg(jzVar);
                kg2.put("language", mvp.kg());
                fxn2.put("xSetting", kg2);
                fxn2.put("xAdInfo", fxn(str, gff(jzVar), jzVar));
                JSONObject jSONObject2 = new JSONObject();
                ils.kg(jSONObject2);
                jSONObject2.put("platform", "android");
                fxn2.put("xAppInfo", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", f);
                jSONObject3.put("height", f2);
                if (z) {
                    jSONObject3.put("isLandscape", true);
                }
                fxn2.put("xSize", jSONObject3);
                if (gffVar != null) {
                    gffVar.fxn("adv3");
                }
                rz jt = jzVar.jt();
                if (jt != null) {
                    String hm = jt.hm();
                    if (!TextUtils.isEmpty(hm)) {
                        fxn2.put("xTemplate", new JSONObject(hm));
                        kg = "getTemplate success by local data";
                        if (gffVar != null) {
                            gffVar.kg("local");
                            return fxn2;
                        }
                    } else {
                        String fxn3 = com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.fxn().fxn("adv3", jt.fxn(), jt.kg());
                        if (!TextUtils.isEmpty(fxn3)) {
                            fxn2.put("xTemplate", new JSONObject(fxn3));
                            kg = "getTemplate success by db data";
                            if (gffVar != null) {
                                gffVar.kg("local");
                                return fxn2;
                            }
                        } else {
                            String str2 = "local db data is null id is " + jt.fxn() + " md5 is " + jt.kg();
                            kg = str2;
                            if (gffVar != null) {
                                gffVar.fxn(3, str2, "net");
                            }
                        }
                    }
                }
                return fxn2;
            } catch (Exception e) {
                e = e;
                jSONObject = fxn2;
                String str3 = "load template exception " + e.getMessage();
                kg = str3;
                if (gffVar != null) {
                    gffVar.fxn(3, str3, "net");
                }
                return jSONObject;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static JSONObject kg() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", mvp.kg());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            ils.kg(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e) {
            dx.gff("TemplateUtils", e.getMessage());
            return jSONObject;
        }
    }

    private static void fxn(JSONObject jSONObject, jz jzVar, String str) {
        com.bykv.vk.openvk.fxn.fxn.fxn.gff.kg zc;
        if (jzVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (zc = jzVar.zc()) == null) {
                return;
            }
            JSONObject je = zc.je();
            if (je != null) {
                if ("open_ad".equals(str)) {
                    je.put("video_duration", rmu.hm().iwp(String.valueOf(jzVar.xs())));
                } else {
                    je.put("video_duration", zc.bh() * zc.iwp());
                }
            }
            jSONObject.put("video", je);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static JSONObject fxn(String str, JSONObject jSONObject, jz jzVar) {
        if (jzVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", jq.kg().tw());
                    int jq = jq.kg().jq();
                    if (jq != 0) {
                        int bfa = jzVar.bfa();
                        if (9 == bfa) {
                            jSONObject2.put("app_icon", fxn);
                        } else if (10 == bfa) {
                            jSONObject2.put("app_icon", Separators.AT.concat(String.valueOf(jq)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject fxn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject == null) {
                return jSONObject3;
            }
            try {
                JSONArray optJSONArray = jSONObject2.optJSONArray("keys");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (jSONObject.has(optString)) {
                            jSONObject3.put(optString, jSONObject.opt(optString));
                        }
                    }
                    jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                    jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                    jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                    jSONObject3.put("xSize", jSONObject.opt("xSize"));
                    jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                    jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                    jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                    jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                    return jSONObject3;
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    private static JSONObject gff(jz jzVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            ils.fxn(jSONObject, jzVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String fxn(jz.fxn fxnVar) {
        if (fxnVar != null) {
            return fxnVar.tw();
        }
        return "";
    }

    private static String kg(jz.fxn fxnVar) {
        com.bytedance.sdk.component.adexpress.fxn.gff.kg gff;
        if (fxnVar != null) {
            String sg2 = fxnVar.sg();
            return (!TextUtils.isEmpty(sg2) || (gff = com.bytedance.sdk.component.adexpress.fxn.kg.kg.gff(fxnVar.hm())) == null) ? sg2 : gff.rb();
        }
        return "";
    }

    public static JSONObject fxn(boolean z, jz jzVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", jzVar.rp());
            if (jzVar.ib() != null) {
                if (jzVar.ib() != null && !TextUtils.isEmpty(jzVar.ib().fxn())) {
                    jSONObject.put("icon", jzVar.ib().fxn());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (jzVar.mq() != null) {
                for (int i = 0; i < jzVar.mq().size(); i++) {
                    je jeVar = jzVar.mq().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", jeVar.gff());
                    jSONObject2.put("width", jeVar.kg());
                    jSONObject2.put("url", jeVar.fxn());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", jzVar.pfi());
            jSONObject.put("interaction_type", jzVar.lu());
            jSONObject.put("interaction_method", jzVar.ln());
            jSONObject.put("is_compliance_template", gff());
            jSONObject.put("title", jzVar.ta());
            jSONObject.put("description", jzVar.ctw());
            jSONObject.put("source", jzVar.qx());
            JSONObject jSONObject3 = new JSONObject();
            ud iwp = jzVar.iwp();
            if (iwp == null) {
                iwp = new ud();
            }
            jSONObject3.put("ceiling_time", iwp.hm());
            jSONObject3.put("ceiling_ratio", iwp.rb());
            jSONObject3.put("expand_ratio", iwp.bh());
            jSONObject.put("interaction_params", jSONObject3);
            if (jzVar.bz() != null) {
                jSONObject.put("comment_num", jzVar.bz().rb());
                jSONObject.put(FirebaseAnalytics.Param.SCORE, jzVar.bz().hm());
                jSONObject.put("app_size", jzVar.bz().bh());
                jSONObject.put("app", jzVar.bz().tw());
            }
            com.bykv.vk.openvk.fxn.fxn.fxn.gff.kg zc = jzVar.zc();
            if (zc != null) {
                JSONObject je = zc.je();
                je.put("video_duration", zc.bh() * zc.iwp());
                jSONObject.put("video", je);
            }
            if (jzVar.hx() != null) {
                jSONObject.put("dynamic_creative", jzVar.hx().jq());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String fxn(jz jzVar, String str) {
        List<je> mq;
        if (jzVar != null && (mq = jzVar.mq()) != null && mq.size() > 0) {
            for (je jeVar : mq) {
                if (jeVar != null && TextUtils.equals(str, jeVar.fxn())) {
                    return jeVar.sg();
                }
            }
        }
        return null;
    }

    public static Map<String, String> kg(jz jzVar) {
        HashMap hashMap = null;
        if (jzVar == null) {
            return null;
        }
        List<je> mq = jzVar.mq();
        if (mq != null && mq.size() > 0) {
            hashMap = new HashMap();
            for (je jeVar : mq) {
                if (jeVar != null) {
                    hashMap.put(jeVar.fxn(), jeVar.sg());
                }
            }
            je ib = jzVar.ib();
            if (ib != null) {
                hashMap.put(ib.fxn(), ib.sg());
            }
        }
        return hashMap;
    }
}
