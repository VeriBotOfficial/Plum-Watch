package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lm1 implements su0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f16144a;
    private final su0.a b;
    private final gg c;

    public lm1(float f) {
        this(f, new su0.a());
    }

    public /* synthetic */ lm1(float f, su0.a aVar) {
        this(f, aVar, new gg(f));
    }

    public lm1(float f, su0.a measureSpecHolder, gg aspectRatioResolver) {
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        Intrinsics.checkNotNullParameter(aspectRatioResolver, "aspectRatioResolver");
        this.f16144a = f;
        this.b = measureSpecHolder;
        this.c = aspectRatioResolver;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    public final su0.a a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int a2 = this.c.a(size);
            if (mode2 == Integer.MIN_VALUE) {
                a2 = (int) Math.min(size2, a2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int b = this.c.b(size2);
            if (mode == Integer.MIN_VALUE) {
                b = (int) Math.min(size, b);
            }
            i = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f16144a) {
                i = View.MeasureSpec.makeMeasureSpec(this.c.b(size2), 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int a3 = this.c.a(size);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(a3, 1073741824);
                i = makeMeasureSpec;
            }
        }
        su0.a aVar = this.b;
        aVar.f16895a = i;
        aVar.b = i2;
        return aVar;
    }
}
