package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class ag extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2846a = "Icons";
    private static final String b = "Icon";
    private ArrayList<ab> c = new ArrayList<>();

    public ag(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2846a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals("Icon")) {
                    xmlPullParser.require(2, null, "Icon");
                    this.c.add(new ab(xmlPullParser));
                    xmlPullParser.require(3, null, "Icon");
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    public final ArrayList<ab> a() {
        return this.c;
    }
}
