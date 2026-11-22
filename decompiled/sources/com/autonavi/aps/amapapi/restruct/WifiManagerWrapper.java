package com.autonavi.aps.amapapi.restruct;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.location.support.bean.wifi.AmapWifi;
import com.autonavi.aps.amapapi.ICollectionManager;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.utils.AuthUtil;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.DebugUtils;
import com.autonavi.aps.amapapi.utils.Reflect;
import com.autonavi.aps.amapapi.utils.Utils;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* loaded from: classes12.dex */
public class WifiManagerWrapper {
    public static long lLastWifiChange;
    static long t;
    static long u;
    static long v;
    static long w;

    /* renamed from: a, reason: collision with root package name */
    WifiManager f6686a;
    Context d;
    WifiAgeEstimator m;
    private ICollectionManager r;
    public static HashMap<String, Long> lastResultMap = new HashMap<>(36);
    public static long lastWifiListUpdate = 0;
    static int x = 0;
    public static long lLastCarrierWifiChange = 0;
    ArrayList<AmapWifi> b = new ArrayList<>();
    ArrayList<AmapWifi> c = new ArrayList<>();
    boolean e = false;
    StringBuilder f = null;
    boolean g = true;
    boolean h = true;
    boolean i = true;
    private volatile WifiInfoWrapper j = null;
    String k = null;
    TreeMap<Integer, AmapWifi> l = null;
    public boolean isWifiEnabled = true;
    public boolean mSystemWifiEnabled = true;
    public boolean mISStartCollect = false;
    private String n = "";
    long o = 0;
    ConnectivityManager p = null;

    /* renamed from: q, reason: collision with root package name */
    private long f6687q = 30000;
    volatile boolean s = false;

    public WifiManagerWrapper(Context context, WifiManager wifiManager, Handler handler) {
        this.f6686a = wifiManager;
        this.d = context;
        WifiAgeEstimator wifiAgeEstimator = new WifiAgeEstimator(context, "wifiAgee", handler);
        this.m = wifiAgeEstimator;
        wifiAgeEstimator.start();
    }

