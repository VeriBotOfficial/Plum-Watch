package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pz1 {

    /* renamed from: a, reason: collision with root package name */
    private final cn0 f16612a;
    private final an0 b;

    public pz1(cn0 viewHolderManager) {
        Intrinsics.checkNotNullParameter(viewHolderManager, "viewHolderManager");
        this.f16612a = viewHolderManager;
        this.b = new an0();
    }

    public final void a() {
        ob2 ob2Var;
        ob2 ob2Var2;
        t70 instreamAdView;
        t70 instreamAdView2;
        bn0 a2 = this.f16612a.a();
        if (a2 == null || (instreamAdView2 = a2.b()) == null) {
            ob2Var = null;
        } else {
            this.b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView2, "instreamAdView");
            ob2Var = instreamAdView2.getAdUiElements();
        }
        TextView m = ob2Var != null ? ob2Var.m() : null;
        if (m != null) {
            m.setVisibility(8);
        }
        bn0 a3 = this.f16612a.a();
        if (a3 == null || (instreamAdView = a3.b()) == null) {
            ob2Var2 = null;
        } else {
            this.b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            ob2Var2 = instreamAdView.getAdUiElements();
        }
        View n = ob2Var2 != null ? ob2Var2.n() : null;
        if (n != null) {
            n.setVisibility(0);
            n.setEnabled(true);
        }
    }

    public final void a(long j, long j2) {
        ob2 ob2Var;
        t70 instreamAdView;
        bn0 a2 = this.f16612a.a();
        if (a2 == null || (instreamAdView = a2.b()) == null) {
            ob2Var = null;
        } else {
            this.b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            ob2Var = instreamAdView.getAdUiElements();
        }
        TextView m = ob2Var != null ? ob2Var.m() : null;
        int i = ((int) ((j - j2) / 1000)) + 1;
        if (m != null) {
            m.setText(String.valueOf(i));
            m.setVisibility(0);
        }
    }
}
