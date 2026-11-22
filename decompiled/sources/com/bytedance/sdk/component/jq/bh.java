package com.bytedance.sdk.component.jq;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.jq.fxn;
import com.bytedance.sdk.component.utils.bx;
import com.phancy.mini.utils.MiniStorage;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class bh extends FrameLayout {
    private static gff wc;
    private kg ax;
    private JSONObject bh;
    private boolean bx;
    private bx ci;
    private View ckl;
    private long dgx;
    private boolean dx;
    private long ei;
    public int fxn;
    public int gff;
    private int ggo;
    private long hie;
    private com.bytedance.sdk.component.jq.kg.fxn hm;
    private AtomicBoolean ij;
    private Context ils;
    private boolean iwp;
    private List<String> je;
    private float jq;
    private boolean jz;
    private float ke;
    public int kg;
    private float mve;
    private long mvp;
    private hm qhf;
    private String rb;
    private boolean rlu;
    private com.bytedance.sdk.component.jq.fxn rmu;
    private AttributeSet rz;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9368sg;
    private AtomicBoolean swx;
    private float tw;
    private com.bytedance.sdk.component.jq.hm ud;
    private WebViewClient uhw;
    private boolean ums;
    private fxn.InterfaceC0479fxn xdg;
    private AtomicBoolean yws;
    private long zk;
    private float zn;
    private volatile WebView zu;

    public interface gff {
        WebView createWebView(Context context, AttributeSet attributeSet, int i);
    }

    public interface hm {
    }

    public interface kg {
    }

    private static Context fxn(Context context) {
        return context;
    }

    private static void gff(Context context) {
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public com.bytedance.sdk.component.jq.kg.fxn getMaterialMeta() {
        return this.hm;
    }

    public boolean i_() {
        return this.dx;
    }

    public void setLpPreRender(boolean z) {
        this.dx = z;
    }

    public boolean kg() {
        return this.ums;
    }

    public void setPreStart(boolean z) {
        this.ums = z;
    }

    public boolean gff() {
        return this.iwp;
    }

    public void setPreFinish(boolean z) {
        this.iwp = z;
    }

    public boolean hm() {
        return this.jz;
    }

    public void setPreProgressHundred(boolean z) {
        this.jz = z;
    }

    public void setPreError(boolean z) {
        this.bx = z;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.jq.kg.fxn fxnVar) {
        this.hm = fxnVar;
    }

    @Override // android.view.View
    public String getTag() {
        return this.rb;
    }

    public void setTag(String str) {
        this.rb = str;
        com.bytedance.sdk.component.jq.fxn fxnVar = this.rmu;
        if (fxnVar != null) {
            fxnVar.fxn(str);
        }
        com.bytedance.sdk.component.jq.hm hmVar = this.ud;
        if (hmVar != null) {
            hmVar.fxn(str);
        }
    }

    public void setLandingPage(boolean z) {
        this.f9368sg = z;
    }

    public void setTouchStateListener(hm hmVar) {
        this.qhf = hmVar;
    }

    public bh(Context context) {
        this(fxn(context), false);
    }

    public bh(Context context, boolean z) {
        super(fxn(context));
        this.tw = 0.0f;
        this.jq = 0.0f;
        this.hie = 0L;
        this.dgx = 0L;
        this.mvp = 0L;
        this.rlu = false;
        this.ke = 20.0f;
        this.zn = 50.0f;
        this.ij = new AtomicBoolean();
        this.yws = new AtomicBoolean();
        this.swx = new AtomicBoolean();
        this.ils = context;
        if (z) {
            return;
        }
        try {
            this.zu = fxn((AttributeSet) null, 0);
            bh();
        } catch (Throwable unused) {
        }
        kg(fxn(context));
    }

    public void fxn(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.zu != null && (this.zu instanceof rb)) {
            this.rmu = new com.bytedance.sdk.component.jq.fxn(this.ils, i, i2, list, i3);
            this.je = list2;
            if (!TextUtils.isEmpty(this.rb)) {
                this.rmu.fxn(this.rb);
            }
            ((rb) this.zu).setTouchListenerProxy(this.rmu);
            this.xdg = this.rmu.fxn();
        }
    }

    public void fxn(int i, long j) {
        if (this.zu == null || !(this.zu instanceof rb)) {
            return;
        }
        this.ud = new com.bytedance.sdk.component.jq.hm(this.ils, this.rmu, i, j, this);
        if (!TextUtils.isEmpty(this.rb)) {
            this.ud.fxn(this.rb);
        }
        ((rb) this.zu).setTouchListenerProxy(this.ud);
    }

    public void fxn(boolean z, View view) {
        if (z) {
            this.ckl = view;
            view.setVisibility(8);
            View view2 = this.ckl;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.ckl, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public View getArbitrageLoadingView() {
        return this.ckl;
    }

    public void rb() {
        try {
            this.zu = fxn(this.rz, 0);
            bh();
            kg(fxn(this.ils));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void setWebViewProvider(gff gffVar) {
        wc = gffVar;
    }

    private WebView fxn(AttributeSet attributeSet, int i) {
        gff gffVar = wc;
        if (gffVar != null) {
            return gffVar.createWebView(getContext(), attributeSet, i);
        }
        if (attributeSet == null) {
            return new WebView(fxn(this.ils));
        }
        return new WebView(fxn(this.ils), attributeSet);
    }

    public void setRecycler(boolean z) {
        if (this.zu == null || !(this.zu instanceof rb)) {
            return;
        }
        ((rb) this.zu).setRecycler(z);
    }

    public void bh() {
        if (this.zu != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.zu.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.zu, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void kg(Context context) {
        gff(context);
        dx();
        ud();
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.zu.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void fxn(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.zu.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.zu.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void fxn(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.zu.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void sg() {
        try {
            this.zu.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void tw() {
        try {
            this.zu.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean jq() {
        if (this.zu == null) {
            return false;
        }
        try {
            return this.zu.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void hie() {
        try {
            this.zu.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean dgx() {
        if (this.zu == null) {
            return false;
        }
        try {
            return this.zu.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void mvp() {
        try {
            this.zu.goForward();
        } catch (Throwable unused) {
        }
    }

    public void rlu() {
        if (this.zu != null) {
            this.zu.onResume();
        }
    }

    public String getUrl() {
        if (this.zu == null) {
            return null;
        }
        try {
            return this.zu.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getOriginalUrl() {
        String url;
        if (this.zu == null) {
            return null;
        }
        try {
            String originalUrl = this.zu.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.zu.getUrl()) != null) {
                if (url.startsWith(MiniStorage.SCHEME_FILE)) {
                    return url;
                }
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.zu == null) {
            return 0;
        }
        try {
            return this.zu.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public int getContentHeight() {
        if (this.zu == null) {
            return 0;
        }
        try {
            return this.zu.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public void fxn(boolean z) {
        try {
            this.zu.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    public void zu() {
        try {
            this.zu.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof hm) {
                setTouchStateListener((hm) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new fxn();
            }
            this.uhw = webViewClient;
            this.zu.setWebViewClient(new sg(this.xdg, webViewClient, this.je));
        } catch (Throwable unused) {
        }
    }

    public WebViewClient getWebViewClient() {
        return this.uhw;
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.zu.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.zu.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.zu.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.zu == null) {
            return;
        }
        try {
            this.zu.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent fxn2;
        try {
            fxn(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.rlu && (fxn2 = fxn(this)) != null) {
                fxn2.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.rlu = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ViewParent fxn(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (kg(view2) || gff(view2)) ? parent : fxn(view2);
    }

    private static boolean kg(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean gff(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            this.zu.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.zu.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    private void ud() {
        if (this.zu == null) {
            return;
        }
        try {
            this.zu.removeJavascriptInterface("searchBoxJavaBridge_");
            this.zu.removeJavascriptInterface("accessibility");
            this.zu.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public void fxn(Object obj, String str) {
        try {
            this.zu.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.zu.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.zu.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.zu.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    private void dx() {
        try {
            WebSettings settings = this.zu.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.zu.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void ckl() {
        if (this.zu == null) {
            return;
        }
        try {
            this.zu.onPause();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getUserAgentString() {
        if (this.zu == null) {
            return "";
        }
        try {
            return this.zu.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.zu;
    }

    public void xdg() {
        if (this.zu == null) {
            return;
        }
        try {
            this.zu.destroy();
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.zu.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void setSupportZoom(boolean z) {
        try {
            this.zu.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.zu.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.zu.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.zu.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.zu.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.zu.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.zu.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.zu.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.zu.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.zu.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setMixedContentMode(int i) {
        try {
            this.zu.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.zu.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.zu.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.zu.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.zu.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    public void rmu() {
        try {
            this.zu.clearView();
        } catch (Throwable unused) {
        }
    }

    public void je() {
        try {
            this.zu.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.zu.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    private void ums() {
        if (this.ci == null) {
            this.swx.set(false);
            this.ci = new bx(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.jq.bh.1
        };
        this.swx.set(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ij.set(true);
        if (!this.yws.get() || this.swx.get()) {
            return;
        }
        ums();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ij.set(false);
    }

    public long getLandingPageClickBegin() {
        return this.zk;
    }

    public void setLandingPageClickBegin(long j) {
        this.zk = j;
    }

    public long getLandingPageClickEnd() {
        return this.ei;
    }

    public void setLandingPageClickEnd(long j) {
        this.ei = j;
    }

    private void fxn(MotionEvent motionEvent) {
        if (!this.f9368sg || this.hm == null) {
            return;
        }
        if ((this.rb == null && this.bh == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.tw = motionEvent.getRawX();
                this.jq = motionEvent.getRawY();
                this.hie = System.currentTimeMillis();
                this.bh = new JSONObject();
                if (this.zu != null) {
                    this.zk = this.hie;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.bh.put("start_x", String.valueOf(this.tw));
                this.bh.put("start_y", String.valueOf(this.jq));
                this.bh.put("offset_x", String.valueOf(motionEvent.getRawX() - this.tw));
                this.bh.put("offset_y", String.valueOf(motionEvent.getRawY() - this.jq));
                this.bh.put("url", String.valueOf(getUrl()));
                this.bh.put("tag", "");
                this.dgx = System.currentTimeMillis();
                if (this.zu != null) {
                    this.ei = this.dgx;
                }
                this.bh.put("down_time", this.hie);
                this.bh.put("up_time", this.dgx);
                if (com.bytedance.sdk.component.jq.fxn.fxn.fxn().kg() != null) {
                    long j = this.mvp;
                    long j2 = this.hie;
                    if (j != j2) {
                        this.mvp = j2;
                        com.bytedance.sdk.component.jq.fxn.fxn.fxn().kg().fxn(this.hm, this.rb, "in_web_click", this.bh, this.dgx - this.hie);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.ke = f;
    }

    public void setDeepShakeValue(float f) {
        this.mve = f;
    }

    public void setWriggleValue(float f) {
        this.zn = f;
    }

    public void setCalculationMethod(int i) {
        this.ggo = i;
    }

    public void setOnShakeListener(kg kgVar) {
        this.ax = kgVar;
    }

    public static class fxn extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.jq.bh.fxn.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }
}
