package com.baidu.platform.comapi.walknavi.g.i.k;

import java.io.File;

/* compiled from: AssetsUtil.java */
/* loaded from: classes13.dex */
public final class c {
    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        try {
            file.mkdirs();
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