    List<AmapWifi> a() {
        List<ScanResult> list;
        if (this.f6686a != null) {
            try {
                if (Utils.hasPerminssion(this.d, Const.ACCESS_WIFI_STATE_SELF_BASE64)) {
                    list = this.f6686a.getScanResults();
                } else {
                    CoreUtil.reportError(new Exception("gst_n_aws"), "OPENSDK_WMW", "gsr_n_aws");
                    list = null;
                }
                HashMap<String, Long> hashMap = new HashMap<>(36);
                if (list != null) {
                    for (ScanResult scanResult : list) {
                        hashMap.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                    }
                }
                if (lastResultMap.isEmpty() || !lastResultMap.equals(hashMap)) {
                    lastResultMap = hashMap;
                    lastWifiListUpdate = Utils.getTimeBoot();
                }
                this.k = null;
                ArrayList arrayList = new ArrayList();
                this.n = "";
                this.j = getWifiAccess();
                if (wifiUseful(this.j)) {
                    this.n = this.j.getBSSID();
                }
                if (list != null && list.size() > 0) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ScanResult scanResult2 = list.get(i);
                        AmapWifi amapWifi = new AmapWifi(!TextUtils.isEmpty(this.n) && this.n.equals(scanResult2.BSSID));
                        amapWifi.ssid = scanResult2.SSID;
                        amapWifi.frequency = scanResult2.frequency;
                        amapWifi.timestamp = scanResult2.timestamp;
                        amapWifi.mac = AmapWifi.macToLong(scanResult2.BSSID);
                        amapWifi.rssi = (short) scanResult2.level;
                        short elapsedRealtime = (short) ((SystemClock.elapsedRealtime() - (scanResult2.timestamp / 1000)) / 1000);
                        amapWifi.freshness = elapsedRealtime;
                        if (elapsedRealtime < 0) {
                            amapWifi.freshness = (short) 0;
                        }
                        amapWifi.lastUpdateUtcMills = Utils.getTimeBoot();
                        arrayList.add(amapWifi);
                    }
                }
                this.m.update((List) arrayList);
                return arrayList;
            } catch (SecurityException e) {
                this.k = e.getMessage();
            } catch (Throwable th) {
                this.k = null;
                CoreUtil.reportError(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    boolean b() {
        long timeBoot = Utils.getTimeBoot() - t;
        if (timeBoot < 4900) {
            return false;
        }
        if (this.p == null) {
            this.p = (ConnectivityManager) Utils.getServ(this.d, "connectivity");
        }
        if (wifiAccess(this.p) && timeBoot < Const.MINWIFIUPDATE_ACCESS) {
            return false;
        }
        if (x > 1) {
            long j = this.f6687q;
            if (j == 30000) {
                j = AuthUtil.getAPWifiScanInterval() != -1 ? AuthUtil.getAPWifiScanInterval() : 30000L;
            }
            if (Build.VERSION.SDK_INT >= 28 && timeBoot < j) {
                return false;
            }
        }
        if (this.f6686a != null) {
            t = Utils.getTimeBoot();
            int i = x;
            if (i < 2) {
                x = i + 1;
            }
            if (Utils.hasPerminssion(this.d, Const.CHANGE_WIFI_STATE_SELF_BASE64)) {
                return this.f6686a.startScan();
            }
            CoreUtil.reportError(new Exception("n_cws"), "OPENSDK_WMW", "wfs_n_cws");
        }
        return false;
    }

    boolean c() {
        this.isWifiEnabled = this.f6686a == null ? false : Utils.isWifiAble(this.d);
        checkSystemWifiEnabled();
        if (this.isWifiEnabled && this.g) {
            if (v == 0) {
                return true;
            }
            if (Utils.getTimeBoot() - v >= 4900 && Utils.getTimeBoot() - lLastWifiChange >= 1500) {
                Utils.getTimeBoot();
                return true;
            }
        }
        return false;
    }

    public void checkSystemWifiEnabled() {
        try {
            if (Utils.hasPerminssion(this.d, Const.ACCESS_WIFI_STATE_SELF_BASE64)) {
                this.mSystemWifiEnabled = this.f6686a.isWifiEnabled();
            }
        } catch (Throwable unused) {
            DebugUtils.writeCat("WMW | cswe e", false);
        }
    }

    void d() {
        if (c()) {
            try {
                if (b()) {
                    v = Utils.getTimeBoot();
                }
            } catch (Throwable th) {
                CoreUtil.reportError(th, "WifiManager", "wifiScan");
            }
        }
    }

    public void destroy(boolean z) {
        resetWifiData();
        this.b.clear();
        this.m.destroy(z);
    }

    public void enableWifiAlwaysScan(boolean z) {
        Context context = this.d;
        if (!AuthUtil.isCanAlwaysScanWifi() || !this.i || this.f6686a == null || context == null || !z || Utils.getSdk() <= 17) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (((Integer) Reflect.invokeStaticMethod("android.provider.Settings$Global", "getInt", new Object[]{contentResolver, "wifi_scan_always_enabled"}, (Class<?>[]) new Class[]{ContentResolver.class, String.class})).intValue() == 0) {
                Reflect.invokeStaticMethod("android.provider.Settings$Global", "putInt", new Object[]{contentResolver, "wifi_scan_always_enabled", 1}, (Class<?>[]) new Class[]{ContentResolver.class, String.class, Integer.TYPE});
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "WifiManagerWrapper", "enableWifiAlwaysScan");
        }
    }

    public ArrayList<AmapWifi> getAmapWifis() {
        if (!this.mISStartCollect) {
            return this.c;
        }
        updateWifi(true);
        return this.c;
    }

    public WifiInfo getConnectionInfo() {
        try {
            if (this.f6686a == null) {
                return null;
            }
            if (Utils.hasPerminssion(this.d, Const.ACCESS_WIFI_STATE_SELF_BASE64)) {
                return this.f6686a.getConnectionInfo();
            }
            CoreUtil.reportError(new Exception("gci_n_aws"), "OPENSDK_WMW", "gci_n_aws");
            return null;
        } catch (Throwable th) {
            CoreUtil.reportError(th, "WifiManagerWrapper", "getConnectionInfo");
            return null;
        }
    }

    public long getMMacUpdateTime() {
        return this.o;
    }

    public ArrayList<AmapWifi> getScanResultsParam() {
        if (this.b == null) {
            return null;
        }
        ArrayList<AmapWifi> arrayList = new ArrayList<>();
        if (!this.b.isEmpty()) {
            arrayList.addAll(this.b);
        }
        return arrayList;
    }

    public String getSecurityException() {
        return this.k;
    }

    public WifiInfoWrapper getWifiAccess() {
        checkSystemWifiEnabled();
        if (!isSystemWifiEnabled()) {
            return null;
        }
        if (this.j == null) {
            this.j = new WifiInfoWrapper(getConnectionInfo());
        }
        return this.j;
    }

    public String getWifiAge() {
        return String.valueOf(Utils.getTimeBoot() - lLastWifiChange);
    }

    public String getWifiParam() {
        String str;
        StringBuilder sb = this.f;
        int i = 0;
        if (sb == null) {
            this.f = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        this.e = false;
        int size = this.b.size();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i >= size) {
                break;
            }
            String longToMac = AmapWifi.longToMac(this.b.get(i).mac);
            if (!this.h && !"<unknown ssid>".equals(this.b.get(i).ssid)) {
                z = true;
            }
            if (TextUtils.isEmpty(this.n) || !this.n.equals(longToMac)) {
                z3 = z2;
                str = "nb";
            } else {
                str = ak.Q;
            }
            this.f.append(String.format(Locale.US, "#%s,%s", longToMac, str));
            i++;
            z2 = z3;
        }
        if (this.b.size() == 0) {
            z = true;
        }
        if (!this.h && !z) {
            this.e = true;
        }
        if (!z2 && !TextUtils.isEmpty(this.n)) {
            this.f.append("#").append(this.n);
            this.f.append(",access");
        }
        return this.f.toString();
    }

