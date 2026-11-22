package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.dx;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface rb {
    public static final kg<JSONObject> fxn = new kg<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rb.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.kg
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public JSONObject kg(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                dx.fxn("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final kg<Set<String>> kg = new kg<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rb.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.kg
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public Set<String> kg(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                dx.fxn("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    public interface fxn {
        fxn fxn(String str);

        fxn fxn(String str, float f);

        fxn fxn(String str, int i);

        fxn fxn(String str, long j);

        fxn fxn(String str, String str2);

        fxn fxn(String str, boolean z);

        void fxn();
    }

    public interface kg<T> {
        T kg(String str);
    }

    void fxn(JSONObject jSONObject);
}
