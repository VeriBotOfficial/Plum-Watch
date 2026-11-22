package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class c extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f2866a;
    private String b;

    public c(XmlPullParser xmlPullParser) {
        this.f2866a = xmlPullParser.getAttributeValue(null, "version");
        this.b = a(xmlPullParser);
    }

    private String a() {
        return this.f2866a;
    }

    private String b() {
        return this.b;
    }
}
