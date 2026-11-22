package com.bytedance.sdk.openadsdk.multipro.gff;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.bh.fxn.bh;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.multipro.hm;
import io.livekit.android.room.util.MediaConstraintKeys;

/* loaded from: classes14.dex */
public class fxn implements com.bytedance.sdk.openadsdk.multipro.fxn {
    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Cursor fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Uri fxn(Uri uri, ContentValues contentValues) {
        return null;
    }

    private static bh hm() {
        try {
            if (rmu.fxn() != null) {
                return com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean fxn(String str) {
        if (rmu.fxn() == null) {
            return false;
        }
        try {
            bh hm = hm();
            if (hm != null) {
                return MediaConstraintKeys.TRUE.equals(hm.fxn(Uri.parse(rb() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean kg() {
        if (rmu.fxn() == null) {
            return false;
        }
        try {
            bh hm = hm();
            if (hm != null) {
                return MediaConstraintKeys.TRUE.equals(hm.fxn(Uri.parse(rb() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String gff() {
        if (rmu.fxn() == null) {
            return null;
        }
        try {
            bh hm = hm();
            if (hm != null) {
                return hm.fxn(Uri.parse(rb() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String rb() {
        return hm.kg + "/t_frequent/";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn(Uri uri) {
        new StringBuilder("get type uri: ").append(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.tw.fxn.fxn().fxn(uri.getQueryParameter("rit")) ? MediaConstraintKeys.TRUE : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.tw.fxn.fxn().kg() ? MediaConstraintKeys.TRUE : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.tw.fxn.fxn().gff();
        }
        return null;
    }
}
