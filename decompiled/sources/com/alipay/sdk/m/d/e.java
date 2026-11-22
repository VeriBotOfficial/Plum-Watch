package com.alipay.sdk.m.d;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes11.dex */
public class e implements com.alipay.sdk.m.c.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1372a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse(f1372a), null, null, null, null);
        if (query != null) {
            r0 = query.moveToNext() ? query.getString(query.getColumnIndex("device_ids_grndid")) : null;
            query.close();
        }
        return r0;
    }
}
