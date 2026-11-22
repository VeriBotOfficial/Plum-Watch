package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg;
import com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.fxn;
import com.bytedance.sdk.component.utils.sg;
import com.bytedance.sdk.openadsdk.core.rmu;
import java.io.File;

/* loaded from: classes14.dex */
public class CacheDirFactory {
    public static volatile kg MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String fxn;

    public static int getCacheType() {
        return 1;
    }

    private static kg fxn() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    fxn fxnVar = new fxn();
                    MEDIA_CACHE_DIR = fxnVar;
                    fxnVar.fxn(getRootDir());
                    MEDIA_CACHE_DIR.hm();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fxn2 = sg.fxn(rmu.fxn(), com.bytedance.sdk.openadsdk.multipro.kg.gff(), "tt_ad");
        if (fxn2.isFile()) {
            fxn2.delete();
        }
        if (!fxn2.exists()) {
            fxn2.mkdirs();
        }
        String absolutePath = fxn2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static kg getICacheDir(int i) {
        return fxn();
    }

    public static String getImageCacheDir(String str) {
        if (fxn == null) {
            fxn = getDiskCacheDirPath(str);
        }
        return fxn;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
