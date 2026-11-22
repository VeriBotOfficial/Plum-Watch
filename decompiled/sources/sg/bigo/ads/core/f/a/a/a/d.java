package sg.bigo.ads.core.f.a.a.a;

import android.text.TextUtils;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.utils.k;

/* loaded from: classes9.dex */
public final class d implements sg.bigo.ads.core.f.a.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final Node f20024a;
    private final String b;
    private final int c;
    private final int d;
    private String g;
    private sg.bigo.ads.core.f.a.a.a h;
    private String i;
    private final List<sg.bigo.ads.core.f.a.a.g> e = new ArrayList();
    private final List<String> f = new ArrayList();
    private final List<sg.bigo.ads.core.f.a.a.c> j = new ArrayList();

    public d(Node node) {
        this.f20024a = node;
        this.b = sg.bigo.ads.core.f.a.e(node, "id");
        this.c = sg.bigo.ads.core.f.a.d(node, "width").intValue();
        this.d = sg.bigo.ads.core.f.a.d(node, "height").intValue();
        g();
    }

    private void g() {
        List<Node> b = sg.bigo.ads.core.f.a.b(this.f20024a, "StaticResource", null, null);
        if (!k.a((Collection) b)) {
            for (Node node : b) {
                this.e.add(new g(sg.bigo.ads.core.f.a.e(node, "creativeType"), sg.bigo.ads.core.f.a.a(node)));
            }
        }
        List<Node> b2 = sg.bigo.ads.core.f.a.b(this.f20024a, "IFrameResource", null, null);
        if (!k.a((Collection) b2)) {
            Iterator<Node> it = b2.iterator();
            while (it.hasNext()) {
                this.e.add(new f(sg.bigo.ads.core.f.a.b(it.next())));
            }
        }
        List<Node> b3 = sg.bigo.ads.core.f.a.b(this.f20024a, "HTMLResource", null, null);
        if (!k.a((Collection) b3)) {
            Iterator<Node> it2 = b3.iterator();
            while (it2.hasNext()) {
                this.e.add(new e(sg.bigo.ads.core.f.a.b(it2.next())));
            }
        }
        Node a2 = sg.bigo.ads.core.f.a.a(this.f20024a, "AltText", null, null);
        if (a2 != null) {
            this.g = sg.bigo.ads.core.f.a.b(a2);
        }
        Node a3 = sg.bigo.ads.core.f.a.a(this.f20024a, "AdParameters", null, null);
        if (a3 != null) {
            this.h = new a(TextUtils.equals(sg.bigo.ads.core.f.a.e(a3, "xmlEncoded"), MediaConstraintKeys.TRUE), sg.bigo.ads.core.f.a.b(a3));
        }
        Node a4 = sg.bigo.ads.core.f.a.a(this.f20024a, "CompanionClickThrough", null, null);
        if (a4 != null) {
            this.i = sg.bigo.ads.core.f.a.a(a4);
        }
        List<Node> b4 = sg.bigo.ads.core.f.a.b(this.f20024a, "CompanionClickTracking", null, null);
        if (!k.a((Collection) b4)) {
            for (Node node2 : b4) {
                this.j.add(new c(sg.bigo.ads.core.f.a.e(node2, "id"), sg.bigo.ads.core.f.a.a(node2)));
            }
        }
        Node a5 = sg.bigo.ads.core.f.a.a(this.f20024a, "TrackingEvents", null, null);
        if (a5 != null) {
            List<Node> b5 = sg.bigo.ads.core.f.a.b(a5, "Tracking", "event", Arrays.asList("creativeView"));
            if (k.a((Collection) b5)) {
                return;
            }
            Iterator<Node> it3 = b5.iterator();
            while (it3.hasNext()) {
                String a6 = sg.bigo.ads.core.f.a.a(it3.next());
                if (!TextUtils.isEmpty(a6)) {
                    this.f.add(a6);
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int a() {
        return this.c;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int b() {
        return this.d;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.g> c() {
        return this.e;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final String d() {
        return this.i;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.c> e() {
        return this.j;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<String> f() {
        return this.f;
    }
}
