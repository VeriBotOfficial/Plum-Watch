package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.jz;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface iwp<T> {

    public interface fxn {
        void fxn(int i, String str);

        void fxn(com.bytedance.sdk.openadsdk.core.model.fxn fxnVar, com.bytedance.sdk.openadsdk.core.model.gff gffVar);
    }

    public interface kg {
        void fxn(int i, String str);

        void fxn(jz.kg kgVar);
    }

    com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxn();

    com.bytedance.sdk.openadsdk.hm.rb fxn(JSONObject jSONObject, String str, boolean z);

    JSONObject fxn(JSONObject jSONObject);

    void fxn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.mve mveVar, int i, dx dxVar);

    void fxn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.mve mveVar, int i, fxn fxnVar);

    void fxn(String str);

    void fxn(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void fxn(JSONObject jSONObject, kg kgVar);

    void fxn(JSONObject jSONObject, String str);

    com.bytedance.sdk.openadsdk.hm.rb kg(JSONObject jSONObject);
}
