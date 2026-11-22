package com.baidu.mshield.x0.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* compiled from: AppDetectBase.java */
/* loaded from: classes13.dex */
public class b {
    public static int a(Context context, String str, List<String> list) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
        if (c(context, str)) {
            return 0;
        }
        if (list != null && list.size() != 0) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                String str2 = list.get(i);
                if (!TextUtils.isEmpty(str2)) {
                    File file = new File(str2);
                    if (file.exists()) {
                        PackageInfo b = b(context, str);
                        if (b != null && b.firstInstallTime >= file.lastModified()) {
                            return 0;
                        }
                        z = true;
                    } else {
                        continue;
                    }
                }
            }
            return !z ? 2 : 1;
        }
        return 1;
    }

    public static PackageInfo b(Context context, String str) {
        try {
            return com.baidu.mshield.b.e.c.a(context, str, 0);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        try {
            return new File(new StringBuilder().append(context.getExternalFilesDir(null).getParentFile().getParent()).append(File.separator).append(str).toString()).exists();
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return false;
        }
    }

    public static String[] a(Context context, String str) {
        String[] strArr = {"", "", ""};
        try {
            String parent = context.getExternalFilesDir(null).getParentFile().getParent();
            StringBuilder append = new StringBuilder().append(parent);
            String str2 = File.separator;
            File file = new File(append.append(str2).append(str).toString());
            if (file.exists()) {
                strArr[0] = file.getAbsolutePath();
            }
            File file2 = new File(parent + str2 + str + str2 + "files");
            if (file2.exists()) {
                strArr[1] = file2.getAbsolutePath();
            }
            File file3 = new File(parent + str2 + str + str2 + com.anythink.expressad.foundation.g.g.a.b.O);
            if (file3.exists()) {
                strArr[2] = file3.getAbsolutePath();
                return strArr;
            }
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
        return strArr;
    }
}
