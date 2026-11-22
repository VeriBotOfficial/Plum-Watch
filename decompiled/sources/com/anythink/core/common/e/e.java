package com.anythink.core.common.e;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.c.b.e;
import com.anythink.core.common.e.a;
import com.anythink.core.common.e.b;
import com.anythink.core.common.e.f;
import com.anythink.core.common.e.g;
import com.anythink.core.common.e.h;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.anythink.core.common.e.n;
import com.anythink.core.common.e.o;
import com.anythink.core.common.e.p;
import com.anythink.core.common.e.q;

/* loaded from: classes12.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    private static e f3761a;

    @Override // com.anythink.core.common.e.d
    protected final int d() {
        return 20;
    }

    private e(Context context) {
        super(context);
    }

    public static e a(Context context) {
        if (f3761a == null) {
            synchronized (e.class) {
                if (f3761a == null) {
                    f3761a = new e(context.getApplicationContext());
                }
            }
        }
        return f3761a;
    }

    @Override // com.anythink.core.common.e.d
    protected final String c() {
        return "anythink.db";
    }

    @Override // com.anythink.core.common.e.d
    protected final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.e.d
    protected final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            switch (i3) {
                case 1:
                case 2:
                    d(sQLiteDatabase);
                    c(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(p.a.j);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(n.a.h);
                    sQLiteDatabase.execSQL(o.a.j);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(i.a.h);
                    sQLiteDatabase.execSQL(h.a.f);
                    break;
                case 6:
                    sQLiteDatabase.execSQL(l.a.g);
                    break;
                case 7:
                    sQLiteDatabase.execSQL(q.a.h);
                    break;
                case 8:
                    sQLiteDatabase.execSQL(m.b.i);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
                    sQLiteDatabase.execSQL(k.a.i);
                    break;
                case 9:
                    sQLiteDatabase.execSQL(e.a.l);
                    break;
                case 10:
                    try {
                        sQLiteDatabase.execSQL(e.a.l);
                    } catch (Throwable unused) {
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                    sQLiteDatabase.execSQL(o.a.j);
                    break;
                case 11:
                    sQLiteDatabase.execSQL(e.a.m);
                    sQLiteDatabase.execSQL(e.a.n);
                    break;
                case 12:
                    try {
                        sQLiteDatabase.execSQL(g.a.O);
                        break;
                    } catch (Throwable th) {
                        th.getMessage();
                        break;
                    }
                case 13:
                    try {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                        sQLiteDatabase.execSQL(o.a.j);
                        break;
                    } catch (SQLException e) {
                        e.getMessage();
                        break;
                    }
                case 14:
                    try {
                        sQLiteDatabase.execSQL(l.a.h);
                        break;
                    } catch (Throwable th2) {
                        th2.getMessage();
                        break;
                    }
                case 15:
                    if (i == 15) {
                        try {
                            sQLiteDatabase.execSQL(l.a.i);
                            break;
                        } catch (Throwable th3) {
                            th3.getMessage();
                            break;
                        }
                    } else {
                        break;
                    }
                case 16:
                    try {
                        sQLiteDatabase.execSQL(j.a.g);
                        sQLiteDatabase.execSQL(j.a.h);
                        sQLiteDatabase.execSQL(j.a.i);
                        sQLiteDatabase.execSQL(j.a.j);
                        sQLiteDatabase.execSQL(j.a.k);
                        sQLiteDatabase.execSQL(j.a.l);
                        break;
                    } catch (Throwable th4) {
                        th4.getMessage();
                        break;
                    }
                case 17:
                    try {
                        sQLiteDatabase.execSQL(b.a.h);
                        break;
                    } catch (Throwable unused2) {
                        break;
                    }
                case 18:
                    try {
                        sQLiteDatabase.execSQL(a.C0193a.r);
                        break;
                    } catch (Throwable th5) {
                        th5.getMessage();
                        break;
                    }
                case 19:
                    try {
                        sQLiteDatabase.execSQL(a.C0193a.s);
                        sQLiteDatabase.execSQL(a.C0193a.t);
                        sQLiteDatabase.execSQL(a.C0193a.u);
                        break;
                    } catch (Throwable th6) {
                        th6.getMessage();
                        break;
                    }
            }
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f.a.f);
            sQLiteDatabase.execSQL(k.a.i);
            a(sQLiteDatabase, 3, 20);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'placement_ad_impression'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_action_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_show_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_install_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'inspect_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video_res_cache_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'notice_url_fail_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'user_value_placement'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.e.d
    protected final void b(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }
}
