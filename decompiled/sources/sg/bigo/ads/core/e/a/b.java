package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.phancy.mini.utils.MimeExtKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.core.e.b;

/* loaded from: classes9.dex */
public abstract class b {
    protected r e;
    protected e f;
    public CopyOnWriteArrayList<d> k;
    public CopyOnWriteArrayList<d> l;
    public CopyOnWriteArrayList<d> m;
    public CopyOnWriteArrayList<d> n;
    private final Map<String, String> o;
    private int p;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<d> f20000a = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<d> b = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<d> c = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<d> d = new CopyOnWriteArrayList<>();

    public b(r rVar) {
        this.e = rVar;
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.f = new e(this.e, hashMap);
    }

    private void a(Context context, final String str, final d dVar, final boolean z) {
        String str2 = dVar.b;
        sg.bigo.ads.common.u.a d = dVar.d();
        int i = dVar.c;
        dVar.a();
        sg.bigo.ads.core.e.b.a(context, i, str, d, str2, this.p, this.o, new b.a() { // from class: sg.bigo.ads.core.e.a.b.5
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                if (dVar.d == 1) {
                    b.a(b.this, str, dVar, true);
                }
                c.a().b(b.this.f);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i2) {
                return b.this.e.a(i2);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                b.a(b.this, str, dVar, z);
                c.a().b(b.this.f);
            }
        });
    }

    static /* synthetic */ void a(b bVar, Context context, final String str, d dVar) {
        String a2 = dVar.d().a();
        final String str2 = dVar.b;
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        if ("sizmek".equals(str2)) {
            a2 = a2.replaceAll("\\?", "%3f");
        }
        bVar.a(str, "start", new sg.bigo.ads.common.u.b.d(a2), str2);
        final sg.bigo.ads.core.h.e a3 = sg.bigo.ads.core.h.e.a(context);
        if (a3 != null) {
            a3.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.core.e.a.b.6
                @Override // sg.bigo.ads.core.h.d
                public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                    a3.destroy();
                }

                @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str3) {
                    super.onPageFinished(webView, str3);
                    b.this.a(str, "success", new sg.bigo.ads.common.u.b.d(str3), str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                    return false;
                }
            });
            try {
                if (dVar.f20011a == 1) {
                    a3.loadUrl(a2);
                } else if (dVar.f20011a == 2) {
                    a3.loadData(a2, MimeExtKt.MIME_TYPE_HTML, "UTF-8");
                }
            } catch (Exception e) {
                sg.bigo.ads.core.d.b.a(3002, 10106, e.getMessage());
            }
        }
    }

    static /* synthetic */ void a(b bVar, String str, d dVar, boolean z) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        CopyOnWriteArrayList<d> copyOnWriteArrayList2;
        CopyOnWriteArrayList<d> copyOnWriteArrayList3;
        CopyOnWriteArrayList<d> copyOnWriteArrayList4;
        if ("impl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList4 = bVar.k) == null) {
                return;
            }
            copyOnWriteArrayList4.remove(dVar);
            return;
        }
        if ("click_track".equals(str)) {
            if (!z || (copyOnWriteArrayList3 = bVar.l) == null) {
                return;
            }
            copyOnWriteArrayList3.remove(dVar);
            return;
        }
        if ("nurl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList2 = bVar.m) == null) {
                return;
            }
            copyOnWriteArrayList2.remove(dVar);
            return;
        }
        if ("lurl_track".equals(str) && z && (copyOnWriteArrayList = bVar.n) != null) {
            copyOnWriteArrayList.remove(dVar);
        }
    }

    public final void a(int i) {
        this.p = i;
        e eVar = this.f;
        if (eVar != null) {
            eVar.r = i;
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        g a2 = g.a(this.o, this.e, this.p, str, str2, str3);
        a2.a(context, a2.f20015a);
    }

    protected final void a(final Context context, boolean z) {
        if (sg.bigo.ads.common.x.a.p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e.f19546a;
        Iterator<d> it = this.f20000a.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z2) {
            this.g = currentTimeMillis;
            this.k = new CopyOnWriteArrayList<>();
            Iterator<d> it2 = this.f20000a.iterator();
            while (it2.hasNext()) {
                d next = it2.next();
                if (!z || next.a()) {
                    if (next.c()) {
                        this.k.add(next);
                    }
                }
            }
            if (this.k.size() > 0) {
                this.f.s = this.k;
                this.f.j = currentTimeMillis;
                this.f.i = 0;
                c.a().a(this.f);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdImpression not need retry");
        }
        Iterator<d> it3 = this.f20000a.iterator();
        while (it3.hasNext()) {
            final d next2 = it3.next();
            if (!z || next2.a()) {
                if (next2.c()) {
                    a(context, "impl_track", next2, z2);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.a(b.this, context, "impl_track", next2);
                        }
                    });
                }
            }
        }
    }

    protected final void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.o.put(str, str2);
    }

    final void a(String str, String str2, sg.bigo.ads.common.u.a aVar, String str3) {
        HashMap hashMap = new HashMap(this.o);
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        hashMap.put("action", str);
        hashMap.put("track_url", aVar.a());
        hashMap.put("domain_front", aVar.e() ? aVar.d() : "");
        hashMap.put("track_name", str3);
        hashMap.put("states", str2);
        hashMap.put("retry", "0");
        hashMap.put("out_ad", String.valueOf(this.p));
        if ("impl_track".equals(str)) {
            sg.bigo.ads.core.d.b.a(hashMap);
        } else if ("click_track".equals(str)) {
            sg.bigo.ads.core.d.b.b(hashMap);
        }
    }

    protected final void b(final Context context, boolean z) {
        if (sg.bigo.ads.common.x.a.p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e.f19546a;
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z2) {
            this.h = currentTimeMillis;
            this.l = new CopyOnWriteArrayList<>();
            Iterator<d> it2 = this.b.iterator();
            while (it2.hasNext()) {
                d next = it2.next();
                if (!z || next.a()) {
                    if (next.c()) {
                        this.l.add(next);
                    }
                }
            }
            if (this.l.size() > 0) {
                this.f.t = this.l;
                this.f.l = currentTimeMillis;
                this.f.k = 0;
                c.a().a(this.f);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdClick not need retry");
        }
        Iterator<d> it3 = this.b.iterator();
        while (it3.hasNext()) {
            final d next2 = it3.next();
            if (!z || next2.a()) {
                if (next2.c()) {
                    a(context, "click_track", next2, z2);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.a(b.this, context, "click_track", next2);
                        }
                    });
                }
            }
        }
    }

    public final void b(String str, String str2) {
        Iterator<d> it = this.f20000a.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.c()) {
                next.a(str, str2);
            }
        }
        Iterator<d> it2 = this.b.iterator();
        while (it2.hasNext()) {
            d next2 = it2.next();
            if (next2.c()) {
                next2.a(str, str2);
            }
        }
        Iterator<d> it3 = this.c.iterator();
        while (it3.hasNext()) {
            d next3 = it3.next();
            if (next3.c()) {
                next3.a(str, str2);
            }
        }
        Iterator<d> it4 = this.d.iterator();
        while (it4.hasNext()) {
            d next4 = it4.next();
            if (next4.c()) {
                next4.a(str, str2);
            }
        }
    }

    protected final void c(final Context context, boolean z) {
        if (sg.bigo.ads.common.x.a.p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e.f19546a;
        Iterator<d> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z2) {
            this.i = currentTimeMillis;
            this.m = new CopyOnWriteArrayList<>();
            Iterator<d> it2 = this.c.iterator();
            while (it2.hasNext()) {
                d next = it2.next();
                if (!z || next.a()) {
                    if (next.c()) {
                        this.m.add(next);
                    }
                }
            }
            if (this.m.size() > 0) {
                this.f.u = this.m;
                this.f.n = currentTimeMillis;
                this.f.m = 0;
                c.a().a(this.f);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdNUrl not need retry");
        }
        Iterator<d> it3 = this.c.iterator();
        while (it3.hasNext()) {
            final d next2 = it3.next();
            if (!z || next2.a()) {
                if (next2.c()) {
                    a(context, "nurl_track", next2, z2);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.a(b.this, context, "nurl_track", next2);
                        }
                    });
                }
            }
        }
    }

    protected final void d(final Context context, boolean z) {
        if (sg.bigo.ads.common.x.a.p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e.f19546a;
        Iterator<d> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z2) {
            this.j = currentTimeMillis;
            this.n = new CopyOnWriteArrayList<>();
            Iterator<d> it2 = this.d.iterator();
            while (it2.hasNext()) {
                d next = it2.next();
                if (!z || next.a()) {
                    if (next.c()) {
                        this.n.add(next);
                    }
                }
            }
            if (this.n.size() > 0) {
                this.f.v = this.n;
                this.f.p = currentTimeMillis;
                this.f.o = 0;
                c.a().a(this.f);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdLUrl not need retry");
        }
        Iterator<d> it3 = this.d.iterator();
        while (it3.hasNext()) {
            final d next2 = it3.next();
            if (!z || next2.a()) {
                if (next2.c()) {
                    a(context, "lurl_track", next2, z2);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.a(b.this, context, "lurl_track", next2);
                        }
                    });
                }
            }
        }
    }
}
