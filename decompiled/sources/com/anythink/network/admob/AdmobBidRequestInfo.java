package com.anythink.network.admob;

import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AdmobBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f5663a;

    public AdmobBidRequestInfo(Context context, String str, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat) {
        try {
            this.f5663a = new JSONObject();
            this.f5663a.put("unit_id", map.get("unit_id").toString());
            this.f5663a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID, str);
            if (adFormat == AdFormat.BANNER) {
                AdSize a2 = AdmobATConst.a(context, map2, map);
                int width = (a2 == null || a2.getWidth() <= 0) ? 320 : a2.getWidth();
                int height = (a2 == null || a2.getHeight() <= 0) ? 50 : a2.getHeight();
                new Object[]{Integer.valueOf(width), Integer.valueOf(height), a2};
                this.f5663a.put("ad_width", width);
                this.f5663a.put("ad_height", height);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f5663a;
    }
}
