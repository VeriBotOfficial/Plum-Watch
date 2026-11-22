package com.wakeup.module.jacket.meeting.xmind;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmind.core.internal.dom.DOMConstants;
import org.xmind.core.internal.zip.ArchiveConstants;

/* compiled from: XmindParser.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/wakeup/module/jacket/meeting/xmind/XmindParser;", "", "<init>", "()V", "parse", "Lcom/wakeup/module/jacket/meeting/xmind/XmindNode;", "file", "Ljava/io/File;", "parseTopic", "topicElement", "Lorg/w3c/dom/Element;", "findDirectChildByTag", "element", "tag", "", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class XmindParser {
    public static final XmindParser INSTANCE = new XmindParser();

    private XmindParser() {
    }

    public final XmindNode parse(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists() && file.isFile()) {
            try {
                InputStream zipFile = new ZipFile(file);
                try {
                    ZipFile zipFile2 = zipFile;
                    ZipEntry entry = zipFile2.getEntry(ArchiveConstants.CONTENT_XML);
                    if (entry == null) {
                        CloseableKt.closeFinally(zipFile, null);
                        return null;
                    }
                    zipFile = zipFile2.getInputStream(entry);
                    try {
                        Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(zipFile);
                        parse.getDocumentElement().normalize();
                        NodeList elementsByTagName = parse.getElementsByTagName(DOMConstants.TAG_SHEET);
                        if (elementsByTagName.getLength() == 0) {
                            CloseableKt.closeFinally(zipFile, null);
                            CloseableKt.closeFinally(zipFile, null);
                            return null;
                        }
                        Node item = elementsByTagName.item(0);
                        Element element = item instanceof Element ? (Element) item : null;
                        if (element == null) {
                            CloseableKt.closeFinally(zipFile, null);
                            CloseableKt.closeFinally(zipFile, null);
                            return null;
                        }
                        NodeList elementsByTagName2 = element.getElementsByTagName("topic");
                        if (elementsByTagName2.getLength() == 0) {
                            CloseableKt.closeFinally(zipFile, null);
                            CloseableKt.closeFinally(zipFile, null);
                            return null;
                        }
                        Node item2 = elementsByTagName2.item(0);
                        Element element2 = item2 instanceof Element ? (Element) item2 : null;
                        if (element2 == null) {
                            CloseableKt.closeFinally(zipFile, null);
                            CloseableKt.closeFinally(zipFile, null);
                            return null;
                        }
                        XmindNode parseTopic = INSTANCE.parseTopic(element2);
                        CloseableKt.closeFinally(zipFile, null);
                        CloseableKt.closeFinally(zipFile, null);
                        return parseTopic;
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private final XmindNode parseTopic(Element topicElement) {
        String str;
        Element findDirectChildByTag;
        Element findDirectChildByTag2 = findDirectChildByTag(topicElement, "title");
        if (findDirectChildByTag2 == null || (str = findDirectChildByTag2.getTextContent()) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        Element findDirectChildByTag3 = findDirectChildByTag(topicElement, DOMConstants.TAG_CHILDREN);
        if (findDirectChildByTag3 != null && (findDirectChildByTag = findDirectChildByTag(findDirectChildByTag3, "topics")) != null) {
            NodeList childNodes = findDirectChildByTag.getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1 && Intrinsics.areEqual(item.getNodeName(), "topic")) {
                    Intrinsics.checkNotNull(item, "null cannot be cast to non-null type org.w3c.dom.Element");
                    arrayList.add(parseTopic((Element) item));
                }
            }
        }
        return new XmindNode(str, arrayList);
    }

    private final Element findDirectChildByTag(Element element, String tag) {
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && Intrinsics.areEqual(item.getNodeName(), tag)) {
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type org.w3c.dom.Element");
                return (Element) item;
            }
        }
        return null;
    }
}
