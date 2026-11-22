package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y51 {
    private static final Object c = new Object();
    private static volatile y51 d;
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f17395a;
    private boolean b;

    public static final class a {
        @JvmStatic
        public static y51 a() {
            if (y51.d == null) {
                synchronized (y51.c) {
                    if (y51.d == null) {
                        y51.d = new y51();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            y51 y51Var = y51.d;
            if (y51Var != null) {
                return y51Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void b(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if ((view instanceof TextView) || (view instanceof mn1)) {
            a(view, motionEvent);
        }
    }

    /* synthetic */ y51() {
        this(new Handler(Looper.getMainLooper()));
    }

    private y51(Handler handler) {
        this.f17395a = handler;
    }

    private final void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.b) {
                view.setAlpha(view.getAlpha() / 2);
                this.b = true;
            }
            this.f17395a.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.y51$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    y51.a(y51.this, view);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(y51 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (this$0.b) {
            view.setAlpha(view.getAlpha() * 2);
            this$0.b = false;
        }
    }
}
