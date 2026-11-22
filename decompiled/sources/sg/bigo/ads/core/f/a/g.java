package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmind.core.IMeta;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final List<sg.bigo.ads.core.f.a.a.b> f20033a = new ArrayList();
    protected final Node b;

    public g(Node node) {
        this.b = node;
    }

    public final List<n> a() {
        ArrayList arrayList = new ArrayList();
        List<Node> c = sg.bigo.ads.core.f.a.c(this.b, "Error");
        if (c != null) {
            Iterator<Node> it = c.iterator();
            while (it.hasNext()) {
                String a2 = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(a2)) {
                    arrayList.add(new n(a2));
                }
            }
        }
        return arrayList;
    }

    public final List<h> a(String... strArr) {
        List<Node> c;
        ArrayList arrayList = new ArrayList();
        Node a2 = sg.bigo.ads.core.f.a.a(this.b, "Creatives");
        if (a2 != null && (c = sg.bigo.ads.core.f.a.c(a2, "Creative")) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add("Linear");
            if (!sg.bigo.ads.common.utils.k.a(strArr)) {
                linkedHashSet.addAll(Arrays.asList(strArr));
            }
            for (Node node : c) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Node a3 = sg.bigo.ads.core.f.a.a(node, str);
                    if (a3 != null) {
                        str.hashCode();
                        if (str.equals("Linear")) {
                            arrayList.add(new h(a3));
                        } else if (str.equals("CompanionAds")) {
                            this.f20033a.add(new sg.bigo.ads.core.f.a.a.a.b(a3));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<n> b() {
        List<Node> b = sg.bigo.ads.core.f.a.b(this.b, "Impression", null, null);
        ArrayList arrayList = new ArrayList();
        if (b != null) {
            Iterator<Node> it = b.iterator();
            while (it.hasNext()) {
                String a2 = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(a2)) {
                    arrayList.add(new n(a2));
                }
            }
        }
        return arrayList;
    }

    public final List<n> c() {
        List<Node> c;
        Node a2 = sg.bigo.ads.core.f.a.a(this.b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (a2 != null && (c = sg.bigo.ads.core.f.a.c(a2, "Viewable")) != null) {
            Iterator<Node> it = c.iterator();
            while (it.hasNext()) {
                String a3 = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(a3)) {
                    arrayList.add(new n(a3));
                }
            }
        }
        return arrayList;
    }

    public final List<n> d() {
        List<Node> c;
        Node a2 = sg.bigo.ads.core.f.a.a(this.b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (a2 != null && (c = sg.bigo.ads.core.f.a.c(a2, "NotViewable")) != null) {
            Iterator<Node> it = c.iterator();
            while (it.hasNext()) {
                String a3 = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(a3)) {
                    arrayList.add(new n(a3));
                }
            }
        }
        return arrayList;
    }

    public final int e() {
        String b = sg.bigo.ads.core.f.a.b(this.b, "Expires");
        if (sg.bigo.ads.common.utils.q.a((CharSequence) b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String f() {
        String b = sg.bigo.ads.core.f.a.b(this.b, "AdTitle");
        return b == null ? "" : b;
    }

    public final String g() {
        String b = sg.bigo.ads.core.f.a.b(this.b, IMeta.DESCRIPTION);
        return b == null ? "" : b;
    }

    public final String h() {
        String b = sg.bigo.ads.core.f.a.b(this.b, "AdSystem");
        return b == null ? "" : b;
    }

    public final int i() {
        List<Node> b;
        Node a2 = sg.bigo.ads.core.f.a.a(this.b, "Extensions", null, null);
        if (a2 != null && (b = sg.bigo.ads.core.f.a.b(a2, "Extension", null, null)) != null && !b.isEmpty()) {
            Iterator<Node> it = b.iterator();
            while (it.hasNext()) {
                String b2 = sg.bigo.ads.core.f.a.b(it.next(), "Mute");
                if (sg.bigo.ads.common.utils.q.b((CharSequence) b2)) {
                    return sg.bigo.ads.common.utils.q.a(b2, -1);
                }
            }
        }
        return -1;
    }

    final List<sg.bigo.ads.core.c.a> j() {
        List<Node> b;
        List<Node> c;
        Node namedItem;
        NodeList childNodes;
        String str;
        NodeList childNodes2;
        String nodeValue;
        String nodeValue2;
        Node a2 = sg.bigo.ads.core.f.a.a(this.b, "Extensions", null, null);
        if (a2 == null || (b = sg.bigo.ads.core.f.a.b(a2, "Extension", null, null)) == null || b.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = b.iterator();
        while (it.hasNext()) {
            Node a3 = sg.bigo.ads.core.f.a.a(it.next(), "AdVerifications");
            if (a3 != null && (c = sg.bigo.ads.core.f.a.c(a3, "Verification")) != null && !c.isEmpty()) {
                for (Node node : c) {
                    NamedNodeMap attributes = node.getAttributes();
                    if (attributes != null && (namedItem = attributes.getNamedItem("vendor")) != null) {
                        sg.bigo.ads.core.c.a aVar = new sg.bigo.ads.core.c.a();
                        aVar.b = namedItem.getNodeValue();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("omid");
                        Node a4 = sg.bigo.ads.core.f.a.a(node, "JavaScriptResource", "apiFramework", arrayList2);
                        if (a4 != null && (childNodes = a4.getChildNodes()) != null) {
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= childNodes.getLength()) {
                                    str = "";
                                    break;
                                }
                                Node item = childNodes.item(i2);
                                if (item != null && (nodeValue2 = item.getNodeValue()) != null && nodeValue2.trim().startsWith("http")) {
                                    str = nodeValue2.trim();
                                    break;
                                }
                                i2++;
                            }
                            if (!str.isEmpty()) {
                                aVar.f19968a = str;
                                Node a5 = sg.bigo.ads.core.f.a.a(node, "VerificationParameters");
                                if (a5 != null && (childNodes2 = a5.getChildNodes()) != null) {
                                    while (true) {
                                        if (i >= childNodes2.getLength()) {
                                            break;
                                        }
                                        Node item2 = childNodes2.item(i);
                                        if (item2 != null && (nodeValue = item2.getNodeValue()) != null && nodeValue.trim().length() > 0) {
                                            aVar.c = nodeValue.trim();
                                            break;
                                        }
                                        i++;
                                    }
                                }
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
