package com.reactnativecommunity.cameraroll;

import android.webkit.MimeTypeMap;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    public static String getMimeType(String str) {
        int r0 = str.lastIndexOf(46);
        String strSubstring = r0 >= 0 ? str.substring(r0 + 1) : null;
        if (strSubstring != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring);
        }
        return null;
    }

    public static String getExtension(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
    }
}
