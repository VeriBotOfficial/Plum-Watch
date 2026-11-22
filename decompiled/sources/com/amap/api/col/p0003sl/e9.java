package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DynamicHostManager.java */
/* loaded from: classes11.dex */
public class e9 {

    /* renamed from: a, reason: collision with root package name */
    public static e9 f1632a;
    private static final ConcurrentHashMap<Integer, String> b = new ConcurrentHashMap<>();
    private static volatile boolean c = false;

    private e9(Context context) {
        if (c) {
            return;
        }
        synchronized (e9.class) {
            b.clear();
            try {
                a(context);
                c = true;
            } catch (Exception e) {
                ja.a(e, "DynamicHostManager", "Init error)");
            }
        }
        a(context);
    }

    public static e9 b(Context context) {
        if (f1632a == null) {
            f1632a = new e9(context);
        }
        return f1632a;
    }

    public String a(int i) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = b;
        if (concurrentHashMap.isEmpty()) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    private static void a(Context context) {
        String str;
        if (context == null) {
            return;
        }
        try {
            try {
                InputStream open = context.getAssets().open(z8.c() ? "Localizable/servers/oversea/Localizable.url" : "Localizable/servers/Localizable.url");
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                str = new String(bArr, "UTF-8");
            } catch (Exception e) {
                ja.a(e, "DynamicHostManager", "readAssetsFile error)");
                str = null;
            }
            for (String str2 : str.split("\";")) {
                if (str2.length() > 0) {
                    int indexOf = str2.indexOf("\"");
                    int indexOf2 = str2.indexOf("\"=\"");
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        String substring = str2.substring(indexOf + 1, indexOf2);
                        String substring2 = str2.substring(indexOf2 + 3);
                        if (!TextUtils.isEmpty(substring) && !TextUtils.isEmpty(substring2)) {
                            b.put(Integer.valueOf(Integer.parseInt(substring)), substring2);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            ja.a(e2, "DynamicHostManager", "preloadConfigData error)");
        }
    }
}
