package com.baidu.ar.bean;

import android.text.TextUtils;
import com.baidu.ar.k8;

/* loaded from: classes12.dex */
public class ARConfig {
    private static final String AR_SDK_SALT_FIGURE = "777078ec21930de508131ba36035de6b";
    public static final int LAUNCH_AR_TAB = 2;
    public static final int LAUNCH_AR_TAB_CASE = 3;
    public static final int LAUNCH_MODE_H5 = 1;
    public static final int LAUNCH_MODE_TAKE_PICTURE = 0;
    public static int TYPE_VPS = 11;
    public static boolean isQAMockOpen = false;
    private static String mARExtraInfo = "";
    private static String mARId = null;
    private static int mARInitialType = -1;
    private static String mARKey = null;
    private static int mARLaunchMode = 0;
    private static String mARPath = null;
    private static int mARType = -1;
    private static String mArFrom = null;
    private static String mArValue = null;
    private static boolean mIsNeedLastPreview = false;
    private static String mNavigation3DofARKey = "10327252";
    private static String mNavigation3DofNpcARKey = "10327190";
    private static String mNavigation6DofARKey = "10327251";
    private static String mNavigation6DofNpcARKey = "10326330";
    private static String sCUID = "";
    public static String sFeaPointsDir;

    public static String getARExtraInfo() {
        return mARExtraInfo;
    }

    public static String getARId() {
        return mARId;
    }

    public static int getARInitialType() {
        return mARInitialType;
    }

    public static String getARKey() {
        return mARKey;
    }

    public static int getARLaunchMode() {
        return mARLaunchMode;
    }

    public static String getARPath() {
        return mARPath;
    }

    public static int getARType() {
        return mARType;
    }

    public static String getArFrom() {
        return mArFrom;
    }

    public static String getArValue() {
        return mArValue;
    }

    public static String getCUID() {
        return sCUID;
    }

    public static String getNavigation3DofARKey() {
        return mNavigation3DofARKey;
    }

    public static String getNavigation3DofNpcARKey() {
        return mNavigation3DofNpcARKey;
    }

    public static String getNavigation6DofARKey() {
        return mNavigation6DofARKey;
    }

    public static String getNavigation6DofNpcARKey() {
        return mNavigation6DofNpcARKey;
    }

    public static Object[] getSignatureAndTime() {
        return getSignatureAndTime(DuMixARConfig.getAipAppId(), DuMixARConfig.getAPIKey());
    }

