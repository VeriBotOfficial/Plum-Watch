package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StorageSettings.java */
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f8407a;
    private boolean b = false;
    private boolean c = true;
    private final List<e> d = new ArrayList();
    private e e = null;

    private f() {
    }

    public static f b() {
        if (f8407a == null) {
            synchronized (f.class) {
                if (f8407a == null) {
                    f8407a = new f();
                }
            }
        }
        return f8407a;
    }

    public e a() {
        return this.e;
    }

    public e a(Context context) {
        String string = context.getSharedPreferences("map_pref", 0).getString("PREFFERED_SD_CARD", "");
        if (string == null || string.length() <= 0) {
            return null;
        }
        for (e eVar : this.d) {
            if (eVar.c().equals(string)) {
                return eVar;
            }
        }
        return null;
    }

    public boolean a(Context context, e eVar) {
        String c = eVar.c();
        SharedPreferences.Editor edit = context.getSharedPreferences("map_pref", 0).edit();
        edit.putString("PREFFERED_SD_CARD", c);
        return edit.commit();
    }

    public void b(Context context) {
        if (this.b || context == null) {
            return;
        }
        this.b = true;
        try {
            this.c = false;
            this.e = new e(context);
            this.d.clear();
            this.d.add(this.e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (this.d.size() > 0) {
                e eVar = null;
                int i = 0;
                for (e eVar2 : this.d) {
                    if (new File(eVar2.a()).exists()) {
                        i++;
                        eVar = eVar2;
                    }
                }
                if (i == 0) {
                    e a2 = a(context);
                    this.e = a2;
                    if (a2 == null) {
                        Iterator<e> it = this.d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            e next = it.next();
                            if (a(context, next)) {
                                this.e = next;
                                break;
                            }
                        }
                    }
                } else if (i == 1) {
                    if (a(context, eVar)) {
                        this.e = eVar;
                    }
                } else {
                    this.e = a(context);
                }
                if (this.e == null) {
                    this.e = this.d.get(0);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (this.e == null) {
                this.c = false;
                this.e = new e(context);
                this.d.clear();
                this.d.add(this.e);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
