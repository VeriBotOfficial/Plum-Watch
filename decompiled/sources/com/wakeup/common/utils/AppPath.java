package com.wakeup.common.utils;

import com.blankj.utilcode.util.PathUtils;
import java.io.File;

/* loaded from: classes2.dex */
public class AppPath {
    private static final String TAG = "AppPath";

    public static String getAppImageCache() {
        return isExistDir(PathUtils.getExternalAppDcimPath() + File.separator + "image" + File.separator);
    }

    public static String getAppCache() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/case/");
    }

    public static String getAppOTACache() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/ota/");
    }

    public static String getAppHsOTACache() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/hsOta/");
    }

    public static String getWechatReplyCache() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/wx/");
    }

    public static String getFtpOTACache() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/ftpOta/");
    }

    public static String getCustomFtpOTACache() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/customFtpOta/");
    }

    public static String getTrainVideoCache() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/VideoCache/");
    }

    public static String getTrailDir() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/trail/");
    }

    public static String getMusicDir() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/music/");
    }

    public static String getKoranDir() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/koran/");
    }

    public static String getAliConvertVoiceDir() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/AliVoice/");
    }

    public static String getVoicePath() {
        return isExistDir(PathUtils.getInternalAppFilesPath() + "/voice/");
    }

    public static String getVoiceExternalPath() {
        return isExistDir(PathUtils.getExternalAppFilesPath() + "/voice/");
    }

    public static String getAppLogDir() {
        return isExistDir(PathUtils.getExternalAppFilesPath() + System.getProperty("file.separator") + "log");
    }

    public static String get525LogDir() {
        return isExistDir(PathUtils.getExternalAppFilesPath() + System.getProperty("file.separator") + "525log");
    }

    public static String getLocalMusicDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/localMusic/");
    }

    public static String getLocalMusicDownloadDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/localMusicDownload/");
    }

    public static String getAppMarketDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/appMarket/");
    }

    public static String getLocalRingDownloadDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/localRingDownload/");
    }

    public static String getLocalRingDir() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/ring/");
    }

    public static String getAiLocalFileDir() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/ai/");
    }

    public static String getWxCacheDir() {
        return isExistDir(PathUtils.getInternalAppFilesPath() + "/wx/");
    }

    public static String getTextPath() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/test/");
    }

    public static String getRingCacheDir() {
        return isExistDir(PathUtils.getExternalAppCachePath() + "/ringCache/");
    }

    public static String getEBookDir() {
        return isExistDir(PathUtils.getInternalAppFilesPath() + "/eBook/");
    }

    public static String getEBookDownloadDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/eBookDownload/");
    }

    public static String getGpsDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/gps/");
    }

    public static String getWKVideoDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/wkvideo/");
    }

    public static String getReceiveFileDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/receive/");
    }

    public static String getMemorandumFileDir() {
        return isExistDir(PathUtils.getInternalAppFilesPath() + "/receive/");
    }

    public static String getVideoFileDir() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/video/");
    }

    public static String getAvatarCache() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/avatar/");
    }

    public static String getFriendCache() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/friend/");
    }

    public static String getAlipaySocket() {
        return isExistDir(PathUtils.getExternalAppDownloadPath() + "/alipaysocket/");
    }

    public static String getAiFileDir() {
        return isExistDir(PathUtils.getInternalAppFilesPath() + "/ai/");
    }

    public static String getLiveFileDir() {
        return isExistDir(PathUtils.getInternalAppFilesPath() + "/live/");
    }

    public static String getGlassesDir() {
        return isExistDir(PathUtils.getInternalAppFilesPath() + "/glasses/");
    }

    public static String getGlassesOTACache() {
        return isExistDir(PathUtils.getInternalAppCachePath() + "/glassesOta/");
    }

    private static String isExistDir(String path) {
        com.blankj.utilcode.util.FileUtils.createOrExistsDir(path);
        return path;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(3:2|3|(2:48|49))|(5:6|(2:7|(1:9)(0))|41|(2:43|44)|22)(0)|40|41|(0)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0063, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0064, code lost:
    
        com.wakeup.common.log.LogUtils.e(com.wakeup.common.utils.AppPath.TAG, "IOException:" + r6.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[Catch: IOException -> 0x00cc, TRY_LEAVE, TryCatch #6 {IOException -> 0x00cc, blocks: (B:37:0x00c8, B:30:0x00d0), top: B:36:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005f A[Catch: IOException -> 0x0063, TRY_LEAVE, TryCatch #1 {IOException -> 0x0063, blocks: (B:41:0x005a, B:43:0x005f), top: B:40:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri copyPrivateToDownload(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "IOException:"
            java.lang.String r1 = "AppPath"
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            java.lang.String r3 = "relative_path"
            java.lang.String r4 = "DCIM/"
            r7.put(r3, r4)
            java.lang.String r3 = "_display_name"
            java.lang.String r4 = r2.getName()
            r7.put(r3, r4)
            java.lang.String r3 = "mime_type"
            java.lang.String r4 = "image/png"
            r7.put(r3, r4)
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r7 = r6.insert(r3, r7)
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L80
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L80
            if (r7 == 0) goto L48
            java.io.OutputStream r3 = r6.openOutputStream(r7)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L44
            goto L48
        L3f:
            r6 = move-exception
            r2 = r3
            r3 = r4
            goto Lc6
        L44:
            r6 = move-exception
            r2 = r3
            r3 = r4
            goto L82
        L48:
            if (r3 == 0) goto L5a
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L44
        L4e:
            int r2 = r4.read(r6)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L44
            r5 = -1
            if (r2 == r5) goto L5a
            r5 = 0
            r3.write(r6, r5, r2)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L44
            goto L4e
        L5a:
            r4.close()     // Catch: java.io.IOException -> L63
            if (r3 == 0) goto Lc4
            r3.close()     // Catch: java.io.IOException -> L63
            return r7
        L63:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.wakeup.common.log.LogUtils.e(r1, r6)
            goto Lc4
        L7d:
            r6 = move-exception
            r2 = r3
            goto Lc6
        L80:
            r6 = move-exception
            r2 = r3
        L82:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r4.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r6 = r4.append(r6)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> Lc5
            com.wakeup.common.log.LogUtils.e(r1, r6)     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto La6
            r3.close()     // Catch: java.io.IOException -> La4
            goto La6
        La4:
            r6 = move-exception
            goto Lac
        La6:
            if (r2 == 0) goto Lc4
            r2.close()     // Catch: java.io.IOException -> La4
            goto Lc4
        Lac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.wakeup.common.log.LogUtils.e(r1, r6)
        Lc4:
            return r7
        Lc5:
            r6 = move-exception
        Lc6:
            if (r3 == 0) goto Lce
            r3.close()     // Catch: java.io.IOException -> Lcc
            goto Lce
        Lcc:
            r7 = move-exception
            goto Ld4
        Lce:
            if (r2 == 0) goto Lec
            r2.close()     // Catch: java.io.IOException -> Lcc
            goto Lec
        Ld4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.wakeup.common.log.LogUtils.e(r1, r7)
        Lec:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.utils.AppPath.copyPrivateToDownload(android.content.Context, java.lang.String):android.net.Uri");
    }
}
