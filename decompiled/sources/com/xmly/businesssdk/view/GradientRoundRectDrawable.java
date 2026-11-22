package com.xmly.businesssdk.view;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradientRoundRectDrawable.kt */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0017J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010(\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010.\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R*\u00101\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xmly/businesssdk/view/GradientRoundRectDrawable;", "Landroid/graphics/drawable/Drawable;", "", "setupPaint", "updateGradient", "updatePath", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "Landroid/graphics/Canvas;", "canvas", "draw", "", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "Landroid/content/Context;", "context", "", "radiusDp", "setCornerRadiusDp", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "value", "cornerRadius", TokenNames.F, "getCornerRadius", "()F", "setCornerRadius", "(F)V", "startColor", TokenNames.I, "getStartColor", "()I", "setStartColor", "(I)V", "endColor", "getEndColor", "setEndColor", "gradientAngle", "getGradientAngle", "setGradientAngle", "Landroid/graphics/LinearGradient;", "gradientShader", "Landroid/graphics/LinearGradient;", "<init>", "()V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class GradientRoundRectDrawable extends Drawable {
    private LinearGradient gradientShader;
    private final Paint paint = new Paint(1);
    private final Path path = new Path();
    private final RectF rectF = new RectF();
    private float cornerRadius = 200.0f;
    private int startColor = Color.parseColor("#75FFFFFF");
    private int endColor = Color.parseColor("#00FFFFFF");
    private float gradientAngle = 180.0f;

    public GradientRoundRectDrawable() {
        setupPaint();
    }

    private final void setupPaint() {
        this.paint.setStyle(Paint.Style.FILL);
    }

    private final void updateGradient() {
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        double radians = Math.toRadians(this.gradientAngle);
        double sqrt = Math.sqrt((bounds.height() * bounds.height()) + (bounds.width() * bounds.width())) / 2;
        LinearGradient linearGradient = new LinearGradient((float) ((bounds.width() / 2) - (Math.cos(radians) * sqrt)), (float) ((bounds.height() / 2) - (Math.sin(radians) * sqrt)), (float) ((Math.cos(radians) * sqrt) + (bounds.width() / 2)), (float) ((Math.sin(radians) * sqrt) + (bounds.height() / 2)), this.startColor, this.endColor, Shader.TileMode.CLAMP);
        this.gradientShader = linearGradient;
        this.paint.setShader(linearGradient);
    }

    private final void updatePath() {
        this.path.reset();
        this.rectF.set(getBounds());
        Path path = this.path;
        RectF rectF = this.rectF;
        float f = this.cornerRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        updateGradient();
        updatePath();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setCornerRadius(float f) {
        this.cornerRadius = f;
        updatePath();
        invalidateSelf();
    }

    public final void setCornerRadiusDp(Context context, float radiusDp) {
        Intrinsics.checkNotNullParameter(context, "context");
        setCornerRadius(radiusDp * context.getResources().getDisplayMetrics().density);
    }

    public final void setEndColor(int i) {
        this.endColor = i;
        updateGradient();
        invalidateSelf();
    }

    public final void setGradientAngle(float f) {
        this.gradientAngle = f;
        updateGradient();
        invalidateSelf();
    }

    public final void setStartColor(int i) {
        this.startColor = i;
        updateGradient();
        invalidateSelf();
    }
}
