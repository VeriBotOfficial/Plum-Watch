package com.bytedance.adsdk.ugeno.hm;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.hm.bh;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class mvp {
    public static bh.fxn fxn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        bh.fxn fxnVar = new bh.fxn();
        String fxn = com.bytedance.adsdk.ugeno.gff.kg.fxn(str, jSONObject);
        Uri parse = Uri.parse(fxn);
        if (parse == null) {
            return null;
        }
        fxnVar.gff(fxn);
        if (!TextUtils.isEmpty(parse.getScheme())) {
            fxnVar.fxn(parse.getScheme());
        }
        String authority = parse.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = parse.getPath();
        }
        fxnVar.kg(authority);
        fxnVar.hm(fxnVar.fxn() + "://" + fxnVar.kg());
        HashMap hashMap = new HashMap();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                hashMap.put(str2, com.bytedance.adsdk.ugeno.gff.kg.fxn(parse.getQueryParameter(str2), jSONObject));
            }
        }
        fxnVar.fxn(hashMap);
        return fxnVar;
    }
}
