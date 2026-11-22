package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.oa0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ya0 {

    /* renamed from: a, reason: collision with root package name */
    private final o3 f17406a;
    private final tp1 b;
    private final g71 c;
    private final p51 d;
    private final xa0 e;

    public ya0(o3 adConfiguration, tp1 reporter, g71 nativeAdViewAdapter, p51 nativeAdEventController, xa0 feedbackMenuCreator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(feedbackMenuCreator, "feedbackMenuCreator");
        this.f17406a = adConfiguration;
        this.b = reporter;
        this.c = nativeAdViewAdapter;
        this.d = nativeAdEventController;
        this.e = feedbackMenuCreator;
    }

    public final void a(Context context, oa0 action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        View a2 = this.c.g().a("feedback");
        ImageView imageView = a2 instanceof ImageView ? (ImageView) a2 : null;
        if (imageView == null) {
            return;
        }
        List<oa0.a> c = action.c();
        if (c.isEmpty()) {
            return;
        }
        try {
            v9 v9Var = new v9(context, this.f17406a);
            this.e.getClass();
            PopupMenu a3 = xa0.a(context, imageView, c);
            a3.setOnMenuItemClickListener(new mj1(v9Var, c, this.b, this.d));
            a3.show();
        } catch (Exception e) {
            Object[] args = new Object[0];
            int i = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
            this.f17406a.q().c().reportError("Failed to render feedback", e);
        }
    }
}
