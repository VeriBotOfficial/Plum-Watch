package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class u9 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f17030a;

    public u9(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f17030a = xmlHelper;
    }

    public final t9 a(XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f17030a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "AdTagURI");
        parser.getAttributeValue(null, "templateType");
        this.f17030a.getClass();
        String uri = el2.c(parser);
        if (uri.length() <= 0) {
            return null;
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new t9(uri);
    }
}
