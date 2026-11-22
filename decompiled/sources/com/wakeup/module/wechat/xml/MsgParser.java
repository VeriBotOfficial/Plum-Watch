package com.wakeup.module.wechat.xml;

import android.util.Xml;
import com.wakeup.common.log.LogUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MsgParser.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/wechat/xml/MsgParser;", "", "<init>", "()V", "TAG", "", "parseLeve1MsgXml", "", "xmlString", "parseTag", "parseAppMsgXml", "readAppMsg", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "readReferMsg", "", "referMsgMap", "", "readText", "skip", "feature-wechat_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MsgParser {
    public static final MsgParser INSTANCE = new MsgParser();
    private static final String TAG = "MsgParser";

    private MsgParser() {
    }

    public final Map<String, String> parseLeve1MsgXml(String xmlString, String parseTag) {
        Intrinsics.checkNotNullParameter(xmlString, "xmlString");
        Intrinsics.checkNotNullParameter(parseTag, "parseTag");
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(new StringReader(xmlString));
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2 && Intrinsics.areEqual(parseTag, newPullParser.getName())) {
                    LogUtils.d(TAG, "发现 <" + parseTag + "> 标签，开始提取属性...");
                    HashMap hashMap = new HashMap();
                    int attributeCount = newPullParser.getAttributeCount();
                    if (attributeCount > 0) {
                        for (int i = 0; i < attributeCount; i++) {
                            String attributeName = newPullParser.getAttributeName(i);
                            String attributeValue = newPullParser.getAttributeValue(i);
                            hashMap.put(attributeName, attributeValue);
                            LogUtils.d(TAG, "属性: " + attributeName + " = " + attributeValue);
                        }
                    }
                    return hashMap;
                }
            }
        } catch (IOException e) {
            LogUtils.e(TAG, "XML 解析失败", e);
        } catch (XmlPullParserException e2) {
            LogUtils.e(TAG, "XML 解析失败", e2);
        }
        LogUtils.w(TAG, "在 XML 中未找到 <voicemsg> 标签。");
        return null;
    }

    public final Map<String, String> parseAppMsgXml(String xmlString) {
        Intrinsics.checkNotNullParameter(xmlString, "xmlString");
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(new StringReader(xmlString));
            newPullParser.nextTag();
            newPullParser.require(2, null, "msg");
            Map<String, String> map = null;
            while (newPullParser.next() != 3) {
                if (newPullParser.getEventType() == 2) {
                    if (Intrinsics.areEqual(newPullParser.getName(), "appmsg")) {
                        Intrinsics.checkNotNull(newPullParser);
                        map = readAppMsg(newPullParser);
                    } else {
                        Intrinsics.checkNotNull(newPullParser);
                        skip(newPullParser);
                    }
                }
            }
            return map;
        } catch (Exception e) {
            LogUtils.e(TAG, "XML 解析失败", e);
            return null;
        }
    }

    private final Map<String, String> readAppMsg(XmlPullParser parser) {
        parser.require(2, null, "appmsg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                String name = parser.getName();
                if (name != null) {
                    int hashCode = name.hashCode();
                    if (hashCode != -722572543) {
                        if (hashCode != 3575610) {
                            if (hashCode == 110371416 && name.equals("title")) {
                                linkedHashMap.put(name, readText(parser));
                            }
                        } else if (name.equals("type")) {
                            linkedHashMap.put(name, readText(parser));
                        }
                    } else if (name.equals("refermsg")) {
                        readReferMsg(parser, linkedHashMap);
                    }
                }
                skip(parser);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final void readReferMsg(XmlPullParser parser, Map<String, String> referMsgMap) {
        parser.require(2, null, "refermsg");
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                String name = parser.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -594307670:
                            if (!name.equals("fromusr")) {
                                break;
                            } else {
                                referMsgMap.put(name, readText(parser));
                                break;
                            }
                        case 3575610:
                            if (!name.equals("type")) {
                                break;
                            } else {
                                referMsgMap.put("refermsg_" + name, readText(parser));
                                break;
                            }
                        case 109833162:
                            if (!name.equals("svrid")) {
                                break;
                            } else {
                                referMsgMap.put(name, readText(parser));
                                break;
                            }
                        case 951530617:
                            if (!name.equals("content")) {
                                break;
                            } else {
                                referMsgMap.put(name, readText(parser));
                                break;
                            }
                        case 1715102285:
                            if (!name.equals("displayname")) {
                                break;
                            } else {
                                referMsgMap.put(name, readText(parser));
                                break;
                            }
                    }
                }
                skip(parser);
            }
        }
    }

    private final String readText(XmlPullParser parser) {
        if (parser.next() == 4) {
            String text = parser.getText();
            parser.nextTag();
            return text;
        }
        return "";
    }

    private final void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != 2) {
            throw new IllegalStateException();
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
