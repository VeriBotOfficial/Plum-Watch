package com.anythink.basead.l.c;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class ay {
    public static String a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String text;
        if (xmlPullParser.next() != 4) {
            text = "";
        } else {
            text = xmlPullParser.getText();
            xmlPullParser.nextTag();
        }
        return text.trim();
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int r0 = 1;
        while (r0 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                r0++;
            } else if (next == 3) {
                r0--;
            }
        }
    }
}
