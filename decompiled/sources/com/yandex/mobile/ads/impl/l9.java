package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class l9 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16089a;
    private final u9 b;

    public final k9 a(XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f16089a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        k9 k9Var = null;
        parser.require(2, null, "AdSource");
        av.a(this.f16089a, parser, "parser", "allowMultipleAds", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "allowMultipleAds");
        if (attributeValue != null) {
            Boolean.parseBoolean(attributeValue);
        }
        av.a(this.f16089a, parser, "parser", "followRedirects", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "followRedirects");
        if (attributeValue2 != null) {
            Boolean.parseBoolean(attributeValue2);
        }
        String attributeValue3 = parser.getAttributeValue(null, "id");
        while (true) {
            this.f16089a.getClass();
            if (!el2.a(parser)) {
                return k9Var;
            }
            this.f16089a.getClass();
            if (el2.b(parser)) {
                if (Intrinsics.areEqual("AdTagURI", parser.getName())) {
                    t9 adTagUri = this.b.a(parser);
                    if (adTagUri != null) {
                        Intrinsics.checkNotNullParameter(adTagUri, "adTagUri");
                        k9Var = new k9(adTagUri, attributeValue3);
                    }
                } else {
                    this.f16089a.getClass();
                    el2.d(parser);
                }
            }
        }
    }

    public /* synthetic */ l9(el2 el2Var) {
        this(el2Var, new u9(el2Var));
    }

    public l9(el2 xmlHelper, u9 adTagUriParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(adTagUriParser, "adTagUriParser");
        this.f16089a = xmlHelper;
        this.b = adTagUriParser;
    }
}
