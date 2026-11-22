package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.channel.commonutils.logger.b;
import io.nats.client.support.ApiConstants;

/* loaded from: classes4.dex */
public class a extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static int f14690a = 1;

    /* renamed from: a, reason: collision with other field name */
    public static final Object f934a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f935a = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", ApiConstants.BYTES, " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f14690a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f934a) {
            try {
                a(sQLiteDatabase);
            } catch (SQLException e) {
                b.a(e);
            }
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        int i = 0;
        while (true) {
            String[] strArr = f935a;
            if (i < strArr.length - 1) {
                if (i != 0) {
                    sb.append(",");
                }
                sb.append(strArr[i]).append(" ").append(strArr[i + 1]);
                i += 2;
            } else {
                sb.append(");");
                sQLiteDatabase.execSQL(sb.toString());
                return;
            }
        }
    }
}
