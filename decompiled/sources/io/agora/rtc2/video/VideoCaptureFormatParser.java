package io.agora.rtc2.video;

import java.util.ArrayList;

/* loaded from: classes6.dex */
class VideoCaptureFormatParser {
    VideoCaptureFormatParser() {
    }

    public static String toString(VideoCaptureFormat[] videoCaptureFormatArr) {
        String str = "";
        if (videoCaptureFormatArr == null) {
            return "";
        }
        for (int i = 0; i < videoCaptureFormatArr.length; i++) {
            str = str + videoCaptureFormatArr[i].toString();
            if (i != videoCaptureFormatArr.length - 1) {
                str = str + "/";
            }
        }
        return str;
    }

    public static VideoCaptureFormat[] fromString(String str) {
        VideoCaptureFormat fromString;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("/")) {
            if (str2 != null && !str2.isEmpty() && (fromString = VideoCaptureFormat.fromString(str2)) != null) {
                arrayList.add(fromString);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (VideoCaptureFormat[]) arrayList.toArray(new VideoCaptureFormat[arrayList.size()]);
    }
}
