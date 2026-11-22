package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p02 {

    /* renamed from: a, reason: collision with root package name */
    private final l02 f16509a = new l02();
    private final Matrix b = new Matrix();
    private final Paint c;
    private final Rect d;

    public final void a(ImageView view, Bitmap bitmap, j02 smartCenter) {
        float f;
        float c;
        float f2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(smartCenter, "smartCenter");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float valueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z = width / height > width2 / height2;
        float f3 = z ? width / width2 : height / height2;
        float f4 = width2 * f3;
        float f5 = height2 * f3;
        if (z) {
            c = 0.0f;
            f = 0.0f;
        } else {
            f = 0.0f;
            c = (width / 2) - (((smartCenter.c() / 2) + smartCenter.d()) * f3);
            Float valueOf2 = c > 0.0f ? valueOf : c + f4 < width ? Float.valueOf(width - f4) : null;
            if (valueOf2 != null) {
                c = valueOf2.floatValue();
            }
        }
        if (z) {
            float b = (height / 2) - (((smartCenter.b() / 2) + smartCenter.e()) * f3);
            if (b <= f) {
                valueOf = b + f5 < height ? Float.valueOf(height - f5) : null;
            }
            f2 = valueOf != null ? valueOf.floatValue() : b;
        } else {
            f2 = f;
        }
        this.b.setScale(f3, f3);
        this.b.postTranslate(c, f2);
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.b);
        l02 l02Var = this.f16509a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l02Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.d;
            rect.set(smartCenter.d(), smartCenter.e(), smartCenter.c() + smartCenter.d(), smartCenter.b() + smartCenter.e());
            canvas.drawRect(rect, this.c);
            view.setImageBitmap(copy);
        }
    }

    public p02() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.c = paint;
        this.d = new Rect();
    }

    public final void a(ImageView view, Bitmap bitmap, j02 smartCenter, String backGroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(smartCenter, "smartCenter");
        Intrinsics.checkNotNullParameter(backGroundColor, "backGroundColor");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float c = smartCenter.c();
        float b = smartCenter.b();
        if (height == 0.0f || b == 0.0f || height2 == 0.0f) {
            return;
        }
        float f = width / height;
        float f2 = f < c / b ? width / c : height / b;
        if (f2 > 1.0f) {
            f2 = f < width2 / height2 ? width / width2 : height / height2;
        }
        float f3 = 2;
        this.b.setScale(f2, f2);
        this.b.postTranslate((width / f3) - (((smartCenter.c() / 2) + smartCenter.d()) * f2), (height / f3) - (((smartCenter.b() / 2) + smartCenter.e()) * f2));
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.b);
        view.setBackgroundColor(Color.parseColor(backGroundColor));
        l02 l02Var = this.f16509a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l02Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.d;
            rect.set(smartCenter.d(), smartCenter.e(), smartCenter.c() + smartCenter.d(), smartCenter.b() + smartCenter.e());
            canvas.drawRect(rect, this.c);
            view.setImageBitmap(copy);
        }
    }
}
