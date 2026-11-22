package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class cl2<T> implements dl2<List<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    private final dl2<T> f15203a;
    private final String b;
    private final String c;
    private final el2 d;

    @Override // com.yandex.mobile.ads.impl.dl2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser parser, xj base64EncodingParameters) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        ArrayList arrayList = new ArrayList();
        el2 el2Var = this.d;
        String str = this.b;
        el2Var.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, str);
        while (true) {
            this.d.getClass();
            if (!el2.a(parser)) {
                return arrayList;
            }
            this.d.getClass();
            if (el2.b(parser)) {
                if (Intrinsics.areEqual(this.c, parser.getName())) {
                    T a2 = this.f15203a.a(parser, base64EncodingParameters);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } else {
                    this.d.getClass();
                    el2.d(parser);
                }
            }
        }
    }

    public /* synthetic */ cl2(dl2 dl2Var, String str, String str2) {
        this(dl2Var, str, str2, new el2());
    }

    public cl2(dl2<T> xmlElementParser, String elementsArrayTag, String elementTag, el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlElementParser, "xmlElementParser");
        Intrinsics.checkNotNullParameter(elementsArrayTag, "elementsArrayTag");
        Intrinsics.checkNotNullParameter(elementTag, "elementTag");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f15203a = xmlElementParser;
        this.b = elementsArrayTag;
        this.c = elementTag;
        this.d = xmlHelper;
    }
}
