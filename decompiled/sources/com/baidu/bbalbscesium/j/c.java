package com.baidu.bbalbscesium.j;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.system.Os;
import android.text.TextUtils;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.j.a;
import com.baidu.bbalbscesium.n.a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import org.opencv.videoio.Videoio;

/* loaded from: classes12.dex */
public class c extends com.baidu.bbalbscesium.j.a {
    private static final String i = "isc";
    private static final int j = 448;
    private static final int k = 256;
    private static final int l = 128;
    private static final int m = 64;
    private static final int n = 56;
    private static final int o = 32;
    private static final int p = 16;

    /* renamed from: q, reason: collision with root package name */
    private static final int f7404q = 8;
    private static final int r = 7;
    private static final int s = 4;
    private static final int t = 2;
    private static final int u = 1;
    private static final int v = -100;
    a.C0340a g;
    private b h;

    static class a {
        a() {
        }

        static boolean a(a.C0340a c0340a, com.baidu.bbalbscesium.n.a aVar) {
            while (c0340a != null) {
                if (!a(c0340a.b())) {
                    return false;
                }
                c0340a = c0340a.d();
            }
            return a(aVar.a());
        }

        private static boolean a(File file) {
            try {
                int i = Os.stat(file.getAbsolutePath()).st_mode;
                if ((i & 1) == 0) {
                    Os.chmod(file.getAbsolutePath(), i | 1);
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    class b {
        private static final String h = "pub.dat";
        private static final String i = "pub_lst_ts";
        private static final String j = "pub_info";
        public static final int k = 0;
        public static final int l = 1;
        public static final int m = 2;
        public static final int n = 3;
        private static final String o = "d_form_ver";
        private static final int p = 1;
        private long b;
        private h.a c;
        private boolean d;
        private int f;

        /* renamed from: a, reason: collision with root package name */
        private com.baidu.bbalbscesium.o.b f7405a = new com.baidu.bbalbscesium.o.b();
        private boolean e = true;

        b() {
        }

        private boolean a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.b = jSONObject.getLong(i);
                    this.c = h.b(jSONObject.getString(j));
                    this.f = jSONObject.getInt(o);
                    this.d = false;
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public long a(long j2) {
            return this.f7405a.a(j2);
        }

        public h.a a() {
            return this.c;
        }

        public void a(long j2, long j3) {
            if (this.f7405a.a(j2, j3)) {
                this.d = true;
            }
        }

        public void a(h.a aVar) {
            if (aVar.equals(this.c)) {
                return;
            }
            this.c = aVar;
            this.d = true;
        }

        public boolean a(PackageInfo packageInfo) {
            String a2 = c.this.g.a(new File(packageInfo.applicationInfo.dataDir)).a(h, true);
            this.e = false;
            return a(a2);
        }

        public long b() {
            return this.b;
        }

        public void b(long j2) {
            if (this.b != j2) {
                this.b = j2;
                this.d = true;
            }
        }

        public boolean c() {
            return c.b(c.this.g.a(h), true);
        }

        public boolean d() {
            if (!this.e) {
                throw new IllegalStateException();
            }
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(j, this.c.f());
                    jSONObject.put(i, this.b);
                    jSONObject.put(o, 1);
                    c.this.g.a(h, jSONObject.toString(), true);
                    this.d = false;
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public boolean e() {
            return a(c.this.g.a(h, true));
        }
    }

    /* renamed from: com.baidu.bbalbscesium.j.c$c, reason: collision with other inner class name */
    class C0338c extends a.c {
        private static final String n = "pkg";
        private static final String o = "last_fe_ts";
        private static final String p = "tar_pkg_lst_pub_ts";

        /* renamed from: q, reason: collision with root package name */
        private static final String f7406q = "tar_pkg_lst_up_ts";
        private static final String r = "info";
        private static final String s = "d_form_ver";
        private static final int t = 1;
        private int g;
        private String h;
        private long i;
        private long j;
        private long k;
        private h.a l;

        public C0338c(String str) {
            super(c.this.g, str);
        }

        public void a(b bVar) {
            a(bVar.a());
            b(bVar.b());
        }

        @Override // com.baidu.bbalbscesium.j.a.c
        public void a(JSONObject jSONObject) throws JSONException {
            this.h = jSONObject.getString("pkg");
            this.j = jSONObject.getInt(p);
            this.i = jSONObject.getLong(o);
            this.l = h.b(jSONObject.getString("info"));
            this.k = jSONObject.getLong(f7406q);
            this.g = jSONObject.getInt(s);
        }

        public boolean a(long j) {
            if (this.i == j) {
                return false;
            }
            this.i = j;
            a(true);
            return true;
        }

        public boolean a(h.a aVar) {
            if (aVar.equals(this.l)) {
                return false;
            }
            this.l = aVar;
            a(true);
            return true;
        }

        public boolean a(String str) {
            if (str.equals(this.h)) {
                return false;
            }
            this.h = str;
            a(true);
            return true;
        }

        @Override // com.baidu.bbalbscesium.j.a.c
        public void b(JSONObject jSONObject) throws JSONException {
            jSONObject.put("pkg", this.h);
            jSONObject.put(o, this.i);
            jSONObject.put(p, this.j);
            jSONObject.put("info", this.l.f());
            jSONObject.put(f7406q, this.k);
            jSONObject.put(s, 1);
        }

        public boolean b(long j) {
            if (this.j == j) {
                return false;
            }
            this.j = j;
            a(true);
            return true;
        }

        public h.a c() {
            return this.l;
        }

        public boolean c(long j) {
            if (this.k == j) {
                return false;
            }
            this.k = j;
            a(true);
            return true;
        }

        public long d() {
            return this.k;
        }

        public String e() {
            return this.h;
        }
    }

    public c() {
        super("isc", com.baidu.bbalbscesium.j.b.f);
        this.h = new b();
    }

    private a.f b(a.e eVar, h.a aVar) {
        this.h.e();
        this.g.a();
        if (aVar.equals(this.h.a())) {
            return a.f.d();
        }
        this.h.a(aVar);
        this.h.b(System.currentTimeMillis());
        return a.f.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(File file, boolean z) {
        try {
            Os.chmod(file.getAbsolutePath(), z ? 436 : Videoio.CAP_PROP_XI_DECIMATION_VERTICAL);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void c() {
        this.h.a(a.a(this.g, this.f7396a.b) ? 1 : 2, 3L);
    }

    @Override // com.baidu.bbalbscesium.j.a
    public a.f a(a.e eVar, h.a aVar) {
        return a.f.d();
    }

    @Override // com.baidu.bbalbscesium.j.a
    public a.h a(String str, a.g gVar) {
        PackageInfo packageInfo;
        h.a a2;
        C0338c c0338c = null;
        try {
            packageInfo = this.f7396a.f7397a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return a.h.a(-2);
        }
        if (gVar.f7401a) {
            c0338c = new C0338c(str);
            c0338c.b();
            if (str.equals(c0338c.e()) && packageInfo.lastUpdateTime == c0338c.d()) {
                a2 = c0338c.c();
                return a.h.a(a2);
            }
        }
        b bVar = new b();
        if (!bVar.a(packageInfo)) {
            return a.h.a(-2);
        }
        if (gVar.f7401a && c0338c != null) {
            c0338c.a(bVar);
            c0338c.a(System.currentTimeMillis());
            c0338c.c(packageInfo.lastUpdateTime);
            c0338c.a(str);
            c0338c.a();
        }
        a2 = bVar.a();
        return a.h.a(a2);
    }

    @Override // com.baidu.bbalbscesium.j.a
    public void a(a.d dVar) {
        this.g = this.b.b("isc");
    }
}
