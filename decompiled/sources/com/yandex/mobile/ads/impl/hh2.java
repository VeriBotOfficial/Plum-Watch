package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hh2 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<dy, Unit> f15692a;
    private final lx b;

    /* JADX WARN: Multi-variable type inference failed */
    public hh2(Function1<? super dy, Unit> onAction, lx imageLoader) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f15692a = onAction;
        this.b = imageLoader;
    }

    public final ky a(View itemView, int i) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (i == R.layout.debug_panel_item_action_button) {
            return new y(bh2.b, itemView);
        }
        if (i == R.layout.debug_panel_item_switch) {
            return new w32(itemView, new ch2(this));
        }
        if (i == R.layout.deubg_panel_item_header) {
            return new pf0(itemView);
        }
        if (i == R.layout.deubg_panel_item_key_value) {
            return new yq0(itemView);
        }
        if (i == R.layout.debug_panel_item_mediation_adapter) {
            return new yz0(itemView, this.b, new dh2(this), new eh2(this));
        }
        return i == R.layout.debug_panel_item_ad_units ? new ma(itemView, new fh2(this)) : i == R.layout.debug_panel_item_ad_unit ? new ka(new gh2(this), itemView) : new o30(itemView);
    }
}
