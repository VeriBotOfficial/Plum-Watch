package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.anythink.core.express.web.BaseWebView;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes12.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: a, reason: collision with root package name */
    protected l f4691a;
    protected d b;
    protected g c;
    private Object d;
    private Object e;
    private String f;
    private com.anythink.core.express.web.c g;
    private String i;
    private boolean j;
    private float k;
    private float l;
    private String m;
    private com.anythink.expressad.foundation.d.d n;
    private int o;

    static /* synthetic */ boolean a(WindVaneWebView windVaneWebView) {
        windVaneWebView.j = true;
        return true;
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public void setSignalCommunication(d dVar) {
        this.b = dVar;
        dVar.a(this);
    }

    public d getSignalCommunication() {
        return this.b;
    }

    public void setRid(String str) {
        this.i = str;
    }

    public String getRid() {
        return this.i;
    }

    public String getLocalRequestId() {
        return this.m;
    }

    public void setLocalRequestId(String str) {
        this.m = str;
    }

    public com.anythink.expressad.foundation.d.d getCampaignEx() {
        return this.n;
    }

    public void setCampaignEx(com.anythink.expressad.foundation.d.d dVar) {
        this.n = dVar;
    }

    public void setTempTypeForMetrics(int i) {
        this.o = i;
    }

    public Object getJsObject(String str) {
        g gVar = this.c;
        if (gVar == null) {
            return null;
        }
        return gVar.a(str);
    }

    public void registerWindVanePlugin(Class cls) {
        if (this.c == null) {
            return;
        }
        g.a(cls);
    }

    @Override // com.anythink.core.express.web.BaseWebView
    protected final void a() {
        super.a();
        getSettings().setSavePassword(false);
        try {
            getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        } catch (Throwable unused) {
            getSettings().setUserAgentString(com.anythink.core.common.v.m.h() + " WindVane/3.0.2");
        }
        if (this.f4691a == null) {
            this.f4691a = new l(this);
        }
        setWebViewChromeClient(this.f4691a);
        this.mWebViewClient = new m();
        setWebViewClient(this.mWebViewClient);
        if (this.b == null) {
            k kVar = new k(this.h);
            this.b = kVar;
            setSignalCommunication(kVar);
        }
        this.c = new g(this.h, this);
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public String checkToGetUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.contains("../")) {
            if (!str.startsWith("file")) {
                return str;
            }
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.contains(t.a())) {
                return str;
            }
        }
        Log.e("anythink_express", "illegal URL: ".concat(String.valueOf(str)));
        return "about:blank";
    }

    public void setApiManagerContext(Context context) {
        g gVar = this.c;
        if (gVar != null) {
            gVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        g gVar = this.c;
        if (gVar != null) {
            gVar.a(obj);
        }
    }

    public void setWebViewChromeClient(l lVar) {
        this.f4691a = lVar;
        setWebChromeClient(lVar);
    }

    public void setObject(Object obj) {
        this.d = obj;
    }

    public Object getObject() {
        return this.d;
    }

    public void setMraidObject(Object obj) {
        this.e = obj;
    }

    public Object getMraidObject() {
        return this.e;
    }

    public void setWebViewListener(com.anythink.core.express.web.c cVar) {
        this.g = cVar;
        l lVar = this.f4691a;
        if (lVar != null) {
            lVar.a(cVar);
        }
        if (this.mWebViewClient != null) {
            this.mWebViewClient.a(cVar);
        }
    }

    public com.anythink.core.express.web.c getWebViewListener() {
        return this.g;
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public boolean isDestroyed() {
        return this.j;
    }

    @Override // com.anythink.core.express.web.BaseWebView
    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            this.d = null;
            if (v.j(getContext()) == 0) {
                this.j = true;
                destroy();
            } else {
                com.anythink.core.common.d.t.b().a(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.a(WindVaneWebView.this);
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearWebView() {
        if (this.j) {
            return;
        }
        loadUrl("about:blank");
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    public String getCampaignId() {
        return this.f;
    }

    public void setCampaignId(String str) {
        this.f = str;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mWebViewClient != null && (this.mWebViewClient.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.k = motionEvent.getRawX();
                    this.l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.k;
                    float y = motionEvent.getY() - this.l;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48.0f) && ((rawX <= 0.0f || rawX <= 48.0f) && ((y >= 0.0f || (-1.0f) * y <= 48.0f) && (y <= 0.0f || y <= 48.0f)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
