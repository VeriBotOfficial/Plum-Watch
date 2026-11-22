package com.baidu.bbalbscesium.j;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.n.a;
import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class a {
    static final String e = "cs";
    public static Comparator f = new C0337a();

    /* renamed from: a, reason: collision with root package name */
    protected b f7396a;
    protected a.C0340a b;
    private final String c;
    private long d;

    /* renamed from: com.baidu.bbalbscesium.j.a$a, reason: collision with other inner class name */
    class C0337a implements Comparator {
        C0337a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            long b = aVar.b() - aVar2.b();
            return b != 0 ? b > 0 ? -1 : 1 : aVar.a().compareTo(aVar2.a());
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f7397a;
        public com.baidu.bbalbscesium.n.a b;
    }

    public static abstract class c {
        private static final String e = "target-pkg-";
        private static final int f = 3;

        /* renamed from: a, reason: collision with root package name */
        private a.C0340a f7398a;
        private String b;
        private String c;
        private boolean d = true;

        public c(a.C0340a c0340a, String str) {
            this.f7398a = c0340a;
            this.b = str;
            this.c = e + Base64.encodeToString(str.getBytes(), 3);
        }

        public abstract void a(JSONObject jSONObject) throws JSONException;

        public void a(boolean z) {
            this.d = z;
        }

        public boolean a() {
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    b(jSONObject);
                    this.f7398a.a(this.c, jSONObject.toString(), true);
                    a(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public abstract void b(JSONObject jSONObject) throws JSONException;

        public boolean b() {
            String a2 = this.f7398a.a(this.c, true);
            if (!TextUtils.isEmpty(a2)) {
                try {
                    a(new JSONObject(a2));
                    a(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public static class d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7399a;
    }

    public static class f {
        public static final int d = 0;
        public static final int e = -1;
        public static final int f = 0;
        public static final int g = -100;

        /* renamed from: a, reason: collision with root package name */
        private int f7400a;
        private int b;
        public Exception c;

        public f(int i, int i2, Exception exc) {
            this.f7400a = i;
            this.b = i2;
            this.c = exc;
        }

        public static f a() {
            return a(0);
        }

        public static f a(int i) {
            return new f(-1, i, null);
        }

        public static f a(Exception exc) {
            return new f(-1, 0, exc);
        }

        public static f d() {
            return new f(0, 0, null);
        }

        public int b() {
            return this.f7400a;
        }

        public int c() {
            return this.b;
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7401a;
    }

    public static class h {
        public static final int d = 0;
        public static final int e = -1;
        public static final int f = -2;
        public static final int g = -100;

        /* renamed from: a, reason: collision with root package name */
        public h.a f7402a;
        public int b;
        public Exception c;

        public h(int i, h.a aVar, Exception exc) {
            this.b = i;
            this.f7402a = aVar;
            this.c = exc;
        }

        public static h a() {
            return new h(-1, null, null);
        }

        public static h a(int i) {
            return new h(i, null, null);
        }

        public static h a(int i, Exception exc) {
            return new h(i, null, exc);
        }

        public static h a(h.a aVar) {
            return new h(0, aVar, null);
        }

        public static h a(Exception exc) {
            return new h(-1, null, exc);
        }

        public boolean b() {
            return this.b == 0;
        }
    }

    public a(String str, long j) {
        this.c = str;
        this.d = j;
    }

    public abstract f a(e eVar, h.a aVar);

    public abstract h a(String str, g gVar);

    public String a() {
        return this.c;
    }

    public void a(long j) {
        this.d = j;
    }

    public final void a(b bVar) {
        this.f7396a = bVar;
        this.b = bVar.b.c().b(e);
    }

    public abstract void a(d dVar);

    public long b() {
        return this.d;
    }
}
