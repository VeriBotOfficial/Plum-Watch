package com.anythink.expressad.out;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class l implements com.anythink.expressad.g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5019a = 6;
    public static final int b = 7;
    public static final int c = 8;
    private static String d = "CustomInfoManager";
    private static volatile l e;
    private ConcurrentHashMap<String, String> f = new ConcurrentHashMap<>();

    private l() {
    }

    public static l a() {
        if (e == null) {
            synchronized (l.class) {
                if (e == null) {
                    e = new l();
                }
            }
        }
        return e;
    }

    private void a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String a2 = com.anythink.core.express.a.a.a(str2);
        if (i == 6) {
            this.f.put(str + "_bid", a2);
        } else if (i == 7) {
            this.f.put(str + "_bidload", a2);
        } else {
            if (i != 8) {
                return;
            }
            this.f.put(str, a2);
        }
    }

    private String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i == 6) {
            return this.f.get(str + "_bid");
        }
        if (i != 7) {
            return i != 8 ? "" : this.f.get(str);
        }
        return this.f.get(str + "_bidload");
    }

    public final String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str2);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return a(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return a(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains(com.anythink.expressad.foundation.g.a.k)) {
                    return a(str, 8);
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
