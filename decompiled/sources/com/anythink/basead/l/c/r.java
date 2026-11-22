package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class r extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2874a = "CreativeExtensions";
    private static final String b = "CreativeExtension";
    private ArrayList<q> c = new ArrayList<>();

    private r(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2874a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.c.add(new q(xmlPullParser));
                    xmlPullParser.require(3, null, b);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private ArrayList<q> a() {
        return this.c;
    }
}
