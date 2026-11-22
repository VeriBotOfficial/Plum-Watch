package com.baidu.ar;

import android.R;
import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.util.LogUtil;
import com.baidu.ar.s4;
import com.baidu.mapapi.SDKInitializer;
import com.phancy.mini.utils.MiniStorage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class t4 {
    public static volatile t4 l;

    /* renamed from: a, reason: collision with root package name */
    public Context f7208a;
    public ViewGroup b;
    public View.OnTouchListener c;
    public View.OnTouchListener d;
    public ViewGroup f;
    public WebView g;
    public List<s4> e = new ArrayList();
    public volatile boolean h = true;
    public Handler i = new a(Looper.getMainLooper());
    public WebViewClient j = new f();
    public WebChromeClient k = new g();

    public class a extends Handler {

        /* renamed from: com.baidu.ar.t4$a$a, reason: collision with other inner class name */
        public class C0335a implements ValueCallback<String> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s4 f7210a;

            public C0335a(s4 s4Var) {
                this.f7210a = s4Var;
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                this.f7210a.invalidate();
                this.f7210a.setIsNeedRender(true);
                t4.this.b(((Integer) this.f7210a.getTag()).intValue());
            }
        }

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            s4 c;
            String str;
            super.handleMessage(message);
            Object obj = message.obj;
            s4.b bVar = obj instanceof s4.b ? (s4.b) obj : null;
            switch (message.what) {
                case 103:
                    t4.this.b(bVar);
                    break;
                case 104:
                    if (bVar != null && (c = t4.this.c(bVar.f7187a)) != null && (str = bVar.c) != null) {
                        c.evaluateJavascript(str, new C0335a(c));
                        break;
                    }
                    break;
                case 105:
                    s4 c2 = t4.this.c(message.arg1);
                    if (c2 != null) {
                        c2.setIsNeedRender(true);
                        c2.invalidate();
                        break;
                    }
                    break;
                case 106:
                    t4.this.d(bVar);
                    break;
            }
        }
    }

    public class b implements ARPDataInteraction.a {
        public b() {
        }

        @Override // com.baidu.ar.arplay.core.engine.ARPDataInteraction.a
        public boolean a(int i, int i2) {
            t4.this.d(i);
            return true;
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (t4.this.d != null) {
                return t4.this.d.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s4 f7213a;

        public d(s4 s4Var) {
            this.f7213a = s4Var;
        }

        @JavascriptInterface
        public void updateFinish(String str) {
            s4 s4Var = this.f7213a;
            if (s4Var == null) {
                return;
            }
            t4.this.d(((Integer) s4Var.getTag()).intValue());
        }
    }

    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (t4.this.c != null) {
                return t4.this.c.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
            int intValue = ((Integer) webView.getTag()).intValue();
            t4.this.a(intValue);
            t4.this.d(intValue);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError != null) {
                i iVar = new i(t4.this);
                iVar.b = webResourceError.getErrorCode();
                if (webResourceError.getDescription() != null) {
                    iVar.c = webResourceError.getDescription().toString();
                }
                t4.this.a(((Integer) webView.getTag()).intValue(), iVar);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (webResourceResponse != null) {
                i iVar = new i(t4.this);
                iVar.b = webResourceResponse.getStatusCode();
                iVar.c = webResourceResponse.getReasonPhrase();
                t4.this.a(((Integer) webView.getTag()).intValue(), iVar);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (sslError != null) {
                i iVar = new i(t4.this);
                iVar.b = sslError.getPrimaryError();
                iVar.c = "ssl error!";
                t4.this.a(((Integer) webView.getTag()).intValue(), iVar);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public class g extends WebChromeClient {
        public g() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (i == 100) {
                t4.this.d(((s4) webView).getWebViewData().f7187a);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.b(t4.class.getName(), "remove webviewList in ui thread");
            if (t4.this.e != null) {
                for (s4 s4Var : t4.this.e) {
                    if (s4Var != null) {
                        if (s4Var.getParent() == t4.this.b) {
                            t4.this.b.removeView(s4Var);
                        }
                        s4Var.destroy();
                    }
                }
                t4.this.e.clear();
                t4.this.e = null;
            }
        }
    }

    public class i {

        /* renamed from: a, reason: collision with root package name */
        public String f7218a = "android";
        public int b = 0;
        public String c;

        public i(t4 t4Var) {
        }
    }

    public static t4 a() {
        if (l == null) {
            synchronized (t4.class) {
                if (l == null) {
                    l = new t4();
                }
            }
        }
        return l;
    }

    public final s4 a(int i2, int i3) {
        s4 s4Var = new s4(this.f7208a);
        ViewGroup viewGroup = this.b;
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(i2, i3) : viewGroup instanceof LinearLayout ? new LinearLayout.LayoutParams(i2, i3) : viewGroup instanceof RelativeLayout ? new RelativeLayout.LayoutParams(i2, i3) : null;
        s4Var.setBackgroundColor(R.color.transparent);
        s4Var.setWebViewClient(this.j);
        s4Var.setWebChromeClient(this.k);
        s4Var.setHorizontalScrollBarEnabled(false);
        s4Var.setVerticalScrollBarEnabled(false);
        WebSettings settings = s4Var.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setJavaScriptEnabled(true);
        s4Var.addJavascriptInterface(new d(s4Var), "NativeCallback");
        s4Var.setOnTouchListener(new e());
        this.b.addView(s4Var, layoutParams);
        this.e.add(s4Var);
        return s4Var;
    }

    public final void a(int i2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.anythink.expressad.foundation.g.g.a.b.aS, "webView_operation_load_finish");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("texture_id", Integer.valueOf(i2));
        hashMap.put("event_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public final void a(int i2, i iVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.anythink.expressad.foundation.g.g.a.b.aS, "webView_operation_load_failed");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("texture_id", Integer.valueOf(i2));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("platform", iVar.f7218a);
        hashMap3.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(iVar.b));
        hashMap3.put("error_msg", iVar.c);
        hashMap2.put("data", hashMap3);
        hashMap.put("event_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
        d(i2);
    }

    public void a(Context context, ViewGroup viewGroup, View.OnTouchListener onTouchListener) {
        this.f7208a = context;
        this.b = viewGroup;
        this.c = onTouchListener;
        ARPEngine.getInstance().setHtmlUpdateCallback(new b());
    }

    public void a(s4.b bVar) {
        if (this.h) {
            Message obtainMessage = this.i.obtainMessage();
            obtainMessage.what = 103;
            obtainMessage.obj = bVar;
            this.i.sendMessage(obtainMessage);
        }
    }

    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.i.post(runnable);
        }
    }

    public void a(String str) {
    }

    public final void b(int i2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.anythink.expressad.foundation.g.g.a.b.aS, "webView_operation_update_finish");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("texture_id", Integer.valueOf(i2));
        hashMap.put("event_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public void b(Context context, ViewGroup viewGroup, View.OnTouchListener onTouchListener) {
        this.f7208a = context;
        this.f = viewGroup;
        this.d = onTouchListener;
    }

    public final void b(s4.b bVar) {
        if (bVar == null || !c()) {
            return;
        }
        s4 a2 = a(bVar.e, bVar.f);
        a2.setWebViewData(bVar);
        mc.a().a(bVar.f7187a, bVar.e, bVar.f);
        a2.setTag(Integer.valueOf(bVar.f7187a));
        String str = bVar.d;
        if (!bVar.b) {
            str = MiniStorage.SCHEME_FILE + this.f7208a.getFilesDir().getAbsolutePath().concat(File.separator) + "ar/" + str;
        }
        a2.loadUrl(str);
        a2.invalidate();
        a2.setIsNeedRender(true);
        e(bVar);
    }

    public final boolean b() {
        if (this.f7208a != null && this.f != null) {
            return true;
        }
        Log.e("GLWebView", "Native WebView context or root is null!");
        return false;
    }

    public final s4 c(int i2) {
        for (s4 s4Var : this.e) {
            if (s4Var != null && s4Var.getWebViewData() != null && s4Var.getWebViewData().f7187a == i2) {
                return s4Var;
            }
        }
        return null;
    }

    public void c(s4.b bVar) {
        if (this.h) {
            Message obtainMessage = this.i.obtainMessage();
            obtainMessage.what = 106;
            obtainMessage.obj = bVar;
            this.i.sendMessage(obtainMessage);
        }
    }

    public final boolean c() {
        if (this.f7208a != null && this.b != null) {
            return true;
        }
        Log.e("GLWebView", "GLWebView context or root is null!");
        return false;
    }

    public void d() {
        this.f7208a = null;
        mc.a().b();
        ARPEngine.getInstance().setHtmlUpdateCallback(null);
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            a(new h());
            this.i = null;
        }
        this.h = false;
        l = null;
        this.g = null;
        this.d = null;
    }

    public final void d(int i2) {
        if (this.h) {
            Message obtainMessage = this.i.obtainMessage();
            obtainMessage.what = 105;
            obtainMessage.arg1 = i2;
            this.i.sendMessage(obtainMessage);
        }
    }

    public final void d(s4.b bVar) {
        if (bVar == null || !b()) {
            return;
        }
        if (this.g == null) {
            WebView webView = new WebView(this.f7208a);
            this.g = webView;
            webView.setBackgroundColor(R.color.transparent);
            WebSettings settings = this.g.getSettings();
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            settings.setJavaScriptEnabled(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            this.g.setOnTouchListener(new c());
            this.f.addView(this.g, layoutParams);
        }
        String str = bVar.d;
        if (!bVar.b) {
            str = MiniStorage.SCHEME_FILE + this.f7208a.getFilesDir().getAbsolutePath().concat(File.separator) + "ar/" + str;
        }
        this.g.loadUrl(str);
        this.g.invalidate();
    }

    public void e(s4.b bVar) {
        if (this.h) {
            Message obtainMessage = this.i.obtainMessage();
            obtainMessage.what = 104;
            obtainMessage.obj = bVar;
            s4 c2 = c(bVar.f7187a);
            if (c2 != null) {
                c2.setWebViewData(bVar);
                this.i.sendMessage(obtainMessage);
            }
        }
    }
}
