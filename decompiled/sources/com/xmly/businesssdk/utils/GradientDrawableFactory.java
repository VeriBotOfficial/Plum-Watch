package com.xmly.businesssdk.utils;

import android.content.Context;
import android.graphics.Color;
import com.wakeup.common.burypoint.BuryPointPageId;
import com.xmly.businesssdk.view.GradientRoundRectDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradientDrawableFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bJ,\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ,\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/utils/GradientDrawableFactory;", "", "()V", BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lcom/xmly/businesssdk/view/GradientRoundRectDrawable;", "context", "Landroid/content/Context;", "cornerRadiusDp", "", "startColor", "", "endColor", "gradientAngle", "createHorizontal", "createVertical", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class GradientDrawableFactory {
    public static /* synthetic */ GradientRoundRectDrawable create$default(GradientDrawableFactory gradientDrawableFactory, Context context, float f, int i, int i2, float f2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f = 200.0f;
        }
        float f3 = f;
        if ((i3 & 4) != 0) {
            i = Color.parseColor("#75FFFFFF");
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = Color.parseColor("#00FFFFFF");
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f2 = 180.0f;
        }
        return gradientDrawableFactory.create(context, f3, i4, i5, f2);
    }

    public static /* synthetic */ GradientRoundRectDrawable createHorizontal$default(GradientDrawableFactory gradientDrawableFactory, Context context, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f = 200.0f;
        }
        if ((i3 & 4) != 0) {
            i = Color.parseColor("#75FFFFFF");
        }
        if ((i3 & 8) != 0) {
            i2 = Color.parseColor("#00FFFFFF");
        }
        return gradientDrawableFactory.createHorizontal(context, f, i, i2);
    }

    public static /* synthetic */ GradientRoundRectDrawable createVertical$default(GradientDrawableFactory gradientDrawableFactory, Context context, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f = 200.0f;
        }
        if ((i3 & 4) != 0) {
            i = Color.parseColor("#75FFFFFF");
        }
        if ((i3 & 8) != 0) {
            i2 = Color.parseColor("#00FFFFFF");
        }
        return gradientDrawableFactory.createVertical(context, f, i, i2);
    }

    public final GradientRoundRectDrawable create(Context context, float cornerRadiusDp, int startColor, int endColor, float gradientAngle) {
        Intrinsics.checkNotNullParameter(context, "context");
        GradientRoundRectDrawable gradientRoundRectDrawable = new GradientRoundRectDrawable();
        gradientRoundRectDrawable.setCornerRadiusDp(context, cornerRadiusDp);
        gradientRoundRectDrawable.setStartColor(startColor);
        gradientRoundRectDrawable.setEndColor(endColor);
        gradientRoundRectDrawable.setGradientAngle(gradientAngle);
        return gradientRoundRectDrawable;
    }

    public final GradientRoundRectDrawable createHorizontal(Context context, float cornerRadiusDp, int startColor, int endColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        return create(context, cornerRadiusDp, startColor, endColor, 0.0f);
    }

    public final GradientRoundRectDrawable createVertical(Context context, float cornerRadiusDp, int startColor, int endColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        return create(context, cornerRadiusDp, startColor, endColor, 90.0f);
    }
}
