package com.bytedance.adsdk.kg;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes13.dex */
public class rlu<T> {
    public static Executor fxn = Executors.newCachedThreadPool();
    private final Set<dgx<Throwable>> gff;
    private final Handler hm;
    private final Set<dgx<T>> kg;
    private volatile mvp<T> rb;

    public rlu(Callable<mvp<T>> callable) {
        this(callable, false);
    }

    rlu(Callable<mvp<T>> callable, boolean z) {
        this.kg = new LinkedHashSet(1);
        this.gff = new LinkedHashSet(1);
        this.hm = new Handler(Looper.getMainLooper());
        this.rb = null;
        if (z) {
            try {
                fxn((mvp) callable.call());
                return;
            } catch (Throwable th) {
                fxn((mvp) new mvp<>(th));
                return;
            }
        }
        fxn.execute(new fxn(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(mvp<T> mvpVar) {
        if (this.rb != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.rb = mvpVar;
        fxn();
    }

    public synchronized rlu<T> fxn(dgx<T> dgxVar) {
        mvp<T> mvpVar = this.rb;
        if (mvpVar != null && mvpVar.fxn() != null) {
            dgxVar.fxn(mvpVar.fxn());
        }
        this.kg.add(dgxVar);
        return this;
    }

    public synchronized rlu<T> kg(dgx<T> dgxVar) {
        this.kg.remove(dgxVar);
        return this;
    }

    public synchronized rlu<T> gff(dgx<Throwable> dgxVar) {
        mvp<T> mvpVar = this.rb;
        if (mvpVar != null && mvpVar.kg() != null) {
            dgxVar.fxn(mvpVar.kg());
        }
        this.gff.add(dgxVar);
        return this;
    }

    public synchronized rlu<T> hm(dgx<Throwable> dgxVar) {
        this.gff.remove(dgxVar);
        return this;
    }

    private void fxn() {
        this.hm.post(new Runnable() { // from class: com.bytedance.adsdk.kg.rlu.1
            @Override // java.lang.Runnable
            public void run() {
                mvp mvpVar = rlu.this.rb;
                if (mvpVar == null) {
                    return;
                }
                if (mvpVar.fxn() != null) {
                    rlu.this.fxn((rlu) mvpVar.fxn());
                } else {
                    rlu.this.fxn(mvpVar.kg());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fxn(T t) {
        Iterator it = new ArrayList(this.kg).iterator();
        while (it.hasNext()) {
            ((dgx) it.next()).fxn(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fxn(Throwable th) {
        ArrayList arrayList = new ArrayList(this.gff);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dgx) it.next()).fxn(th);
        }
    }

    private class fxn extends FutureTask<mvp<T>> {
        fxn(Callable<mvp<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                rlu.this.fxn((mvp) get());
            } catch (InterruptedException | ExecutionException e) {
                rlu.this.fxn(new mvp(e));
            }
        }
    }
}
