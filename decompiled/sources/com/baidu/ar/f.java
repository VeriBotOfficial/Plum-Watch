package com.baidu.ar;

import android.content.Context;
import java.io.File;
import org.xmind.core.IWorkspace;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static String f6914a;

    public static String a() {
        return f6914a;
    }

    public static String a(Context context, String str) {
        String a2 = j4.a(context);
        if (a2 == null) {
            return null;
        }
        StringBuilder append = new StringBuilder().append(a2);
        String str2 = File.separator;
        return append.append(str2).append("sticker").append(str2).append("bar_").append(str).toString();
    }

    public static String a(String str) {
        return str + "/ar/dumix_res.json";
    }

    public static String b(Context context, String str) {
        String a2 = a(context, str);
        if (a2 != null) {
            return a2 + File.separator + com.anythink.expressad.video.dynview.a.a.X;
        }
        return null;
    }

    public static void b(String str) {
        if (f6914a == null) {
            f6914a = str;
        }
    }

    public static String c(Context context, String str) {
        String a2 = a(context, str);
        if (a2 != null) {
            return a2 + File.separator + IWorkspace.DIR_TEMP;
        }
        return null;
    }
}
