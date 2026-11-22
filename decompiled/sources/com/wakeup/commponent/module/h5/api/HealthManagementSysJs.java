package com.wakeup.commponent.module.h5.api;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.wakeup.commponent.Navigator;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.module.h5.JsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthManagementSysJs.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/wakeup/commponent/module/h5/api/HealthManagementSysJs;", "Lcom/wakeup/commponent/module/h5/JsApi;", "<init>", "()V", "getName", "", "gotoVipPage", "", "str", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthManagementSysJs extends JsApi {
    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "android";
    }

    @JavascriptInterface
    public final void gotoVipPage(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        Navigator.start(mContext, PagePath.PAGE_BECOME_VIP);
    }
}
