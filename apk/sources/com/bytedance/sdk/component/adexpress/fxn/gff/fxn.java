package com.bytedance.sdk.component.adexpress.fxn.gff;

import android.text.TextUtils;
import android.util.Pair;
import com.phancy.mini.api.file.FileSystemManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.style.IStyle;

/* JADX INFO: loaded from: classes15.dex */
public class fxn {
    private String bh;
    private String fxn;
    private String gff;
    private List<C0561fxn> hm;
    private String kg;
    private kg rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private Map<String, fxn> f9338sg = new ConcurrentHashMap();

    public Map<String, fxn> fxn() {
        return this.f9338sg;
    }

    public String kg() {
        return this.fxn;
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public String gff() {
        return this.kg;
    }

    public void kg(String str) {
        this.kg = str;
    }

    public String hm() {
        return this.gff;
    }

    public void gff(String str) {
        this.gff = str;
    }

    public void fxn(kg kgVar) {
        this.rb = kgVar;
    }

    public kg rb() {
        return this.rb;
    }

    public List<C0561fxn> bh() {
        if (this.hm == null) {
            this.hm = new ArrayList();
        }
        return this.hm;
    }

    public void fxn(List<C0561fxn> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.hm = list;
    }

    public void hm(String str) {
        this.bh = str;
    }

    public String sg() {
        return this.bh;
    }

    public boolean tw() {
        return (TextUtils.isEmpty(hm()) || TextUtils.isEmpty(gff()) || TextUtils.isEmpty(kg())) ? false : true;
    }

    public JSONObject jq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", kg());
            jSONObject.putOpt("version", gff());
            jSONObject.putOpt("main", hm());
            if (!TextUtils.isEmpty(this.bh)) {
                jSONObject.put("template_fetch_url", this.bh);
            }
            JSONArray jSONArray = new JSONArray();
            if (bh() != null) {
                for (C0561fxn c0561fxn : bh()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0561fxn.fxn());
                    jSONObject2.putOpt(FileSystemManager.DIGEST_MD5, c0561fxn.kg());
                    jSONObject2.putOpt("level", Integer.valueOf(c0561fxn.gff()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.f9338sg.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.f9338sg.keySet()) {
                    fxn fxnVar = this.f9338sg.get(str);
                    if (fxnVar != null) {
                        jSONObject3.put(str, fxnVar.jq());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            kg kgVarRb = rb();
            if (kgVarRb != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", kgVarRb.fxn);
                jSONObject4.put(FileSystemManager.DIGEST_MD5, kgVarRb.kg);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listKg = kgVarRb.kg();
                if (listKg != null) {
                    for (Pair<String, String> pair : listKg) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put(IStyle.MAP, jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String hie() {
        JSONObject jSONObjectJq;
        if (!tw() || (jSONObjectJq = jq()) == null) {
            return null;
        }
        return jSONObjectJq.toString();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.fxn.gff.fxn$fxn, reason: collision with other inner class name */
    public static class C0561fxn {
        private String fxn;
        private int gff;
        private String kg;

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0561fxn) {
                String str2 = this.fxn;
                if (str2 != null) {
                    C0561fxn c0561fxn = (C0561fxn) obj;
                    if (str2.equals(c0561fxn.fxn()) && (str = this.kg) != null && str.equals(c0561fxn.kg())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public String fxn() {
            return this.fxn;
        }

        public void fxn(String str) {
            this.fxn = str;
        }

        public String kg() {
            return this.kg;
        }

        public void kg(String str) {
            this.kg = str;
        }

        public int gff() {
            return this.gff;
        }

        public void fxn(int r1) {
            this.gff = r1;
        }
    }

    public static class kg {
        private String fxn;
        private List<Pair<String, String>> gff;
        private String kg;

        public String fxn() {
            return this.fxn;
        }

        public void fxn(String str) {
            this.fxn = str;
        }

        public void kg(String str) {
            this.kg = str;
        }

        public void fxn(List<Pair<String, String>> list) {
            this.gff = list;
        }

        public List<Pair<String, String>> kg() {
            return this.gff;
        }
    }

    public static fxn rb(String str) {
        if (str == null) {
            return null;
        }
        try {
            return fxn(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static fxn fxn(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        fxn fxnVar = new fxn();
        fxnVar.fxn(jSONObject.optString("name"));
        fxnVar.kg(jSONObject.optString("version"));
        fxnVar.gff(jSONObject.optString("main"));
        fxnVar.hm(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int r6 = 0; r6 < jSONArrayOptJSONArray.length(); r6++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(r6);
                C0561fxn c0561fxn = new C0561fxn();
                c0561fxn.fxn(jSONObjectOptJSONObject2.optString("url"));
                c0561fxn.kg(jSONObjectOptJSONObject2.optString(FileSystemManager.DIGEST_MD5));
                c0561fxn.fxn(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0561fxn);
            }
        }
        fxnVar.fxn(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    fxn fxnVarFxn = fxn(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (fxnVarFxn != null) {
                        fxnVar.fxn().put(next, fxnVarFxn);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            kg kgVar = new kg();
            kgVar.fxn(jSONObjectOptJSONObject.optString("url"));
            kgVar.kg(jSONObjectOptJSONObject.optString(FileSystemManager.DIGEST_MD5));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject(IStyle.MAP);
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                kgVar.fxn(arrayList2);
            }
            fxnVar.fxn(kgVar);
        }
        if (fxnVar.tw()) {
            return fxnVar;
        }
        return null;
    }
}
