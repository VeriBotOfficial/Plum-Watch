package com.phancy.mini.utils;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: H5Color.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/phancy/mini/utils/H5Color;", "", "()V", "parseARGBColor", "", "color", "", "defaultColor", "parseColor", "parseRGBAColor", "transformFromSimpleColor", "rgbaColor", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class H5Color {
    public static final H5Color INSTANCE = new H5Color();

    private H5Color() {
    }

    @JvmStatic
    public static final int parseColor(String color) {
        return parseColor(color, 0);
    }

    @JvmStatic
    public static final int parseColor(String color, int defaultColor) {
        return parseRGBAColor(color, defaultColor);
    }

    @JvmStatic
    public static final int parseRGBAColor(String color, int defaultColor) {
        String str = color;
        if (str != null && str.length() != 0) {
            String transformFromSimpleColor$default = transformFromSimpleColor$default(INSTANCE, color, false, 2, null);
            if (transformFromSimpleColor$default != null && transformFromSimpleColor$default.length() >= 9 && transformFromSimpleColor$default.charAt(0) == '#') {
                char charAt = transformFromSimpleColor$default.charAt(1);
                char charAt2 = transformFromSimpleColor$default.charAt(2);
                char charAt3 = transformFromSimpleColor$default.charAt(3);
                char charAt4 = transformFromSimpleColor$default.charAt(4);
                char charAt5 = transformFromSimpleColor$default.charAt(5);
                char charAt6 = transformFromSimpleColor$default.charAt(6);
                transformFromSimpleColor$default = "#" + transformFromSimpleColor$default.charAt(7) + transformFromSimpleColor$default.charAt(8) + charAt + charAt2 + charAt3 + charAt4 + charAt5 + charAt6;
            }
            try {
                return Color.parseColor(transformFromSimpleColor$default);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultColor;
    }

    static /* synthetic */ String transformFromSimpleColor$default(H5Color h5Color, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return h5Color.transformFromSimpleColor(str, z);
    }

    private final String transformFromSimpleColor(String color, boolean rgbaColor) {
        if (color == null) {
            return color;
        }
        if ((color.length() != 4 && color.length() != 5) || color.charAt(0) != '#') {
            return color;
        }
        if (!rgbaColor && color.length() == 5) {
            return color;
        }
        char charAt = color.charAt(1);
        char charAt2 = color.charAt(2);
        char charAt3 = color.charAt(3);
        StringBuilder append = new StringBuilder("#").append(charAt).append(charAt).append(charAt2).append(charAt2).append(charAt3).append(charAt3);
        if (rgbaColor && color.length() == 5) {
            char charAt4 = color.charAt(4);
            append.append(charAt4).append(charAt4);
        }
        return append.toString();
    }

    @JvmStatic
    public static final int parseARGBColor(String color) {
        return parseARGBColor(color, 0);
    }

    @JvmStatic
    public static final int parseARGBColor(String color, int defaultColor) {
        String str = color;
        if (str != null && str.length() != 0) {
            try {
                return Color.parseColor(INSTANCE.transformFromSimpleColor(color, false));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultColor;
    }
}
