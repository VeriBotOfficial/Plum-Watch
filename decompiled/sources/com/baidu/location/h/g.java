package com.baidu.location.h;

import android.os.Looper;
import com.baidu.location.b.r;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes13.dex */
public abstract class g {
    public static int eg = com.baidu.location.h.a.f;
    protected static int et = 0;
    public String eh = null;
    public int ei = 1;
    public String ej = null;
    public byte[] ek = null;
    public Map<String, Object> el = null;
    public String em = null;
    public byte[] en = null;
    public byte[] eo = null;
    public String ep = null;
    public boolean eq = false;
    public String er = null;
    public long es = 0;

    private static class a implements HostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        private HttpsURLConnection f7727a;

        public a(HttpsURLConnection httpsURLConnection) {
            this.f7727a = httpsURLConnection;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            String requestProperty = this.f7727a.getRequestProperty("Host");
            if (requestProperty == null) {
                requestProperty = this.f7727a.getURL().getHost();
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(requestProperty, sSLSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        r a2;
        String str2;
        b();
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.er != null) {
            a2 = r.a();
            str2 = this.er;
        } else {
            a2 = r.a();
            str2 = null;
        }
        a2.a(str2);
        r.a().a(this.el, str, new r.a() { // from class: com.baidu.location.h.g.2
            @Override // com.baidu.location.b.r.a
            public void a(int i, String str3) {
                g.this.ej = null;
                g.this.a(false);
            }

            @Override // com.baidu.location.b.r.a
            public void a(int i, String str3, byte[] bArr) {
                g gVar;
                boolean z;
                if (i == 200) {
                    g.this.es = System.currentTimeMillis() - currentTimeMillis;
                    g.this.ej = str3;
                    g.this.ek = bArr;
                    gVar = g.this;
                    z = true;
                } else {
                    g.this.ej = null;
                    gVar = g.this;
                    z = false;
                }
                gVar.a(z);
            }
        });
    }

    public void a(ExecutorService executorService) {
        try {
            executorService.execute(new Runnable() { // from class: com.baidu.location.h.g.3
                /* JADX WARN: Removed duplicated region for block: B:36:0x010e A[LOOP:0: B:2:0x0011->B:36:0x010e, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x012e A[EDGE_INSN: B:37:0x012e->B:38:0x012e BREAK  A[LOOP:0: B:2:0x0011->B:36:0x010e], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:87:? A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:88:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 322
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.g.AnonymousClass3.run():void");
                }
            });
        } catch (Throwable unused) {
            a(false);
        }
    }

    public void a(ExecutorService executorService, final String str) {
        try {
            executorService.execute(new Runnable() { // from class: com.baidu.location.h.g.9
                /* JADX WARN: Removed duplicated region for block: B:106:0x01ec  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:116:? A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:117:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:121:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 523
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.g.AnonymousClass9.run():void");
                }
            });
        } catch (Throwable unused) {
            a(false);
        }
    }

    public void a(ExecutorService executorService, final boolean z, final String str) {
        try {
            executorService.execute(new Runnable() { // from class: com.baidu.location.h.g.4
                /* JADX WARN: Removed duplicated region for block: B:102:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:108:? A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:109:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:113:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:120:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x01cc A[Catch: Exception -> 0x01d0, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x01d0, blocks: (B:83:0x01a7, B:124:0x01cc), top: B:82:0x01a7 }] */
                /* JADX WARN: Removed duplicated region for block: B:125:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:129:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x01d7 A[LOOP:0: B:2:0x001c->B:52:0x01d7, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x01ff A[EDGE_INSN: B:53:0x01ff->B:54:0x01ff BREAK  A[LOOP:0: B:2:0x001c->B:52:0x01d7], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 534
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.g.AnonymousClass4.run():void");
                }
            });
        } catch (Throwable unused) {
            a(false);
        }
    }

    public abstract void a(boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.baidu.location.h.g$5] */
    public void a(final boolean z, final String str) {
        try {
            new Thread() { // from class: com.baidu.location.h.g.5
                /* JADX WARN: Removed duplicated region for block: B:102:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:108:? A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:109:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:113:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:120:0x01c3  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x01da A[Catch: Exception -> 0x01de, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x01de, blocks: (B:83:0x01b5, B:124:0x01da), top: B:82:0x01b5 }] */
                /* JADX WARN: Removed duplicated region for block: B:125:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:129:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x01e5 A[LOOP:0: B:2:0x001c->B:52:0x01e5, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x020d A[EDGE_INSN: B:53:0x020d->B:54:0x020d BREAK  A[LOOP:0: B:2:0x001c->B:52:0x01e5], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:77:0x019e  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:98:0x01ee  */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 548
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.g.AnonymousClass5.run():void");
                }
            }.start();
        } catch (Throwable unused) {
            a(false);
        }
    }

    public abstract void b();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.baidu.location.h.g$1] */
    public void c(final boolean z) {
        try {
            new Thread() { // from class: com.baidu.location.h.g.1
                /* JADX WARN: Removed duplicated region for block: B:44:0x0152 A[LOOP:0: B:2:0x0011->B:44:0x0152, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0156 A[EDGE_INSN: B:45:0x0156->B:46:0x0156 BREAK  A[LOOP:0: B:2:0x0011->B:44:0x0152], SYNTHETIC] */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 362
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.g.AnonymousClass1.run():void");
                }
            }.start();
        } catch (Throwable unused) {
            a(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.baidu.location.h.g$8] */
    public void e(final String str) {
        if (com.baidu.location.b.c.a().ds == 1) {
            (Looper.getMainLooper().getThread() == Thread.currentThread() ? new Thread(new Runnable() { // from class: com.baidu.location.h.g.6
                @Override // java.lang.Runnable
                public void run() {
                    g.this.a(str);
                }
            }) : new Thread(new Runnable() { // from class: com.baidu.location.h.g.7
                @Override // java.lang.Runnable
                public void run() {
                    g.this.a(str);
                }
            })).start();
            return;
        }
        try {
            new Thread() { // from class: com.baidu.location.h.g.8
                /* JADX WARN: Removed duplicated region for block: B:106:0x021f  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:116:? A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:117:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:121:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
                /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:77:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01ff  */
                /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:89:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r6v1, types: [long] */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v13 */
                /* JADX WARN: Type inference failed for: r6v18 */
                /* JADX WARN: Type inference failed for: r6v6 */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 574
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.g.AnonymousClass8.run():void");
                }
            }.start();
        } catch (Throwable unused) {
            a(false);
        }
    }
}
