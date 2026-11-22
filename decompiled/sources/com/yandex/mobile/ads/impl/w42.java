package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class w42 extends vg2<TextView, String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(TextView view) {
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
    public final void b(TextView textView, String str) {
        TextView view = textView;
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        view.setText(value);
    }

    @Override // com.yandex.mobile.ads.impl.vg2
    public final boolean a(TextView textView, String str) {
        TextView view = textView;
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        CharSequence text = view.getText();
        if (text != null) {
            return StringsKt.equals(String.valueOf(text), value, true);
        }
        return false;
    }
}
