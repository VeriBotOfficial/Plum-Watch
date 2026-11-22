package com.amap.location.support.signal.wifi;

import com.amap.location.support.bean.wifi.AmapDhcpInfo;
import com.amap.location.support.bean.wifi.AmapWifi;
import java.util.List;

/* loaded from: classes11.dex */
public interface IWifiManager {
    void addListener(WifiStatusListener wifiStatusListener, Object obj);

    boolean enableWifiAlwaysScan(boolean z);

    AmapWifi getConnectionInfo();

    AmapDhcpInfo getDhcpInfo();

    List<AmapWifi> getScanResults();

    boolean isScanAlwaysAvailable();

    boolean isWifiEnabled();

    void removeListener(WifiStatusListener wifiStatusListener);

    boolean startScan();
}
