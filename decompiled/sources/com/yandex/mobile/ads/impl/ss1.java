package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ss1<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final e1 f16891a;
    private final n52 b;
    private final ea1 c;
    private final f1 d;

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f16891a.a(this.d);
        this.c.a(this.b.b(container));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ss1(com.yandex.mobile.ads.impl.e1 r8, com.yandex.mobile.ads.impl.o52 r9, com.yandex.mobile.ads.impl.n91 r10, com.yandex.mobile.ads.impl.f52 r11) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.ea1 r5 = new com.yandex.mobile.ads.impl.ea1
            r5.<init>(r9, r10, r11)
            com.yandex.mobile.ads.impl.ss1$a r6 = new com.yandex.mobile.ads.impl.ss1$a
            r6.<init>(r5)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ss1.<init>(com.yandex.mobile.ads.impl.e1, com.yandex.mobile.ads.impl.o52, com.yandex.mobile.ads.impl.n91, com.yandex.mobile.ads.impl.f52):void");
    }

    public ss1(e1 adActivityEventController, o52 timerViewProvider, n91 nativeMediaContent, f52 timeProviderContainer, ea1 nativeRewardViewController, f1 adActivityFocusListener) {
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(nativeRewardViewController, "nativeRewardViewController");
        Intrinsics.checkNotNullParameter(adActivityFocusListener, "adActivityFocusListener");
        this.f16891a = adActivityEventController;
        this.b = timerViewProvider;
        this.c = nativeRewardViewController;
        this.d = adActivityFocusListener;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
        this.f16891a.b(this.d);
        this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements f1 {

        /* renamed from: a, reason: collision with root package name */
        private final ea1 f16892a;

        public a(ea1 nativeRewardViewController) {
            Intrinsics.checkNotNullParameter(nativeRewardViewController, "nativeRewardViewController");
            this.f16892a = nativeRewardViewController;
        }

        @Override // com.yandex.mobile.ads.impl.f1
        public final void a() {
            this.f16892a.c();
        }

        @Override // com.yandex.mobile.ads.impl.f1
        public final void b() {
            this.f16892a.b();
        }
    }
}
