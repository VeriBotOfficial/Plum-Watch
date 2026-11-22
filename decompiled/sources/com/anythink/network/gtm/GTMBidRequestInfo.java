package com.anythink.network.gtm;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.mbridge.msdk.mbbid.out.BidManager;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class GTMBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    String f5821a;
    JSONObject b = new JSONObject();

    public GTMBidRequestInfo(Context context, Map<String, Object> map, String str) {
        try {
            String obj = map.get("appid").toString();
            String obj2 = map.get("unitid").toString();
            this.f5821a = BidManager.getBuyerUid(context);
            this.b.put("app_id", obj);
            this.b.put("unit_id", obj2);
            this.b.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID, this.f5821a);
            this.b.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.NETWORK_SDK_VERSION, str);
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        try {
            String obj = map.get("size").toString();
            if (TextUtils.isEmpty(obj)) {
                return;
            }
            String[] split = obj.split("x");
            if (split.length == 2) {
                this.b.put("ad_width", Integer.parseInt(split[0]));
                this.b.put("ad_height", Integer.parseInt(split[1]));
            }
        } catch (Throwable unused) {
        }
    }

    public void fillNativeExpressData(Map<String, Object> map, Map<String, Object> map2) {
        int i;
        try {
            if (TextUtils.equals(map.containsKey("unit_type") ? map.get("unit_type").toString() : "", "1")) {
                int i2 = 0;
                try {
                    i = Integer.parseInt(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
                    try {
                        i2 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
                    } catch (Throwable th) {
                        th = th;
                        th.printStackTrace();
                        if (i > 0) {
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
                if (i > 0 || i2 <= 0) {
                    return;
                }
                this.b.put("ad_width", i);
                this.b.put("ad_height", i2);
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.f5821a);
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.b;
    }
}
