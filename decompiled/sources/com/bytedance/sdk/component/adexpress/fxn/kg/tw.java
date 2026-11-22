package com.bytedance.sdk.component.adexpress.fxn.kg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class tw {
    private static com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxn;

    public static void fxn() {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(rb.tw(), "temp_pkg_info.json");
                Long valueOf = Long.valueOf(file.length());
                if (valueOf.longValue() > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[valueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxn2 = com.bytedance.sdk.component.adexpress.fxn.gff.fxn.fxn(new JSONObject(new String(bArr, "utf-8")));
                        if (fxn2 != null) {
                            fxn = fxn2;
                            fxn.gff();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.fxn.gff.fxn kg() {
        com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar;
        synchronized (tw.class) {
            fxnVar = fxn;
        }
        return fxnVar;
    }

    public static synchronized void fxn(com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar) {
        synchronized (tw.class) {
            if (fxnVar != null) {
                if (fxnVar.tw()) {
                    fxn = fxnVar;
                }
            }
        }
    }

    public static void gff() {
        rb.fxn(rb.tw(), kg(), "temp_pkg_info.json");
    }

    public static boolean fxn(String str) {
        return rb.fxn(kg(), str);
    }

    public static boolean kg(com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar) {
        return rb.gff(kg(), fxnVar);
    }

    public static void hm() {
        rb.kg(rb.tw(), kg(), "temp_pkg_info.json");
        fxn = null;
    }
}
