package com.iflytek.cloud.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes17.dex */
public class ResourceUtil {
    public static final String ASR_RES_PATH = "asr_res_path";
    public static final String ENGINE_DESTROY = "engine_destroy";
    public static final String ENGINE_START = "engine_start";
    public static final String GRM_BUILD_PATH = "grm_build_path";
    public static final String IVW_RES_PATH = "ivw_res_path";
    public static final String TTS_RES_PATH = "tts_res_path";

    public enum RESOURCE_TYPE {
        assets,
        res,
        path
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.content.res.AssetFileDescriptor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r7, com.iflytek.cloud.util.ResourceUtil.RESOURCE_TYPE r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "|"
            java.lang.String r1 = "fo|"
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            r3 = 0
            if (r2 != 0) goto L83
            if (r7 != 0) goto L10
            goto L83
        L10:
            java.lang.String r2 = r7.getPackageResourcePath()
            com.iflytek.cloud.util.ResourceUtil$RESOURCE_TYPE r4 = com.iflytek.cloud.util.ResourceUtil.RESOURCE_TYPE.assets     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            if (r8 != r4) goto L2b
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            android.content.res.AssetFileDescriptor r7 = r7.openFd(r9)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            long r8 = r7.getStartOffset()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            long r4 = r7.getLength()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            goto L43
        L29:
            r8 = move-exception
            goto L68
        L2b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            android.content.res.AssetFileDescriptor r7 = r7.openRawResourceFd(r8)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            long r8 = r7.getStartOffset()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            long r4 = r7.getLength()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
        L43:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            r6.<init>(r1)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = r6.append(r2)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            java.lang.StringBuilder r8 = r1.append(r8)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            java.lang.StringBuilder r8 = r8.append(r0)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            java.lang.StringBuilder r8 = r8.append(r4)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L76
            r7.close()     // Catch: java.lang.Exception -> L71
            return r3
        L64:
            r8 = move-exception
            goto L78
        L66:
            r8 = move-exception
            r7 = r3
        L68:
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r8)     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L75
            r7.close()     // Catch: java.lang.Exception -> L71
            goto L75
        L71:
            r7 = move-exception
            r7.printStackTrace()
        L75:
            return r3
        L76:
            r8 = move-exception
            r3 = r7
        L78:
            if (r3 == 0) goto L82
            r3.close()     // Catch: java.lang.Exception -> L7e
            goto L82
        L7e:
            r7 = move-exception
            r7.printStackTrace()
        L82:
            throw r8
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.ResourceUtil.a(android.content.Context, com.iflytek.cloud.util.ResourceUtil$RESOURCE_TYPE, java.lang.String):java.lang.String");
    }

    public static String generateResourcePath(Context context, RESOURCE_TYPE resource_type, String str) {
        return resource_type == RESOURCE_TYPE.path ? a(str) : a(context, resource_type, str);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        return "fo|" + str + "|0|" + file.length();
    }
}
