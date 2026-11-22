package com.anythink.basead.ui.component;

import android.view.View;
import com.anythink.basead.ui.CountDownView;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.common.h.y;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    CountDownView f3235a;
    WebProgressBarView b;
    int c = 4;
    private y d;
    private long e;

    public b(y yVar, CountDownView countDownView, WebProgressBarView webProgressBarView) {
        this.d = yVar;
        this.f3235a = countDownView;
        this.b = webProgressBarView;
    }

    public final void a(long j) {
        this.e = j;
        CountDownView countDownView = this.f3235a;
        if (countDownView != null) {
            countDownView.setDuration(j);
        }
    }

    public final void b(long j) {
        CountDownView countDownView = this.f3235a;
        if (countDownView != null) {
            countDownView.refresh(j);
        }
        WebProgressBarView webProgressBarView = this.b;
        if (webProgressBarView != null) {
            long j2 = this.e;
            if (j2 > 0) {
                webProgressBarView.setProgress((int) ((j * 100.0d) / j2));
            } else {
                webProgressBarView.setProgress(100);
            }
        }
    }

    public final void a() {
        CountDownView countDownView = this.f3235a;
        if (countDownView != null) {
            countDownView.refreshToEnd();
        }
        WebProgressBarView webProgressBarView = this.b;
        if (webProgressBarView != null) {
            webProgressBarView.setProgress(100);
        }
    }

    public final void a(int i) {
        this.c = i;
        if (this.d.bi() == 1 || this.d.bi() == 4) {
            a(this.f3235a, i);
        } else {
            a(this.f3235a, 8);
        }
        if (this.d.bi() == 2 || this.d.bi() == 4) {
            a(this.b, i);
        } else {
            a(this.b, 8);
        }
    }

    private boolean b() {
        return this.d.bi() == 1 || this.d.bi() == 4;
    }

    private boolean c() {
        return this.d.bi() == 2 || this.d.bi() == 4;
    }

    private static void a(View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }
}
