package com.wakeup.feature.weilife.js;

import android.webkit.JavascriptInterface;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.wakeup.common.Constants;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.h5.JsApi;

/* loaded from: classes3.dex */
public class WawaJsApi extends JsApi {
    private static final String TAG = "WawaJsApi";

    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "Api";
    }

    @JavascriptInterface
    public void callhandler(int i, String str, String str2) {
        LogUtils.i(TAG, "由h5 拉起微信小程序 env ", Integer.valueOf(i));
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this.mContext, Constants.APP_ID_WX);
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = str;
        req.path = str2;
        req.miniprogramType = 0;
        createWXAPI.sendReq(req);
    }
}
