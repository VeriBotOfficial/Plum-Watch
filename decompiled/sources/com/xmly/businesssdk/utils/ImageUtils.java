package com.xmly.businesssdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import androidx.palette.graphics.Palette;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.utils.ImageUtils;

/* loaded from: classes3.dex */
public class ImageUtils {

    public interface Callback {
        void onMainColorGot(int i);
    }

    public static class GradientDrawableBuilder {
        public int[] colors;
        public float[] cornerRadII;
        public float cornerRadius;
        public int stroke;
        public int strokeColor;
        public int color = 0;
        public GradientDrawable.Orientation mOrientation = GradientDrawable.Orientation.LEFT_RIGHT;

        public GradientDrawable build() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.cornerRadius);
            float[] fArr = this.cornerRadII;
            if (fArr != null) {
                gradientDrawable.setCornerRadii(fArr);
            } else {
                gradientDrawable.setCornerRadius(this.cornerRadius);
            }
            int[] iArr = this.colors;
            if (iArr != null) {
                gradientDrawable.setColors(iArr);
            }
            int i = this.color;
            if (i != 0) {
                gradientDrawable.setColor(i);
            }
            int i2 = this.stroke;
            if (i2 > 0) {
                gradientDrawable.setStroke(i2, this.strokeColor);
            }
            gradientDrawable.setOrientation(this.mOrientation);
            return gradientDrawable;
        }

        public GradientDrawableBuilder color(int i) {
            this.color = i;
            return this;
        }

        public GradientDrawableBuilder cornerRadius(float f) {
            this.cornerRadius = f;
            return this;
        }

        public GradientDrawableBuilder orientation(GradientDrawable.Orientation orientation) {
            this.mOrientation = orientation;
            return this;
        }

        public GradientDrawableBuilder stroke(int i, int i2) {
            this.stroke = i;
            this.strokeColor = i2;
            return this;
        }

        public GradientDrawableBuilder color(int[] iArr) {
            this.colors = iArr;
            return this;
        }

        public GradientDrawableBuilder cornerRadius(float f, float f2, float f3, float f4) {
            if (this.cornerRadII == null) {
                this.cornerRadII = new float[8];
            }
            float[] fArr = this.cornerRadII;
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f3;
            fArr[3] = f3;
            fArr[4] = f4;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f2;
            return this;
        }
    }

    public static void getDomainColor(Bitmap bitmap, final int i, final Callback callback) {
        if (callback == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            callback.onMainColorGot(i);
            return;
        }
        try {
            Class.forName("androidx.palette.graphics.Palette");
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            }
            Palette.from(bitmap).maximumColorCount(16).generate(new Palette.PaletteAsyncListener() { // from class: com.xmly.businesssdk.utils.ImageUtils$$ExternalSyntheticLambda0
                public final void onGenerated(Palette palette) {
                    ImageUtils.lambda$getDomainColor$0(ImageUtils.Callback.this, i, palette);
                }
            });
        } catch (ClassNotFoundException unused) {
            Logger.w("ImageUtils", "androidx.palette库不存在，无法提取主题色，使用默认颜色");
            callback.onMainColorGot(i);
        } catch (Exception e) {
            Logger.e("ImageUtils", c.a("提取主题色失败: ").append(e.getMessage()).toString());
            callback.onMainColorGot(i);
        }
    }

    static /* synthetic */ void lambda$getDomainColor$0(Callback callback, int i, Palette palette) {
        try {
            callback.onMainColorGot(palette.getDominantColor(i));
        } catch (Exception unused) {
            callback.onMainColorGot(i);
        }
    }
}
