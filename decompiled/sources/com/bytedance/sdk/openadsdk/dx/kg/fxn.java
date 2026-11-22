package com.bytedance.sdk.openadsdk.dx.kg;

import android.text.TextUtils;
import com.phancy.mini.api.file.FileSystemManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn {
    private String fxn;
    private List<C0532fxn> gff;
    private List<C0532fxn> kg;

    public void fxn(String str) {
        this.fxn = str;
    }

    public void fxn(List<C0532fxn> list) {
        this.kg = list;
    }

    public void kg(List<C0532fxn> list) {
        this.gff = list;
    }

    public String fxn() {
        return this.fxn;
    }

    public List<C0532fxn> kg() {
        return this.kg;
    }

    public List<C0532fxn> gff() {
        return this.gff;
    }

    public static fxn kg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            fxn fxnVar = new fxn();
            fxnVar.fxn(jSONObject.optString("version"));
            JSONArray optJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C0532fxn fxn = C0532fxn.fxn(optJSONArray.optJSONObject(i));
                    if (fxn != null) {
                        if (fxn.gff == 1) {
                            arrayList.add(fxn);
                        } else if (fxn.gff == 2 && arrayList2.size() < 10) {
                            arrayList2.add(fxn);
                        }
                    }
                }
            }
            fxnVar.fxn(arrayList);
            fxnVar.kg(arrayList2);
            return fxnVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.dx.kg.fxn$fxn, reason: collision with other inner class name */
    public static class C0532fxn {
        private String fxn;
        private int gff;
        private String kg;

        public static C0532fxn fxn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0532fxn c0532fxn = new C0532fxn();
            c0532fxn.fxn = jSONObject.optString("url");
            c0532fxn.kg = jSONObject.optString(FileSystemManager.DIGEST_MD5);
            c0532fxn.gff = jSONObject.optInt("type");
            return c0532fxn;
        }

        public String fxn() {
            return this.fxn;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0532fxn) {
                String str2 = this.fxn;
                if (str2 != null) {
                    C0532fxn c0532fxn = (C0532fxn) obj;
                    if (str2.equals(c0532fxn.fxn) && (str = this.kg) != null && str.equals(c0532fxn.kg)) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }
    }
}
