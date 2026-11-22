package com.anythink.basead.h.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.c.c;
import com.anythink.basead.b.f;
import com.anythink.basead.d.c;
import com.anythink.basead.d.g;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.az;
import com.anythink.core.common.h.ba;
import com.anythink.core.common.h.x;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f2795a;
    private Context b;

    private a(Context context) {
        this.b = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (f2795a == null) {
            f2795a = new a(context);
        }
        return f2795a;
    }

    public final void a(az azVar) {
        List<ay> aa;
        ba Z;
        l a2 = n.a(this.b).a(azVar.b);
        if (a2 == null || (aa = a2.aa()) == null || (Z = a2.Z()) == null) {
            return;
        }
        f.a();
        if (aa != null) {
            int size = aa.size();
            for (int i = 0; i < size; i++) {
                x xVar = new x();
                xVar.o = Z;
                if (azVar.f3863a != null) {
                    xVar.u = azVar.f3863a.getChannelSource();
                }
                f.a(azVar.b, true, aa.get(i), xVar, null);
            }
        }
    }

    public final ay a(String str, String str2) {
        l a2 = n.a(this.b).a(str);
        if (a2 == null) {
            return null;
        }
        return a2.b(str2);
    }

    public final String a(String str) {
        l a2 = n.a(this.b).a(str);
        if (a2 == null) {
            return "";
        }
        List<ay> aa = a2.aa();
        ArrayList arrayList = new ArrayList();
        if (aa == null || aa.size() == 0) {
            return "";
        }
        for (int size = aa.size() - 1; size >= 0; size--) {
            ay ayVar = aa.get(size);
            f.a();
            if (!f.a(ayVar, a2.aq(), a2.Z())) {
                aa.remove(size);
            } else {
                arrayList.add(b.a(this.b).d(ayVar));
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        Collections.sort(arrayList, new Comparator<c>() { // from class: com.anythink.basead.h.a.a.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(c cVar, c cVar2) {
                return Integer.valueOf(cVar.d).compareTo(Integer.valueOf(cVar2.d));
            }

            private static int a(c cVar, c cVar2) {
                return Integer.valueOf(cVar.d).compareTo(Integer.valueOf(cVar2.d));
            }
        });
        return ((c) arrayList.get(0)).f2327a;
    }

    public final void a(String str, ay ayVar, x xVar, c.b bVar) {
        if (a(ayVar)) {
            bVar.a(g.a(g.h, g.M));
            return;
        }
        if (b.a(this.b).b(ayVar)) {
            bVar.a(g.a(g.e, g.F));
        } else if (b.a(this.b).c(ayVar)) {
            bVar.a(g.a(g.f, g.G));
        } else {
            f.a();
            f.a(str, ayVar, xVar, bVar);
        }
    }

    private static boolean a(ay ayVar) {
        List<String> k = t.b().k();
        if (k == null) {
            return false;
        }
        Iterator<String> it = k.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(ayVar.I(), it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(ay ayVar, x xVar, boolean z) {
        if (this.b == null || ayVar == null || a(ayVar)) {
            return false;
        }
        if (z) {
            f.a();
            return f.a(ayVar, xVar);
        }
        if (!b.a(this.b).b(ayVar) && !b.a(this.b).c(ayVar)) {
            f.a();
            if (f.a(ayVar, xVar)) {
                return true;
            }
        }
        return false;
    }
}
