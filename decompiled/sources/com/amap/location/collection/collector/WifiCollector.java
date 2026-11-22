package com.amap.location.collection.collector;

import com.amap.location.support.bean.location.AmapLocationGnss;
import com.amap.location.support.bean.wifi.AmapWifi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class WifiCollector {
    private static final int MAX_SCAN_WIFI = 40;
    private static final String TAG = "wificl";
    private AmapLocationGnss mLastCollectedLocation;
    private List<AmapWifi> mLastScanResults = new ArrayList();
    private ArrayList<AmapWifi> mWifiList = new ArrayList<>();

    private boolean isDistanceEnough(AmapLocationGnss amapLocationGnss) {
        float f = amapLocationGnss.speed;
        float f2 = 10.0f;
        if (f > 10.0f) {
            f2 = 200.0f;
        } else if (f > 2.0f) {
            f2 = 50.0f;
        }
        return amapLocationGnss.distanceTo(this.mLastCollectedLocation) > ((double) f2);
    }

    private boolean isSameRate(List<AmapWifi> list, List<AmapWifi> list2, double d) {
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            int i = size + size2;
            if (size <= size2) {
                list2 = list;
                list = list2;
            }
            HashMap hashMap = new HashMap(list.size());
            Iterator<AmapWifi> it = list.iterator();
            while (it.hasNext()) {
                hashMap.put(Long.valueOf(it.next().mac), 1);
            }
            Iterator<AmapWifi> it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (((Integer) hashMap.get(Long.valueOf(it2.next().mac))) != null) {
                    i2++;
                }
            }
            if (i2 * 2.0d >= i * d) {
                return true;
            }
        }
        return false;
    }

    private boolean isWifiFresh(AmapLocationGnss amapLocationGnss, long j, long j2) {
        return j > 0 && j2 - j < ((long) ((amapLocationGnss.speed > 10.0f ? 1 : (amapLocationGnss.speed == 10.0f ? 0 : -1)) >= 0 ? 2000 : 3500));
    }

    private boolean needCollectWifi(AmapLocationGnss amapLocationGnss, List<AmapWifi> list, boolean z, long j, long j2) {
        if (!z || !isWifiFresh(amapLocationGnss, j, j2) || list == null || list.size() <= 0) {
            return false;
        }
        if (this.mLastCollectedLocation == null) {
            return true;
        }
        boolean isDistanceEnough = isDistanceEnough(amapLocationGnss);
        return !isDistanceEnough ? !isSameRate(list, this.mLastScanResults, 0.5d) : isDistanceEnough;
    }

    private List<AmapWifi> removeDuplicateLevelWifi(List<AmapWifi> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            AmapWifi amapWifi = list.get(i);
            hashMap.put(Integer.valueOf(amapWifi.rssi), amapWifi);
        }
        arrayList.addAll(hashMap.values());
        return arrayList;
    }

    private List<AmapWifi> wifiSortByLevel(List<AmapWifi> list) {
        Collections.sort(list, new Comparator<AmapWifi>() { // from class: com.amap.location.collection.collector.WifiCollector.1
            @Override // java.util.Comparator
            public int compare(AmapWifi amapWifi, AmapWifi amapWifi2) {
                return amapWifi2.rssi - amapWifi.rssi;
            }
        });
        return list;
    }

    List<AmapWifi> getWifiList(AmapLocationGnss amapLocationGnss, List<AmapWifi> list, boolean z, long j, long j2) {
        if (!needCollectWifi(amapLocationGnss, list, z, j, j2)) {
            return null;
        }
        transformWifi(this.mWifiList, list);
        this.mLastScanResults.clear();
        this.mLastScanResults.addAll(list);
        this.mLastCollectedLocation = amapLocationGnss;
        return this.mWifiList;
    }

    public void transformWifi(List<AmapWifi> list, List<AmapWifi> list2) {
        list.clear();
        if (list2 != null) {
            List<AmapWifi> wifiSortByLevel = wifiSortByLevel(removeDuplicateLevelWifi(list2));
            int size = wifiSortByLevel.size();
            if (size > 40) {
                size = 40;
            }
            for (int i = 0; i < size; i++) {
                list.add(wifiSortByLevel.get(i));
            }
        }
    }
}
