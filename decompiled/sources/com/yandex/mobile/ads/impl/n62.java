package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class n62 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f16311a;
    private final m62 b;

    public final HashMap a(XmlPullParser parser, xj base64EncodingHeaderParameters) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingHeaderParameters, "base64EncodingHeaderParameters");
        this.f16311a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "TrackingEvents");
        HashMap hashMap = new HashMap();
        while (true) {
            this.f16311a.getClass();
            if (!el2.a(parser)) {
                return hashMap;
            }
            this.f16311a.getClass();
            if (el2.b(parser)) {
                if (Intrinsics.areEqual("Tracking", parser.getName())) {
                    l62 a2 = this.b.a(parser, base64EncodingHeaderParameters);
                    if (a2 != null) {
                        String a3 = a2.a();
                        String c = a2.c();
                        if (!hashMap.containsKey(a3)) {
                            hashMap.put(a3, new ArrayList());
                        }
                        List list = (List) hashMap.get(a3);
                        if (list != null) {
                            list.add(c);
                        }
                    }
                } else {
                    this.f16311a.getClass();
                    el2.d(parser);
                }
            }
        }
    }

    public /* synthetic */ n62() {
        this(new el2(), new m62());
    }

    public n62(el2 xmlHelper, m62 trackingEventParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(trackingEventParser, "trackingEventParser");
        this.f16311a = xmlHelper;
        this.b = trackingEventParser;
    }
}
