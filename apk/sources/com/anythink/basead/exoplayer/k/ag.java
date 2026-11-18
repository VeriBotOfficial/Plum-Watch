package com.anythink.basead.exoplayer.k;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes7.dex */
public final class ag {
    private ag() {
    }

    private static boolean a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    private static boolean b(XmlPullParser xmlPullParser, String str) {
        return b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    private static boolean c(XmlPullParser xmlPullParser, String str) {
        return b(xmlPullParser) && a(xmlPullParser.getName()).equals(str);
    }

    private static String d(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int r1 = 0; r1 < attributeCount; r1++) {
            if (xmlPullParser.getAttributeName(r1).equals(str)) {
                return xmlPullParser.getAttributeValue(r1);
            }
        }
        return null;
    }

    private static String e(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int r1 = 0; r1 < attributeCount; r1++) {
            if (a(xmlPullParser.getAttributeName(r1)).equals(str)) {
                return xmlPullParser.getAttributeValue(r1);
            }
        }
        return null;
    }

    private static String a(String str) {
        int r0 = str.indexOf(58);
        return r0 == -1 ? str : str.substring(r0 + 1);
    }

    private static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }
}
