package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class dp {

    public static final class a extends e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f351a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f352b;
        private boolean d;
        private boolean e;

        /* renamed from: a, reason: collision with root package name */
        private int f14529a = 0;

        /* renamed from: c, reason: collision with other field name */
        private boolean f353c = false;
        private int b = 0;
        private boolean f = false;

        /* renamed from: a, reason: collision with other field name */
        private List<String> f350a = Collections.emptyList();
        private int c = -1;

        public int c() {
            return this.f14529a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12009a() {
            return this.f351a;
        }

        public a a(int i) {
            this.f351a = true;
            this.f14529a = i;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12010b() {
            return this.f353c;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12011c() {
            return this.f352b;
        }

        public a a(boolean z) {
            this.f352b = true;
            this.f353c = z;
            return this;
        }

        public int d() {
            return this.b;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m12012d() {
            return this.d;
        }

        public a b(int i) {
            this.d = true;
            this.b = i;
            return this;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m12013e() {
            return this.f;
        }

        public boolean f() {
            return this.e;
        }

        public a b(boolean z) {
            this.e = true;
            this.f = z;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public List<String> m12008a() {
            return this.f350a;
        }

        public int e() {
            return this.f350a.size();
        }

        public a a(String str) {
            str.getClass();
            if (this.f350a.isEmpty()) {
                this.f350a = new ArrayList();
            }
            this.f350a.add(str);
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(c cVar) {
            if (m12009a()) {
                cVar.m11944b(1, c());
            }
            if (m12011c()) {
                cVar.m11936a(2, m12010b());
            }
            if (m12012d()) {
                cVar.m11931a(3, d());
            }
            if (f()) {
                cVar.m11936a(4, m12013e());
            }
            Iterator<String> it = m12008a().iterator();
            while (it.hasNext()) {
                cVar.m11935a(5, it.next());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.c < 0) {
                b();
            }
            return this.c;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int i = 0;
            int b = m12009a() ? c.b(1, c()) : 0;
            if (m12011c()) {
                b += c.a(2, m12010b());
            }
            if (m12012d()) {
                b += c.a(3, d());
            }
            if (f()) {
                b += c.a(4, m12013e());
            }
            Iterator<String> it = m12008a().iterator();
            while (it.hasNext()) {
                i += c.a(it.next());
            }
            int size = b + i + m12008a().size();
            this.c = size;
            return size;
        }

        @Override // com.xiaomi.push.e
        public a a(b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 8) {
                    a(bVar.c());
                } else if (m11895a == 16) {
                    a(bVar.m11901a());
                } else if (m11895a == 24) {
                    b(bVar.m11904b());
                } else if (m11895a == 32) {
                    b(bVar.m11901a());
                } else if (m11895a != 42) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    a(bVar.m11898a());
                }
            }
            return this;
        }

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }

        public static a b(b bVar) {
            return new a().a(bVar);
        }
    }
}
