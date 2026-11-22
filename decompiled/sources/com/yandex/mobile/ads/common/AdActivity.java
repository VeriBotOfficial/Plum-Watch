package com.yandex.mobile.ads.common;

import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import com.yandex.mobile.ads.impl.b1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/ads/common/AdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AdActivity extends ComponentActivity {

    /* renamed from: a, reason: collision with root package name */
    private b1 f14932a;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b1 b1Var = this.f14932a;
        if (b1Var == null || b1Var.c()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        super.onConfigurationChanged(config);
        b1 b1Var = this.f14932a;
        if (b1Var != null) {
            b1Var.a(config);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r10 == (-1)) goto L13;
     */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.String r0 = "data_identifier"
            super.onCreate(r13)
            java.lang.String r13 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            com.yandex.mobile.ads.impl.e1 r5 = new com.yandex.mobile.ads.impl.e1
            r5.<init>(r12)
            android.widget.RelativeLayout r3 = new android.widget.RelativeLayout
            r3.<init>(r12)
            android.content.Intent r6 = r12.getIntent()
            r13 = 0
            if (r6 != 0) goto L1d
            r4 = r13
            goto L71
        L1d:
            android.view.Window r7 = r12.getWindow()
            int r1 = com.yandex.mobile.ads.impl.d1.d
            com.yandex.mobile.ads.impl.d1 r1 = com.yandex.mobile.ads.impl.d1.a.a()
            r2 = 0
            boolean r4 = r6.hasExtra(r0)     // Catch: java.lang.Exception -> L3d
            if (r4 == 0) goto L42
            r8 = -1
            long r10 = r6.getLongExtra(r0, r8)     // Catch: java.lang.Exception -> L3d
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Exception -> L3d
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 != 0) goto L43
            goto L42
        L3d:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.yandex.mobile.ads.impl.sp0.b(r0)
        L42:
            r0 = r13
        L43:
            if (r0 == 0) goto L4f
            long r8 = r0.longValue()
            com.yandex.mobile.ads.impl.c1 r0 = r1.a(r8)
            r8 = r0
            goto L50
        L4f:
            r8 = r13
        L50:
            if (r8 == 0) goto L5c
            com.yandex.mobile.ads.impl.t8 r0 = r8.d()     // Catch: java.lang.Exception -> L57
            goto L5d
        L57:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.yandex.mobile.ads.impl.sp0.b(r0)
        L5c:
            r0 = r13
        L5d:
            com.yandex.mobile.ads.impl.v1 r4 = new com.yandex.mobile.ads.impl.v1
            r4.<init>(r12, r0)
            com.yandex.mobile.ads.impl.o1$a r0 = com.yandex.mobile.ads.impl.o1.b
            com.yandex.mobile.ads.impl.o1 r1 = r0.a()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r2 = r12
            com.yandex.mobile.ads.impl.m1 r0 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            r4 = r0
        L71:
            if (r4 == 0) goto L7f
            com.yandex.mobile.ads.impl.b1 r1 = new com.yandex.mobile.ads.impl.b1
            com.yandex.mobile.ads.impl.uh2 r6 = new com.yandex.mobile.ads.impl.uh2
            r6.<init>()
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L81
        L7f:
            r2 = r12
            r1 = r13
        L81:
            r2.f14932a = r1
            if (r1 == 0) goto L8a
            r1.b()
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
        L8a:
            if (r13 != 0) goto L8f
            r12.finish()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.common.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        b1 b1Var = this.f14932a;
        if (b1Var != null) {
            b1Var.a();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        b1 b1Var = this.f14932a;
        if (b1Var != null) {
            b1Var.d();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        b1 b1Var = this.f14932a;
        if (b1Var != null) {
            b1Var.e();
        }
    }
}
