package sg.bigo.ads.common.g.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.g.a.c;
import sg.bigo.ads.common.utils.t;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static c f19610a;
    static AtomicBoolean b = new AtomicBoolean(false);
    static SQLiteDatabase c;

    /* renamed from: sg.bigo.ads.common.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1075a {
        void a();

        void a(String str);
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } catch (SQLException unused) {
            sg.bigo.ads.common.t.a.a(0, "DbHelper", "Failed: ".concat(String.valueOf(contentValues)));
            return 0;
        }
    }

    public static long a(String str, ContentValues contentValues) {
        b();
        if (c != null && !sg.bigo.ads.common.x.a.p()) {
            try {
                return c.insert(str, null, contentValues);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static Cursor a(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Cursor a(String str, String str2, String[] strArr, String str3, int i) {
        b();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, str3, Integer.toString(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a() {
        t.a();
    }

    public static void a(Context context) {
        b.set(false);
        f19610a = null;
        a(context, (InterfaceC1075a) null);
    }

    public static void a(Context context, String str) {
        File databasePath = context.getDatabasePath("bigo_ads_sdk.db");
        sg.bigo.ads.common.t.a.a(0, "DbHelper", String.format("exception path:%s exists:%s isfile:%s read:%s write:%s exec:%s hidden:%s errormsg:%s", databasePath.getPath(), Boolean.valueOf(databasePath.exists()), Boolean.valueOf(databasePath.isFile()), Boolean.valueOf(databasePath.canRead()), Boolean.valueOf(databasePath.canWrite()), Boolean.valueOf(databasePath.canExecute()), Boolean.valueOf(databasePath.isHidden()), str));
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase start");
        context.deleteDatabase("bigo_ads_sdk.db");
        b.a();
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase end");
    }

    public static void a(final Context context, final InterfaceC1075a interfaceC1075a) {
        c cVar = new c();
        f19610a = cVar;
        c.a aVar = new c.a(new Runnable() { // from class: sg.bigo.ads.common.g.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init start");
                try {
                    a.c = b.a(context).getWritableDatabase();
                } catch (Throwable th) {
                    a.a(context, Log.getStackTraceString(th));
                    try {
                        a.c = b.a(context).getWritableDatabase();
                    } catch (Throwable th2) {
                        sg.bigo.ads.common.t.a.a(0, "DbHelper", "can't get db final," + th2.getMessage());
                        a.c = null;
                    }
                }
                a.b.set(true);
                a.f19610a = null;
                if (interfaceC1075a != null) {
                    if (a.c != null) {
                        interfaceC1075a.a();
                    } else {
                        interfaceC1075a.a("");
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init end");
            }
        });
        Runnable runnable = aVar.b;
        synchronized (cVar.b) {
            cVar.f19613a.add(runnable);
        }
        cVar.c.execute(new Runnable() { // from class: sg.bigo.ads.common.g.a.c.1

            /* renamed from: a */
            final /* synthetic */ a f19614a;
            final /* synthetic */ Runnable b;

            AnonymousClass1(a aVar2, Runnable runnable2) {
                r2 = aVar2;
                r3 = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r2.run();
                r3.run();
                synchronized (c.this.b) {
                    c.this.f19613a.remove(r3);
                }
            }
        });
    }

    public static int b(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long b(String str, ContentValues contentValues) {
        b();
        if (c != null && !sg.bigo.ads.common.x.a.p()) {
            try {
                return c.insertWithOnConflict(str, null, contentValues, 5);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    private static void b() {
        Runnable poll;
        c cVar = f19610a;
        if (cVar == null || b.get()) {
            return;
        }
        while (true) {
            synchronized (cVar.b) {
                poll = cVar.f19613a.poll();
            }
            if (poll == null) {
                return;
            } else {
                poll.run();
            }
        }
    }
}
