package com.anythink.basead.ui.f;

import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.common.h.x;

/* loaded from: classes11.dex */
public final class b {

    public interface a {
        void a(int i, int i2);
    }

    public static void a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = 0;
        if (z) {
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }

    private static float a(com.anythink.basead.ui.b bVar, boolean z, x xVar) {
        return a(bVar, z, xVar, true);
    }

    public static float a(com.anythink.basead.ui.b bVar, boolean z, x xVar, boolean z2) {
        int i;
        if (xVar == null || xVar.o == null) {
            i = 1;
        } else if (z) {
            i = xVar.o.q();
        } else {
            i = xVar.o.r();
        }
        float f = 1.0f;
        if (bVar != null) {
            if (i == 2) {
                f = 1.5f;
            } else if (i == 3) {
                f = 0.75f;
            } else if (i == 4) {
                f = 0.5f;
            }
            a(bVar, f, (z && z2) ? 1.0d : (xVar == null || xVar.o == null) ? 1.0d : xVar.o.bx());
        }
        return f;
    }

    public static void a(com.anythink.basead.ui.b bVar, float f, double d) {
        if (bVar != null) {
            bVar.setClickAreaScaleFactor(f);
            bVar.setClickViewAlpha(d);
        }
    }

    public static boolean a(long j, x xVar) {
        if (xVar != null && xVar.o != null && xVar.o.by() < 0) {
            return true;
        }
        if (j <= 0) {
            return false;
        }
        return xVar == null || xVar.o == null || System.currentTimeMillis() - j > xVar.o.by();
    }
}
