package com.anythink.expressad.foundation.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes12.dex */
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f4771a;

    private static void f() {
    }

    @Override // com.anythink.expressad.foundation.c.b
    protected final int d() {
        return 72;
    }

    @Override // com.anythink.expressad.foundation.c.b
    protected final void e() {
    }

    private c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (f4771a == null) {
            synchronized (c.class) {
                if (f4771a == null) {
                    f4771a = new c(context.getApplicationContext());
                }
            }
        }
        return f4771a;
    }

    @Override // com.anythink.expressad.foundation.c.b
    protected final String c() {
        return "anythink_expressad.db";
    }

    @Override // com.anythink.expressad.foundation.c.b
    protected final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'fq_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_replace_temp'");
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.c.b
    protected final void b(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }
}
