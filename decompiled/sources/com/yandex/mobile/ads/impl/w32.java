package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.iy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w32 extends ky<iy.h> {

    /* renamed from: a, reason: collision with root package name */
    private final Function2<iy.h.a, Boolean, Unit> f17217a;
    private final Switch b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w32(View itemView, Function2<? super iy.h.a, ? super Boolean, Unit> onCheckedChange) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        this.f17217a = onCheckedChange;
        View findViewById = itemView.findViewById(R.id.item_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.b = (Switch) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.ky
    public final void a(final iy.h unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.b.setOnCheckedChangeListener(null);
        this.b.setText(unit.c());
        this.b.setChecked(unit.a());
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.mobile.ads.impl.w32$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                w32.a(w32.this, unit, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w32 this$0, iy.h unit, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f17217a.invoke(unit.b(), Boolean.valueOf(z));
    }
}
