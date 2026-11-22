package com.bytedance.sdk.component.bh.fxn.kg.kg;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.bh;
import com.bytedance.sdk.component.bh.fxn.fxn.fxn.sg;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class kg {
    public static bh fxn;

    public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int fxn(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri fxn(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static bh fxn(Context context) {
        try {
            if (fxn == null) {
                fxn = tw.sg().xdg().dgx();
            }
        } catch (Exception unused) {
        }
        return fxn;
    }

    public static void fxn() {
        if (tw.sg().bh() == null) {
            return;
        }
        try {
            bh fxn2 = fxn(tw.sg().bh());
            if (fxn2 != null) {
                fxn2.fxn(Uri.parse(hm() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void kg() {
        if (tw.sg().bh() == null) {
            return;
        }
        try {
            bh fxn2 = fxn(tw.sg().bh());
            if (fxn2 != null) {
                fxn2.fxn(Uri.parse(hm() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void fxn(com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar) {
        if (fxnVar == null) {
            return;
        }
        try {
            bh fxn2 = fxn(tw.sg().bh());
            if (fxn2 != null) {
                fxn2.fxn(Uri.parse(hm() + "adLogDispatch?event=" + com.bytedance.sdk.component.bh.fxn.fxn.fxn.bh.fxn(fxnVar.bh())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void fxn(String str, List<String> list, boolean z, int i, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.bh.fxn.fxn.fxn.bh.fxn(it.next())).append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.bh.fxn.fxn.fxn.bh.fxn(sb.toString())) + "&replace=" + String.valueOf(z) + "&urlType=" + String.valueOf(i) + "&adId=" + str2;
            bh fxn2 = fxn(tw.sg().bh());
            if (fxn2 != null) {
                fxn2.fxn(Uri.parse(hm() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void fxn(String str, boolean z) {
        if (tw.sg().xdg().bh() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            bh fxn2 = fxn(tw.sg().bh());
            if (fxn2 != null) {
                fxn2.fxn(Uri.parse(hm() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z));
            }
        } catch (Throwable unused) {
        }
    }

    private static String hm() {
        return sg.kg + "/ad_log_event/";
    }

    public String gff() {
        return "ad_log_event";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0037, code lost:
    
        if (r0.equals("adLogStop") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String fxn(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bh.fxn.kg.kg.kg.fxn(android.net.Uri):java.lang.String");
    }
}
