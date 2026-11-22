package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class aq extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f2855a;
    private String b;
    private String c;

    public aq(XmlPullParser xmlPullParser) {
        this.f2855a = xmlPullParser.getAttributeValue(null, "model");
        this.b = xmlPullParser.getAttributeValue(null, "currency");
        this.c = a(xmlPullParser);
    }

    private String a() {
        return this.f2855a;
    }

    private String b() {
        return this.b;
    }

    private String c() {
        return this.c;
    }
}
