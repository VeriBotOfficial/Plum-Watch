package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class ie2 implements dl2<he2> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f15808a;

    @Override // com.yandex.mobile.ads.impl.dl2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final he2 a(XmlPullParser parser, xj base64EncodingParameters) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f15808a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        String str = null;
        parser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f15808a.getClass();
            if (!el2.a(parser)) {
                return new he2(str, arrayList);
            }
            this.f15808a.getClass();
            if (el2.b(parser)) {
                String name = parser.getName();
                if (Intrinsics.areEqual("ClickThrough", name)) {
                    this.f15808a.getClass();
                    String c = el2.c(parser);
                    if (c.length() > 0) {
                        str = c;
                    }
                } else if (Intrinsics.areEqual("ClickTracking", name)) {
                    this.f15808a.getClass();
                    String c2 = el2.c(parser);
                    if (c2.length() > 0) {
                        arrayList.add(c2);
                    }
                } else {
                    this.f15808a.getClass();
                    el2.d(parser);
                }
            }
        }
    }

    public /* synthetic */ ie2() {
        this(new el2());
    }

    public ie2(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f15808a = xmlHelper;
    }
}
