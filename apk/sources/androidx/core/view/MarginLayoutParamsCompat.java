package androidx.core.view;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class MarginLayoutParamsCompat {
    @Deprecated
    public static int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @Deprecated
    public static int getMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @Deprecated
    public static void setMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams, int r1) {
        marginLayoutParams.setMarginStart(r1);
    }

    @Deprecated
    public static void setMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams, int r1) {
        marginLayoutParams.setMarginEnd(r1);
    }

    @Deprecated
    public static boolean isMarginRelative(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @Deprecated
    public static int getLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    @Deprecated
    public static void setLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int r1) {
        marginLayoutParams.setLayoutDirection(r1);
    }

    @Deprecated
    public static void resolveLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int r1) {
        marginLayoutParams.resolveLayoutDirection(r1);
    }

    private MarginLayoutParamsCompat() {
    }
}
