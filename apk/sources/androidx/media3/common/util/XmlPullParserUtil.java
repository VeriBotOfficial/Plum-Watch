package androidx.media3.common.util;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public final class XmlPullParserUtil {
    private XmlPullParserUtil() {
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return isEndTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return isStartTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean isStartTagIgnorePrefix(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return isStartTag(xmlPullParser) && stripPrefix(xmlPullParser.getName()).equals(str);
    }

    public static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int r1 = 0; r1 < attributeCount; r1++) {
            if (xmlPullParser.getAttributeName(r1).equals(str)) {
                return xmlPullParser.getAttributeValue(r1);
            }
        }
        return null;
    }

    public static String getAttributeValueIgnorePrefix(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int r1 = 0; r1 < attributeCount; r1++) {
            if (stripPrefix(xmlPullParser.getAttributeName(r1)).equals(str)) {
                return xmlPullParser.getAttributeValue(r1);
            }
        }
        return null;
    }

    private static String stripPrefix(String str) {
        int r0 = str.indexOf(58);
        return r0 == -1 ? str : str.substring(r0 + 1);
    }
}
