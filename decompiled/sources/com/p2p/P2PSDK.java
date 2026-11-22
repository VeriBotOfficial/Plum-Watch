package com.p2p;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.thirdparty.cs2.DIDModel;
import com.beken.iot.smartsdk.core.thirdparty.cs2.SessionModel;
import com.p2p.pppp_api.PPCS_APIs;
import com.p2p.pppp_api.st_PPCS_NetInfo;
import com.p2p.pppp_api.st_PPCS_Session;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class P2PSDK {
    public static final boolean AVAILABLE_0x7X_Timeout;
    public static final boolean AVAILABLE_CHECK_0x79;
    public static final boolean AVAILABLE_INFORMATION;
    public static final boolean AVAILABLE_RP2P;
    public static final boolean AVAILABLE_SET_INIT;
    public static final boolean AVAILABLE_TCP_RELAY;
    public static final boolean AVAILABLE_WakeupInfo;
    public static final String Default_WakeupInfo = "PPCS_Wakeup_Info";
    static final int MAX_SESSION = 128;
    static final double P2P_API_VERSION;
    static final int SESSION_ALIVE_SEC = 15;
    private static final String TAG = "P2PSDK";
    private static final P2PSDK gP2PSDK;
    public static boolean mIsP2PAPIInit;
    private final String DID_INFO_NAME = "localDIDHistoryList";
    Context mContext;
    public String mInitString;
    public boolean mIsConnectionTesterRun;
    public boolean mIsListenTesterRun;
    public boolean mIsReadWriteTesterRun;
    public String mLastResultString;

    static {
        double d = ((PPCS_APIs.ms_verAPI >> 24) & 255) + (((PPCS_APIs.ms_verAPI >> 16) & 255) * 0.1d) + (((PPCS_APIs.ms_verAPI >> 8) & 255) * 0.01d);
        P2P_API_VERSION = d;
        AVAILABLE_INFORMATION = d >= 3.5d;
        AVAILABLE_TCP_RELAY = d >= 4.1d;
        AVAILABLE_SET_INIT = d >= 4.2d;
        AVAILABLE_CHECK_0x79 = d >= 4.3d;
        AVAILABLE_0x7X_Timeout = d >= 4.53d;
        AVAILABLE_RP2P = d >= 5.01d;
        AVAILABLE_WakeupInfo = d >= 5.04d;
        gP2PSDK = new P2PSDK();
    }

    public static P2PSDK getInstance() {
        return gP2PSDK;
    }

    public static String getP2PErrorMessage(int i) {
        switch (i) {
            case -25:
                return "ERROR_PPCS_FAIL_TO_ALLOCATE_MEMORY";
            case -24:
                return "ERROR_PPCS_FAILED_TO_CONNECT_TCP_RELAY";
            case -23:
                return "ERROR_PPCS_INVALID_DSK";
            case -22:
                return "ERROR_PPCS_FAIL_TO_CREATE_THREAD";
            case -21:
                return "ERROR_PPCS_INVALID_APILICENSE";
            case -20:
                return "ERROR_PPCS_SESSION_CLOSED_INSUFFICIENT_MEMORY";
            case -19:
                return "ERROR_PPCS_USER_CONNECT_BREAK";
            case -18:
                return "ERROR_PPCS_UDP_PORT_BIND_FAILED";
            case -17:
                return "ERROR_PPCS_MAX_SESSION";
            case -16:
                return "ERROR_PPCS_USER_LISTEN_BREAK";
            case -15:
                return "ERROR_PPCS_REMOTE_SITE_BUFFER_FULL";
            case -14:
                return "ERROR_PPCS_SESSION_CLOSED_CALLED";
            case -13:
                return "ERROR_PPCS_SESSION_CLOSED_TIMEOUT";
            case -12:
                return "ERROR_PPCS_SESSION_CLOSED_REMOTE";
            case -11:
                return "ERROR_PPCS_INVALID_SESSION_HANDLE";
            case -10:
                return "ERROR_PPCS_NO_RELAY_SERVER_AVAILABLE";
            case -9:
                return "ERROR_PPCS_ID_OUT_OF_DATE";
            case -8:
                return "ERROR_PPCS_INVALID_PREFIX";
            case -7:
                return "ERROR_PPCS_FAIL_TO_RESOLVE_NAME";
            case -6:
                return "ERROR_PPCS_DEVICE_NOT_ONLINE";
            case -5:
                return "ERROR_PPCS_INVALID_PARAMETER";
            case -4:
                return "ERROR_PPCS_INVALID_ID";
            case -3:
                return "ERROR_PPCS_TIME_OUT";
            case -2:
                return "ERROR_PPCS_ALREADY_INITIALIZED";
            case -1:
                return "ERROR_PPCS_NOT_INITIALIZED";
            case 0:
                return "ERROR_PPCS_SUCCESSFUL";
            default:
                return "Unknown error, something is wrong!";
        }
    }

    public void configP2PSDK(Context context) {
        this.mContext = context;
    }

    public String getAPIInformation() {
        if (AVAILABLE_INFORMATION) {
            String PPCS_GetAPIInformation = PPCS_APIs.PPCS_GetAPIInformation();
            return String.format("PPCS API Information(%d byte): %s\n", Integer.valueOf(PPCS_GetAPIInformation.length()), PPCS_GetAPIInformation);
        }
        return String.format("PPCS API Version(%d): %d.%d.%d.%d\n", Integer.valueOf(PPCS_APIs.ms_verAPI), Integer.valueOf((PPCS_APIs.ms_verAPI >> 24) & 255), Integer.valueOf((PPCS_APIs.ms_verAPI >> 16) & 255), Integer.valueOf((PPCS_APIs.ms_verAPI >> 8) & 255), Integer.valueOf(PPCS_APIs.ms_verAPI & 255));
    }

    public int initializeP2P(String str) {
        synchronized (this) {
            if (mIsP2PAPIInit) {
                if (str.equals(this.mInitString)) {
                    this.mLastResultString = "PPCS_Initialize() already done!\n";
                    return 0;
                }
                this.mLastResultString = "Already init with Different InitString.\n";
                return -2;
            }
            String p2PInitString = getP2PInitString(str);
            long currentTimeMillis = System.currentTimeMillis();
            int PPCS_Initialize = PPCS_APIs.PPCS_Initialize(p2PInitString.getBytes());
            long currentTimeMillis2 = System.currentTimeMillis();
            if (PPCS_Initialize == 0) {
                this.mLastResultString = String.format("PPCS_Initialize(%s) done! time: %d ms\n", p2PInitString, Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                this.mInitString = str;
                mIsP2PAPIInit = true;
            } else if (PPCS_Initialize != -2) {
                this.mLastResultString = String.format("PPCS_Initialize(%s) failed time:%d ms ret=%d[%s]\n", p2PInitString, Long.valueOf(currentTimeMillis2 - currentTimeMillis), Integer.valueOf(PPCS_Initialize), getP2PErrorMessage(PPCS_Initialize));
            }
            return PPCS_Initialize;
        }
    }

    public int deInitializeP2P() {
        int i;
        synchronized (this) {
            if (!mIsP2PAPIInit || this.mIsListenTesterRun || this.mIsConnectionTesterRun || this.mIsReadWriteTesterRun) {
                i = -99;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                i = PPCS_APIs.PPCS_DeInitialize();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (i == 0) {
                    mIsP2PAPIInit = false;
                    this.mLastResultString = "PPCS_DeInitialize() done! time=" + (currentTimeMillis2 - currentTimeMillis) + "ms.";
                } else {
                    this.mLastResultString = String.format("PPCS_DeInitialize() failed time: %.3f ms ret=%d[%s]", Double.valueOf((currentTimeMillis2 - currentTimeMillis) / 1000.0d), Integer.valueOf(i), getP2PErrorMessage(i));
                }
                printD(this.mLastResultString);
            }
        }
        return i;
    }

    public void networkDetect(String str) {
        int PPCS_NetworkDetectByServer;
        st_PPCS_NetInfo st_ppcs_netinfo = new st_PPCS_NetInfo();
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            PPCS_NetworkDetectByServer = PPCS_APIs.PPCS_NetworkDetect(st_ppcs_netinfo, 0);
        } else {
            PPCS_NetworkDetectByServer = PPCS_APIs.PPCS_NetworkDetectByServer(st_ppcs_netinfo, 0, str.trim());
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (PPCS_NetworkDetectByServer != 0) {
            this.mLastResultString = String.format("PPCS_NetworkDetect%s() failed! ret=%d[%s]\n", str != null ? "ByServer" : "", Integer.valueOf(PPCS_NetworkDetectByServer), getP2PErrorMessage(PPCS_NetworkDetectByServer));
        } else {
            this.mLastResultString = String.format("PPCS_NetworkDetect%s() done! time: %d ms\n%s", str != null ? "ByServer" : "", Long.valueOf(currentTimeMillis2 - currentTimeMillis), getNetworkInfo(st_ppcs_netinfo));
        }
    }

    public SessionModel checkSession(int i) {
        st_PPCS_Session st_ppcs_session = new st_PPCS_Session();
        long currentTimeMillis = System.currentTimeMillis();
        int PPCS_Check = PPCS_APIs.PPCS_Check(i, st_ppcs_session);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (PPCS_Check != 0) {
            String format = String.format("PPCS_Check() fail, time=%d ms, ret=%d[%s]\n", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Integer.valueOf(PPCS_Check), getP2PErrorMessage(PPCS_Check));
            this.mLastResultString = format;
            printD(format);
            return null;
        }
        return new SessionModel(i, st_ppcs_session);
    }

    String getP2PInitString(String str) {
        if (AVAILABLE_SET_INIT) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("InitString", str);
                jSONObject.put("SessAliveSec", 15);
                jSONObject.put("MaxNumSess", 128);
                return jSONObject.toString().trim();
            } catch (JSONException e) {
                printD("getInitString error: " + e.getMessage());
                return str.trim();
            }
        }
        return str.trim();
    }

    String getNetworkInfo(st_PPCS_NetInfo st_ppcs_netinfo) {
        StringBuilder sb = new StringBuilder("------------ NetInfo: ------------\nInternet Reachable        : ");
        sb.append(st_ppcs_netinfo.getbFlagInternet() == 1 ? "YES" : "NO").append("\nP2P Server IP resolved    : ");
        sb.append(st_ppcs_netinfo.getbFlagHostResolved() == 1 ? "YES" : "NO").append("\nP2P Server Hello Ack      : ");
        sb.append(st_ppcs_netinfo.getbFlagServerHello() != 1 ? "NO" : "YES").append("\n");
        int nAT_Type = st_ppcs_netinfo.getNAT_Type();
        if (nAT_Type == 0) {
            sb.append("Local NAT Type            : UnKnow\n");
        } else if (nAT_Type == 1) {
            sb.append("Local NAT Type            : IP-Restricted Cone\n");
        } else if (nAT_Type == 2) {
            sb.append("Local NAT Type            : Port-Restricted Cone\n");
        } else if (nAT_Type == 3) {
            sb.append("Local NAT Type            : Symmetric\n");
        } else if (nAT_Type == 4) {
            sb.append("Local NAT Type            : Different Wan IP Detected!!\n");
        }
        sb.append("My Wan IP  : ").append(st_ppcs_netinfo.getMyWanIP()).append("\nMy Lan IP  : ");
        sb.append(st_ppcs_netinfo.getMyLanIP()).append("\n-------------------------------\n");
        return sb.toString();
    }

    public String checkDID(String str) {
        String upperCase;
        String replace = str.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        if (!replace.matches("^([a-zA-Z]{3,7})([0-9]{6})([a-zA-Z]{5})")) {
            this.mLastResultString = "DID length error!";
            printD("DID length error!");
            return null;
        }
        if (replace.matches(":")) {
            if (!replace.matches(":[a-zA-Z0-9]{8,23}$")) {
                this.mLastResultString = "dsk must be 8~23 character of [a~z, A~Z, 0~9].";
                printD("dsk must be 8~23 character of [a~z, A~Z, 0~9].");
                return null;
            }
            String[] split = replace.split(":");
            StringBuilder sb = new StringBuilder(split[0]);
            sb.insert(sb.length() - 11, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb.insert(sb.length() - 5, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            upperCase = new String(sb).toUpperCase() + ":" + split[1];
        } else {
            StringBuilder sb2 = new StringBuilder(replace);
            sb2.insert(sb2.length() - 11, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb2.insert(sb2.length() - 5, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            upperCase = String.valueOf(sb2).toUpperCase();
        }
        printD("did: " + upperCase);
        return upperCase;
    }

    public void updateDIDModel(DIDModel dIDModel) {
        HashMap<String, DIDModel> localDIDHistoryMap = getLocalDIDHistoryMap();
        DIDModel dIDModel2 = localDIDHistoryMap.get(dIDModel.did);
        if (dIDModel2 != null) {
            if (DIDModel.isSameModel(dIDModel2, dIDModel)) {
                printD(String.format("DID(%s) model exist!", dIDModel.did));
                return;
            }
            dIDModel2.initString = dIDModel.initString;
            if (!TextUtils.isEmpty(dIDModel.license)) {
                dIDModel2.license = dIDModel.license;
            }
            if (!TextUtils.isEmpty(dIDModel.crcKey)) {
                dIDModel2.crcKey = dIDModel.crcKey;
            }
            if (!TextUtils.isEmpty(dIDModel.wakeupKey)) {
                dIDModel2.wakeupKey = dIDModel.wakeupKey;
            }
            if (!TextUtils.isEmpty(dIDModel.ip1)) {
                dIDModel2.ip1 = dIDModel.ip1;
            }
            if (!TextUtils.isEmpty(dIDModel.ip2)) {
                dIDModel2.ip2 = dIDModel.ip2;
            }
            if (!TextUtils.isEmpty(dIDModel.ip3)) {
                dIDModel2.ip3 = dIDModel.ip3;
            }
            localDIDHistoryMap.put(dIDModel2.did, dIDModel2);
        } else {
            localDIDHistoryMap.put(dIDModel.did, dIDModel);
        }
        saveLocalDIDHistoryMap(localDIDHistoryMap);
    }

    public void deleteDIDModel(String str) {
        HashMap<String, DIDModel> localDIDHistoryMap = getLocalDIDHistoryMap();
        localDIDHistoryMap.remove(str);
        saveLocalDIDHistoryMap(localDIDHistoryMap);
    }

    private void saveLocalDIDHistoryMap(HashMap<String, DIDModel> hashMap) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<DIDModel> it = hashMap.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJsonObject());
            }
        } catch (JSONException e) {
            printD("saveHistoryDIDInfo JSONException:" + e.getMessage());
        }
        saveHistoryData(jSONArray.toString());
    }

    public HashMap<String, DIDModel> getLocalDIDHistoryMap() {
        HashMap<String, DIDModel> hashMap = new HashMap<>();
        String readHistoryData = readHistoryData();
        if (readHistoryData != null && !readHistoryData.equals("")) {
            try {
                JSONArray jSONArray = new JSONArray(readHistoryData);
                for (int i = 0; i < jSONArray.length(); i++) {
                    DIDModel dIDModel = new DIDModel(jSONArray.getJSONObject(i));
                    hashMap.put(dIDModel.did, dIDModel);
                }
            } catch (JSONException e) {
                printD("getLocalDIDHistoryList JSONException:" + e.getMessage());
            }
        }
        return hashMap;
    }

    private String readHistoryData() {
        return this.mContext.getSharedPreferences("localDIDHistoryList", 0).getString("localDIDHistoryList", "");
    }

    private void saveHistoryData(String str) {
        SharedPreferences.Editor edit = this.mContext.getSharedPreferences("localDIDHistoryList", 0).edit();
        edit.putString("localDIDHistoryList", str);
        if (edit.commit()) {
            return;
        }
        printD("Failed to commit setting changes.");
    }

    private void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
