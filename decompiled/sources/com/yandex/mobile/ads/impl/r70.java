package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class r70 implements tq0 {
    private final int b;
    private final RectF c;

    public r70(int i, RectF rectF) {
        this.b = i;
        this.c = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.tq0
    public final String a() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Integer valueOf = Integer.valueOf(this.b);
        RectF rectF = this.c;
        return z0.a(new Object[]{valueOf, rectF != null ? z0.a(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4, "{x:%s,y:%s,width:%s,height:%s}", "format(...)") : null}, 2, "exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", "format(...)");
    }
}
