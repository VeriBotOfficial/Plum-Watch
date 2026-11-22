package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.agora.utils2.internal.CommonUtility;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ye implements Ki {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18154a;
    public final String b = CommonUtility.PREFIX_URI + a() + "/preload_info";
    public final String c = "tracking_id";
    public final String d = "additional_parameters";

    public Ye(Context context) {
        this.f18154a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3225ff invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f18154a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            Vi.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f18154a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
            try {
                if (cursor == null) {
                    Vi.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    Vi.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                Vi.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C3225ff c3225ff = new C3225ff(string, jSONObject2, !TextUtils.isEmpty(string), false, X7.d);
                                In.a(cursor);
                                return c3225ff;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            Vi.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        Vi.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        C3225ff c3225ff2 = new C3225ff(string, jSONObject22, !TextUtils.isEmpty(string), false, X7.d);
                        In.a(cursor);
                        return c3225ff2;
                    }
                    Vi.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        In.a(cursor);
        return null;
    }
}
