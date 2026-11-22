package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1104a> f20019a = new ArrayList();
    public final List<C1104a> b = new ArrayList();

    /* renamed from: sg.bigo.ads.core.f.a.a$a, reason: collision with other inner class name */
    public static final class C1104a {

        /* renamed from: a, reason: collision with root package name */
        public final String f20020a;
        public final String b;
        public final int c;
        public final int d;
        public final String e;

        public C1104a(String str, int i, int i2, String str2, String str3) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.f20020a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.e) || "image/png".equalsIgnoreCase(this.e);
        }

        public final boolean c() {
            return "image/gif".equalsIgnoreCase(this.e);
        }
    }

    public static C1104a a(List<C1104a> list) {
        if (list == null) {
            return null;
        }
        for (C1104a c1104a : list) {
            if (c1104a != null) {
                return c1104a;
            }
        }
        return null;
    }

    public final C1104a a() {
        return a(this.f20019a);
    }
}
