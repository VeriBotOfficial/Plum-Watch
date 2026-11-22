package com.wakeup.feature.aimusic.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SoftVerticalEdge.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/aimusic/util/SoftVerticalEdge;", "", "<init>", "()V", "apply", "Landroid/graphics/Bitmap;", "source", "topFraction", "", "bottomFraction", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SoftVerticalEdge {
    public static final SoftVerticalEdge INSTANCE = new SoftVerticalEdge();

    private SoftVerticalEdge() {
    }

    public static /* synthetic */ Bitmap apply$default(SoftVerticalEdge softVerticalEdge, Bitmap bitmap, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.42f;
        }
        if ((i & 4) != 0) {
            f2 = 0.42f;
        }
        return softVerticalEdge.apply(bitmap, f, f2);
    }

    public final Bitmap apply(Bitmap source, float topFraction, float bottomFraction) {
        Intrinsics.checkNotNullParameter(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        if (width <= 0 || height <= 0) {
            return source;
        }
        float coerceIn = RangesKt.coerceIn(topFraction, 0.05f, 0.48f);
        float coerceIn2 = RangesKt.coerceIn(bottomFraction, 0.05f, 0.48f);
        Bitmap copy = source.copy(Bitmap.Config.ARGB_8888, true);
        if (copy == null) {
            copy = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            new Canvas(copy).drawBitmap(source, 0.0f, 0.0f, (Paint) null);
            Intrinsics.checkNotNullExpressionValue(copy, "also(...)");
        }
        Canvas canvas = new Canvas(copy);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        float f = height;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{0, Color.argb(40, 255, 255, 255), Color.argb(112, 255, 255, 255), Color.argb(200, 255, 255, 255), -1, -1, Color.argb(200, 255, 255, 255), Color.argb(112, 255, 255, 255), Color.argb(40, 255, 255, 255), 0}, new float[]{0.0f, coerceIn * 0.22f, coerceIn * 0.48f, coerceIn * 0.78f, coerceIn, 1.0f - coerceIn2, 1.0f - (0.78f * coerceIn2), 1.0f - (0.48f * coerceIn2), 1.0f - (coerceIn2 * 0.22f), 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, width, f, paint);
        return copy;
    }
}
