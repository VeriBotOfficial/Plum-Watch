package com.wakeup.commponent.module.h5.api;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.Navigator;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.module.h5.JsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WechatReplyJsApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/wakeup/commponent/module/h5/api/WechatReplyJsApi;", "Lcom/wakeup/commponent/module/h5/JsApi;", "<init>", "()V", "TAG", "", "getName", "goWechatReply", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WechatReplyJsApi extends JsApi {
    private final String TAG = "WechatReplyJsApi";

    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "WechatReplyJs";
    }

    @JavascriptInterface
    public final void goWechatReply() {
        LogUtils.i(this.TAG, "跳转到微信回复界面");
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        Navigator.start(mContext, PagePath.PAGE_WECHAT_REPLY);
    }
}
