package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.e9;
import com.amap.api.col.p0003sl.ea;
import com.amap.api.col.p0003sl.m9;
import com.amap.api.col.p0003sl.z8;

/* loaded from: classes12.dex */
public class UrlUtil {
    public static final String AMAP_HOST_ALOC_CONTROL_PLUS_AMAP_COM = "aloc-control-plus.amap.com";
    public static final String AMAP_HOST_ALOC_MODELDATA_AMAP_COM = "aloc-modeldata.amap.com";
    public static final String AMAP_HOST_ALOC_OFFLINE_AMAP_COM = "aloc-offline.amap.com";
    public static final String AMAP_HOST_APS_AMAP_COM = "aps.amap.com";
    public static final String AMAP_HOST_CGICOL_AMAP_COM = "cgicol.amap.com";
    public static final String AMAP_PATH_ALOC_UPDATABLE = "/aloc/updatable";
    public static final String AMAP_PATH_APS_R = "/APS/r";
    public static final String AMAP_PATH_COLLECTION_COLLECTDATA = "/collection/collectData";
    public static final String AMAP_PATH_DATAPIPELINE_UPLOADDATA = "/dataPipeline/uploadData";
    public static final String AMAP_PATH_LOADOFFLINEDATA_REPEATDATA = "/LoadOfflineData/repeatData";
    public static final String AMAP_PATH_MODEL_GET = "/model/get";
    public static final String OPEN_HOST_OUTOFCN_SERVER = "abroad.apilocate.amap.com";
    public static final String OPEN_HOST_PRE = "apilocate-pre-test.amap.com";
    public static final String OPEN_HOST_REL_V4 = "apilocate.amap.com";
    public static final String OPEN_HOST_REL_V6 = "dualstack-a.apilocate.amap.com";
    public static final String OPEN_PATH_ALOC_UPDATABLE = "/v5/aloc/updatable";
    public static final String OPEN_PATH_COLLECTION_COLLECTDATA = "/v5/collection/collectData";
    public static final String OPEN_PATH_DATAPIPELINE_UPLOADDATA = "/v5/dataPipeline/uploadData";
    public static final String OPEN_PATH_LOADOFFLINEDATA_REPEATDATA = "/v5/LoadOfflineData/repeatData";
    public static final String OPEN_PATH_MOBILE_BINARY = "/v5/mobile/binary";
    public static final String OPEN_PATH_MODEL_GET = "/v5/model/get";
    public static final int TYPE_IPV4 = 0;
    public static final int TYPE_IPV6 = 1;

    private static String a(Context context, String str) {
        return !TextUtils.isEmpty(str) ? Separators.QUESTION + str + "&key=" + z8.e(context) : "?&key=" + z8.e(context);
    }

    public static String getHost(Context context, int i) {
        e9 b = e9.b(context);
        String a2 = b.a(43);
        int i2 = m9.d;
        return ea.a(context, false) ? b.a(40) : i != 1 ? a2 : b.a(44);
    }

