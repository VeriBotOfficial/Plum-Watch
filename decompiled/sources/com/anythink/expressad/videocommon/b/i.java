package com.anythink.expressad.videocommon.b;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.videocommon.b.h;
import com.anythink.expressad.videocommon.b.j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5521a = "ending_page_source";
    public static final String b = "ending_page_save_time";
    private static final String c = "H5DownLoadManager";
    private static volatile i f;
    private CopyOnWriteArrayList<String> d;
    private ConcurrentMap<String, com.anythink.expressad.videocommon.b.d> e;
    private n g;
    private j h;
    private boolean i = false;

    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    public interface b extends a {
    }

    public interface c {
        void a();

        void a(String str);

        void a(String str, String str2);
    }

    public interface d extends a {
    }

    private i() {
        try {
            this.g = n.a();
            this.h = j.a.f5526a;
            this.d = new CopyOnWriteArrayList<>();
            this.e = new ConcurrentHashMap();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static i a() {
        if (f == null) {
            synchronized (i.class) {
                if (f == null) {
                    f = new i();
                }
            }
        }
        return f;
    }

    public final String a(String str) {
        n nVar = this.g;
        if (nVar != null) {
            return nVar.b(str);
        }
        return null;
    }

    private String c(String str) {
        j jVar = this.h;
        return jVar != null ? jVar.b(str) : str;
    }

    private void b(String str, d dVar) {
        String a2;
        try {
            a2 = this.g.a(str);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!TextUtils.isEmpty(this.g.b(str))) {
                if (dVar != null) {
                    dVar.a(str);
                }
            } else {
                if (this.e.containsKey(a2)) {
                    com.anythink.expressad.videocommon.b.d dVar2 = this.e.get(a2);
                    if (dVar2 != null) {
                        dVar2.a(dVar);
                        return;
                    }
                    return;
                }
                com.anythink.expressad.videocommon.b.d dVar3 = new com.anythink.expressad.videocommon.b.d(this.e, this.g, dVar, str, a2);
                this.e.put(a2, dVar3);
                g.a(str, a2, dVar3);
            }
        } catch (Exception e2) {
            e = e2;
            if (dVar != null) {
                dVar.a(str, "downloadzip failed");
            }
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
    }

    private void d(String str) {
        c(str, null);
    }

    public final void a(String str, a aVar) {
        c(str, aVar);
    }

    private void c(final String str, final a aVar) {
        try {
            if (this.d.contains(str)) {
                return;
            }
            this.d.add(str);
            h.a.f5520a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.i.1
                @Override // com.anythink.expressad.foundation.g.h.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void c() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void a() {
                    if (!TextUtils.isEmpty(i.this.h.c(str))) {
                        i.this.d.remove(str);
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(str);
                            return;
                        }
                        return;
                    }
                    g.a(str, i.this.h.a(str), new c() { // from class: com.anythink.expressad.videocommon.b.i.1.1
                        @Override // com.anythink.expressad.videocommon.b.i.c
                        public final void a() {
                        }

                        @Override // com.anythink.expressad.videocommon.b.i.c
                        public final void a(String str2, String str3) {
                            try {
                                i.this.d.remove(str3);
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                if (i.this.h.a(str3, str2)) {
                                    if (aVar != null) {
                                        aVar.a(str3);
                                    }
                                } else if (aVar != null) {
                                    aVar.a(str3, "save file failed");
                                }
                            } catch (Exception e) {
                                if (com.anythink.expressad.a.f4564a) {
                                    e.printStackTrace();
                                }
                                if (aVar != null) {
                                    aVar.a(str3, e.getMessage());
                                }
                            }
                        }

                        @Override // com.anythink.expressad.videocommon.b.i.c
                        public final void a(String str2) {
                            try {
                                i.this.d.remove(str);
                                if (aVar != null) {
                                    aVar.a(str, str2);
                                }
                            } catch (Exception e) {
                                if (com.anythink.expressad.a.f4564a) {
                                    e.printStackTrace();
                                }
                                if (aVar != null) {
                                    aVar.a(str, str2);
                                }
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f4564a) {
                th.printStackTrace();
            }
        }
    }

    private static String e(String str) {
        try {
            Object b2 = x.b(com.anythink.expressad.foundation.b.a.c().e(), "ending_page_source".concat(String.valueOf(str)), "");
            if (b2 == null || !(b2 instanceof String)) {
                return null;
            }
            String str2 = (String) b2;
            if (y.b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(String str, String str2) {
        try {
            x.a(com.anythink.expressad.foundation.b.a.c().e(), "ending_page_source".concat(String.valueOf(str2)), str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long f(String str) {
        try {
            Object b2 = x.b(com.anythink.expressad.foundation.b.a.c().e(), "ending_page_save_time".concat(String.valueOf(str)), 0L);
            if (b2 != null && (b2 instanceof Long)) {
                return ((Long) b2).longValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }

    private static void g(String str) {
        try {
            x.a(com.anythink.expressad.foundation.b.a.c().e(), "ending_page_save_time".concat(String.valueOf(str)), Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void h(String str) {
        b(str, (a) null);
    }

    public final void b(String str, a aVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        a(str, (d) aVar);
                        return;
                    } else {
                        c(str, aVar);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (aVar != null) {
            aVar.a(str, "The URL does not contain a path ");
        }
    }

    public final String b(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        return a(str);
                    }
                    j jVar = this.h;
                    if (jVar != null) {
                        return jVar.b(str);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private void a(String str, d dVar) {
        String a2;
        try {
            a2 = this.g.a(str);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!TextUtils.isEmpty(this.g.b(str))) {
                if (dVar != null) {
                    dVar.a(str);
                }
            } else {
                if (this.e.containsKey(a2)) {
                    com.anythink.expressad.videocommon.b.d dVar2 = this.e.get(a2);
                    if (dVar2 != null) {
                        dVar2.a(dVar);
                        return;
                    }
                    return;
                }
                com.anythink.expressad.videocommon.b.d dVar3 = new com.anythink.expressad.videocommon.b.d(this.e, this.g, dVar, str, a2);
                this.e.put(a2, dVar3);
                g.a(str, a2, dVar3);
            }
        } catch (Exception e2) {
            e = e2;
            if (dVar != null) {
                dVar.a(str, "downloadzip failed");
            }
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
    }
}
