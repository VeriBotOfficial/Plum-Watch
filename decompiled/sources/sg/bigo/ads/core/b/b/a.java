package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.aa.c;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;
import sg.bigo.ads.core.b.c.b;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    b.AbstractRunnableC1100b f19956a = null;
    public final b b;
    final g c;
    final Context d;
    private final sg.bigo.ads.core.b.a.a e;
    private final j f;

    public a(Context context, sg.bigo.ads.core.b.a.a aVar, j jVar, g gVar) {
        this.d = context;
        this.b = new b(aVar);
        this.e = aVar;
        this.f = jVar;
        this.c = gVar;
    }

    static /* synthetic */ void a(a aVar) {
        if (aVar.b.c() >= aVar.e.f19954a) {
            aVar.a();
        } else {
            if (aVar.b.d()) {
                return;
            }
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        sg.bigo.ads.core.b.c.b.a(this.f19956a);
        this.f19956a = null;
        final List<sg.bigo.ads.common.g.b.a> b = this.b.b();
        if (b.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = b.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().c));
            } catch (JSONException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(d.ar, jSONArray);
        this.f.a(hashMap, new j.a() { // from class: sg.bigo.ads.core.b.b.a.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.b.a(b, true);
                        a.this.b.e();
                        if (a.this.b.d()) {
                            return;
                        }
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i, int i2, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.b.a(b, false);
                        a.this.b();
                    }
                });
            }
        });
    }

    public final void a(final String str, final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                a.this.b.a(aVar);
                if (TextUtils.isEmpty(a.this.c.P())) {
                    return;
                }
                if ("impression".equals(str) || "clicked".equals(str)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                    a.this.a();
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + aVar.toString());
                    a.a(a.this);
                }
            }
        });
    }

    final void b() {
        if (this.f19956a != null) {
            return;
        }
        this.f19956a = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (c.b(a.this.d)) {
                    a.this.a();
                } else {
                    a.this.f19956a = null;
                    a.this.b();
                }
            }
        }, this.e.b);
    }
}
