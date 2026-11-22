package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l42;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k42 {

    /* renamed from: a, reason: collision with root package name */
    private final l42 f15982a;
    private final String b;
    private boolean c;
    private h42 d;
    private final ArrayList e;
    private boolean f;

    public k42(l42 taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15982a = taskRunner;
        this.b = name;
        this.e = new ArrayList();
    }

    public final void a(h42 task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f15982a) {
            if (!this.c) {
                if (a(task, j, false)) {
                    this.f15982a.a(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.a()) {
                l42 l42Var = l42.h;
                if (l42.i.isLoggable(Level.FINE)) {
                    i42.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                l42 l42Var2 = l42.h;
                if (l42.i.isLoggable(Level.FINE)) {
                    i42.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void j() {
        if (g92.f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f15982a) {
            this.c = true;
            if (b()) {
                this.f15982a.a(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final ArrayList e() {
        return this.e;
    }

    public final void i() {
        this.f = false;
    }

    public final l42 h() {
        return this.f15982a;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }

    public final h42 c() {
        return this.d;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean b() {
        h42 h42Var = this.d;
        if (h42Var != null) {
            Intrinsics.checkNotNull(h42Var);
            if (h42Var.a()) {
                this.f = true;
            }
        }
        boolean z = false;
        for (int size = this.e.size() - 1; -1 < size; size--) {
            if (((h42) this.e.get(size)).a()) {
                h42 h42Var2 = (h42) this.e.get(size);
                if (l42.i.isLoggable(Level.FINE)) {
                    i42.b(h42Var2, this, "canceled");
                }
                this.e.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        return this.b;
    }

    public final boolean a(h42 task, long j, boolean z) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.a(this);
        long a2 = this.f15982a.d().a();
        long j2 = a2 + j;
        int indexOf = this.e.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j2) {
                l42 l42Var = l42.h;
                if (l42.b.a().isLoggable(Level.FINE)) {
                    i42.b(task, this, "already scheduled");
                }
                return false;
            }
            this.e.remove(indexOf);
        }
        task.a(j2);
        l42 l42Var2 = l42.h;
        if (l42.b.a().isLoggable(Level.FINE)) {
            i42.b(task, this, z ? "run again after " + i42.a(j2 - a2) : "scheduled after " + i42.a(j2 - a2));
        }
        Iterator it = this.e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((h42) it.next()).c() - a2 > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.e.size();
        }
        this.e.add(i, task);
        return i == 0;
    }

    public final void a(h42 h42Var) {
        this.d = h42Var;
    }

    public final void a() {
        if (g92.f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f15982a) {
            if (b()) {
                this.f15982a.a(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
