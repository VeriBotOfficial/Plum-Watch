package com.bytedance.sdk.component.bh.fxn.fxn.fxn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes13.dex */
public class gff {
    public static void fxn(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            fxn.fxn(context).fxn().fxn(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void fxn(Context context, String str, List<com.bytedance.sdk.component.bh.fxn.hm.fxn> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            fxn.fxn(context).fxn().fxn(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int fxn(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return fxn.fxn(context).fxn().fxn(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int fxn(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return fxn.fxn(context).fxn().fxn(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor fxn(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fxn.fxn(context).fxn().fxn(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void fxn(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            fxn.fxn(context).fxn().fxn(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
