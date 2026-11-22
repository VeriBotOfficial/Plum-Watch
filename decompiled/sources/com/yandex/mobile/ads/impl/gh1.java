package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.yandex.mobile.ads.impl.ms0;
import com.yandex.mobile.ads.impl.pw1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gh1 extends BroadcastReceiver {
    public static final a h = new a(0);
    private static volatile gh1 i;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15592a;
    private final pw1 b;
    private final fh1 c;
    private final eh1 d;
    private final WeakHashMap<b, Object> e;
    private final Object f;
    private dh1 g;

    public interface b {
        void a(dh1 dh1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gh1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dh1 a2 = this$0.c.a();
        this$0.g = a2;
        String str = "Initial phone state: " + a2;
        sp0.d(new Object[0]);
        try {
            this$0.d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                this$0.f15592a.registerReceiver(this$0, intentFilter, 2);
            } else {
                this$0.f15592a.registerReceiver(this$0, intentFilter);
            }
        } catch (Exception unused) {
            Object[] args = new Object[0];
            int i2 = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dh1 dh1Var;
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        synchronized (this.f) {
            dh1 dh1Var2 = this.g;
            String action = intent.getAction();
            dh1 dh1Var3 = Intrinsics.areEqual(action, "android.intent.action.SCREEN_OFF") ? dh1.c : Intrinsics.areEqual(action, "android.intent.action.USER_PRESENT") ? dh1.d : (this.g == dh1.d || !Intrinsics.areEqual(action, "android.intent.action.SCREEN_ON")) ? this.g : dh1.b;
            this.g = dh1Var3;
            if (dh1Var2 != dh1Var3) {
                String str = "Phone state has changed: " + dh1Var3;
                sp0.d(new Object[0]);
            }
            dh1Var = this.g;
            hashSet = new HashSet(this.e.keySet());
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(dh1Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* synthetic */ gh1(Context context, Executor executor) {
        this(context, executor, pw1.a.a(), new fh1(context), new eh1());
        int i2 = pw1.l;
    }

    private gh1(Context context, Executor executor, pw1 pw1Var, fh1 fh1Var, eh1 eh1Var) {
        this.f15592a = context;
        this.b = pw1Var;
        this.c = fh1Var;
        this.d = eh1Var;
        this.e = new WeakHashMap<>();
        this.f = new Object();
        this.g = dh1.d;
        executor.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.gh1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                gh1.a(gh1.this);
            }
        });
    }

    public final void a(b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f) {
            this.e.put(callback, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final class a {
        @JvmStatic
        public final gh1 a(Context context) {
            gh1 gh1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            gh1 gh1Var2 = gh1.i;
            if (gh1Var2 != null) {
                return gh1Var2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                int i = ms0.f;
                Executor c = ms0.a.a().c();
                gh1Var = gh1.i;
                if (gh1Var == null) {
                    Intrinsics.checkNotNull(applicationContext);
                    gh1Var = new gh1(applicationContext, c);
                    gh1.i = gh1Var;
                }
            }
            return gh1Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r4.g == com.yandex.mobile.ads.impl.dh1.d) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.pw1 r0 = r4.b
            android.content.Context r1 = r4.f15592a
            com.yandex.mobile.ads.impl.ju1 r0 = r0.a(r1)
            java.lang.Object r1 = r4.f
            monitor-enter(r1)
            r2 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r0.n0()     // Catch: java.lang.Throwable -> L29
            if (r0 != r2) goto L1f
            com.yandex.mobile.ads.impl.dh1 r0 = r4.g     // Catch: java.lang.Throwable -> L29
            com.yandex.mobile.ads.impl.dh1 r3 = com.yandex.mobile.ads.impl.dh1.b     // Catch: java.lang.Throwable -> L29
            if (r0 == r3) goto L27
            com.yandex.mobile.ads.impl.dh1 r3 = com.yandex.mobile.ads.impl.dh1.d     // Catch: java.lang.Throwable -> L29
            if (r0 != r3) goto L26
            goto L27
        L1f:
            com.yandex.mobile.ads.impl.dh1 r0 = r4.g     // Catch: java.lang.Throwable -> L29
            com.yandex.mobile.ads.impl.dh1 r3 = com.yandex.mobile.ads.impl.dh1.d     // Catch: java.lang.Throwable -> L29
            if (r0 != r3) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            monitor-exit(r1)
            return r2
        L29:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gh1.b():boolean");
    }

    public final void b(b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f) {
            this.e.remove(callback);
        }
    }
}
