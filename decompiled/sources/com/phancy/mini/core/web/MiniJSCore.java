package com.phancy.mini.core.web;

import android.webkit.JavascriptInterface;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.core.IApiBridge;
import com.phancy.mini.core.IPublishBridge;
import com.phancy.mini.core.api.ApiBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MiniJSCore.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007J&\u0010\u0014\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/phancy/mini/core/web/MiniJSCore;", "", "()V", "apiBridge", "Lcom/phancy/mini/core/IApiBridge;", "getApiBridge", "()Lcom/phancy/mini/core/IApiBridge;", "setApiBridge", "(Lcom/phancy/mini/core/IApiBridge;)V", "publishBridge", "Lcom/phancy/mini/core/IPublishBridge;", "getPublishBridge", "()Lcom/phancy/mini/core/IPublishBridge;", "setPublishBridge", "(Lcom/phancy/mini/core/IPublishBridge;)V", "invokeHandler", "", "event", "params", "callbackId", "publishHandler", "viewIds", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MiniJSCore {
    private static final String TAG = "MiniJSCore";
    private IApiBridge apiBridge;
    private IPublishBridge publishBridge;

    public final IApiBridge getApiBridge() {
        return this.apiBridge;
    }

    public final void setApiBridge(IApiBridge iApiBridge) {
        this.apiBridge = iApiBridge;
    }

    public final IPublishBridge getPublishBridge() {
        return this.publishBridge;
    }

    public final void setPublishBridge(IPublishBridge iPublishBridge) {
        this.publishBridge = iPublishBridge;
    }

    @JavascriptInterface
    public final String publishHandler(final String event, final String params, final String viewIds) {
        final IPublishBridge iPublishBridge;
        if (event == null) {
            event = "";
        }
        if (event.length() == 0 || (iPublishBridge = this.publishBridge) == null) {
            return "";
        }
        MiniSDK.d(TAG, "publishHandler: " + event + ' ' + viewIds + ' ' + params);
        MiniSDK.runOnUiThread(new Runnable() { // from class: com.phancy.mini.core.web.MiniJSCore$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MiniJSCore.publishHandler$lambda$0(IPublishBridge.this, event, params, viewIds);
            }
        });
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void publishHandler$lambda$0(IPublishBridge bridge, String e, String str, String str2) {
        Intrinsics.checkNotNullParameter(bridge, "$bridge");
        Intrinsics.checkNotNullParameter(e, "$e");
        bridge.publish(e, str, str2);
    }

    @JavascriptInterface
    public final String invokeHandler(final String event, final String params, final String callbackId) {
        if (event == null) {
            event = "";
        }
        if (event.length() == 0) {
            return "";
        }
        MiniSDK.d(TAG, "invokeHandler: " + event + ' ' + callbackId + ' ' + params);
        final IApiBridge iApiBridge = this.apiBridge;
        if (iApiBridge == null) {
            return "";
        }
        if (iApiBridge instanceof ApiBridge) {
            ((ApiBridge) iApiBridge).getApp().getStorage().getSetting().beforeInvokeApi();
        }
        if (iApiBridge.shouldInterceptSyncEvent(event, params)) {
            return iApiBridge.onInvokeSyncEvent(event, params, callbackId);
        }
        MiniSDK.runOnUiThread(new Runnable() { // from class: com.phancy.mini.core.web.MiniJSCore$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MiniJSCore.invokeHandler$lambda$1(IApiBridge.this, event, params, callbackId);
            }
        });
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeHandler$lambda$1(IApiBridge bridge, String e, String str, String str2) {
        Intrinsics.checkNotNullParameter(bridge, "$bridge");
        Intrinsics.checkNotNullParameter(e, "$e");
        bridge.invoke(e, str, str2);
    }
}
