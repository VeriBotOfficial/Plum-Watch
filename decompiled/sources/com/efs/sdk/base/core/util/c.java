package com.efs.sdk.base.core.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.UUID;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f9647a = "";

    public static String a(Context context) {
        if (TextUtils.isEmpty(f9647a)) {
            synchronized (c.class) {
                if (TextUtils.isEmpty(f9647a)) {
                    String b = b(context);
                    f9647a = b;
                    if (TextUtils.isEmpty(b)) {
                        f9647a = c(context);
                    }
                }
            }
        }
        return f9647a;
    }

    private static String b(Context context) {
        try {
            File file = new File(a.a(context), "efsid");
            if (file.exists()) {
                return FileUtil.read(file);
            }
            return null;
        } catch (Exception e) {
            Log.e("efs.base", "get uuid error", e);
            return null;
        }
    }

    private static String c(Context context) {
        String str = "";
        for (int i = 0; i < 3; i++) {
            try {
                str = UUID.randomUUID().toString();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(str)) {
            }
        }
        try {
            File a2 = a.a(context);
            File file = new File(a2, "efsid" + Process.myPid());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileUtil.write(file, str);
            if (file.renameTo(new File(a2, "efsid"))) {
                file.delete();
            }
        } catch (Exception e) {
            Log.e("efs.base", "save uuid '" + str + "' error", e);
        }
        return str;
    }
}
