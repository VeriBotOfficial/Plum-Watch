package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class ba extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2863a = "JavaScriptResource";
    private static final String b = "VerificationParameters";
    private String c;
    private String d;
    private String e;
    private String f;

    public ba(XmlPullParser xmlPullParser) {
        this.c = xmlPullParser.getAttributeValue(null, "vendor");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f2863a)) {
                    xmlPullParser.require(2, null, f2863a);
                    this.f = xmlPullParser.getAttributeValue(null, "apiFramework");
                    this.d = a(xmlPullParser);
                    xmlPullParser.require(3, null, f2863a);
                } else if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.e = a(xmlPullParser);
                    xmlPullParser.require(3, null, b);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private String a() {
        return this.c;
    }

    private String b() {
        return this.d;
    }

    private String c() {
        return this.e;
    }

    private String d() {
        return this.f;
    }
}
