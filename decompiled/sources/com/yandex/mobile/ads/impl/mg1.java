package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface mg1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16237a = 0;

    void a(long j, og1 og1Var);

    void a(m52 m52Var);

    void invalidate();

    void pause();

    void resume();

    void stop();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16238a = new a();

        public static mg1 a(boolean z) {
            Handler handler = new Handler(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new ng1(z, handler);
        }

        private a() {
        }
    }
}
