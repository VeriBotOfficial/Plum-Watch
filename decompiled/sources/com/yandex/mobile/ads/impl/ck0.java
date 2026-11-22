package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ck0 {

    /* renamed from: a, reason: collision with root package name */
    private final zj0 f15195a = new zj0();

    public final void a(List<? extends ig<?>> assets, Map<String, Bitmap> images) {
        List<xj0> a2;
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(images, "images");
        for (ig<?> igVar : assets) {
            Object d = igVar.d();
            if (Intrinsics.areEqual(igVar.c(), SVGParser.XML_STYLESHEET_ATTR_MEDIA) && (d instanceof ex0) && (a2 = ((ex0) d).a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : a2) {
                    this.f15195a.getClass();
                    if (zj0.a((xj0) obj, images)) {
                        arrayList.add(obj);
                    }
                }
                a2.retainAll(arrayList);
            }
        }
    }
}
