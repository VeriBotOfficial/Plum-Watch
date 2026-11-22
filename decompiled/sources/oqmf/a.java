package oqmf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.qumeng.overseas.advlib.__remote__.core.ICliFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public class a extends SQLiteOpenHelper {
    private static final int c = 7;
    private static final String d = "cpc_android";
    private static final String e = "cpc_android_child";
    private static a f;

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f18749a;
    private SQLiteDatabase b;

    private a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f18749a = new AtomicInteger();
    }

    public static a a(Context context) {
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new a(context.getApplicationContext());
                }
            }
        }
        return f;
    }

    public synchronized SQLiteDatabase b() {
        if (this.f18749a.incrementAndGet() == 1) {
            this.b = getWritableDatabase();
        }
        return this.b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(b.m);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_DBHelper_onCreate", e2.getMessage(), e2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 3) {
            try {
                sQLiteDatabase.execSQL(b.k);
            } catch (Throwable th) {
                th.printStackTrace();
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_onUpgrade", th);
                return;
            }
        }
        if (i < 2) {
            sQLiteDatabase.execSQL(b.g);
            sQLiteDatabase.execSQL(b.i);
        }
    }

    private a(Context context, String str, int i) {
        this(context, str, null, i);
    }

    private a(Context context, String str) {
        this(context, str, 7);
    }

    private a(Context context) {
        this(context, ICliFactory.isMainProcess ? d : e);
    }

    public synchronized void a() {
        SQLiteDatabase sQLiteDatabase;
        if (this.f18749a.decrementAndGet() == 0 && (sQLiteDatabase = this.b) != null) {
            sQLiteDatabase.close();
        }
    }
}
