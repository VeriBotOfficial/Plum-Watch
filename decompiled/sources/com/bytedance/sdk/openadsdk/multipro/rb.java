package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class rb implements fxn {
    private static volatile rb fxn;
    private static final List<fxn> gff;
    private static WeakReference<Context> kg;

    private boolean gff(Uri uri) {
        return true;
    }

    static {
        List<fxn> synchronizedList = Collections.synchronizedList(new ArrayList());
        gff = synchronizedList;
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.hm.gff());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.fxn.kg());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.gff.fxn());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.hm.fxn.rb(new com.bytedance.sdk.component.bh.fxn.kg.kg.kg()));
        Iterator<fxn> it = synchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static rb fxn(Context context) {
        if (context != null) {
            kg = new WeakReference<>(context.getApplicationContext());
        }
        if (fxn == null) {
            synchronized (rb.class) {
                if (fxn == null) {
                    fxn = new rb();
                }
            }
        }
        return fxn;
    }

    private rb() {
    }

    private fxn kg(Uri uri) {
        if (uri == null || !gff(uri)) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (fxn fxnVar : gff) {
            if (str.equals(fxnVar.fxn())) {
                return fxnVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Cursor fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            fxn kg2 = kg(uri);
            if (kg2 != null) {
                return kg2.fxn(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn(Uri uri) {
        try {
            fxn kg2 = kg(uri);
            if (kg2 != null) {
                return kg2.fxn(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Uri fxn(Uri uri, ContentValues contentValues) {
        try {
            fxn kg2 = kg(uri);
            if (kg2 != null) {
                return kg2.fxn(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, String str, String[] strArr) {
        try {
            fxn kg2 = kg(uri);
            if (kg2 != null) {
                return kg2.fxn(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            fxn kg2 = kg(uri);
            if (kg2 != null) {
                return kg2.fxn(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
