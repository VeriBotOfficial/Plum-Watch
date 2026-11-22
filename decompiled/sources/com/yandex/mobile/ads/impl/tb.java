package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16950a;
    private final rb b;
    private final ob c;

    public tb(vb adtuneOptOutWebView, Context context, rb adtuneOptOutContainerCreator, ob adtuneControlsConfigurator) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebView, "adtuneOptOutWebView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneOptOutContainerCreator, "adtuneOptOutContainerCreator");
        Intrinsics.checkNotNullParameter(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f16950a = context;
        this.b = adtuneOptOutContainerCreator;
        this.c = adtuneControlsConfigurator;
    }

    public final Dialog a() {
        Dialog dialog = new Dialog(this.f16950a, R.style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup a2 = this.b.a();
        this.c.a(a2, dialog);
        dialog.setContentView(a2);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return dialog;
    }
}
