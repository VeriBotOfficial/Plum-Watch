package com.xmly.businesssdk.webview.bridge.callback;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: UIEventCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\u0005H&J,\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\u0005H&J,\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\u0005H&J$\u0010\f\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\r"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/callback/UIEventCallback;", "", "onCloseWebViewContainerRequested", "", "resultCallback", "Lkotlin/Function2;", "", "", "onNotifyPageUrl", "url", "onTabLayoutVisibilityChangeRequested", "visible", "onTabLayoutVisibilityQueryRequested", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface UIEventCallback {
    void onCloseWebViewContainerRequested(Function2<? super Boolean, ? super String, Unit> resultCallback);

    void onNotifyPageUrl(String url, Function2<? super Boolean, ? super String, Unit> resultCallback);

    void onTabLayoutVisibilityChangeRequested(boolean visible, Function2<? super Boolean, ? super String, Unit> resultCallback);

    void onTabLayoutVisibilityQueryRequested(Function2<? super Boolean, ? super String, Unit> resultCallback);
}
