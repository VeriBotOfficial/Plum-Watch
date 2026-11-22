package com.beken.iot.smartsdk.core.thirdparty.cs2;

import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes13.dex */
public class DIDModel {
    public static final String CRC_KEY_KEY = "crc_key";
    public static final String DID_KEY = "did";
    public static final String INIT_STRING_KEY = "init_string";
    public static final String LICENSE_KEY = "api_license";
    public static final String SERVER_IP1_KEY = "ip1";
    public static final String SERVER_IP2_KEY = "ip2";
    public static final String SERVER_IP3_KEY = "ip3";
    private static final String TAG = "DIDModel";
    public static final String WAKEUP_KEY_KEY = "wakeup_key";
    public String crcKey;
    public int delaySec;
    public String did;
    public int direction;
    public String initString;
    public String ip1;
    public String ip2;
    public String ip3;
    public String license;
    public int mode;
    public int repeat;
    public int sizeOption;
    public int threadNum;
    public String wakeupKey;

    public DIDModel(String str, String str2) {
        this.did = str;
        this.initString = str2;
    }

    public DIDModel(JSONObject jSONObject) {
        this.did = jSONObject.optString(DID_KEY);
        this.license = jSONObject.optString(LICENSE_KEY);
        this.crcKey = jSONObject.optString(CRC_KEY_KEY);
        this.initString = jSONObject.optString(INIT_STRING_KEY);
        this.wakeupKey = jSONObject.optString(WAKEUP_KEY_KEY);
        this.ip1 = jSONObject.optString(SERVER_IP1_KEY);
        this.ip2 = jSONObject.optString(SERVER_IP2_KEY);
        this.ip3 = jSONObject.optString(SERVER_IP3_KEY);
    }

    public static boolean isSameModel(DIDModel dIDModel, DIDModel dIDModel2) {
        if (dIDModel.did.equals(dIDModel2.did) && dIDModel.license.equals(dIDModel2.license) && dIDModel.crcKey.equals(dIDModel2.crcKey) && dIDModel.initString.equals(dIDModel2.initString) && dIDModel.wakeupKey.equals(dIDModel2.wakeupKey) && dIDModel.ip1.equals(dIDModel2.ip1) && dIDModel.ip2.equals(dIDModel2.ip2)) {
            return dIDModel.ip3.equals(dIDModel2.ip3);
        }
        return false;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DID_KEY, this.did);
        jSONObject.put(LICENSE_KEY, this.license);
        jSONObject.put(CRC_KEY_KEY, this.crcKey);
        jSONObject.put(INIT_STRING_KEY, this.initString);
        jSONObject.put(WAKEUP_KEY_KEY, this.wakeupKey);
        jSONObject.put(SERVER_IP1_KEY, this.ip1);
        jSONObject.put(SERVER_IP2_KEY, this.ip2);
        jSONObject.put(SERVER_IP3_KEY, this.ip3);
        return jSONObject;
    }

    public String toString() {
        try {
            JSONObject jsonObject = toJsonObject();
            jsonObject.put(DOMConstants.ATTR_MODE, this.mode);
            jsonObject.put("repeat", this.repeat);
            jsonObject.put("delaySec", this.delaySec);
            jsonObject.put("threadNum", this.threadNum);
            jsonObject.put("sizeOption", this.sizeOption);
            jsonObject.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, this.direction);
            return jsonObject.toString(4);
        } catch (Exception e) {
            BKSmartLog.INSTANCE.e(TAG, e.getMessage());
            return "";
        }
    }
}
