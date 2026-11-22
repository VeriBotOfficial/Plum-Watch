package com.baidu.platform.comapi.walknavi.g.i.h;

import android.content.Context;
import android.text.TextUtils;
import com.autonavi.base.amap.mapcore.AeUtil;
import com.baidu.ar.npc.ArBridge;
import com.baidu.platform.comapi.walknavi.g.i.h.e.c;
import com.baidu.platform.comapi.walknavi.g.i.k.i;
import com.facebook.common.util.UriUtil;
import java.io.File;
import java.io.FileFilter;

/* compiled from: SoDownloader.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8731a;
    private c b;
    private InterfaceC0407b c;
    private com.baidu.platform.comapi.walknavi.g.i.h.c d;

    /* compiled from: SoDownloader.java */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().endsWith(".so");
        }
    }

    /* compiled from: SoDownloader.java */
    /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.b$b, reason: collision with other inner class name */
    public interface InterfaceC0407b {
        void a(boolean z, boolean z2);

        void onDownloadProgress(int i);
    }

    public b(Context context) {
        this.f8731a = context;
        this.d = new com.baidu.platform.comapi.walknavi.g.i.h.c(context);
    }

    private void b(String str) {
        a();
        c cVar = new c(this.f8731a, str);
        this.b = cVar;
        cVar.start();
    }

    public boolean c() {
        File[] a2;
        if (b()) {
            return true;
        }
        String c2 = this.d.c();
        if (TextUtils.isEmpty(c2)) {
            return false;
        }
        File file = new File(b(this.f8731a), c2);
        if (!file.exists() || (a2 = a(new File(file, UriUtil.LOCAL_RESOURCE_SCHEME))) == null || a2.length <= 0) {
            return false;
        }
        return b(a2);
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(str) || b()) {
            return false;
        }
        if (!TextUtils.equals(this.d.a(), com.baidu.platform.comapi.walknavi.g.i.k.b.b())) {
            return true;
        }
        String c2 = this.d.c();
        return TextUtils.isEmpty(c2) || !TextUtils.equals(c2, c(str));
    }

    public void e(String str) {
        if (com.baidu.platform.comapi.walknavi.g.i.h.a.a(this.c)) {
            return;
        }
        if (b()) {
            a(true, false);
            return;
        }
        if (!TextUtils.equals(this.d.a(), com.baidu.platform.comapi.walknavi.g.i.k.b.b())) {
            b(str);
            return;
        }
        String c2 = this.d.c();
        String c3 = c(str);
        if (!TextUtils.isEmpty(c2) && TextUtils.equals(c2, c3)) {
            File file = new File(b(this.f8731a), c2);
            if (file.exists()) {
                File[] a2 = a(new File(file, UriUtil.LOCAL_RESOURCE_SCHEME));
                if (a2 != null && a2.length > 0) {
                    a(b(a2), false);
                    return;
                }
                this.d.b("");
            }
        }
        b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(File file) {
        return b(a(file));
    }

    private boolean b(File[] fileArr) {
        if (!a(fileArr)) {
            return false;
        }
        if (fileArr != null) {
            for (File file : fileArr) {
                if (!c(file)) {
                    return false;
                }
            }
        }
        return b();
    }

    public void a(InterfaceC0407b interfaceC0407b) {
        this.c = interfaceC0407b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        InterfaceC0407b interfaceC0407b = this.c;
        if (interfaceC0407b != null) {
            interfaceC0407b.a(z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        InterfaceC0407b interfaceC0407b = this.c;
        if (interfaceC0407b != null) {
            interfaceC0407b.onDownloadProgress(i);
        }
    }

    private File[] a(File file) {
        return file.listFiles(new a());
    }

    private boolean c(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
            String absolutePath = file.getAbsolutePath();
            if (!com.baidu.platform.comapi.walknavi.g.i.h.a.a(absolutePath)) {
                return true;
            }
            System.load(absolutePath);
            return true;
        } catch (Throwable th) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("loadSoFile error: " + th.getMessage());
            return false;
        }
    }

    public void a() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.cancel();
            this.b = null;
        }
    }

    private static boolean a(File[] fileArr) {
        if (fileArr != null && fileArr.length == 1) {
            boolean z = false;
            for (File file : fileArr) {
                if ("libbaiduar.so".equals(file.getName())) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("SoDownloader, Can not found libbaiduar.so");
            return false;
        }
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("SoDownloader, The number of files is not 1");
        return false;
    }

    /* compiled from: SoDownloader.java */
    private class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Context f8733a;
        private String b;
        private volatile boolean c = false;

        /* compiled from: SoDownloader.java */
        class a implements c.InterfaceC0410c {

            /* compiled from: SoDownloader.java */
            /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.b$c$a$a, reason: collision with other inner class name */
            class RunnableC0408a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f8735a;
                final /* synthetic */ long b;

                RunnableC0408a(long j, long j2) {
                    this.f8735a = j;
                    this.b = j2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.a((int) ((this.f8735a * 100.0f) / this.b));
                }
            }

            a() {
            }

            @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.b
            public boolean a() {
                return c.this.b();
            }

            @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.d
            public void a(long j, long j2) {
                i.a(new RunnableC0408a(j, j2));
            }
        }

        /* compiled from: SoDownloader.java */
        /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.b$c$b, reason: collision with other inner class name */
        class RunnableC0409b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f8736a;
            final /* synthetic */ d b;

            RunnableC0409b(boolean z, d dVar) {
                this.f8736a = z;
                this.b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f8736a) {
                    b.this.d.a(com.baidu.platform.comapi.walknavi.g.i.k.b.b());
                    b.this.d.b(this.b.f8738a);
                }
                if (c.this.b()) {
                    return;
                }
                b.this.a(this.f8736a, true);
            }
        }

        public c(Context context, String str) {
            this.f8733a = context;
            this.b = str;
        }

        private boolean a(String str, File file) {
            return com.baidu.platform.comapi.walknavi.g.i.h.e.b.a(str, file, new a());
        }

        public boolean b() {
            return this.c;
        }

        public void cancel() {
            this.c = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            d dVar = new d();
            String str = this.b;
            dVar.b = str;
            dVar.f8738a = b.c(str);
            String str2 = dVar.b;
            File file = new File(b.b(this.f8733a), dVar.f8738a);
            File file2 = new File(file, AeUtil.RESZIPNAME);
            com.baidu.platform.comapi.walknavi.g.i.h.e.a.c(file2);
            boolean a2 = a(str2, file2);
            if (b()) {
                com.baidu.platform.comapi.walknavi.g.i.h.e.a.a(file);
            } else if (a2 && com.baidu.platform.comapi.walknavi.g.i.h.e.d.a(file2, file) && b.this.b(new File(file, UriUtil.LOCAL_RESOURCE_SCHEME))) {
                a(true, dVar);
            } else {
                a(false, (d) null);
            }
        }

        private void a(boolean z, d dVar) {
            i.a(new RunnableC0409b(z, dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File b(Context context) {
        File file = new File(context.getFilesDir(), "baiduarsolib");
        com.baidu.platform.comapi.walknavi.g.i.h.e.a.c(file);
        return file;
    }

    private static boolean b() {
        try {
            return ArBridge.libraryHasLoaded();
        } catch (Throwable th) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("hasLoad() error: " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        int lastIndexOf = str.lastIndexOf(47) + 1;
        int lastIndexOf2 = str.lastIndexOf(46);
        if (lastIndexOf2 != -1) {
            return str.substring(lastIndexOf, lastIndexOf2);
        }
        return str.substring(lastIndexOf);
    }
}
