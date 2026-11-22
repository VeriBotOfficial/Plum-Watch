package com.baidu.platform.comapi.walknavi.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.platform.comapi.walknavi.g.i.h.b;
import com.baidu.platform.comapi.walknavi.g.i.j.e;
import com.baidu.platform.comapi.walknavi.g.i.k.f;
import com.baidu.platform.comapi.walknavi.g.i.k.g;
import java.io.File;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* compiled from: ARDownloader.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8721a = true;
    private Context b;
    private com.baidu.platform.comapi.walknavi.g.i.a c;
    private com.baidu.platform.comapi.walknavi.g.i.j.b d;
    private c f;
    private C0406b g;
    private com.baidu.platform.comapi.walknavi.g.i.e.b i;
    private com.baidu.platform.comapi.walknavi.g.i.h.b l;
    private com.baidu.platform.comapi.walknavi.g.i.d m;
    private com.baidu.platform.comapi.walknavi.g.i.j.c e = null;
    private com.baidu.platform.comapi.walknavi.g.i.e.a h = new com.baidu.platform.comapi.walknavi.g.i.e.a();
    private d j = d.INITIAL_STATE;
    private boolean k = false;

    /* compiled from: ARDownloader.java */
    class a implements b.InterfaceC0407b {
        a() {
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.b.InterfaceC0407b
        public void a(boolean z, boolean z2) {
            b.this.k = z2;
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("download so finished");
            if (z) {
                b.this.d();
            } else {
                b.this.g.a("download so failed");
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.b.InterfaceC0407b
        public void onDownloadProgress(int i) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("so progress: " + i);
            b.this.g.a(i / 2);
        }
    }

    /* compiled from: ARDownloader.java */
    private enum d {
        INITIAL_STATE,
        QUERYING,
        DOWNLOADING,
        DOWNLOAD_FINISHED
    }

    public b(Context context) {
        this.b = context;
        this.l = new com.baidu.platform.comapi.walknavi.g.i.h.b(context);
        this.m = new com.baidu.platform.comapi.walknavi.g.i.d(this.b);
        f.b(this.b.getPackageName());
    }

    private void h() {
        com.baidu.platform.comapi.walknavi.g.i.a aVar;
        d dVar = this.j;
        if (dVar == d.INITIAL_STATE || dVar == d.DOWNLOAD_FINISHED) {
            a(this.h);
            return;
        }
        if (dVar == d.QUERYING) {
            com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.a(7, "query in progress");
                return;
            }
            return;
        }
        if (dVar != d.DOWNLOADING || (aVar = this.c) == null) {
            return;
        }
        aVar.a(8, "download in progress");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.d = e.a(this.i.d(), this.i.f(), this.i.e(), com.baidu.platform.comapi.walknavi.g.i.k.d.d, this.g);
    }

    private void e() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("download start");
        com.baidu.platform.comapi.walknavi.g.i.e.b bVar = this.i;
        if (bVar == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("ERROR!! bundle data is null");
        } else if (TextUtils.isEmpty(bVar.a())) {
            this.g.a("so url is null");
        } else {
            this.l.a(new a());
            this.l.e(bVar.a());
        }
    }

    private void f() {
        com.baidu.platform.comapi.walknavi.g.i.e.b bVar = this.i;
        if (bVar == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("ERROR!! mARResource is null");
        } else {
            if (TextUtils.isEmpty(bVar.e())) {
                return;
            }
            this.j = d.DOWNLOADING;
            this.g = new C0406b(this);
            e();
        }
    }

    public void b(String str, com.baidu.platform.comapi.walknavi.g.i.a aVar) {
        c();
        f8721a = true;
        this.h.a(str);
        this.h.a(4);
        this.c = aVar;
        if (g.a(this.b) != null) {
            h();
            return;
        }
        com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.a(1, "no network");
        }
    }

    public void c() {
        b();
        a();
    }

    public boolean g() {
        return this.l.c();
    }

    /* compiled from: ARDownloader.java */
    private static class c implements com.baidu.platform.comapi.walknavi.g.i.j.f<JSONObject> {

        /* renamed from: a, reason: collision with root package name */
        private SoftReference<b> f8724a;

        public c(b bVar) {
            this.f8724a = new SoftReference<>(bVar);
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(JSONObject jSONObject) {
            try {
                if (this.f8724a.get() != null) {
                    this.f8724a.get().a(jSONObject);
                }
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("query onResponse exception: " + e.getMessage());
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        public void a(String str) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("http error msg = " + str);
            try {
                if (this.f8724a.get() != null) {
                    this.f8724a.get().j = d.INITIAL_STATE;
                    if (this.f8724a.get().c != null) {
                        this.f8724a.get().c.a(5, str);
                    }
                    this.f8724a.get().e = null;
                }
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("query onErrorResponse exception: " + e.getMessage());
            }
        }

        public void a() {
            try {
                if (this.f8724a.get() != null) {
                    this.f8724a.get().j = d.INITIAL_STATE;
                }
                this.f8724a.clear();
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("query destroy exception: " + e.getMessage());
            }
        }
    }

    public void a(String str, com.baidu.platform.comapi.walknavi.g.i.a aVar) {
        c();
        f8721a = false;
        this.h.a(str);
        this.h.a(4);
        this.c = aVar;
        if (g.a(this.b) != null) {
            h();
            return;
        }
        com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.a(1, "no network");
        }
    }

    /* compiled from: ARDownloader.java */
    /* renamed from: com.baidu.platform.comapi.walknavi.g.i.b$b, reason: collision with other inner class name */
    private static class C0406b implements com.baidu.platform.comapi.walknavi.g.i.j.a<String> {

        /* renamed from: a, reason: collision with root package name */
        private SoftReference<b> f8723a;

        public C0406b(b bVar) {
            this.f8723a = new SoftReference<>(bVar);
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        public void a(String str) {
            try {
                if (this.f8723a.get() != null) {
                    this.f8723a.get().j = d.DOWNLOAD_FINISHED;
                    if (this.f8723a.get().c != null) {
                        this.f8723a.get().c.a(6, str);
                    }
                }
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onErrorResponse exception: " + e.getMessage());
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(String str) {
            try {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download res finished");
                if (this.f8723a.get() != null) {
                    this.f8723a.get().j = d.DOWNLOAD_FINISHED;
                    if (this.f8723a.get().c != null) {
                        this.f8723a.get().c.a(0, str);
                        if (this.f8723a.get().i != null) {
                            this.f8723a.get().m.a(this.f8723a.get().i.d(), str);
                        }
                    }
                }
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onResponse exception: " + e.getMessage());
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.a
        public void a(int i) {
            try {
                if (this.f8723a.get() == null || this.f8723a.get().c == null) {
                    return;
                }
                this.f8723a.get().c.a(b(i));
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onProgress exception: " + e.getMessage());
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.a
        public void a(boolean z, float f) {
            try {
                if (this.f8723a.get() != null) {
                    this.f8723a.get().j = d.DOWNLOAD_FINISHED;
                    if (this.f8723a.get().c != null) {
                        com.baidu.platform.comapi.walknavi.g.i.k.a.a("isUpdate=" + z + ", size=" + f);
                        if (this.f8723a.get().l != null && this.f8723a.get().i != null && this.f8723a.get().l.d(this.f8723a.get().i.a())) {
                            z = true;
                        }
                        this.f8723a.get().c.a(z, f);
                    }
                }
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onUpdate exception: " + e.getMessage());
            }
        }

        private int b(int i) {
            return (this.f8723a.get() == null || !this.f8723a.get().k) ? i : (i / 2) + 50;
        }

        public void a() {
            try {
                if (this.f8723a.get() != null) {
                    this.f8723a.get().j = d.INITIAL_STATE;
                }
                this.f8723a.clear();
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download destroy exception: " + e.getMessage());
            }
        }
    }

    private void b() {
        com.baidu.platform.comapi.walknavi.g.i.j.c cVar = this.e;
        if (cVar != null) {
            cVar.a();
            this.e = null;
        }
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.a();
        }
    }

    public String a(String str) {
        if (this.l.c()) {
            return this.m.a(str);
        }
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("so not loaded");
        return "";
    }

    public boolean a(String str, boolean z) {
        File[] listFiles;
        if (z) {
            File file = new File(f.a(str, 4));
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                String a2 = a(str);
                for (int i = 0; i < listFiles.length; i++) {
                    File file2 = listFiles[i];
                    if (file2 != null && !file2.getAbsolutePath().contains(a2)) {
                        f.a(new File(listFiles[i].getAbsolutePath()));
                    }
                }
            }
            return true;
        }
        return f.a(new File(f.a(str, 4)));
    }

    private void a(com.baidu.platform.comapi.walknavi.g.i.e.a aVar) {
        this.j = d.QUERYING;
        c cVar = new c(this);
        this.f = cVar;
        com.baidu.platform.comapi.walknavi.g.i.j.c a2 = e.a(this.b, aVar, cVar);
        this.e = a2;
        if (a2 == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("Http Request Occur Error! Please Check");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        com.baidu.platform.comapi.walknavi.g.i.a aVar;
        if (jSONObject != null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("AR query response: " + jSONObject.toString());
        } else {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("AR query response is null");
        }
        com.baidu.platform.comapi.walknavi.g.i.e.b a2 = com.baidu.platform.comapi.walknavi.g.i.g.a.a(jSONObject);
        this.i = a2;
        if (a2 == null && (aVar = this.c) != null) {
            aVar.a(-1, "ar resource is null");
        }
        if (this.i.b() != 0) {
            this.j = d.INITIAL_STATE;
            int b = this.i.b();
            if (b == 1051) {
                com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.a(3, this.i.c());
                }
            } else if (b != 1052) {
                com.baidu.platform.comapi.walknavi.g.i.a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.a(-1, this.i.c());
                }
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("error code = " + this.i.b() + ", error msg = " + this.i.c());
            } else {
                com.baidu.platform.comapi.walknavi.g.i.a aVar4 = this.c;
                if (aVar4 != null) {
                    aVar4.a(4, this.i.c());
                }
            }
            this.e = null;
            return;
        }
        if (!this.i.h() && this.i.g()) {
            this.e = null;
            f();
            return;
        }
        this.j = d.INITIAL_STATE;
        com.baidu.platform.comapi.walknavi.g.i.a aVar5 = this.c;
        if (aVar5 != null) {
            aVar5.a(2, "not support AR");
        }
        this.e = null;
    }

    private void a() {
        com.baidu.platform.comapi.walknavi.g.i.j.b bVar = this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        C0406b c0406b = this.g;
        if (c0406b != null) {
            c0406b.a();
        }
        com.baidu.platform.comapi.walknavi.g.i.h.b bVar2 = this.l;
        if (bVar2 != null) {
            bVar2.a();
        }
    }
}
