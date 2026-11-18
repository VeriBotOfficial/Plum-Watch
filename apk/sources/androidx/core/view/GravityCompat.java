package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes8.dex */
public final class GravityCompat {
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    public static void apply(int r0, int r1, int r2, Rect rect, Rect rect2, int r5) {
        Gravity.apply(r0, r1, r2, rect, rect2, r5);
    }

    public static void apply(int r0, int r1, int r2, Rect rect, int r4, int r5, Rect rect2, int r7) {
        Gravity.apply(r0, r1, r2, rect, r4, r5, rect2, r7);
    }

    public static void applyDisplay(int r0, Rect rect, Rect rect2, int r3) {
        Gravity.applyDisplay(r0, rect, rect2, r3);
    }

    public static int getAbsoluteGravity(int r0, int r1) {
        return Gravity.getAbsoluteGravity(r0, r1);
    }

    private GravityCompat() {
    }
}
