package org.xmind.core.internal.dom;

import org.w3c.dom.Element;

/* loaded from: classes7.dex */
public enum NS {
    XMAP("xmap", "urn:xmind:xmap:xmlns:content:2.0"),
    Style("style", "urn:xmind:xmap:xmlns:style:2.0"),
    Marker("marker", "urn:xmind:xmap:xmlns:marker:2.0"),
    Meta("meta", "urn:xmind:xmap:xmlns:meta:2.0"),
    Comments(DOMConstants.TAG_COMMENTS, "urn:xmind:xmap:xmlns:comments:2.0"),
    Manifest(DOMConstants.TAG_MANIFEST, "urn:xmind:xmap:xmlns:manifest:1.0"),
    Revision(DOMConstants.TAG_REVISION, "urn:xmind:xmap:xmlns:revision:1.0"),
    Assignee(DOMConstants.TAG_ASSIGNEE, "urn:xmind:xmap:xmlns:assignee:1.0"),
    Xhtml("xhtml", "http://www.w3.org/1999/xhtml"),
    Xlink("xlink", "http://www.w3.org/1999/xlink"),
    Fo("fo", "http://www.w3.org/1999/XSL/Format"),
    SVG("svg", "http://www.w3.org/2000/svg");

    private String prefix;
    private String uri;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static NS[] valuesCustom() {
        NS[] valuesCustom = values();
        int length = valuesCustom.length;
        NS[] nsArr = new NS[length];
        System.arraycopy(valuesCustom, 0, nsArr, 0, length);
        return nsArr;
    }

    NS(String str, String str2) {
        this.prefix = str;
        this.uri = str2;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getURI() {
        return this.uri;
    }

    public String getQualifiedName(String str) {
        return String.valueOf(this.prefix) + ":" + str;
    }

    public static String getPrefix(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    public static String getLocalName(String str) {
        int indexOf = str.indexOf(58);
        return indexOf >= 0 ? str.substring(indexOf + 1) : str;
    }

    public static void setNS(NS ns, Element element, NS... nsArr) {
        if (ns != null) {
            element.setAttribute("xmlns", ns.getURI());
        }
        for (NS ns2 : nsArr) {
            element.setAttribute("xmlns:" + ns2.getPrefix(), ns2.getURI());
        }
    }
}
