package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class x extends ay {
    private static final String c = "AdVerifications";
    private static final String d = "Extension";

    /* renamed from: a, reason: collision with root package name */
    private String f2876a;
    private e b;

    public x(XmlPullParser xmlPullParser) {
        this.f2876a = xmlPullParser.getAttributeValue(null, "type");
        xmlPullParser.require(2, null, d);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(c)) {
                    xmlPullParser.require(2, null, c);
                    this.b = new e(xmlPullParser);
                    xmlPullParser.require(3, null, c);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private String b() {
        return this.f2876a;
    }

    public final e a() {
        return this.b;
    }
}
