package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rt1 {

    /* renamed from: a, reason: collision with root package name */
    private final c42 f16798a;

    /* JADX WARN: Multi-variable type inference failed */
    public final Point a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        final WindowManager windowManager = (WindowManager) systemService;
        c42 c42Var = this.f16798a;
        Callable callable = new Callable() { // from class: com.yandex.mobile.ads.impl.rt1$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Display a2;
                a2 = rt1.a(windowManager);
                return a2;
            }
        };
        c42Var.getClass();
        final Display display = (Display) c42.a(callable, windowManager, "getting display", "WindowManager");
        final Point point = new Point(0, 0);
        c42 c42Var2 = this.f16798a;
        Callable tryBlock = new Callable() { // from class: com.yandex.mobile.ads.impl.rt1$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Point a2;
                a2 = rt1.a(display, point, this);
                return a2;
            }
        };
        c42Var2.getClass();
        Intrinsics.checkNotNullParameter(tryBlock, "tryBlock");
        Intrinsics.checkNotNullParameter("getting display metrics", "whileWhat");
        Intrinsics.checkNotNullParameter("Display", "whatIsNull");
        Object a2 = c42.a(tryBlock, display, "getting display metrics", "Display");
        if (a2 != 0) {
            point = a2;
        }
        return point;
    }

    public /* synthetic */ rt1() {
        this(new c42());
    }

    public rt1(c42 systemServiceUtils) {
        Intrinsics.checkNotNullParameter(systemServiceUtils, "systemServiceUtils");
        this.f16798a = systemServiceUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Display a(WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(windowManager, "$windowManager");
        return windowManager.getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point a(Display display, Point defaultPoint, rt1 this$0) {
        Intrinsics.checkNotNullParameter(defaultPoint, "$defaultPoint");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (display == null) {
            return defaultPoint;
        }
        this$0.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
