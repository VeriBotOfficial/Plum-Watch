package com.bytedance.sdk.component.adexpress.dynamic.hm;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class gff {
    private HashMap<String, Object> fxn = new HashMap<>();
    private JSONObject kg;

    public gff(JSONObject jSONObject) {
        this.kg = jSONObject;
    }

    public Object fxn(String str) {
        if (this.fxn.containsKey(str)) {
            return this.fxn.get(str);
        }
        return null;
    }

    public boolean kg(String str) {
        return this.fxn.containsKey(str);
    }

    public void fxn() {
        Iterator<String> itKeys = this.kg.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.kg.opt(next);
            int r4 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (r4 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(r4);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    this.fxn.put(next + "." + r4 + "." + next2, jSONObjectOptJSONObject.opt(next2));
                                }
                            }
                            r4++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt2 = jSONObject.opt(next3);
                            if ((objOpt2 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int r8 = 0; r8 < ((JSONArray) objOpt2).length(); r8++) {
                                    this.fxn.put(next + "." + next3 + "." + r8, ((JSONArray) objOpt2).opt(r8));
                                }
                            } else if ((objOpt2 instanceof JSONObject) && TextUtils.equals(next3, FirebaseAnalytics.Param.COUPON)) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt2).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    this.fxn.put(next + "." + next3 + "." + next4, ((JSONObject) objOpt2).opt(next4));
                                }
                            } else if ((objOpt2 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                fxn(next, next3, objOpt2);
                            } else {
                                this.fxn.put(next + "." + next3, objOpt2);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(objOpt instanceof JSONObject)) {
                this.fxn.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.fxn.put(next, objOpt);
                }
            } else if (objOpt != null) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    this.fxn.put(next + "." + next5, jSONObject2.opt(next5));
                }
            }
        }
    }

    private void fxn(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int r3 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (r3 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(r3);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            this.fxn.put(str + "." + str2 + "." + next + "." + r3 + "." + next2, jSONObjectOptJSONObject.opt(next2));
                        }
                        r3++;
                    }
                }
            } else {
                this.fxn.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
