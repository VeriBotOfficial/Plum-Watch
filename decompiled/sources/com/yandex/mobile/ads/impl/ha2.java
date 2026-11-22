package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ha2 {

    /* renamed from: a, reason: collision with root package name */
    private final p2 f15673a;
    private final Map<String, String> b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final p2 f15674a;
        private Map<String, String> b;

        public a(p2 adBreak) {
            Intrinsics.checkNotNullParameter(adBreak, "adBreak");
            this.f15674a = adBreak;
            ce2.a(adBreak);
        }

        public final a c() {
            this.b = null;
            return this;
        }

        public final p2 a() {
            return this.f15674a;
        }

        public final Map<String, String> b() {
            return this.b;
        }
    }

    private ha2(a aVar) {
        this.f15673a = aVar.a();
        this.b = aVar.b();
    }

    public final p2 a() {
        return this.f15673a;
    }

    public final Map<String, String> b() {
        return this.b;
    }

    public /* synthetic */ ha2(a aVar, int i) {
        this(aVar);
    }
}
