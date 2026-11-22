package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dl0 {

    /* renamed from: a, reason: collision with root package name */
    private final ei2 f15289a;
    private final am b;
    private final o10 c;
    private final WeakHashMap<FrameLayout, WeakReference<zl>> d;
    private final WeakHashMap<FrameLayout, WeakReference<fl0>> e;

    public final void a(FrameLayout adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        WeakReference<zl> weakReference = this.d.get(adView);
        zl zlVar = weakReference != null ? weakReference.get() : null;
        if (zlVar != null) {
            this.d.remove(adView);
            adView.removeView(zlVar);
        }
        WeakReference<fl0> weakReference2 = this.e.get(adView);
        fl0 fl0Var = weakReference2 != null ? weakReference2.get() : null;
        if (fl0Var != null) {
            this.e.remove(adView);
            adView.removeView(fl0Var);
        }
    }

    public /* synthetic */ dl0() {
        this(new ei2(), new am(), new o10());
    }

    public dl0(ei2 descriptionCreator, am borderViewManager, o10 dimensionConverter) {
        Intrinsics.checkNotNullParameter(descriptionCreator, "descriptionCreator");
        Intrinsics.checkNotNullParameter(borderViewManager, "borderViewManager");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f15289a = descriptionCreator;
        this.b = borderViewManager;
        this.c = dimensionConverter;
        this.d = new WeakHashMap<>();
        this.e = new WeakHashMap<>();
    }

    public final void a(FrameLayout adView, n92 validationResult, boolean z) {
        fl0 fl0Var;
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(adView, "adView");
        WeakReference<zl> weakReference = this.d.get(adView);
        zl borderView = weakReference != null ? weakReference.get() : null;
        if (borderView == null) {
            Context context = adView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            borderView = new zl(context, this.c, new e50());
            this.d.put(adView, new WeakReference<>(borderView));
            adView.addView(borderView);
        }
        this.b.getClass();
        Intrinsics.checkNotNullParameter(borderView, "borderView");
        borderView.setColor(z ? SupportMenu.CATEGORY_MASK : -16711936);
        if (z) {
            WeakReference<fl0> weakReference2 = this.e.get(adView);
            fl0Var = weakReference2 != null ? weakReference2.get() : null;
            if (fl0Var == null) {
                Context context2 = adView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                fl0Var = new fl0(context2, new o10());
                this.e.put(adView, new WeakReference<>(fl0Var));
                adView.addView(fl0Var);
            }
            this.f15289a.getClass();
            fl0Var.setDescription(ei2.a(validationResult));
            return;
        }
        WeakReference<fl0> weakReference3 = this.e.get(adView);
        fl0Var = weakReference3 != null ? weakReference3.get() : null;
        if (fl0Var != null) {
            this.e.remove(adView);
            adView.removeView(fl0Var);
        }
    }
}
