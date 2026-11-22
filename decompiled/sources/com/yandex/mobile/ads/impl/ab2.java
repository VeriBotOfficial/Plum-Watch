package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class ab2 implements dl2<wa2> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f14991a;
    private final pq0 b;
    private final za2 c;
    private final n62 d;

    public /* synthetic */ ab2() {
        this(new el2(), new pq0(), new za2(), new n62());
    }

    @Override // com.yandex.mobile.ads.impl.dl2
    public final wa2 a(XmlPullParser parser, xj base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f14991a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Verification");
        av.a(this.f14991a, parser, "parser", "vendor", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "vendor");
        HashMap hashMap = new HashMap();
        oq0 oq0Var = null;
        String str = null;
        while (true) {
            this.f14991a.getClass();
            if (!el2.a(parser)) {
                break;
            }
            this.f14991a.getClass();
            if (el2.b(parser)) {
                String name = parser.getName();
                if (Intrinsics.areEqual("JavaScriptResource", name)) {
                    oq0Var = this.b.a(parser);
                } else if (Intrinsics.areEqual("VerificationParameters", name)) {
                    str = this.c.a(parser);
                } else if (Intrinsics.areEqual("TrackingEvents", name)) {
                    hashMap = this.d.a(parser, base64EncodingParameters);
                } else {
                    this.f14991a.getClass();
                    el2.d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new wa2(attributeValue, oq0Var, str, hashMap);
    }

    public ab2(el2 xmlHelper, pq0 javaScriptResourceParser, za2 verificationParametersParser, n62 trackingEventsParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(javaScriptResourceParser, "javaScriptResourceParser");
        Intrinsics.checkNotNullParameter(verificationParametersParser, "verificationParametersParser");
        Intrinsics.checkNotNullParameter(trackingEventsParser, "trackingEventsParser");
        this.f14991a = xmlHelper;
        this.b = javaScriptResourceParser;
        this.c = verificationParametersParser;
        this.d = trackingEventsParser;
    }
}
