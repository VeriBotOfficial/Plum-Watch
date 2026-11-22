package com.wakeup.common.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.g.a.b;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: WifiUtils.kt */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0017\u001a\u00020\u00182\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0007J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011J\b\u0010!\u001a\u00020\"H\u0002J*\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180&J,\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180&H\u0002J,\u0010(\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180&H\u0002J\u0006\u0010)\u001a\u00020\u0018J\u0006\u0010,\u001a\u00020\u0018J\u0006\u0010-\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010*\u001a\b\u0018\u00010+R\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/wakeup/common/utils/WifiUtils;", "", "<init>", "()V", "TAG", "", "handler", "Landroid/os/Handler;", "callback", "Lcom/wakeup/common/base/BaseCallback;", "", "Lcom/wakeup/common/utils/WifiInfo;", "lastRefreshTime", "", b.O, "", "STATUS_IDLE", "", "STATUS_CONNECTED", "status", "wifiScanReceiver", "com/wakeup/common/utils/WifiUtils$wifiScanReceiver$1", "Lcom/wakeup/common/utils/WifiUtils$wifiScanReceiver$1;", "startScan", "", "stopScan", "registerReceiver", "unregisterReceiver", "processScanResults", "isWifiEnabled", "", "is4G", "frequency", "getWifiMgr", "Landroid/net/wifi/WifiManager;", "connectWifi", "ssid", "password", "Lkotlin/Function1;", "newConnectWifi", "oldConnectWifi", "cancelBindProcessToNetwork", "lock", "Landroid/net/wifi/WifiManager$MulticastLock;", "startWifiLock", "stopWifiLock", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WifiUtils {
    private static final int STATUS_CONNECTED = 1;
    private static final int STATUS_IDLE = 0;
    private static final String TAG = "WifiUtils";
    private static BaseCallback<List<WifiInfo>> callback;
    private static long lastRefreshTime;
    private static WifiManager.MulticastLock lock;
    private static int status;
    public static final WifiUtils INSTANCE = new WifiUtils();
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static List<WifiInfo> cache = new ArrayList();
    private static final WifiUtils$wifiScanReceiver$1 wifiScanReceiver = new BroadcastReceiver() { // from class: com.wakeup.common.utils.WifiUtils$wifiScanReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual(intent.getAction(), "android.net.wifi.SCAN_RESULTS")) {
                WifiUtils.INSTANCE.processScanResults();
            }
        }
    };

    public final boolean is4G(int frequency) {
        return 2400 <= frequency && frequency < 2500;
    }

    private WifiUtils() {
    }

    @JvmStatic
    public static final void startScan(BaseCallback<List<WifiInfo>> callback2) {
        Intrinsics.checkNotNullParameter(callback2, "callback");
        WifiUtils wifiUtils = INSTANCE;
        callback = callback2;
        WifiManager wifiMgr = wifiUtils.getWifiMgr();
        if (!wifiMgr.isWifiEnabled()) {
            LogUtils.w(TAG, "startScan isWifiEnabled == false");
            BaseCallback<List<WifiInfo>> baseCallback = callback;
            if (baseCallback != null) {
                baseCallback.callback(-1, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        if (!wifiMgr.isScanAlwaysAvailable()) {
            LogUtils.w(TAG, "startScan isScanAlwaysAvailable == false");
            BaseCallback<List<WifiInfo>> baseCallback2 = callback;
            if (baseCallback2 != null) {
                baseCallback2.callback(-1, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        if (System.currentTimeMillis() - lastRefreshTime < 10000 && CollectionUtils.isNotEmpty(cache)) {
            LogUtils.i(TAG, "startScan return cache");
            callback2.callback(1, cache);
            return;
        }
        wifiUtils.registerReceiver();
        boolean startScan = wifiMgr.startScan();
        wifiMgr.isScanAlwaysAvailable();
        if (!startScan) {
            LogUtils.w(TAG, "startScan fail");
            wifiUtils.unregisterReceiver();
            BaseCallback<List<WifiInfo>> baseCallback3 = callback;
            if (baseCallback3 != null) {
                baseCallback3.callback(-1, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        LogUtils.i(TAG, "startScan success");
    }

    public final void stopScan() {
        callback = null;
        unregisterReceiver();
    }

    private final void registerReceiver() {
        BaseApplication.getContext().registerReceiver(wifiScanReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    }

    private final void unregisterReceiver() {
        try {
            BaseApplication.getContext().unregisterReceiver(wifiScanReceiver);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processScanResults() {
        lastRefreshTime = System.currentTimeMillis();
        unregisterReceiver();
        try {
            List<ScanResult> scanResults = getWifiMgr().getScanResults();
            if (CollectionUtils.isEmpty(scanResults)) {
                LogUtils.w(TAG, "processScanResults scanResults is empty");
                BaseCallback<List<WifiInfo>> baseCallback = callback;
                if (baseCallback != null) {
                    baseCallback.callback(1, CollectionsKt.emptyList());
                    return;
                }
                return;
            }
            Intrinsics.checkNotNull(scanResults);
            ArrayList emptyList = CollectionsKt.emptyList();
            for (Object obj : scanResults) {
                if (!TextUtils.isEmpty(((ScanResult) obj).SSID)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList();
                    }
                    Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                    TypeIntrinsics.asMutableList(emptyList).add(obj);
                }
            }
            ArrayList emptyList2 = CollectionsKt.emptyList();
            for (Object obj2 : emptyList) {
                if (INSTANCE.is4G(((ScanResult) obj2).frequency)) {
                    if (emptyList2.isEmpty()) {
                        emptyList2 = new ArrayList();
                    }
                    Intrinsics.checkNotNull(emptyList2, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                    TypeIntrinsics.asMutableList(emptyList2).add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : emptyList2) {
                String str = ((ScanResult) obj3).SSID;
                Object obj4 = linkedHashMap.get(str);
                if (obj4 == null) {
                    obj4 = (List) new ArrayList();
                    linkedHashMap.put(str, obj4);
                }
                ((List) obj4).add(obj3);
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List list = (List) entry.getValue();
                Intrinsics.checkNotNull(str2);
                arrayList.add(new WifiInfo(str2, CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.wakeup.common.utils.WifiUtils$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        CharSequence processScanResults$lambda$4$lambda$3;
                        processScanResults$lambda$4$lambda$3 = WifiUtils.processScanResults$lambda$4$lambda$3((ScanResult) obj5);
                        return processScanResults$lambda$4$lambda$3;
                    }
                }, 31, null)));
            }
            ArrayList arrayList2 = arrayList;
            BaseCallback<List<WifiInfo>> baseCallback2 = callback;
            if (baseCallback2 != null) {
                baseCallback2.callback(1, arrayList2);
            }
            cache.clear();
            cache.addAll(arrayList2);
            LogUtils.i(TAG, "processScanResults success");
        } catch (Exception e) {
            LogUtils.e(TAG, "processScanResults error: ", e);
            BaseCallback<List<WifiInfo>> baseCallback3 = callback;
            if (baseCallback3 != null) {
                baseCallback3.callback(-1, CollectionsKt.emptyList());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence processScanResults$lambda$4$lambda$3(ScanResult scanResult) {
        String capabilities = scanResult.capabilities;
        Intrinsics.checkNotNullExpressionValue(capabilities, "capabilities");
        return capabilities;
    }

    public final boolean isWifiEnabled() {
        return getWifiMgr().isWifiEnabled();
    }

    private final WifiManager getWifiMgr() {
        Object systemService = BaseApplication.getContext().getSystemService("wifi");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    public final void connectWifi(String ssid, String password, Function1<? super Boolean, Unit> callback2) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(callback2, "callback");
        status = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            LogUtils.i(TAG, "newConnectWifi ssid: " + ssid + ", password: " + password);
            newConnectWifi(ssid, password, callback2);
        } else {
            LogUtils.i(TAG, "oldConnectWifi ssid: " + ssid + ", password: " + password);
            oldConnectWifi(ssid, password, callback2);
        }
    }

    private final void newConnectWifi(String ssid, String password, Function1<? super Boolean, Unit> callback2) {
        WifiNetworkSpecifier build = new WifiNetworkSpecifier.Builder().setSsid(ssid).setWpa2Passphrase(password).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        NetworkRequest build2 = new NetworkRequest.Builder().addTransportType(1).setNetworkSpecifier(build).build();
        Object systemService = BaseApplication.getContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        connectivityManager.requestNetwork(build2, new WifiUtils$newConnectWifi$1(connectivityManager, callback2));
    }

    private final void oldConnectWifi(String ssid, String password, Function1<? super Boolean, Unit> callback2) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = "\"" + ssid + "\"";
        wifiConfiguration.preSharedKey = "\"" + password + "\"";
        wifiConfiguration.allowedKeyManagement.set(1);
        wifiConfiguration.allowedAuthAlgorithms.set(0);
        WifiManager wifiMgr = getWifiMgr();
        int addNetwork = wifiMgr.addNetwork(wifiConfiguration);
        if (addNetwork == -1) {
            LogUtils.i(TAG, "connectWifi wifi配置添加失败");
            handler.removeCallbacksAndMessages(null);
            callback2.invoke(false);
        } else {
            boolean enableNetwork = wifiMgr.enableNetwork(addNetwork, true);
            wifiMgr.reconnect();
            LogUtils.i(TAG, "connectWifi wifi连接结果: " + enableNetwork);
            handler.removeCallbacksAndMessages(null);
            callback2.invoke(Boolean.valueOf(enableNetwork));
        }
    }

    public final void cancelBindProcessToNetwork() {
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = BaseApplication.getContext().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).bindProcessToNetwork(null);
        }
    }

    public final void startWifiLock() {
        LogUtils.i(TAG, "startWifiLock");
        try {
            WifiManager.MulticastLock createMulticastLock = getWifiMgr().createMulticastLock("test wifi");
            lock = createMulticastLock;
            if (createMulticastLock != null) {
                createMulticastLock.acquire();
            }
        } catch (Exception unused) {
        }
    }

    public final void stopWifiLock() {
        LogUtils.i(TAG, "stopWifiLock");
        try {
            WifiManager.MulticastLock multicastLock = lock;
            if (multicastLock != null) {
                multicastLock.release();
            }
        } catch (Exception unused) {
        }
        lock = null;
    }
}
