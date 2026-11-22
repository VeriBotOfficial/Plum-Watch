package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class au extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2858a = "TrackingEvents";
    private static final String b = "Tracking";
    private ArrayList<at> c = new ArrayList<>();

    public au(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2858a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.c.add(new at(xmlPullParser));
                    xmlPullParser.require(3, null, b);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    public final ArrayList<at> a() {
        return this.c;
    }
}
