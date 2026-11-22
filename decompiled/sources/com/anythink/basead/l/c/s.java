package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class s extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2875a = "Creatives";
    private static final String b = "Creative";
    private ArrayList<p> c = new ArrayList<>();

    public s(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2875a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.c.add(new p(xmlPullParser));
                    xmlPullParser.require(3, null, b);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    public final ArrayList<p> a() {
        return this.c;
    }
}
