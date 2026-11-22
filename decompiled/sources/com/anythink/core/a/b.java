package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.a;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.f;
import com.anythink.core.common.k;
import com.phancy.mini.core.resource.MiniPack;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class b {
    public static int n = -1;
    private static volatile b o;
    private static SimpleDateFormat p;
    ConcurrentHashMap<String, f> b;
    ConcurrentHashMap<String, f> c;
    ConcurrentHashMap<String, f> d;
    ConcurrentHashMap<String, f> e;
    ConcurrentHashMap<String, f> f;
    ConcurrentHashMap<String, f> g;
    ConcurrentHashMap<String, Long> h;
    ConcurrentHashMap<String, Long> i;
    ConcurrentHashMap<String, Long> j;
    ConcurrentHashMap<String, Long> k;
    ConcurrentHashMap<String, Long> l;
    ConcurrentHashMap<String, Long> m;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.core.common.e.a f3486q;
    private e s;
    private a t;
    private a u;
    private a v;
    private a w;

    /* renamed from: a, reason: collision with root package name */
    final String f3485a = "b";
    private final Object r = new Object();

    public static b a(Context context) {
        if (o == null) {
            synchronized (b.class) {
                if (o == null) {
                    o = new b(context);
                }
            }
        }
        return o;
    }

    private com.anythink.core.common.e.a a() {
        return this.f3486q;
    }

    private b(Context context) {
        this.f3486q = com.anythink.core.common.e.a.a(com.anythink.core.common.e.e.a(context));
        p = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT);
        try {
            com.anythink.core.common.v.b.b.a().b(new AnonymousClass1(a(new Date()), b(new Date())), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.b = new ConcurrentHashMap<>(3);
        this.c = new ConcurrentHashMap<>(3);
        this.d = new ConcurrentHashMap<>(3);
        this.e = new ConcurrentHashMap<>(3);
        this.f = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>(3);
        this.h = new ConcurrentHashMap<>(3);
        this.j = new ConcurrentHashMap<>(3);
        this.i = new ConcurrentHashMap<>(3);
        this.k = new ConcurrentHashMap<>(3);
        this.m = new ConcurrentHashMap<>(3);
        this.l = new ConcurrentHashMap<>(3);
    }

    public static String a(Date date) {
        if (p == null) {
            p = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT);
        }
        return p.format(date).substring(5, 7);
    }

    public static String b(Date date) {
        if (p == null) {
            p = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT);
        }
        return p.format(date).substring(8, 10);
    }

    public static String c(Date date) {
        if (p == null) {
            p = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT);
        }
        return p.format(date).substring(11, 13);
    }

    /* renamed from: com.anythink.core.a.b$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3487a;
        final /* synthetic */ String b;

        AnonymousClass1(String str, String str2) {
            this.f3487a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f3486q != null) {
                b.this.f3486q.e(this.f3487a, this.b);
            }
        }
    }

    private void a(String str, String str2) {
        try {
            com.anythink.core.common.v.b.b.a().b(new AnonymousClass1(str, str2), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        try {
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject(k.A);
                if (optJSONObject != null) {
                    this.t = b(optJSONObject);
                } else if (this.t != null) {
                    this.t = null;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject(k.B);
                if (optJSONObject2 != null) {
                    this.u = b(optJSONObject2);
                } else if (this.u != null) {
                    this.u = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("caps_s");
                if (optJSONObject3 != null) {
                    this.v = b(optJSONObject3);
                } else if (this.v != null) {
                    this.v = null;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("req_pace");
                if (optJSONObject4 != null) {
                    this.w = b(optJSONObject4);
                    return;
                } else {
                    if (this.w != null) {
                        this.w = null;
                    }
                    return;
                }
            }
            if (this.t != null) {
                this.t = null;
            }
            if (this.u != null) {
                this.u = null;
            }
            if (this.v != null) {
                this.v = null;
            }
            if (this.w != null) {
                this.w = null;
            }
        } catch (Throwable unused) {
        }
    }

    private ConcurrentHashMap<String, f> b() {
        return this.c;
    }

    public final int a(String str) {
        Pair<Integer, Integer> pair;
        try {
            a aVar = this.w;
            if (aVar != null) {
                if (aVar.a() > 0 && this.w.b() > 0) {
                    String p2 = t.b().p();
                    if (!TextUtils.isEmpty(p2)) {
                        f fVar = this.b.get(p2);
                        if (fVar == null && (fVar = this.f3486q.d(p2, "app")) != null) {
                            this.b.put(p2, fVar);
                        }
                        if (fVar != null && fVar.f3912a >= this.w.a() && System.currentTimeMillis() - fVar.i() <= this.w.b()) {
                            int i = fVar.f3912a;
                            this.w.a();
                            return 9;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> c = this.w.c();
                if (c != null && !c.isEmpty() && (pair = c.get(str)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    f fVar2 = this.d.get(str);
                    if (fVar2 == null && (fVar2 = this.f3486q.d(str, "format")) != null) {
                        this.d.put(str, fVar2);
                    }
                    if (fVar2 != null && fVar2.f3912a >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - fVar2.i() <= ((Integer) pair.second).intValue()) {
                        new StringBuilder("placement req filter by format:").append(fVar2.f3912a).append(":").append(pair.first);
                        return 10;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    public final int a(int i, long j, String str) {
        if (i > 0 && j > 0) {
            try {
                f fVar = this.c.get(str);
                if (fVar == null && (fVar = this.f3486q.d(str, "placement_id")) != null) {
                    this.c.put(str, fVar);
                }
                if (fVar != null && fVar.f3912a >= i && System.currentTimeMillis() - fVar.i() <= j) {
                    int i2 = fVar.f3912a;
                    return 8;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return n;
    }

    public final void a(int i, long j, String str, int i2) {
        String str2;
        Pair<Integer, Integer> pair;
        String str3;
        try {
            a aVar = this.w;
            if (aVar != null) {
                if (aVar.a() > 0 && this.w.b() > 0) {
                    String p2 = t.b().p();
                    if (!TextUtils.isEmpty(p2)) {
                        f fVar = this.b.get(p2);
                        if (fVar != null) {
                            if (System.currentTimeMillis() - fVar.i() > this.w.b()) {
                                fVar.a(System.currentTimeMillis());
                                fVar.f3912a = 1;
                            } else {
                                fVar.f3912a++;
                            }
                            str3 = p2;
                        } else {
                            str3 = p2;
                            f fVar2 = new f("1", str3, "app", System.currentTimeMillis(), 1);
                            this.b.put(str3, fVar2);
                            fVar = fVar2;
                        }
                        new StringBuilder("placement req save to global:").append(fVar);
                        this.f3486q.b(str3, "app", fVar.f3912a, fVar.i());
                    }
                }
                Map<String, Pair<Integer, Integer>> c = this.w.c();
                if (c != null && !c.isEmpty() && (pair = c.get(String.valueOf(i2))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    f fVar3 = this.d.get(String.valueOf(i2));
                    if (fVar3 == null) {
                        f fVar4 = new f("1", String.valueOf(i2), "format", System.currentTimeMillis(), 1);
                        this.d.put(String.valueOf(i2), fVar4);
                        fVar3 = fVar4;
                    } else if (System.currentTimeMillis() - fVar3.i() > ((Integer) pair.second).intValue()) {
                        fVar3.a(System.currentTimeMillis());
                        fVar3.f3912a = 1;
                    } else {
                        fVar3.f3912a++;
                    }
                    new StringBuilder("placement req save to format:").append(fVar3);
                    this.f3486q.b(String.valueOf(i2), "format", fVar3.f3912a, fVar3.i());
                }
            }
            if (i <= 0 || j <= 0) {
                return;
            }
            f fVar5 = this.c.get(str);
            if (fVar5 != null) {
                if (System.currentTimeMillis() - fVar5.i() > j) {
                    fVar5.a(System.currentTimeMillis());
                    fVar5.f3912a = 1;
                } else {
                    fVar5.f3912a++;
                }
                str2 = str;
            } else {
                str2 = str;
                f fVar6 = new f("1", str2, "placement_id", System.currentTimeMillis(), 1);
                this.c.put(str2, fVar6);
                fVar5 = fVar6;
            }
            new StringBuilder("placement req save to placementId:").append(fVar5);
            this.f3486q.b(str2, "placement_id", fVar5.f3912a, fVar5.i());
        } catch (Throwable unused) {
        }
    }

    private ConcurrentHashMap<String, f> c() {
        return this.f;
    }

    public final int a(int i, long j, int i2, String str, String str2) {
        Pair<Integer, Integer> pair;
        Pair<Integer, Integer> pair2;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            a aVar = this.w;
            if (aVar != null) {
                Map<String, Pair<Integer, Integer>> d = aVar.d();
                if (d != null && !d.isEmpty() && (pair2 = d.get(String.valueOf(i2))) != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                    f fVar = this.e.get(String.valueOf(i2));
                    if (fVar == null && (fVar = this.f3486q.d(String.valueOf(i2), "network_id")) != null) {
                        this.e.put(String.valueOf(i2), fVar);
                    }
                    if (fVar != null && fVar.f3912a >= ((Integer) pair2.first).intValue() && System.currentTimeMillis() - fVar.i() <= ((Integer) pair2.second).intValue()) {
                        new StringBuilder("adSource req filter by network:").append(fVar.f3912a).append(":").append(pair2.first);
                        return 25;
                    }
                }
                Map<String, Pair<Integer, Integer>> e2 = this.w.e();
                if (e2 != null && !e2.isEmpty() && (pair = e2.get(i2 + "_" + str2)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    f fVar2 = this.g.get(i2 + "_" + str2);
                    if (fVar2 == null && (fVar2 = this.f3486q.d(i2 + "_" + str2, a.C0193a.f)) != null) {
                        this.g.put(i2 + "_" + str2, fVar2);
                    }
                    if (fVar2 != null && fVar2.f3912a >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - fVar2.i() <= ((Integer) pair.second).intValue()) {
                        new StringBuilder("adSource req filter by network_format:").append(fVar2.f3912a).append(":").append(pair.first);
                        return 26;
                    }
                }
            }
            if (i > 0 && j > 0) {
                f fVar3 = this.f.get(str);
                if (fVar3 == null && (fVar3 = this.f3486q.d(str, a.C0193a.h)) != null) {
                    this.f.put(str, fVar3);
                }
                if (fVar3 != null && fVar3.f3912a >= i && System.currentTimeMillis() - fVar3.i() <= j) {
                    int i3 = fVar3.f3912a;
                    return 18;
                }
            }
            return n;
        }
        return n;
    }

    public final void b(int i, long j, int i2, String str, String str2) {
        Pair<Integer, Integer> pair;
        Pair<Integer, Integer> pair2;
        String str3 = str;
        try {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(String.valueOf(i2))) {
                a aVar = this.w;
                if (aVar != null) {
                    Map<String, Pair<Integer, Integer>> d = aVar.d();
                    if (d != null && !d.isEmpty() && (pair2 = d.get(String.valueOf(i2))) != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                        f fVar = this.e.get(String.valueOf(i2));
                        if (fVar == null) {
                            fVar = new f("1", String.valueOf(i2), "network_id", System.currentTimeMillis(), 1);
                            this.e.put(String.valueOf(i2), fVar);
                        } else if (System.currentTimeMillis() - fVar.i() > ((Integer) pair2.second).intValue()) {
                            fVar.a(System.currentTimeMillis());
                            fVar.f3912a = 1;
                        } else {
                            fVar.f3912a++;
                        }
                        new StringBuilder("adSource req save to network:").append(fVar);
                        this.f3486q.b(String.valueOf(i2), "network_id", fVar.f3912a, fVar.i());
                    }
                    Map<String, Pair<Integer, Integer>> e = this.w.e();
                    if (e != null && !e.isEmpty() && (pair = e.get(i2 + "_" + str2)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                        f fVar2 = this.g.get(i2 + "_" + str2);
                        if (fVar2 == null) {
                            fVar2 = new f("1", i2 + "_" + str2, a.C0193a.f, System.currentTimeMillis(), 1);
                            this.g.put(i2 + "_" + str2, fVar2);
                        } else if (System.currentTimeMillis() - fVar2.i() > ((Integer) pair.second).intValue()) {
                            fVar2.a(System.currentTimeMillis());
                            fVar2.f3912a = 1;
                        } else {
                            fVar2.f3912a++;
                        }
                        new StringBuilder("adSource req save to network_format:").append(fVar2);
                        this.f3486q.b(i2 + "_" + str2, a.C0193a.f, fVar2.f3912a, fVar2.i());
                    }
                }
                if (i <= 0 || j <= 0) {
                    return;
                }
                f fVar3 = this.f.get(str3);
                if (fVar3 == null) {
                    f fVar4 = new f("1", str, a.C0193a.h, System.currentTimeMillis(), 1);
                    str3 = str;
                    this.f.put(str3, fVar4);
                    fVar3 = fVar4;
                } else if (System.currentTimeMillis() - fVar3.i() > j) {
                    fVar3.a(System.currentTimeMillis());
                    fVar3.f3912a = 1;
                } else {
                    fVar3.f3912a++;
                }
                this.f3486q.b(str3, a.C0193a.h, fVar3.f3912a, fVar3.i());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private ConcurrentHashMap<String, Long> d() {
        return this.j;
    }

    private ConcurrentHashMap<String, Long> e() {
        return this.m;
    }

    public final int a(String str, String str2, long j, long j2) {
        long j3;
        int i;
        String str3;
        List<f> b;
        Map<String, Pair<Integer, Integer>> c;
        Pair<Integer, Integer> pair;
        Long l;
        List<f> b2;
        List<f> b3;
        List<f> a2;
        Pair<Integer, Integer> pair2;
        List<f> a3;
        List<f> a4;
        try {
            Date date = new Date();
            int parseInt = Integer.parseInt(b(date));
            int parseInt2 = Integer.parseInt(c(date));
            a aVar = this.t;
            if (aVar != null) {
                if (aVar.a() > 0) {
                    String p2 = t.b().p();
                    if (!TextUtils.isEmpty(p2)) {
                        Long l2 = this.h.get("day_".concat(String.valueOf(parseInt)));
                        if (l2 == null && (a4 = this.f3486q.a(p2, "app")) != null && !a4.isEmpty()) {
                            l2 = Long.valueOf(a4.size());
                            this.h.put("day_".concat(String.valueOf(parseInt)), l2);
                        }
                        if (l2 != null && l2.longValue() >= this.t.a()) {
                            new StringBuilder("placement imp filter day by global:").append(l2);
                            this.t.a();
                            return 7;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> c2 = this.t.c();
                if (c2 != null && !c2.isEmpty() && (pair2 = c2.get(str2)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long l3 = this.i.get("day_" + parseInt + "_" + str2);
                    if (l3 == null && (a3 = this.f3486q.a(str2, "format")) != null && !a3.isEmpty()) {
                        l3 = Long.valueOf(a3.size());
                        this.i.put("day_" + parseInt + "_" + str2, l3);
                    }
                    if (l3 != null && l3.longValue() >= ((Integer) pair2.first).intValue()) {
                        new StringBuilder("placement imp filter day by format:").append(l3).append(":").append(pair2.first);
                        return 8;
                    }
                }
            }
            if (j > 0) {
                Long l4 = this.j.get("day_" + parseInt + "_" + str);
                if (l4 != null || (a2 = this.f3486q.a(str, "placement_id")) == null || a2.isEmpty()) {
                    j3 = 0;
                } else {
                    int size = a2.size();
                    j3 = 0;
                    l4 = Long.valueOf(size);
                    this.j.put("day_" + parseInt + "_" + str, l4);
                }
                if (l4 != null && l4.longValue() >= j) {
                    new StringBuilder("placement imp filter day by placementId:").append(l4);
                    return 2;
                }
            } else {
                j3 = 0;
            }
            a aVar2 = this.u;
            if (aVar2 == null) {
                i = 2;
                str3 = "placement_id";
            } else {
                if (aVar2.a() > 0) {
                    String p3 = t.b().p();
                    if (!TextUtils.isEmpty(p3)) {
                        Long l5 = this.h.get("hour_".concat(String.valueOf(parseInt2)));
                        if (l5 == null && (b3 = this.f3486q.b(p3, "app")) != null && !b3.isEmpty()) {
                            l5 = Long.valueOf(b3.size());
                            this.h.put("hour_".concat(String.valueOf(parseInt2)), l5);
                        }
                        if (l5 != null) {
                            i = 2;
                            str3 = "placement_id";
                            if (l5.longValue() >= this.u.a()) {
                                new StringBuilder("placement imp filter hour by global:").append(l5);
                                this.u.a();
                                return 9;
                            }
                            c = this.u.c();
                            if (c != null && !c.isEmpty() && (pair = c.get(str2)) != null && ((Integer) pair.first).intValue() > 0) {
                                l = this.i.get("hour_" + parseInt2 + "_" + str2);
                                if (l == null && (b2 = this.f3486q.b(str2, "format")) != null && !b2.isEmpty()) {
                                    l = Long.valueOf(b2.size());
                                    this.i.put("hour_" + parseInt2 + "_" + str2, l);
                                }
                                if (l != null && l.longValue() >= ((Integer) pair.first).intValue()) {
                                    new StringBuilder("placement imp filter hour by format:").append(l).append(":").append(pair.first);
                                    return 10;
                                }
                            }
                        }
                    }
                }
                i = 2;
                str3 = "placement_id";
                c = this.u.c();
                if (c != null) {
                    l = this.i.get("hour_" + parseInt2 + "_" + str2);
                    if (l == null) {
                        l = Long.valueOf(b2.size());
                        this.i.put("hour_" + parseInt2 + "_" + str2, l);
                    }
                    if (l != null) {
                        new StringBuilder("placement imp filter hour by format:").append(l).append(":").append(pair.first);
                        return 10;
                    }
                }
            }
            if (j2 > j3) {
                Long l6 = this.j.get("hour_" + parseInt2 + "_" + str);
                if (l6 == null && (b = this.f3486q.b(str, str3)) != null && !b.isEmpty()) {
                    l6 = Long.valueOf(b.size());
                    this.j.put("hour_" + parseInt2 + "_" + str, l6);
                }
                if (l6 != null && l6.longValue() >= j2) {
                    new StringBuilder("placement imp filter hour by placementId:").append(l6);
                    return i;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return n;
    }

    public final int a(String str, String str2, long j) {
        f c;
        Pair<Integer, Integer> pair;
        f c2;
        f c3;
        try {
            a aVar = this.v;
            if (aVar != null) {
                if (aVar.b() > 0) {
                    String p2 = t.b().p();
                    if (!TextUtils.isEmpty(p2)) {
                        Long l = this.h.get(a.C0193a.m);
                        if (l == null && (c3 = this.f3486q.c(p2, "app")) != null) {
                            l = Long.valueOf(c3.i());
                            this.h.put(a.C0193a.m, l);
                        }
                        if (l != null && System.currentTimeMillis() - l.longValue() < this.v.b()) {
                            this.v.b();
                            return 11;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> c4 = this.v.c();
                if (c4 != null && !c4.isEmpty() && (pair = c4.get(str2)) != null && ((Integer) pair.second).intValue() > 0) {
                    Long l2 = this.i.get("time_stamp_".concat(String.valueOf(str2)));
                    if (l2 == null && (c2 = this.f3486q.c(str2, "format")) != null) {
                        l2 = Long.valueOf(c2.i());
                        this.i.put("time_stamp_".concat(String.valueOf(str2)), l2);
                    }
                    if (l2 != null) {
                        long currentTimeMillis = System.currentTimeMillis() - l2.longValue();
                        if (currentTimeMillis < ((Integer) pair.second).intValue()) {
                            new StringBuilder("placement imp filter second by format:").append(currentTimeMillis).append(":").append(pair.second);
                            return 12;
                        }
                    }
                }
            }
            if (j > 0) {
                Long l3 = this.j.get("time_stamp_".concat(String.valueOf(str)));
                if (l3 == null && (c = this.f3486q.c(str, "placement_id")) != null) {
                    l3 = Long.valueOf(c.i());
                    this.j.put("time_stamp_".concat(String.valueOf(str)), l3);
                }
                if (l3 != null && System.currentTimeMillis() - l3.longValue() < j) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return n;
    }

    public final int a(String str, String str2, String str3, long j, long j2) {
        long j3;
        int i;
        String str4;
        List<f> b;
        Map<String, Pair<Integer, Integer>> e;
        Pair<Integer, Integer> pair;
        Long l;
        List<f> b2;
        Pair<Integer, Integer> pair2;
        List<f> b3;
        List<f> a2;
        Pair<Integer, Integer> pair3;
        List<f> a3;
        Pair<Integer, Integer> pair4;
        List<f> a4;
        try {
            Date date = new Date();
            int parseInt = Integer.parseInt(b(date));
            int parseInt2 = Integer.parseInt(c(date));
            a aVar = this.t;
            if (aVar != null) {
                Map<String, Pair<Integer, Integer>> d = aVar.d();
                if (d != null && !d.isEmpty() && (pair4 = d.get(str)) != null && ((Integer) pair4.first).intValue() > 0) {
                    Long l2 = this.k.get("day_" + parseInt + "_" + str);
                    if (l2 == null && (a4 = this.f3486q.a(str, "network_id")) != null && !a4.isEmpty()) {
                        l2 = Long.valueOf(a4.size());
                        this.k.put("day_" + parseInt + "_" + str, l2);
                    }
                    if (l2 != null && l2.longValue() >= ((Integer) pair4.first).intValue()) {
                        new StringBuilder("adSource imp filter day by network:").append(l2).append(":").append(pair4.first);
                        return 8;
                    }
                }
                Map<String, Pair<Integer, Integer>> e2 = this.t.e();
                if (e2 != null && !e2.isEmpty() && (pair3 = e2.get(str + "_" + str3)) != null && ((Integer) pair3.first).intValue() > 0) {
                    Long l3 = this.l.get("day_" + parseInt + "_" + str + "_" + str3);
                    if (l3 == null && (a3 = this.f3486q.a(str + "_" + str3, a.C0193a.f)) != null && !a3.isEmpty()) {
                        l3 = Long.valueOf(a3.size());
                        this.l.put("day_" + parseInt + "_" + str + "_" + str3, l3);
                    }
                    if (l3 != null && l3.longValue() >= ((Integer) pair3.first).intValue()) {
                        new StringBuilder("adSource imp filter day by network_format:").append(l3).append(":").append(pair3.first);
                        return 9;
                    }
                }
            }
            if (j > 0) {
                j3 = 0;
                Long l4 = this.m.get("day_" + parseInt + "_" + str2);
                if (l4 == null && (a2 = this.f3486q.a(str2, a.C0193a.h)) != null && !a2.isEmpty()) {
                    l4 = Long.valueOf(a2.size());
                    this.m.put("day_" + parseInt + "_" + str2, l4);
                }
                if (l4 != null && l4.longValue() >= j) {
                    new StringBuilder("adSource imp filter day by adSourceId:").append(l4);
                    return 2;
                }
            } else {
                j3 = 0;
            }
            a aVar2 = this.u;
            if (aVar2 == null) {
                i = 2;
                str4 = a.C0193a.h;
            } else {
                Map<String, Pair<Integer, Integer>> d2 = aVar2.d();
                if (d2 != null && !d2.isEmpty() && (pair2 = d2.get(str)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long l5 = this.k.get("hour_" + parseInt2 + "_" + str);
                    if (l5 == null && (b3 = this.f3486q.b(str, "network_id")) != null && !b3.isEmpty()) {
                        l5 = Long.valueOf(b3.size());
                        this.k.put("hour_" + parseInt2 + "_" + str, l5);
                    }
                    if (l5 != null) {
                        long longValue = l5.longValue();
                        int intValue = ((Integer) pair2.first).intValue();
                        i = 2;
                        str4 = a.C0193a.h;
                        if (longValue >= intValue) {
                            new StringBuilder("adSource imp filter hour by network:").append(l5).append(":").append(pair2.first);
                            return 10;
                        }
                        e = this.u.e();
                        if (e != null && !e.isEmpty() && (pair = e.get(str + "_" + str3)) != null && ((Integer) pair.first).intValue() > 0) {
                            l = this.l.get("hour_" + parseInt2 + "_" + str + "_" + str3);
                            if (l == null && (b2 = this.f3486q.b(str + "_" + str3, a.C0193a.f)) != null && !b2.isEmpty()) {
                                l = Long.valueOf(b2.size());
                                this.l.put("hour_" + parseInt2 + "_" + str + "_" + str3, l);
                            }
                            if (l != null && l.longValue() >= ((Integer) pair.first).intValue()) {
                                new StringBuilder("adSource imp filter hour by network_format:").append(l).append(":").append(pair.first);
                                return 11;
                            }
                        }
                    }
                }
                i = 2;
                str4 = a.C0193a.h;
                e = this.u.e();
                if (e != null) {
                    l = this.l.get("hour_" + parseInt2 + "_" + str + "_" + str3);
                    if (l == null) {
                        l = Long.valueOf(b2.size());
                        this.l.put("hour_" + parseInt2 + "_" + str + "_" + str3, l);
                    }
                    if (l != null) {
                        new StringBuilder("adSource imp filter hour by network_format:").append(l).append(":").append(pair.first);
                        return 11;
                    }
                }
            }
            if (j2 > j3) {
                Long l6 = this.m.get("hour_" + parseInt2 + "_" + str2);
                if (l6 == null && (b = this.f3486q.b(str2, str4)) != null && !b.isEmpty()) {
                    l6 = Long.valueOf(b.size());
                    this.m.put("hour_" + parseInt2 + "_" + str2, l6);
                }
                if (l6 != null && l6.longValue() >= j2) {
                    new StringBuilder("adSource imp filter hour by adSourceId:").append(l6);
                    return i;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return n;
    }

    public final int a(String str, String str2, String str3, long j) {
        f c;
        Pair<Integer, Integer> pair;
        f c2;
        Pair<Integer, Integer> pair2;
        f c3;
        try {
            a aVar = this.v;
            if (aVar != null) {
                Map<String, Pair<Integer, Integer>> d = aVar.d();
                if (d != null && !d.isEmpty() && (pair2 = d.get(str)) != null && ((Integer) pair2.second).intValue() > 0) {
                    Long l = this.k.get("time_stamp_".concat(String.valueOf(str)));
                    if (l == null && (c3 = this.f3486q.c(str, "network_id")) != null) {
                        l = Long.valueOf(c3.i());
                        this.k.put("time_stamp_".concat(String.valueOf(str)), l);
                    }
                    if (l != null && System.currentTimeMillis() - l.longValue() < ((Integer) pair2.second).intValue()) {
                        new StringBuilder("adSource imp filter second by network:").append(l).append(":").append(pair2.second);
                        return 12;
                    }
                }
                Map<String, Pair<Integer, Integer>> e = this.v.e();
                if (e != null && !e.isEmpty() && (pair = e.get(str + "_" + str3)) != null && ((Integer) pair.second).intValue() > 0) {
                    Long l2 = this.l.get("time_stamp_" + str + "_" + str3);
                    if (l2 == null && (c2 = this.f3486q.c(str + "_" + str3, a.C0193a.f)) != null) {
                        l2 = Long.valueOf(c2.i());
                        this.l.put("time_stamp_" + str + "_" + str3, l2);
                    }
                    if (l2 != null) {
                        long currentTimeMillis = System.currentTimeMillis() - l2.longValue();
                        if (currentTimeMillis < ((Integer) pair.second).intValue()) {
                            new StringBuilder("adSource imp filter second by network_format:").append(currentTimeMillis).append(":").append(pair.second);
                            return 13;
                        }
                    }
                }
            }
            if (j > 0) {
                Long l3 = this.m.get("time_stamp_".concat(String.valueOf(str2)));
                if (l3 == null && (c = this.f3486q.c(str2, a.C0193a.h)) != null) {
                    l3 = Long.valueOf(c.i());
                    this.j.put("time_stamp_".concat(String.valueOf(str2)), l3);
                }
                if (l3 != null && System.currentTimeMillis() - l3.longValue() < j) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return n;
    }

    public final void a(int i, String str, String str2, String str3) {
        try {
            String p2 = t.b().p();
            Date date = new Date();
            long currentTimeMillis = System.currentTimeMillis();
            int parseInt = Integer.parseInt(a(date));
            int parseInt2 = Integer.parseInt(b(date));
            int parseInt3 = Integer.parseInt(c(date));
            this.f3486q.a(new f("2", p2, String.valueOf(i), str, i + "_" + str, str2, str3, parseInt, parseInt2, parseInt3, currentTimeMillis));
            a(1, this.t, this.h, "day_".concat(String.valueOf(parseInt2)), currentTimeMillis);
            a(1, this.t, this.i, "day_" + parseInt2 + "_" + str, currentTimeMillis);
            a(1, this.t, this.k, "day_" + parseInt2 + "_" + i, currentTimeMillis);
            a(1, this.t, this.l, "day_" + parseInt2 + "_" + i + "_" + str, currentTimeMillis);
            a(1, this.j, "day_" + parseInt2 + "_" + str2, currentTimeMillis);
            a(1, this.m, "day_" + parseInt2 + "_" + str3, currentTimeMillis);
            a(1, this.u, this.h, "hour_".concat(String.valueOf(parseInt3)), currentTimeMillis);
            a(1, this.u, this.i, "hour_" + parseInt3 + "_" + str, currentTimeMillis);
            a(1, this.u, this.k, "hour_" + parseInt3 + "_" + i, currentTimeMillis);
            a(1, this.u, this.l, "hour_" + parseInt3 + "_" + i + "_" + str, currentTimeMillis);
            a(1, this.j, "hour_" + parseInt3 + "_" + str2, currentTimeMillis);
            a(1, this.m, "hour_" + parseInt3 + "_" + str3, currentTimeMillis);
            a(2, this.v, this.h, a.C0193a.m, currentTimeMillis);
            a(2, this.v, this.i, "time_stamp_".concat(String.valueOf(str)), currentTimeMillis);
            a(2, this.v, this.k, "time_stamp_".concat(String.valueOf(i)), currentTimeMillis);
            a(2, this.v, this.l, "time_stamp_" + i + "_" + str, currentTimeMillis);
            a(2, this.j, "time_stamp_".concat(String.valueOf(str2)), currentTimeMillis);
            a(2, this.m, "time_stamp_".concat(String.valueOf(str3)), currentTimeMillis);
        } catch (Throwable unused) {
        }
    }

    private static void a(int i, a aVar, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j) {
        long valueOf;
        new StringBuilder("memory saveGlobalOrFormatOrNetwork:").append(i).append(":").append(str).append(":").append(j).append(":").append(aVar);
        if (concurrentHashMap != null) {
            if (i == 2) {
                concurrentHashMap.put(str, Long.valueOf(j));
                return;
            }
            Long l = concurrentHashMap.get(str);
            if (l == null) {
                valueOf = 1L;
            } else {
                valueOf = Long.valueOf(l.longValue() + 1);
            }
            concurrentHashMap.put(str, valueOf);
        }
    }

    private static void a(int i, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j) {
        long valueOf;
        new StringBuilder("memory savePlacementOrAdSource:").append(i).append(":").append(str).append(":").append(j).append(":").append(concurrentHashMap);
        if (concurrentHashMap != null) {
            if (i == 2) {
                concurrentHashMap.put(str, Long.valueOf(j));
                return;
            }
            Long l = concurrentHashMap.get(str);
            if (l == null) {
                valueOf = 1L;
            } else {
                valueOf = Long.valueOf(l.longValue() + 1);
            }
            concurrentHashMap.put(str, valueOf);
        }
    }

    private e f() {
        if (this.s == null) {
            synchronized (this.r) {
                this.s = new e(this.f3486q);
            }
        }
        return this.s;
    }

    public final void a(bv bvVar) {
        if (bvVar.bv() == null || this.f3486q == null) {
            return;
        }
        f().d(bvVar);
    }

    public final com.anythink.core.common.h.k b(bv bvVar) {
        if (bvVar.bv() == null || this.f3486q == null) {
            return null;
        }
        return f().b(bvVar);
    }

    public final void c(bv bvVar) {
        if (bvVar.bv() == null || this.f3486q == null) {
            return;
        }
        f().c(bvVar);
    }

    public final void d(bv bvVar) {
        if (bvVar.bv() == null || this.f3486q == null) {
            return;
        }
        f().a(bvVar);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f3488a;
        private int b;
        private Map<String, Pair<Integer, Integer>> c;
        private Map<String, Pair<Integer, Integer>> d;
        private Map<String, Pair<Integer, Integer>> e;

        public final void a(int i) {
            this.f3488a = i;
        }

        public final void b(int i) {
            this.b = i;
        }

        public final void a(Map<String, Pair<Integer, Integer>> map) {
            this.c = map;
        }

        public final void b(Map<String, Pair<Integer, Integer>> map) {
            this.d = map;
        }

        public final void c(Map<String, Pair<Integer, Integer>> map) {
            this.e = map;
        }

        public final int a() {
            return this.f3488a;
        }

        public final int b() {
            return this.b;
        }

        public final Map<String, Pair<Integer, Integer>> c() {
            return this.c;
        }

        public final Map<String, Pair<Integer, Integer>> d() {
            return this.d;
        }

        public final Map<String, Pair<Integer, Integer>> e() {
            return this.e;
        }
    }

    private static a b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        if (jSONObject == null) {
            return null;
        }
        try {
            a aVar = new a();
            JSONObject optJSONObject5 = jSONObject.optJSONObject("format");
            if (optJSONObject5 != null) {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = optJSONObject5.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && (optJSONObject4 = optJSONObject5.optJSONObject(next)) != null) {
                        int optInt = optJSONObject4.optInt("max_num");
                        int optInt2 = optJSONObject4.optInt("per_second");
                        if (optInt != 0 || optInt2 != 0) {
                            hashMap.put(next, new Pair<>(Integer.valueOf(optInt), Integer.valueOf(optInt2)));
                        }
                    }
                }
                if (!hashMap.isEmpty()) {
                    aVar.a(hashMap);
                }
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("nw");
            if (optJSONObject6 != null) {
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject6.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!TextUtils.isEmpty(next2) && (optJSONObject3 = optJSONObject6.optJSONObject(next2)) != null) {
                        int optInt3 = optJSONObject3.optInt("max_num");
                        int optInt4 = optJSONObject3.optInt("per_second");
                        if (optInt3 != 0 || optInt4 != 0) {
                            hashMap2.put(next2, new Pair<>(Integer.valueOf(optInt3), Integer.valueOf(optInt4)));
                        }
                    }
                }
                if (!hashMap2.isEmpty()) {
                    aVar.b(hashMap2);
                }
            }
            JSONObject optJSONObject7 = jSONObject.optJSONObject("nw_format");
            if (optJSONObject7 != null) {
                HashMap hashMap3 = new HashMap();
                Iterator<String> keys3 = optJSONObject7.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    if (!TextUtils.isEmpty(next3) && (optJSONObject2 = optJSONObject7.optJSONObject(next3)) != null) {
                        int optInt5 = optJSONObject2.optInt("max_num");
                        int optInt6 = optJSONObject2.optInt("per_second");
                        if (optInt5 != 0 || optInt6 != 0) {
                            hashMap3.put(next3, new Pair<>(Integer.valueOf(optInt5), Integer.valueOf(optInt6)));
                        }
                    }
                }
                if (!hashMap3.isEmpty()) {
                    aVar.c(hashMap3);
                }
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("global");
            if (optJSONObject8 != null && (optJSONObject = optJSONObject8.optJSONObject("global")) != null) {
                int optInt7 = optJSONObject.optInt("max_num");
                if (optInt7 != 0) {
                    aVar.a(optInt7);
                }
                int optInt8 = optJSONObject.optInt("per_second");
                if (optInt8 != 0) {
                    aVar.b(optInt8);
                }
            }
            return aVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
