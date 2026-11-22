package com.bytedance.sdk.component.bh.fxn.kg.kg;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.fxn.fxn.bh;
import com.bytedance.sdk.component.bh.fxn.fxn.fxn.sg;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class fxn {
    private static ContentResolver gff() {
        try {
            if (tw.sg().bh() != null) {
                return tw.sg().bh().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void fxn() {
        if (tw.sg().bh() == null) {
            return;
        }
        try {
            ContentResolver gff = gff();
            if (gff != null) {
                gff.getType(Uri.parse(hm() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void kg() {
        if (tw.sg().bh() == null) {
            return;
        }
        try {
            ContentResolver gff = gff();
            if (gff != null) {
                gff.getType(Uri.parse(hm() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void fxn(com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar) {
        if (fxnVar == null) {
            return;
        }
        try {
            ContentResolver gff = gff();
            if (gff != null) {
                gff.getType(Uri.parse(hm() + "adLogDispatch?event=" + bh.fxn(fxnVar.bh())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void fxn(String str, List<String> list, boolean z) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(bh.fxn(it.next())).append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(bh.fxn(sb.toString())) + "&replace=" + String.valueOf(z);
            ContentResolver gff = gff();
            if (gff != null) {
                gff.getType(Uri.parse(hm() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void fxn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver gff = gff();
            if (gff != null) {
                gff.getType(Uri.parse(hm() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }

    private static String hm() {
        return sg.kg + "/ad_log_event/";
    }
}
