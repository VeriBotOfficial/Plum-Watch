package com.baidu.mapauto.auth.verification;

import android.text.TextUtils;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.util.LogUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import java.security.PrivateKey;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class c extends com.baidu.mapauto.auth.base.a<com.baidu.mapauto.auth.proxy.c> {
    public c(int i, AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.c cVar) {
        super(i, authParam, cVar);
    }

    @Override // com.baidu.mapauto.auth.base.c
    public final boolean a(int i, AuthCore.AuthParam authParam, Object obj) {
        com.baidu.mapauto.auth.proxy.c cVar = (com.baidu.mapauto.auth.proxy.c) obj;
        LogUtil.getInstance().i("c", "开始检验设备");
        String e = authParam.e();
        JSONObject jSONObject = cVar.f8317a;
        if (!TextUtils.equals(e, jSONObject == null ? null : jSONObject.optString("service"))) {
            LogUtil.getInstance().e("c", "校验签名失败: 服务名不一致");
            return false;
        }
        String c = authParam.c();
        JSONObject jSONObject2 = cVar.f8317a;
        if (!TextUtils.equals(c, jSONObject2 == null ? null : jSONObject2.optString("channel"))) {
            LogUtil.getInstance().e("c", "校验签名失败: 渠道不一致");
            return false;
        }
        if (i == 0) {
            Object obj2 = authParam.get("private_key");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (TextUtils.isEmpty(str)) {
                LogUtil.getInstance().e("c", "校验签名失败: 本地私钥为空");
                return false;
            }
            PrivateKey privateKeyFrom16 = RSAUtil.getPrivateKeyFrom16(str);
            JSONObject jSONObject3 = cVar.f8317a;
            byte[] decryptHexStringBySec = RSAUtil.decryptHexStringBySec(jSONObject3 != null ? jSONObject3.optString("ak") : null, privateKeyFrom16);
            if (decryptHexStringBySec == null) {
                LogUtil.getInstance().e("c", "校验签名失败: 解析 ak 失败");
                return false;
            }
            if (!new String(decryptHexStringBySec).equals(authParam.b())) {
                LogUtil.getInstance().e("c", "校验签名失败: ak 不一致");
                return false;
            }
        }
        LogUtil.getInstance().i("c", "设备校验通过");
        return true;
    }
}
