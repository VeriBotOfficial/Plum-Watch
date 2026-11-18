package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes8.dex */
public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    public static DisplayManagerCompat getInstance(Context context) {
        return new DisplayManagerCompat(context);
    }

    public Display getDisplay(int r3) {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplay(r3);
    }

    public Display[] getDisplays() {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }

    public Display[] getDisplays(String str) {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }
}
