package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.e9;
import com.amap.api.col.p0003sl.ea;
import com.amap.api.col.p0003sl.i9;
import com.amap.api.col.p0003sl.ja;
import com.amap.api.col.p0003sl.l9;
import com.amap.api.col.p0003sl.m9;
import com.amap.api.col.p0003sl.y8;
import com.amap.api.col.p0003sl.z8;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.security.Encrypt;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class CoreUtil {
    public static final String AMAP_LICENSE = "S128DF1572465B890OE3F7A13167KLEI";
    public static final String AMAP_SRC = "api_serverSDK_130905";
    public static final boolean B_FILTER_GPS2LBS = false;
    public static final String CODE_UTF8 = "UTF-8";
    public static String ENGINE_VERSION = "5.3";
    public static final String HTTP_HEADER_USER_AGENT = "AMAP_Location_SDK_Android 11.1.260";
    public static final float LOCATIONDIS = 0.0f;
    public static final String PRODUCT_FIRST_LOC = "locf";
    public static final String SDK_NAME = "loc";
    public static final String STR_API_DEFAULT_DNS_HOST = "httpdns.apilocate.amap.com";
    public static final String STR_API_DNS_SERVER = "http://httpdns.apilocate.amap.com/mobile/binary";
    public static final String STR_API_INOFCN_HOST = "apilocate.amap.com";
    public static final String STR_API_INOFCN_HOST_IPV6 = "apilocate.amap.com";
    public static final String STR_API_INOFCN_IPV6_SERVER = "http://a.apilocate.amap.com/mobile/binary";
    public static final String STR_API_INOFCN_SERVER = "http://apilocate.amap.com/mobile/binary";
    public static final String STR_API_INOFCN_STATIC_HOST = "a.apilocate.amap.com";
    public static final String STR_API_OUTOFCN_HOST = "abroad.apilocate.amap.com";
    public static final String STR_API_OUTOFCN_SERVER = "http://abroad.apilocate.amap.com/mobile/binary";
    public static final String STR_CONFIG_VERSION = "11.1.260";
    public static final String STR_DEX_COLLECTION_NAME = "Collection";
    public static final String STR_DEX_COLLECTION_VERSION = "1.0.0";
    public static final String STR_DEX_GEO_FENCE_NAME = "GeoFence";
    public static final String STR_DEX_GEO_FENCE_VERSION = "1.0.0";
    public static final String STR_DEX_HTTP_DNS_NAME = "HttpDNS";
    public static final String STR_DEX_HTTP_DNS_VERSION = "1.0.0";
    public static final String STR_DEX_MAC_NAME = "mac";
    public static final String STR_DEX_MAC_VERSION = "1.0.0";
    public static final String STR_ORIGN_LICENSE = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
    public static final String STR_ORIGN_SRC = "UC_nlp_20131029";
    public static final String STR_REGEO_IPV6_SERVER = "/v3/geocode/regeo";
    public static final int TIMEOUT_SECONDS = 5;
    public static final String URL_PATH_STR_REGEO_SERVER = "/v3/geocode/regeo";

    /* renamed from: a, reason: collision with root package name */
    static String f6703a = "http://apilocate.amap.com/mobile/binary";
    static String b = "http://a.apilocate.amap.com/mobile/binary";
    static String d = null;
    static HashMap<String, String> e = null;
    private static l9 f = null;
    public static int iTo = 30000;
    public static String strAppSha1;
    public static String strAppname;
    public static String strImeiMeid;
    public static String strImsi;
    public static final String[] DEMOTION_ENGINE_VERSION = {"5.1"};
    private static final String[] c = {"com.amap.api.location", "com.loc", "com.amap.api.fence"};

    static void a(String str) {
        HashMap<String, String> hashMap;
        String str2;
        byte[] bArr;
        if (str != null) {
            try {
                if (str.length() != 0 && (hashMap = e) != null && hashMap.containsKey(str)) {
                    String str3 = e.get(str);
                    if (str3 == null || str3.length() <= 0) {
                        str2 = null;
                    } else {
                        if (str3.length() < 2) {
                            bArr = new byte[0];
                        } else {
                            String lowerCase = str3.toLowerCase(Locale.US);
                            int length = lowerCase.length() / 2;
                            byte[] bArr2 = new byte[length];
                            for (int i = 0; i < length; i++) {
                                int i2 = i * 2;
                                bArr2[i] = (byte) (Utils.parseInt(lowerCase.substring(i2, i2 + 2), 16) & 255);
                            }
                            bArr = bArr2;
                        }
                        str2 = new String(Encrypt.aesDecrypt(bArr, str), "utf-8");
                    }
                    if (str2 == null || str2.length() <= 0 || !str2.contains(Const.HTTP_START)) {
                        return;
                    }
                    f6703a = str2;
                }
            } catch (Throwable th) {
                reportError(th, "CoreUtil", "checkUrl");
            }
        }
    }

    private static boolean a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d4 - d2;
        double d11 = d9 - d7;
        double d12 = d5 - d3;
        double d13 = d8 - d6;
        double d14 = (d10 * d11) - (d12 * d13);
        if (d14 == 0.0d) {
            return false;
        }
        double d15 = d3 - d7;
        double d16 = d2 - d6;
        double d17 = ((d13 * d15) - (d11 * d16)) / d14;
        double d18 = ((d15 * d10) - (d16 * d12)) / d14;
        return d17 >= 0.0d && d17 <= 1.0d && d18 >= 0.0d && d18 <= 1.0d;
    }

    public static void changeUrl(Context context) {
        try {
            e9 b2 = e9.b(context);
            int i = m9.d;
            if (!ea.a(context, false)) {
                f6703a = "http://" + b2.a(43) + ReportUtil.PATH_LOC;
                b = "http://" + b2.a(44) + ReportUtil.PATH_LOC;
            } else {
                String a2 = b2.a(40);
                f6703a = a2;
                b = a2;
            }
        } catch (Throwable th) {
            reportError(th, "CoreUtil", "changeUrl");
        }
    }

    public static void checkUrl(Context context) {
        try {
            String a2 = e9.b(context).a(40);
            int i = m9.d;
            if (ea.a(context, false)) {
                f6703a = a2;
                return;
            }
            try {
                if (e == null) {
                    e = new HashMap<>(16);
                }
                e.clear();
                e.put("fe643c382e5c3b3962141f1a2e815a78", "FB923EE67A8B4032DAA517DD8CD7A26FF7C25B0C3663F92A0B61251C4FFFA858DF169D61321C3E7919CB67DF8EFEC827");
                e.put("9a571aa113ad987d626c0457828962e6", "D2FF99A88BEB04683D89470D4FA72B1749DA456AB0D0F1A476477CE5A6874F53A9106423D905F9D808C0FCE8E7F1E04AC642F01FE41D0C7D933971F45CBA72B7");
                e.put("668319f11506def6208d6afe320dfd52", "53E53D46011A6BBAEA4FAE5442E659E0577CDD336F930C28635C322FB3F51C3C63F7FBAC9EAE448DFA2E5E5D716C4807");
            } catch (Throwable th) {
                reportError(th, "CoreUtil", "initUrlHash");
            }
            String generatorKey = Encrypt.generatorKey(z8.e(context));
            d = generatorKey;
            a(generatorKey);
        } catch (Throwable th2) {
            reportError(th2, "CoreUtil", "checkUrl");
        }
    }

    public static l9 getDexSDKInfo(String str, String str2) {
        try {
            return new l9.a(str, str2, HTTP_HEADER_USER_AGENT).a(getPackage()).a();
        } catch (Throwable th) {
            reportError(th, "CoreUtil", "getSDKInfo");
            return null;
        }
    }

    public static String getLocOperType() {
        return "11G;11K;13J;13S;15O;15U;17J;17Y;197;1A6";
    }

    public static Bundle getOptionBundle(AMapLocationClientOption aMapLocationClientOption) {
        Bundle bundle = new Bundle();
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        try {
            bundle.putParcelable("opt", aMapLocationClientOption);
            return bundle;
        } catch (Throwable th) {
            reportError(th, "CoreUtil", "getOptionBundle");
            return bundle;
        }
    }

    public static AMapLocationClientOption getOptionFromBundle(Bundle bundle) {
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocationClientOption.class.getClassLoader());
                return (AMapLocationClientOption) bundle.getParcelable("opt");
            } catch (Throwable th) {
                reportError(th, "CoreUtil", "getOptionFromBundle");
            }
        }
        return aMapLocationClientOption;
    }

    public static JSONObject getOptionJson(AMapLocationClientOption aMapLocationClientOption) {
        JSONObject jSONObject = new JSONObject();
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        try {
            jSONObject.put("nbssid", "0");
            jSONObject.put("reversegeo", aMapLocationClientOption.isNeedAddress());
            jSONObject.put(Const.JSON_KEY_ISOFFSET, aMapLocationClientOption.isOffset());
            jSONObject.put("wifiactivescan", aMapLocationClientOption.isWifiActiveScan() ? "1" : "0");
            jSONObject.put("httptimeout", aMapLocationClientOption.getHttpTimeOut());
            jSONObject.put("isOnceLocationLatest", aMapLocationClientOption.isOnceLocationLatest());
            jSONObject.put("isKillProcess", aMapLocationClientOption.isKillProcess() ? "1" : "0");
            boolean z = true;
            if (aMapLocationClientOption.getLocationProtocol().ordinal() != 1) {
                z = false;
            }
            jSONObject.put("locationProtocol", z);
            jSONObject.put("sensorEnable", aMapLocationClientOption.isSensorEnable());
            jSONObject.put("isWifiPassiveScan", aMapLocationClientOption.isWifiScan());
            jSONObject.put("isMock", aMapLocationClientOption.isMockEnable());
            return jSONObject;
        } catch (Throwable th) {
            reportError(th, "CoreUtil", "getOptionJson");
            return jSONObject;
        }
    }

    public static String[] getPackage() {
        return (String[]) c.clone();
    }

    public static l9 getSDKInfo() {
        try {
            if (f == null) {
                f = new l9.a("loc", STR_CONFIG_VERSION, HTTP_HEADER_USER_AGENT).a(getPackage()).a(STR_CONFIG_VERSION).a();
            }
        } catch (Throwable th) {
            reportError(th, "CoreUtil", "getSDKInfo");
        }
        return f;
    }

    public static String getScode(Context context) {
        return i9.c(z8.g(context));
    }

    public static String getStrApiServer() {
        return f6703a;
    }

    public static String getStrIPV6ApiServer() {
        return b;
    }

    public static boolean isChina(double d2, double d3) {
        int i = (int) ((d3 - 73.0d) / 0.5d);
        int i2 = (int) ((d2 - 3.5d) / 0.5d);
        if (i2 < 0 || i2 >= 101 || i < 0 || i >= 124) {
            return false;
        }
        try {
            return "00000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001100000001011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011101010111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000110111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111101111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000110111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011010111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001110011100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000110000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001010011100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111100110001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111110011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111000000000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111100000000000010111110100000011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111110000000001111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111000000111111111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111101111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000101111111111111111111111111111111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000011110000000001111111111111111111111111111111111111111111110000000000000000000000000000000000000000000000000000000000011000011111100000000111111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000001111111100111111111100110111111111111111111111111111111111111111111111110000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000000101111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111011111000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100100000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100011100000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000111110000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110011111110000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110111111110000000000000000000000111011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000011111111111111111111111111111111111111111111111100001111111111111111111111111111111111111111111111111010000000000000000000000111111111111111111111111111111111111111111110000000000000001111111111111111111111111111111111111111111100000000000000000000011111111111111111111111111111111100000000000000000000000000001111111111111111111111111111111111111111110000000000000000000001111111111111111111111111111111100000000000000000000000000000001111111111111111111111111111111111111111000000000000000000000111111111111111111111111111111110000000000000000000000000000001111111111111111111111111111111111111111100000000000000000000111111111111111111111111111111000000000000000000000000000000000111111111111111111111111111111111111111111000000000000000000001111111111111111111111111110000000000000000000000000000000000001110011111111111111111111111111111111111111100000000000000000000011111111111111111100000000000000000000000000000000000000000000000001111111111111111111111111111111111111000000000000000000001111111111111111111000000000000000000000000000000000000000000000000011111111111111111111111111111111111100000000000000000000011111111111111111100000000000000000000000000000000000000000000000000011111111111111111111111111111111111000000000000000000001111111111111111100000000000000000000000000000000000000000000000000000000111111111111111111111111111111110000000000000000000000000111111111100000000000000000000000000000000000000000000000000111111111111111111111111111111111111111000000000000000000000000011111111100000000000000000000000000000000000000000000000000011111111111111111111111111111110001111100000000000000000000000000111110000000000000000000000000000000000000000000000000000001111111111111111111111111111111000000000000000000000000000000000001110000000000000000000000000000000000000000000000000000000011111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010110000000000000000000000".charAt((i2 * 124) + i) == '1';
        } catch (Throwable th) {
            reportError(th, "CoreUtil", "isChina");
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r9 > r19) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        r20 = r13;
        r19 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        r20 = r13;
        r19 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r19 > r9) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isInPolygon(com.amap.api.location.DPoint r28, java.util.List<com.amap.api.location.DPoint> r29) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.aps.amapapi.utils.CoreUtil.isInPolygon(com.amap.api.location.DPoint, java.util.List):boolean");
    }

    public static void reportError(Throwable th, String str, String str2) {
        if ("reportError".equals(str2)) {
            return;
        }
        try {
            if (th instanceof y8) {
                return;
            }
            ja.a(th, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static AMapLocation transformAddress(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 != null) {
            try {
                aMapLocation.setCountry(aMapLocation2.getCountry());
                aMapLocation.setRoad(aMapLocation2.getRoad());
                aMapLocation.setPoiName(aMapLocation2.getPoiName());
                aMapLocation.setStreet(aMapLocation2.getStreet());
                aMapLocation.setNumber(aMapLocation2.getStreetNum());
                String cityCode = aMapLocation2.getCityCode();
                String adCode = aMapLocation2.getAdCode();
                aMapLocation.setCityCode(cityCode);
                aMapLocation.setAdCode(adCode);
                aMapLocation.setCity(aMapLocation2.getCity());
                aMapLocation.setDistrict(aMapLocation2.getDistrict());
                aMapLocation.setProvince(aMapLocation2.getProvince());
                aMapLocation.setAoiName(aMapLocation2.getAoiName());
                aMapLocation.setAddress(aMapLocation2.getAddress());
                aMapLocation.setDescription(aMapLocation2.getDescription());
                if (aMapLocation.getExtras() != null) {
                    aMapLocation.getExtras().putString(Const.JSON_KEY_CITYCODE, aMapLocation2.getCityCode());
                    aMapLocation.getExtras().putString("desc", aMapLocation2.getExtras().getString("desc"));
                    aMapLocation.getExtras().putString(Const.JSON_KEY_ADCODE, aMapLocation2.getAdCode());
                    return aMapLocation;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Const.JSON_KEY_CITYCODE, aMapLocation2.getCityCode());
                bundle.putString("desc", aMapLocation2.getExtras().getString("desc"));
                bundle.putString(Const.JSON_KEY_ADCODE, aMapLocation2.getAdCode());
                aMapLocation.setExtras(bundle);
            } catch (Throwable unused) {
            }
        }
        return aMapLocation;
    }

    public static void transformLocation(AMapLocation aMapLocation, JSONObject jSONObject) {
        if (jSONObject == null || aMapLocation == null) {
            return;
        }
        try {
            double optDouble = jSONObject.optDouble("lat", aMapLocation.getLatitude());
            double optDouble2 = jSONObject.optDouble("lon", aMapLocation.getLongitude());
            aMapLocation.setProvider(jSONObject.optString("provider", aMapLocation.getProvider()));
            aMapLocation.setLatitude(optDouble);
            aMapLocation.setLongitude(optDouble2);
            aMapLocation.setAltitude(jSONObject.optDouble("altitude", aMapLocation.getAltitude()));
            try {
                String optString = jSONObject.optString(Const.JSON_KEY_ACCURACY);
                if (!TextUtils.isEmpty(optString)) {
                    aMapLocation.setAccuracy(Float.parseFloat(optString));
                }
            } catch (Throwable unused) {
            }
            try {
                String optString2 = jSONObject.optString("speed");
                if (!TextUtils.isEmpty(optString2)) {
                    aMapLocation.setSpeed(Float.parseFloat(optString2));
                }
            } catch (Throwable unused2) {
            }
            try {
                String optString3 = jSONObject.optString(Const.JSON_KEY_BEARING);
                if (!TextUtils.isEmpty(optString3)) {
                    aMapLocation.setBearing(Float.parseFloat(optString3));
                }
            } catch (Throwable unused3) {
            }
            aMapLocation.setAdCode(jSONObject.optString(Const.JSON_KEY_ADCODE, aMapLocation.getAdCode()));
            aMapLocation.setCityCode(jSONObject.optString(Const.JSON_KEY_CITYCODE, aMapLocation.getCityCode()));
            aMapLocation.setAddress(jSONObject.optString(Const.JSON_KEY_ADDRESS, aMapLocation.getAddress()));
            String optString4 = jSONObject.optString("desc", "");
            aMapLocation.setCountry(jSONObject.optString("country", aMapLocation.getCountry()));
            aMapLocation.setProvince(jSONObject.optString("province", aMapLocation.getProvince()));
            aMapLocation.setCity(jSONObject.optString("city", aMapLocation.getCity()));
            aMapLocation.setDistrict(jSONObject.optString("district", aMapLocation.getDistrict()));
            aMapLocation.setRoad(jSONObject.optString(Const.JSON_KEY_ROAD, aMapLocation.getRoad()));
            aMapLocation.setStreet(jSONObject.optString(Const.JSON_KEY_STREET, aMapLocation.getStreet()));
            aMapLocation.setNumber(jSONObject.optString("number", aMapLocation.getStreetNum()));
            aMapLocation.setPoiName(jSONObject.optString("poiname", aMapLocation.getPoiName()));
            aMapLocation.setAoiName(jSONObject.optString(Const.JSON_KEY_AOINAME, aMapLocation.getAoiName()));
            aMapLocation.setErrorCode(jSONObject.optInt("errorCode", aMapLocation.getErrorCode()));
            aMapLocation.setErrorInfo(jSONObject.optString("errorInfo", aMapLocation.getErrorInfo()));
            aMapLocation.setLocationType(jSONObject.optInt("locationType", aMapLocation.getLocationType()));
            aMapLocation.setLocationDetail(jSONObject.optString(Const.JSON_KEY_LOCATIONDETAIL, aMapLocation.getLocationDetail()));
            aMapLocation.setTime(jSONObject.optLong("time", aMapLocation.getTime()));
            boolean optBoolean = jSONObject.optBoolean(Const.JSON_KEY_ISOFFSET, aMapLocation.isOffset());
            aMapLocation.setOffset(optBoolean);
            aMapLocation.setBuildingId(jSONObject.optString(Const.JSON_KEY_POIID, aMapLocation.getBuildingId()));
            aMapLocation.setFloor(jSONObject.optString(Const.JSON_KEY_FLOOR, aMapLocation.getFloor()));
            aMapLocation.setDescription(jSONObject.optString("description", aMapLocation.getDescription()));
            if (jSONObject.has("coordType")) {
                aMapLocation.setCoordType(jSONObject.optString("coordType", "GCJ02"));
            } else if (!isChina(optDouble, optDouble2)) {
                aMapLocation.setCoordType("WGS84");
            } else if (optBoolean) {
                aMapLocation.setCoordType("GCJ02");
            } else {
                aMapLocation.setCoordType("WGS84");
            }
            Bundle bundle = new Bundle();
            bundle.putString(Const.JSON_KEY_CITYCODE, aMapLocation.getCityCode());
            bundle.putString("desc", optString4.toString());
            bundle.putString(Const.JSON_KEY_ADCODE, aMapLocation.getAdCode());
            aMapLocation.setExtras(bundle);
        } catch (Throwable th) {
            reportError(th, "CoreUtil", "transformLocation");
        }
    }

    private static boolean a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.abs(((d4 - d2) * (d7 - d3)) - ((d6 - d2) * (d5 - d3))) < 1.0E-9d && (d2 - d4) * (d2 - d6) <= 0.0d && (d3 - d5) * (d3 - d7) <= 0.0d;
    }
}
