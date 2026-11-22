package io.agora.utils2.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.ThreadUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class CommonUtility {
    private static final int INTERNAL_UPDATE_ROTATION = 200;
    private static final String LENGTH_SEPARATOR_CHARACTER = "agora_length_&&_";
    private static final String OFFSET_SEPARATOR_CHARACTER = "agora_offset_&&_";
    public static final String PREFIX_ASSETS = "/assets/";
    public static final String PREFIX_URI = "content://";
    private static final String TAG = "CommonUtility";
    static final int UNKNOWN_BATTERY_PERCENTAGE = 255;
    private static final String URI_PROTOCOL_HEAD = "/proc/";
    private static boolean ignoreMonitor = false;
    private static Handler mProcessInfoHandler;
    private static volatile CommonUtility sInstance;
    private String lastLocalIp4;
    private String lastLocalIp6;
    private final WeakReference<Context> mContext;
    private String mExtraConnectivityFilterActionForTesting;
    private final Handler mHandler;
    private Listener mListener;
    private final ThreadUtils.ThreadChecker mThreadChecker;
    private ConnectivityManager.NetworkCallback mobileNetworkCallback = null;
    private volatile int mBatteryPercentage = 255;
    private boolean mDisposed = false;
    private volatile boolean mUpdateRotationTrigger = false;
    private volatile int lastOrientation = -1;
    private AgoraPhoneStateListener mPhoneStateListener = null;
    private ConnectionChangeBroadcastReceiver mConnectionBroadcastReceiver = null;
    private PowerChangeReceiver mPowerChangeReceiver = null;
    private ProcessLifecycleOwner mProcessLifecycleOwner = null;
    private OrientationEventListener mOrientationListener = null;
    private DisplayManager.DisplayListener mDisplayListener = null;
    private BroadcastReceiver mOrientationObserver = null;
    private int mLastOrientation = -1;
    private AtomicInteger reference = new AtomicInteger(0);
    private boolean shouldGetIp = true;
    private ArrayList<SystemEventListener> systemEventListeners = new ArrayList<>();
    private final Runnable rotationRunnable = new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.10
        @Override // java.lang.Runnable
        public void run() {
            if (((Context) CommonUtility.this.mContext.get()) == null) {
                return;
            }
            CommonUtility.this.getDisplayRotation();
            CommonUtility.this.mUpdateRotationTrigger = false;
        }
    };

    static class AgoraPhoneStateListener extends PhoneStateListener {
        private final WeakReference<CommonUtility> mCommonUtilityRef;
        private final WeakReference<Handler> mHandlerRef;
        private SignalStrength mSignalStrength;
        private volatile boolean phoneStatusNeedResume = false;

        AgoraPhoneStateListener(CommonUtility commonUtility, Handler handler) {
            this.mCommonUtilityRef = new WeakReference<>(commonUtility);
            this.mHandlerRef = new WeakReference<>(handler);
        }

        private int invokeMethod(String methodName) {
            try {
                SignalStrength signalStrength = this.mSignalStrength;
                if (signalStrength != null) {
                    return ((Integer) signalStrength.getClass().getDeclaredMethod(methodName, new Class[0]).invoke(this.mSignalStrength, new Object[0])).intValue();
                }
            } catch (Exception unused) {
            }
            return 0;
        }

        void fillCellInfoByNetworkType(List<CellSignalStrength> cellInfoList, MediaNetworkInfo cellInfo) {
            for (CellSignalStrength cellSignalStrength : cellInfoList) {
                if (cellSignalStrength instanceof CellSignalStrengthLte) {
                    CellSignalStrengthLte cellSignalStrengthLte = (CellSignalStrengthLte) cellSignalStrength;
                    cellInfo.rssi = cellSignalStrengthLte.getDbm();
                    cellInfo.signalLevel = cellSignalStrengthLte.getLevel();
                    cellInfo.snr = cellSignalStrengthLte.getRssnr();
                    return;
                }
                if ((cellSignalStrength instanceof CellSignalStrengthGsm) || (cellSignalStrength instanceof CellSignalStrengthCdma) || (cellSignalStrength instanceof CellSignalStrengthWcdma)) {
                    cellInfo.rssi = cellSignalStrength.getDbm();
                    cellInfo.signalLevel = cellSignalStrength.getLevel();
                    return;
                } else if (Build.VERSION.SDK_INT >= 29 && (cellSignalStrength instanceof CellSignalStrengthNr)) {
                    CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength;
                    cellInfo.rssi = cellSignalStrengthNr.getDbm();
                    cellInfo.signalLevel = cellSignalStrengthNr.getLevel();
                    return;
                }
            }
        }

        void fillCellInfoHighLevel(MediaNetworkInfo cellInfo) {
            SignalStrength signalStrength = this.mSignalStrength;
            if (signalStrength != null) {
                try {
                    Method declaredMethod = signalStrength.getClass().getDeclaredMethod("getCellSignalStrengths", new Class[0]);
                    if (declaredMethod != null) {
                        fillCellInfoByNetworkType((List) declaredMethod.invoke(this.mSignalStrength, new Object[0]), cellInfo);
                    }
                } catch (Exception unused) {
                    Logging.e(CommonUtility.TAG, "fillCellInfoHighLevel getDeclareMethod:getCellSignalStrengths failed! ");
                    fillCellInfoLowLevel(cellInfo);
                }
            }
        }

        public void fillCellInfoIfPossible(Context context, MediaNetworkInfo cellInfo) {
            if (Build.VERSION.SDK_INT <= 28) {
                fillCellInfoLowLevel(cellInfo);
            } else {
                fillCellInfoHighLevel(cellInfo);
            }
        }

        void fillCellInfoLowLevel(MediaNetworkInfo cellInfo) {
            cellInfo.rssi = getRssi();
            cellInfo.signalLevel = getLevel();
        }

        public int getAsuLevel() {
            return invokeMethod("getAsuLevel");
        }

        public int getLevel() {
            return invokeMethod("getLevel");
        }

        public int getRssi() {
            return invokeMethod("getDbm");
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int state, String incomingNumber) {
            super.onCallStateChanged(state, incomingNumber);
            final CommonUtility commonUtility = this.mCommonUtilityRef.get();
            Handler handler = this.mHandlerRef.get();
            if (commonUtility == null || handler == null) {
                return;
            }
            if (state == 0) {
                if (this.phoneStatusNeedResume) {
                    this.phoneStatusNeedResume = false;
                    Logging.d(CommonUtility.TAG, "system phone call end delay 1000ms");
                    handler.postDelayed(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.AgoraPhoneStateListener.1
                        @Override // java.lang.Runnable
                        public void run() {
                            commonUtility.onAudioRoutingPhoneChanged(true, 22, 0);
                        }
                    }, 1000L);
                    return;
                }
                return;
            }
            if (state == 1) {
                Logging.d(CommonUtility.TAG, "system phone call ring");
                this.phoneStatusNeedResume = true;
                commonUtility.onAudioRoutingPhoneChanged(false, 22, 1);
            } else if (state == 2) {
                Logging.d(CommonUtility.TAG, "system phone call start");
                this.phoneStatusNeedResume = true;
                commonUtility.onAudioRoutingPhoneChanged(false, 22, 2);
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            this.mSignalStrength = signalStrength;
        }
    }

    public static class AndroidContextInfo {
        public String configDir;
        public String dataDir;
        public String device;
        public String deviceInfo;
        public String manufacturer;
        public String pkgName;
        public String pluginDir;
        public String systemInfo;

        public String getConfigDir() {
            return this.configDir;
        }

        public String getDataDir() {
            return this.dataDir;
        }

        public String getDevice() {
            return this.device;
        }

        public String getDeviceInfo() {
            return this.deviceInfo;
        }

        public String getManufacturer() {
            return this.manufacturer;
        }

        public String getPkgName() {
            return this.pkgName;
        }

        public String getPluginDir() {
            return this.pluginDir;
        }

        public String getSystemInfo() {
            return this.systemInfo;
        }
    }

    interface Listener {
        void onAudioRoutingPhoneChanged(boolean enableAudio, int event, int arg);

        void onDispose();

        void onForegroundChanged(boolean isForeground);

        void onNetworkChange(MediaNetworkInfo networkInfo);
    }

    public static class MediaNetworkInfo {
        String localIp4 = "";
        String gatewayIp4 = "";
        String localIp6 = "";
        String gatewayIp6 = "";
        int networkType = -1;
        int networkSubtype = -1;
        int signalLevel = 0;
        int rssi = 0;
        int snr = -100;
        ArrayList<String> dnsList = null;
        int linkspeed = 0;
        int frequency = 0;
        ArrayList<String> ifconfigs = null;

        public int getAsu() {
            return this.snr;
        }

        public ArrayList<String> getDnsList() {
            return this.dnsList;
        }

        public int getFrequency() {
            return this.frequency;
        }

        public String getGatewayIp4() {
            return this.gatewayIp4;
        }

        public String getGatewayIp6() {
            return this.gatewayIp6;
        }

        public int getLinkspeed() {
            return this.linkspeed;
        }

        public String getLocalIp4() {
            return this.localIp4;
        }

        public String getLocalIp6() {
            return this.localIp6;
        }

        public int getNetworkSubtype() {
            return this.networkSubtype;
        }

        public int getNetworkType() {
            return this.networkType;
        }

        public int getRssi() {
            return this.rssi;
        }

        public int getSignalLevel() {
            return this.signalLevel;
        }

        public ArrayList<String> getVpnIfconfigs() {
            return this.ifconfigs;
        }
    }

    public interface SystemEventListener {
        void onAddressBound(String addr);

        void onAudioRoutingPhoneChanged(boolean enableAudio, int event, int arg);

        void onForegroundChanged(boolean isForeground);

        void onGravityOriChange(int mOrientation);

        void onNetworkChange(MediaNetworkInfo networkInfo);
    }

    private CommonUtility(Context context) {
        Logging.d(TAG, "constructor()");
        this.mContext = new WeakReference<>(context);
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        HandlerThread handlerThread = new HandlerThread("UtilityThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mHandler = handler;
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.1
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.startMonitor();
            }
        });
    }

    private CommonUtility(Context context, long handle) {
        Logging.d(TAG, "constructor()");
        this.mContext = new WeakReference<>(context);
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        HandlerThread handlerThread = new HandlerThread("UtilityThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mHandler = handler;
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.2
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.startMonitor();
            }
        });
    }

    static boolean checkAccessNetworkState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    static boolean checkAccessWifiState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    private void disableDisplayListener() {
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.mDisplayListener);
            this.mDisplayListener = null;
        }
        Logging.d(TAG, "[disableDisplayListener] done!");
    }

    private void enableDisplayListener(Context context) {
        DisplayManager displayManager;
        if (context == null || this.mDisplayListener != null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return;
        }
        DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: io.agora.utils2.internal.CommonUtility.9
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int displayId) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int displayId) {
                Log.d(CommonUtility.TAG, "VideoCaptureCamera onDisplayChanged");
                CommonUtility.this.updateOrientationManual();
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int displayId) {
            }
        };
        this.mDisplayListener = displayListener;
        displayManager.registerDisplayListener(displayListener, this.mHandler);
        Logging.d(TAG, "[enableDisplayListener] done!");
    }

    private static void fillWifiInfoIfPossible(Context context, MediaNetworkInfo ni) {
        DhcpInfo dhcpInfo;
        int i;
        InetAddress intToInetAddress;
        if (!checkAccessWifiState(context)) {
            Logging.w(TAG, "fail to fillWifiInfo, permission ACCESS_WIFI_STATE not granted");
            return;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        try {
            dhcpInfo = wifiManager.getDhcpInfo();
        } catch (Exception e) {
            Logging.e(TAG, "exception occured when getDhcpInfo: " + e);
            dhcpInfo = null;
        }
        if (dhcpInfo != null && (intToInetAddress = intToInetAddress(dhcpInfo.gateway)) != null) {
            ni.gatewayIp4 = intToInetAddress.getHostAddress();
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            Logging.w(TAG, "fail to fillWifiInfo, wifiInfo null");
            return;
        }
        ni.rssi = connectionInfo.getRssi();
        ni.signalLevel = WifiManager.calculateSignalLevel(ni.rssi, 5);
        ni.linkspeed = connectionInfo.getLinkSpeed();
        int frequency = connectionInfo.getFrequency();
        ni.frequency = frequency;
        if (frequency >= 5000) {
            i = 101;
        } else if (frequency < 2400) {
            return;
        } else {
            i = 100;
        }
        ni.networkSubtype = i;
    }

    public static int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    private static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        return (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = context.getExternalFilesDir(null)) == null) ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
    }

    public static String getAssetsFilePath(Context context, String str) {
        String str2;
        AssetFileDescriptor openFd;
        int fd;
        AssetFileDescriptor assetFileDescriptor = null;
        String str3 = null;
        assetFileDescriptor = null;
        if (context == null || TextUtils.isEmpty(str)) {
            Logging.e(TAG, "getAssetsFilePath failed for init error");
            return null;
        }
        try {
            try {
                openFd = context.getAssets().openFd(str.substring(str.indexOf("/assets/") + "/assets/".length()));
            } catch (Exception e) {
                e = e;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fd = ParcelFileDescriptor.dup(openFd.getFileDescriptor()).getFd();
        } catch (Exception e2) {
            e = e2;
            String str4 = str3;
            assetFileDescriptor = openFd;
            str2 = str4;
            e.printStackTrace();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            str3 = str2;
            Logging.d(TAG, "getAssetsFilePath is: " + str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            assetFileDescriptor = openFd;
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
        if (fd < 0) {
            if (openFd != null) {
                try {
                    openFd.close();
                    return null;
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return null;
        }
        str3 = "/assets/" + fd + OFFSET_SEPARATOR_CHARACTER + openFd.getStartOffset() + LENGTH_SEPARATOR_CHARACTER + openFd.getDeclaredLength();
        Logging.d(TAG, "getAssetsFilePath for init offset:" + openFd.getStartOffset() + "," + openFd.getDeclaredLength());
        if (openFd != null) {
            try {
                openFd.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
        Logging.d(TAG, "getAssetsFilePath is: " + str3);
        return str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getContentFilePath(android.content.Context r3, android.net.Uri r4) {
        /*
            java.lang.String r0 = "CommonUtility"
            r1 = 0
            if (r3 == 0) goto L7e
            if (r4 != 0) goto L9
            goto L7e
        L9:
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r4, r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L71
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.dup(r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L71
            int r4 = r4.getFd()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L71
            if (r3 == 0) goto L3e
            r3.close()     // Catch: java.io.IOException -> L25
            goto L3e
        L25:
            r3 = move-exception
            r3.printStackTrace()
            goto L3e
        L2a:
            r4 = move-exception
            goto L30
        L2c:
            r4 = move-exception
            goto L73
        L2e:
            r4 = move-exception
            r3 = r1
        L30:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L3d
            r3.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r3 = move-exception
            r3.printStackTrace()
        L3d:
            r4 = -1
        L3e:
            if (r4 >= 0) goto L41
            return r1
        L41:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "/proc/"
            r3.<init>(r1)
            int r1 = android.os.Process.myPid()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r1 = "/fd/"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "getContentFilePath is: "
            r4.<init>(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            io.agora.utils2.internal.Logging.d(r0, r4)
            return r3
        L71:
            r4 = move-exception
            r1 = r3
        L73:
            if (r1 == 0) goto L7d
            r1.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r3 = move-exception
            r3.printStackTrace()
        L7d:
            throw r4
        L7e:
            java.lang.String r3 = "getContentFilePath failed for init error"
            io.agora.utils2.internal.Logging.e(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.CommonUtility.getContentFilePath(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static AndroidContextInfo getContextInfo(Context context) {
        if (context == null) {
            Logging.w(TAG, "fail to getContextInfo, context null");
            return null;
        }
        AndroidContextInfo androidContextInfo = new AndroidContextInfo();
        androidContextInfo.device = DeviceUtils.getDeviceId();
        androidContextInfo.configDir = getAppPrivateStorageDir(context);
        androidContextInfo.dataDir = context.getCacheDir().getAbsolutePath();
        androidContextInfo.pluginDir = context.getApplicationInfo().nativeLibraryDir;
        androidContextInfo.deviceInfo = DeviceUtils.getDeviceInfo();
        androidContextInfo.systemInfo = DeviceUtils.getSystemInfo();
        androidContextInfo.manufacturer = DeviceUtils.getManufacturer();
        androidContextInfo.pkgName = context.getPackageName();
        return androidContextInfo;
    }

    public static int getCpuTemperature() {
        return DeviceUtils.getCpuTemperature();
    }

    public static int[] getDisplayMetrics() {
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return new int[]{0, 0};
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
            Logging.d(TAG, "getDisplayMetrics widthPixel: " + displayMetrics.heightPixels + " , heightPixel: " + displayMetrics.widthPixels);
            return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
        }
        return new int[]{0, 0};
    }

    public static float[] getDisplayXYDpi() {
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null) {
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
                Logging.d(TAG, "getDisplayXYDpi xdpi: " + displayMetrics.xdpi + " , ydpi: " + displayMetrics.ydpi);
                return new float[]{displayMetrics.xdpi, displayMetrics.ydpi};
            }
        }
        return new float[]{0.0f, 0.0f};
    }

    public static CommonUtility getInstance(Context context) {
        if (sInstance == null) {
            synchronized (CommonUtility.class) {
                if (sInstance == null) {
                    sInstance = new CommonUtility(context);
                }
            }
        }
        sInstance.reference.getAndIncrement();
        return sInstance;
    }

    private static String getIpAddressByType(InetAddress addr, boolean is_ipv4, StringBuilder first_local_ip) {
        if (is_ipv4 && (addr instanceof Inet4Address)) {
            String publicIpAddress = getPublicIpAddress(addr);
            if (!TextUtils.isEmpty(publicIpAddress) && first_local_ip.length() == 0) {
                first_local_ip.append(publicIpAddress);
            }
            return publicIpAddress;
        }
        if (is_ipv4 || !(addr instanceof Inet6Address)) {
            return null;
        }
        String publicIpAddress2 = getPublicIpAddress(addr);
        if (!TextUtils.isEmpty(publicIpAddress2) && first_local_ip.length() == 0) {
            first_local_ip.append(publicIpAddress2);
        }
        return publicIpAddress2;
    }

    public static String getLocalHost(boolean is_ipv4) {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            StringBuilder sb = new StringBuilder();
            for (NetworkInterface networkInterface : list) {
                if (!networkInterface.getName().startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String ipAddressByType = getIpAddressByType((InetAddress) it.next(), is_ipv4, sb);
                        if (!TextUtils.isEmpty(ipAddressByType)) {
                            return ipAddressByType;
                        }
                    }
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Exception e) {
            Logging.w(TAG, "fail to getLocalHost", e);
            return null;
        }
    }

    public static String[] getLocalHostList() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            for (NetworkInterface networkInterface : list) {
                String name = networkInterface.getName();
                if (!name.startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String inetAddressToIpAddress = inetAddressToIpAddress((InetAddress) it.next());
                        if (!TextUtils.isEmpty(inetAddressToIpAddress)) {
                            arrayList.add(inetAddressToIpAddress + "+" + name);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String[] strArr = new String[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                strArr[i] = (String) it2.next();
                i++;
            }
            return strArr;
        } catch (Exception e) {
            Logging.w(TAG, "fail to getLocalHostList", e);
            return null;
        }
    }

    private MediaNetworkInfo getNetworkInfo(Context context) {
        StringBuilder sb;
        MediaNetworkInfo mediaNetworkInfo = new MediaNetworkInfo();
        if (!checkAccessNetworkState(context)) {
            Logging.w(TAG, "fail to getNetworkInfo, permission ACCESS_NETWORK_STATE not granted");
            return mediaNetworkInfo;
        }
        if (this.shouldGetIp) {
            this.lastLocalIp4 = getLocalHost(true);
            this.lastLocalIp6 = getLocalHost(false);
            this.shouldGetIp = false;
        }
        if (!TextUtils.isEmpty(this.lastLocalIp4)) {
            mediaNetworkInfo.localIp4 = this.lastLocalIp4;
        }
        if (!TextUtils.isEmpty(this.lastLocalIp6)) {
            mediaNetworkInfo.localIp6 = this.lastLocalIp6;
        }
        NetworkInfo networkInfo = Connectivity.getNetworkInfo(context);
        mediaNetworkInfo.networkType = Connectivity.getNetworkType(networkInfo);
        if (networkInfo != null) {
            mediaNetworkInfo.networkSubtype = networkInfo.getSubtype();
        }
        mediaNetworkInfo.dnsList = Connectivity.getDnsList();
        if (mediaNetworkInfo.networkType != 2) {
            AgoraPhoneStateListener agoraPhoneStateListener = this.mPhoneStateListener;
            if (agoraPhoneStateListener != null) {
                agoraPhoneStateListener.fillCellInfoIfPossible(context, mediaNetworkInfo);
                sb = new StringBuilder("networkType from Phone State Listener， rssi = ");
            }
            mediaNetworkInfo.ifconfigs = getVpnIfconfigs();
            return mediaNetworkInfo;
        }
        fillWifiInfoIfPossible(context, mediaNetworkInfo);
        sb = new StringBuilder("networkType from WIFI, rssi = ");
        Logging.d(TAG, sb.append(mediaNetworkInfo.rssi).append(" level = ").append(mediaNetworkInfo.signalLevel).toString());
        mediaNetworkInfo.ifconfigs = getVpnIfconfigs();
        return mediaNetworkInfo;
    }

    private static String getPublicIpAddress(InetAddress address) {
        if (address.isLoopbackAddress() || address.isLinkLocalAddress() || address.isAnyLocalAddress()) {
            return null;
        }
        return address.getHostAddress();
    }

    private int getRotationByDM() {
        Display display;
        DisplayManager displayManager = ContextUtils.getApplicationContext() != null ? (DisplayManager) ContextUtils.getApplicationContext().getSystemService("display") : null;
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return -1;
        }
        return display.getRotation();
    }

    private int getRotationByWM() {
        Display defaultDisplay;
        WindowManager windowManager = ContextUtils.getApplicationContext() != null ? (WindowManager) ContextUtils.getApplicationContext().getSystemService("window") : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    private static String getSystemProperty(String name) throws Exception {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", String.class).invoke(cls, name);
    }

    public static Object getSystemService(Context context, String serviceName) {
        return context.getSystemService(serviceName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inetAddressToIpAddress(InetAddress address) {
        if (address.isLoopbackAddress()) {
            return null;
        }
        if (address instanceof Inet4Address) {
            return ((Inet4Address) address).getHostAddress();
        }
        boolean z = address instanceof Inet6Address;
        return null;
    }

    private static InetAddress intToInetAddress(int hostAddress) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (hostAddress & 255), (byte) ((hostAddress >> 8) & 255), (byte) ((hostAddress >> 16) & 255), (byte) ((hostAddress >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public static boolean isAppInForeground() {
        final ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Runnable runnable = new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                } catch (Exception e) {
                    Logging.e(CommonUtility.TAG, "get App InForeground state failed.", e);
                }
                countDownLatch.countDown();
            }
        };
        if (mProcessInfoHandler == null) {
            HandlerThread handlerThread = new HandlerThread("processInfo");
            handlerThread.start();
            mProcessInfoHandler = new Handler(handlerThread.getLooper());
        }
        mProcessInfoHandler.post(runnable);
        if (ThreadUtils.awaitUninterruptibly(countDownLatch, 100L)) {
            return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
        }
        Logging.e(TAG, "get App InForeground state timeout.");
        mProcessInfoHandler.removeCallbacksAndMessages(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isSimulator() {
        /*
            java.lang.String r0 = "CommonUtility"
            java.lang.String r1 = "manufacturer = "
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = r4.toLowerCase()     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = "netease"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Exception -> L25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r6.<init>(r1)     // Catch: java.lang.Exception -> L26
            java.lang.StringBuilder r1 = r6.append(r4)     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L26
            io.agora.utils2.internal.Logging.d(r0, r1)     // Catch: java.lang.Exception -> L26
            goto L2b
        L24:
            r4 = r2
        L25:
            r5 = r3
        L26:
            java.lang.String r1 = "get manufacturer info fail."
            io.agora.utils2.internal.Logging.e(r0, r1)
        L2b:
            boolean r0 = isSimulatorProperty()
            if (r0 == 0) goto L33
            int r5 = r5 + 1
        L33:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            java.lang.String r6 = "welldo"
            r7 = 1
            if (r0 <= r1) goto L66
            java.lang.String r0 = "nokia"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L59
            java.lang.String r0 = "Nokia_N1"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L58
            java.lang.String r0 = "N1"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L59
        L58:
            return r3
        L59:
            if (r5 <= 0) goto L7f
            java.lang.String r0 = r4.toLowerCase()
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L7f
            return r7
        L66:
            java.lang.String r0 = r2.toLowerCase()
            java.lang.String r1 = "unknown"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L74
            if (r5 <= 0) goto L7f
        L74:
            java.lang.String r0 = r4.toLowerCase()
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L7f
            return r7
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.CommonUtility.isSimulator():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        if (r2.contains("android") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        if (r10.contains("goldfish") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0088, code lost:
    
        if (r9.contains("sdk_gphone") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0045, code lost:
    
        if (r3.toLowerCase().contains("asus") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x001c, code lost:
    
        if (r6.toLowerCase().equals("intel") != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #7 {Exception -> 0x00c3, blocks: (B:26:0x00b2, B:28:0x00ba), top: B:25:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean isSimulatorProperty() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.CommonUtility.isSimulatorProperty():boolean");
    }

    public static int isSpeakerphoneEnabled(Context context) {
        if (context != null) {
            return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn() ? 1 : 0;
        }
        Logging.w(TAG, "fail to isSpeakerphoneEnabled, context null");
        return -1;
    }

    private void monitorOrientationChange(Context context, boolean enable) {
        if (enable) {
            enableDisplayListener(context);
            regiseterBroadcaster(context);
        } else {
            disableDisplayListener();
            unregisterBroadcaster(context);
        }
    }

    private void regiseterBroadcaster(Context context) {
        if (context != null && this.mOrientationObserver == null) {
            this.mOrientationObserver = new BroadcastReceiver() { // from class: io.agora.utils2.internal.CommonUtility.11
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) {
                        Log.d(CommonUtility.TAG, "VideoCaptureCamera OrientationObserver");
                        CommonUtility.this.updateOrientationManual();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            context.registerReceiver(this.mOrientationObserver, intentFilter);
            Logging.d(TAG, "[regiseterBroadcaster] done!");
        }
    }

    public static int safeLoadLibrary(String path) {
        if (TextUtils.isEmpty(path)) {
            return -2;
        }
        int i = -1;
        try {
            System.loadLibrary(path);
            i = 0;
        } catch (NullPointerException | SecurityException | Exception | UnsatisfiedLinkError unused) {
        }
        if (i != 0) {
            Log.i(TAG, "failed to load library: " + path);
        }
        return i;
    }

    public static void setIgnoreMonitor(boolean ignore) {
        ignoreMonitor = ignore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopMonitor() {
        Logging.d(TAG, "stopMonitor()");
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        try {
            if (this.mPhoneStateListener != null) {
                ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 0);
                this.mPhoneStateListener = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (this.mobileNetworkCallback != null) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback(this.mobileNetworkCallback);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver = this.mConnectionBroadcastReceiver;
            if (connectionChangeBroadcastReceiver != null) {
                context.unregisterReceiver(connectionChangeBroadcastReceiver);
                this.mConnectionBroadcastReceiver = null;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            PowerChangeReceiver powerChangeReceiver = this.mPowerChangeReceiver;
            if (powerChangeReceiver != null) {
                context.unregisterReceiver(powerChangeReceiver);
                this.mPowerChangeReceiver = null;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            if (this.mProcessLifecycleOwner != null) {
                ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.mProcessLifecycleOwner);
                this.mProcessLifecycleOwner = null;
            }
        } catch (Exception e5) {
            Logging.e(TAG, "unregister ProcessLifecycleOwner failed ", e5);
        }
        try {
            monitorOrientationChange(context, false);
        } catch (Exception e6) {
            Logging.e(TAG, "Unable to monitorOrientationChange, ", e6);
        }
        closeGravityMonitor();
    }

    private void unregisterBroadcaster(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = this.mOrientationObserver) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        Logging.d(TAG, "[unregisterBroadcaster] done!");
    }

    public int VPNBehindAddress() {
        Context context = this.mContext.get();
        if (context == null) {
            return 1;
        }
        return Connectivity.VPNBehindAddress(context);
    }

    public void bindSocket2Network(final int socketfd, String address) {
        final ConnectivityManager connectivityManager = (ConnectivityManager) this.mContext.get().getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).build();
        final String str = address.toString();
        ConnectivityManager.NetworkCallback networkCallback = this.mobileNetworkCallback;
        if (networkCallback != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: io.agora.utils2.internal.CommonUtility.6
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                if (linkProperties == null || linkProperties.getLinkAddresses().isEmpty()) {
                    Logging.e(CommonUtility.TAG, "onAvailable: prop is null or empty!");
                    return;
                }
                String inetAddressToIpAddress = CommonUtility.inetAddressToIpAddress(linkProperties.getLinkAddresses().get(0).getAddress());
                if (inetAddressToIpAddress == null || !inetAddressToIpAddress.equals(str)) {
                    return;
                }
                Logging.d(CommonUtility.TAG, "start bindSocket2Network");
                Logging.d(CommonUtility.TAG, "addressInner" + str);
                FileDescriptor fileDescriptor = new FileDescriptor();
                try {
                    Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                    declaredField.setAccessible(true);
                    declaredField.setInt(fileDescriptor, socketfd);
                    network.bindSocket(fileDescriptor);
                    this.notifyAddressBound(str);
                    Logging.d(CommonUtility.TAG, "bindSocket2Network success: network" + network + "+socketfd" + socketfd);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.mobileNetworkCallback = networkCallback2;
        try {
            connectivityManager.requestNetwork(build, networkCallback2);
        } catch (Exception e) {
            this.mobileNetworkCallback = null;
            Logging.e(TAG, "requestNetwork failed " + e.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r2.mLastOrientation != 180) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0012, code lost:
    
        r2.mLastOrientation = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
    
        if (r2.mLastOrientation != 90) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0010, code lost:
    
        if (r2.mLastOrientation != 270) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int checkOrientation(int r3) {
        /*
            r2 = this;
            r0 = -1
            if (r3 != r0) goto L4
            return r0
        L4:
            r0 = 340(0x154, float:4.76E-43)
            if (r3 > r0) goto Lc
            r0 = 20
            if (r3 >= r0) goto L15
        Lc:
            int r0 = r2.mLastOrientation
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 == r1) goto L15
        L12:
            r2.mLastOrientation = r1
            goto L42
        L15:
            r0 = 70
            if (r3 <= r0) goto L24
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 >= r0) goto L24
            int r0 = r2.mLastOrientation
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 == r1) goto L24
            goto L12
        L24:
            r0 = 160(0xa0, float:2.24E-43)
            if (r3 <= r0) goto L33
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto L33
            int r0 = r2.mLastOrientation
            r1 = 90
            if (r0 == r1) goto L33
            goto L12
        L33:
            r0 = 250(0xfa, float:3.5E-43)
            if (r3 <= r0) goto L42
            r0 = 290(0x122, float:4.06E-43)
            if (r3 >= r0) goto L42
            int r3 = r2.mLastOrientation
            if (r3 == 0) goto L42
            r3 = 0
            r2.mLastOrientation = r3
        L42:
            monitor-enter(r2)
            java.util.ArrayList<io.agora.utils2.internal.CommonUtility$SystemEventListener> r3 = r2.systemEventListeners     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L5f
        L49:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L5f
            io.agora.utils2.internal.CommonUtility$SystemEventListener r0 = (io.agora.utils2.internal.CommonUtility.SystemEventListener) r0     // Catch: java.lang.Throwable -> L5f
            int r1 = r2.mLastOrientation     // Catch: java.lang.Throwable -> L5f
            r0.onGravityOriChange(r1)     // Catch: java.lang.Throwable -> L5f
            goto L49
        L5b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            int r3 = r2.mLastOrientation
            return r3
        L5f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.CommonUtility.checkOrientation(int):int");
    }

    public int closeGravityMonitor() {
        OrientationEventListener orientationEventListener;
        if (this.mContext.get() == null) {
            return -1;
        }
        try {
            orientationEventListener = this.mOrientationListener;
        } catch (Exception e) {
            Logging.e(TAG, "Unable to close OrientationEventListener, ", e);
        }
        if (orientationEventListener == null) {
            Logging.e(TAG, "[closeGravityMonitor] mOrientationListener is null!");
            return -1;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        Logging.d(TAG, "[closeGravityMonitor] done!");
        return 0;
    }

    public void dispose() {
        if (sInstance == null || sInstance.reference.decrementAndGet() > 0) {
            return;
        }
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        Logging.d(TAG, "dispose()");
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.3
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.stopMonitor();
            }
        });
        Handler handler = mProcessInfoHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.4
                @Override // java.lang.Runnable
                public void run() {
                    CommonUtility.mProcessInfoHandler.getLooper().quit();
                    Handler unused = CommonUtility.mProcessInfoHandler = null;
                }
            });
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.5
            @Override // java.lang.Runnable
            public void run() {
                countDownLatch.countDown();
                CommonUtility.this.mHandler.getLooper().quit();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onDispose();
        }
        synchronized (this) {
            this.systemEventListeners.clear();
        }
        synchronized (CommonUtility.class) {
            sInstance = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[Catch: IOException -> 0x00cb, TRY_LEAVE, TryCatch #5 {IOException -> 0x00cb, blocks: (B:69:0x00c7, B:62:0x00cf), top: B:68:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getAssetsCacheFile(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.CommonUtility.getAssetsCacheFile(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public int getBatteryLifePercent() {
        if (this.mContext.get() != null) {
            return this.mBatteryPercentage;
        }
        return 255;
    }

    public int getDisplayRotation() {
        if (!this.mUpdateRotationTrigger && this.lastOrientation != -1) {
            return this.lastOrientation;
        }
        int rotationByDM = getRotationByDM();
        if (rotationByDM < 0) {
            rotationByDM = getRotationByWM();
        }
        this.lastOrientation = rotationByDM;
        Log.d(TAG, "VideoCaptureCamera getDisplayRotation: " + rotationByDM);
        return rotationByDM;
    }

    Handler getHandler() {
        return this.mHandler;
    }

    public MediaNetworkInfo getNetworkInfo() {
        Context context = this.mContext.get();
        if (context != null) {
            return getNetworkInfo(context);
        }
        return null;
    }

    public int getNetworkType() {
        Context context = this.mContext.get();
        if (context == null) {
            return -1;
        }
        if (checkAccessNetworkState(context)) {
            return Connectivity.getNetworkType(context);
        }
        Logging.w(TAG, "fail to getNetworkType, permission ACCESS_NETWORK_STATE not granted");
        return -1;
    }

    ProcessLifecycleOwner getProcessLifecycleOwner() {
        return this.mProcessLifecycleOwner;
    }

    public String getRealFilePath(Context context, String url) {
        if (context == null || TextUtils.isEmpty(url)) {
            Logging.e(TAG, "getRealFilePath failed for init error");
            return "";
        }
        String assetsFilePath = url.startsWith("/assets/") ? getAssetsFilePath(context, url) : url.startsWith(PREFIX_URI) ? getContentFilePath(context, Uri.parse(url)) : null;
        return assetsFilePath != null ? assetsFilePath : "";
    }

    public ArrayList<String> getVpnIfconfigs() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                String name = ((NetworkInterface) it.next()).getName();
                if (name.contains("tun") || name.contains("ppp") || name.contains("ipsec") || name.contains("tap")) {
                    arrayList.add(name);
                }
            }
        } catch (Exception e) {
            Logging.e(TAG, "Fail to get network interfaces array list. ", e);
        }
        return arrayList;
    }

    public void notifyAddressBound(String addr) {
        synchronized (this) {
            Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onAddressBound(addr);
            }
        }
    }

    void onAudioRoutingPhoneChanged(final boolean enableAudio, final int event, final int arg) {
        if (this.mDisposed) {
            return;
        }
        Logging.d(TAG, "onAudioRoutingPhoneChanged() enableAudio:" + enableAudio + ", event:" + event + ", arg: " + arg);
        synchronized (this) {
            Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
            while (it.hasNext()) {
                SystemEventListener next = it.next();
                Log.d(TAG, "onAudioRoutingPhoneChanged: " + next.getClass().getName());
                next.onAudioRoutingPhoneChanged(enableAudio, event, arg);
            }
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAudioRoutingPhoneChanged(enableAudio, event, arg);
        }
    }

    void onForegroundChanged(boolean foreground) {
        Log.d(TAG, "onForegroundChanged() " + foreground);
        if (this.mDisposed) {
            return;
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onForegroundChanged(foreground);
        }
        synchronized (this) {
            Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onForegroundChanged(foreground);
            }
        }
    }

    void onNetworkChange() {
        if (this.mDisposed) {
            return;
        }
        this.shouldGetIp = true;
        Logging.d(TAG, "onNetworkChange()");
        MediaNetworkInfo networkInfo = getNetworkInfo(this.mContext.get());
        synchronized (this) {
            Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
            while (it.hasNext()) {
                SystemEventListener next = it.next();
                Log.d(TAG, "onNetworkChange: " + next.getClass().getName());
                next.onNetworkChange(networkInfo);
            }
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onNetworkChange(networkInfo);
        }
    }

    void onPowerChange(int batteryPercentage) {
        Logging.d(TAG, "onPowerChange() " + batteryPercentage);
        this.mBatteryPercentage = batteryPercentage;
    }

    public void registerSystemEventListener(SystemEventListener eventListener) {
        Log.d(TAG, "registerSystemEventListener: " + eventListener.getClass().getName());
        if (eventListener == null) {
            return;
        }
        synchronized (this) {
            if (!this.systemEventListeners.contains(eventListener)) {
                this.systemEventListeners.add(eventListener);
            }
        }
    }

    void setExtraConnectionActionForTesting(String action) {
        this.mExtraConnectivityFilterActionForTesting = action;
    }

    void setListener(Listener listener) {
        this.mListener = listener;
    }

    public int setupGravityMonitor() {
        Context context = this.mContext.get();
        if (context == null) {
            return -1;
        }
        try {
            if (this.mOrientationListener == null) {
                this.mOrientationListener = new OrientationEventListener(context, 2) { // from class: io.agora.utils2.internal.CommonUtility.7
                    @Override // android.view.OrientationEventListener
                    public void onOrientationChanged(int orientation) {
                        if (orientation == -1) {
                            return;
                        }
                        CommonUtility.this.checkOrientation(orientation);
                    }
                };
            }
            this.mOrientationListener.enable();
            Logging.d(TAG, "[setupGravityMonitor] done!");
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create OrientationEventListener, ", e);
        }
        return -1;
    }

    void startMonitor() {
        Logging.d(TAG, "startMonitor()");
        if (ignoreMonitor) {
            Logging.e(TAG, "ignoreMonitor in simulator, just for ut");
            return;
        }
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        try {
            this.mPhoneStateListener = new AgoraPhoneStateListener(this, this.mHandler);
            ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 288);
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create PhoneStateListener, ", e);
        }
        try {
            ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver = new ConnectionChangeBroadcastReceiver(this);
            this.mConnectionBroadcastReceiver = connectionChangeBroadcastReceiver;
            context.registerReceiver(connectionChangeBroadcastReceiver, new IntentFilter(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION));
            if (!TextUtils.isEmpty(this.mExtraConnectivityFilterActionForTesting)) {
                context.registerReceiver(this.mConnectionBroadcastReceiver, new IntentFilter(this.mExtraConnectivityFilterActionForTesting));
            }
        } catch (Exception e2) {
            Logging.e(TAG, "Unable to create ConnectionChangeBroadcastReceiver, ", e2);
        }
        try {
            this.mPowerChangeReceiver = new PowerChangeReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.mPowerChangeReceiver, intentFilter);
        } catch (Exception e3) {
            Logging.e(TAG, "Unable to create PowerChangeReceiver, ", e3);
        }
        try {
            this.mProcessLifecycleOwner = new ProcessLifecycleOwner(isAppInForeground(), this);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.mProcessLifecycleOwner);
        } catch (Exception e4) {
            Logging.e(TAG, "Unable to registerActivityLifecycleCallbacks, ", e4);
        }
        try {
            monitorOrientationChange(context, true);
        } catch (Exception e5) {
            Logging.e(TAG, "Unable to monitorOrientationChange, ", e5);
        }
    }

    public void unregisterSystemEventListener(SystemEventListener eventListener) {
        if (eventListener == null) {
            return;
        }
        synchronized (this) {
            if (this.systemEventListeners.contains(eventListener)) {
                this.systemEventListeners.remove(eventListener);
            }
        }
    }

    public void updateOrientationManual() {
        if (this.mHandler == null || this.mDisposed) {
            return;
        }
        this.mUpdateRotationTrigger = true;
        this.mHandler.postDelayed(this.rotationRunnable, 200L);
    }
}
