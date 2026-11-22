package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
final class ng1 implements mg1 {
    private final boolean b;
    private final Handler c;
    private b d;
    private og1 e;
    private m52 f;
    private long g;
    private long h;
    private long i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        public static final b b;
        public static final b c;
        public static final b d;
        private static final /* synthetic */ b[] e;

        static {
            b bVar = new b(0, "INVALIDATED");
            b = bVar;
            b bVar2 = new b(1, "ACTIVE");
            c = bVar2;
            b bVar3 = new b(2, "PAUSED");
            d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            e = bVarArr;
            EnumEntriesKt.enumEntries(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }

        private b(int i, String str) {
        }
    }

    public ng1(boolean z, Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.b = z;
        this.c = handler;
        this.d = b.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ng1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    @Override // com.yandex.mobile.ads.impl.mg1
    public final void invalidate() {
        b bVar = b.b;
        if (bVar == this.d) {
            return;
        }
        this.d = bVar;
        this.e = null;
        this.c.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.mg1
    public final void pause() {
        if (b.c == this.d) {
            this.d = b.d;
            this.c.removeCallbacksAndMessages(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.i;
            this.i = elapsedRealtime;
            long j2 = this.g - j;
            this.g = j2;
            long max = (long) Math.max(0.0d, j2);
            m52 m52Var = this.f;
            if (m52Var != null) {
                m52Var.a(max, this.h - max);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg1
    public final void resume() {
        if (b.d == this.d) {
            a();
        }
    }

    public static final void b(ng1 ng1Var) {
        ng1Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - ng1Var.i;
        ng1Var.i = elapsedRealtime;
        long j2 = ng1Var.g - j;
        ng1Var.g = j2;
        long max = (long) Math.max(0.0d, j2);
        m52 m52Var = ng1Var.f;
        if (m52Var != null) {
            m52Var.a(max, ng1Var.h - max);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg1
    public final void stop() {
        invalidate();
    }

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ng1.b(ng1.this);
            ng1.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.d = b.c;
        this.i = SystemClock.elapsedRealtime();
        long min = (long) Math.min(200.0d, this.g);
        if (min > 0) {
            this.c.postDelayed(new a(), min);
            return;
        }
        og1 og1Var = this.e;
        if (og1Var != null) {
            og1Var.a();
        }
        invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.mg1
    public final void a(m52 m52Var) {
        this.f = m52Var;
    }

    @Override // com.yandex.mobile.ads.impl.mg1
    public final void a(long j, og1 og1Var) {
        invalidate();
        this.e = og1Var;
        this.g = j;
        this.h = j;
        if (this.b) {
            this.c.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.ng1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ng1.c(ng1.this);
                }
            });
        } else {
            a();
        }
    }
}
