package com.amap.api.col.p0003sl;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.io.File;

/* compiled from: UnZipFile.java */
/* loaded from: classes11.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    private b f1944a;

    /* compiled from: UnZipFile.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1945a = false;
    }

    /* compiled from: UnZipFile.java */
    public interface c {
    }

    public w2(s2 s2Var, y2 y2Var) {
        this.f1944a = new b(s2Var, y2Var);
    }

    public void a() {
        b bVar = this.f1944a;
        if (bVar == null || bVar == null) {
            return;
        }
        y2 e = bVar.e();
        if (e != null) {
            e.a();
        }
        String f = bVar.f();
        String b2 = bVar.b();
        if (TextUtils.isEmpty(f) || TextUtils.isEmpty(b2)) {
            if (bVar.d().f1945a) {
                if (e != null) {
                    e.c();
                    return;
                }
                return;
            } else {
                if (e != null) {
                    e.e();
                    return;
                }
                return;
            }
        }
        File file = new File(f);
        if (!file.exists()) {
            if (bVar.d().f1945a) {
                if (e != null) {
                    e.c();
                    return;
                }
                return;
            } else {
                if (e != null) {
                    e.e();
                    return;
                }
                return;
            }
        }
        File file2 = new File(b2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        v2 v2Var = new v2(e);
        try {
            if (bVar.d().f1945a && e != null) {
                e.c();
            }
            a(file, file2, v2Var, bVar);
            if (bVar.d().f1945a) {
                if (e != null) {
                    e.c();
                }
            } else if (e != null) {
                e.a(bVar.c());
            }
        } catch (Throwable unused) {
            if (bVar.d().f1945a) {
                if (e != null) {
                    e.c();
                }
            } else if (e != null) {
                e.e();
            }
        }
    }

    public void b() {
        b bVar = this.f1944a;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* compiled from: UnZipFile.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f1946a;
        private String b;
        private y2 c;
        private a d = new a();
        private String e;

        public b(s2 s2Var, y2 y2Var) {
            this.c = null;
            this.f1946a = s2Var.b();
            this.b = s2Var.h();
            this.c = y2Var;
        }

        public void a(String str) {
            if (str.length() > 1) {
                this.e = str;
            }
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.e;
        }

        public a d() {
            return this.d;
        }

        public y2 e() {
            return this.c;
        }

        public String f() {
            return this.f1946a;
        }

        public void a() {
            this.d.f1945a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0161 A[EDGE_INSN: B:72:0x0161->B:22:0x0161 BREAK  A[LOOP:1: B:15:0x009d->B:37:0x015b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.io.File r20, java.io.File r21, com.amap.api.col.3sl.w2.c r22, com.amap.api.col.3sl.w2.b r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.w2.a(java.io.File, java.io.File, com.amap.api.col.3sl.w2$c, com.amap.api.col.3sl.w2$b):void");
    }

    private static boolean a(String str) {
        return (str.contains("..") || str.contains("/") || str.contains("\\") || str.contains(Separators.PERCENT)) ? false : true;
    }

    private static void a(File file) {
        File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        a(parentFile);
        parentFile.mkdir();
    }
}
