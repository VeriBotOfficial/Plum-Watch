package com.monetization.ads.mediation.banner;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.ah2;
import com.yandex.mobile.ads.impl.go1;
import com.yandex.mobile.ads.impl.gz1;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.np0;
import com.yandex.mobile.ads.impl.ta;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* loaded from: classes17.dex */
public final class d {
    static final /* synthetic */ KProperty<Object>[] d = {ta.a(d.class, "adView", "getAdView()Landroid/view/ViewGroup;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final gz1 f12694a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final go1 c;

    public interface a {
        void a();
    }

    public static final ViewGroup a(d dVar) {
        return (ViewGroup) dVar.c.getValue(dVar, d[0]);
    }

    public d(np0 np0Var, gz1 gz1Var) {
        this.f12694a = gz1Var;
        this.c = ho1.a(np0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d this$0, View contentView, a contentViewShowListener) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentView, "$contentView");
        Intrinsics.checkNotNullParameter(contentViewShowListener, "$contentViewShowListener");
        ViewGroup viewGroup = (ViewGroup) this$0.c.getValue(this$0, d[0]);
        if (viewGroup != null && viewGroup.indexOfChild(contentView) == -1) {
            gz1 gz1Var = this$0.f12694a;
            if (gz1Var == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            } else {
                int height = gz1Var.getHeight();
                float f = Resources.getSystem().getDisplayMetrics().density;
                if (height >= 0) {
                    height = MathKt.roundToInt(height * f);
                }
                int width = this$0.f12694a.getWidth();
                float f2 = Resources.getSystem().getDisplayMetrics().density;
                if (width >= 0) {
                    width = MathKt.roundToInt(width * f2);
                }
                contentView.measure(0, 0);
                int measuredHeight = contentView.getMeasuredHeight();
                layoutParams = new RelativeLayout.LayoutParams(Math.min(width, contentView.getMeasuredWidth()), Math.min(height, measuredHeight));
            }
            layoutParams.addRule(13);
            ah2.a(contentView);
            viewGroup.addView(contentView, layoutParams);
            viewGroup.setVisibility(0);
            contentView.setVisibility(0);
        }
        contentView.getViewTreeObserver().addOnPreDrawListener(new e(this$0, contentView, contentViewShowListener));
    }

    public final void a(final View contentView, final a contentViewShowListener) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(contentViewShowListener, "contentViewShowListener");
        this.b.post(new Runnable() { // from class: com.monetization.ads.mediation.banner.d$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this, contentView, contentViewShowListener);
            }
        });
    }
}
