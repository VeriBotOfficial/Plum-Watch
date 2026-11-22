package com.xmly.businesssdk.webview.bridge;

import kotlin.Metadata;

/* compiled from: JSBridgeCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/JSBridgeCallback;", "", "callbackId", "", "getCallbackId", "()Ljava/lang/String;", "callbackName", "getCallbackName", "onError", "", "errorCode", "", "errorMessage", "onSuccess", "result", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface JSBridgeCallback {
    String getCallbackId();

    String getCallbackName();

    void onError(int errorCode, String errorMessage);

    void onSuccess(Object result);
}
