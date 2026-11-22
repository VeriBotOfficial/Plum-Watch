package com.anythink.expressad.foundation.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4762a = "a";
    private static volatile a c;
    SharedPreferences b;

    private a() {
    }

    public static a a() {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final void a(String str, String str2) {
        try {
            Context e = com.anythink.expressad.foundation.b.a.c().e();
            if (e == null) {
                return;
            }
            if (this.b == null && e != null) {
                this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
            }
            SharedPreferences.Editor edit = this.b.edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(String str, int i) {
        try {
            Context e = com.anythink.expressad.foundation.b.a.c().e();
            if (e == null) {
                return;
            }
            if (this.b == null && e != null) {
                this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
            }
            SharedPreferences.Editor edit = this.b.edit();
            edit.putInt(str, i);
            edit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private int c(String str) {
        try {
            Context e = com.anythink.expressad.foundation.b.a.c().e();
            if (e == null) {
                return 0;
            }
            if (this.b == null && e != null) {
                this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
            }
            return this.b.getInt(str, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private void a(String str, long j) {
        try {
            Context e = com.anythink.expressad.foundation.b.a.c().e();
            if (e == null) {
                return;
            }
            if (this.b == null && e != null) {
                this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
            }
            SharedPreferences.Editor edit = this.b.edit();
            edit.putLong(str, j);
            edit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private Long d(String str) {
        try {
            Context e = com.anythink.expressad.foundation.b.a.c().e();
            if (e == null) {
                return 0L;
            }
            if (this.b == null && e != null) {
                this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
            }
            return Long.valueOf(this.b.getLong(str, 0L));
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    private int b(String str, int i) {
        try {
            Context e = com.anythink.expressad.foundation.b.a.c().e();
            if (e == null) {
                return i;
            }
            if (this.b == null) {
                this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
            }
            return this.b.getInt(str, i);
        } catch (Exception e2) {
            e2.printStackTrace();
            return i;
        }
    }

    public final String a(String str) {
        try {
            Context e = com.anythink.expressad.foundation.b.a.c().e();
            if (e == null) {
                return null;
            }
            if (this.b == null && e != null) {
                this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
            }
            return this.b.getString(str, "");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList();
        Context e = com.anythink.expressad.foundation.b.a.c().e();
        if (e == null) {
            return null;
        }
        if (this.b == null && e != null) {
            this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
        }
        Iterator<Map.Entry<String, ?>> it = this.b.getAll().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public final void b(String str) {
        Context e = com.anythink.expressad.foundation.b.a.c().e();
        if (e == null) {
            return;
        }
        if (this.b == null && e != null) {
            this.b = e.getSharedPreferences(com.anythink.expressad.foundation.g.a.s, 0);
        }
        this.b.edit().remove(str).apply();
    }
}
