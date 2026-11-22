package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class pq0 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16595a;

    public final oq0 a(XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f16595a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "JavaScriptResource");
        av.a(this.f16595a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "apiFramework");
        av.a(this.f16595a, parser, "parser", "browserOptional", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "browserOptional");
        Boolean valueOf = attributeValue2 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
        this.f16595a.getClass();
        String c = el2.c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || valueOf == null || c.length() <= 0) {
            return null;
        }
        return new oq0(attributeValue, c, valueOf.booleanValue());
    }

    public /* synthetic */ pq0() {
        this(new el2());
    }

    public pq0(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f16595a = xmlHelper;
    }
}
