package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.agora.utils2.internal.CommonUtility;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class Ji implements Ki {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17922a;
    public final String b = CommonUtility.PREFIX_URI + a() + "/clids";
    public final String c = "clid_key";
    public final String d = "clid_value";

    public Ji(Context context) {
        this.f17922a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final L3 invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.f17922a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            Vi.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f17922a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
                    return null;
                } finally {
                    In.a(cursor);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (cursor == null) {
            Vi.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    Vi.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        Vi.a("Clids from satellite: %s", linkedHashMap);
        return new L3(linkedHashMap, X7.d);
    }
}
