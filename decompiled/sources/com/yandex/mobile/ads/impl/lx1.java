package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class lx1 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16184a;

    public final Integer a(XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f16184a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Ad");
        Integer b = ce2.b(parser.getAttributeValue(null, "sequence"));
        if (b == null || b.intValue() >= 0) {
            return b;
        }
        return null;
    }

    public /* synthetic */ lx1() {
        this(new el2());
    }

    public lx1(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f16184a = xmlHelper;
    }
}
