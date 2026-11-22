package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class wh0 {
    static Map<String, String> a(tm.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = aVar.d;
        if (j > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
        }
        return hashMap;
    }

    public static tm.a a(xc1 xc1Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = xc1Var.c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a2 = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long a3 = str3 != null ? a(str3) : j;
        String str4 = map.get("Last-Modified");
        long a4 = str4 != null ? a(str4) : j;
        String str5 = map.get("ETag");
        if (i != 0) {
            j5 = (j2 * 1000) + currentTimeMillis;
            j4 = z ? j5 : (j3 * 1000) + j5;
        } else {
            j4 = (a2 <= j || a3 < a2) ? j : (a3 - a2) + currentTimeMillis;
            j5 = j4;
        }
        tm.a aVar = new tm.a();
        aVar.f16982a = xc1Var.b;
        aVar.b = str5;
        aVar.f = j5;
        aVar.e = j4;
        aVar.c = a2;
        aVar.d = a4;
        aVar.g = map;
        aVar.h = xc1Var.d;
        return aVar;
    }

    public static String a(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] split = str.split(";", 0);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                boolean z = ti2.f16972a;
                sp0.c(str);
                return 0L;
            }
            boolean z2 = ti2.f16972a;
            sp0.e(str);
            return 0L;
        }
    }
}
