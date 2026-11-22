package com.amap.api.col.p0003sl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: URIRestrictManager.java */
/* loaded from: classes11.dex */
public class rb {
    private static rb d = null;
    static final /* synthetic */ boolean e = true;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, List<String>>> f1859a = new HashMap();
    private final Map<String, List<String>> b = new HashMap();
    private final List<String> c = new ArrayList();

    public static synchronized rb a() {
        rb rbVar;
        synchronized (rb.class) {
            if (d == null) {
                d = new rb();
            }
            rbVar = d;
        }
        return rbVar;
    }

    /* compiled from: URIRestrictManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f1860a;
        public String b;
        public String c;

        public a(URL url) {
            this.f1860a = url.getProtocol();
            this.b = url.getHost();
            this.c = url.getPath();
        }

        public a(String str, String str2) {
            this.f1860a = null;
            this.b = str;
            this.c = str2;
        }
    }

    public boolean a(String str) {
        int i;
        String str2;
        a aVar;
        int i2;
        if (str == null || str.length() == 0) {
            return false;
        }
        a aVar2 = null;
        try {
            aVar = new a(new URL(str));
        } catch (MalformedURLException unused) {
            if (str.contains("://")) {
                aVar = null;
            } else {
                while (str.startsWith("/")) {
                    str = str.substring(1);
                }
                String[] split = str.split("/");
                if (split[0].contains(".")) {
                    str2 = split[0];
                    i = 1;
                } else {
                    i = 0;
                    str2 = null;
                }
                StringBuilder sb = new StringBuilder();
                while (i < split.length) {
                    if (sb.length() > 0) {
                        sb.append("/");
                    }
                    sb.append(split[i]);
                    i++;
                }
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '/') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                aVar = new a(str2, sb.toString());
            }
        }
        if (aVar != null) {
            String str3 = aVar.c;
            if (str3 != null && str3.length() != 0) {
                while (true) {
                    String str4 = aVar.c;
                    if (str4.charAt(str4.length() - 1) != '/') {
                        break;
                    }
                    String str5 = aVar.c;
                    aVar.c = str5.substring(0, str5.length() - 1);
                }
                while (aVar.c.charAt(0) == '/') {
                    aVar.c = aVar.c.substring(1);
                }
            }
            aVar2 = aVar;
        }
        if (aVar2 == null) {
            return false;
        }
        synchronized (this) {
            if (aVar2.c.length() != 0) {
                Map<String, List<String>> map = this.b;
                String str6 = aVar2.f1860a;
                if (str6 != null && this.f1859a.containsKey(str6)) {
                    map = this.f1859a.get(aVar2.f1860a);
                }
                List<String> list = this.c;
                boolean z = e;
                if (!z && map == null) {
                    throw new AssertionError();
                }
                String str7 = aVar2.b;
                if (str7 != null && map.containsKey(str7)) {
                    list = map.get(aVar2.b);
                }
                if (!z && list == null) {
                    throw new AssertionError();
                }
                for (String str8 : list) {
                    String str9 = aVar2.c;
                    String[] split2 = str8.split("/");
                    String[] split3 = str9.split("/");
                    if (split3.length >= split2.length) {
                        for (0; i2 < split2.length; i2 + 1) {
                            i2 = (split2[i2].equals("*") || split2[i2].equals(split3[i2])) ? i2 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
