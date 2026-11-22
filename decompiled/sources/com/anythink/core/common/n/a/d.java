package com.anythink.core.common.n.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes12.dex */
public abstract class d implements i {

    /* renamed from: a, reason: collision with root package name */
    protected final long f4037a;
    protected final int b;
    private final int e;
    private final String f;

    abstract e a(a aVar, String str, String str2, int i);

    private d(String str) {
        this(str, (byte) 0);
    }

    private d(String str, byte b) {
        this(str, 53, 500L);
    }

    public d(String str, int i, long j) {
        this(str, i, j, 1);
    }

    public d(String str, int i, long j, int i2) {
        this.f = str;
        this.b = i;
        this.f4037a = j <= 0 ? 500L : j;
        this.e = i2;
    }

    @Override // com.anythink.core.common.n.a.i
    public final l[] a(h hVar) {
        String str = hVar.f4044a;
        int i = this.e;
        if (TextUtils.isEmpty(this.f)) {
            throw new IllegalArgumentException("server can not empty");
        }
        if (str != null && !str.isEmpty()) {
            List<l> a2 = a(new a(), this.f, str, i).a();
            if (a2 == null || a2.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (l lVar : a2) {
                if (lVar.a() || lVar.h == 5 || lVar.b() || lVar.h == this.e) {
                    arrayList.add(lVar);
                }
            }
            return (l[]) arrayList.toArray(new l[0]);
        }
        throw new IllegalArgumentException("host can not empty");
    }

    @Override // com.anythink.core.common.n.a.i
    public final f a() {
        return new f(this.f, this.b, this.f4037a);
    }

    private e a(String str) {
        int i = this.e;
        if (TextUtils.isEmpty(this.f)) {
            throw new IllegalArgumentException("server can not empty");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("host can not empty");
        }
        return a(new a(), this.f, str, i);
    }

    private e a(String str, int i) {
        if (TextUtils.isEmpty(this.f)) {
            throw new IllegalArgumentException("server can not empty");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("host can not empty");
        }
        return a(new a(), this.f, str, i);
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        Queue<Runnable> f4038a = new ConcurrentLinkedQueue();

        a() {
        }

        private void a(Runnable runnable) {
            this.f4038a.add(runnable);
        }

        private void a() {
            for (Runnable runnable : this.f4038a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
