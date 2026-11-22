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
public final class b extends com.baidu.mapauto.auth.base.a<com.baidu.mapauto.auth.proxy.a> {
    public b(int i, AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.a aVar) {
        super(i, authParam, aVar);
    }

    @Override // com.baidu.mapauto.auth.base.c
    public final /* bridge */ /* synthetic */ boolean a(int i, AuthCore.AuthParam authParam, Object obj) {
        return a(authParam, (com.baidu.mapauto.auth.proxy.a) obj);
    }

    public final boolean a(AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.a aVar) {
        Object opt;
        LogUtil.getInstance().i("b", "开始检验 sign");
        JSONObject jSONObject = aVar.f8316a;
        boolean z = false;
        if (jSONObject == null) {
            LogUtil.getInstance().e("b", "校验签名失败: 验签结果为空");
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
            LogUtil.getInstance().e("b", "校验签名失败: sign 原数据为空");
            return false;
        }
        try {
            JSONObject jSONObject2 = aVar.f8316a;
            PublicKey publicKeyFromPemString = RSAUtil.getPublicKeyFromPemString(jSONObject2 == null ? null : jSONObject2.optString("pub_key"), false);
            JSONObject jSONObject3 = aVar.f8316a;
            z = RSAUtil.verify(sb2, publicKeyFromPemString, jSONObject3 == null ? null : jSONObject3.optString("sign"));
        } catch (Exception e) {
            LogUtil.getInstance().e("b", e.toString());
        }
        LogUtil logUtil = LogUtil.getInstance();
        StringBuilder append = new StringBuilder("校验签名结束: source: ").append(sb2).append(", pubKey: ");
        JSONObject jSONObject4 = aVar.f8316a;
        StringBuilder append2 = append.append(jSONObject4 == null ? null : jSONObject4.optString("pub_key")).append(", sign: ");
        JSONObject jSONObject5 = aVar.f8316a;
        logUtil.i("b", append2.append(jSONObject5 != null ? jSONObject5.optString("sign") : null).append(" => 校验结果: ").append(z).toString());
        return z;
    }
}
