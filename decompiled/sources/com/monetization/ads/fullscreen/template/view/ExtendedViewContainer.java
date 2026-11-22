package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.er;
import com.yandex.mobile.ads.impl.ou;
import com.yandex.mobile.ads.impl.pu0;
import com.yandex.mobile.ads.impl.qu0;
import com.yandex.mobile.ads.impl.ry1;
import com.yandex.mobile.ads.impl.su0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ExtendedViewContainer;", "Landroid/widget/FrameLayout;", "Lcom/yandex/mobile/ads/impl/su0;", "measureSpecProvider", "", "setMeasureSpecProvider", "(Lcom/yandex/mobile/ads/impl/su0;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class ExtendedViewContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ou f12685a;
    private su0 b;
    private su0 c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendedViewContainer(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final er a(float f, float f2) {
        Intrinsics.checkNotNullParameter(this, "view");
        Context applicationContext = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        qu0 qu0Var = new qu0(this, f, applicationContext, new su0.a());
        Intrinsics.checkNotNullParameter(this, "view");
        Context applicationContext2 = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        return new er(qu0Var, new pu0(this, f2, applicationContext2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f12685a.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        su0.a a2 = this.c.a(i, i2);
        super.onMeasure(a2.f16895a, a2.b);
        this.f12685a.a();
    }

    public final void setMeasureSpecProvider(su0 measureSpecProvider) {
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
        this.c = new er(this.b, measureSpecProvider);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendedViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendedViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalExtendedContainer, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            i3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize);
            i4 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize);
            i5 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize);
            i2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize);
            this.b = a(obtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f), obtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f));
            obtainStyledAttributes.recycle();
        } else {
            this.b = new ry1();
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        this.c = this.b;
        this.f12685a = new ou(this, i3, i4, i5, i2);
        setWillNotDraw(false);
    }
}
