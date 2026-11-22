package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class t40 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16929a;

    public final int a(XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f16929a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Duration");
        this.f16929a.getClass();
        Long a2 = ce2.a(el2.c(parser));
        if (a2 != null) {
            return (int) a2.longValue();
        }
        return 0;
    }

    public /* synthetic */ t40() {
        this(new el2());
    }

    public t40(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f16929a = xmlHelper;
    }
}
