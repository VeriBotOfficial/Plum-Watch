package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes4.dex */
class ar implements aj {

    /* renamed from: a, reason: collision with root package name */
    private static String f14438a = "content://com.vivo.vms.IdProvider/IdentifierId/";
    private static String b = f14438a + "OAID";
    private static String c = f14438a + "VAID_";
    private static String d = f14438a + "AAID_";
    private static String e = f14438a + com.alipay.sdk.m.u0.b.h;
    private static String f = com.alipay.sdk.m.u0.c.c;

    /* renamed from: a, reason: collision with other field name */
    private Context f211a;

    public ar(Context context) {
        this.f211a = context;
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public boolean mo11870a() {
        return "1".equals(q.a(f, "0"));
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public String mo11869a() {
        return a(b);
    }

    private String a(String str) {
        Cursor cursor;
        Cursor cursor2 = null;
        r1 = null;
        String string = null;
        try {
            cursor = this.f211a.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        string = cursor.getString(cursor.getColumnIndex("value"));
                    }
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return string;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(Context context) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f14438a).getAuthority(), 128);
            if (resolveContentProvider != null) {
                return (resolveContentProvider.applicationInfo.flags & 1) != 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
