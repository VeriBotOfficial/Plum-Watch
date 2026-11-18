package com.baidu.ar;

import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class i4 {
    public static boolean a(String str) {
        return new File(str).delete();
    }

    public static void b(String str) {
        File parentFile = new File(str).getParentFile();
        if (parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }
}