    public static Object[] getSignatureAndTime(String str, String str2) {
        Object[] objArr = new Object[2];
        long currentTimeMillis = System.currentTimeMillis();
        if (isOpen(str)) {
            objArr[0] = k8.b(str + AR_SDK_SALT_FIGURE + currentTimeMillis);
        } else {
            objArr[0] = k8.b(str + str2 + AR_SDK_SALT_FIGURE + currentTimeMillis);
        }
        objArr[1] = Long.valueOf(currentTimeMillis);
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098 A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[Catch: Exception -> 0x00e6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066 A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004a A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[Catch: Exception -> 0x00e6, TryCatch #1 {Exception -> 0x00e6, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0030, B:9:0x0039, B:10:0x003f, B:13:0x0050, B:14:0x0056, B:16:0x005c, B:17:0x0074, B:19:0x007a, B:20:0x0080, B:22:0x0086, B:23:0x0092, B:25:0x0098, B:26:0x009c, B:30:0x00ab, B:33:0x00bb, B:34:0x00be, B:36:0x00c4, B:37:0x00cb, B:39:0x00d1, B:40:0x00d8, B:42:0x00de, B:47:0x008b, B:49:0x0066, B:50:0x004a, B:54:0x0024), top: B:2:0x0014, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void initARConfig(java.lang.String r12) {
        /*
            java.lang.String r0 = "extra_info"
            java.lang.String r1 = "ar_last_preview"
            java.lang.String r2 = "ar_from"
            java.lang.String r3 = "ar_id"
            java.lang.String r4 = "ar_launch_mode"
            java.lang.String r5 = "arType"
            java.lang.String r6 = "ar_type"
            java.lang.String r7 = "ar_path"
            java.lang.String r8 = "arKey"
            java.lang.String r9 = "ar_key"
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le6
            r10.<init>(r12)     // Catch: java.lang.Exception -> Le6
            com.baidu.ar.bean.ARConfig.mArValue = r12     // Catch: java.lang.Exception -> Le6
            boolean r12 = r10.has(r9)     // Catch: java.lang.Exception -> Le6
            r11 = 0
            if (r12 == 0) goto L24
            r8 = r9
            goto L2a
        L24:
            boolean r12 = r10.has(r8)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto L2f
        L2a:
            java.lang.String r12 = r10.getString(r8)     // Catch: java.lang.Exception -> Le6
            goto L30
        L2f:
            r12 = r11
        L30:
            setARKey(r12)     // Catch: java.lang.Exception -> Le6
            boolean r12 = r10.has(r7)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto L3e
            java.lang.String r12 = r10.getString(r7)     // Catch: java.lang.Exception -> Le6
            goto L3f
        L3e:
            r12 = r11
        L3f:
            setARPath(r12)     // Catch: java.lang.Exception -> Le6
            boolean r12 = r10.has(r6)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto L4a
            r5 = r6
            goto L50
        L4a:
            boolean r12 = r10.has(r5)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto L55
        L50:
            java.lang.String r12 = r10.getString(r5)     // Catch: java.lang.Exception -> Le6
            goto L56
        L55:
            r12 = r11
        L56:
            boolean r5 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Le6
            if (r5 == 0) goto L66
            com.baidu.ar.ARType r12 = com.baidu.ar.ARType.TRACK_2D     // Catch: java.lang.Exception -> Le6
            int r12 = r12.getTypeValue()     // Catch: java.lang.Exception -> Le6
            setARType(r12)     // Catch: java.lang.Exception -> Le6
            goto L74
        L66:
            int r5 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Exception -> Le6
            setARType(r5)     // Catch: java.lang.Exception -> Le6
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Exception -> Le6
            setARInitialType(r12)     // Catch: java.lang.Exception -> Le6
        L74:
            boolean r12 = r10.has(r4)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto L7f
            java.lang.String r12 = r10.getString(r4)     // Catch: java.lang.Exception -> Le6
            goto L80
        L7f:
            r12 = r11
        L80:
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Le6
            if (r4 == 0) goto L8b
            r12 = 0
            setARLaunchMode(r12)     // Catch: java.lang.Exception -> Le6
            goto L92
        L8b:
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Exception -> Le6
            setARLaunchMode(r12)     // Catch: java.lang.Exception -> Le6
        L92:
            boolean r12 = r10.has(r3)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto L9c
            java.lang.String r11 = r10.getString(r3)     // Catch: java.lang.Exception -> Le6
        L9c:
            setARId(r11)     // Catch: java.lang.Exception -> Le6
            java.lang.String r12 = getARKey()     // Catch: java.lang.Exception -> Le6
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto Lbe
            if (r11 == 0) goto Lbe
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lba java.lang.Exception -> Le6
            r12.<init>(r11)     // Catch: org.json.JSONException -> Lba java.lang.Exception -> Le6
            java.lang.String r3 = "content_id"
            java.lang.String r12 = r12.optString(r3)     // Catch: org.json.JSONException -> Lba java.lang.Exception -> Le6
            setARKey(r12)     // Catch: org.json.JSONException -> Lba java.lang.Exception -> Le6
            goto Lbe
        Lba:
            r12 = move-exception
            r12.printStackTrace()     // Catch: java.lang.Exception -> Le6
        Lbe:
            boolean r12 = r10.has(r2)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto Lcb
            java.lang.String r12 = r10.getString(r2)     // Catch: java.lang.Exception -> Le6
            setArFrom(r12)     // Catch: java.lang.Exception -> Le6
        Lcb:
            boolean r12 = r10.has(r1)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto Ld8
            boolean r12 = r10.getBoolean(r1)     // Catch: java.lang.Exception -> Le6
            setIsNeedLastPreview(r12)     // Catch: java.lang.Exception -> Le6
        Ld8:
            boolean r12 = r10.has(r0)     // Catch: java.lang.Exception -> Le6
            if (r12 == 0) goto Lea
            java.lang.String r12 = r10.getString(r0)     // Catch: java.lang.Exception -> Le6
            setARExtraInfo(r12)     // Catch: java.lang.Exception -> Le6
            goto Lea
        Le6:
            r12 = move-exception
            r12.printStackTrace()
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.bean.ARConfig.initARConfig(java.lang.String):void");
    }

    public static boolean isBox() {
        return "2".equals(DuMixARConfig.getAipAppId()) && !"com.baidu.ar.boxdemo".equals(DuMixARConfig.getPackageName());
    }

    public static boolean isNeedLastPreview() {
        return mIsNeedLastPreview;
    }

    public static boolean isOpen() {
        return isOpen(DuMixARConfig.getAipAppId());
    }

    public static boolean isOpen(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Long.parseLong(str) > 10000;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setARExtraInfo(String str) {
        mARExtraInfo = str;
    }

    public static void setARId(String str) {
        mARId = str;
    }

    public static void setARInitialType(int i) {
        mARInitialType = i;
    }

    public static void setARKey(String str) {
        mARKey = str;
    }

    public static void setARLaunchMode(int i) {
        mARLaunchMode = i;
    }

    public static void setARPath(String str) {
        mARPath = str;
    }

    public static void setARType(int i) {
        mARType = i;
    }

    public static void setArFrom(String str) {
        mArFrom = str;
    }

    public static void setCUID(String str) {
        sCUID = str;
    }

    public static void setIsNeedLastPreview(boolean z) {
        mIsNeedLastPreview = z;
    }
}
