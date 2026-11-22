package com.yandex.mobile.ads.impl;

import android.media.metrics.LogSessionId;

/* loaded from: classes5.dex */
public final class mi1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f16247a;

    static {
        if (f92.f15466a < 31) {
            new mi1();
        } else {
            int i = a.b;
        }
    }

    public mi1() {
        this((a) null);
        hg.b(f92.f15466a < 31);
    }

    public final LogSessionId a() {
        a aVar = this.f16247a;
        aVar.getClass();
        return aVar.f16248a;
    }

    private static final class a {
        public static final /* synthetic */ int b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f16248a;

        static {
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f16248a = logSessionId;
        }
    }

    public mi1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private mi1(a aVar) {
        this.f16247a = aVar;
    }
}
