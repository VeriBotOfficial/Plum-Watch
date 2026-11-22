package com.xmly.businesssdk.webview.bridge;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static void a(Exception exc, StringBuilder sb, JSBridgeCallback jSBridgeCallback, int i) {
        jSBridgeCallback.onError(i, sb.append(exc.getMessage()).toString());
    }
}
