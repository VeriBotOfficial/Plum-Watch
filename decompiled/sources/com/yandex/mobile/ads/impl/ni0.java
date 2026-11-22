package com.yandex.mobile.ads.impl;

import android.javax.sip.header.ContentDispositionHeader;
import com.yandex.mobile.ads.impl.mi0;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class ni0 implements dl2<mi0> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16346a;

    public /* synthetic */ ni0() {
        this(new el2());
    }

    @Override // com.yandex.mobile.ads.impl.dl2
    public final mi0 a(XmlPullParser parser, xj base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f16346a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, ContentDispositionHeader.ICON);
        mi0.a aVar = new mi0.a();
        av.a(this.f16346a, parser, "parser", "program", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "program");
        av.a(this.f16346a, parser, "parser", "height", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "height");
        av.a(this.f16346a, parser, "parser", "width", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "width");
        av.a(this.f16346a, parser, "parser", "xPosition", "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, "xPosition");
        av.a(this.f16346a, parser, "parser", "yPosition", "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, "yPosition");
        av.a(this.f16346a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        av.a(this.f16346a, parser, "parser", "offset", "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, "offset");
        av.a(this.f16346a, parser, "parser", "duration", "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, "duration");
        while (true) {
            this.f16346a.getClass();
            if (!el2.a(parser)) {
                return aVar.f(attributeValue).c(attributeValue2).j(attributeValue3).d(attributeValue4).i(attributeValue5).a(attributeValue6).e(attributeValue7).b(attributeValue8).a();
            }
            this.f16346a.getClass();
            if (el2.b(parser)) {
                String name = parser.getName();
                mi0.c.c.getClass();
                mi0.c[] values = mi0.c.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        this.f16346a.getClass();
                        el2.d(parser);
                        break;
                    }
                    if (Intrinsics.areEqual(values[i].a(), name)) {
                        this.f16346a.getClass();
                        aVar.g(name).h(el2.c(parser));
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public ni0(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f16346a = xmlHelper;
    }
}
