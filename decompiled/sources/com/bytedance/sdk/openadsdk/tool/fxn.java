package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.FilterWord;
import io.nats.client.support.ApiConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn {
    public static String fxn(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject fxn = fxn(it.next());
            if (fxn != null) {
                jSONArray.put(fxn);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> fxn(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord fxn = fxn(jSONArray.optJSONObject(i));
                if (fxn != null && fxn.isValid()) {
                    arrayList.add(fxn);
                }
            }
        } catch (JSONException e) {
            dx.gff("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    private static FilterWord fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(ApiConstants.OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord fxn = fxn(optJSONArray.optJSONObject(i));
                    if (fxn != null && fxn.isValid()) {
                        filterWord.addOption(fxn);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject fxn(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(fxn(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(ApiConstants.OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
