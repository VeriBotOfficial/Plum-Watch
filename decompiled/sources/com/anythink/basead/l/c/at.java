package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class at extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f2857a;
    private String b;

    public at(XmlPullParser xmlPullParser) {
        this.f2857a = xmlPullParser.getAttributeValue(null, "event");
        this.b = a(xmlPullParser);
    }

    public final String a() {
        return this.f2857a;
    }

    private void a(String str) {
        this.f2857a = str;
    }

    public final String b() {
        return this.b;
    }
}
