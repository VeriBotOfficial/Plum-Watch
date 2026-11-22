package com.bykv.vk.openvk.fxn.fxn.fxn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.kg.fxn.dgx;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class gff {
    private static int bh = 1;
    public static boolean fxn = false;
    private static String gff = null;
    private static boolean hm = false;
    private static Context kg;
    private static dgx rb;

    public static Context fxn() {
        return kg;
    }

    public static String kg() {
        if (TextUtils.isEmpty(gff)) {
            try {
                File file = new File(fxn().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                gff = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return gff;
    }

    public static void fxn(Context context, String str) {
        kg = context;
        gff = str;
    }

    public static boolean gff() {
        return hm;
    }

    public static void fxn(boolean z) {
        hm = z;
    }

    public static dgx hm() {
        if (rb == null) {
            rb = new dgx.fxn("v_config").fxn(10000L, TimeUnit.MILLISECONDS).kg(10000L, TimeUnit.MILLISECONDS).gff(10000L, TimeUnit.MILLISECONDS).fxn();
        }
        return rb;
    }

    public static void fxn(dgx dgxVar) {
        rb = dgxVar;
    }

    public static boolean rb() {
        return fxn;
    }

    public static void fxn(int i) {
        bh = i;
    }

    public static int bh() {
        return bh;
    }
}
