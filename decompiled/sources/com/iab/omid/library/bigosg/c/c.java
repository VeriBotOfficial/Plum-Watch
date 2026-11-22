package com.iab.omid.library.bigosg.c;

import android.view.View;
import com.iab.omid.library.bigosg.c.a;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f10909a;

    public c(a aVar) {
        this.f10909a = aVar;
    }

    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.bigosg.b.a a2 = com.iab.omid.library.bigosg.b.a.a();
        if (a2 != null) {
            Collection<com.iab.omid.library.bigosg.adsession.a> c = a2.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            Iterator<com.iab.omid.library.bigosg.adsession.a> it = c.iterator();
            while (it.hasNext()) {
                View d = it.next().d();
                if (d != null && f.c(d) && (rootView = d.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a3 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.bigosg.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.bigosg.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.bigosg.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0619a interfaceC0619a, boolean z) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0619a.a(it.next(), this.f10909a, jSONObject);
        }
    }
}
