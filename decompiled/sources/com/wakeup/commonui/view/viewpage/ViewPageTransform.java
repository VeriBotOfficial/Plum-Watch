package com.wakeup.commonui.view.viewpage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewPageTransform.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/commonui/view/viewpage/ViewPageTransform;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "<init>", "()V", "DEFAULT_MIN_SCALE", "", "getDEFAULT_MIN_SCALE", "()F", "DEFAULT_CENTER", "getDEFAULT_CENTER", "mMinScale", "transformPage", "", "page", "Landroid/view/View;", "position", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewPageTransform implements ViewPager2.PageTransformer {
    private final float DEFAULT_MIN_SCALE = 0.5f;
    private final float DEFAULT_CENTER = 0.5f;
    private final float mMinScale = 0.5f;

    public final float getDEFAULT_MIN_SCALE() {
        return this.DEFAULT_MIN_SCALE;
    }

    public final float getDEFAULT_CENTER() {
        return this.DEFAULT_CENTER;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View page, float position) {
        Intrinsics.checkNotNullParameter(page, "page");
        int width = page.getWidth();
        int height = page.getHeight();
        page.setPivotX(width / 2);
        page.setPivotY(height / 2);
        if (position < 0.0f) {
            float f = 1;
            float f2 = this.mMinScale;
            float f3 = ((position + f) * (f - f2)) + f2;
            page.setScaleX(f3);
            page.setScaleY(f3);
            page.setAlpha(f3);
            page.setPivotX(width);
            return;
        }
        float f4 = 1;
        float f5 = f4 - position;
        float f6 = this.mMinScale;
        float f7 = ((f4 - f6) * f5) + f6;
        page.setScaleX(f7);
        page.setScaleY(f7);
        page.setAlpha(f7);
        page.setPivotX(width * f5 * this.DEFAULT_CENTER);
    }
}