    public static boolean isNeedTransform(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(AMAP_PATH_APS_R) || str.contains(AMAP_PATH_LOADOFFLINEDATA_REPEATDATA) || str.contains(AMAP_PATH_DATAPIPELINE_UPLOADDATA) || str.contains(AMAP_PATH_MODEL_GET) || str.contains(AMAP_PATH_COLLECTION_COLLECTDATA) || str.contains(AMAP_PATH_ALOC_UPDATABLE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: MalformedURLException -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {MalformedURLException -> 0x00b8, blocks: (B:3:0x0005, B:5:0x002b, B:7:0x0065, B:10:0x00a9, B:14:0x0073, B:17:0x007e, B:20:0x0089, B:23:0x0094, B:26:0x009f, B:29:0x0031, B:31:0x0039, B:32:0x003e, B:34:0x0046, B:35:0x004b, B:37:0x0053, B:38:0x0058, B:40:0x0060), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String urlTransform(android.content.Context r5, int r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lb8
            r1.<init>(r7)     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r7 = r1.getHost()     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r2 = r1.getPath()     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r3 = r1.getQuery()     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r1 = r1.getProtocol()     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r4 = "://"
            r1.append(r4)     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r1 = "aps.amap.com"
            boolean r1 = android.text.TextUtils.equals(r1, r7)     // Catch: java.net.MalformedURLException -> Lb8
            if (r1 == 0) goto L31
            java.lang.String r6 = getHost(r5, r6)     // Catch: java.net.MalformedURLException -> Lb8
        L2f:
            r7 = r6
            goto L65
        L31:
            java.lang.String r1 = "aloc-offline.amap.com"
            boolean r1 = android.text.TextUtils.equals(r1, r7)     // Catch: java.net.MalformedURLException -> Lb8
            if (r1 == 0) goto L3e
            java.lang.String r6 = getHost(r5, r6)     // Catch: java.net.MalformedURLException -> Lb8
            goto L2f
        L3e:
            java.lang.String r1 = "cgicol.amap.com"
            boolean r1 = android.text.TextUtils.equals(r1, r7)     // Catch: java.net.MalformedURLException -> Lb8
            if (r1 == 0) goto L4b
            java.lang.String r6 = getHost(r5, r6)     // Catch: java.net.MalformedURLException -> Lb8
            goto L2f
        L4b:
            java.lang.String r1 = "aloc-modeldata.amap.com"
            boolean r1 = android.text.TextUtils.equals(r1, r7)     // Catch: java.net.MalformedURLException -> Lb8
            if (r1 == 0) goto L58
            java.lang.String r6 = getHost(r5, r6)     // Catch: java.net.MalformedURLException -> Lb8
            goto L2f
        L58:
            java.lang.String r1 = "aloc-control-plus.amap.com"
            boolean r1 = android.text.TextUtils.equals(r1, r7)     // Catch: java.net.MalformedURLException -> Lb8
            if (r1 == 0) goto L65
            java.lang.String r6 = getHost(r5, r6)     // Catch: java.net.MalformedURLException -> Lb8
            goto L2f
        L65:
            r0.append(r7)     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r6 = "/APS/r"
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch: java.net.MalformedURLException -> Lb8
            if (r6 == 0) goto L73
            java.lang.String r2 = "/v5/mobile/binary"
            goto La9
        L73:
            java.lang.String r6 = "/LoadOfflineData/repeatData"
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch: java.net.MalformedURLException -> Lb8
            if (r6 == 0) goto L7e
            java.lang.String r2 = "/v5/LoadOfflineData/repeatData"
            goto La9
        L7e:
            java.lang.String r6 = "/dataPipeline/uploadData"
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch: java.net.MalformedURLException -> Lb8
            if (r6 == 0) goto L89
            java.lang.String r2 = "/v5/dataPipeline/uploadData"
            goto La9
        L89:
            java.lang.String r6 = "/model/get"
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch: java.net.MalformedURLException -> Lb8
            if (r6 == 0) goto L94
            java.lang.String r2 = "/v5/model/get"
            goto La9
        L94:
            java.lang.String r6 = "/collection/collectData"
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch: java.net.MalformedURLException -> Lb8
            if (r6 == 0) goto L9f
            java.lang.String r2 = "/v5/collection/collectData"
            goto La9
        L9f:
            java.lang.String r6 = "/aloc/updatable"
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch: java.net.MalformedURLException -> Lb8
            if (r6 == 0) goto La9
            java.lang.String r2 = "/v5/aloc/updatable"
        La9:
            r0.append(r2)     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r5 = a(r5, r3)     // Catch: java.net.MalformedURLException -> Lb8
            r0.append(r5)     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r5 = r0.toString()     // Catch: java.net.MalformedURLException -> Lb8
            return r5
        Lb8:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.aps.amapapi.utils.UrlUtil.urlTransform(android.content.Context, int, java.lang.String):java.lang.String");
    }
}
