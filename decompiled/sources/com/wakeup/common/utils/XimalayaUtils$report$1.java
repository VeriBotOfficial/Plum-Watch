package com.wakeup.common.utils;

import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XimalayaUtils.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/wakeup/common/utils/XimalayaUtils$report$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class XimalayaUtils$report$1 extends WebViewClient {
    XimalayaUtils$report$1() {
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(final WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        LogUtils.i("XimalayaUtils", "loadListener onPageFinished");
        new Handler().postDelayed(new Runnable() { // from class: com.wakeup.common.utils.XimalayaUtils$report$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                view.destroy();
            }
        }, 5000L);
    }
}
