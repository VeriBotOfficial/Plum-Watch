package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.h.au;
import com.anythink.core.common.h.bv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f3642a = "c";
    private static volatile c f;
    ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();
    ConcurrentHashMap<String, Long> c = new ConcurrentHashMap<>();
    Map<String, a> d = new ConcurrentHashMap(5);
    Map<String, au> e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f3644a;
        String b;
        long c;
    }

    public static c a() {
        if (f == null) {
            synchronized (c.class) {
                if (f == null) {
                    f = new c();
                }
            }
        }
        return f;
    }

    private c() {
    }

    public final boolean a(bv bvVar) {
        if (bvVar.M() == 0) {
            return false;
        }
        return (this.b.get(bvVar.z()) != null ? this.b.get(bvVar.z()).longValue() : 0L) + bvVar.M() >= System.currentTimeMillis();
    }

    public final void a(String str, long j) {
        this.b.put(str, Long.valueOf(j));
    }

    public final boolean b(bv bvVar) {
        if (bvVar.q() == 7) {
            return false;
        }
        if (bvVar.N() == 0) {
            return false;
        }
        return (this.c.get(bvVar.z()) != null ? this.c.get(bvVar.z()).longValue() : 0L) + bvVar.N() >= System.currentTimeMillis();
    }

    private void b(String str, long j) {
        this.c.put(str, Long.valueOf(j));
    }

    public final long a(String str) {
        Long l = this.c.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void b(String str) {
        JSONObject optJSONObject;
        this.e = new ConcurrentHashMap(3);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                        this.e.put(next, new au(optJSONObject));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(String str, long j, AdError adError) {
        if (TextUtils.equals(adError.getCode(), ErrorCode.noADError)) {
            a aVar = this.d.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f3644a = adError.getPlatformCode();
            aVar.b = adError.getPlatformMSG();
            aVar.c = j;
            this.d.put(str, aVar);
        }
    }

    public final boolean a(int i, com.anythink.core.d.l lVar, bv bvVar) {
        int i2;
        if (this.e == null) {
            return false;
        }
        List<Integer> z = lVar.z();
        if (z.isEmpty()) {
            return false;
        }
        a aVar = this.d.get(bvVar.z());
        if (aVar == null) {
            return false;
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i2 = 3;
                break;
            case 2:
            default:
                i2 = 1;
                break;
            case 8:
                i2 = 2;
                break;
        }
        if (!z.contains(Integer.valueOf(i2))) {
            return false;
        }
        au auVar = this.e.get(String.valueOf(bvVar.g()));
        if (auVar == null) {
            return false;
        }
        List<au.a> a2 = auVar.a();
        if (a2.isEmpty()) {
            return false;
        }
        return a(a2, aVar);
    }

    private static boolean a(List<au.a> list, a aVar) {
        if (aVar != null && list != null) {
            try {
                String str = aVar.f3644a;
                String str2 = aVar.b;
                long j = aVar.c;
                new StringBuilder("ruleObjList:").append(list);
                for (int i = 0; i < list.size(); i++) {
                    au.a aVar2 = list.get(i);
                    if (aVar2 != null) {
                        String a2 = aVar2.a();
                        if (TextUtils.isEmpty(a2)) {
                            continue;
                        } else {
                            long b = aVar2.b();
                            Map<String, Long> c = aVar2.c();
                            if (a2.equals("-88888")) {
                                if (!TextUtils.isEmpty(aVar.b) && c != null && !c.isEmpty()) {
                                    for (Map.Entry<String, Long> entry : c.entrySet()) {
                                        String key = entry.getKey();
                                        Long value = entry.getValue();
                                        if (value.longValue() > 0 && !TextUtils.isEmpty(key) && aVar.b.contains(key) && aVar.c + value.longValue() > System.currentTimeMillis()) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(aVar.f3644a)) {
                                continue;
                            } else if (TextUtils.isEmpty(aVar.b)) {
                                if (a2.equals(aVar.f3644a) && ((c == null || c.isEmpty()) && b > 0 && aVar.c + b > System.currentTimeMillis())) {
                                    return true;
                                }
                            } else if (c != null && !c.isEmpty()) {
                                for (Map.Entry<String, Long> entry2 : c.entrySet()) {
                                    String key2 = entry2.getKey();
                                    Long value2 = entry2.getValue();
                                    if (value2.longValue() > 0 && !TextUtils.isEmpty(key2) && aVar.b.contains(key2) && aVar.c + value2.longValue() > System.currentTimeMillis()) {
                                        return true;
                                    }
                                }
                            } else if (b > 0 && aVar.c + b > System.currentTimeMillis()) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
