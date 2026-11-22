package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class an extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2854a = "NonLinearAds";
    private static final String b = "NonLinear";
    private static final String c = "TrackingEvents";
    private ArrayList<am> d = new ArrayList<>();
    private ArrayList<at> e;

    public an(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2854a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.d.add(new am(xmlPullParser));
                    xmlPullParser.require(3, null, b);
                } else if (name != null && name.equals(c)) {
                    xmlPullParser.require(2, null, c);
                    this.e = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, c);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private ArrayList<am> b() {
        return this.d;
    }

    public final ArrayList<at> a() {
        return this.e;
    }
}
