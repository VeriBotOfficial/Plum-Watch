package com.baidu.bbalbscesium;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.bbalbscesium.j.a;
import com.baidu.bbalbscesium.n.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class h {
    private static boolean g = false;
    private static String h = null;
    private static final String i = "CuidV270Manager";
    private static final String j = "bohrium";
    private static final String k = "libbh.so";

    /* renamed from: a, reason: collision with root package name */
    private Context f7382a;
    private a.C0340a b;
    private volatile FileLock c;
    private volatile RandomAccessFile d;
    private com.baidu.bbalbscesium.j.b e;
    d f;

    public static class a {
        private static final String g = "dik";
        private static final String h = "v270fk";
        private static final String i = "cck";
        private static final String j = "ek";
        private static final String k = "ctk";
        private static final String l = "vsk";
        private static final int m = 1;
        public static final String[] n = {"V", "O", "0"};

        /* renamed from: a, reason: collision with root package name */
        private String f7383a;
        private String b;
        private String c;
        private long d;
        private String e;
        private int f = 1;

        /* renamed from: com.baidu.bbalbscesium.h$a$a, reason: collision with other inner class name */
        public interface InterfaceC0336a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f7384a = "0";
            public static final String b = "O";
            public static final String c = "V";
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.f7383a;
        }

        public String c() {
            return this.e;
        }

        public String d() {
            String str = this.b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7383a).append("|").append(str);
            if ("V".equals(str)) {
                sb.append(this.c);
            }
            if (!TextUtils.isEmpty(this.e)) {
                sb.append(this.e);
            }
            return sb.toString().trim();
        }

        public String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f == aVar.f && this.f7383a.equals(aVar.f7383a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && ((str = this.e) == (str2 = aVar.e) || (str != null && str.equals(str2)))) {
                    return true;
                }
            }
            return false;
        }

        public String f() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(g, this.f7383a);
                jSONObject.put(h, this.b);
                jSONObject.put(i, this.c);
                jSONObject.put(l, this.f);
                jSONObject.put(k, this.d);
                jSONObject.put(j, this.e);
                return jSONObject.toString();
            } catch (JSONException e) {
                com.baidu.bbalbscesium.o.c.a(e);
                return null;
            }
        }

        public f g() {
            f fVar = new f();
            fVar.f7380a = this.f7383a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            if ("V".equals(this.b)) {
                sb.append(this.c);
            }
            if (!TextUtils.isEmpty(this.e)) {
                sb.append(this.e);
            }
            fVar.b = sb.toString().trim();
            return fVar;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f7383a, this.b, this.c, this.e, Integer.valueOf(this.f)});
        }
    }

    public h(Context context, com.baidu.bbalbscesium.n.a aVar, d dVar) {
        if (context == null) {
            throw new NullPointerException("context should not be null!!!");
        }
        this.f7382a = context.getApplicationContext();
        a.C0340a b = aVar.c().b(j);
        this.b = b;
        b.a();
        this.f = dVar;
        a(aVar);
    }

    public static a a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String a2 = a(str);
                long currentTimeMillis = System.currentTimeMillis();
                a aVar = new a();
                aVar.f7383a = str;
                aVar.c = a2;
                aVar.d = currentTimeMillis;
                aVar.f = 1;
                aVar.e = str3;
                aVar.b = str2;
                return aVar;
            } catch (Exception e) {
                com.baidu.bbalbscesium.o.c.a(e);
            }
        }
        return null;
    }

    private String a(Context context) {
        String str = h;
        return TextUtils.isEmpty(str) ? "123456" : str;
    }

    private static String a(String str) {
        try {
            return new com.baidu.bbalbscesium.o.a(com.baidu.bbalbscesium.o.a.d, false, false).a(new com.baidu.bbalbscesium.i.a().a(str.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String a(boolean z) {
        return this.b.a(k, z);
    }

    private void a(com.baidu.bbalbscesium.n.a aVar) {
        com.baidu.bbalbscesium.j.b bVar = new com.baidu.bbalbscesium.j.b(new b());
        a.b bVar2 = new a.b();
        bVar2.f7397a = this.f7382a;
        bVar2.b = aVar;
        a.d dVar = new a.d();
        for (com.baidu.bbalbscesium.j.a aVar2 : bVar.a()) {
            aVar2.a(bVar2);
            aVar2.a(dVar);
        }
        this.e = bVar;
    }

    public static a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("dik", "");
            String optString2 = jSONObject.optString("cck", "");
            long optLong = jSONObject.optLong("ctk", 0L);
            int optInt = jSONObject.optInt("vsk", 1);
            String optString3 = jSONObject.optString("ek", "");
            String optString4 = jSONObject.optString("v270fk", "V");
            if (!TextUtils.isEmpty(optString)) {
                a aVar = new a();
                aVar.f7383a = optString;
                aVar.c = optString2;
                aVar.d = optLong;
                aVar.f = optInt;
                aVar.e = optString3;
                aVar.b = optString4;
                return aVar;
            }
        } catch (Exception e) {
            com.baidu.bbalbscesium.o.c.a(e);
        }
        return null;
    }

    public static void d(String str) {
        h = str;
    }

    public a a(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("arg non-nullable is expected");
        }
        a aVar = new a();
        aVar.d = System.currentTimeMillis();
        aVar.f = 1;
        try {
            aVar.b = fVar.b.substring(0, 1);
            aVar.f7383a = fVar.f7380a;
            aVar.c = a(fVar.f7380a);
            for (String str : a.n) {
                if (str.equals(aVar.b)) {
                    return aVar;
                }
            }
            String str2 = fVar.b;
            if (str2 != null && str2.length() >= 2) {
                aVar.e = fVar.b.substring(1);
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public a a(String str, String str2) {
        com.baidu.bbalbscesium.j.a a2 = this.e.a(str2);
        a.g gVar = new a.g();
        gVar.f7401a = true;
        a.h a3 = a2.a(str, gVar);
        if (a3 == null || !a3.b()) {
            return null;
        }
        return a3.f7402a;
    }

    public void a(a aVar) {
        a.e eVar = new a.e();
        Iterator it = this.e.a().iterator();
        while (it.hasNext()) {
            ((com.baidu.bbalbscesium.j.a) it.next()).a(eVar, aVar);
        }
    }

    public synchronized boolean a() {
        RandomAccessFile randomAccessFile;
        File a2 = this.b.a(".lock");
        if (!a2.exists()) {
            try {
                a2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            randomAccessFile = new RandomAccessFile(a2, "rw");
            for (int i2 = 0; i2 < 100; i2++) {
                try {
                    try {
                        this.c = randomAccessFile.getChannel().lock();
                        this.d = randomAccessFile;
                        return true;
                    } catch (OverlappingFileLockException unused) {
                        Thread.sleep(100L);
                    }
                } catch (Exception e2) {
                    e = e2;
                    com.baidu.bbalbscesium.o.c.a(e);
                    if (this.c == null) {
                        com.baidu.bbalbscesium.o.c.a(randomAccessFile);
                    }
                    return false;
                }
            }
        } catch (Exception e3) {
            e = e3;
            randomAccessFile = null;
        }
        return false;
    }

    public boolean a(a aVar, boolean z, boolean z2) {
        a b;
        if (aVar == null || TextUtils.isEmpty(aVar.f7383a)) {
            throw new NullPointerException("content should not be null");
        }
        if (!z2) {
            try {
                if (new File(this.b.b(), k).exists() && (b = b(a(true))) != null) {
                    String d = b.d();
                    if (!TextUtils.isEmpty(d) && d.equals(aVar.d())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return this.b.a(k, aVar.f(), z);
    }

    public a b() {
        if (new File(this.b.b(), k).exists()) {
            return b(a(true));
        }
        return null;
    }

    public a c(String str) {
        String a2 = com.baidu.bbalbscesium.m.c.a(("com.baidu" + a(this.f7382a)).getBytes(), true);
        a aVar = new a();
        aVar.d = System.currentTimeMillis();
        aVar.f = 1;
        aVar.f7383a = a2;
        aVar.b = "E";
        aVar.c = a(a2);
        aVar.e = "RO";
        return aVar;
    }

    public synchronized void c() {
        if (this.c != null) {
            try {
                this.c.release();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.c = null;
        }
        com.baidu.bbalbscesium.o.c.a(this.d);
        this.d = null;
    }

    public a d() {
        a aVar;
        a.g gVar = new a.g();
        gVar.f7401a = true;
        List a2 = this.e.a();
        Collections.sort(a2, com.baidu.bbalbscesium.j.a.f);
        List<c> b = this.f.b(this.f7382a);
        if (b == null) {
            return null;
        }
        for (c cVar : b) {
            if (!cVar.d && cVar.c) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    a.h a3 = ((com.baidu.bbalbscesium.j.a) it.next()).a(cVar.f7377a.packageName, gVar);
                    if (a3 != null && a3.b() && (aVar = a3.f7402a) != null) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }
}
