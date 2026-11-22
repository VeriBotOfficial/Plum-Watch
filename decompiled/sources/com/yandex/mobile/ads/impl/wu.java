package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class wu<T> implements dl2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final dl2<T> f17283a;
    private final el2 b;

    public wu(r80 xmlElementParser, el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlElementParser, "xmlElementParser");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f17283a = xmlElementParser;
        this.b = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.dl2
    public final T a(XmlPullParser parser, xj base64EncodingParameters) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        T t = null;
        parser.require(2, null, "CreativeExtension");
        while (true) {
            this.b.getClass();
            if (!el2.a(parser)) {
                return t;
            }
            this.b.getClass();
            if (el2.b(parser)) {
                t = this.f17283a.a(parser, base64EncodingParameters);
            }
        }
    }
}
