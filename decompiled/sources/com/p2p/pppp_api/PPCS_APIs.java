package com.p2p.pppp_api;

import com.beken.iot.smartsdk.core.log.BKSmartLog;

/* loaded from: classes17.dex */
public class PPCS_APIs {
    public static final int ERROR_PPCS_ALREADY_INITIALIZED = -2;
    public static final int ERROR_PPCS_DEVICE_NOT_ONLINE = -6;
    public static final int ERROR_PPCS_FAILED_TO_CONNECT_TCP_RELAY = -24;
    public static final int ERROR_PPCS_FAIL_TO_ALLOCATE_MEMORY = -25;
    public static final int ERROR_PPCS_FAIL_TO_CREATE_THREAD = -22;
    public static final int ERROR_PPCS_FAIL_TO_RESOLVE_NAME = -7;
    public static final int ERROR_PPCS_ID_OUT_OF_DATE = -9;
    public static final int ERROR_PPCS_INVALID_APILICENSE = -21;
    public static final int ERROR_PPCS_INVALID_DSK = -23;
    public static final int ERROR_PPCS_INVALID_ID = -4;
    public static final int ERROR_PPCS_INVALID_PARAMETER = -5;
    public static final int ERROR_PPCS_INVALID_PREFIX = -8;
    public static final int ERROR_PPCS_INVALID_SESSION_HANDLE = -11;
    public static final int ERROR_PPCS_MAX_SESSION = -17;
    public static final int ERROR_PPCS_NOT_INITIALIZED = -1;
    public static final int ERROR_PPCS_NO_RELAY_SERVER_AVAILABLE = -10;
    public static final int ERROR_PPCS_REMOTE_SITE_BUFFER_FULL = -15;
    public static final int ERROR_PPCS_SESSION_CLOSED_CALLED = -14;
    public static final int ERROR_PPCS_SESSION_CLOSED_INSUFFICIENT_MEMORY = -20;
    public static final int ERROR_PPCS_SESSION_CLOSED_REMOTE = -12;
    public static final int ERROR_PPCS_SESSION_CLOSED_TIMEOUT = -13;
    public static final int ERROR_PPCS_SUCCESSFUL = 0;
    public static final int ERROR_PPCS_TIME_OUT = -3;
    public static final int ERROR_PPCS_UDP_PORT_BIND_FAILED = -18;
    public static final int ERROR_PPCS_USER_CONNECT_BREAK = -19;
    public static final int ERROR_PPCS_USER_LISTEN_BREAK = -16;
    public static final int ER_ANDROID_NULL = -5000;
    private static final String TAG = "PPCS_APIs";
    public static int ms_verAPI;

    public static native int PPCS_Check(int i, st_PPCS_Session st_ppcs_session);

    public static native int PPCS_Check_Buffer(int i, byte b, int[] iArr, int[] iArr2);

    public static native int PPCS_Close(int i);

    public static native int PPCS_Connect(String str, byte b, int i);

    public static native int PPCS_ConnectByServer(String str, byte b, int i, String str2);

    public static native int PPCS_Connect_Break();

    public static native int PPCS_DeInitialize();

    public static native int PPCS_Enable_SmartDevice(byte b);

    public static native int PPCS_ForceClose(int i);

    public static native String PPCS_GetAPIInformation();

    public static native int PPCS_GetAPIVersion();

    public static native int PPCS_Initialize(byte[] bArr);

    public static native int PPCS_Listen(String str, int i, int i2, byte b, String str2);

    public static native int PPCS_Listen_Break();

    public static native int PPCS_LoginStatus_Check(byte[] bArr);

    public static native int PPCS_NetworkDetect(st_PPCS_NetInfo st_ppcs_netinfo, int i);

    public static native int PPCS_NetworkDetectByServer(st_PPCS_NetInfo st_ppcs_netinfo, int i, String str);

    public static native int PPCS_PktRecv(int i, byte b, byte[] bArr, int[] iArr, int i2);

    public static native int PPCS_PktSend(int i, byte b, byte[] bArr, int i2);

    public static native int PPCS_Read(int i, byte b, byte[] bArr, int[] iArr, int i2);

    public static native int PPCS_Share_Bandwidth(byte b);

    public static native int PPCS_Write(int i, byte b, byte[] bArr, int i2);

    static {
        try {
            System.loadLibrary("PPCS_API");
            ms_verAPI = PPCS_GetAPIVersion();
        } catch (UnsatisfiedLinkError e) {
            BKSmartLog.INSTANCE.d(TAG, "loadLibrary PPCS_API lib," + e.getMessage());
        }
    }
}
