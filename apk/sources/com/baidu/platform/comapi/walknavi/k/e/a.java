package com.baidu.platform.comapi.walknavi.k.e;

import android.os.Bundle;

/* JADX INFO: compiled from: SimpleGuideModel.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {
    private static Bundle a(Bundle bundle, int r1, int r2) {
        return bundle;
    }

    public static Bundle a(Bundle bundle, int r2, int r3, int r4) {
        bundle.putInt("updatetype", r2);
        if (r2 == 1) {
            return a(bundle, r3, r4);
        }
        if (r2 == 2) {
            return b(bundle, r3, r4);
        }
        return null;
    }

    private static Bundle b(Bundle bundle, int r2, int r3) {
        bundle.putInt("totaldist", r2);
        bundle.putInt("totaltime", r3);
        return bundle;
    }
}
