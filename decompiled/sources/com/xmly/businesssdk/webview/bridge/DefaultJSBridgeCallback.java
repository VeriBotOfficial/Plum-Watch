package com.xmly.businesssdk.webview.bridge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JSBridgeCallback.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\fJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/DefaultJSBridgeCallback;", "Lcom/xmly/businesssdk/webview/bridge/JSBridgeCallback;", "callbackId", "", "callbackName", "successHandler", "Lkotlin/Function1;", "", "", "errorHandler", "Lkotlin/Function2;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getCallbackId", "()Ljava/lang/String;", "getCallbackName", "onError", "errorCode", "errorMessage", "onSuccess", "result", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultJSBridgeCallback implements JSBridgeCallback {
    private final String callbackId;
    private final String callbackName;
    private final Function2<Integer, String, Unit> errorHandler;
    private final Function1<Object, Unit> successHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultJSBridgeCallback(String callbackId, String str, Function1<Object, Unit> successHandler, Function2<? super Integer, ? super String, Unit> errorHandler) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(successHandler, "successHandler");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.callbackId = callbackId;
        this.callbackName = str;
        this.successHandler = successHandler;
        this.errorHandler = errorHandler;
    }

    @Override // com.xmly.businesssdk.webview.bridge.JSBridgeCallback
    public String getCallbackId() {
        return this.callbackId;
    }

    @Override // com.xmly.businesssdk.webview.bridge.JSBridgeCallback
    public String getCallbackName() {
        return this.callbackName;
    }

    @Override // com.xmly.businesssdk.webview.bridge.JSBridgeCallback
    public void onError(int errorCode, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorHandler.invoke(Integer.valueOf(errorCode), errorMessage);
    }

    @Override // com.xmly.businesssdk.webview.bridge.JSBridgeCallback
    public void onSuccess(Object result) {
        this.successHandler.invoke(result);
    }

    public /* synthetic */ DefaultJSBridgeCallback(String str, String str2, Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, function1, function2);
    }
}
