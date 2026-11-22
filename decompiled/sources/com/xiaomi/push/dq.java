package com.xiaomi.push;

/* loaded from: classes4.dex */
public final class dq {

    public static final class b extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f368a;

        /* renamed from: c, reason: collision with other field name */
        private boolean f370c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f371d;
        private boolean e;

        /* renamed from: b, reason: collision with other field name */
        private boolean f369b = false;

        /* renamed from: a, reason: collision with root package name */
        private int f14531a = 0;
        private int b = 0;
        private int c = 0;
        private int d = -1;

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12030a() {
            return this.f369b;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12031b() {
            return this.f368a;
        }

        public b a(boolean z) {
            this.f368a = true;
            this.f369b = z;
            return this;
        }

        public int c() {
            return this.f14531a;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12032c() {
            return this.f370c;
        }

        public b a(int i) {
            this.f370c = true;
            this.f14531a = i;
            return this;
        }

        public int d() {
            return this.b;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m12033d() {
            return this.f371d;
        }

        public b b(int i) {
            this.f371d = true;
            this.b = i;
            return this;
        }

        public int e() {
            return this.c;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m12034e() {
            return this.e;
        }

        public b c(int i) {
            this.e = true;
            this.c = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12031b()) {
                cVar.m11936a(1, m12030a());
            }
            if (m12032c()) {
                cVar.m11931a(3, c());
            }
            if (m12033d()) {
                cVar.m11931a(4, d());
            }
            if (m12034e()) {
                cVar.m11931a(5, e());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.d < 0) {
                b();
            }
            return this.d;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12031b() ? com.xiaomi.push.c.a(1, m12030a()) : 0;
            if (m12032c()) {
                a2 += com.xiaomi.push.c.a(3, c());
            }
            if (m12033d()) {
                a2 += com.xiaomi.push.c.a(4, d());
            }
            if (m12034e()) {
                a2 += com.xiaomi.push.c.a(5, e());
            }
            this.d = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public b a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 8) {
                    a(bVar.m11901a());
                } else if (m11895a == 24) {
                    a(bVar.m11904b());
                } else if (m11895a == 32) {
                    b(bVar.m11904b());
                } else if (m11895a != 40) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    c(bVar.m11904b());
                }
            }
            return this;
        }

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }
    }

    public static final class a extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f356a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f359b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f362c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f364d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f366e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f367f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        /* renamed from: a, reason: collision with root package name */
        private int f14530a = 0;

        /* renamed from: a, reason: collision with other field name */
        private long f354a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f355a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f358b = "";

        /* renamed from: c, reason: collision with other field name */
        private String f361c = "";

        /* renamed from: d, reason: collision with other field name */
        private String f363d = "";

        /* renamed from: e, reason: collision with other field name */
        private String f365e = "";
        private int b = 1;
        private int c = 0;
        private int d = 0;
        private String f = "";

        /* renamed from: b, reason: collision with other field name */
        private long f357b = 0;

        /* renamed from: c, reason: collision with other field name */
        private long f360c = 0;
        private int e = -1;

        public int c() {
            return this.f14530a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12017a() {
            return this.f356a;
        }

        public a a(int i) {
            this.f356a = true;
            this.f14530a = i;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public long m12014a() {
            return this.f354a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12020b() {
            return this.f359b;
        }

        public a a(long j) {
            this.f359b = true;
            this.f354a = j;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m12016a() {
            return this.f355a;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12023c() {
            return this.f362c;
        }

        public a a(String str) {
            this.f362c = true;
            this.f355a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m12019b() {
            return this.f358b;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m12025d() {
            return this.f364d;
        }

        public a b(String str) {
            this.f364d = true;
            this.f358b = str;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public String m12022c() {
            return this.f361c;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m12027e() {
            return this.f366e;
        }

        public a c(String str) {
            this.f366e = true;
            this.f361c = str;
            return this;
        }

        /* renamed from: d, reason: collision with other method in class */
        public String m12024d() {
            return this.f363d;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m12029f() {
            return this.f367f;
        }

        public a d(String str) {
            this.f367f = true;
            this.f363d = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public a m12015a() {
            this.f367f = false;
            this.f363d = "";
            return this;
        }

        /* renamed from: e, reason: collision with other method in class */
        public String m12026e() {
            return this.f365e;
        }

        public boolean g() {
            return this.g;
        }

        public a e(String str) {
            this.g = true;
            this.f365e = str;
            return this;
        }

        public boolean h() {
            return this.h;
        }

        public int d() {
            return this.b;
        }

        public a b(int i) {
            this.h = true;
            this.b = i;
            return this;
        }

        public int e() {
            return this.c;
        }

        public boolean i() {
            return this.i;
        }

        public a c(int i) {
            this.i = true;
            this.c = i;
            return this;
        }

        public int f() {
            return this.d;
        }

        public boolean j() {
            return this.j;
        }

        public a d(int i) {
            this.j = true;
            this.d = i;
            return this;
        }

        /* renamed from: f, reason: collision with other method in class */
        public String m12028f() {
            return this.f;
        }

        public boolean k() {
            return this.k;
        }

        public a f(String str) {
            this.k = true;
            this.f = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public long m12018b() {
            return this.f357b;
        }

        public boolean l() {
            return this.l;
        }

        public a b(long j) {
            this.l = true;
            this.f357b = j;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public long m12021c() {
            return this.f360c;
        }

        public boolean m() {
            return this.m;
        }

        public a c(long j) {
            this.m = true;
            this.f360c = j;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12017a()) {
                cVar.m11931a(1, c());
            }
            if (m12020b()) {
                cVar.m11945b(2, m12014a());
            }
            if (m12023c()) {
                cVar.m11935a(3, m12016a());
            }
            if (m12025d()) {
                cVar.m11935a(4, m12019b());
            }
            if (m12027e()) {
                cVar.m11935a(5, m12022c());
            }
            if (m12029f()) {
                cVar.m11935a(6, m12024d());
            }
            if (g()) {
                cVar.m11935a(7, m12026e());
            }
            if (h()) {
                cVar.m11931a(8, d());
            }
            if (i()) {
                cVar.m11931a(9, e());
            }
            if (j()) {
                cVar.m11931a(10, f());
            }
            if (k()) {
                cVar.m11935a(11, m12028f());
            }
            if (l()) {
                cVar.m11945b(12, m12018b());
            }
            if (m()) {
                cVar.m11945b(13, m12021c());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12017a() ? com.xiaomi.push.c.a(1, c()) : 0;
            if (m12020b()) {
                a2 += com.xiaomi.push.c.b(2, m12014a());
            }
            if (m12023c()) {
                a2 += com.xiaomi.push.c.a(3, m12016a());
            }
            if (m12025d()) {
                a2 += com.xiaomi.push.c.a(4, m12019b());
            }
            if (m12027e()) {
                a2 += com.xiaomi.push.c.a(5, m12022c());
            }
            if (m12029f()) {
                a2 += com.xiaomi.push.c.a(6, m12024d());
            }
            if (g()) {
                a2 += com.xiaomi.push.c.a(7, m12026e());
            }
            if (h()) {
                a2 += com.xiaomi.push.c.a(8, d());
            }
            if (i()) {
                a2 += com.xiaomi.push.c.a(9, e());
            }
            if (j()) {
                a2 += com.xiaomi.push.c.a(10, f());
            }
            if (k()) {
                a2 += com.xiaomi.push.c.a(11, m12028f());
            }
            if (l()) {
                a2 += com.xiaomi.push.c.b(12, m12018b());
            }
            if (m()) {
                a2 += com.xiaomi.push.c.b(13, m12021c());
            }
            this.e = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public a a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                switch (m11895a) {
                    case 0:
                        break;
                    case 8:
                        a(bVar.m11904b());
                        break;
                    case 16:
                        a(bVar.m11905b());
                        break;
                    case 26:
                        a(bVar.m11898a());
                        break;
                    case 34:
                        b(bVar.m11898a());
                        break;
                    case 42:
                        c(bVar.m11898a());
                        break;
                    case 50:
                        d(bVar.m11898a());
                        break;
                    case 58:
                        e(bVar.m11898a());
                        break;
                    case 64:
                        b(bVar.m11904b());
                        break;
                    case 72:
                        c(bVar.m11904b());
                        break;
                    case 80:
                        d(bVar.m11904b());
                        break;
                    case 90:
                        f(bVar.m11898a());
                        break;
                    case 96:
                        b(bVar.m11905b());
                        break;
                    case 104:
                        c(bVar.m11905b());
                        break;
                    default:
                        if (!a(bVar, m11895a)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class e extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f386a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f389b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f391c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f393d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f395e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f396f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        /* renamed from: a, reason: collision with root package name */
        private int f14534a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f385a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f388b = "";

        /* renamed from: c, reason: collision with other field name */
        private String f390c = "";
        private int b = 0;

        /* renamed from: d, reason: collision with other field name */
        private String f392d = "";

        /* renamed from: e, reason: collision with other field name */
        private String f394e = "";
        private String f = "";

        /* renamed from: a, reason: collision with other field name */
        private b f384a = null;
        private int c = 0;

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f383a = com.xiaomi.push.a.f14414a;

        /* renamed from: b, reason: collision with other field name */
        private com.xiaomi.push.a f387b = com.xiaomi.push.a.f14414a;
        private int d = 0;
        private int e = -1;

        public int c() {
            return this.f14534a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12051a() {
            return this.f386a;
        }

        public e a(int i) {
            this.f386a = true;
            this.f14534a = i;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m12050a() {
            return this.f385a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12054b() {
            return this.f389b;
        }

        public e a(String str) {
            this.f389b = true;
            this.f385a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m12053b() {
            return this.f388b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12056c() {
            return this.f391c;
        }

        public e b(String str) {
            this.f391c = true;
            this.f388b = str;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public String m12055c() {
            return this.f390c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m12058d() {
            return this.f393d;
        }

        public e c(String str) {
            this.f393d = true;
            this.f390c = str;
            return this;
        }

        public int d() {
            return this.b;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m12060e() {
            return this.f395e;
        }

        public e b(int i) {
            this.f395e = true;
            this.b = i;
            return this;
        }

        /* renamed from: d, reason: collision with other method in class */
        public String m12057d() {
            return this.f392d;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m12062f() {
            return this.f396f;
        }

        public e d(String str) {
            this.f396f = true;
            this.f392d = str;
            return this;
        }

        /* renamed from: e, reason: collision with other method in class */
        public String m12059e() {
            return this.f394e;
        }

        public boolean g() {
            return this.g;
        }

        public e e(String str) {
            this.g = true;
            this.f394e = str;
            return this;
        }

        /* renamed from: f, reason: collision with other method in class */
        public String m12061f() {
            return this.f;
        }

        public boolean h() {
            return this.h;
        }

        public e f(String str) {
            this.h = true;
            this.f = str;
            return this;
        }

        public boolean i() {
            return this.i;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m12049a() {
            return this.f384a;
        }

        public e a(b bVar) {
            bVar.getClass();
            this.i = true;
            this.f384a = bVar;
            return this;
        }

        public int e() {
            return this.c;
        }

        public boolean j() {
            return this.j;
        }

        public e c(int i) {
            this.j = true;
            this.c = i;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m12048a() {
            return this.f383a;
        }

        public boolean k() {
            return this.k;
        }

        public e a(com.xiaomi.push.a aVar) {
            this.k = true;
            this.f383a = aVar;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public com.xiaomi.push.a m12052b() {
            return this.f387b;
        }

        public boolean l() {
            return this.l;
        }

        public e b(com.xiaomi.push.a aVar) {
            this.l = true;
            this.f387b = aVar;
            return this;
        }

        public int f() {
            return this.d;
        }

        public boolean m() {
            return this.m;
        }

        public e d(int i) {
            this.m = true;
            this.d = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12051a()) {
                cVar.m11944b(1, c());
            }
            if (m12054b()) {
                cVar.m11935a(2, m12050a());
            }
            if (m12056c()) {
                cVar.m11935a(3, m12053b());
            }
            if (m12058d()) {
                cVar.m11935a(4, m12055c());
            }
            if (m12060e()) {
                cVar.m11931a(5, d());
            }
            if (m12062f()) {
                cVar.m11935a(6, m12057d());
            }
            if (g()) {
                cVar.m11935a(7, m12059e());
            }
            if (h()) {
                cVar.m11935a(8, m12061f());
            }
            if (i()) {
                cVar.m11934a(9, (com.xiaomi.push.e) m12049a());
            }
            if (j()) {
                cVar.m11931a(10, e());
            }
            if (k()) {
                cVar.m11933a(11, m12048a());
            }
            if (l()) {
                cVar.m11933a(12, m12052b());
            }
            if (m()) {
                cVar.m11931a(13, f());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int b = m12051a() ? com.xiaomi.push.c.b(1, c()) : 0;
            if (m12054b()) {
                b += com.xiaomi.push.c.a(2, m12050a());
            }
            if (m12056c()) {
                b += com.xiaomi.push.c.a(3, m12053b());
            }
            if (m12058d()) {
                b += com.xiaomi.push.c.a(4, m12055c());
            }
            if (m12060e()) {
                b += com.xiaomi.push.c.a(5, d());
            }
            if (m12062f()) {
                b += com.xiaomi.push.c.a(6, m12057d());
            }
            if (g()) {
                b += com.xiaomi.push.c.a(7, m12059e());
            }
            if (h()) {
                b += com.xiaomi.push.c.a(8, m12061f());
            }
            if (i()) {
                b += com.xiaomi.push.c.a(9, (com.xiaomi.push.e) m12049a());
            }
            if (j()) {
                b += com.xiaomi.push.c.a(10, e());
            }
            if (k()) {
                b += com.xiaomi.push.c.a(11, m12048a());
            }
            if (l()) {
                b += com.xiaomi.push.c.a(12, m12052b());
            }
            if (m()) {
                b += com.xiaomi.push.c.a(13, f());
            }
            this.e = b;
            return b;
        }

        @Override // com.xiaomi.push.e
        public e a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                switch (m11895a) {
                    case 0:
                        break;
                    case 8:
                        a(bVar.c());
                        break;
                    case 18:
                        a(bVar.m11898a());
                        break;
                    case 26:
                        b(bVar.m11898a());
                        break;
                    case 34:
                        c(bVar.m11898a());
                        break;
                    case 40:
                        b(bVar.m11904b());
                        break;
                    case 50:
                        d(bVar.m11898a());
                        break;
                    case 58:
                        e(bVar.m11898a());
                        break;
                    case 66:
                        f(bVar.m11898a());
                        break;
                    case 74:
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                        break;
                    case 80:
                        c(bVar.m11904b());
                        break;
                    case 90:
                        a(bVar.m11897a());
                        break;
                    case 98:
                        b(bVar.m11897a());
                        break;
                    case 104:
                        d(bVar.m11904b());
                        break;
                    default:
                        if (!a(bVar, m11895a)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class f extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f399a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f400b;
        private boolean c;

        /* renamed from: a, reason: collision with other field name */
        private String f398a = "";
        private String b = "";

        /* renamed from: a, reason: collision with other field name */
        private b f397a = null;

        /* renamed from: a, reason: collision with root package name */
        private int f14535a = -1;

        /* renamed from: a, reason: collision with other method in class */
        public String m12064a() {
            return this.f398a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12065a() {
            return this.f399a;
        }

        public f a(String str) {
            this.f399a = true;
            this.f398a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m12066b() {
            return this.b;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12067b() {
            return this.f400b;
        }

        public f b(String str) {
            this.f400b = true;
            this.b = str;
            return this;
        }

        public boolean c() {
            return this.c;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m12063a() {
            return this.f397a;
        }

        public f a(b bVar) {
            bVar.getClass();
            this.c = true;
            this.f397a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12065a()) {
                cVar.m11935a(1, m12064a());
            }
            if (m12067b()) {
                cVar.m11935a(2, m12066b());
            }
            if (c()) {
                cVar.m11934a(3, (com.xiaomi.push.e) m12063a());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f14535a < 0) {
                b();
            }
            return this.f14535a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12065a() ? com.xiaomi.push.c.a(1, m12064a()) : 0;
            if (m12067b()) {
                a2 += com.xiaomi.push.c.a(2, m12066b());
            }
            if (c()) {
                a2 += com.xiaomi.push.c.a(3, (com.xiaomi.push.e) m12063a());
            }
            this.f14535a = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public f a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 10) {
                    a(bVar.m11898a());
                } else if (m11895a == 18) {
                    b(bVar.m11898a());
                } else if (m11895a != 26) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                }
            }
            return this;
        }

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }
    }

    public static final class h extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f406a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f407b;

        /* renamed from: a, reason: collision with root package name */
        private int f14537a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f405a = "";
        private int b = -1;

        public int c() {
            return this.f14537a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12074a() {
            return this.f406a;
        }

        public h a(int i) {
            this.f406a = true;
            this.f14537a = i;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m12073a() {
            return this.f405a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12075b() {
            return this.f407b;
        }

        public h a(String str) {
            this.f407b = true;
            this.f405a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12074a()) {
                cVar.m11931a(1, c());
            }
            if (m12075b()) {
                cVar.m11935a(2, m12073a());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.b < 0) {
                b();
            }
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12074a() ? com.xiaomi.push.c.a(1, c()) : 0;
            if (m12075b()) {
                a2 += com.xiaomi.push.c.a(2, m12073a());
            }
            this.b = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public h a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 8) {
                    a(bVar.m11904b());
                } else if (m11895a != 18) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    a(bVar.m11898a());
                }
            }
            return this;
        }

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }
    }

    public static final class c extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f373a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f374b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f375c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f376d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f377e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f378f;

        /* renamed from: a, reason: collision with other field name */
        private String f372a = "";
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";

        /* renamed from: a, reason: collision with root package name */
        private int f14532a = -1;

        /* renamed from: a, reason: collision with other method in class */
        public String m12035a() {
            return this.f372a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12036a() {
            return this.f373a;
        }

        public c a(String str) {
            this.f373a = true;
            this.f372a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m12037b() {
            return this.b;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12038b() {
            return this.f374b;
        }

        public c b(String str) {
            this.f374b = true;
            this.b = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12039c() {
            return this.f375c;
        }

        public c c(String str) {
            this.f375c = true;
            this.c = str;
            return this;
        }

        public String d() {
            return this.d;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m12040d() {
            return this.f376d;
        }

        public c d(String str) {
            this.f376d = true;
            this.d = str;
            return this;
        }

        public String e() {
            return this.e;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m12041e() {
            return this.f377e;
        }

        public c e(String str) {
            this.f377e = true;
            this.e = str;
            return this;
        }

        public String f() {
            return this.f;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m12042f() {
            return this.f378f;
        }

        public c f(String str) {
            this.f378f = true;
            this.f = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12036a()) {
                cVar.m11935a(1, m12035a());
            }
            if (m12038b()) {
                cVar.m11935a(2, m12037b());
            }
            if (m12039c()) {
                cVar.m11935a(3, c());
            }
            if (m12040d()) {
                cVar.m11935a(4, d());
            }
            if (m12041e()) {
                cVar.m11935a(5, e());
            }
            if (m12042f()) {
                cVar.m11935a(6, f());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f14532a < 0) {
                b();
            }
            return this.f14532a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12036a() ? com.xiaomi.push.c.a(1, m12035a()) : 0;
            if (m12038b()) {
                a2 += com.xiaomi.push.c.a(2, m12037b());
            }
            if (m12039c()) {
                a2 += com.xiaomi.push.c.a(3, c());
            }
            if (m12040d()) {
                a2 += com.xiaomi.push.c.a(4, d());
            }
            if (m12041e()) {
                a2 += com.xiaomi.push.c.a(5, e());
            }
            if (m12042f()) {
                a2 += com.xiaomi.push.c.a(6, f());
            }
            this.f14532a = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public c a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 10) {
                    a(bVar.m11898a());
                } else if (m11895a == 18) {
                    b(bVar.m11898a());
                } else if (m11895a == 26) {
                    c(bVar.m11898a());
                } else if (m11895a == 34) {
                    d(bVar.m11898a());
                } else if (m11895a == 42) {
                    e(bVar.m11898a());
                } else if (m11895a != 50) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    f(bVar.m11898a());
                }
            }
            return this;
        }
    }

    public static final class d extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f380a;

        /* renamed from: c, reason: collision with other field name */
        private boolean f382c;
        private boolean d;
        private boolean e;

        /* renamed from: b, reason: collision with other field name */
        private boolean f381b = false;

        /* renamed from: a, reason: collision with other field name */
        private String f379a = "";
        private String b = "";
        private String c = "";

        /* renamed from: a, reason: collision with root package name */
        private int f14533a = -1;

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12044a() {
            return this.f381b;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12046b() {
            return this.f380a;
        }

        public d a(boolean z) {
            this.f380a = true;
            this.f381b = z;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m12043a() {
            return this.f379a;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12047c() {
            return this.f382c;
        }

        public d a(String str) {
            this.f382c = true;
            this.f379a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m12045b() {
            return this.b;
        }

        public boolean d() {
            return this.d;
        }

        public d b(String str) {
            this.d = true;
            this.b = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        public boolean e() {
            return this.e;
        }

        public d c(String str) {
            this.e = true;
            this.c = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12046b()) {
                cVar.m11936a(1, m12044a());
            }
            if (m12047c()) {
                cVar.m11935a(2, m12043a());
            }
            if (d()) {
                cVar.m11935a(3, m12045b());
            }
            if (e()) {
                cVar.m11935a(4, c());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f14533a < 0) {
                b();
            }
            return this.f14533a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12046b() ? com.xiaomi.push.c.a(1, m12044a()) : 0;
            if (m12047c()) {
                a2 += com.xiaomi.push.c.a(2, m12043a());
            }
            if (d()) {
                a2 += com.xiaomi.push.c.a(3, m12045b());
            }
            if (e()) {
                a2 += com.xiaomi.push.c.a(4, c());
            }
            this.f14533a = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public d a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 8) {
                    a(bVar.m11901a());
                } else if (m11895a == 18) {
                    a(bVar.m11898a());
                } else if (m11895a == 26) {
                    b(bVar.m11898a());
                } else if (m11895a != 34) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    c(bVar.m11898a());
                }
            }
            return this;
        }

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }
    }

    public static final class j extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f412a;
        private boolean b;

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f410a = com.xiaomi.push.a.f14414a;

        /* renamed from: a, reason: collision with other field name */
        private b f411a = null;

        /* renamed from: a, reason: collision with root package name */
        private int f14539a = -1;

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m12078a() {
            return this.f410a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12080a() {
            return this.f412a;
        }

        public j a(com.xiaomi.push.a aVar) {
            this.f412a = true;
            this.f410a = aVar;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12081b() {
            return this.b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m12079a() {
            return this.f411a;
        }

        public j a(b bVar) {
            bVar.getClass();
            this.b = true;
            this.f411a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12080a()) {
                cVar.m11933a(1, m12078a());
            }
            if (m12081b()) {
                cVar.m11934a(2, (com.xiaomi.push.e) m12079a());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f14539a < 0) {
                b();
            }
            return this.f14539a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12080a() ? com.xiaomi.push.c.a(1, m12078a()) : 0;
            if (m12081b()) {
                a2 += com.xiaomi.push.c.a(2, (com.xiaomi.push.e) m12079a());
            }
            this.f14539a = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public j a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 10) {
                    a(bVar.m11897a());
                } else if (m11895a != 18) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                }
            }
            return this;
        }

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }
    }

    public static final class g extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f402a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f403b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f404c;

        /* renamed from: a, reason: collision with other field name */
        private String f401a = "";
        private String b = "";
        private String c = "";

        /* renamed from: a, reason: collision with root package name */
        private int f14536a = -1;

        /* renamed from: a, reason: collision with other method in class */
        public String m12068a() {
            return this.f401a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12069a() {
            return this.f402a;
        }

        public g a(String str) {
            this.f402a = true;
            this.f401a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m12070b() {
            return this.b;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12071b() {
            return this.f403b;
        }

        public g b(String str) {
            this.f403b = true;
            this.b = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12072c() {
            return this.f404c;
        }

        public g c(String str) {
            this.f404c = true;
            this.c = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12069a()) {
                cVar.m11935a(1, m12068a());
            }
            if (m12071b()) {
                cVar.m11935a(2, m12070b());
            }
            if (m12072c()) {
                cVar.m11935a(3, c());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f14536a < 0) {
                b();
            }
            return this.f14536a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12069a() ? com.xiaomi.push.c.a(1, m12068a()) : 0;
            if (m12071b()) {
                a2 += com.xiaomi.push.c.a(2, m12070b());
            }
            if (m12072c()) {
                a2 += com.xiaomi.push.c.a(3, c());
            }
            this.f14536a = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public g a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 10) {
                    a(bVar.m11898a());
                } else if (m11895a == 18) {
                    b(bVar.m11898a());
                } else if (m11895a != 26) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    c(bVar.m11898a());
                }
            }
            return this;
        }

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }
    }

    public static final class k extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f415a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f418b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean g;

        /* renamed from: a, reason: collision with other field name */
        private String f414a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f417b = "";

        /* renamed from: a, reason: collision with other field name */
        private long f413a = 0;

        /* renamed from: b, reason: collision with other field name */
        private long f416b = 0;
        private boolean f = false;

        /* renamed from: a, reason: collision with root package name */
        private int f14540a = 0;
        private int b = -1;

        /* renamed from: a, reason: collision with other method in class */
        public String m12083a() {
            return this.f414a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12084a() {
            return this.f415a;
        }

        public k a(String str) {
            this.f415a = true;
            this.f414a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m12086b() {
            return this.f417b;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m12087b() {
            return this.f418b;
        }

        public k b(String str) {
            this.f418b = true;
            this.f417b = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public long m12082a() {
            return this.f413a;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m12088c() {
            return this.c;
        }

        public k a(long j) {
            this.c = true;
            this.f413a = j;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public long m12085b() {
            return this.f416b;
        }

        public boolean d() {
            return this.d;
        }

        public k b(long j) {
            this.d = true;
            this.f416b = j;
            return this;
        }

        public boolean e() {
            return this.f;
        }

        public boolean f() {
            return this.e;
        }

        public k a(boolean z) {
            this.e = true;
            this.f = z;
            return this;
        }

        public int c() {
            return this.f14540a;
        }

        public boolean g() {
            return this.g;
        }

        public k a(int i) {
            this.g = true;
            this.f14540a = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12084a()) {
                cVar.m11935a(1, m12083a());
            }
            if (m12087b()) {
                cVar.m11935a(2, m12086b());
            }
            if (m12088c()) {
                cVar.m11932a(3, m12082a());
            }
            if (d()) {
                cVar.m11932a(4, m12085b());
            }
            if (f()) {
                cVar.m11936a(5, e());
            }
            if (g()) {
                cVar.m11931a(6, c());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.b < 0) {
                b();
            }
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12084a() ? com.xiaomi.push.c.a(1, m12083a()) : 0;
            if (m12087b()) {
                a2 += com.xiaomi.push.c.a(2, m12086b());
            }
            if (m12088c()) {
                a2 += com.xiaomi.push.c.a(3, m12082a());
            }
            if (d()) {
                a2 += com.xiaomi.push.c.a(4, m12085b());
            }
            if (f()) {
                a2 += com.xiaomi.push.c.a(5, e());
            }
            if (g()) {
                a2 += com.xiaomi.push.c.a(6, c());
            }
            this.b = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public k a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a == 10) {
                    a(bVar.m11898a());
                } else if (m11895a == 18) {
                    b(bVar.m11898a());
                } else if (m11895a == 24) {
                    a(bVar.m11896a());
                } else if (m11895a == 32) {
                    b(bVar.m11896a());
                } else if (m11895a == 40) {
                    a(bVar.m11901a());
                } else if (m11895a != 48) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    a(bVar.m11904b());
                }
            }
            return this;
        }

        public static k a(byte[] bArr) {
            return (k) new k().a(bArr);
        }
    }

    public static final class i extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f409a;

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f408a = com.xiaomi.push.a.f14414a;

        /* renamed from: a, reason: collision with root package name */
        private int f14538a = -1;

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m12076a() {
            return this.f408a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12077a() {
            return this.f409a;
        }

        public i a(com.xiaomi.push.a aVar) {
            this.f409a = true;
            this.f408a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m12077a()) {
                cVar.m11933a(1, m12076a());
            }
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f14538a < 0) {
                b();
            }
            return this.f14538a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a2 = m12077a() ? com.xiaomi.push.c.a(1, m12076a()) : 0;
            this.f14538a = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        public i a(com.xiaomi.push.b bVar) {
            while (true) {
                int m11895a = bVar.m11895a();
                if (m11895a == 0) {
                    break;
                }
                if (m11895a != 10) {
                    if (!a(bVar, m11895a)) {
                        break;
                    }
                } else {
                    a(bVar.m11897a());
                }
            }
            return this;
        }

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }
    }
}
