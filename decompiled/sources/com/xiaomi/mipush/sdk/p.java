package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f14400a;

    /* renamed from: a, reason: collision with other field name */
    private Context f146a;

    /* renamed from: a, reason: collision with other field name */
    private List<n> f147a = new ArrayList();

    private p(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f146a = applicationContext;
        if (applicationContext == null) {
            this.f146a = context;
        }
    }

    public static p a(Context context) {
        if (f14400a == null) {
            synchronized (p.class) {
                if (f14400a == null) {
                    f14400a = new p(context);
                }
            }
        }
        return f14400a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11837a(String str) {
        synchronized (this.f147a) {
            n nVar = new n();
            nVar.f14398a = 0;
            nVar.f144a = str;
            if (this.f147a.contains(nVar)) {
                this.f147a.remove(nVar);
            }
            this.f147a.add(nVar);
        }
    }

    public void b(String str) {
        synchronized (this.f147a) {
            n nVar = new n();
            nVar.f144a = str;
            if (this.f147a.contains(nVar)) {
                Iterator<n> it = this.f147a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    n next = it.next();
                    if (nVar.equals(next)) {
                        nVar = next;
                        break;
                    }
                }
            }
            nVar.f14398a++;
            this.f147a.remove(nVar);
            this.f147a.add(nVar);
        }
    }

    public int a(String str) {
        synchronized (this.f147a) {
            n nVar = new n();
            nVar.f144a = str;
            if (this.f147a.contains(nVar)) {
                for (n nVar2 : this.f147a) {
                    if (nVar2.equals(nVar)) {
                        return nVar2.f14398a;
                    }
                }
            }
            return 0;
        }
    }

    public void c(String str) {
        synchronized (this.f147a) {
            n nVar = new n();
            nVar.f144a = str;
            if (this.f147a.contains(nVar)) {
                this.f147a.remove(nVar);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11838a(String str) {
        synchronized (this.f147a) {
            n nVar = new n();
            nVar.f144a = str;
            return this.f147a.contains(nVar);
        }
    }

    public synchronized String a(v vVar) {
        return this.f146a.getSharedPreferences("mipush_extra", 0).getString(vVar.name(), "");
    }

    public synchronized void a(v vVar, String str) {
        SharedPreferences sharedPreferences = this.f146a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(vVar.name(), str).apply();
    }
}
