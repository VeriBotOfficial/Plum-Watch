package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3115b5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final C3090a5 f18195a = new C3090a5();
    public final Z4 b = new Z4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        this.f18195a.runScript(sQLiteDatabase);
        this.b.runScript(sQLiteDatabase);
    }
}
