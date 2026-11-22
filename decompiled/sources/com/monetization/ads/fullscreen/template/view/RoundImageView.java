package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.ou;
import com.yandex.mobile.ads.impl.pu;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/RoundImageView;", "Landroid/widget/ImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Lcom/yandex/mobile/ads/impl/pu;", "cornerViewRenderingControllerFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/yandex/mobile/ads/impl/pu;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class RoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private final ou f12686a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundImageView(Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f12686a.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12686a.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundImageView(Context context, AttributeSet attributeSet, int i, pu cornerViewRenderingControllerFactory) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cornerViewRenderingControllerFactory, "cornerViewRenderingControllerFactory");
        cornerViewRenderingControllerFactory.getClass();
        this.f12686a = pu.a(context, this, attributeSet, i);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, pu puVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new pu() : puVar);
    }
}
