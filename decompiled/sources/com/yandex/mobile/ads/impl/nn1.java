package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.processing.util.GLUtils;
import com.yandex.mobile.ads.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class nn1<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final rt f16359a;
    private final on1 b;
    private final h41 c;
    private final a51 d;

    public nn1(rt nativeAdAssets, on1 ratingFormatter, h41 nativeAdAdditionalViewProvider, a51 nativeAdContainerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(ratingFormatter, "ratingFormatter");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f16359a = nativeAdAssets;
        this.b = ratingFormatter;
        this.c = nativeAdAdditionalViewProvider;
        this.d = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        String valueOf;
        Intrinsics.checkNotNullParameter(container, "container");
        this.d.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup viewGroup = (ViewGroup) container.findViewById(R.id.rating_container);
        Float k = this.f16359a.k();
        if (k == null) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        this.c.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(R.id.rating_text);
        if (textView != null) {
            on1 on1Var = this.b;
            float floatValue = k.floatValue();
            on1Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(AbstractJsonLexerKt.COMMA);
                valueOf = new DecimalFormat(GLUtils.VERSION_UNKNOWN, decimalFormatSymbols).format(floatValue);
                Intrinsics.checkNotNull(valueOf);
            } catch (RuntimeException unused) {
                valueOf = String.valueOf(floatValue);
            }
            textView.setText(valueOf);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }
}
