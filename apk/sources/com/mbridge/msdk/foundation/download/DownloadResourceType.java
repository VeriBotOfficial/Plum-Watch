package com.mbridge.msdk.foundation.download;

/* JADX INFO: loaded from: classes2.dex */
public enum DownloadResourceType {
    DOWNLOAD_RESOURCE_TYPE_VIDEO(0),
    DOWNLOAD_RESOURCE_TYPE_ZIP(1),
    DOWNLOAD_RESOURCE_TYPE_IMAGE(2),
    DOWNLOAD_RESOURCE_TYPE_HTML(3),
    DOWNLOAD_RESOURCE_TYPE_OTHER(4),
    DOWNLOAD_RESOURCE_TYPE_APK(5);

    public int resourceType;

    DownloadResourceType(int r3) {
        this.resourceType = r3;
    }

    public static DownloadResourceType getDownloadResourceType(int r1) {
        if (r1 == 0) {
            return DOWNLOAD_RESOURCE_TYPE_VIDEO;
        }
        if (r1 == 1) {
            return DOWNLOAD_RESOURCE_TYPE_ZIP;
        }
        if (r1 == 2) {
            return DOWNLOAD_RESOURCE_TYPE_IMAGE;
        }
        if (r1 == 3) {
            return DOWNLOAD_RESOURCE_TYPE_HTML;
        }
        if (r1 == 4) {
            return DOWNLOAD_RESOURCE_TYPE_OTHER;
        }
        if (r1 != 5) {
            return null;
        }
        return DOWNLOAD_RESOURCE_TYPE_APK;
    }
}
