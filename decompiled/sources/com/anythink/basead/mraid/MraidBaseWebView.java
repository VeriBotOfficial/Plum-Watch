package com.anythink.basead.mraid;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import com.anythink.core.express.web.BaseWebView;

/* loaded from: classes11.dex */
public class MraidBaseWebView extends BaseWebView {

    /* renamed from: a, reason: collision with root package name */
    protected j f2908a;
    protected a b;
    protected h c;
    private Object d;
    private Object e;
    private String f;
    private com.anythink.core.express.web.c g;
    private String i;
    private boolean j;
    private float k;
    private float l;
    private String m;
    private int n;

    static /* synthetic */ boolean a(MraidBaseWebView mraidBaseWebView) {
        mraidBaseWebView.j = true;
        return true;
    }

    public MraidBaseWebView(Context context) {
        super(context);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public void setSignalCommunication(a aVar) {
        this.b = aVar;
        aVar.c = this;
    }

    public a getSignalCommunication() {
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

    public void setTempTypeForMetrics(int i) {
        this.n = i;
    }

    public Object getJsObject(String str) {
        h hVar = this.c;
        if (hVar == null) {
            return null;
        }
        hVar.a(this.h, this);
        return this.c;
    }

    @Override // com.anythink.core.express.web.BaseWebView
    protected final void a() {
        super.a();
        getSettings().setSavePassword(false);
        try {
            getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        } catch (Throwable unused) {
            getSettings().setUserAgentString(m.h() + " WindVane/3.0.2");
        }
        if (this.f2908a == null) {
            this.f2908a = new j(this);
        }
        setWebViewChromeClient(this.f2908a);
        this.c = new h();
        if (this.b == null) {
            a aVar = new a(this.h);
            this.b = aVar;
            setSignalCommunication(aVar);
        }
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
            if (!TextUtils.isEmpty(path) && path.contains(com.anythink.core.common.res.d.a(t.b().g()).a())) {
                return str;
            }
        }
        Log.e("anythink_express", "illegal URL: ".concat(String.valueOf(str)));
        return "about:blank";
    }

    public void setWebViewChromeClient(j jVar) {
        this.f2908a = jVar;
        setWebChromeClient(jVar);
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
        j jVar = this.f2908a;
        if (jVar != null) {
            jVar.a(cVar);
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
            Context context = getContext();
            if (context == null) {
                context = t.b().g();
            }
            float i = q.i(context);
            if (i == 0.0f) {
                this.j = true;
                destroy();
            } else {
                t.b().a(new Runnable() { // from class: com.anythink.basead.mraid.MraidBaseWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MraidBaseWebView.a(MraidBaseWebView.this);
                        MraidBaseWebView.this.destroy();
                    }
                }, (long) (i * 1000.0f));
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
