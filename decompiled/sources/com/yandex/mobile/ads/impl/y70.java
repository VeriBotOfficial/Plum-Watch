package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class y70 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f17400a;
    private final qy1 b;

    public final ArrayList a(XmlPullParser parser, wj base64EncodingParameters) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f17400a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f17400a.getClass();
            if (!el2.a(parser)) {
                return arrayList;
            }
            this.f17400a.getClass();
            if (el2.b(parser)) {
                if (Intrinsics.areEqual("Extension", parser.getName())) {
                    u70 a2 = this.b.a(parser, base64EncodingParameters);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } else {
                    this.f17400a.getClass();
                    el2.d(parser);
                }
            }
        }
    }

    public /* synthetic */ y70(el2 el2Var) {
        this(el2Var, new qy1(el2Var));
    }

    public y70(el2 xmlHelper, qy1 simpleExtensionParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(simpleExtensionParser, "simpleExtensionParser");
        this.f17400a = xmlHelper;
        this.b = simpleExtensionParser;
    }
}
