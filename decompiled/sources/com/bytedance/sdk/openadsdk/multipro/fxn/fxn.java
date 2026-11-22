package com.bytedance.sdk.openadsdk.multipro.fxn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.bh;
import com.bytedance.sdk.openadsdk.core.rb;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.multipro.hm;
import com.bytedance.sdk.openadsdk.utils.qhf;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class fxn {
    public static bh fxn;
    private static final ConcurrentHashMap<String, Object> kg = new ConcurrentHashMap<>();

    public static bh fxn(Context context) {
        if (context == null) {
            try {
                rmu.fxn();
            } catch (Throwable unused) {
                qhf.tw("binder error");
            }
        }
        if (fxn == null) {
            if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                fxn = com.bytedance.sdk.openadsdk.multipro.aidl.fxn.bh.fxn(com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn().fxn(5));
            } else {
                fxn = com.bytedance.sdk.openadsdk.multipro.aidl.fxn.bh.kg();
            }
        }
        return fxn;
    }

    private static String fxn() {
        return hm.kg + "/t_db/ttopensdk.db/";
    }

    public static void fxn(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (fxn(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                rb.fxn(context).fxn().fxn(str, (String) null, contentValues);
                return;
            }
            bh fxn2 = fxn(context);
            if (fxn2 != null) {
                fxn2.fxn(Uri.parse(fxn() + str), contentValues);
            }
        }
    }

    public static int fxn(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (fxn(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                return rb.fxn(context).fxn().fxn(str, str2, strArr);
            }
            bh fxn2 = fxn(context);
            if (fxn2 != null) {
                return fxn2.fxn(Uri.parse(fxn() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int fxn(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (fxn(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                    return rb.fxn(context).fxn().fxn(str, contentValues, str2, strArr);
                }
                bh fxn2 = fxn(context);
                if (fxn2 != null) {
                    return fxn2.fxn(Uri.parse(fxn() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> fxn(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (fxn(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                return fxn(rb.fxn(context).fxn().fxn(str, strArr, str2, strArr2, str3, str4, str5));
            }
            bh fxn2 = fxn(context);
            if (fxn2 != null) {
                return fxn2.fxn(Uri.parse(fxn() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> fxn(Cursor cursor) {
        HashMap hashMap = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new LinkedList());
                        }
                        ((List) hashMap.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                if (cursor != null) {
                    cursor.close();
                    return hashMap;
                }
            } catch (Throwable unused) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return hashMap;
    }

    private static Object fxn(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = kg;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (fxn.class) {
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new Object();
                concurrentHashMap.put(str, obj);
            }
        }
        return obj;
    }
}
