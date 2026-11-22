package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* loaded from: classes7.dex */
public class d extends sg.bigo.ads.controller.landing.c {

    /* renamed from: a, reason: collision with root package name */
    protected final LandingPageStyleConfig f19229a;
    private m b;
    private View c;
    private ProgressBar d;
    private final int e;
    private boolean f;
    private boolean g;

    public d(Activity activity) {
        super(activity);
        this.e = 5;
        this.f = false;
        this.g = true;
        Intent intent = activity.getIntent();
        this.f19229a = intent == null ? null : (LandingPageStyleConfig) intent.getParcelableExtra("layout_style");
        if (this.t != null) {
            this.b = this.t.e();
        }
    }

    private int a(String str, String str2, String str3) {
        int i;
        LandingPageStyleConfig landingPageStyleConfig;
        str.hashCode();
        i = 2;
        switch (str) {
            case "video_play_page.webview2_force_time":
                break;
            case "video_play_page.loading_timing":
            case "video_play_page.is_loading":
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        if (this.b != null && (landingPageStyleConfig = this.f19229a) != null) {
            int i2 = landingPageStyleConfig.c;
            if (i2 == 0) {
                return this.b.a(str);
            }
            if (i2 == 1) {
                return this.b.a(str3);
            }
            if (i2 == 9 || i2 == 10) {
                return this.b.a(str2);
            }
        }
        return i;
    }

    private void f() {
        ViewStub viewStub;
        View view;
        if (!this.f && x()) {
            if ((this.c == null || this.d == null) && (viewStub = (ViewStub) o(R.id.bigo_web_loading_container)) != null) {
                View inflate = viewStub.inflate();
                this.c = inflate;
                if (inflate != null) {
                    this.d = (ProgressBar) inflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.c;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.d;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int y = y();
            if (y > 1 && (view = this.c) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a(d.this.s)) {
                            return;
                        }
                        d.this.g();
                    }
                }, y * 1000);
            }
            this.f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        View view = this.c;
        if (view != null) {
            this.f = false;
            view.setVisibility(8);
        }
    }

    private boolean x() {
        return 1 == a("video_play_page.is_loading", "layer.is_loading", "endpage.is_loading");
    }

    private int y() {
        int a2 = a("video_play_page.loading_timing", "layer.loading_timing", "endpage.loading_timing");
        if (a2 == 2) {
            return 3;
        }
        if (a2 == 3) {
            return 5;
        }
        if (a2 != 4) {
            return a2;
        }
        return 10;
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i) {
        super.a(i);
        ProgressBar progressBar = this.d;
        if (progressBar == null || i <= 5) {
            return;
        }
        if (i > 95) {
            i = 95;
        }
        progressBar.setProgress(i);
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (this.c == null || y() > 1) {
            return;
        }
        g();
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z) {
        f();
        super.a(str, z);
        if (this.g) {
            this.g = false;
            return;
        }
        this.w = true;
        q();
        int a2 = a("video_play_page.webview2_force_time", "layer.webview2_force_time", "endpage.webview2_force_time");
        if (a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4) {
            this.v = a2 + 1;
        } else {
            this.v = 0;
        }
        w();
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        f();
        if (c()) {
            if (this.y != null) {
                this.y.setVisibility(8);
            }
            if (this.A != null) {
                this.A.setVisibility(8);
            }
            if (this.x != null) {
                this.x.setVisibility(8);
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean c() {
        return 1 == a("video_play_page.support_browser", "layer.support_browser", "endpage.support_browser");
    }
}
