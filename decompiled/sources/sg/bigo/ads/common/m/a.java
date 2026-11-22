package sg.bigo.ads.common.m;

import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f19647a = {1, 3, 4, 2, 7, 9, 10};
    private static final int[] b = {2, 7, 9, 10};

    public static boolean a() {
        String str;
        String valueOf;
        String str2;
        if (b()) {
            String b2 = b.b();
            if (q.a((CharSequence) b2)) {
                sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", "purposeConsents is empty, so return true");
            } else {
                if (b2.length() < 11) {
                    str2 = "purposeConsents length < 11, so return false";
                    sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", str2);
                    return false;
                }
                for (int i : f19647a) {
                    if (b2.charAt(i - 1) == '0') {
                        str = "purposeConsents return false ,the checkBit is: ";
                        valueOf = String.valueOf(i);
                        break;
                    }
                }
            }
            String d = b.d();
            if (q.a((CharSequence) d)) {
                sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", "purposeLegitimateInterests is empty, so return true");
            } else {
                if (d.length() < 11) {
                    str2 = "purposeLegitimateInterests length < 11, so return false";
                    sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", str2);
                    return false;
                }
                for (int i2 : b) {
                    if (d.charAt(i2 - 1) == '0') {
                        str = "purposeLegitimateInterests return false ,the checkBit is: ";
                        valueOf = String.valueOf(i2);
                        str2 = str.concat(valueOf);
                        sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", str2);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean b() {
        return b.c() == 1;
    }
}
