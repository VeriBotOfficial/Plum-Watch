package com.wakeup.commponent.module.h5;

import android.app.Activity;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.wakeup.common.Constants;
import com.wakeup.common.utils.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, d2 = {"Lcom/wakeup/commponent/module/h5/CommonUtils;", "", "<init>", "()V", "launchLittleApp", "", "context", "Landroid/app/Activity;", "microAppId", "", "path", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonUtils {
    public final void launchLittleApp(Activity context, String microAppId, String path) {
        try {
            String APP_ID_WX = Constants.APP_ID_WX;
            Intrinsics.checkNotNullExpressionValue(APP_ID_WX, "APP_ID_WX");
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, APP_ID_WX);
            if (!createWXAPI.isWXAppInstalled()) {
                ToastUtils.showToast("请安装微信");
                return;
            }
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = microAppId;
            req.path = path;
            req.miniprogramType = 0;
            createWXAPI.sendReq(req);
        } catch (Exception unused) {
            ToastUtils.showToast("需要打开悬浮窗权限");
        }
    }
}
