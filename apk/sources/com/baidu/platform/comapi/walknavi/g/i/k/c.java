package com.baidu.platform.comapi.walknavi.g.i.k;

import java.io.File;

/* JADX INFO: compiled from: AssetsUtil.java */
/* JADX INFO: loaded from: classes15.dex */
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
