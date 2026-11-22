package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class ar extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f2856a;
    private String b;

    public ar(XmlPullParser xmlPullParser) {
        this.f2856a = xmlPullParser.getAttributeValue(null, "creativeType");
        this.b = a(xmlPullParser);
    }

    private String b() {
        return this.f2856a;
    }

    public final String a() {
        return this.b;
    }
}
