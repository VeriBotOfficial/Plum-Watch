package com.reactnativecommunity.cameraroll;

import android.webkit.MimeTypeMap;

/* loaded from: classes17.dex */
public class Utils {
    public static String getMimeType(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : null;
        if (substring != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
        }
        return null;
    }

    public static String getExtension(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
    }
}
