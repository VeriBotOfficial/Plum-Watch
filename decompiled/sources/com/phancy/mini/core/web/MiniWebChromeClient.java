package com.phancy.mini.core.web;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MiniWebChromeClient.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J2\u0010\u000e\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R7\u0010\u0003\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRZ\u0010\u000e\u001aB\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012!\u0012\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/phancy/mini/core/web/MiniWebChromeClient;", "Landroid/webkit/WebChromeClient;", "()V", "onReceiveTile", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "title", "", "getOnReceiveTile", "()Lkotlin/jvm/functions/Function1;", "setOnReceiveTile", "(Lkotlin/jvm/functions/Function1;)V", "onShowFileChooser", "Lkotlin/Function2;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "params", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "callback", "", "getOnShowFileChooser", "()Lkotlin/jvm/functions/Function2;", "setOnShowFileChooser", "(Lkotlin/jvm/functions/Function2;)V", "onReceivedTitle", "webView", "Landroid/webkit/WebView;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public class MiniWebChromeClient extends WebChromeClient {
    private Function1<? super String, Unit> onReceiveTile = new Function1<String, Unit>() { // from class: com.phancy.mini.core.web.MiniWebChromeClient$onReceiveTile$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    };
    private Function2<? super WebChromeClient.FileChooserParams, ? super ValueCallback<Uri[]>, Boolean> onShowFileChooser = new Function2<WebChromeClient.FileChooserParams, ValueCallback<Uri[]>, Boolean>() { // from class: com.phancy.mini.core.web.MiniWebChromeClient$onShowFileChooser$1
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(WebChromeClient.FileChooserParams fileChooserParams, ValueCallback<Uri[]> valueCallback) {
            return false;
        }
    };

    public final Function1<String, Unit> getOnReceiveTile() {
        return this.onReceiveTile;
    }

    public final void setOnReceiveTile(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onReceiveTile = function1;
    }

    public final Function2<WebChromeClient.FileChooserParams, ValueCallback<Uri[]>, Boolean> getOnShowFileChooser() {
        return this.onShowFileChooser;
    }

    public final void setOnShowFileChooser(Function2<? super WebChromeClient.FileChooserParams, ? super ValueCallback<Uri[]>, Boolean> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onShowFileChooser = function2;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String title) {
        this.onReceiveTile.invoke(title);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> callback, WebChromeClient.FileChooserParams params) {
        if (this.onShowFileChooser.invoke(params, callback).booleanValue()) {
            return true;
        }
        return super.onShowFileChooser(webView, callback, params);
    }
}
