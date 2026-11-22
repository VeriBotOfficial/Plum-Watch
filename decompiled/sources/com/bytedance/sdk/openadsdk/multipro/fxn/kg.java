package com.bytedance.sdk.openadsdk.multipro.fxn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.rb;
import com.bytedance.sdk.openadsdk.core.rmu;

/* loaded from: classes14.dex */
public class kg implements com.bytedance.sdk.openadsdk.multipro.fxn {
    private static final Object kg = new Object();
    private Context fxn;

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn() {
        return "t_db";
    }

    private boolean kg(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    private Context kg() {
        Context context = this.fxn;
        return context == null ? rmu.fxn() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Cursor fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (kg) {
            if (kg(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str3 = split[2];
                String str4 = split[3];
                if (!"ttopensdk.db".equals(str3)) {
                    return null;
                }
                return rb.fxn(kg()).fxn().fxn(str4, strArr, str, strArr2, null, null, str2);
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn(Uri uri) {
        synchronized (kg) {
            if (kg(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 5) {
                String str = split[2];
                String str2 = split[4];
                if ("ttopensdk.db".equals(str)) {
                    if ("execSQL".equals(str2)) {
                        String queryParameter = uri.getQueryParameter("sql");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            rb.fxn(kg()).fxn().fxn(Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        rb.fxn(kg()).fxn().kg();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        rb.fxn(kg()).fxn().gff();
                    } else if ("transactionEnd".equals(str2)) {
                        rb.fxn(kg()).fxn().hm();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Uri fxn(Uri uri, ContentValues contentValues) {
        synchronized (kg) {
            if (kg(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str = split[2];
                String str2 = split[3];
                if ("ttopensdk.db".equals(str)) {
                    rb.fxn(kg()).fxn().fxn(str2, (String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, String str, String[] strArr) {
        synchronized (kg) {
            if (kg(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return rb.fxn(kg()).fxn().fxn(str3, str, strArr);
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (kg) {
            if (kg(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return rb.fxn(kg()).fxn().fxn(str3, contentValues, str, strArr);
            }
            return 0;
        }
    }
}
