package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class ua2 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f17036a;
    private final y92 b;

    public final u92 a(String data, xj base64EncodingParameters) throws XmlPullParserException, IOException, JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        parser.setInput(new StringReader(data));
        Intrinsics.checkNotNull(parser);
        parser.nextTag();
        this.f17036a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "VAST");
        return this.b.a(parser, base64EncodingParameters);
    }

    public /* synthetic */ ua2(Context context, sp1 sp1Var) {
        this(context, sp1Var, new el2(), new y92(context, sp1Var));
    }

    public ua2(Context context, sp1 reporter, el2 xmlHelper, y92 vastAdsParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(vastAdsParser, "vastAdsParser");
        this.f17036a = xmlHelper;
        this.b = vastAdsParser;
    }
}
