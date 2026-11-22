package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class qy1 implements dl2<u70> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16709a;

    public qy1(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f16709a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.dl2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u70 a(XmlPullParser parser, xj base64EncodingParameters) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f16709a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Extension");
        String type = parser.getAttributeValue(null, "type");
        this.f16709a.getClass();
        String value = el2.c(parser);
        if (type == null || type.length() == 0 || value.length() <= 0) {
            return null;
        }
        Intrinsics.checkNotNull(type);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new u70(type, value);
    }
}
