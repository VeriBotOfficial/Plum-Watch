package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class al extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2851a = "MediaFiles";
    private static final String b = "MediaFile";
    private ArrayList<ak> c = new ArrayList<>();

    public al(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2851a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.c.add(new ak(xmlPullParser));
                    xmlPullParser.require(3, null, b);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    public final ArrayList<ak> a() {
        return this.c;
    }
}
