package sg.bigo.ads.core.f.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    final Node f20034a;

    public h(Node node) {
        this.f20034a = node;
    }

    private static void a(List<l> list, List<String> list2, float f) {
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            list.add(new l(it.next(), f));
        }
    }

    private List<String> b(String str) {
        List<Node> b;
        ArrayList arrayList = new ArrayList();
        Node a2 = sg.bigo.ads.core.f.a.a(this.f20034a, "TrackingEvents");
        if (a2 != null && (b = sg.bigo.ads.core.f.a.b(a2, "Tracking", "event", Collections.singletonList(str))) != null) {
            Iterator<Node> it = b.iterator();
            while (it.hasNext()) {
                String a3 = sg.bigo.ads.core.f.a.a(it.next());
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
        }
        return arrayList;
    }

    final String a() {
        Node a2 = sg.bigo.ads.core.f.a.a(this.f20034a, "VideoClicks", null, null);
        if (a2 == null) {
            return null;
        }
        return sg.bigo.ads.core.f.a.a(sg.bigo.ads.core.f.a.a(a2, "ClickThrough", null, null));
    }

    final List<n> a(String str) {
        List<String> b = b(str);
        ArrayList arrayList = new ArrayList(b.size());
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next()));
        }
        return arrayList;
    }

    final List<n> b() {
        List<Node> c;
        ArrayList arrayList = new ArrayList();
        Node a2 = sg.bigo.ads.core.f.a.a(this.f20034a, "VideoClicks");
        if (a2 != null && (c = sg.bigo.ads.core.f.a.c(a2, "ClickTracking")) != null) {
            Iterator<Node> it = c.iterator();
            while (it.hasNext()) {
                String a3 = sg.bigo.ads.core.f.a.a(it.next());
                if (a3 != null) {
                    arrayList.add(new n(a3));
                }
            }
        }
        return arrayList;
    }

    final List<j> c() {
        List<String> b = b("mute");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new j(it.next(), true));
        }
        Iterator<String> it2 = b("unmute").iterator();
        while (it2.hasNext()) {
            arrayList.add(new j(it2.next(), false));
        }
        return arrayList;
    }

    final List<n> d() {
        List<n> a2 = a("close");
        a2.addAll(a("closeLinear"));
        return a2;
    }

    final List<n> e() {
        List<String> b = b("pause");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next(), (byte) 0));
        }
        return arrayList;
    }

    final List<n> f() {
        List<String> b = b("resume");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next(), (byte) 0));
        }
        return arrayList;
    }

    final List<l> g() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, b("firstQuartile"), 25.0f);
        a(arrayList, b("midpoint"), 50.0f);
        a(arrayList, b("thirdQuartile"), 75.0f);
        List<Node> b = sg.bigo.ads.core.f.a.b(sg.bigo.ads.core.f.a.a(this.f20034a, "TrackingEvents"), "Tracking", "event", Collections.singletonList("progress"));
        if (b != null) {
            for (Node node : b) {
                String e = sg.bigo.ads.core.f.a.e(node, "offset");
                if (e != null) {
                    String trim = e.trim();
                    if (o.a(trim)) {
                        String a2 = sg.bigo.ads.core.f.a.a(node);
                        try {
                            int d = o.d(trim);
                            if (d >= 0 && sg.bigo.ads.common.utils.q.b((CharSequence) a2)) {
                                arrayList.add(new l(a2, d));
                            }
                        } catch (NumberFormatException unused) {
                            sg.bigo.ads.common.t.a.a(0, 3, "VastLinearNode", String.format("Failed to parse VAST progress tracker %s", trim));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    final List<c> h() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b("start").iterator();
        while (it.hasNext()) {
            arrayList.add(new c(it.next(), 0));
        }
        Node a2 = sg.bigo.ads.core.f.a.a(this.f20034a, "TrackingEvents");
        List<Node> b = sg.bigo.ads.core.f.a.b(a2, "Tracking", "event", Collections.singletonList("progress"));
        if (b != null) {
            for (Node node : b) {
                String e = sg.bigo.ads.core.f.a.e(node, "offset");
                if (e != null) {
                    String trim = e.trim();
                    if (o.b(trim)) {
                        String b2 = sg.bigo.ads.core.f.a.b(node);
                        if (!sg.bigo.ads.common.utils.q.a((CharSequence) b2)) {
                            try {
                                int c = o.c(trim);
                                if (c >= 0) {
                                    arrayList.add(new c(b2, c));
                                }
                            } catch (NumberFormatException unused) {
                                sg.bigo.ads.common.t.a.a(0, 3, "VastLinearNode", String.format("Failed to parse VAST progress tracker %s", trim));
                            }
                        }
                    }
                }
            }
        }
        List<Node> b3 = sg.bigo.ads.core.f.a.b(a2, "Tracking", "event", Collections.singletonList("creativeView"));
        if (b3 != null) {
            Iterator<Node> it2 = b3.iterator();
            while (it2.hasNext()) {
                String a3 = sg.bigo.ads.core.f.a.a(it2.next());
                if (a3 != null) {
                    arrayList.add(new c(a3, 0));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final int i() {
        String b = sg.bigo.ads.core.f.a.b(this.f20034a, "Duration");
        if (sg.bigo.ads.common.utils.q.a((CharSequence) b)) {
            return -1;
        }
        return o.c(b);
    }
}
