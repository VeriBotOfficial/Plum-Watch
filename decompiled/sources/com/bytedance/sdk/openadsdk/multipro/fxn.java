package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes14.dex */
public interface fxn {
    int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int fxn(Uri uri, String str, String[] strArr);

    Cursor fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri fxn(Uri uri, ContentValues contentValues);

    String fxn();

    String fxn(Uri uri);
}
