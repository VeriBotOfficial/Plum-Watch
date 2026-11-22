package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class rj0 {

    /* renamed from: a, reason: collision with root package name */
    private final sj0 f16769a;
    private final qj0 b;

    public rj0(sj0 imageProvider, qj0 imagePreviewCreator) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imagePreviewCreator, "imagePreviewCreator");
        this.f16769a = imageProvider;
        this.b = imagePreviewCreator;
    }

    public final void a(Set<xj0> imageValues) {
        Bitmap a2;
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageValues) {
            if (((xj0) obj).c() != null && (!StringsKt.isBlank(r2))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xj0 xj0Var = (xj0) it.next();
            if (this.f16769a.a(xj0Var) == null && this.f16769a.b(xj0Var) == null && (a2 = this.b.a(xj0Var)) != null) {
                this.f16769a.a(a2, xj0Var);
            }
        }
    }
}
