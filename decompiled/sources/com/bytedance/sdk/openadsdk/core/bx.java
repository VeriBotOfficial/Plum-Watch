package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bx implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene fxn;

    public bx(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.fxn = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        uhw.fxn(1, this.fxn, i);
        return com.bytedance.sdk.component.utils.fxn.fxn(jSONObject);
    }
}
