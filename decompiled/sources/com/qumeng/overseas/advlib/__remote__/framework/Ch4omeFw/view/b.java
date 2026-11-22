package com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.net.HttpHeaders;
import com.phancy.mini.utils.MimeExtKt;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.NativeMaterial;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.r;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import com.qumeng.overseas.advlib.__remote__.utils.j;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class b extends WebView implements com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c {
    private com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.a t;
    private boolean u;
    private boolean v;
    private String w;

    class a extends HashMap<String, String> {
        a() {
            put(HttpHeaders.REFERER, "");
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.b$b, reason: collision with other inner class name */
    class C0793b implements ValueCallback<String> {
        C0793b() {
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.c("Ch4omeLiteLite", "Stop performs anything and await further operation", new Object[0]);
            if (b.this.t != null) {
                b.this.t.a();
            }
            b.this.setDownloadListener(null);
            b.this.stopLoading();
            b.this.removeAllViews();
        }
    }

    class d extends WebChromeClient {
        d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            n.a(getClass().getSimpleName(), "onProgressChanged", new Object[0]);
            if (b.this.t != null) {
                b.this.t.a(i);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            n.a(getClass().getSimpleName(), "onReceivedTitle", new Object[0]);
            if (b.this.t != null) {
                b.this.t.j(str);
            }
            super.onReceivedTitle(webView, str);
        }
    }

    class f implements View.OnLongClickListener {
        f() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            n.a(getClass().getSimpleName(), "onLongClick", new Object[0]);
            WebView.HitTestResult hitTestResult = b.this.getHitTestResult();
            if (hitTestResult == null || b.this.t == null) {
                return false;
            }
            return b.this.t.a(hitTestResult.getType(), hitTestResult.getExtra());
        }
    }

    class g implements DownloadListener {
        g() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            n.a(getClass().getSimpleName(), "onDownloadStart", new Object[0]);
            if (b.this.t != null) {
                b.this.t.g(str);
            }
        }
    }

    public b(Context context) {
        super(context);
        this.u = false;
        this.v = true;
        a(context);
    }

    private void f() {
        addJavascriptInterface(this.t.b(), "cpcAndroid");
        n.c("CpcX5WebView", "initJSBridge outer bridge", new Object[0]);
        Map<String, Object> a2 = com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.f.a();
        if (a2 != null) {
            for (Map.Entry<String, Object> entry : a2.entrySet()) {
                if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                    addJavascriptInterface(entry.getValue(), entry.getKey());
                }
            }
        }
    }

    private void g() {
        setWebChromeClient(new d());
        setDownloadListener(new g());
        setWebViewClient(new e());
        setOnLongClickListener(new f());
    }

    private void h() {
        if (r.c()) {
            n.c("Ch4omeLite", "Manufacturer = OPPO detected", new Object[0]);
        }
        WebSettings settings = getSettings();
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setJavaScriptEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(false);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        String absolutePath = getContext().getCacheDir().getAbsolutePath();
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(absolutePath);
        String userAgentString = settings.getUserAgentString();
        this.w = userAgentString;
        settings.setUserAgentString(userAgentString);
        settings.setSavePassword(false);
        n.c("Ch4omeLite", "Enable mixed content mode (above lolipop)", new Object[0]);
        getSettings().setMixedContentMode(0);
    }

    private void i() {
        setBackgroundColor(-1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private void j() {
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void c(String str) {
        this.t.m(str);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void d() {
        loadUrl(getUrl());
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void e() {
        if (!this.v) {
            n.f("Ch4omeLite", "Already released ...", new Object[0]);
        } else {
            this.v = false;
            j.c().post(new c());
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.g getJSCallback() {
        return this.t.b();
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.ICh4omeLike
    public void loadJs(String str) {
        n.a(getClass().getSimpleName(), "loadJs", new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            evaluateJavascript(str, new C0793b());
        } catch (Exception e2) {
            e2.printStackTrace();
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        NativeMaterial nativeMaterial;
        n.a(getClass().getSimpleName(), "loadUrl %s", str);
        String f2 = this.t.f(str);
        if (TextUtils.isEmpty(f2)) {
            return;
        }
        if (this.t.k(f2)) {
            getSettings().setBlockNetworkImage(true);
        }
        AdsObject adsObject = this.t.b;
        if (adsObject == null || (nativeMaterial = adsObject.native_material) == null || nativeMaterial.do_referer != 1) {
            super.loadUrl(f2);
        } else {
            super.loadUrl(f2, new a());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        n.a(getClass().getSimpleName(), "onDetachedFromWindow", new Object[0]);
        this.t.c();
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        n.a(getClass().getSimpleName(), "onVisibilityChanged", new Object[0]);
        com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.a aVar = this.t;
        if (aVar != null && aVar.b(i)) {
            loadJs("javascript:window.cpcJs.backClient();");
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void setWebViewEventListener(com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.e eVar) {
        this.t.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str) {
        com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.a aVar = this.t;
        if (aVar == null) {
            return false;
        }
        return aVar.c(str);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void b(String str) {
        if (_imp_adbrowser.ACTIVITY_RESUME.equals(str)) {
            resumeTimers();
        }
        this.t.d(str);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void c() {
        this.t.a((View) this);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void a(AdsObject adsObject) {
        NativeMaterial nativeMaterial;
        this.t.a(adsObject);
        if (adsObject != null && !adsObject.hasExpFeature(com.qumeng.overseas.advlib.__remote__.ui.elements.j.x0)) {
            WebSettings settings = getSettings();
            String str = settings.getUserAgentString() + " clicash_android v=1.049 cpc_app_chrome_kernel";
            this.w = str;
            settings.setUserAgentString(str);
        }
        if (adsObject != null) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        } else {
            getSettings().setMediaPlaybackRequiresUserGesture(true);
        }
        if (adsObject == null || (nativeMaterial = adsObject.native_material) == null || TextUtils.isEmpty(nativeMaterial.ua)) {
            return;
        }
        getSettings().setUserAgentString(adsObject.native_material.ua);
    }

    class e extends WebViewClient {
        e() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            n.a(getClass().getSimpleName(), "onLoadResource", new Object[0]);
            if (b.this.t != null) {
                b.this.t.h(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            n.a(getClass().getSimpleName(), "onPageFinished", new Object[0]);
            if (webView.getSettings().getBlockNetworkImage()) {
                webView.getSettings().setBlockNetworkImage(false);
            }
            b.this.t.a(webView, str);
            super.onPageFinished(webView, str);
            b.this.u = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            n.a(getClass().getSimpleName(), "onPageStarted", new Object[0]);
            b.this.t.a((com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c) b.this);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            n.a(getClass().getSimpleName(), "onReceivedError", new Object[0]);
            if (b.this.d(webResourceRequest.getUrl().toString())) {
                n.b("Ch4omeLiteLite", "webpage dead with response code " + webResourceError.getErrorCode(), new Object[0]);
                if (b.this.t != null) {
                    b.this.t.i(webResourceRequest.getUrl().toString());
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            n.a(getClass().getSimpleName(), "onReceivedHttpError", new Object[0]);
            if (!b.this.d(webResourceRequest.getUrl().toString()) || b.this.t == null) {
                return;
            }
            b.this.t.a(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            n.a("b", "shouldInterceptRequest--getUserAgentString: " + b.this.w, new Object[0]);
            InputStream a2 = b.this.t.a(b.this.w, str);
            return a2 != null ? new WebResourceResponse(MimeExtKt.MIME_TYPE_HTML, "utf-8", a2) : super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            n.a(getClass().getSimpleName(), "shouldOverrideUrlLoading", new Object[0]);
            if (b.this.t == null) {
                return false;
            }
            return b.this.t.l(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            n.a(getClass().getSimpleName(), "onReceivedError", new Object[0]);
            if (str2 == null || !b.this.d(str2)) {
                return;
            }
            n.b("Ch4omeLiteLite", "webpage dead with response code " + i, new Object[0]);
            if (b.this.t != null) {
                b.this.t.i(str2);
            }
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void b() {
        if (canGoBack()) {
            goBack();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = false;
        this.v = true;
        a(context);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void a(String str, String str2, String str3) {
        this.t.a(str, str2, str3);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = false;
        this.v = true;
        a(context);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void a(String str, String str2, String str3, boolean z) {
        this.t.a(str, str2, str3, z);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public boolean a() {
        if (canGoBack()) {
            if (!this.u) {
                n.c("Ch4omeLite", "The land page didn't load correctly in this session, send BACK event to activity instead of webview.", new Object[0]);
                e();
                return false;
            }
            goBack();
            return true;
        }
        e();
        return false;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.c
    public void a(String str) {
        loadUrl(str);
    }

    private void a(Context context) {
        this.t = new com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view.a(context, this, this);
        j();
        f();
        h();
        i();
        g();
    }
}
