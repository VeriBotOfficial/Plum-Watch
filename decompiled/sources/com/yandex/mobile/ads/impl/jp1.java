package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jp1 {

    /* renamed from: a, reason: collision with root package name */
    private final lp1 f15938a;

    public final hp1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Button a2 = this.f15938a.a(context);
        a2.setTag(uh2.a("replay_button"));
        a2.setVisibility(8);
        hp1 hp1Var = new hp1(context, a2);
        hp1Var.addView(a2);
        return hp1Var;
    }

    public /* synthetic */ jp1() {
        this(new lp1());
    }

    public jp1(lp1 replayButtonCreator) {
        Intrinsics.checkNotNullParameter(replayButtonCreator, "replayButtonCreator");
        this.f15938a = replayButtonCreator;
    }
}
