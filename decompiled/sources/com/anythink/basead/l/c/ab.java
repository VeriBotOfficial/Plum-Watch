package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class ab extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2843a = "Icon";
    private static final String b = "StaticResource";
    private static final String c = "IFrameResource";
    private static final String d = "HTMLResource";
    private static final String e = "IconClicks";
    private static final String f = "IconViewTracking";
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private ar o;
    private aa p;

    /* renamed from: q, reason: collision with root package name */
    private z f2844q;
    private ae r;
    private af s;

    public ab(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, "Icon");
        this.g = xmlPullParser.getAttributeValue(null, "program");
        this.h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.l = xmlPullParser.getAttributeValue(null, "duration");
        this.m = xmlPullParser.getAttributeValue(null, "offset");
        this.n = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.o = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, b);
                } else if (name != null && name.equals(c)) {
                    xmlPullParser.require(2, null, c);
                    this.p = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, c);
                } else if (name != null && name.equals(d)) {
                    xmlPullParser.require(2, null, d);
                    this.f2844q = new z(xmlPullParser);
                    xmlPullParser.require(3, null, d);
                } else if (name != null && name.equals(e)) {
                    xmlPullParser.require(2, null, e);
                    this.r = new ae(xmlPullParser);
                    xmlPullParser.require(3, null, e);
                } else if (name != null && name.equals(f)) {
                    xmlPullParser.require(2, null, f);
                    this.s = new af(xmlPullParser);
                    xmlPullParser.require(3, null, f);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private String a() {
        return this.g;
    }

    private String b() {
        return this.h;
    }

    private String c() {
        return this.i;
    }

    private String d() {
        return this.j;
    }

    private String e() {
        return this.k;
    }

    private String f() {
        return this.l;
    }

    private String g() {
        return this.m;
    }

    private String h() {
        return this.n;
    }
}
