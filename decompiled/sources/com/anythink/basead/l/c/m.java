package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class m extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2872a = "CompanionAds";
    private static final String b = "Companion";
    private ArrayList<l> c = new ArrayList<>();

    public m(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f2872a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(b)) {
                    xmlPullParser.require(2, null, b);
                    this.c.add(new l(xmlPullParser));
                    xmlPullParser.require(3, null, b);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    public final ArrayList<l> a() {
        return this.c;
    }
}
