package com.baidu.mshield.b.a;

import android.text.TextUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: FileUtil.java */
/* loaded from: classes13.dex */
public class b {
    public static String[] a(String str) {
        String[] strArr = {"", "", "", ""};
        try {
            File file = new File(str);
            if (file.exists()) {
                String[] split = f.a("stat " + file.getAbsolutePath(), false).b.split("\\|");
                for (String str2 : split) {
                    if (str2.contains("Device")) {
                        String[] split2 = str2.split("Inode:");
                        if (split2.length > 1) {
                            String[] split3 = split2[1].split("Links");
                            if (split3.length > 0) {
                                strArr[0] = split3[0].trim();
                            }
                        }
                    }
                    if (str2.contains("Access") && !str2.contains("Uid")) {
                        com.baidu.mshield.b.c.a.b("access " + str2);
                        String[] split4 = str2.split("Access:");
                        if (split4.length > 1) {
                            strArr[1] = split4[1].trim();
                        }
                    }
                    if (str2.contains("Modify")) {
                        com.baidu.mshield.b.c.a.b("Modify " + str2);
                        String[] split5 = str2.split("Modify:");
                        if (split5.length > 1) {
                            strArr[2] = split5[1].trim();
                        }
                    }
                    if (str2.contains("Change")) {
                        com.baidu.mshield.b.c.a.b("Change " + str2);
                        String[] split6 = str2.split("Change:");
                        if (split6.length > 1) {
                            strArr[3] = split6[1].trim();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
        return strArr;
    }

    public static String a(long j, String str) {
        if (j >= 0) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return new SimpleDateFormat(str).format(new Date(j));
                }
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.a(th);
            }
        }
        return "";
    }
}
