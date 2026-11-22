package sg.bigo.ads.core.d.b;

import android.content.ContentValues;
import io.nats.client.support.ApiConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f19987a;
    public Set<sg.bigo.ads.common.g.b.b> b;
    private final sg.bigo.ads.core.d.a.a c;

    public c(sg.bigo.ads.core.d.a.a aVar) {
        this.c = aVar;
        this.f19987a = p.a(aVar.f19977a);
        this.b = p.a(aVar.f19977a);
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                long currentTimeMillis = System.currentTimeMillis();
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo");
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo count = ".concat(String.valueOf(sg.bigo.ads.common.g.a.a.b("tb_stat", "expired_ts < ".concat(String.valueOf(currentTimeMillis)), null))));
                cVar.f19987a.addAll(cVar.e());
            }
        });
    }

    final synchronized List<sg.bigo.ads.common.g.b.b> a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f19987a);
        Iterator<sg.bigo.ads.common.g.b.b> it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f19987a.clear();
        this.b.addAll(arrayList);
        return arrayList;
    }

    final synchronized void a(List<sg.bigo.ads.common.g.b.b> list, boolean z) {
        this.b.removeAll(list);
        if (!z) {
            this.f19987a.addAll(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<sg.bigo.ads.common.g.b.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().f19618a));
        }
        sg.bigo.ads.common.g.c.b.a(arrayList);
    }

    final synchronized void a(sg.bigo.ads.common.g.b.b bVar) {
        this.f19987a.add(bVar);
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "insertStatInfo:" + bVar.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", bVar.b);
        contentValues.put("event_info", bVar.c);
        contentValues.put("expired_ts", Long.valueOf(bVar.d));
        contentValues.put("ext", bVar.e);
        contentValues.put("ctime", Long.valueOf(bVar.f == 0 ? System.currentTimeMillis() : bVar.f));
        contentValues.put(ApiConstants.MTIME, Long.valueOf(bVar.g == 0 ? System.currentTimeMillis() : bVar.g));
        bVar.f19618a = sg.bigo.ads.common.g.a.a.a("tb_stat", contentValues);
    }

    final synchronized int b() {
        return this.f19987a.size();
    }

    final synchronized boolean c() {
        return this.f19987a.isEmpty();
    }

    public final synchronized void d() {
        if (this.f19987a.isEmpty()) {
            List<sg.bigo.ads.common.g.b.b> e = e();
            Iterator<sg.bigo.ads.common.g.b.b> it = this.b.iterator();
            while (it.hasNext()) {
                e.remove(it.next());
            }
            this.f19987a.addAll(e);
        }
    }

    final List<sg.bigo.ads.common.g.b.b> e() {
        return sg.bigo.ads.common.g.c.b.a(this.c.a());
    }

    public final synchronized void f() {
        this.b.clear();
        this.f19987a.clear();
    }
}
