package com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache;

import com.luck.picture.lib.config.PictureMimeType;

/* loaded from: classes17.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f13016a = {PictureMimeType.MP4, ".m4v", ".3gp", ".3gpp", ".webm", ".mkv", PictureMimeType.AVI, ".mov", ".flv", ".ts", ".m3u8", ".mpd"};

    private e() {
    }

    public static boolean a(String str) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(str)) {
            return false;
        }
        try {
            int indexOf = str.indexOf(63);
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(35);
            if (indexOf2 > 0) {
                str = str.substring(0, indexOf2);
            }
            String lowerCase = str.toLowerCase();
            for (String str2 : f13016a) {
                if (lowerCase.endsWith(str2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
