package com.baidu.location.indoor;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Base64;
import com.baidu.location.b.x;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class a extends com.baidu.location.h.g {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Long> f7732a = new HashMap<>();
    private static Object k = new Object();
    private static a l = null;
    private Context c;
    private String e;
    private InterfaceC0354a g;
    private Handler i;
    private Runnable j;
    private final SimpleDateFormat b = new SimpleDateFormat("yyyyMM");
    private String h = null;
    private HashSet<String> f = new HashSet<>();
    private boolean d = false;

    /* renamed from: com.baidu.location.indoor.a$a, reason: collision with other inner class name */
    public interface InterfaceC0354a {
        void a(boolean z);
    }

    public a(Context context) {
        this.c = context;
        this.el = new HashMap();
        this.i = new Handler();
        this.j = new Runnable() { // from class: com.baidu.location.indoor.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.h != null) {
                    a aVar = a.this;
                    aVar.e = aVar.h;
                    ExecutorService c = x.a().c();
                    if (c != null) {
                        a.this.a(c, com.baidu.location.h.d.u);
                    } else {
                        a.this.e(com.baidu.location.h.d.u);
                    }
                }
            }
        };
    }

    private String a(Date date) {
        File file = new File(this.c.getCacheDir(), com.baidu.location.h.i.a((this.e + this.b.format(date)).getBytes(), false));
        if (!file.isFile()) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = str + readLine + "\n";
            }
            bufferedReader.close();
            if (!str.equals("")) {
                return new String(Base64.decode(str.getBytes(), 0));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private void c(String str) {
        for (String str2 : str.split(",")) {
            this.f.add(str2.toLowerCase());
        }
    }

    private Date d() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -1);
        return calendar.getTime();
    }

    private void d(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.c.getCacheDir(), com.baidu.location.h.i.a((this.e + this.b.format(new Date())).getBytes(), false)));
            fileWriter.write(new String(Base64.encode(str.getBytes(), 0), "UTF-8"));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }

    private void e() {
        try {
            File file = new File(this.c.getCacheDir(), com.baidu.location.h.i.a((this.e + this.b.format(d())).getBytes(), false));
            if (file.isFile()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    private void f(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.c.getCacheDir(), "buildings"), true);
            fileWriter.write(str + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    @Override // com.baidu.location.h.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6) {
        /*
            r5 = this;
            java.lang.String r0 = "anchorinfo"
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L42
            java.lang.String r6 = r5.ej
            if (r6 == 0) goto L42
            java.lang.String r6 = r5.ej     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L42
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Exception -> L42
            byte[] r6 = android.util.Base64.decode(r6, r2)     // Catch: java.lang.Exception -> L42
            r3.<init>(r6)     // Catch: java.lang.Exception -> L42
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L42
            r6.<init>(r3)     // Catch: java.lang.Exception -> L42
            boolean r3 = r6.has(r0)     // Catch: java.lang.Exception -> L42
            if (r3 == 0) goto L42
            java.lang.String r6 = r6.optString(r0)     // Catch: java.lang.Exception -> L42
            if (r6 == 0) goto L42
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Exception -> L42
            if (r0 != 0) goto L42
            java.util.HashSet<java.lang.String> r0 = r5.f     // Catch: java.lang.Exception -> L42
            r0.clear()     // Catch: java.lang.Exception -> L42
            r5.c(r6)     // Catch: java.lang.Exception -> L42
            r5.d(r6)     // Catch: java.lang.Exception -> L42
            r5.e()     // Catch: java.lang.Exception -> L40
        L40:
            r6 = r1
            goto L43
        L42:
            r6 = r2
        L43:
            if (r6 != 0) goto L58
            java.lang.String r0 = r5.h
            if (r0 != 0) goto L58
            java.lang.String r0 = r5.e
            r5.h = r0
            android.os.Handler r0 = r5.i
            java.lang.Runnable r1 = r5.j
            r3 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r1, r3)
            goto L79
        L58:
            r0 = 0
            if (r6 == 0) goto L5e
            r5.h = r0
            goto L79
        L5e:
            java.lang.String r3 = r5.h
            r5.f(r3)
            r5.h = r0
            java.util.Date r0 = r5.d()
            java.lang.String r0 = r5.a(r0)
            if (r0 == 0) goto L79
            r5.c(r0)
            com.baidu.location.indoor.a$a r0 = r5.g
            if (r0 == 0) goto L79
            r0.a(r1)
        L79:
            r5.d = r2
            com.baidu.location.indoor.a$a r0 = r5.g
            if (r0 == 0) goto L82
            r0.a(r6)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.indoor.a.a(boolean):void");
    }

    public boolean a() {
        HashSet<String> hashSet = this.f;
        return (hashSet == null || hashSet.isEmpty()) ? false : true;
    }

    public boolean a(String str) {
        String str2 = this.e;
        return (str2 == null || !str2.equalsIgnoreCase(str) || this.f.isEmpty()) ? false : true;
    }

    public boolean a(String str, InterfaceC0354a interfaceC0354a) {
        if (!this.d) {
            this.g = interfaceC0354a;
            this.d = true;
            this.e = str;
            try {
                String a2 = a(new Date());
                if (a2 == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (f7732a.get(str) == null || currentTimeMillis - f7732a.get(str).longValue() > 86400000) {
                        f7732a.put(str, Long.valueOf(currentTimeMillis));
                        ExecutorService c = x.a().c();
                        if (c != null) {
                            a(c, com.baidu.location.h.d.u);
                        } else {
                            e(com.baidu.location.h.d.u);
                        }
                    }
                } else {
                    c(a2);
                    InterfaceC0354a interfaceC0354a2 = this.g;
                    if (interfaceC0354a2 != null) {
                        interfaceC0354a2.a(true);
                    }
                    this.d = false;
                }
            } catch (Exception unused) {
                this.d = false;
            }
        }
        return false;
    }

    @Override // com.baidu.location.h.g
    public void b() {
        this.eh = com.baidu.location.h.d.u;
        this.el.clear();
        this.el.put("bid", "none");
        this.el.put("bldg", this.e);
        this.el.put("mb", Build.MODEL);
        this.el.put(com.anythink.expressad.foundation.g.a.H, "2.0");
        this.el.put("cuid", com.baidu.location.h.b.a().c);
        this.el.put("anchors", "v1");
        this.el.put("cnloc", Integer.valueOf(com.baidu.location.b.l.a().b()));
    }

    public boolean b(String str) {
        HashSet<String> hashSet;
        return (this.e == null || (hashSet = this.f) == null || hashSet.isEmpty() || !this.f.contains(str)) ? false : true;
    }

    public void c() {
        this.e = null;
        this.f.clear();
    }
}
