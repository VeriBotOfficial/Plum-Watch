package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class y92 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f17405a;
    private final mc2 b;

    public final u92 a(XmlPullParser parser, xj base64EncodingParameters) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        av.a(this.f17405a, parser, "parser", "version", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f17405a.getClass();
            if (!el2.a(parser)) {
                break;
            }
            this.f17405a.getClass();
            if (el2.b(parser)) {
                if (Intrinsics.areEqual("Ad", parser.getName())) {
                    mb2 a2 = this.b.a(parser, base64EncodingParameters);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } else {
                    this.f17405a.getClass();
                    el2.d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new u92(attributeValue, arrayList);
    }

    public /* synthetic */ y92(Context context, sp1 sp1Var) {
        this(context, sp1Var, new el2(), new mc2(context, sp1Var));
    }

    public y92(Context context, sp1 reporter, el2 xmlHelper, mc2 videoAdParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(videoAdParser, "videoAdParser");
        this.f17405a = xmlHelper;
        this.b = videoAdParser;
    }
}
