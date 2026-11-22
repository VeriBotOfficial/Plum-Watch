package sg.bigo.ads.api;

import android.content.Context;
import com.anythink.core.common.h.y;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;

/* loaded from: classes7.dex */
public final class AdSize extends p {
    public static final String ADAPTIVE = "adaptive";
    private static p d;

    /* renamed from: a, reason: collision with root package name */
    public final String f19514a;
    public static final AdSize BANNER = new AdSize(320, 50, y.f3939a);
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, y.c);
    public static final AdSize LARGE_BANNER = new AdSize(320, 90, y.b);
    public static final AdSize MOBILE_LARGE_LEADERBOARD = new AdSize(320, 100, "320x100");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, y.d);

    private AdSize(int i, int i2, String str) {
        super(i, i2);
        this.f19514a = str;
    }

    public static int dp2px(Context context, int i) {
        if (context == null) {
            return 0;
        }
        return e.a(context, i);
    }

    public static AdSize getAdaptiveAdSize(Context context, int i) {
        float f;
        float f2;
        int i2;
        if (context == null || i == 0) {
            return BANNER;
        }
        if (d == null) {
            d = e.e(context);
        }
        int height = d.getHeight();
        if (height <= 0) {
            return BANNER;
        }
        int min = Math.min(90, Math.round(height * 0.15f));
        if (i < 0) {
            i = d.getWidth();
        }
        if (i <= 655) {
            if (i > 632) {
                i2 = 81;
            } else if (i > 526) {
                f = i / 468.0f;
                f2 = 60.0f;
            } else if (i > 432) {
                i2 = 68;
            } else {
                f = i / 320.0f;
                f2 = 50.0f;
            }
            return new AdSize(i, Math.max(Math.min(i2, min), 50), ADAPTIVE);
        }
        f = i / 728.0f;
        f2 = 90.0f;
        i2 = Math.round(f * f2);
        return new AdSize(i, Math.max(Math.min(i2, min), 50), ADAPTIVE);
    }

    @Override // sg.bigo.ads.common.p
    public final int getHeight() {
        return super.getHeight();
    }

    @Override // sg.bigo.ads.common.p
    public final int getWidth() {
        return super.getWidth();
    }
}
