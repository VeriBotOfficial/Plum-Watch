package com.anythink.expressad.c;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f4739a;

    private a() {
    }

    private static a a() {
        if (f4739a == null) {
            synchronized (a.class) {
                if (f4739a == null) {
                    f4739a = new a();
                }
            }
        }
        return f4739a;
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IOException("zipFilePath or destDirectory is null");
        }
        new c();
        c.a(str, str2);
    }

    private void a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            for (File file2 : file.listFiles()) {
                a(new File(file2.getAbsolutePath()));
            }
            file.delete();
        }
    }
}
