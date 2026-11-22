package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class m62 implements dl2<l62> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16213a;
    private final d52 b;

    @Override // com.yandex.mobile.ads.impl.dl2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l62 a(XmlPullParser parser, xj base64EncodingParameters) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f16213a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Tracking");
        String attributeValue = parser.getAttributeValue(null, "event");
        String attributeValue2 = parser.getAttributeValue(null, "offset");
        this.f16213a.getClass();
        String c = el2.c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || c.length() <= 0) {
            return null;
        }
        na2 a2 = attributeValue2 != null ? this.b.a(attributeValue2) : null;
        Intrinsics.checkNotNull(attributeValue);
        return new l62(attributeValue, c, a2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ m62() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.el2 r0 = new com.yandex.mobile.ads.impl.el2
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            com.yandex.mobile.ads.impl.b52[] r2 = com.yandex.mobile.ads.impl.b52.values()
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            r1.<init>(r2)
            com.yandex.mobile.ads.impl.d52 r2 = new com.yandex.mobile.ads.impl.d52
            r2.<init>(r1)
            r4.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m62.<init>():void");
    }

    public m62(el2 xmlHelper, d52 timeOffsetParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        this.f16213a = xmlHelper;
        this.b = timeOffsetParser;
    }
}
