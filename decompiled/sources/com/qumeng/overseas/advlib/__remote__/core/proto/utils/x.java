package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public class x {

    public static abstract class a<T> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private T[] f12866a;

        public a(T... tArr) {
            if (tArr != null) {
                this.f12866a = tArr;
            }
        }

        protected T[] a() {
            return this.f12866a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            run(this.f12866a);
        }

        public abstract void run(T[] tArr);

        protected void a(T... tArr) {
            this.f12866a = tArr;
        }
    }

    public static abstract class c implements Runnable {
        public abstract void Run();

        @Override // java.lang.Runnable
        public void run() {
            try {
                Run();
            } catch (Throwable th) {
                th.printStackTrace();
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_ICliUtils_SafeRunnable", th);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private List<Runnable> f12867a;

        public b(Runnable... runnableArr) {
            this.f12867a = null;
            this.f12867a = new ArrayList(Arrays.asList(runnableArr));
        }

        public void append(Runnable runnable) {
            this.f12867a.add(runnable);
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<Runnable> it = this.f12867a.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public b() {
            this.f12867a = null;
            this.f12867a = new ArrayList();
        }
    }
}
