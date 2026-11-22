package com.vivo.push.e.a;

import android.text.TextUtils;
import com.vivo.push.restructure.request.a.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* compiled from: SyncProfileInfoInputDS.java */
/* loaded from: classes2.dex */
public final class b implements com.vivo.push.restructure.request.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a<b> f14075a = new c();
    private String b;
    private List<com.vivo.push.e.b> c;
    private int d;

    public b(String str, List<com.vivo.push.e.b> list, int i) {
        new ArrayList();
        this.b = str;
        this.d = i;
        this.c = list;
    }

    protected b(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.c = new ArrayList();
        this.b = aVar.c();
        this.d = aVar.a();
        aVar.a(com.vivo.push.e.b.f14076a, this.c);
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.d);
        aVar.a(this.c);
    }

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<com.vivo.push.e.b> it = this.c.iterator();
        while (it.hasNext()) {
            String b = it.next().b();
            if (!TextUtils.isEmpty(b)) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
