package com.anythink.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class CollapsibleWebView extends CommonWebView {
    private static final String e = "CollapsibleWebView";
    private CopyOnWriteArrayList<CommonWebView.a> f;
    private CopyOnWriteArrayList<CommonWebView.a> g;
    private CopyOnWriteArrayList<a> h;
    private String i;
    private String j;

    public interface a {
        void a();

        void a(Map<String, String> map);

        void b();

        void c();
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCollapseIconName(String str) {
        this.i = str;
    }

    public String getCollapseIconName() {
        return this.i;
    }

    public void setExpandIconName(String str) {
        this.j = str;
    }

    public String getExpandIconName() {
        return this.j;
    }

    @Override // com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f = new CopyOnWriteArrayList<>();
        this.g = new CopyOnWriteArrayList<>();
        this.h = new CopyOnWriteArrayList<>();
        this.i = "arrow_down_white_blackbg";
        this.j = "arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.d = false;
        bVar.c = "arrow_down_white_blackbg";
        bVar.e = new AnonymousClass1();
        arrayList.add(bVar);
        ToolBar.b bVar2 = new ToolBar.b("doSpand");
        bVar2.c = "arrow_up_black";
        bVar2.e = new AnonymousClass2();
        arrayList.add(bVar2);
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    private ToolBar.b a() {
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.d = false;
        bVar.c = "arrow_down_white_blackbg";
        bVar.e = new AnonymousClass1();
        return bVar;
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView$1, reason: invalid class name */
    final class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.a(CollapsibleWebView.this);
        }
    }

    private ToolBar.b b() {
        ToolBar.b bVar = new ToolBar.b("doSpand");
        bVar.c = "arrow_up_black";
        bVar.e = new AnonymousClass2();
        return bVar;
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView$2, reason: invalid class name */
    final class AnonymousClass2 implements View.OnClickListener {
        AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.b(CollapsibleWebView.this);
        }
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new CommonWebView.b() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.3
            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.b
            public final void a() {
                CollapsibleWebView.c(CollapsibleWebView.this);
            }
        });
        setPageLoadTimtout(DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.4

            /* renamed from: a, reason: collision with root package name */
            Boolean f4664a = Boolean.FALSE;
            String b = "";

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.b = str;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                if (this.f4664a.booleanValue()) {
                    return;
                }
                CollapsibleWebView.d(CollapsibleWebView.this);
                this.f4664a = Boolean.FALSE;
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "error");
                hashMap.put("url", str2);
                hashMap.put("description", str);
                if (!this.f4664a.booleanValue() && this.b.equals(str2)) {
                    this.f4664a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, hashMap);
                }
                CollapsibleWebView.e(CollapsibleWebView.this);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "ssl");
                hashMap.put("url", sslError.getUrl());
                hashMap.put("description", "ssl error");
                if (!this.f4664a.booleanValue() && this.b.equals(sslError.getUrl())) {
                    this.f4664a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, hashMap);
                }
                CollapsibleWebView.e(CollapsibleWebView.this);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "http");
                String sb = new StringBuilder().append(webResourceRequest.getUrl()).toString();
                hashMap.put("url", sb);
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, new StringBuilder().append(webResourceResponse.getStatusCode()).toString());
                hashMap.put("description", "http error");
                if (!this.f4664a.booleanValue() && (this.b.equals(sb) || TextUtils.isEmpty(this.b))) {
                    this.f4664a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, hashMap);
                }
                CollapsibleWebView.e(CollapsibleWebView.this);
            }
        });
    }

    public void setCustomizedToolBarMarginWidthPixel(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f4665a.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.f4665a.setLayoutParams(layoutParams);
    }

    public void setCollapseListener(CommonWebView.a aVar) {
        this.f.add(aVar);
    }

    public void setExpandListener(CommonWebView.a aVar) {
        this.g.add(aVar);
    }

    public void setPageLoadListener(a aVar) {
        this.h.add(aVar);
    }

    private void c() {
        Iterator<a> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void a(Map<String, String> map) {
        Iterator<a> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(map);
        }
    }

    private void d() {
        Iterator<a> it = this.h.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void e() {
        Iterator<a> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void f() {
        Iterator<CommonWebView.a> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void g() {
        Iterator<CommonWebView.a> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ void b(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.g.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ void c(CollapsibleWebView collapsibleWebView) {
        Iterator<a> it = collapsibleWebView.h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    static /* synthetic */ void d(CollapsibleWebView collapsibleWebView) {
        Iterator<a> it = collapsibleWebView.h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, Map map) {
        Iterator<a> it = collapsibleWebView.h.iterator();
        while (it.hasNext()) {
            it.next().a(map);
        }
    }

    static /* synthetic */ void e(CollapsibleWebView collapsibleWebView) {
        Iterator<a> it = collapsibleWebView.h.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
