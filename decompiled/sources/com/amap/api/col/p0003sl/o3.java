package com.amap.api.col.p0003sl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.TextOptions;

/* compiled from: OverlayFormatter.java */
/* loaded from: classes11.dex */
public class o3 {

    /* renamed from: a, reason: collision with root package name */
    private static Paint f1801a = new Paint();
    private static Rect b = new Rect();

    public static float a(int i, boolean z) {
        if (z) {
            if (i != 1) {
                return i != 2 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }
        if (i != 8) {
            return i != 16 ? 0.5f : 1.0f;
        }
        return 0.0f;
    }

    public static BitmapDescriptor a(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        f1801a.setTypeface(textOptions.getTypeface());
        f1801a.setSubpixelText(true);
        f1801a.setAntiAlias(true);
        f1801a.setStrokeWidth(5.0f);
        f1801a.setStrokeCap(Paint.Cap.ROUND);
        f1801a.setTextSize(textOptions.getFontSize());
        f1801a.setTextAlign(Paint.Align.CENTER);
        f1801a.setColor(textOptions.getFontColor());
        Paint.FontMetrics fontMetrics = f1801a.getFontMetrics();
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = (int) (((i - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        if (textOptions.getText() != null) {
            f1801a.getTextBounds(textOptions.getText(), 0, textOptions.getText().length(), b);
        }
        Bitmap createBitmap = Bitmap.createBitmap(b.width() + 6, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(textOptions.getBackgroundColor());
        if (textOptions.getText() != null) {
            canvas.drawText(textOptions.getText(), b.centerX() + 3, i2, f1801a);
        }
        return BitmapDescriptorFactory.fromBitmap(createBitmap);
    }

    public static MarkerOptions b(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(textOptions.getPosition());
        markerOptions.visible(textOptions.isVisible());
        markerOptions.zIndex(textOptions.getZIndex());
        markerOptions.rotateAngle(textOptions.getRotate());
        markerOptions.icon(a(textOptions));
        markerOptions.anchor(a(textOptions.getAlignX(), true), a(textOptions.getAlignY(), false));
        return markerOptions;
    }
}