    public long getWifiResultAge() {
        return ((Utils.getTimeBoot() - lastWifiListUpdate) / 1000) + 1;
    }

    public boolean isMock() {
        return this.e;
    }

    public boolean isSystemWifiEnabled() {
        return this.mSystemWifiEnabled;
    }

    public boolean isWifiEnabled() {
        return this.isWifiEnabled;
    }

    public void onCollectLocation() {
        try {
            this.mISStartCollect = true;
            List<AmapWifi> a2 = a();
            if (a2 != null) {
                this.b.clear();
                this.b.addAll(a2);
            }
            a(true);
        } catch (Throwable unused) {
        }
    }

    public void resetWifiAccess() {
        this.j = null;
    }

    public void resetWifiData() {
        this.j = null;
        this.b.clear();
    }

    public void setCollectionManager(ICollectionManager iCollectionManager) {
        this.r = iCollectionManager;
    }

    public void setOption(boolean z, boolean z2, boolean z3, boolean z4) {
        setOption(z, z2, z3, z4, 30000L);
    }

    public void updateWifi(boolean z) {
        List<AmapWifi> list;
        int i;
        if (!z) {
            d();
        } else if (c()) {
            long timeBoot = Utils.getTimeBoot();
            if (timeBoot - u >= 10000) {
                this.b.clear();
                w = lLastWifiChange;
            }
            d();
            if (timeBoot - u >= 10000) {
                for (int i2 = 20; i2 > 0 && lLastWifiChange == w; i2--) {
                    try {
                        Thread.sleep(3000 / 20);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        boolean z2 = true;
        if (this.s) {
            this.s = false;
            try {
                WifiManager wifiManager = this.f6686a;
                if (wifiManager != null) {
                    try {
                        i = wifiManager.getWifiState();
                    } catch (Throwable th) {
                        CoreUtil.reportError(th, "OPENSDK_WMW", "cwsc");
                        i = 4;
                    }
                    if (this.b == null) {
                        this.b = new ArrayList<>();
                    }
                    if (i == 0 || i == 1 || i == 4) {
                        resetWifiData();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (w != lLastWifiChange) {
            try {
                list = a();
            } catch (Throwable th2) {
                CoreUtil.reportError(th2, "WifiManager", "updateScanResult");
                list = null;
            }
            w = lLastWifiChange;
            if (list != null) {
                this.b.clear();
                this.b.addAll(list);
            } else {
                this.b.clear();
            }
        }
        if (Utils.getTimeBoot() - lLastWifiChange > 20000) {
            this.b.clear();
        }
        u = Utils.getTimeBoot();
        if (this.b.isEmpty()) {
            lLastWifiChange = Utils.getTimeBoot();
            List<AmapWifi> a2 = a();
            if (a2 != null) {
                this.b.addAll(a2);
                a(z2);
            }
        }
        z2 = false;
        a(z2);
    }

    public boolean wifiAccess(ConnectivityManager connectivityManager) {
        try {
            if (Utils.getNetT(connectivityManager.getActiveNetworkInfo()) == 1) {
                return wifiUseful(getWifiAccess());
            }
            return false;
        } catch (Throwable th) {
            CoreUtil.reportError(th, "WifiManagerWrapper", "wifiAccess");
            return false;
        }
    }

    public void wifiResultChange() {
        if (this.f6686a != null && Utils.getTimeBoot() - lLastWifiChange > 4900) {
            lLastWifiChange = Utils.getTimeBoot();
        }
    }

    public void wifiResultUpdateChange() {
        lLastCarrierWifiChange = System.currentTimeMillis();
        ICollectionManager iCollectionManager = this.r;
        if (iCollectionManager != null) {
            iCollectionManager.updateWiFi();
        }
    }

    public void wifiStateChange() {
        if (this.f6686a == null) {
            return;
        }
        this.s = true;
    }

    public boolean wifiUseful(WifiInfoWrapper wifiInfoWrapper) {
        if (wifiInfoWrapper == null) {
            return false;
        }
        return wifiInfoWrapper.isUseFul();
    }

    public void setOption(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        this.g = z2;
        this.h = z3;
        this.i = z4;
        if (j < 10000) {
            this.f6687q = 10000L;
        } else {
            this.f6687q = j;
        }
    }

    void a(boolean z) {
        ArrayList<AmapWifi> arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (Utils.getTimeBoot() - lLastWifiChange > 3600000) {
            resetWifiData();
        }
        if (this.l == null) {
            this.l = new TreeMap<>(Collections.reverseOrder());
        }
        this.l.clear();
        if (this.mISStartCollect && z) {
            try {
                this.c.clear();
            } catch (Throwable unused) {
            }
        }
        int size = this.b.size();
        this.o = 0L;
        for (int i = 0; i < size; i++) {
            AmapWifi amapWifi = this.b.get(i);
            if (amapWifi.connected) {
                this.o = amapWifi.lastUpdateUtcMills;
            }
            if (Utils.wifiUseful(AmapWifi.longToMac(amapWifi.mac))) {
                int i2 = 20;
                if (size > 20) {
                    try {
                        i2 = WifiManager.calculateSignalLevel(amapWifi.rssi, 20);
                    } catch (ArithmeticException e) {
                        CoreUtil.reportError(e, "Aps", "wifiSigFine");
                    }
                    if (!(i2 >= 1)) {
                    }
                }
                if (this.mISStartCollect && z) {
                    this.c.add(amapWifi);
                }
                if (!TextUtils.isEmpty(amapWifi.ssid)) {
                    if (!"<unknown ssid>".equals(amapWifi.ssid)) {
                        amapWifi.ssid = String.valueOf(i);
                    }
                } else {
                    amapWifi.ssid = "unkwn";
                }
                this.l.put(Integer.valueOf((amapWifi.rssi * 25) + i), amapWifi);
            }
        }
        this.b.clear();
        Iterator<AmapWifi> it = this.l.values().iterator();
        while (it.hasNext()) {
            this.b.add(it.next());
        }
        this.l.clear();
    }
}
