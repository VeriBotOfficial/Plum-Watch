package com.amap.location.support;

import com.amap.location.support.log.ALLog;
import com.amap.location.support.log.ILog;
import com.amap.location.support.network.INetwork;
import com.amap.location.support.signal.cell.ITelephonyManager;
import com.amap.location.support.signal.gnss.IGnssManager;
import com.amap.location.support.signal.status.ISwitchManager;
import com.amap.location.support.signal.wifi.IWifiManager;
import com.amap.location.support.storage.IKeyValueStorerManager;
import com.amap.location.support.uptunnel.IUpTunnel;
import com.amap.location.support.uptunnel.UpTunnel;

/* loaded from: classes11.dex */
public class AmapContext {
    public static boolean DEBUG = false;
    private static volatile IGnssManager sGnssManager;
    private static volatile IKeyValueStorerManager sKeyValueStorerManager;
    private static volatile INetwork sNetwork;
    private static volatile ISwitchManager sSwitchManager;
    private static volatile ITelephonyManager sTelephonyManager;
    private static volatile IWifiManager sWifiManager;

    public static IGnssManager getGnssManager() {
        return sGnssManager;
    }

    public static IKeyValueStorerManager getKeyValueStorerManager() {
        return sKeyValueStorerManager;
    }

    public static INetwork getNetwork() {
        return sNetwork;
    }

    public static ISwitchManager getSwitchManager() {
        return sSwitchManager;
    }

    public static ITelephonyManager getTelephonyManager() {
        return sTelephonyManager;
    }

    public static IWifiManager getWifiManager() {
        return sWifiManager;
    }

    public static void initGnssManager(IGnssManager iGnssManager) {
        if (iGnssManager != null) {
            sGnssManager = iGnssManager;
        }
    }

    public static void initKeyValueStorerManager(IKeyValueStorerManager iKeyValueStorerManager) {
        if (iKeyValueStorerManager != null) {
            sKeyValueStorerManager = iKeyValueStorerManager;
        }
    }

    public static void initLog(ILog iLog) {
        ALLog.init(iLog);
    }

    public static void initNetwork(INetwork iNetwork) {
        if (iNetwork != null) {
            sNetwork = iNetwork;
        }
    }

    public static void initSwitchManager(ISwitchManager iSwitchManager) {
        if (iSwitchManager != null) {
            sSwitchManager = iSwitchManager;
        }
    }

    public static void initTelephonyManager(ITelephonyManager iTelephonyManager) {
        if (iTelephonyManager != null) {
            sTelephonyManager = iTelephonyManager;
        }
    }

    public static void initUptunnel(IUpTunnel iUpTunnel) {
        UpTunnel.init(iUpTunnel);
    }

    public static void initWifiManager(IWifiManager iWifiManager) {
        if (iWifiManager != null) {
            sWifiManager = iWifiManager;
        }
    }
}
