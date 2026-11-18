package com.amap.api.col.p0003sl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: URIRestrictManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class rb {
    private static rb d = null;
    static final /* synthetic */ boolean e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, List<String>>> f1859a = new HashMap();
    private final Map<String, List<String>> b = new HashMap();
    private final List<String> c = new ArrayList();

    public static synchronized rb a() {
        if (d == null) {
            d = new rb();
        }
        return d;
    }

    /* JADX INFO: compiled from: URIRestrictManager.java */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        int r5;
        String str2;
        a aVar;
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
                String[] strArrSplit = str.split("/");
                if (strArrSplit[0].contains(".")) {
                    str2 = strArrSplit[0];
                    r5 = 1;
                } else {
                    r5 = 0;
                    str2 = null;
                }
                StringBuilder sb = new StringBuilder();
                while (r5 < strArrSplit.length) {
                    if (sb.length() > 0) {
                        sb.append("/");
                    }
                    sb.append(strArrSplit[r5]);
                    r5++;
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
                    String[] strArrSplit2 = str8.split("/");
                    String[] strArrSplit3 = str9.split("/");
                    if (strArrSplit3.length >= strArrSplit2.length) {
                        int r6 = 0;
                        while (true) {
                            if (r6 >= strArrSplit2.length) {
                                return true;
                            }
                            if (!strArrSplit2[r6].equals("*") && !strArrSplit2[r6].equals(strArrSplit3[r6])) {
                                break;
                            }
                            r6++;
                        }
                    }
                }
            }
            return false;
        }
    }
}
