package com.anythink.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.basead.a.e;
import com.anythink.core.common.h.w;
import com.anythink.core.express.web.BaseWebView;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.webview.ProgressBar;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;
    private static final String e = "CommonWebView";

    /* renamed from: a, reason: collision with root package name */
    protected ToolBar f4665a;
    protected ToolBar b;
    protected ProgressBar c;
    protected BaseWebView d;
    private ProgressBar f;
    private int g;
    private int h;
    private RelativeLayout i;
    private View.OnClickListener j;
    private com.anythink.expressad.atsignalcommon.commonwebview.b k;
    private com.anythink.expressad.atsignalcommon.commonwebview.a l;
    private View.OnClickListener m;
    private View.OnClickListener n;
    private View.OnClickListener o;
    private View.OnClickListener p;

    /* renamed from: q, reason: collision with root package name */
    private Handler f4666q;
    private int r;
    private WebViewClient s;
    private String t;
    private b u;
    private boolean v;
    private final Runnable w;

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.r;
                if (CommonWebView.this.u != null) {
                    CommonWebView.this.v = false;
                    b bVar = CommonWebView.this.u;
                    String unused2 = CommonWebView.this.t;
                    bVar.a();
                }
            }
        };
        init();
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.r;
                if (CommonWebView.this.u != null) {
                    CommonWebView.this.v = false;
                    b bVar = CommonWebView.this.u;
                    String unused2 = CommonWebView.this.t;
                    bVar.a();
                }
            }
        };
        init();
    }

    public CommonWebView(Context context) {
        super(context);
        this.w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.r;
                if (CommonWebView.this.u != null) {
                    CommonWebView.this.v = false;
                    b bVar = CommonWebView.this.u;
                    String unused2 = CommonWebView.this.t;
                    bVar.a();
                }
            }
        };
        init();
    }

    public WebView getWebView() {
        return this.d;
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.i = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.i, layoutParams);
        this.g = v.b(getContext(), 40.0f);
        this.h = v.b(getContext(), 40.0f);
        this.k = new com.anythink.expressad.atsignalcommon.commonwebview.b();
        this.l = new com.anythink.expressad.atsignalcommon.commonwebview.a();
        initWebview();
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f4665a.getParent()).removeView(this.f4665a);
        this.i.addView(this.f4665a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f4665a.getParent()).removeView(this.f4665a);
        addView(this.f4665a, 0);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z) {
        a(arrayList, z);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                CommonWebView.this.c.setVisible(true);
                CommonWebView.this.c.setProgressState(5);
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                if (i == 100) {
                    CommonWebView.this.c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.c);
        this.c.initResource(true);
    }

    public void hideToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(8);
        }
    }

    public void showToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(0);
        }
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f4665a;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.b) == null) ? item : toolBar.getItem(str);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f4665a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f4665a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.b;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.b;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.o = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.p = onClickListener;
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    private void a() {
        if (this.b != null) {
            return;
        }
        this.b = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.h);
        layoutParams.bottomMargin = 0;
        this.b.setLayoutParams(layoutParams);
        this.b.setBackgroundColor(-1);
        this.b.setOnItemClickListener(new AnonymousClass4());
        addWebViewClient(new AnonymousClass5());
        addView(this.b);
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView$4, reason: invalid class name */
    final class AnonymousClass4 implements View.OnClickListener {
        AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (CommonWebView.this.d != null) {
                CommonWebView.this.d.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, "backward")) {
                    CommonWebView.this.b.getItem("forward").setEnabled(true);
                    if (CommonWebView.this.d.canGoBack()) {
                        CommonWebView.this.d.goBack();
                    }
                    CommonWebView.this.b.getItem("backward").setEnabled(CommonWebView.this.d.canGoBack());
                    if (CommonWebView.this.m != null) {
                        CommonWebView.this.m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, "forward")) {
                    CommonWebView.this.b.getItem("backward").setEnabled(true);
                    if (CommonWebView.this.d.canGoForward()) {
                        CommonWebView.this.d.goForward();
                    }
                    CommonWebView.this.b.getItem("forward").setEnabled(CommonWebView.this.d.canGoForward());
                    if (CommonWebView.this.n != null) {
                        CommonWebView.this.n.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, "refresh")) {
                    CommonWebView.this.b.getItem("backward").setEnabled(CommonWebView.this.d.canGoBack());
                    CommonWebView.this.b.getItem("forward").setEnabled(CommonWebView.this.d.canGoForward());
                    CommonWebView.this.d.reload();
                    if (CommonWebView.this.o != null) {
                        CommonWebView.this.o.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, "exits")) {
                    if (CommonWebView.this.j != null) {
                        CommonWebView.this.j.onClick(view);
                    }
                } else if (TextUtils.equals(str, "open_by_browser")) {
                    if (CommonWebView.this.p != null) {
                        CommonWebView.this.p.onClick(view);
                    }
                    e.a(CommonWebView.this.getContext(), CommonWebView.this.d.getUrl());
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView$5, reason: invalid class name */
    final class AnonymousClass5 extends WebViewClient {
        AnonymousClass5() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.b.getItem("backward").setEnabled(true);
            CommonWebView.this.b.getItem("forward").setEnabled(false);
            return false;
        }
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z) {
        if (this.f4665a != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.b = 40;
        ToolBar.a.c = 80;
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f4665a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.g);
            layoutParams.addRule(10);
            this.f4665a.setLayoutParams(layoutParams);
            this.i.addView(this.f4665a);
            return;
        }
        this.f4665a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.g));
        addView(this.f4665a, 0);
    }

    public void initWebview() {
        try {
            if (this.d == null) {
                this.d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.d.setLayoutParams(layoutParams);
            com.anythink.core.express.web.b bVar = this.d.mWebViewClient;
            this.d.setWebViewClient(this.k);
            this.d.setWebChromeClient(this.l);
            addWebViewClient(bVar);
        } catch (Throwable unused) {
        }
        this.i.addView(this.d);
    }

    public void loadUrl(String str) {
        this.d.loadUrl(str);
        if (this.s != null) {
            c();
        }
    }

    public String getUrl() {
        BaseWebView baseWebView = this.d;
        if (baseWebView == null) {
            return "";
        }
        return baseWebView.getUrl();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.k.a(webViewClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.k.b(webViewClient);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.l.a(webChromeClient);
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.l.b(webChromeClient);
    }

    public void setToolBarTitle(String str, int i) {
        this.f4665a.setTitle(str, i);
    }

    public void setToolBarTitle(String str) {
        this.f4665a.setTitle(str);
    }

    public void showToolBarTitle() {
        this.f4665a.showTitle();
    }

    public void hideToolBarTitle() {
        this.f4665a.hideTitle();
    }

    public void useDeeplink() {
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.6
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (u.a.a(str) && e.a(webView.getContext(), str, (w) null).m) {
                    return true;
                }
                return CommonWebView.this.a(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.addCategory("android.intent.category.BROWSABLE");
                            parseUri.setComponent(null);
                            parseUri.setSelector(null);
                            parseUri.setFlags(268435456);
                            getContext().startActivity(parseUri);
                            return true;
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals("https")) {
                                str = stringExtra;
                            }
                            webView.loadUrl(stringExtra);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                if (e.a(getContext(), str, "")) {
                    return true;
                }
                if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
                    if (!str.startsWith("https")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th3) {
            th3.getMessage();
            return false;
        }
    }

    public void setPageLoadTimtout(int i) {
        this.r = i;
        if (this.f4666q == null) {
            this.f4666q = new Handler(Looper.getMainLooper());
        }
        if (this.s == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.t = str;
                    if (CommonWebView.this.v) {
                        return;
                    }
                    CommonWebView.this.v = true;
                    CommonWebView.this.c();
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.t = str;
                    if (CommonWebView.this.v) {
                        CommonWebView.k(CommonWebView.this);
                    }
                    CommonWebView.this.v = true;
                    CommonWebView.this.c();
                    return false;
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.v = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i2, String str, String str2) {
                    CommonWebView.this.v = false;
                    CommonWebView.k(CommonWebView.this);
                }
            };
            this.s = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    private void b() {
        this.f4666q.removeCallbacks(this.w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f4666q.postDelayed(this.w, this.r);
    }

    public void setPageLoadTimtoutListener(b bVar) {
        this.u = bVar;
    }

    public void useDefaultToolBar() {
        if (this.b == null) {
            this.b = new ToolBar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.h);
            layoutParams.bottomMargin = 0;
            this.b.setLayoutParams(layoutParams);
            this.b.setBackgroundColor(-1);
            this.b.setOnItemClickListener(new AnonymousClass4());
            addWebViewClient(new AnonymousClass5());
            addView(this.b);
        }
    }

    static /* synthetic */ void k(CommonWebView commonWebView) {
        commonWebView.f4666q.removeCallbacks(commonWebView.w);
    }
}
