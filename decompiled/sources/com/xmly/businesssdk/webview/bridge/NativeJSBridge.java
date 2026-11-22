package com.xmly.businesssdk.webview.bridge;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.umeng.analytics.pro.ak;
import com.xmly.businesssdk.b;
import com.xmly.businesssdk.utils.Logger;
import com.xmly.businesssdk.webview.BusinessWebView;
import com.xmly.businesssdk.webview.IWebView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: NativeJSBridge.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0002()B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0007J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u001eJ,\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/NativeJSBridge;", "", "webView", "Lcom/xmly/businesssdk/webview/IWebView;", "(Lcom/xmly/businesssdk/webview/IWebView;)V", "callbackManager", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/xmly/businesssdk/webview/bridge/JSBridgeCallback;", "moduleRegistry", "Lcom/xmly/businesssdk/webview/bridge/JSBridgeModule;", "permissionChecker", "Lcom/xmly/businesssdk/webview/bridge/JSBridgePermissionChecker;", "createCallback", "params", "Lorg/json/JSONObject;", "createErrorResponse", "message", "code", "", "encodeForJs", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "getModule", "moduleName", "getRegisteredModules", "", "handleCall", "methodName", "paramsJson", "registerModule", "", ak.e, "release", "sendCallback", "callbackId", "callbackName", "result", "isSuccess", "", "unregisterModule", "Companion", "NativeJavaScriptInterface", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeJSBridge {
    private final ConcurrentHashMap<String, JSBridgeCallback> callbackManager;
    private final ConcurrentHashMap<String, JSBridgeModule> moduleRegistry;
    private final JSBridgePermissionChecker permissionChecker;
    private final IWebView webView;

    /* compiled from: NativeJSBridge.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/NativeJSBridge$NativeJavaScriptInterface;", "", "(Lcom/xmly/businesssdk/webview/bridge/NativeJSBridge;)V", "getBridgeInfo", "", "invoke", "moduleName", "methodName", "paramsJson", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class NativeJavaScriptInterface {
        public NativeJavaScriptInterface() {
        }

        @JavascriptInterface
        @com.uc.webview.export.JavascriptInterface
        public final String getBridgeInfo() {
            ConcurrentHashMap concurrentHashMap = NativeJSBridge.this.moduleRegistry;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                Object key = entry.getKey();
                JSBridgeModule jSBridgeModule = (JSBridgeModule) entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", jSBridgeModule.getVersion());
                jSONObject.put("description", jSBridgeModule.getDescription());
                jSONObject.put("methods", jSBridgeModule.getSupportedMethods());
                linkedHashMap.put(key, jSONObject);
            }
            return "{\"success\":true,\"data\":{\"bridgeVersion\":\"2.0\",\"modules\":" + linkedHashMap + ",\"totalModules\":" + NativeJSBridge.this.moduleRegistry.size() + "}}";
        }

        @JavascriptInterface
        @com.uc.webview.export.JavascriptInterface
        public final String invoke(String moduleName, String methodName, String paramsJson) {
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(paramsJson, "paramsJson");
            return NativeJSBridge.this.handleCall(moduleName, methodName, paramsJson);
        }
    }

    public NativeJSBridge(IWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        this.moduleRegistry = new ConcurrentHashMap<>();
        this.callbackManager = new ConcurrentHashMap<>();
        this.permissionChecker = new JSBridgePermissionChecker();
        webView.addJavascriptInterface(new NativeJavaScriptInterface(), "NativeBridge");
        Logger.d("NativeJSBridge", "NativeJSBridge initialized with bridge name: NativeBridge");
    }

    private final JSBridgeCallback createCallback(JSONObject params) {
        final String callbackId = params.optString("callbackId", "");
        final String it = params.optString("callback", "");
        Intrinsics.checkNotNullExpressionValue(callbackId, "callbackId");
        if (callbackId.length() == 0) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DefaultJSBridgeCallback defaultJSBridgeCallback = new DefaultJSBridgeCallback(callbackId, it.length() > 0 ? it : null, new Function1<Object, Unit>() { // from class: com.xmly.businesssdk.webview.bridge.NativeJSBridge$createCallback$callback$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                NativeJSBridge nativeJSBridge = NativeJSBridge.this;
                String callbackId2 = callbackId;
                Intrinsics.checkNotNullExpressionValue(callbackId2, "callbackId");
                nativeJSBridge.sendCallback(callbackId2, it, obj, true);
            }
        }, new Function2<Integer, String, Unit>() { // from class: com.xmly.businesssdk.webview.bridge.NativeJSBridge$createCallback$callback$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
                invoke(num.intValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                NativeJSBridge nativeJSBridge = NativeJSBridge.this;
                String callbackId2 = callbackId;
                Intrinsics.checkNotNullExpressionValue(callbackId2, "callbackId");
                nativeJSBridge.sendCallback(callbackId2, it, MapsKt.mapOf(TuplesKt.to("code", Integer.valueOf(i)), TuplesKt.to("message", errorMessage)), false);
            }
        });
        this.callbackManager.put(callbackId, defaultJSBridgeCallback);
        return defaultJSBridgeCallback;
    }

    private final String createErrorResponse(String message, int code) {
        return "{\"success\":false,\"message\":\"" + message + "\",\"code\":" + code + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String handleCall(String moduleName, String methodName, String paramsJson) {
        try {
            Logger.d("NativeJSBridge", "Native call: " + moduleName + '.' + methodName + '(' + paramsJson + ')');
            if (!this.permissionChecker.checkPermission(moduleName, methodName)) {
                return createErrorResponse("权限不足", 1004);
            }
            try {
                JSONObject jSONObject = new JSONObject(paramsJson);
                JSBridgeModule jSBridgeModule = this.moduleRegistry.get(moduleName);
                if (jSBridgeModule == null) {
                    return createErrorResponse("模块不存在: " + moduleName, 1001);
                }
                if (!jSBridgeModule.getSupportedMethods().contains(methodName)) {
                    return createErrorResponse("方法不存在: " + methodName + "，支持的方法: " + jSBridgeModule.getSupportedMethods(), 1002);
                }
                jSBridgeModule.handleCall(methodName, jSONObject, createCallback(jSONObject));
                return "{\"success\":true,\"async\":true}";
            } catch (Exception e) {
                Logger.e("NativeJSBridge", "Invalid JSON params: " + paramsJson, e);
                return createErrorResponse("参数格式错误", 1003);
            }
        } catch (Exception e2) {
            return createErrorResponse(b.a(e2, com.xmly.businesssdk.fragment.bridge.a.a("NativeJSBridge", "Call failed: " + moduleName + '.' + methodName, e2, "调用失败: ")), 1005);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCallback(final String callbackId, final String callbackName, final Object result, final boolean isSuccess) {
        this.webView.post(new Runnable() { // from class: com.xmly.businesssdk.webview.bridge.NativeJSBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NativeJSBridge.sendCallback$lambda$3(callbackName, isSuccess, callbackId, this, result);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCallback$lambda$3(String str, boolean z, final String callbackId, final NativeJSBridge this$0, Object obj) {
        String str2;
        Intrinsics.checkNotNullParameter(callbackId, "$callbackId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str3 = "success";
        if (str != null) {
            try {
                if (str.length() != 0) {
                    str2 = z ? "javascript:if(window." + str + ") window." + str + '(' + this$0.encodeForJs(obj) + ");" : "javascript:if(window." + str + ") window." + str + '(' + this$0.encodeForJs(MapsKt.mapOf(TuplesKt.to("success", Boolean.FALSE), TuplesKt.to("error", obj))) + ");";
                    this$0.webView.evaluateJavascript(str2, new Function1<String, Unit>() { // from class: com.xmly.businesssdk.webview.bridge.NativeJSBridge$sendCallback$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                            invoke2(str4);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String it) {
                            ConcurrentHashMap concurrentHashMap;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Logger.d("NativeJSBridge", "Callback sent: " + callbackId);
                            concurrentHashMap = this$0.callbackManager;
                            concurrentHashMap.remove(callbackId);
                        }
                    });
                }
            } catch (Exception e) {
                Logger.e("NativeJSBridge", "Failed to send callback: " + callbackId, e);
                return;
            }
        }
        if (!z) {
            str3 = "error";
        }
        str2 = "javascript:if(window.NativeBridge && window.NativeBridge._handleCallback) window.NativeBridge._handleCallback('" + callbackId + "', '" + str3 + "', " + this$0.encodeForJs(obj) + ");";
        this$0.webView.evaluateJavascript(str2, new Function1<String, Unit>() { // from class: com.xmly.businesssdk.webview.bridge.NativeJSBridge$sendCallback$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                invoke2(str4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                ConcurrentHashMap concurrentHashMap;
                Intrinsics.checkNotNullParameter(it, "it");
                Logger.d("NativeJSBridge", "Callback sent: " + callbackId);
                concurrentHashMap = this$0.callbackManager;
                concurrentHashMap.remove(callbackId);
            }
        });
    }

    public final JSBridgeModule getModule(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return this.moduleRegistry.get(moduleName);
    }

    public final List<String> getRegisteredModules() {
        Set<String> keySet = this.moduleRegistry.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "moduleRegistry.keys");
        return CollectionsKt.toList(keySet);
    }

    public final void registerModule(JSBridgeModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        String moduleName = module.getModuleName();
        this.moduleRegistry.put(moduleName, module);
        module.initialize();
        Logger.d("NativeJSBridge", "Module registered: " + moduleName + ", supported methods: " + module.getSupportedMethods());
    }

    public final void release() {
        WebView webView$business_sdk_wakeRelease;
        Collection<JSBridgeModule> values = this.moduleRegistry.values();
        Intrinsics.checkNotNullExpressionValue(values, "moduleRegistry.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((JSBridgeModule) it.next()).release();
        }
        this.moduleRegistry.clear();
        this.callbackManager.clear();
        IWebView iWebView = this.webView;
        if ((iWebView instanceof BusinessWebView) && (webView$business_sdk_wakeRelease = ((BusinessWebView) iWebView).getWebView$business_sdk_wakeRelease()) != null) {
            webView$business_sdk_wakeRelease.removeJavascriptInterface("NativeBridge");
        }
        Logger.d("NativeJSBridge", "NativeJSBridge released");
    }

    public final void unregisterModule(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        JSBridgeModule jSBridgeModule = this.moduleRegistry.get(moduleName);
        if (jSBridgeModule != null) {
            jSBridgeModule.release();
            this.moduleRegistry.remove(moduleName);
            Logger.d("NativeJSBridge", "Module unregistered: " + moduleName);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r0 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String encodeForJs(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r2 = "null"
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r0 = r1 instanceof java.lang.String
            r3 = 34
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r3)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            r8 = 4
            r9 = 0
            java.lang.String r5 = "\\"
            java.lang.String r6 = "\\\\"
            r7 = 0
            java.lang.String r10 = kotlin.text.StringsKt.replace$default(r4, r5, r6, r7, r8, r9)
            r14 = 4
            r15 = 0
            java.lang.String r11 = "\""
            java.lang.String r12 = "\\\""
            r13 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default(r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = com.xmly.businesssdk.config.c.a(r0, r1, r3)
            return r0
        L34:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L3a
            r0 = 1
            goto L3c
        L3a:
            boolean r0 = r1 instanceof java.lang.Boolean
        L3c:
            if (r0 == 0) goto L43
            java.lang.String r0 = r1.toString()
            return r0
        L43:
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L4d
            r0.<init>()     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r0.toJson(r1)     // Catch: java.lang.Exception -> L4d
            goto L61
        L4d:
            r0 = move-exception
            java.lang.String r4 = "Gson序列化失败，尝试JSONObject.wrap"
            java.lang.String r5 = "NativeJSBridge"
            com.xmly.businesssdk.utils.Logger.e(r5, r4, r0)
            java.lang.Object r0 = org.json.JSONObject.wrap(r1)     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L7d
        L61:
            r0 = r2
            goto L7d
        L63:
            r0 = move-exception
            java.lang.String r2 = "所有序列化方法失败"
            com.xmly.businesssdk.utils.Logger.e(r5, r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "\""
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
        L7d:
            java.lang.String r1 = "{\n                try {\n…          }\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xmly.businesssdk.webview.bridge.NativeJSBridge.encodeForJs(java.lang.Object):java.lang.String");
    }
}
