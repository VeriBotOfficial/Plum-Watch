package com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.mvp.hie;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes14.dex */
public class hm {
    public static Set<hie> fxn(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        hie fxn;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(rb.f9513sg, "vendor");
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(rb.f9513sg, "event"))) {
                                            break;
                                        } else {
                                            str3 = rb.kg(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(rb.f9513sg, "apiFramework"))) {
                                            break;
                                        } else {
                                            str = rb.kg(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        str2 = rb.kg(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(str) && (fxn = hie.fxn(str, attributeValue, str2, str3)) != null) {
                            hashSet.add(fxn);
                        }
                    }
                } else {
                    rb.fxn(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
