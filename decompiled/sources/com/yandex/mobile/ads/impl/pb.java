package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16541a;
    private final mb b;
    private final ob c;

    public pb(Activity context, bc adtuneWebView, mb adtuneContainerCreator, ob adtuneControlsConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneWebView, "adtuneWebView");
        Intrinsics.checkNotNullParameter(adtuneContainerCreator, "adtuneContainerCreator");
        Intrinsics.checkNotNullParameter(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f16541a = context;
        this.b = adtuneContainerCreator;
        this.c = adtuneControlsConfigurator;
    }

    public final Dialog a() {
        Dialog dialog = new Dialog(this.f16541a, R.style.MonetizationAdsInternal_BottomAdtuneDialog);
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
