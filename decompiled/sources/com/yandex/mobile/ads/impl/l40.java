package com.yandex.mobile.ads.impl;

import android.media.MediaDrm;

/* loaded from: classes5.dex */
final class l40 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        int a2 = f92.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo());
        if (a2 == 2 || a2 == 4) {
            return 6005;
        }
        if (a2 == 10) {
            return 6004;
        }
        if (a2 == 7) {
            return 6005;
        }
        if (a2 == 8) {
            return 6003;
        }
        switch (a2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (a2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }
}
