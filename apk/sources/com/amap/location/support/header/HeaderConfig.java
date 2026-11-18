package com.amap.location.support.header;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class HeaderConfig {
    private static final Object OTHER_ID_MAP_LOCK = new Object();
    public static final byte PRODUCT_FLP = 1;
    public static final byte PRODUCT_NLP = 2;
    public static final byte PRODUCT_OPEN_SDK = 4;
    public static final byte PRODUCT_OPEN_SDK_BASEON = 6;
    public static final byte PRODUCT_SDK_AMAP = 0;
    public static final byte PRODUCT_SDK_AUTO = 3;
    public static final byte PRODUCT_SDK_MANU = 5;
    public static final byte PRODUCT_UNKNOWN = -1;
    private static volatile String sAdiu = "";
    private static volatile String sBrand = "";
    private static volatile long sDeviceMacLong = 0;
    private static volatile String sDeviceMacString = "";
    private static volatile String sDeviceMode = "";
    private static volatile String sDiu = "";
    private static volatile String sImsi = "";
    private static volatile String sLicense = "";
    private static volatile String sManufacturer = "";
    private static volatile String sMapkey = "";
    private static volatile String sOaid = "";
    private static volatile Map<String, String> sOtherIdMap = null;
    private static volatile String sProcessName = "";
    private static volatile byte sProductId = -1;
    private static volatile String sProductVerion = "";
    private static volatile String sSerialNum = "";
    private static volatile String sSystemVersioString = "";
    private static volatile int sSystemVersionInt = 0;
    private static volatile String sTid = "";
    private static volatile String sVersionCode = "";
    private static volatile String sVersionName = "";

    public static String getAdiu() {
        return sAdiu;
    }

    public static Set<String> getAllIdentifiersKey() {
        initOtherIdMap();
        return sOtherIdMap.keySet();
    }

    public static String getBrand() {
        return sBrand;
    }

    public static long getDeviceMacLong() {
        return sDeviceMacLong;
    }

    public static String getDeviceMacString() {
        return sDeviceMacString;
    }

    public static String getDeviceMode() {
        return sDeviceMode;
    }

    public static String getDiu() {
        return sDiu;
    }

    public static String getIdentifier(String str) {
        initOtherIdMap();
        return sOtherIdMap.get(str);
    }

    public static String getImsi() {
        return sImsi;
    }

    public static String getLicense() {
        return sLicense;
    }

    public static String getManufacturer() {
        return sManufacturer;
    }

    public static String getMapkey() {
        return sMapkey;
    }

    public static String getOaid() {
        return sOaid;
    }

    public static String getProcessName() {
        return sProcessName;
    }

    public static byte getProductId() {
        return sProductId;
    }

    public static String getProductVerion() {
        return sProductVerion;
    }

    public static String getSerialNum() {
        return sSerialNum;
    }

    public static String getSystemVersioString() {
        return sSystemVersioString;
    }

    public static int getSystemVersionInt() {
        return sSystemVersionInt;
    }

    public static String getTid() {
        return sTid;
    }

    public static String getVersionCode() {
        return sVersionCode;
    }

    public static String getVersionName() {
        return sVersionName;
    }

    private static void initOtherIdMap() {
        if (sOtherIdMap == null) {
            synchronized (OTHER_ID_MAP_LOCK) {
                if (sOtherIdMap == null) {
                    sOtherIdMap = new ConcurrentHashMap(100);
                }
            }
        }
    }

    public static void putIdentifier(String str, String str2) {
        initOtherIdMap();
        sOtherIdMap.put(str, str2);
    }

    public static void setAdiu(String str) {
        if (str != null) {
            sAdiu = str;
        }
    }

    public static void setBrand(String str) {
        if (str != null) {
            sBrand = str;
        }
    }

    public static void setDeviceMacLong(long j) {
        sDeviceMacLong = j;
    }

    public static void setDeviceMacString(String str) {
        if (str != null) {
            sDeviceMacString = str;
        }
    }

    public static void setDeviceMode(String str) {
        if (str != null) {
            sDeviceMode = str;
        }
    }

    public static void setDiu(String str) {
        if (str != null) {
            sDiu = str;
        }
    }

    public static void setImsi(String str) {
        if (str != null) {
            sImsi = str;
        }
    }

    public static void setLicense(String str) {
        if (str != null) {
            sLicense = str;
        }
    }

    public static void setManufacturer(String str) {
        if (str != null) {
            sManufacturer = str;
        }
    }

    public static void setMapkey(String str) {
        if (str != null) {
            sMapkey = str;
        }
    }

    public static void setOaid(String str) {
        if (str != null) {
            sOaid = str;
        }
    }

    public static void setProcessName(String str) {
        if (str != null) {
            sProcessName = str;
        }
    }

    public static void setProductId(byte b) {
        sProductId = b;
    }

    public static void setProductVerion(String str) {
        if (str != null) {
            sProductVerion = str;
        }
    }

    public static void setSerialNum(String str) {
        if (str != null) {
            sSerialNum = str;
        }
    }

    public static void setSystemVersioString(String str) {
        if (str != null) {
            sSystemVersioString = str;
        }
    }

    public static void setSystemVersionInt(int r0) {
        sSystemVersionInt = r0;
    }

    public static void setTid(String str) {
        if (str != null) {
            sTid = str;
        }
    }

    public static void setVersionCode(String str) {
        if (str != null) {
            sVersionCode = str;
        }
    }

    public static void setVersionName(String str) {
        if (str != null) {
            sVersionName = str;
        }
    }
}
