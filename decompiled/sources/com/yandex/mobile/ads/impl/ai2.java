package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class ai2 implements dl2<zh2> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f15011a;

    @Override // com.yandex.mobile.ads.impl.dl2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zh2 a(XmlPullParser parser, xj base64EncodingParameters) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f15011a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f15011a.getClass();
            if (!el2.a(parser)) {
                return new zh2(arrayList);
            }
            this.f15011a.getClass();
            if (el2.b(parser)) {
                if (Intrinsics.areEqual("Viewable", parser.getName())) {
                    this.f15011a.getClass();
                    arrayList.add(el2.c(parser));
                } else {
                    this.f15011a.getClass();
                    el2.d(parser);
                }
            }
        }
    }

    public /* synthetic */ ai2() {
        this(new el2());
    }

    public ai2(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f15011a = xmlHelper;
    }
}
