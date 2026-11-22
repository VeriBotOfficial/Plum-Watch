package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bo;
import com.yandex.mobile.ads.impl.sy;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes5.dex */
abstract class bo implements o32 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f15127a = new ArrayDeque<>();
    private final ArrayDeque<s32> b;
    private final PriorityQueue<a> c;
    private a d;
    private long e;
    private long f;

    protected abstract void b(r32 r32Var);

    protected abstract n32 c();

    protected abstract boolean h();

    @Override // com.yandex.mobile.ads.impl.oy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(r32 r32Var) throws p32 {
        if (r32Var != this.d) {
            throw new IllegalArgumentException();
        }
        a aVar = (a) r32Var;
        if (aVar.e()) {
            aVar.b();
            this.f15127a.add(aVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            aVar.k = j;
            this.c.add(aVar);
        }
        this.d = null;
    }

    public bo() {
        for (int i = 0; i < 10; i++) {
            this.f15127a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new b(new sy.a() { // from class: com.yandex.mobile.ads.impl.bo$$ExternalSyntheticLambda0
                @Override // com.yandex.mobile.ads.impl.sy.a
                public final void a(sy syVar) {
                    bo.this.a((bo.b) syVar);
                }
            }));
        }
        this.c = new PriorityQueue<>();
    }

    @Override // com.yandex.mobile.ads.impl.oy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r32 b() throws p32 {
        if (this.d == null) {
            if (this.f15127a.isEmpty()) {
                return null;
            }
            a pollFirst = this.f15127a.pollFirst();
            this.d = pollFirst;
            return pollFirst;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.oy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public s32 a() throws p32 {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty()) {
            a peek = this.c.peek();
            int i = f92.f15466a;
            if (peek.f > this.e) {
                break;
            }
            a poll = this.c.poll();
            if (poll.f()) {
                s32 pollFirst = this.b.pollFirst();
                pollFirst.b(4);
                poll.b();
                this.f15127a.add(poll);
                return pollFirst;
            }
            b(poll);
            if (h()) {
                n32 c = c();
                s32 pollFirst2 = this.b.pollFirst();
                pollFirst2.a(poll.f, c, Long.MAX_VALUE);
                poll.b();
                this.f15127a.add(poll);
                return pollFirst2;
            }
            poll.b();
            this.f15127a.add(poll);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.oy
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            a poll = this.c.poll();
            int i = f92.f15466a;
            poll.b();
            this.f15127a.add(poll);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.b();
            this.f15127a.add(aVar);
            this.d = null;
        }
    }

    protected final s32 f() {
        return this.b.pollFirst();
    }

    protected final void a(s32 s32Var) {
        s32Var.b();
        this.b.add(s32Var);
    }

    protected final long g() {
        return this.e;
    }

    private static final class a extends r32 implements Comparable<a> {
        private long k;

        private a() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (f() != aVar2.f()) {
                return f() ? 1 : -1;
            }
            long j = this.f - aVar2.f;
            if (j == 0) {
                j = this.k - aVar2.k;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends s32 {
        private sy.a<b> f;

        public b(sy.a<b> aVar) {
            this.f = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.sy
        public final void h() {
            this.f.a(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.o32
    public void a(long j) {
        this.e = j;
    }
}
