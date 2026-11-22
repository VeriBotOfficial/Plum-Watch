package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.util;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

/* loaded from: classes17.dex */
public class Background {

    public static class Build {
        float bottomLeftRadius;
        float bottomRightRadius;
        int color;
        GradientDrawable gradient;
        int pressedBgColor;
        float radius;
        int strokeColor;
        float strokeWidth;
        float topLeftRadius;
        float topRightRadius;

        private GradientDrawable createBg(int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            GradientDrawable gradientDrawable2 = this.gradient;
            if (gradientDrawable2 != null) {
                gradientDrawable = gradientDrawable2;
            } else if (i != 0) {
                gradientDrawable.setColor(i);
            }
            float f = this.topLeftRadius;
            float f2 = this.topRightRadius;
            float f3 = this.bottomLeftRadius;
            float f4 = this.bottomRightRadius;
            if (f + f2 + f3 + f4 > 0.0f) {
                gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
            } else {
                float f5 = this.radius;
                if (f5 > 0.0f) {
                    gradientDrawable.setCornerRadius(f5);
                }
            }
            int i2 = this.strokeColor;
            if (i2 != 0) {
                float f6 = this.strokeWidth;
                if (f6 > 0.0f) {
                    gradientDrawable.setStroke((int) f6, i2);
                }
            }
            return gradientDrawable;
        }

        public Build bottomLeftRadius(float f) {
            float f2 = this.radius;
            if (f2 > 0.0f) {
                f = f2;
            }
            this.bottomLeftRadius = f;
            return this;
        }

        public Build bottomRightRadius(float f) {
            float f2 = this.radius;
            if (f2 > 0.0f) {
                f = f2;
            }
            this.bottomRightRadius = f;
            return this;
        }

        public Build color(int i) {
            this.color = i;
            return this;
        }

        public GradientDrawable createBackground() {
            return createBg(this.color);
        }

        public StateListDrawable createStateListDrawable() {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, createBg(this.pressedBgColor));
            stateListDrawable.addState(new int[0], createBg(this.color));
            return stateListDrawable;
        }

        public Build gradient(GradientDrawable gradientDrawable) {
            this.gradient = gradientDrawable;
            return this;
        }

        public Build pressedBgColor(int i) {
            this.pressedBgColor = i;
            return this;
        }

        public Build radius(float f) {
            this.radius = f;
            return this;
        }

        public Build strokeColor(int i) {
            this.strokeColor = i;
            return this;
        }

        public Build strokeWidth(float f) {
            this.strokeWidth = f;
            return this;
        }

        public Build topLeftRadius(float f) {
            float f2 = this.radius;
            if (f2 > 0.0f) {
                f = f2;
            }
            this.topLeftRadius = f;
            return this;
        }

        public Build topRightRadius(float f) {
            float f2 = this.radius;
            if (f2 > 0.0f) {
                f = f2;
            }
            this.topRightRadius = f;
            return this;
        }
    }

    public static Build build() {
        return new Build();
    }
}
