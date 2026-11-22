package com.bytedance.sdk.component.jq;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.jq.fxn;
import java.util.List;

/* loaded from: classes13.dex */
public class sg extends WebViewClient {
    private final WebViewClient fxn;
    private final List<String> gff;
    private final fxn.InterfaceC0479fxn kg;

    public sg(fxn.InterfaceC0479fxn interfaceC0479fxn, WebViewClient webViewClient, List<String> list) {
        this.kg = interfaceC0479fxn;
        this.fxn = webViewClient;
        this.gff = list;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.fxn.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        fxn.InterfaceC0479fxn interfaceC0479fxn;
        if (kg.fxn(this.gff, webResourceRequest.getUrl().toString()) && (interfaceC0479fxn = this.kg) != null) {
            interfaceC0479fxn.fxn();
        }
        return this.fxn.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        fxn.InterfaceC0479fxn interfaceC0479fxn = this.kg;
        if (interfaceC0479fxn != null) {
            interfaceC0479fxn.fxn();
        }
        return this.fxn.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.fxn.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        fxn.InterfaceC0479fxn interfaceC0479fxn = this.kg;
        if (interfaceC0479fxn != null) {
            interfaceC0479fxn.fxn(fxn(webView));
        }
        this.fxn.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.fxn.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.fxn.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.fxn.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.fxn.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.fxn.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    private int fxn(WebView webView) {
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList != null) {
                return copyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
