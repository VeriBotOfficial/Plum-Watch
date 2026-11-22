package com.yandex.mobile.ads.impl;

import com.caverock.androidsvg.SVGParser;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bv0 extends qg<ex0, ex0> {
    @Override // com.yandex.mobile.ads.impl.qg
    public final ig a(Object obj, String name) {
        ex0 value = (ex0) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return qg.a(name, SVGParser.XML_STYLESHEET_ATTR_MEDIA, value);
    }
}
