package com.anythink.network.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATSDKUtils;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PangleBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    String f5887a;
    JSONObject b = new JSONObject();

    public PangleBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, String str, boolean z) {
        try {
            String obj = map.get("app_id").toString();
            String obj2 = map.get("slot_id").toString();
            this.f5887a = str;
            this.b.put("app_id", obj);
            this.b.put("unit_id", obj2);
            this.b.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID, str);
            if (z) {
                PAGBannerSize bannerSize = PangleATInitManager.getInstance().getBannerSize(context, map, map2);
                int width = bannerSize.getWidth();
                int height = bannerSize.getHeight();
                int dip2px = ATSDKUtils.dip2px(context, width);
                int dip2px2 = ATSDKUtils.dip2px(context, height);
                this.b.put("ad_width", dip2px);
                this.b.put("ad_height", dip2px2);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.f5887a);
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.b;
    }
}
