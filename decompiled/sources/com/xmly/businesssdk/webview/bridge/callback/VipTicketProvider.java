package com.xmly.businesssdk.webview.bridge.callback;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VipTicketProvider.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u000b\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/callback/VipTicketProvider;", "", "getVipDeviceInfo", "", "callback", "Lcom/xmly/businesssdk/webview/bridge/callback/VipTicketProvider$VipDeviceInfoCallback;", "getVipTicket", "Lcom/xmly/businesssdk/webview/bridge/callback/VipTicketProvider$VipTicketCallback;", "onVipClaimResult", "result", "", "VipDeviceInfoCallback", "VipTicketCallback", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface VipTicketProvider {

    /* compiled from: VipTicketProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void getVipDeviceInfo(VipTicketProvider vipTicketProvider, VipDeviceInfoCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.onSuccess("{}");
        }
    }

    /* compiled from: VipTicketProvider.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/callback/VipTicketProvider$VipDeviceInfoCallback;", "", "onError", "", "errorCode", "", "errorMessage", "", "onSuccess", "deviceInfo", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VipDeviceInfoCallback {
        void onError(int errorCode, String errorMessage);

        void onSuccess(String deviceInfo);
    }

    /* compiled from: VipTicketProvider.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/callback/VipTicketProvider$VipTicketCallback;", "", "onError", "", "errorCode", "", "errorMessage", "", "onSuccess", "ticket", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VipTicketCallback {
        void onError(int errorCode, String errorMessage);

        void onSuccess(String ticket);
    }

    void getVipDeviceInfo(VipDeviceInfoCallback callback);

    void getVipTicket(VipTicketCallback callback);

    void onVipClaimResult(String result);
}
