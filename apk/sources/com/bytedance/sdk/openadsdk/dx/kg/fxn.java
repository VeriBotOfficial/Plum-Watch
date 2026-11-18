package com.bytedance.sdk.openadsdk.dx.kg;

import android.text.TextUtils;
import com.phancy.mini.api.file.FileSystemManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class fxn {
    private String fxn;
    private List<C0619fxn> gff;
    private List<C0619fxn> kg;

    public void fxn(String str) {
        this.fxn = str;
    }

    public void fxn(List<C0619fxn> list) {
        this.kg = list;
    }

    public void kg(List<C0619fxn> list) {
        this.gff = list;
    }

    public String fxn() {
        return this.fxn;
    }

    public List<C0619fxn> kg() {
        return this.kg;
    }

    public List<C0619fxn> gff() {
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
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int r4 = 0; r4 < jSONArrayOptJSONArray.length(); r4++) {
                    C0619fxn c0619fxnFxn = C0619fxn.fxn(jSONArrayOptJSONArray.optJSONObject(r4));
                    if (c0619fxnFxn != null) {
                        if (c0619fxnFxn.gff == 1) {
                            arrayList.add(c0619fxnFxn);
                        } else if (c0619fxnFxn.gff == 2 && arrayList2.size() < 10) {
                            arrayList2.add(c0619fxnFxn);
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

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.dx.kg.fxn$fxn, reason: collision with other inner class name */
    public static class C0619fxn {
        private String fxn;
        private int gff;
        private String kg;

        public static C0619fxn fxn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0619fxn c0619fxn = new C0619fxn();
            c0619fxn.fxn = jSONObject.optString("url");
            c0619fxn.kg = jSONObject.optString(FileSystemManager.DIGEST_MD5);
            c0619fxn.gff = jSONObject.optInt("type");
            return c0619fxn;
        }

        public String fxn() {
            return this.fxn;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0619fxn) {
                String str2 = this.fxn;
                if (str2 != null) {
                    C0619fxn c0619fxn = (C0619fxn) obj;
                    if (str2.equals(c0619fxn.fxn) && (str = this.kg) != null && str.equals(c0619fxn.kg)) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }
    }
}
