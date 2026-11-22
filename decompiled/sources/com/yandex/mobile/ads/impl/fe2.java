package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fe2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final vr0 f15486a;
    private final cp b;
    private final uu c;

    public fe2(vr0 link, cp clickListenerCreator, uu uuVar) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        this.f15486a = link;
        this.b = clickListenerCreator;
        this.c = uuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.b.a(this.c != null ? new vr0(this.f15486a.a(), this.f15486a.c(), this.f15486a.d(), this.c.c(), this.f15486a.b()) : this.f15486a).onClick(view);
    }
}
