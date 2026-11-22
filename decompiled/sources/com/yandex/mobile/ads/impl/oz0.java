package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.banner.MediatedBannerSize;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class oz0 {
    public static JSONObject a(lz0 mediationNetwork, String bidderToken, MediatedBannerSize mediatedBannerSize) {
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
        String e = mediationNetwork.e();
        Map<String, String> f = mediationNetwork.f();
        Map<String, String> i = mediationNetwork.i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adapter", e);
            if (f != null) {
                jSONObject.put("bidding_info", new JSONObject(f));
            }
            jSONObject.put("network_data", new JSONObject(i));
            jSONObject.put("bidder_token", bidderToken);
            if (mediatedBannerSize != null) {
                jSONObject.put("size", new JSONObject(mediatedBannerSize.toSizeData()));
            }
            return jSONObject;
        } catch (JSONException unused) {
            sp0.c(new Object[0]);
            return null;
        }
    }
}
