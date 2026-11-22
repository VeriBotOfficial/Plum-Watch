package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class e extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2867a = "Verification";
    private final ArrayList<ba> b = new ArrayList<>();

    public e(XmlPullParser xmlPullParser) {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f2867a)) {
                    xmlPullParser.require(2, null, f2867a);
                    this.b.add(new ba(xmlPullParser));
                    xmlPullParser.require(3, null, f2867a);
                } else {
                    b(xmlPullParser);
                }
            }
        }
    }

    private ArrayList<ba> a() {
        return this.b;
    }
}
