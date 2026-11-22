package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class ae extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2845a = "IconClicks";
    private static final String b = "IconClickThrough";
    private static final String c = "IconClickTracking";
    private ac d;
    private ad e;

    public ae(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2845a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.d = new ac(xmlPullParser);
                    xmlPullParser.require(3, null, b);
                } else if (name != null && name.equals(c)) {
                    xmlPullParser.require(2, null, c);
                    this.e = new ad(xmlPullParser);
                    xmlPullParser.require(3, null, c);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private ac a() {
        return this.d;
    }

    private ad b() {
        return this.e;
    }
}
