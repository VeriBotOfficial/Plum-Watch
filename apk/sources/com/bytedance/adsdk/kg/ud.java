package com.bytedance.adsdk.kg;

/* JADX INFO: loaded from: classes15.dex */
public enum ud {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.bytedance.adsdk.kg.ud$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] r0 = new int[ud.values().length];
            fxn = r0;
            try {
                r0[ud.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[ud.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[ud.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean fxn(int r5, boolean z, int r7) {
        int r0 = AnonymousClass1.fxn[ordinal()];
        if (r0 == 1) {
            return false;
        }
        if (r0 != 2) {
            return (z && r5 < 28) || r7 > 4 || r5 <= 25;
        }
        return true;
    }
}
