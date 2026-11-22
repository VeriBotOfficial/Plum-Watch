package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.filter.FilterNode;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class y7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7345a = FilterNode.highlightFilter.getNodeName();
    public boolean b;

    public String a() {
        String str = this.f7345a;
        return str == null ? "" : str;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str) && new File(str + "/property_list.json").exists()) {
            try {
                JSONArray jSONArray = new JSONObject(j4.a(str + "/property_list.json")).getJSONArray("FilterList");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (this.f7345a.equals(jSONObject.getString("FilterName"))) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("defaultUniformList");
                        int i2 = 0;
                        while (true) {
                            if (i2 < jSONArray2.length()) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                                if ("is_enable".equals(jSONObject2.getString("PropertyName"))) {
                                    boolean z = true;
                                    if (jSONObject2.getInt("PropertyValue") != 1) {
                                        z = false;
                                    }
                                    this.b = z;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean b() {
        return this.b;
    }
}
