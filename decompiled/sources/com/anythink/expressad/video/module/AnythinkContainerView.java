package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.video.dynview.i.c;
import com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView;
import com.anythink.expressad.video.module.a.a.g;
import com.anythink.expressad.video.module.a.a.i;
import com.anythink.expressad.video.module.a.a.k;
import com.anythink.expressad.video.module.a.a.l;
import com.anythink.expressad.video.module.b.a;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class AnythinkContainerView extends AnythinkBaseView implements e, h {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private b Q;
    private AnyThinkOrderCampView R;
    private boolean S;
    private boolean T;
    private List<d> U;
    private AnythinkPlayableView n;
    private AnythinkClickCTAView o;
    private AnythinkClickMiniCardView p;

    /* renamed from: q, reason: collision with root package name */
    private AnythinkNativeEndCardView f5309q;
    private AnythinkH5EndCardView r;
    private AnythinkVideoEndCoverView s;
    private AnythinkVastEndCardView t;
    private AnythinkLandingPageView u;
    private AnythinkAlertWebview v;
    private String w;
    private int x;
    private int y;
    private int z;

    public void setJSFactory(b bVar) {
        this.Q = bVar;
    }

    public void addOrderViewData(List<d> list) {
        if (list == null) {
            return;
        }
        this.U = list;
    }

    public int getVideoSkipTime() {
        return this.H;
    }

    public void setVideoSkipTime(int i) {
        this.H = i;
    }

    public AnythinkContainerView(Context context) {
        super(context);
        this.y = 1;
        this.z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = false;
        this.I = false;
        this.J = false;
        this.S = false;
        this.T = false;
        this.U = new ArrayList();
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = 1;
        this.z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = false;
        this.I = false;
        this.J = false;
        this.S = false;
        this.T = false;
        this.U = new ArrayList();
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnythinkBaseView[] anythinkBaseViewArr = {this.n, this.o, this.p, this.f5309q, this.r, this.t, this.u, this.s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(final b bVar) {
        this.Q = bVar;
        if (this.b != null) {
            if (this.b.K() != 2) {
                b(this.x);
                if (this.b.j()) {
                    try {
                        a(bVar, Integer.valueOf(this.b.G()));
                    } catch (Throwable th) {
                        th.getMessage();
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                                anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.b.G()));
                            }
                        });
                    }
                    v.f(this.b.J());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                            anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.b.G()));
                        }
                    }, getVideoSkipTime());
                }
            } else {
                if (this.n == null) {
                    this.n = new AnythinkPlayableView(this.f5301a);
                }
                this.n.setCloseDelayShowTime(this.z);
                this.n.setPlayCloseBtnTm(this.A);
                this.n.setCampaign(this.b);
                this.n.setNotifyListener(new AnonymousClass4(this.e));
                this.n.preLoadData(bVar);
            }
            o();
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        if (this.b == null || this.E) {
            return;
        }
        removeAllViews();
        setMatchParent();
        if (this.n == null) {
            preLoadData(this.Q);
        }
        addView(this.n);
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.w);
            if (this.b != null && this.b.I() && this.b.K() == 2) {
                this.n.setCloseVisible(0);
            }
            this.n.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        }
        this.T = true;
        bringToFront();
    }

    private boolean a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        AnythinkAlertWebview anythinkAlertWebview = this.v;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.T) {
            removeAllViews();
            bringToFront();
            this.S = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview2 = this.v;
        if (anythinkAlertWebview2 != null && anythinkAlertWebview2.getParent() != null) {
            removeView(this.v);
        }
        addView(this.v);
        setBackgroundColor(0);
        this.v.webviewshow();
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i) {
        if (this.b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                p();
                return;
            }
            if (i == 1) {
                if (this.B) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView = this.r;
                if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                    removeView(this.r);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.p;
                if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
                    removeView(this.p);
                }
                AnythinkClickCTAView anythinkClickCTAView = this.o;
                if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
                    try {
                        if (this.b != null && this.b.K() == 1) {
                            this.T = true;
                            if (this.o == null) {
                                b(-1);
                            }
                            if (this.o != null && (this.b == null || !this.b.j())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            AnythinkClickCTAView anythinkClickCTAView2 = this.o;
            if (anythinkClickCTAView2 != null && anythinkClickCTAView2.getParent() != null) {
                removeView(this.o);
            }
            AnythinkAlertWebview anythinkAlertWebview = this.v;
            if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
                AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.p;
                if (anythinkClickMiniCardView2 == null || anythinkClickMiniCardView2.getParent() == null) {
                    try {
                        if (this.b != null && this.b.K() == 1) {
                            setMatchParent();
                            m();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (miniCardLoaded()) {
                    AnythinkH5EndCardView anythinkH5EndCardView2 = this.r;
                    if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                        removeView(this.r);
                    }
                    if (this.e != null) {
                        this.e.a(112, "");
                    }
                    if (this.b != null && !this.b.ay()) {
                        this.b.az();
                        a.e(this.f5301a, this.b);
                    }
                    if (this.D) {
                        if (this.e != null) {
                            this.e.a(115, "");
                        }
                    } else {
                        this.T = true;
                        bringToFront();
                        webviewshow();
                        onConfigurationChanged(getResources().getConfiguration());
                    }
                    this.C = true;
                    return;
                }
                p();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i) {
        if (this.b != null) {
            if (i != 1) {
                if (i == 100) {
                    if (this.b.K() == 2) {
                        this.E = true;
                    }
                    a(this.n);
                    setMatchParent();
                    i();
                } else if (i == 3) {
                    removeAllViews();
                    setMatchParent();
                    if (this.t == null) {
                        a(this.Q, (Integer) 3);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13, -1);
                    addView(this.t, layoutParams);
                    this.t.notifyShowListener();
                    this.T = true;
                    bringToFront();
                } else if (i == 4) {
                    if (this.e != null) {
                        this.e.a(113, "");
                    }
                    removeAllViews();
                    setMatchParent();
                    if (this.u == null) {
                        a(this.Q, (Integer) 4);
                    }
                    this.u.setUnitId(this.w);
                    this.u.preLoadData(this.Q);
                    addView(this.u);
                    this.T = true;
                    bringToFront();
                } else if (i == 5) {
                    if (this.e != null) {
                        this.e.a(106, "");
                    }
                } else {
                    removeAllViews();
                    setMatchParent();
                    this.T = true;
                    bringToFront();
                    e();
                    if (this.e != null) {
                        this.e.a(117, "");
                    }
                }
            } else if (this.e != null) {
                this.e.a(104, "");
            }
        }
        this.B = true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.Q;
            this.Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f5301a);
                this.s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.b);
                this.s.setNotifyListener(new i(this.e));
                this.s.preLoadData(bVar);
            }
        }
        addView(this.s);
        onConfigurationChanged(getResources().getConfiguration());
        this.T = true;
        bringToFront();
    }

    public void showOrderCampView() {
        AnyThinkOrderCampView anyThinkOrderCampView = new AnyThinkOrderCampView(this.f5301a);
        this.R = anyThinkOrderCampView;
        anyThinkOrderCampView.setCampaignExes(this.U);
        if (this.e != null && (this.e instanceof k)) {
            ((k) this.e).a(this.U);
        }
        this.R.setNotifyListener(new i(this.e));
        this.R.setRewarded(this.J);
        this.R.setNotchPadding(this.K, this.L, this.M, this.N);
        this.R.setCampOrderViewBuildCallback(new com.anythink.expressad.video.dynview.f.b() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.3
            @Override // com.anythink.expressad.video.dynview.f.b
            public final void a() {
                if (AnythinkContainerView.this.e != null) {
                    AnythinkContainerView.this.e.a(117, "");
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.b
            public final void b() {
                if (AnythinkContainerView.this.b.e() == 2) {
                    AnythinkContainerView.this.showVideoEndCover();
                } else {
                    AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                    anythinkContainerView.showEndcard(anythinkContainerView.b.G());
                }
            }
        });
        this.R.createView(this);
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        return this.B;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        return this.C;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.p;
        return anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess();
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        if (this.b == null || this.e == null) {
            return;
        }
        this.e.a(122, "");
        this.e.a(104, "");
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.handlerPlayableException(str);
            if (!this.I) {
                return;
            }
        }
        e();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.p.setRadius(i5);
            this.p.setCloseVisible(8);
            this.p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.T = true;
            bringToFront();
            m();
            if (this.G) {
                return;
            }
            this.G = true;
            this.e.a(109, "");
            this.e.a(117, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i, int i2, int i3) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i, i2);
            this.p.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.T = true;
            bringToFront();
            m();
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i, int i2, int i3) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.p;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.p.resizeMiniCard(i, i2);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.n, this.p, this.r, this.v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(d dVar) {
        this.e.a(105, dVar);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.n, this.p, this.r, this.v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(com.anythink.expressad.video.module.a.a aVar) {
        super.setNotifyListener(aVar);
        AnythinkBaseView[] anythinkBaseViewArr = {this.n, this.o, this.p, this.f5309q, this.r, this.t, this.u, this.s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        }
    }

    public boolean canBackPress() {
        if (this.f5309q != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null) {
            return anythinkH5EndCardView.canBackPress();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.u;
        if (anythinkLandingPageView != null) {
            return anythinkLandingPageView.canBackPress();
        }
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null) {
            return anythinkPlayableView.canBackPress();
        }
        return false;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        return anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable();
    }

    public void setShowingTransparent(boolean z) {
        this.D = z;
    }

    public boolean getShowingTransparent() {
        return this.D;
    }

    public String getUnitID() {
        return this.w;
    }

    public void setUnitID(String str) {
        this.w = str;
    }

    public void setVideoInteractiveType(int i) {
        if (this.b != null && this.b.j()) {
            int a2 = c.a(this.b);
            if (a2 == 100) {
                this.x = i;
                return;
            } else {
                this.x = a2;
                return;
            }
        }
        this.x = i;
    }

    public void setEndscreenType(int i) {
        this.y = i;
    }

    public int getVideoInteractiveType() {
        return this.x;
    }

    public void setCloseDelayTime(int i) {
        this.z = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.A = i;
    }

    private static void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private void b() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    private void e() {
        if (this.b != null) {
            boolean j = this.b.j();
            boolean f = v.f(this.b.J());
            if (j && !f) {
                i();
                return;
            }
        }
        if (this.y == 2 && !this.I) {
            h();
        } else {
            i();
        }
    }

    private void f() {
        if (this.t == null) {
            a(this.Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.t, layoutParams);
        this.t.notifyShowListener();
    }

    private void g() {
        if (this.u == null) {
            a(this.Q, (Integer) 4);
        }
        this.u.setUnitId(this.w);
        this.u.preLoadData(this.Q);
        addView(this.u);
    }

    private void h() {
        if (this.r == null) {
            a(this.Q, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.isLoadSuccess()) {
            this.I = true;
            addView(this.r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.r.excuteTask();
            this.r.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        } else {
            i();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.r;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.r.setError(true);
            }
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.r;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.w);
        }
    }

    private void i() {
        this.y = 1;
        if (this.f5309q == null) {
            a(this.Q, (Integer) 2);
        }
        addView(this.f5309q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f5309q.notifyShowListener();
        this.T = true;
        bringToFront();
    }

    private void j() {
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.Q;
            this.Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f5301a);
                this.s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.b);
                this.s.setNotifyListener(new i(this.e));
                this.s.preLoadData(bVar);
            }
        }
        addView(this.s);
        onConfigurationChanged(getResources().getConfiguration());
        this.T = true;
        bringToFront();
    }

    private void k() {
        if (this.n == null) {
            preLoadData(this.Q);
        }
        addView(this.n);
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.w);
            if (this.b != null && this.b.I() && this.b.K() == 2) {
                this.n.setCloseVisible(0);
            }
            this.n.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        }
    }

    private void l() {
        if (this.o == null) {
            b(-1);
        }
        if (this.o != null) {
            if (this.b == null || !this.b.j()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.o, 0, layoutParams);
            }
        }
    }

    private void m() {
        if (this.p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.D && this.F) {
            this.F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.p, layoutParams);
    }

    private void n() {
        if (this.v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.v;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.v);
        }
        addView(this.v);
    }

    private void a(b bVar) {
        if (this.n == null) {
            this.n = new AnythinkPlayableView(this.f5301a);
        }
        this.n.setCloseDelayShowTime(this.z);
        this.n.setPlayCloseBtnTm(this.A);
        this.n.setCampaign(this.b);
        this.n.setNotifyListener(new AnonymousClass4(this.e));
        this.n.preLoadData(bVar);
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkContainerView$4, reason: invalid class name */
    final class AnonymousClass4 extends i {
        AnonymousClass4(com.anythink.expressad.video.module.a.a aVar) {
            super(aVar);
        }

        @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (i == 100) {
                AnythinkContainerView.this.webviewshow();
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.onConfigurationChanged(anythinkContainerView.getResources().getConfiguration());
            }
        }
    }

    private void o() {
        if (this.v == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.f5301a);
            this.v = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.w);
            this.v.setCampaign(this.b);
        }
        this.v.preLoadData(this.Q);
    }

    private void b(b bVar) {
        this.Q = bVar;
        if (this.s == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.f5301a);
            this.s = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.b);
            this.s.setNotifyListener(new i(this.e));
            this.s.preLoadData(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        this.Q = bVar;
        if (this.b != null) {
            if (num == null) {
                num = Integer.valueOf(this.b.G());
            }
            if (!isLast()) {
                p();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.t == null) {
                        this.t = new AnythinkVastEndCardView(this.f5301a);
                    }
                    this.t.setCampaign(this.b);
                    this.t.setNotifyListener(new l(this.e));
                    this.t.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.u == null) {
                        this.u = new AnythinkLandingPageView(this.f5301a);
                    }
                    this.u.setCampaign(this.b);
                    this.u.setNotifyListener(new i(this.e));
                    return;
                }
                if (intValue != 5) {
                    if (this.y == 2) {
                        boolean j = this.b.j();
                        boolean f = v.f(this.b.J());
                        if ((!j || f || this.b == null || this.b.I()) && this.b.e() != 2) {
                            if (this.r == null) {
                                this.r = new AnythinkH5EndCardView(this.f5301a);
                            }
                            if (this.b.k() == 5 && this.e != null && (this.e instanceof k)) {
                                ((k) this.e).a(this.b);
                            }
                            this.r.setCampaign(this.b);
                            this.r.setCloseDelayShowTime(this.z);
                            this.r.setNotifyListener(new i(this.e));
                            this.r.setUnitId(this.w);
                            this.r.setNotchValue(this.P, this.K, this.L, this.M, this.N);
                            this.r.preLoadData(bVar);
                            if (this.D) {
                                return;
                            }
                            addView(this.r);
                            return;
                        }
                        return;
                    }
                    int c = (this.b == null || this.b.N() == null) ? 0 : this.b.N().c();
                    AnythinkNativeEndCardView anythinkNativeEndCardView = this.f5309q;
                    if (anythinkNativeEndCardView == null && anythinkNativeEndCardView == null) {
                        if (this.b.j()) {
                            q();
                        } else {
                            AnythinkNativeEndCardView anythinkNativeEndCardView2 = new AnythinkNativeEndCardView(this.f5301a, null, false, -1, this.b.e() == 2, c, this.b.au());
                            this.f5309q = anythinkNativeEndCardView2;
                            anythinkNativeEndCardView2.setCampaign(this.b);
                        }
                    }
                    this.f5309q.setLayout();
                    this.f5309q.setCampaign(this.b);
                    this.f5309q.setUnitId(this.w);
                    this.f5309q.setCloseBtnDelay(this.z);
                    this.f5309q.setNotifyListener(new i(this.e));
                    this.f5309q.preLoadData(bVar);
                    this.f5309q.setNotchPadding(this.K, this.L, this.M, this.N);
                }
            }
        }
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    private void p() {
        this.C = false;
        this.T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AnythinkContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void b(int i) {
        if (i != -3) {
            if (i == -2) {
                if (this.b == null || this.b.G() != 2) {
                    return;
                }
                if (this.p == null) {
                    this.p = new AnythinkClickMiniCardView(this.f5301a);
                }
                this.p.setCampaign(this.b);
                this.p.setNotifyListener(new g(this.p, this.e));
                this.p.preLoadData(this.Q);
                setMatchParent();
                m();
                p();
                return;
            }
            if (this.o == null) {
                AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(this.f5301a);
                this.o = anythinkClickCTAView;
                anythinkClickCTAView.setCampaign(this.b);
                this.o.setUnitId(this.w);
                this.o.setNotifyListener(new i(this.e));
                this.o.preLoadData(this.Q);
            }
        }
    }

    private void a(com.anythink.expressad.video.module.a.a aVar, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    private void b(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public d getReSetCampaign() {
        if (!this.b.j() || !TextUtils.isEmpty(this.b.J())) {
            return null;
        }
        int size = this.U.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (this.U.get(i2) != null && this.U.get(i2).bh() == this.b.bh()) {
                    i = i2 - 1;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.U.get(i) == null) {
            return null;
        }
        return this.U.get(i);
    }

    private void q() {
        if (this.b == null) {
            return;
        }
        String J = this.b.J();
        int i = 404;
        if (!TextUtils.isEmpty(J)) {
            try {
                i = Integer.parseInt(z.a(J, "ecid"));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        this.f5309q = new AnythinkNativeEndCardView(this.f5301a, null, true, i, this.b.e() == 2, this.l, this.b.au());
        if (this.b.k() == 5) {
            if (this.e != null && (this.e instanceof k)) {
                ((k) this.e).a(this.b);
            }
            this.f5309q.setCampaign(this.b);
            return;
        }
        this.f5309q.setCampaign(this.b);
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.p.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.C) {
            this.e.a(107, "");
        }
    }

    public void onEndcardBackPress() {
        if (this.f5309q != null || this.t != null) {
            this.e.a(104, "");
            return;
        }
        if (this.u != null) {
            this.e.a(103, "");
            return;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.onBackPress();
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.r = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.u;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f5309q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
            this.f5309q.release();
        }
        if (this.e != null) {
            this.e = null;
        }
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        return anythinkH5EndCardView == null ? this.n : anythinkH5EndCardView;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.S && !this.T) {
            p();
            this.S = false;
        }
        AnythinkAlertWebview anythinkAlertWebview = this.v;
        if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.v);
        AnythinkClickCTAView anythinkClickCTAView = this.o;
        if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
            return;
        }
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        this.e.a(103, str);
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i));
        this.O = i;
        this.K = i2;
        this.L = i3;
        this.M = i4;
        this.N = i5;
        this.P = com.anythink.expressad.foundation.h.i.a(i, i2, i3, i4, i5);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f5309q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.r;
        if (anythinkH5EndCardView == null || anythinkH5EndCardView.s == null) {
            i6 = i2;
            i7 = i3;
            i8 = i4;
            i9 = i5;
        } else {
            i6 = i2;
            i7 = i3;
            i8 = i4;
            i9 = i5;
            this.r.setNotchValue(this.P, i6, i7, i8, i9);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.expressad.atsignalcommon.windvane.h.a((WebView) this.r.s, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.n;
        if (anythinkPlayableView != null && anythinkPlayableView.s != null) {
            int i10 = i8;
            int i11 = i6;
            int i12 = i9;
            int i13 = i7;
            this.n.setNotchValue(this.P, i11, i13, i10, i12);
            i6 = i11;
            i7 = i13;
            i8 = i10;
            i9 = i12;
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.expressad.atsignalcommon.windvane.h.a((WebView) this.n.s, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        AnyThinkOrderCampView anyThinkOrderCampView = this.R;
        if (anyThinkOrderCampView != null) {
            anyThinkOrderCampView.setNotchPadding(i6, i7, i8, i9);
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f5309q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f5309q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setRewardStatus(boolean z) {
        this.J = z;
    }
}
