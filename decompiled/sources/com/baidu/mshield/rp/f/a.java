package com.baidu.mshield.rp.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.mshield.utility.b;
import com.baidu.mshield.utility.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Service.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f8431a;
    public HandlerC0388a b = new HandlerC0388a(e.a());
    public com.baidu.mshield.sharedpreferences.a c;
    public Context d;
    public com.baidu.mshield.rp.e.a.a e;

    /* compiled from: Service.java */
    /* renamed from: com.baidu.mshield.rp.f.a$a, reason: collision with other inner class name */
    public class HandlerC0388a extends Handler {
        public HandlerC0388a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 0:
                        a.this.f();
                        break;
                    case 1:
                        com.baidu.mshield.rp.c.a.a(a.this.d).a((com.baidu.mshield.rp.d.a) message.obj);
                        com.baidu.mshield.b.c.a.b("sj-trigger report f ACTION_REPORT_RECORD");
                        Message message2 = new Message();
                        message2.what = 10;
                        sendMessage(message2);
                        break;
                    case 2:
                        com.baidu.mshield.b.c.a.b("sj-trigger reportACTION_REPORT_DATA");
                        a.this.a();
                        a.this.f();
                        a.this.b(0, com.baidu.mshield.utility.a.d(a.this.d));
                        break;
                    case 3:
                        com.baidu.mshield.rp.b.a aVar = (com.baidu.mshield.rp.b.a) message.obj;
                        if (aVar != null) {
                            a.this.b(aVar);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        String valueOf = String.valueOf(message.obj);
                        if (!TextUtils.isEmpty(valueOf)) {
                            com.baidu.mshield.rp.c.a.a(a.this.d).a(com.baidu.mshield.b.f.e.a(valueOf));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        a.this.a();
                        a.this.d();
                        Message message3 = new Message();
                        message3.what = 10;
                        sendMessage(message3);
                        break;
                    case 6:
                        a aVar2 = a.this;
                        aVar2.b(1, com.baidu.mshield.utility.a.d(aVar2.d));
                        break;
                    case 7:
                        a.this.f();
                        a aVar3 = a.this;
                        aVar3.b(1, com.baidu.mshield.utility.a.d(aVar3.d));
                        break;
                    case 8:
                        a aVar4 = a.this;
                        aVar4.b(3, com.baidu.mshield.utility.a.d(aVar4.d));
                        break;
                    case 9:
                        a.this.b(0, 2);
                        break;
                    case 10:
                        int d = com.baidu.mshield.utility.a.d(a.this.d);
                        if (2 != d) {
                            if (1 == d) {
                                com.baidu.mshield.b.c.a.b("sj-trigger reportde re");
                                a.this.b(4, d);
                                break;
                            }
                        } else {
                            com.baidu.mshield.b.c.a.b("sj-trigger report wifi ");
                            if (com.baidu.mshield.rp.c.a.a(a.this.d).b() < com.baidu.mshield.sharedpreferences.a.a(a.this.d).g()) {
                                List<com.baidu.mshield.rp.d.a> a2 = com.baidu.mshield.rp.c.a.a(a.this.d).a(true, d);
                                com.baidu.mshield.b.c.a.b("sj-trigger report Dela " + a2.size());
                                if (a2.size() > 0) {
                                    com.baidu.mshield.b.c.a.b("sj-trigger reportde condi");
                                    a.this.b(0, d);
                                    break;
                                }
                            } else {
                                com.baidu.mshield.b.c.a.b("sj-trigger reportrc condi");
                                a.this.b(0, d);
                                break;
                            }
                        }
                        break;
                    case 11:
                        String valueOf2 = String.valueOf(message.obj);
                        if (!a.this.e.a(new JSONArray().put(com.baidu.mshield.utility.a.a(a.this.d, new JSONObject(valueOf2))).toString(), a.this.a(new JSONObject(valueOf2)), "3")) {
                            com.baidu.mshield.utility.a.b(a.this.d, valueOf2);
                            break;
                        }
                        break;
                }
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
            }
        }
    }

    public a(Context context) {
        this.d = context.getApplicationContext();
        this.c = com.baidu.mshield.sharedpreferences.a.a(context);
        this.e = new com.baidu.mshield.rp.e.a.a(this.d);
    }

    public final void f() {
        try {
            List<com.baidu.mshield.rp.b.a> p = this.c.p();
            if (p == null) {
                return;
            }
            Iterator<com.baidu.mshield.rp.b.a> it = p.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public final void b(int i, int i2) {
        List<com.baidu.mshield.rp.d.a> b;
        try {
            if (i2 == 0) {
                com.baidu.mshield.b.c.a.b("sj-trigger EVENT_NETWORK_NONE ");
                return;
            }
            if (i == 1) {
                b = com.baidu.mshield.rp.c.a.a(this.d).c();
                if (1 == i2) {
                    com.baidu.mshield.b.c.a.b("sj-trigger report 3g " + b.size());
                }
            } else if (i == 3) {
                b = com.baidu.mshield.rp.c.a.a(this.d).a(false, i2);
            } else if (i == 4) {
                List<com.baidu.mshield.rp.d.a> a2 = com.baidu.mshield.rp.c.a.a(this.d).a(true, i2);
                com.baidu.mshield.b.c.a.b("sj-trigger report 3g to report " + a2.size());
                b = a2;
            } else {
                b = com.baidu.mshield.rp.c.a.a(this.d).b(i2);
            }
            if (b != null && b.size() > 0) {
                long d = this.c.d();
                long currentTimeMillis = System.currentTimeMillis();
                long c = this.c.c();
                int D = this.c.D();
                if (c == 0) {
                    this.c.c(currentTimeMillis);
                    c = currentTimeMillis;
                }
                com.baidu.mshield.b.c.a.b("begintime : " + currentTimeMillis);
                com.baidu.mshield.b.c.a.b("last rp len : " + d);
                if (currentTimeMillis - c < 86400000) {
                    if (i == 3) {
                        int E = this.c.E();
                        if (E >= 5) {
                            return;
                        } else {
                            this.c.g(E + 1);
                        }
                    }
                    if (d > D * 1048576) {
                        com.baidu.mshield.b.c.a.b("rp over limit : maxday :  : " + d);
                        return;
                    }
                } else {
                    this.c.d(0L);
                    this.c.c(currentTimeMillis);
                    if (i == 3) {
                        this.c.g(0);
                    }
                }
                a(b, i2, d);
                List<com.baidu.mshield.rp.d.a> a3 = a(i, i2);
                while (a3 != null && a3.size() != 0) {
                    a(a3, i2, d);
                    if (!b()) {
                        com.baidu.mshield.b.c.a.b("324 checkReportFail");
                        return;
                    }
                    a3 = a(i, i2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void c() {
        this.e.a();
        this.c.a(System.currentTimeMillis());
    }

    public final void d() {
        try {
            com.baidu.mshield.sharedpreferences.a a2 = com.baidu.mshield.sharedpreferences.a.a(this.d);
            int J = a2.J();
            com.baidu.mshield.b.c.a.b(" 2" + Integer.toString(J));
            long currentTimeMillis = System.currentTimeMillis() - a2.G();
            long j = J * 3600000;
            if (currentTimeMillis < j) {
                com.baidu.mshield.utility.a.a(this.d, j - currentTimeMillis);
                return;
            }
            b.a(this.d).d();
            com.baidu.mshield.utility.a.a(this.d, j);
            a2.b(System.currentTimeMillis());
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public void e() {
        Message message = new Message();
        message.what = 7;
        a(message);
    }

    public void a(boolean z) {
        Message message = new Message();
        message.what = 5;
        a(message);
    }

    public void a(Message message) {
        this.b.sendMessage(message);
    }

    public final String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("Common_section");
            if (jSONObject2 != null && jSONObject2.has("12")) {
                return jSONObject2.optString("12", "");
            }
            return null;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return null;
        }
    }

    public final void a() {
        if (System.currentTimeMillis() - this.c.B() < 86400000) {
            return;
        }
        c();
    }

    public final List<com.baidu.mshield.rp.d.a> a(int i, int i2) {
        if (i == 0 && i2 == 2) {
            return com.baidu.mshield.rp.c.a.a(this.d).b(i2);
        }
        return null;
    }

    public final void a(List<com.baidu.mshield.rp.d.a> list, int i, long j) {
        JSONObject jSONObject;
        int length;
        try {
            int H = this.c.H();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<com.baidu.mshield.rp.d.a> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.baidu.mshield.rp.d.a next = it.next();
                try {
                    String jSONObject2 = com.baidu.mshield.utility.a.a(this.d, new JSONObject(next.d)).toString();
                    try {
                        jSONObject = new JSONObject(jSONObject2);
                        length = jSONObject2.length() + i2;
                    } catch (Throwable th) {
                        com.baidu.mshield.utility.a.a(th);
                    }
                } catch (Throwable th2) {
                    com.baidu.mshield.utility.a.a(th2);
                }
                if (length >= 1048576 * H) {
                    com.baidu.mshield.b.c.a.b("rp once over limit : maxOnece : " + H + " : " + length);
                    break;
                } else {
                    arrayList.add(Integer.valueOf(next.f8428a));
                    arrayList2.add(new com.baidu.mshield.rp.d.b(jSONObject, next.j, next.f8428a));
                    i2 = length;
                }
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                com.baidu.mshield.rp.d.b bVar = (com.baidu.mshield.rp.d.b) arrayList2.get(i3);
                if (bVar != null) {
                    String c = bVar.c();
                    if (TextUtils.isEmpty(c)) {
                        jSONArray.put(bVar.b());
                        arrayList3.add(Integer.valueOf(bVar.a()));
                    } else {
                        if (hashMap.containsKey(c)) {
                            JSONArray jSONArray2 = (JSONArray) hashMap.get(c);
                            if (jSONArray2 == null) {
                                jSONArray2 = new JSONArray();
                            }
                            jSONArray2.put(bVar.b());
                            hashMap.put(c, jSONArray2);
                        } else {
                            JSONArray jSONArray3 = new JSONArray();
                            jSONArray3.put(bVar.b());
                            hashMap.put(c, jSONArray3);
                        }
                        ArrayList arrayList4 = (ArrayList) hashMap2.get(c);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(Integer.valueOf(bVar.a()));
                        hashMap2.put(c, arrayList4);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                if (this.e.a(jSONArray.toString(), null, "1")) {
                    com.baidu.mshield.rp.c.a.a(this.d).a(arrayList3);
                } else {
                    f8431a = System.currentTimeMillis();
                    com.baidu.mshield.b.c.a.b("427 report fail,sFailTime = " + f8431a);
                }
            }
            if (hashMap.size() > 0) {
                for (String str : hashMap.keySet()) {
                    JSONArray jSONArray4 = (JSONArray) hashMap.get(str);
                    if (jSONArray4 != null && jSONArray4.length() > 0) {
                        if (this.e.a(jSONArray4.toString(), str, "2")) {
                            com.baidu.mshield.rp.c.a.a(this.d).a((List<Integer>) hashMap2.get(str));
                        } else {
                            f8431a = System.currentTimeMillis();
                            com.baidu.mshield.b.c.a.b("441 report fail,sFailTime = " + f8431a);
                        }
                    }
                }
            }
            com.baidu.mshield.rp.c.a.a(this.d).a();
            if (2 != i) {
                this.c.d(i2 + j);
            }
        } catch (Throwable th3) {
            com.baidu.mshield.utility.a.a(th3);
        }
    }

    public final boolean b() {
        com.baidu.mshield.b.c.a.b("checkReportFail,sFailTime=" + f8431a);
        if (f8431a > 0) {
            if (System.currentTimeMillis() - f8431a < 300000) {
                com.baidu.mshield.b.c.a.b("checkReportFail:false");
                return false;
            }
            f8431a = 0L;
        }
        com.baidu.mshield.b.c.a.b("checkReportFail:true");
        return true;
    }

    public final void b(com.baidu.mshield.rp.b.a aVar) {
        try {
            String b = this.c.b(aVar.e);
            com.baidu.mshield.rp.d.a aVar2 = new com.baidu.mshield.rp.d.a();
            aVar2.b = aVar.e;
            aVar2.g = 0;
            aVar2.c = 1;
            aVar2.e = System.currentTimeMillis();
            aVar2.f = 1;
            aVar2.d = com.baidu.mshield.utility.a.a(this.d, aVar, b, false).toString();
            com.baidu.mshield.rp.c.a.a(this.d).a(aVar2);
            this.c.a(aVar.e, true);
            String a2 = com.baidu.mshield.b.f.e.a(com.baidu.mshield.utility.a.b(this.d).toString());
            if (com.baidu.mshield.rp.c.a.a(this.d).b(a2)) {
                aVar2.b = "1067001";
                Context context = this.d;
                aVar2.d = com.baidu.mshield.utility.a.a(context, aVar.f8426a, aVar.c, "1067001", com.baidu.mshield.utility.a.b(context).toString()).toString();
                com.baidu.mshield.rp.c.a.a(this.d).a(aVar2);
                com.baidu.mshield.rp.c.a.a(this.d).a(a2);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public final void a(com.baidu.mshield.rp.b.a aVar) {
        try {
            String a2 = com.baidu.mshield.utility.a.a();
            if ("4.2.9".equals(this.c.C())) {
                com.baidu.mshield.b.c.a.b("same version=4.2.9");
                if (this.c.d(aVar.d).equals(a2)) {
                    com.baidu.mshield.b.c.a.b("same version has reported!");
                    return;
                }
                com.baidu.mshield.b.c.a.b("same version new report");
            } else {
                com.baidu.mshield.b.c.a.b("new version set=4.2.9");
                this.c.n("4.2.9");
            }
            String b = this.c.b(aVar.d);
            com.baidu.mshield.rp.d.a aVar2 = new com.baidu.mshield.rp.d.a();
            aVar2.b = aVar.d;
            aVar2.g = 0;
            aVar2.c = 2;
            aVar2.e = System.currentTimeMillis();
            aVar2.f = 1;
            aVar2.i = 5;
            aVar2.d = com.baidu.mshield.utility.a.a(this.d, aVar, b, true).toString();
            com.baidu.mshield.rp.c.a.a(this.d).a(aVar2);
            String a3 = com.baidu.mshield.b.f.e.a(com.baidu.mshield.utility.a.b(this.d).toString());
            if (com.baidu.mshield.rp.c.a.a(this.d).b(a3)) {
                aVar2.b = "1067001";
                aVar2.i = 0;
                Context context = this.d;
                aVar2.d = com.baidu.mshield.utility.a.a(context, aVar.f8426a, aVar.c, "1067001", com.baidu.mshield.utility.a.b(context).toString()).toString();
                com.baidu.mshield.rp.c.a.a(this.d).a(aVar2);
                com.baidu.mshield.rp.c.a.a(this.d).a(a3);
            }
            this.c.c(aVar.d, a2);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }
}
