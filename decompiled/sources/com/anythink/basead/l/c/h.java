package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public class h extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f2868a;
    private String b;

    public h(XmlPullParser xmlPullParser) {
        this.f2868a = xmlPullParser.getAttributeValue(null, "id");
        this.b = a(xmlPullParser);
    }

    private String b() {
        return this.f2868a;
    }

    public final String a() {
        return this.b;
    }
}
