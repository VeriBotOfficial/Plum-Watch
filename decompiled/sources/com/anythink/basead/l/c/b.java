package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class b extends ay {

    /* renamed from: a, reason: collision with root package name */
    private final String f2862a;
    private String b;

    public b(XmlPullParser xmlPullParser) {
        this.f2862a = xmlPullParser.getAttributeValue(null, "xmlEncoded");
        this.b = a(xmlPullParser);
    }

    private String a() {
        return this.f2862a;
    }

    private String b() {
        return this.b;
    }
}
