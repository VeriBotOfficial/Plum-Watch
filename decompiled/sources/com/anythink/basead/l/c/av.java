package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class av extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2859a = "VAST";
    private static final String b = "Error";
    private static final String c = "Ad";
    private w d;
    private ArrayList<a> e;
    private String f;

    public av(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2859a);
        this.f = xmlPullParser.getAttributeValue(null, "version");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.d = new w(xmlPullParser);
                    xmlPullParser.require(3, null, b);
                } else if (name != null && name.equals(c)) {
                    if (this.e == null) {
                        this.e = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, c);
                    this.e.add(new a(xmlPullParser));
                    xmlPullParser.require(3, null, c);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private w b() {
        return this.d;
    }

    public final ArrayList<a> a() {
        return this.e;
    }

    private String c() {
        return this.f;
    }
}
