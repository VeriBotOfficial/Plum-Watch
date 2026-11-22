package com.bytedance.sdk.openadsdk.hm;

import com.phancy.mini.core.resource.MiniPack;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bh extends fxn {
    public static final SimpleDateFormat gff = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT, Locale.US);

    public bh(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.hm.fxn
    public JSONObject gff() {
        return this.kg;
    }
}
