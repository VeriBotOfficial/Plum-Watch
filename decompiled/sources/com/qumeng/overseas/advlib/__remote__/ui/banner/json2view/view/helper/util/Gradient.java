package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.util;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.g;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes17.dex */
public class Gradient {

    public static class Builder {
        private String colors;
        private Context context;
        private String gradientRadius;
        private String gradientType;
        private String orientation;

        public Builder(Context context) {
            this.context = context;
        }

        private int[] parseColors(String str) {
            if (!TextUtils.isEmpty(str) && str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                try {
                    String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    int[] iArr = new int[split.length];
                    for (int i = 0; i < split.length; i++) {
                        iArr[i] = Color.parseColor(split[i]);
                    }
                    return iArr;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        private float parseGradientRadius(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1000.0f;
            }
            return g.a(this.context, str);
        }

        private int parseGradientType(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1000;
            }
            if (str.equals("LINEAR_GRADIENT")) {
                return 0;
            }
            if (str.equals("RADIAL_GRADIENT")) {
                return 1;
            }
            return str.equals("SWEEP_GRADIENT") ? 2 : -1000;
        }

        private GradientDrawable.Orientation parseOrientation(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.equals("TOP_BOTTOM")) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (str.equals("TR_BL")) {
                return GradientDrawable.Orientation.TR_BL;
            }
            if (str.equals("RIGHT_LEFT")) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (str.equals("BR_TL")) {
                return GradientDrawable.Orientation.BR_TL;
            }
            if (str.equals("BOTTOM_TOP")) {
                return GradientDrawable.Orientation.BOTTOM_TOP;
            }
            if (str.equals("BL_TR")) {
                return GradientDrawable.Orientation.BL_TR;
            }
            if (str.equals("LEFT_RIGHT")) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (str.equals("TL_BR")) {
                return GradientDrawable.Orientation.TL_BR;
            }
            return null;
        }

        public GradientDrawable buildGradientDrawable() {
            int[] parseColors;
            int parseGradientType = parseGradientType(this.gradientType);
            if (parseGradientType == -1000 || (parseColors = parseColors(this.colors)) == null) {
                return null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(parseOrientation(this.orientation), parseColors);
            gradientDrawable.setGradientType(parseGradientType);
            if (parseGradientType == 1) {
                float parseGradientRadius = parseGradientRadius(this.gradientRadius);
                if (parseGradientRadius > 0.0f) {
                    gradientDrawable.setGradientRadius(parseGradientRadius);
                }
            }
            return gradientDrawable;
        }

        public Builder colors(String str) {
            this.colors = str;
            return this;
        }

        public Builder gradientRadius(String str) {
            this.gradientRadius = str;
            return this;
        }

        public Builder gradientType(String str) {
            this.gradientType = str;
            return this;
        }

        public Builder orientation(String str) {
            this.orientation = str;
            return this;
        }
    }

    public static Builder builder(Context context) {
        return new Builder(context);
    }
}
