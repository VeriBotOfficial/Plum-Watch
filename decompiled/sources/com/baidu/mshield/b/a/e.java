package com.baidu.mshield.b.a;

import android.os.Build;
import android.os.Process;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ProcessUtils.java */
/* loaded from: classes13.dex */
public class e {
    public static int b() {
        try {
            return Runtime.getRuntime().availableProcessors();
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return 0;
        }
    }

    public static String a() {
        try {
            String[] strArr = Build.SUPPORTED_ABIS;
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            return sb.toString().substring(0, r0.length() - 1);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static boolean c() {
        return Process.is64Bit();
    }
}
