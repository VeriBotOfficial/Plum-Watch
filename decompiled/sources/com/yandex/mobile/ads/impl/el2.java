package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class el2 {
    public static boolean a(XmlPullParser p) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(p, "p");
        return p.next() != 3;
    }

    public static boolean b(XmlPullParser p) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(p, "p");
        return p.getEventType() == 2;
    }

    public static String c(XmlPullParser p) throws IOException, XmlPullParserException {
        String str;
        Intrinsics.checkNotNullParameter(p, "p");
        if (p.next() == 4) {
            str = p.getText();
            Intrinsics.checkNotNullExpressionValue(str, "getText(...)");
            p.nextTag();
        } else {
            str = "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static void d(XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        if (parser.getEventType() != 2) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i = 1;
        while (i != 0) {
            int next = parser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
