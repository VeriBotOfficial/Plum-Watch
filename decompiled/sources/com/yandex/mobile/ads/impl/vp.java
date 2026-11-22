package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.impl.tp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vp extends vg2<TextView, tp> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(TextView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.yandex.mobile.ads.impl.vg2
    public final void a(TextView textView) {
        TextView view = textView;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText("");
        super.a(view);
    }

    @Override // com.yandex.mobile.ads.impl.vg2
    public final void b(TextView textView, tp tpVar) {
        TextView view = textView;
        tp value = tpVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        if (tp.a.b == value.b()) {
            view.setText(value.a());
        }
    }

    @Override // com.yandex.mobile.ads.impl.vg2
    public final boolean a(TextView textView, tp tpVar) {
        TextView view = textView;
        tp value = tpVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        if (tp.a.b == value.b()) {
            return Intrinsics.areEqual(view.getText().toString(), value.a());
        }
        return true;
    }
}
