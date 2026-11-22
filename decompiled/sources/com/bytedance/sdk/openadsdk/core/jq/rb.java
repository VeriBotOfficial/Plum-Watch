package com.bytedance.sdk.openadsdk.core.jq;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.baidu.mapapi.SDKInitializer;
import com.bytedance.sdk.component.jq.bh;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.jq.gff;
import com.bytedance.sdk.openadsdk.core.yws;
import com.bytedance.sdk.openadsdk.utils.qhf;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.luck.picture.lib.config.PictureMimeType;
import com.phancy.mini.utils.MimeExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rb extends com.bytedance.sdk.component.jq.bh implements gff.InterfaceC0513gff {
    AtomicBoolean bh;
    private int ckl;
    private String dgx;
    private com.bytedance.sdk.openadsdk.core.model.jz hie;
    protected boolean hm;
    private gff jq;
    private int mvp;
    protected boolean rb;
    private List<String> rlu;

    /* renamed from: sg, reason: collision with root package name */
    AtomicBoolean f9487sg;
    private jz tw;
    private long xdg;
    private kg zu;

    public interface kg {
        View fxn();

        void fxn(int i, int i2);

        void fxn(View view, int i);

        void kg();
    }

    public rb(Context context) {
        super(context);
        this.hm = false;
        this.rb = false;
        this.bh = new AtomicBoolean(false);
        this.f9487sg = new AtomicBoolean(false);
        this.mvp = 0;
    }

    public void fxn(com.bytedance.sdk.openadsdk.core.model.jz jzVar, kg kgVar, String str) {
        this.zu = kgVar;
        this.hie = jzVar;
        this.dgx = str;
        this.jq = new gff();
        this.tw = new jz(getContext());
        setWebViewClient(new fxn(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.jq.rb.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                rb.this.ckl = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    rb.this.fxn();
                }
            }
        });
        com.bytedance.sdk.component.utils.jq.kg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jq.rb.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = rb.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.jq.rb.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            rb.this.tw.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    private void ums() {
        if (this.rlu == null) {
            com.bytedance.sdk.openadsdk.hm.gff.kg(this.hie, this.dgx, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.hm.gff.fxn(new com.bytedance.sdk.component.tw.tw("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.jq.rb.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (rb.this.rlu != null && rb.this.f9487sg.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = rb.this.rlu.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.hm.gff.kg(rb.this.hie, rb.this.dgx, "dsp_html_error_url", jSONObject);
                            rb.this.rlu = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.jq.bh
    public void xdg() {
        this.jq.kg();
        super.xdg();
    }

    public void fxn(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.jq.fxn(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.component.jq.bh, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.hm) {
            this.jq.fxn(getWebView());
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.rb = z;
        this.jq.fxn(z);
    }

    @Override // com.bytedance.sdk.component.jq.bh, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.jq.fxn();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.ckl / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.hm.gff.kg(this.hie, this.dgx, "load_rate", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jq.gff.InterfaceC0513gff
    public void fxn(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || this.hie == null || !this.tw.kg()) {
            return;
        }
        int fxn2 = qhf.fxn(this.dgx);
        View view = null;
        if (!com.bytedance.sdk.component.utils.je.fxn(str) && (this.hie.vd() == null || TextUtils.isEmpty(this.hie.vd().fxn()))) {
            com.bytedance.sdk.openadsdk.core.model.rlu rluVar = new com.bytedance.sdk.openadsdk.core.model.rlu();
            rluVar.fxn(str);
            this.hie.fxn(rluVar);
            str = null;
        }
        this.hie.gff(true);
        com.bytedance.sdk.openadsdk.core.model.jz jzVar = this.hie;
        if (jzVar == null || jzVar.vd() == null || TextUtils.isEmpty(this.hie.vd().fxn())) {
            z = false;
        } else {
            z = yws.fxn(getContext(), this.hie, fxn2, this.dgx, true, (Map<String, Object>) null);
            if (!z && !TextUtils.isEmpty(this.hie.vd().kg())) {
                str = this.hie.vd().kg();
                com.bytedance.sdk.openadsdk.hm.gff.fxn(this.hie, this.dgx, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!z) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                yws.fxn(getContext(), this.hie, fxn2, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.hm.fxn) null, this.dgx, true, str2);
            }
        }
        if (this.tw != null) {
            kg kgVar = this.zu;
            if (kgVar != null) {
                view = kgVar.fxn();
                this.zu.fxn(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.mvp fxn3 = this.tw.fxn(getContext(), view);
            HashMap hashMap = new HashMap();
            hashMap.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.hm.gff.fxn("click", this.hie, fxn3, this.dgx, true, (Map<String, Object>) hashMap, this.tw.kg() ? 1 : 2);
        }
        jz jzVar2 = this.tw;
        if (jzVar2 != null) {
            jzVar2.fxn();
        }
    }

    public void ud() {
        kg kgVar = this.zu;
        if (kgVar != null) {
            kgVar.kg();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.xdg);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.hm.gff.kg(this.hie, this.dgx, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jq.gff.InterfaceC0513gff
    public void fxn(int i, int i2) {
        kg kgVar = this.zu;
        if (kgVar != null) {
            kgVar.fxn(i, i2);
        }
        this.mvp = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.xdg);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.hm.gff.kg(this.hie, this.dgx, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jq.gff.InterfaceC0513gff
    public void kg(String str) {
        if (this.rlu == null) {
            this.rlu = new ArrayList();
        }
        this.rlu.add(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jq.gff.InterfaceC0513gff
    public void fxn() {
        if (this.bh.compareAndSet(false, true)) {
            this.hm = true;
            this.jq.fxn(getWebView());
            this.jq.fxn(this.rb);
            ud();
            ums();
        }
    }

    public void dx() {
        this.bh.set(false);
        String vt = this.hie.vt();
        if (TextUtils.isEmpty(vt)) {
            return;
        }
        String fxn2 = com.bytedance.sdk.openadsdk.core.mvp.rb.fxn(vt);
        String str = TextUtils.isEmpty(fxn2) ? vt : fxn2;
        this.mvp = 0;
        fxn(null, str, MimeExtKt.MIME_TYPE_HTML, "UTF-8", null);
        this.xdg = SystemClock.elapsedRealtime();
    }

    static class fxn extends bh.fxn {
        public static final Set<String> fxn = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.jq.rb.fxn.1
            {
                add(".jpeg");
                add(PictureMimeType.PNG);
                add(PictureMimeType.BMP);
                add(".gif");
                add(PictureMimeType.JPG);
                add(".webp");
            }
        };
        gff.InterfaceC0513gff kg;

        public fxn(gff.InterfaceC0513gff interfaceC0513gff) {
            this.kg = interfaceC0513gff;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.kg.fxn(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                fxn(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            fxn(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            fxn(webResourceRequest.getUrl().toString());
        }

        private void fxn(String str) {
            int lastIndexOf;
            gff.InterfaceC0513gff interfaceC0513gff;
            if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!fxn.contains(str.substring(lastIndexOf).toLowerCase()) || (interfaceC0513gff = this.kg) == null) {
                    return;
                }
                interfaceC0513gff.kg(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            gff.InterfaceC0513gff interfaceC0513gff = this.kg;
            if (interfaceC0513gff != null) {
                interfaceC0513gff.fxn();
            }
        }

        private void fxn(String str, int i, String str2) {
            gff.InterfaceC0513gff interfaceC0513gff = this.kg;
            if (interfaceC0513gff != null) {
                interfaceC0513gff.fxn(106, i);
            }
        }
    }

    public static class gff {
        protected int fxn = 0;
        private com.bytedance.sdk.openadsdk.core.mvp.bh kg = com.bytedance.sdk.openadsdk.core.mvp.bh.fxn();

        gff() {
        }

        public void fxn(WebView webView) {
            if (webView != null && this.fxn == 0) {
                if (this.kg == null) {
                    this.kg = com.bytedance.sdk.openadsdk.core.mvp.bh.fxn();
                }
                this.kg.fxn(webView);
                this.kg.kg();
                this.fxn = 1;
            }
        }

        public void fxn(boolean z) {
            com.bytedance.sdk.openadsdk.core.mvp.bh bhVar;
            if (this.fxn == 1 && z && (bhVar = this.kg) != null) {
                bhVar.gff();
                this.fxn = 3;
            }
        }

        public void fxn(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.mvp.bh bhVar = this.kg;
            if (bhVar != null) {
                bhVar.fxn(view, friendlyObstructionPurpose);
            }
        }

        public void fxn() {
            com.bytedance.sdk.openadsdk.core.mvp.bh bhVar;
            int i = this.fxn;
            if (i != 0 && i != 4 && (bhVar = this.kg) != null) {
                bhVar.hm();
            }
            this.fxn = 4;
            this.kg = null;
        }

        public void kg() {
            fxn();
        }
    }
}
