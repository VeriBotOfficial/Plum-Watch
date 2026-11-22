package com.wakeup.module.h5;

import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: H5JsNativeBackHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/wakeup/module/h5/H5JsNativeBackHandler;", "", "<init>", "()V", "SCRIPT", "", "dispatch", "", "webView", "Landroid/webkit/WebView;", "module-h5_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class H5JsNativeBackHandler {
    public static final H5JsNativeBackHandler INSTANCE = new H5JsNativeBackHandler();
    private static final String SCRIPT = "javascript:typeof handleNativeBack==='function'&&handleNativeBack()";

    private H5JsNativeBackHandler() {
    }

    public final void dispatch(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.evaluateJavascript(SCRIPT, null);
    }
}
