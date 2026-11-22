package com.baidu.platform.comapi.walknavi.k.e;

import android.os.Bundle;

/* compiled from: SimpleGuideModel.java */
/* loaded from: classes13.dex */
public class a {
    private static Bundle a(Bundle bundle, int i, int i2) {
        return bundle;
    }

    public static Bundle a(Bundle bundle, int i, int i2, int i3) {
        bundle.putInt("updatetype", i);
        if (i == 1) {
            return a(bundle, i2, i3);
        }
        if (i == 2) {
            return b(bundle, i2, i3);
        }
        return null;
    }

    private static Bundle b(Bundle bundle, int i, int i2) {
        bundle.putInt("totaldist", i);
        bundle.putInt("totaltime", i2);
        return bundle;
    }
}
