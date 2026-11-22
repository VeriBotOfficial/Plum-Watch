package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Fa implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ga f17847a;

    public Fa(Ga ga) {
        this.f17847a = ga;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f17847a.f17869a.getContentResolver();
        Ga ga = this.f17847a;
        ga.b = contentResolver.query(parse, null, null, new String[]{ga.f17869a.getPackageName()}, null);
        Cursor cursor = this.f17847a.b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f17847a.b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C3151cg(string, this.f17847a.b.getLong(1), this.f17847a.b.getLong(2), EnumC3126bg.d);
    }
}
