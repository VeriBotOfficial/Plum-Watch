package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class y extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2877a = "Extensions";
    private static final String b = "Extension";
    private ArrayList<x> c = new ArrayList<>();

    public y(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2877a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.c.add(new x(xmlPullParser));
                    xmlPullParser.require(3, null, b);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    public final ArrayList<x> a() {
        return this.c;
    }
}
