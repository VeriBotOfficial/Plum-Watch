package com.anythink.expressad.atsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4677a = "CommonWebChromeClient";
    private CopyOnWriteArrayList<WebChromeClient> b = new CopyOnWriteArrayList<>();

    public final void a(WebChromeClient webChromeClient) {
        this.b.add(webChromeClient);
    }

    public final void b(WebChromeClient webChromeClient) {
        this.b.remove(webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int r4) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, r4);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int r4, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, r4, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Iterator<WebChromeClient> it = this.b.iterator();
        boolean zOnCreateWindow = false;
        while (it.hasNext()) {
            zOnCreateWindow = it.next().onCreateWindow(webView, z, z2, message);
        }
        return zOnCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.b.iterator();
        boolean zOnJsAlert = false;
        while (it.hasNext()) {
            zOnJsAlert = it.next().onJsAlert(webView, str, str2, jsResult);
        }
        return zOnJsAlert;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.b.iterator();
        boolean zOnJsConfirm = false;
        while (it.hasNext()) {
            zOnJsConfirm = it.next().onJsConfirm(webView, str, str2, jsResult);
        }
        return zOnJsConfirm;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<WebChromeClient> it = this.b.iterator();
        boolean zOnJsPrompt = false;
        while (it.hasNext()) {
            zOnJsPrompt = it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return zOnJsPrompt;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.b.iterator();
        boolean zOnJsBeforeUnload = false;
        while (it.hasNext()) {
            zOnJsBeforeUnload = it.next().onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return zOnJsBeforeUnload;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }

    @Deprecated
    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequest(permissionRequest);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequestCanceled(permissionRequest);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final boolean onJsTimeout() {
        Iterator<WebChromeClient> it = this.b.iterator();
        boolean zOnJsTimeout = false;
        while (it.hasNext()) {
            zOnJsTimeout = it.next().onJsTimeout();
        }
        return zOnJsTimeout;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onConsoleMessage(String str, int r4, String str2) {
        Iterator<WebChromeClient> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onConsoleMessage(str, r4, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Iterator<WebChromeClient> it = this.b.iterator();
        boolean zOnConsoleMessage = false;
        while (it.hasNext()) {
            zOnConsoleMessage = it.next().onConsoleMessage(consoleMessage);
        }
        return zOnConsoleMessage;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean zOnShowFileChooser = false;
        try {
            Iterator<WebChromeClient> it = this.b.iterator();
            while (it.hasNext()) {
                zOnShowFileChooser = it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return zOnShowFileChooser;
    }
}
