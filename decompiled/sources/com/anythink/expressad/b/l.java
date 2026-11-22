package com.anythink.expressad.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static long f4726a = 0;
    private static final String d = "l";
    private static final int p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f4727q = 2;
    private static final int r = 0;
    boolean b;
    boolean c;
    private int e;
    private int f;
    private com.anythink.expressad.f.a h;
    private a i;
    private String j;
    private String k;
    private WebView l;
    private boolean m;
    private String n;
    private int o;
    private boolean t;
    private boolean s = false;
    private final Runnable u = new Runnable() { // from class: com.anythink.expressad.b.l.4
        @Override // java.lang.Runnable
        public final void run() {
            l.n(l.this);
            l.this.o = 1;
            String unused = l.d;
            int unused2 = l.this.f;
            l.p(l.this);
        }
    };
    private final Runnable v = new Runnable() { // from class: com.anythink.expressad.b.l.5
        @Override // java.lang.Runnable
        public final void run() {
            l.n(l.this);
            l.this.o = 2;
            String unused = l.d;
            int unused2 = l.this.e;
            l.p(l.this);
        }
    };
    private Handler g = new Handler(Looper.getMainLooper());

    interface a {
        void a(String str, String str2);

        void a(String str, String str2, String str3);

        boolean a();

        boolean a(String str);

        boolean b(String str);
    }

    static /* synthetic */ boolean e(l lVar) {
        lVar.t = true;
        return true;
    }

    static /* synthetic */ boolean n(l lVar) {
        lVar.s = true;
        return true;
    }

    public l() {
        this.e = 15000;
        this.f = 3000;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b = com.anythink.expressad.f.b.b();
        this.h = b;
        if (b == null) {
            com.anythink.expressad.f.b.a();
            this.h = com.anythink.expressad.f.b.c();
        }
        this.m = this.h.u();
        this.e = (int) this.h.q();
        this.f = (int) this.h.q();
    }

    public final void a(String str, String str2, Context context, String str3, String str4, a aVar) {
        if (aVar == null) {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        }
        this.k = str4;
        this.j = str3;
        this.i = aVar;
        a(str, str2, context);
    }

    public final void a(String str, String str2, Context context, String str3, a aVar) {
        if (aVar == null) {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        }
        this.j = str3;
        this.i = aVar;
        a(str, str2, context);
    }

    private void a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.j);
        } else {
            this.g.post(new Runnable() { // from class: com.anythink.expressad.b.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    l lVar = l.this;
                    lVar.a(str, str2, context, lVar.j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.k)) {
                this.l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f = 2000;
                this.e = 2000;
                this.l.loadDataWithBaseURL(str3, this.k, "*/*", "utf-8", str3);
                return;
            }
            if (this.m) {
                HashMap hashMap = new HashMap();
                if (this.l.getUrl() != null) {
                    hashMap.put(HttpHeaders.REFERER, this.l.getUrl());
                }
                this.l.loadUrl(str3, hashMap);
                return;
            }
            this.l.loadUrl(str3);
        } catch (Throwable th) {
            try {
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.j, th.getMessage(), this.n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.l.getSettings().setCacheMode(2);
        this.l.getSettings().setLoadsImagesAutomatically(false);
        this.l.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.b.l.2
            private boolean a() {
                return l.this.b || l.this.c;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (l.this.t) {
                        l.this.o = 0;
                        l.c(l.this);
                        return;
                    }
                    l.this.c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        l.this.b = true;
                    }
                    synchronized (l.d) {
                        l.this.j = str3;
                        if (l.this.i != null && l.this.i.a(str3)) {
                            l.e(l.this);
                            l.c(l.this);
                        } else {
                            l.f(l.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (l.d) {
                    String unused = l.d;
                    l.this.c = true;
                    l.this.j();
                    if (l.this.t) {
                        l.this.h();
                        l.c(l.this);
                        return true;
                    }
                    l.this.j = str3;
                    if (l.this.i == null || !l.this.i.b(str3)) {
                        if (!l.this.m) {
                            l.this.l.loadUrl(str3);
                        } else {
                            HashMap hashMap = new HashMap();
                            if (l.this.l.getUrl() != null) {
                                hashMap.put(HttpHeaders.REFERER, l.this.l.getUrl());
                            }
                            l.this.l.loadUrl(str3, hashMap);
                        }
                        return true;
                    }
                    l.e(l.this);
                    l.this.h();
                    l.c(l.this);
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str3, String str4) {
                String unused = l.d;
                webView2.getUrl();
                synchronized (l.d) {
                    l.e(l.this);
                    l.this.f();
                    l.c(l.this);
                }
                if (l.this.i != null) {
                    l.this.i.a(webView2.getUrl(), str3, l.this.n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    String unused = l.d;
                    boolean z = com.anythink.expressad.a.r;
                    if (com.anythink.expressad.a.r && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    TextUtils.isEmpty(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    synchronized (l.d) {
                        l.e(l.this);
                        l.this.f();
                        l.c(l.this);
                    }
                    if (l.this.i != null) {
                        l.this.i.a(webView2.getUrl(), "WebView render process crash.", l.this.n);
                    }
                    if (webView2 != null) {
                        webView2.destroy();
                    }
                    return true;
                } catch (Throwable th) {
                    String unused = l.d;
                    th.getMessage();
                    return true;
                }
            }
        });
        this.l.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.b.l.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i) {
                if (i == 100) {
                    try {
                        String unused = l.d;
                        webView2.getUrl();
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!l.this.t && !l.this.c) {
                            l.m(l.this);
                        }
                        if (l.this.i != null) {
                            a unused2 = l.this.i;
                            webView2.getUrl();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void b() {
        synchronized (d) {
            try {
                f();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.j, this.n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void c() {
        synchronized (d) {
            try {
                f();
                this.l.destroy();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.j, this.n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void d() {
        h();
        this.g.postDelayed(this.v, this.e);
    }

    private void e() {
        j();
        this.g.postDelayed(this.u, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        j();
        h();
    }

    private void g() {
        this.g.postDelayed(this.v, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.g.removeCallbacks(this.v);
    }

    private void i() {
        this.g.postDelayed(this.u, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.g.removeCallbacks(this.u);
    }

    static /* synthetic */ void c(l lVar) {
        synchronized (d) {
            try {
                lVar.f();
                a aVar = lVar.i;
                if (aVar != null) {
                    aVar.a(lVar.j, lVar.n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ void f(l lVar) {
        lVar.h();
        lVar.g.postDelayed(lVar.v, lVar.e);
    }

    static /* synthetic */ void m(l lVar) {
        lVar.j();
        lVar.g.postDelayed(lVar.u, lVar.f);
    }

    static /* synthetic */ void p(l lVar) {
        synchronized (d) {
            try {
                lVar.f();
                lVar.l.destroy();
                a aVar = lVar.i;
                if (aVar != null) {
                    aVar.a(lVar.j, lVar.n);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
