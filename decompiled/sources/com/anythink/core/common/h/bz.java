package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class bz {
    static final String e = "reqId";
    static final String f = "reqDatetime";
    static final String g = "fillOffers";
    static final String h = "bidResps";
    static final String i = "adSourceId";
    static final String j = "price";
    static final String k = "networkFirmId";
    static final String l = "demandType";
    static final String m = "tp_bid_id";
    static final String n = "deal_type";
    static final String o = "deal_id";
    static final String p = "deal_pri";

    /* renamed from: a, reason: collision with root package name */
    String f3898a;
    long b;
    List<a> c = new ArrayList(3);
    List<a> d = new ArrayList(3);

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(e, this.f3898a);
            jSONObject.put(f, this.b);
            jSONObject.put(g, d());
            jSONObject.put(h, e());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public static bz a(String str) {
        bz bzVar = new bz();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bzVar.b(jSONObject.getString(e));
            bzVar.a(jSONObject.getLong(f));
            bzVar.a(bzVar.c(jSONObject.getString(g)));
            bzVar.b(bzVar.c(jSONObject.getString(h)));
            return bzVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return bzVar;
        }
    }

    public final synchronized void b(String str) {
        this.f3898a = str;
    }

    public final synchronized void a(long j2) {
        this.b = j2;
    }

    private synchronized void a(List<a> list) {
        this.c = list;
    }

    private synchronized void b(List<a> list) {
        this.d = list;
    }

    public final synchronized String b() {
        return this.f3898a;
    }

    private synchronized long c() {
        return this.b;
    }

    public final synchronized void a(a aVar) {
        a(this.c, aVar);
    }

    public final synchronized void b(a aVar) {
        a(this.d, aVar);
    }

    private synchronized void a(List<a> list, a aVar) {
        if (aVar != null) {
            if (list.size() == 0) {
                list.add(aVar);
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    i2 = -1;
                    break;
                } else if (com.anythink.core.common.v.l.a(aVar, list.get(i2)) < 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                list.add(i2, aVar);
                return;
            }
            list.add(aVar);
        }
    }

    private synchronized List<a> c(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    a aVar = new a();
                    JSONObject jSONObject = new JSONObject(jSONArray.optString(i2));
                    aVar.b = jSONObject.getString(i);
                    aVar.d = jSONObject.getDouble("price");
                    aVar.c = jSONObject.getInt(k);
                    aVar.f3900a = jSONObject.getInt(l);
                    if (jSONObject.has(m)) {
                        aVar.e = jSONObject.getString(m);
                    }
                    aVar.g = jSONObject.optString(n);
                    aVar.h = jSONObject.optString(o);
                    aVar.i = jSONObject.optInt(p);
                    arrayList.add(aVar);
                }
                Collections.sort(arrayList, new Comparator<a>() { // from class: com.anythink.core.common.h.bz.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(a aVar2, a aVar3) {
                        return com.anythink.core.common.v.l.a(aVar2, aVar3);
                    }

                    private static int a(a aVar2, a aVar3) {
                        return com.anythink.core.common.v.l.a(aVar2, aVar3);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    private synchronized JSONArray d() {
        return c(this.c);
    }

    private synchronized JSONArray e() {
        return c(this.d);
    }

    private synchronized JSONArray c(List<a> list) {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().a());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return jSONArray;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3900a;
        public String b;
        public int c;
        public double d;
        public String e;
        public int f;
        public String g;
        public String h;
        public int i;
        public ad j;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            if (r0 != 8) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(com.anythink.core.common.h.bv r6, com.anythink.core.common.h.ad r7) {
            /*
                r5 = this;
                r5.<init>()
                java.lang.String r0 = r6.z()
                r5.b = r0
                if (r7 == 0) goto L12
                double r0 = r7.getPrice()
                r5.d = r0
                goto L18
            L12:
                double r0 = r6.D()
                r5.d = r0
            L18:
                int r0 = r6.g()
                r5.c = r0
                int r0 = r6.q()
                r1 = 1
                r2 = 2
                if (r0 == 0) goto L41
                if (r0 == r1) goto L3e
                r3 = 3
                if (r0 == r2) goto L3b
                r4 = 4
                if (r0 == r3) goto L38
                if (r0 == r4) goto L3e
                r3 = 7
                if (r0 == r3) goto L3e
                r3 = 8
                if (r0 == r3) goto L41
                goto L43
            L38:
                r5.f3900a = r4
                goto L43
            L3b:
                r5.f3900a = r3
                goto L43
            L3e:
                r5.f3900a = r2
                goto L43
            L41:
                r5.f3900a = r1
            L43:
                r0 = 35
                int r6 = r6.g()
                if (r0 != r6) goto L4d
                r5.f3900a = r2
            L4d:
                java.lang.String r6 = ""
                if (r7 == 0) goto L54
                java.lang.String r0 = r7.g
                goto L55
            L54:
                r0 = r6
            L55:
                r5.e = r0
                r5.j = r7
                if (r7 == 0) goto L60
                java.lang.String r0 = r7.u()
                goto L61
            L60:
                r0 = r6
            L61:
                r5.g = r0
                r0 = 0
                if (r7 == 0) goto L6b
                int r1 = r7.t()
                goto L6c
            L6b:
                r1 = r0
            L6c:
                r5.f = r1
                if (r7 == 0) goto L74
                java.lang.String r6 = r7.v()
            L74:
                r5.h = r6
                if (r7 == 0) goto L7c
                int r0 = r7.w()
            L7c:
                r5.i = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.h.bz.a.<init>(com.anythink.core.common.h.bv, com.anythink.core.common.h.ad):void");
        }

        public final synchronized JSONObject a() {
            JSONObject jSONObject;
            jSONObject = new JSONObject();
            try {
                jSONObject.put(bz.i, this.b);
                jSONObject.put("price", this.d);
                jSONObject.put(bz.k, this.c);
                jSONObject.put(bz.l, this.f3900a);
                jSONObject.put(bz.m, this.e);
                if (!TextUtils.isEmpty(this.g)) {
                    jSONObject.put(bz.n, this.g);
                    jSONObject.put(bz.p, this.i);
                }
                if (!TextUtils.isEmpty(this.h)) {
                    jSONObject.put(bz.o, this.h);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }
    }
}
