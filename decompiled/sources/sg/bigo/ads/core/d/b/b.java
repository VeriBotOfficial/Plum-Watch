package sg.bigo.ads.core.d.b;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.d.a.a;
import sg.bigo.ads.core.d.c.a;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.core.d.a.a f19981a;
    a.b b = null;
    public final c c;
    final g d;
    final Context e;
    private final j f;

    public b(Context context, sg.bigo.ads.core.d.a.a aVar, j jVar, g gVar) {
        this.e = context;
        this.c = new c(aVar);
        this.f19981a = aVar;
        this.f = jVar;
        this.d = gVar;
    }

    static /* synthetic */ void a(b bVar) {
        if (bVar.c.b() >= bVar.f19981a.f19977a) {
            bVar.a();
        } else {
            bVar.b();
        }
    }

    public static a b(String str, Map<String, String> map) {
        return new a(str, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        sg.bigo.ads.core.d.c.a.a(this.b);
        this.b = null;
        final List<sg.bigo.ads.common.g.b.b> a2 = this.c.a();
        if (a2.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Stats", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (sg.bigo.ads.common.g.b.b bVar : a2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", bVar.b);
                jSONObject.put("event_info", bVar.c);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_events", jSONArray);
        this.f.a(hashMap, new j.a() { // from class: sg.bigo.ads.core.d.b.b.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.c.a(a2, true);
                        b.this.c.d();
                        b.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i, int i2, String str) {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.c.a(a2, false);
                        b.this.b();
                    }
                });
            }
        });
    }

    public final void a(final String str, final Map<String, String> map) {
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                a.C1102a c1102a = b.this.f19981a.c.get(str);
                boolean z = c1102a == null ? true : c1102a.c;
                b.this.c.a(b.b(str, map).a(b.this.d, (b.this.f19981a.c.get(str) == null ? 3600000 : r1.d) + System.currentTimeMillis()));
                if (z) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendDefer -> eventId=" + str + ", events=" + map);
                    b.a(b.this);
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendImmediately -> eventId=" + str + ", events=" + map);
                    b.this.a();
                }
            }
        });
    }

    final void b() {
        if (this.b != null) {
            return;
        }
        if (this.c.c()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Stats", "no events waitting for sending");
        } else {
            this.b = sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.common.aa.c.b(b.this.e)) {
                        b.this.a();
                    } else {
                        b.this.b = null;
                        b.this.b();
                    }
                }
            }, this.f19981a.b);
        }
    }
}
