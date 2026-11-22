package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.alibaba.fastjson.parser.JSONLexer;
import com.iflytek.cloud.SpeechConstant;
import com.phancy.mini.utils.MimeExtKt;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.u;
import sg.bigo.ads.common.i;
import sg.bigo.ads.core.g.d;
import sg.bigo.ads.core.g.e;
import sg.bigo.ads.core.g.f;

/* loaded from: classes9.dex */
public final class b extends sg.bigo.ads.core.h.b implements sg.bigo.ads.core.g.a {

    /* renamed from: a, reason: collision with root package name */
    e f20047a;
    a b;
    Runnable c;
    public u d;
    sg.bigo.ads.common.ac.a e;
    AtomicBoolean f;
    private final String k;
    private final f l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;

    /* renamed from: q, reason: collision with root package name */
    private final i f20048q;
    private final AtomicBoolean r;
    private boolean s;

    public interface a {
        void a();
    }

    public b(Context context, String str, int i, int i2, f fVar, String str2, int i3, u uVar) {
        super(context);
        this.f20048q = new i();
        this.f = new AtomicBoolean(false);
        this.s = true;
        this.k = str;
        this.o = i;
        this.p = i2;
        this.l = fVar;
        this.m = str2;
        this.n = i3;
        this.d = uVar;
        this.r = new AtomicBoolean(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        this.e = new sg.bigo.ads.common.ac.a(getContext());
        setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.g.a.b.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.f.set(false);
                b.this.e.onTouchEvent(motionEvent);
                return false;
            }
        });
        setWebViewClient(new c(str) { // from class: sg.bigo.ads.core.g.a.b.2
            @Override // sg.bigo.ads.core.g.a.c, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                b bVar = b.this;
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                if (bVar.b != null) {
                    bVar.b.a();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str3) {
                super.onPageFinished(webView, str3);
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "onPageFinished: ".concat(String.valueOf(str3)));
                if (b.this.r.compareAndSet(false, true)) {
                    final b bVar = b.this;
                    final ValueCallback<String> valueCallback = new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.2.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str4) {
                            String str5 = str4;
                            b.this.d.b(1);
                            b.this.d.f19549a = str5 != null ? str5 : "";
                            StringBuilder sb = new StringBuilder("handshakeVersion: ");
                            if (str5 == null) {
                                str5 = "";
                            }
                            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", sb.append(str5).toString());
                        }
                    };
                    bVar.d.a(1);
                    bVar.evaluateJavascript("window.vpaidwrapper.handshakeVersion('2.0')", new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.6
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str4) {
                            valueCallback.onReceiveValue(str4);
                        }
                    });
                    b.this.b();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i4, String str3, String str4) {
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Error: ".concat(String.valueOf(str3)));
                super.onReceivedError(webView, i4, str3, str4);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                sg.bigo.ads.common.ac.a aVar;
                b bVar = b.this;
                try {
                    Uri parse = Uri.parse(str3);
                    if (parse != null) {
                        String scheme = parse.getScheme();
                        String host = parse.getHost();
                        if (host != null) {
                            if ("vpaid".equals(scheme) || (aVar = bVar.e) == null || !aVar.f19559a.f19560a) {
                                HashMap hashMap = new HashMap();
                                for (String str4 : parse.getQueryParameterNames()) {
                                    hashMap.put(str4, TextUtils.join(",", parse.getQueryParameters(str4)));
                                }
                                host.hashCode();
                                char c = 65535;
                                switch (host.hashCode()) {
                                    case -1657484168:
                                        if (host.equals("onAdSkippableStateChange")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case -1633535831:
                                        if (host.equals("onAdVideoStart")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case -1354015358:
                                        if (host.equals("onAdLog")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case -1347047775:
                                        if (host.equals("onAdVideoMidpoint")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case -1160015669:
                                        if (host.equals("onAdExpandedChange")) {
                                            c = 4;
                                            break;
                                        }
                                        break;
                                    case -742226534:
                                        if (host.equals("onAdVideoFirstQuartile")) {
                                            c = 5;
                                            break;
                                        }
                                        break;
                                    case -609164954:
                                        if (host.equals("onAdDurationChange")) {
                                            c = 6;
                                            break;
                                        }
                                        break;
                                    case -560906938:
                                        if (host.equals("onStartAd")) {
                                            c = 7;
                                            break;
                                        }
                                        break;
                                    case -307657838:
                                        if (host.equals("onAdVideoComplete")) {
                                            c = '\b';
                                            break;
                                        }
                                        break;
                                    case -164095715:
                                        if (host.equals("onAdClickThru")) {
                                            c = '\t';
                                            break;
                                        }
                                        break;
                                    case 98253676:
                                        if (host.equals("onAdPlaying")) {
                                            c = '\n';
                                            break;
                                        }
                                        break;
                                    case 116028939:
                                        if (host.equals("onAdImpression")) {
                                            c = 11;
                                            break;
                                        }
                                        break;
                                    case 159970502:
                                        if (host.equals("onAdError")) {
                                            c = '\f';
                                            break;
                                        }
                                        break;
                                    case 183427630:
                                        if (host.equals("onAdUserAcceptInvitation")) {
                                            c = '\r';
                                            break;
                                        }
                                        break;
                                    case 590531255:
                                        if (host.equals("onAdLinearChange")) {
                                            c = 14;
                                            break;
                                        }
                                        break;
                                    case 652779159:
                                        if (host.equals("VPAIDCreativeError")) {
                                            c = 15;
                                            break;
                                        }
                                        break;
                                    case 861234439:
                                        if (host.equals("onAdLoaded")) {
                                            c = 16;
                                            break;
                                        }
                                        break;
                                    case 963431984:
                                        if (host.equals("onAdPaused")) {
                                            c = 17;
                                            break;
                                        }
                                        break;
                                    case 1497850049:
                                        if (host.equals("onSkipAd")) {
                                            c = 18;
                                            break;
                                        }
                                        break;
                                    case 1506340484:
                                        if (host.equals("onStopAd")) {
                                            c = 19;
                                            break;
                                        }
                                        break;
                                    case 1648218545:
                                        if (host.equals("onAdRemainingTimeChange")) {
                                            c = 20;
                                            break;
                                        }
                                        break;
                                    case 1654690129:
                                        if (host.equals("onAdVideoThirdQuartile")) {
                                            c = 21;
                                            break;
                                        }
                                        break;
                                    case 1697251091:
                                        if (host.equals("onAdSizeChange")) {
                                            c = 22;
                                            break;
                                        }
                                        break;
                                    case 1701669456:
                                        if (host.equals("onAdInteraction")) {
                                            c = 23;
                                            break;
                                        }
                                        break;
                                    case 2014353132:
                                        if (host.equals("onAdVolumeChange")) {
                                            c = 24;
                                            break;
                                        }
                                        break;
                                    case 2047444747:
                                        if (host.equals("onAdUserMinimize")) {
                                            c = 25;
                                            break;
                                        }
                                        break;
                                    case 2114403499:
                                        if (host.equals("onAdUserClose")) {
                                            c = JSONLexer.EOI;
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.g();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        bVar.d.b(3);
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.b();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.b((String) hashMap.get("message"));
                                            break;
                                        }
                                        break;
                                    case 3:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.d();
                                            break;
                                        }
                                        break;
                                    case 4:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.a(d.c((String) hashMap.get(com.anythink.core.express.b.a.g)));
                                            break;
                                        }
                                        break;
                                    case 5:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.c();
                                            break;
                                        }
                                        break;
                                    case 6:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.a((int) d.b((String) hashMap.get("duration")));
                                            break;
                                        }
                                        break;
                                    case 7:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.j();
                                            break;
                                        }
                                        break;
                                    case '\b':
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.f();
                                            break;
                                        }
                                        break;
                                    case '\t':
                                        bVar.d.a((String) hashMap.get("url"), (String) hashMap.get("id"), d.c((String) hashMap.get("playerHandles")));
                                        if (bVar.f20047a != null && bVar.f.compareAndSet(false, true)) {
                                            bVar.f20047a.a((String) hashMap.get("url"), (String) hashMap.get("id"), d.c((String) hashMap.get("playerHandles")));
                                            break;
                                        }
                                        break;
                                    case '\n':
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.i();
                                            break;
                                        }
                                        break;
                                    case 11:
                                        bVar.d.b(4);
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.a();
                                            break;
                                        }
                                        break;
                                    case '\f':
                                        sg.bigo.ads.common.n.d.a(bVar.c);
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.a((String) hashMap.get("message"));
                                            break;
                                        }
                                        break;
                                    case '\r':
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.n();
                                            break;
                                        }
                                        break;
                                    case 14:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.b(d.c((String) hashMap.get("adLinear")));
                                            break;
                                        }
                                        break;
                                    case 15:
                                        sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "VPAID error, command=" + ((String) hashMap.get(com.heytap.mcssdk.constant.b.y)) + ", message=" + ((String) hashMap.get("msg")) + ", try to rePrepareAd.");
                                        bVar.b();
                                        break;
                                    case 16:
                                        sg.bigo.ads.common.n.d.a(bVar.c);
                                        bVar.d.b(2);
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.h();
                                            break;
                                        }
                                        break;
                                    case 17:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.m();
                                            break;
                                        }
                                        break;
                                    case 18:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.l();
                                            break;
                                        }
                                        break;
                                    case 19:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.k();
                                            break;
                                        }
                                        break;
                                    case 20:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.b((int) d.b((String) hashMap.get("remaining")));
                                            break;
                                        }
                                        break;
                                    case 21:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.e();
                                            break;
                                        }
                                        break;
                                    case 22:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.a(d.a((String) hashMap.get("w")), d.a((String) hashMap.get("h")));
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.c((String) hashMap.get("id"));
                                            break;
                                        }
                                        break;
                                    case 24:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.a(d.a((String) hashMap.get(SpeechConstant.VOLUME)));
                                            break;
                                        }
                                        break;
                                    case 25:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.o();
                                            break;
                                        }
                                        break;
                                    case 26:
                                        if (bVar.f20047a != null) {
                                            bVar.f20047a.p();
                                            break;
                                        }
                                        break;
                                }
                                bVar.a("window.vpaidwrapper.nativeCallComplete(" + JSONObject.quote(host) + Separators.RPAREN);
                            } else if (bVar.f20047a != null && bVar.f.compareAndSet(false, true)) {
                                bVar.d.a(str3, "", false);
                                bVar.f20047a.a(str3, "", false);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
        });
        setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.g.a.b.3
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        });
        sg.bigo.ads.common.n.d.a(this.c);
        if (this.c == null) {
            this.c = new Runnable() { // from class: sg.bigo.ads.core.g.a.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f20047a != null) {
                        b.this.f20047a.a("vpaid prepare timeout");
                    }
                }
            };
        }
        sg.bigo.ads.common.n.d.a(3, this.c, 15000L);
        loadDataWithBaseURL("http://127.0.0.1/", "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>VPAID AD</title>\n    <script>\n        window.onload = function() {\n            tryToPrepareAd();\n        }\n\n        document.onreadystatechange = function() {\n            tryToPrepareAd();\n        }\n\n        function tryToPrepareAd() {\n            if (document.readyState != \"complete\") {\n                return;\n            }\n\n            if (window.vpaidwrapper && window.vpaidwrapper.isVPAIDCreativeReady()) {\n                return;\n            }\n\n            window.vpaidframe = document.getElementById(\"vpaid-iframe\");\n            if (window.vpaidframe) {\n                var fn = window.vpaidframe.contentWindow['getVPAIDAd'];\n                var vpaidDiv = document.getElementById(\"vpaid-container\");\n                var vpaidframeDoc = window.vpaidframe.contentDocument || window.vpaidframe.contentWindow.document;\n                var slot = vpaidframeDoc.getElementById(\"slot\");\n                var videoSlot = document.getElementById(\"video-slot\");\n                var vpaidwrapper;\n                if (fn && typeof fn == 'function') {\n                    vpaidwrapper = new VPAIDWrapper(fn(), vpaidDiv, slot, videoSlot)\n                } else {\n                    vpaidwrapper = new VPAIDWrapper();\n                }\n                window.vpaidwrapper = vpaidwrapper;\n            }\n        }\n    </script>\n    <script src=\"vpaid.js\" type=\"text/javascript\"></script>\n</head>\n\n<body style=\"display: flex; justify-content: center; align-items: center;\">\n<div id=\"ad-container\">\n    <video height=\"100%\" id=\"video-slot\" muted playsinline width=\"100%\"></video>\n</div>\n<div id=\"vpaid-container\"\n     style=\"position: absolute; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none;\">\n    <iframe frameborder=\"0\" height=\"100%\" id=\"vpaid-iframe\" marginheight=\"0\" marginwidth=\"0\"\n            scrolling=\"no\"\n            src=\"vpaid_iframe.html\"\n            style=\"margin: 0px; padding: 0px; border: none;\"\n            width=\"100%\"></iframe>\n</div>\n</body>\n</html>", MimeExtKt.MIME_TYPE_HTML, "UTF-8", null);
        setLayoutParams((i3 == 1 || i3 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    private void a(int i, int i2) {
        u uVar = this.d;
        if (uVar == null || !uVar.j) {
            return;
        }
        a("window.vpaidwrapper.resizeAd(" + sg.bigo.ads.common.utils.e.c(getContext(), i) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), i2) + ", " + JSONObject.quote(this.l.d) + Separators.RPAREN);
    }

    private String b(String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        evaluateJavascript(str, new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                countDownLatch.countDown();
                strArr[0] = str2;
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        return strArr[0];
    }

    private void b(int i, int i2) {
        setMeasuredDimension(i, i2);
        a(i, i2);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        a("window.vpaidwrapper.pauseAd()");
    }

    public final void a(String str) {
        if (!this.r.get()) {
            sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Injecting Javascript into VPAID WebView error, creative no ready:\n\t".concat(String.valueOf(str)));
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", "Injecting Javascript into VPAID WebView:\n\t".concat(String.valueOf(str)));
            loadUrl("javascript:".concat(String.valueOf(str)));
        }
    }

    public final void b() {
        a("tryToPrepareAd()");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.m;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt("AdParameters", str);
        } catch (JSONException unused) {
        }
        this.d.a(2);
        a("window.vpaidwrapper.initAd(" + sg.bigo.ads.common.utils.e.c(getContext(), measuredWidth) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), measuredHeight) + ", " + JSONObject.quote(this.l.d) + ", -1, " + jSONObject + Separators.RPAREN);
    }

    @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebChromeClient(null);
        setWebViewClient(null);
    }

    @Override // sg.bigo.ads.core.h.e, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.f20048q.b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f20048q.f19641a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return this.s && super.dispatchTouchEvent(motionEvent);
    }

    public final String getAdCompanions() {
        return b("window.vpaidwrapper.getAdCompanions()");
    }

    public final int getAdDuration() {
        return (int) d.b(b("window.vpaidwrapper.getAdDuration()"));
    }

    public final boolean getAdExpanded() {
        return d.c(b("window.vpaidwrapper.getAdExpanded()"));
    }

    public final int getAdHeight() {
        return d.a(b("window.vpaidwrapper.getAdHeight()"));
    }

    public final boolean getAdIcons() {
        return d.c(b("window.vpaidwrapper.getAdIcons()"));
    }

    public final boolean getAdLinear() {
        return d.c(b("window.vpaidwrapper.getAdLinear()"));
    }

    public final int getAdRemainingTime() {
        return (int) d.b(b("window.vpaidwrapper.getAdRemainingTime()"));
    }

    public final boolean getAdSkippableState() {
        return d.c(b("window.vpaidwrapper.getAdSkippableState()"));
    }

    public final float getAdVolume() {
        return d.b(b("window.vpaidwrapper.getAdVolume()"));
    }

    public final int getAdWidth() {
        return d.a(b("window.vpaidwrapper.getAdWidth()"));
    }

    public final i getClickPoints() {
        return this.f20048q;
    }

    public final e getVPAIDEvenListener() {
        return this.f20047a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r0 != 4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r1 < (r3 * r5)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        r7 = (r3 * r5) / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r1 >= (r3 * r5)) goto L37;
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.b.onMeasure(int, int):void");
    }

    public final void setAdVolume(float f) {
        a("window.vpaidwrapper.setAdVolume(" + f + Separators.RPAREN);
    }

    public final void setOnRenderProcessGoneListener(a aVar) {
        this.b = aVar;
    }

    public final void setVPAIDClickable(boolean z) {
        this.s = z;
    }

    public final void setVPAIDEvenListener(e eVar) {
        this.f20047a = eVar;
    }
}
