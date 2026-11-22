package com.baidu.mapauto.auth.verification;

import android.text.TextUtils;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.util.LogUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class d extends com.baidu.mapauto.auth.base.a<com.baidu.mapauto.auth.proxy.c> {
    public d(int i, AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.c cVar) {
        super(i, authParam, cVar);
    }

    @Override // com.baidu.mapauto.auth.base.c
    public final /* bridge */ /* synthetic */ boolean a(int i, AuthCore.AuthParam authParam, Object obj) {
        return a(authParam, (com.baidu.mapauto.auth.proxy.c) obj);
    }

    public final boolean a(AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.c cVar) {
        Object opt;
        LogUtil.getInstance().i("d", "开始检验 sign");
        JSONObject jSONObject = cVar.f8317a;
        boolean z = false;
        if (jSONObject == null) {
            LogUtil.getInstance().e("d", "校验签名失败: 验签结果为空");
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        TreeSet treeSet = new TreeSet();
        while (keys.hasNext()) {
            treeSet.add(keys.next());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!"pub_key".equals(str) && !"sign".equals(str) && (opt = jSONObject.opt(str)) != null) {
                if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            sb.append(optString);
                        }
                    }
                } else {
                    sb.append(opt);
                }
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            LogUtil.getInstance().e("d", "校验签名失败: sign 原数据为空");
            return false;
        }
        try {
            JSONObject jSONObject2 = cVar.f8317a;
            PublicKey publicKeyFromPemString = RSAUtil.getPublicKeyFromPemString(jSONObject2 == null ? null : jSONObject2.optString("pub_key"), false);
            JSONObject jSONObject3 = cVar.f8317a;
            z = RSAUtil.verify(sb2, publicKeyFromPemString, jSONObject3 == null ? null : jSONObject3.optString("sign"));
        } catch (Exception e) {
            LogUtil.getInstance().e("d", e.toString());
        }
        LogUtil logUtil = LogUtil.getInstance();
        StringBuilder append = new StringBuilder("校验签名结束: source: ").append(sb2).append(", pubKey: ");
        JSONObject jSONObject4 = cVar.f8317a;
        StringBuilder append2 = append.append(jSONObject4 == null ? null : jSONObject4.optString("pub_key")).append(", sign: ");
        JSONObject jSONObject5 = cVar.f8317a;
        logUtil.i("d", append2.append(jSONObject5 != null ? jSONObject5.optString("sign") : null).append(" => 校验结果: ").append(z).toString());
        return z;
    }
}
