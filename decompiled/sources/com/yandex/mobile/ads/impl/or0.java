package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class or0 implements zm {

    /* renamed from: a, reason: collision with root package name */
    private final long f16480a;
    private final TreeSet<fn> b = new TreeSet<>(new Comparator() { // from class: com.yandex.mobile.ads.impl.or0$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a2;
            a2 = or0.a((fn) obj, (fn) obj2);
            return a2;
        }
    });
    private long c;

    public or0(long j) {
        this.f16480a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(fn fnVar, fn fnVar2) {
        long j = fnVar.g;
        long j2 = fnVar2.g;
        if (j - j2 != 0) {
            return j < j2 ? -1 : 1;
        }
        if (!fnVar.b.equals(fnVar2.b)) {
            return fnVar.b.compareTo(fnVar2.b);
        }
        long j3 = fnVar.c - fnVar2.c;
        if (j3 == 0) {
            return 0;
        }
        return j3 < 0 ? -1 : 1;
    }

    @Override // com.yandex.mobile.ads.impl.sm.b
    public final void a(sm smVar, fn fnVar) {
        this.b.add(fnVar);
        this.c += fnVar.d;
        while (this.c > this.f16480a && !this.b.isEmpty()) {
            smVar.a(this.b.first());
        }
    }

    @Override // com.yandex.mobile.ads.impl.sm.b
    public final void a(fn fnVar) {
        this.b.remove(fnVar);
        this.c -= fnVar.d;
    }

    @Override // com.yandex.mobile.ads.impl.sm.b
    public final void a(sm smVar, fn fnVar, fn fnVar2) {
        a(fnVar);
        a(smVar, fnVar2);
    }

    @Override // com.yandex.mobile.ads.impl.zm
    public final void a(sm smVar, long j) {
        if (j != -1) {
            while (this.c + j > this.f16480a && !this.b.isEmpty()) {
                smVar.a(this.b.first());
            }
        }
    }
}
