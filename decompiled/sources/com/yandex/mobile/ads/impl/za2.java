package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class za2 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f17501a;

    public final String a(XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f17501a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "VerificationParameters");
        this.f17501a.getClass();
        String c = el2.c(parser);
        if (c.length() == 0) {
            return null;
        }
        return c;
    }

    public /* synthetic */ za2() {
        this(new el2());
    }

    public za2(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f17501a = xmlHelper;
    }
}
