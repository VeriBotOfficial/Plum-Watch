package com.caverock.androidsvg;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
class CanvasLegacy {
    static final int MATRIX_SAVE_FLAG;
    private static final Method SAVE;

    CanvasLegacy() {
    }

    static {
        try {
            MATRIX_SAVE_FLAG = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            SAVE = Canvas.class.getMethod("save", Integer.TYPE);
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    static void save(Canvas canvas, int r2) {
        try {
            SAVE.invoke(canvas, Integer.valueOf(r2));
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    private static RuntimeException sneakyThrow(Throwable th) {
        if (th == null) {
            throw new NullPointerException(ak.aH);
        }
        return (RuntimeException) sneakyThrow0(th);
    }

    private static <T extends Throwable> T sneakyThrow0(Throwable th) throws Throwable {
        throw th;
    }
}
