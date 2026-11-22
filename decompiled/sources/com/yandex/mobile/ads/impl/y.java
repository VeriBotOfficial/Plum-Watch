package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.iy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends ky<iy.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<iy.c.a, Unit> f17382a;
    private final TextView b;

    @Override // com.yandex.mobile.ads.impl.ky
    public final void a(final iy.c unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.b.setText(unit.b());
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.y$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.a(y.this, unit, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Function1 onButtonClick, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f17382a = onButtonClick;
        View findViewById = itemView.findViewById(R.id.item_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.b = (TextView) findViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(y this$0, iy.c unit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f17382a.invoke(unit.a());
    }
}
