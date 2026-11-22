package com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.adapter;

import android.content.Context;
import android.graphics.Rect;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import io.livekit.android.room.util.MediaConstraintKeys;

/* loaded from: classes17.dex */
public class e extends MaxAdView {
    private static final String x = "ApplovinAdRequest";
    private Rect t;
    private boolean u;
    private boolean v;
    private final Runnable w;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.a();
        }
    }

    public e(String str, Context context) {
        super(str, context);
        this.t = new Rect();
        this.u = true;
        this.v = false;
        this.w = new a();
        e();
    }

    private boolean b() {
        return getLocalVisibleRect(this.t) && ((double) (this.t.width() * this.t.height())) >= ((double) (getWidth() * getHeight())) * 0.5d;
    }

    private void d() {
        if (this.u) {
            return;
        }
        startAutoRefresh();
        this.u = true;
        n.c(x, "Banner：--applovinad--performStartAutoRefresh()：" + c(), new Object[0]);
    }

    private void e() {
        if (this.u) {
            setExtraParameter("allow_pause_auto_refresh_immediately", MediaConstraintKeys.TRUE);
            stopAutoRefresh();
            this.u = false;
            n.c(x, "Banner：--applovinad--performStopAutoRefresh()：" + c(), new Object[0]);
        }
    }

    private void f() {
        getHandler().postDelayed(this.w, 5000L);
    }

    private void g() {
        getHandler().removeCallbacks(this.w);
    }

    public boolean c() {
        return isShown() && b() && isAttachedToWindow() && this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.c(x, "Banner：--applovinad--onAttachedToWindow()：" + c(), new Object[0]);
        f();
        this.v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = false;
        n.c(x, "Banner：--applovinad--onDetachedFromWindow()：" + c(), new Object[0]);
        g();
        a();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.v = z;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        n.c(x, "Banner：--applovinad--checkVisible()：" + c(), new Object[0]);
        if (c()) {
            d();
        } else {
            e();
        }
    }

    public e(String str, Context context, MaxAdFormat maxAdFormat) {
        super(str, maxAdFormat, context);
        this.t = new Rect();
        this.u = true;
        this.v = false;
        this.w = new a();
        e();
    }
}
