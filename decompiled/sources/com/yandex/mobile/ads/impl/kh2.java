package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class kh2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f16021a;

    public kh2(TextView textView) {
        this.f16021a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f16021a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
