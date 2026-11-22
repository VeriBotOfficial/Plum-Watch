package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class r80 implements dl2<m80> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16742a;

    public r80(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f16742a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.dl2
    public final m80 a(XmlPullParser parser, xj base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f16742a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "FalseClick");
        av.a(this.f16742a, parser, "parser", com.umeng.analytics.pro.ak.aT, "attributeName");
        String attributeValue = parser.getAttributeValue(null, com.umeng.analytics.pro.ak.aT);
        Long longOrNull = attributeValue != null ? StringsKt.toLongOrNull(attributeValue) : null;
        this.f16742a.getClass();
        String c = el2.c(parser);
        if (c.length() <= 0 || longOrNull == null) {
            return null;
        }
        return new m80(c, longOrNull.longValue());
    }
}
