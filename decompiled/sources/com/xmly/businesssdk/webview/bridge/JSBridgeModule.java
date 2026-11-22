package com.xmly.businesssdk.webview.bridge;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.xmly.businesssdk.c;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: JSBridgeModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/JSBridgeModule;", "", "getDescription", "", "getModuleName", "getSupportedMethods", "", MobileAdsBridge.versionMethodName, "handleCall", "", "methodName", "params", "Lorg/json/JSONObject;", "callback", "Lcom/xmly/businesssdk/webview/bridge/JSBridgeCallback;", MobileAdsBridgeBase.initializeMethodName, "release", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface JSBridgeModule {

    /* compiled from: JSBridgeModule.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static String getDescription(JSBridgeModule jSBridgeModule) {
            return c.a("JSBridge模块：").append(jSBridgeModule.getModuleName()).toString();
        }

        public static String getVersion(JSBridgeModule jSBridgeModule) {
            return "1.0";
        }

        public static void initialize(JSBridgeModule jSBridgeModule) {
        }

        public static void release(JSBridgeModule jSBridgeModule) {
        }
    }

    String getDescription();

    String getModuleName();

    List<String> getSupportedMethods();

    String getVersion();

    void handleCall(String methodName, JSONObject params, JSBridgeCallback callback);

    void initialize();

    void release();
}
