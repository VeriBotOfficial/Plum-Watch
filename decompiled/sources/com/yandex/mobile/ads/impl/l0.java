package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.o0;
import com.yandex.mobile.ads.impl.pw1;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16064a;
    private final o0 b;
    private final g0 c;
    private final j32 d;
    private final a e;

    public l0(Context context, o3 adConfiguration, n0 interactionEventListener, Context applicationContext, o0 activityInteractionTracker, g0 activityBackgroundListener, j32 strongReferenceKeepingManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(interactionEventListener, "interactionEventListener");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityInteractionTracker, "activityInteractionTracker");
        Intrinsics.checkNotNullParameter(activityBackgroundListener, "activityBackgroundListener");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f16064a = applicationContext;
        this.b = activityInteractionTracker;
        this.c = activityBackgroundListener;
        this.d = strongReferenceKeepingManager;
        this.e = new a(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ l0(android.content.Context r12, com.yandex.mobile.ads.impl.o3 r13, com.yandex.mobile.ads.impl.o8 r14, com.yandex.mobile.ads.impl.n0 r15, com.yandex.mobile.ads.impl.m80 r16) {
        /*
            r11 = this;
            android.content.Context r4 = r12.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            com.yandex.mobile.ads.impl.o0 r5 = new com.yandex.mobile.ads.impl.o0
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)
            com.yandex.mobile.ads.impl.i0 r6 = com.yandex.mobile.ads.impl.h0.a()
            int r14 = com.yandex.mobile.ads.impl.j32.d
            com.yandex.mobile.ads.impl.j32 r7 = com.yandex.mobile.ads.impl.j32.a.a()
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.l0.<init>(android.content.Context, com.yandex.mobile.ads.impl.o3, com.yandex.mobile.ads.impl.o8, com.yandex.mobile.ads.impl.n0, com.yandex.mobile.ads.impl.m80):void");
    }

    public final void g() {
        this.b.b(o0.a.d);
    }

    public final void f() {
        this.b.a(o0.a.d);
    }

    public final void c() {
        this.b.b(o0.a.e);
    }

    public final void b() {
        this.b.a(o0.a.e);
    }

    public final void e() {
        this.d.b(xq0.d, this);
        this.c.b(this.f16064a, (r0) this.e);
        this.c.b(this.f16064a, this.e);
        this.b.b(o0.a.c);
    }

    public final void d() {
        this.b.a(o0.a.c);
        this.c.a(this.f16064a, (r0) this.e);
        this.c.a(this.f16064a, this.e);
        this.d.a(xq0.d, this);
    }

    public final void a() {
        this.c.b(this.f16064a, (r0) this.e);
        this.c.b(this.f16064a, this.e);
    }

    public final void a(x71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.b.a(reportParameterManager);
    }

    public static final class a implements r0, lr1 {

        /* renamed from: a, reason: collision with root package name */
        private final l0 f16065a;
        private WeakReference<Activity> b;
        private String c;

        public a(l0 activityInteractionController) {
            Intrinsics.checkNotNullParameter(activityInteractionController, "activityInteractionController");
            this.f16065a = activityInteractionController;
        }

        @Override // com.yandex.mobile.ads.impl.lr1
        public final void a(Activity activity, Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(activity, "activity");
            String str = "onCreated, activity = " + activity;
            sp0.a(new Object[0]);
            if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !Intrinsics.areEqual(string, this.c)) {
                return;
            }
            this.f16065a.d();
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String str = "onResume, activity = " + activity;
            boolean z = false;
            sp0.a(new Object[0]);
            int i = pw1.l;
            ju1 a2 = pw1.a.a().a(activity);
            boolean z2 = a2 != null && a2.r0();
            Intent intent = activity.getIntent();
            if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
                z = true;
            }
            WeakReference<Activity> weakReference = this.b;
            if ((weakReference == null || !Intrinsics.areEqual(activity, weakReference.get()) || z2) && (!z2 || z)) {
                return;
            }
            this.f16065a.d();
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String str = "onPause, activity = " + activity;
            sp0.a(new Object[0]);
            if (this.b == null) {
                this.b = new WeakReference<>(activity);
            }
        }

        @Override // com.yandex.mobile.ads.impl.lr1
        public final void b(Activity activity, Bundle bundle) {
            WeakReference<Activity> weakReference;
            Intrinsics.checkNotNullParameter(activity, "activity");
            String str = "onSaveInstanceState, activity = " + activity;
            sp0.a(new Object[0]);
            if (bundle == null || (weakReference = this.b) == null || !Intrinsics.areEqual(activity, weakReference.get())) {
                return;
            }
            String uuid = UUID.randomUUID().toString();
            this.c = uuid;
            bundle.putString("monetization_ads_activity_id", uuid);
        }
    }
}
