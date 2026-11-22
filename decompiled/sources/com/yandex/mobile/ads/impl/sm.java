package com.yandex.mobile.ads.impl;

import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface sm {

    public interface b {
        void a(fn fnVar);

        void a(sm smVar, fn fnVar);

        void a(sm smVar, fn fnVar, fn fnVar2);
    }

    File a(String str, long j, long j2) throws a;

    void a(fn fnVar);

    void a(File file, long j) throws a;

    void a(String str);

    void a(String str, es esVar) throws a;

    long b(String str, long j, long j2);

    nz b(String str);

    void b(fn fnVar);

    fn c(String str, long j, long j2) throws a;

    long d(String str, long j, long j2);

    fn e(String str, long j, long j2) throws InterruptedException, a;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }

        public a(Throwable th) {
            super(th);
        }
    }
}
