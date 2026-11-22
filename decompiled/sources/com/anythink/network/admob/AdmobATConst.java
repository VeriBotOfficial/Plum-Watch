package com.anythink.network.admob;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.common.h.y;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import java.util.Map;

/* loaded from: classes12.dex */
public class AdmobATConst {
    public static final int ADAPTIVE_ANCHORED = 0;
    public static final int ADAPTIVE_INLINE = 1;
    public static final String ADAPTIVE_ORIENTATION = "adaptive_orientation";
    public static final String ADAPTIVE_TYPE = "adaptive_type";
    public static final String ADAPTIVE_WIDTH = "adaptive_width";
    public static final String ADMOB_IS_COLLAPSIBLE = "admob_is_collapsible";
    public static final String CONTENT_KEYWORDS = "admob_keywords";
    public static final String CONTENT_URLS = "admob_content_urls";
    public static final long IMPRESSION_DEALY = 500;
    public static final int NETWORK_FIRM_ID = 2;
    public static final int ORIENTATION_CURRENT = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    public static String TAG = "AdmobATConst";

    /* renamed from: a, reason: collision with root package name */
    private static String f5631a = null;
    private static boolean b = false;

    public static class DEBUGGER_CONFIG {
        public static final int Admob_INTERSTITIAL_IMAGE = 1;
        public static final int Admob_INTERSTITIAL_VIDEO = 2;
        public static final int Admob_NATIVE_IMAGE = 1;
        public static final int Admob_NATIVE_VIDEO = 2;
        public static final int Admob_NETWORK = 2;
    }

    public static class ORIENTATION {
        public static final int LANDSCAPE = 2;
        public static final int PORTRAIT = 1;
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_AMOUNT = "admob_reward_amount";
        public static final String REWARD_EXTRA_KEY_REWARD_TYPE = "admob_reward_type";
    }

    public static String getNetworkVersion() {
        String str = f5631a;
        if (str != null) {
            return str;
        }
        try {
            String versionInfo = MobileAds.getVersion().toString();
            f5631a = versionInfo;
            return versionInfo;
        } catch (Throwable unused) {
            f5631a = "";
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x010d A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:18:0x00f6, B:20:0x010d, B:25:0x0070, B:26:0x0076, B:27:0x007e, B:35:0x00c6, B:36:0x00c9, B:37:0x00eb, B:38:0x00ee, B:39:0x00f1, B:40:0x00f4, B:41:0x0082, B:44:0x008c, B:47:0x0096, B:50:0x00a0, B:53:0x00a9, B:56:0x00b1), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static com.google.android.gms.ads.AdSize a(android.content.Context r6, java.util.Map<java.lang.String, java.lang.Object> r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.admob.AdmobATConst.a(android.content.Context, java.util.Map, java.util.Map):com.google.android.gms.ads.AdSize");
    }

    private static AdSize a(Context context, Map<String, Object> map, int i) {
        int intFromMap = ATInitMediation.getIntFromMap(map, ADAPTIVE_TYPE, 0);
        int intFromMap2 = ATInitMediation.getIntFromMap(map, ADAPTIVE_ORIENTATION, 0);
        int a2 = a(context, i);
        if (intFromMap2 == 1) {
            if (intFromMap == 1) {
                return AdSize.getPortraitInlineAdaptiveBannerAdSize(context, a2);
            }
            return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, a2);
        }
        if (intFromMap2 != 2) {
            if (intFromMap == 1) {
                return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, a2);
            }
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, a2);
        }
        if (intFromMap == 1) {
            return AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, a2);
        }
        return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, a2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static AdSize a(Context context, String str) {
        char c;
        switch (str.hashCode()) {
            case -1306012042:
                if (str.equals(sg.bigo.ads.api.AdSize.ADAPTIVE)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -559799608:
                if (str.equals(y.c)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -502542422:
                if (str.equals("320x100")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1507809730:
                if (str.equals(y.f3939a)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1540371324:
                if (str.equals("468x60")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1622564786:
                if (str.equals(y.d)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return AdSize.LARGE_BANNER;
        }
        if (c == 1) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        if (c == 2) {
            return AdSize.FULL_BANNER;
        }
        if (c == 3) {
            return AdSize.LEADERBOARD;
        }
        if (c == 4) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, a(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels)));
        }
        return AdSize.BANNER;
    }

    private static int a(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    private static int a(Context context) {
        return (int) ((context.getResources().getDisplayMetrics().density * 300.0f) + 0.5f);
    }

    public static void setDisableAutoUseAdaptiveBanner(boolean z) {
        Log.e(TAG, "setDisableAutoUseAdaptiveBanner: ".concat(String.valueOf(z)));
        b = z;
    }
}
