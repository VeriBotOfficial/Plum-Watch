package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class ij {
    private static boolean fxn(View view, int i) {
        float fxn = fxn(view);
        return fxn > 0.0f && fxn >= ((float) i) / 100.0f;
    }

    public static float fxn(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long height = r1.height() * r1.width();
                    long height2 = view.getHeight() * view.getWidth();
                    if (height2 <= 0) {
                        return -1.0f;
                    }
                    return height / height2;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static boolean kg(View view) {
        return view != null && view.isShown();
    }

    private static boolean fxn(View view, int i, boolean z) {
        return (i == 1 && z) ? view.getWidth() > 0 && view.getHeight() > 0 : view.getWidth() >= kg(view, i) && view.getHeight() >= gff(view, i);
    }

    private static int kg(View view, int i) {
        if (i == 3) {
            return (int) (wc.gff(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int gff(View view, int i) {
        if (i == 3) {
            return wc.rb(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int kg(View view, int i, int i2, boolean z) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!kg(view)) {
            return 1;
        }
        if (fxn(view, i2, z)) {
            return !fxn(view, i) ? 3 : 0;
        }
        return 6;
    }

    public static boolean fxn(View view, int i, int i2, boolean z) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof com.bytedance.sdk.openadsdk.core.jq.dx) || (view instanceof com.bytedance.sdk.openadsdk.core.hm.hm)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
            if (z) {
                i = 0;
            }
        }
        return kg(view, i, i2, z) == 0;
    }
}
