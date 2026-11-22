package com.amap.location.collection.freshness;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.List;

/* loaded from: classes11.dex */
public class RssiInfoManager {
    private static final short MAX_VALID_FRESHNESS = Short.MAX_VALUE;
    private static final short MIN_VALID_FRESHNESS = 1;
    private static final short UNKNOWN_FRESHNESS = 0;
    private static volatile RssiInfoManager sInstance;
    private static Object sLock = new Object();
    private Object mCellLocked = new Object();
    private Object mWifiLocked = new Object();
    private LongSparseArray<RssiInfo> mCellRssiMap = new LongSparseArray<>();
    private LongSparseArray<RssiInfo> mCellRssiSwapMap = new LongSparseArray<>();
    private LongSparseArray<RssiInfo> mWifiRssiMap = new LongSparseArray<>();
    private LongSparseArray<RssiInfo> mWifiRssiSwapMap = new LongSparseArray<>();

    private static class RssiInfo {
        boolean isConfident;
        int rssi;
        long timeSinceBoot;

        private RssiInfo() {
        }
    }

    private RssiInfoManager() {
    }

    private short computeFreshness(LongSparseArray<RssiInfo> longSparseArray, long j) {
        synchronized (longSparseArray) {
            RssiInfo rssiInfo = longSparseArray.get(j);
            if (rssiInfo == null) {
                return (short) 0;
            }
            short max = (short) Math.max(1L, Math.min(32767L, (now() - rssiInfo.timeSinceBoot) / 1000));
            if (!rssiInfo.isConfident) {
                max = (short) (-max);
            }
            return max;
        }
    }

    private void computeNewRssiMapLocked(List<IRssiInfo> list, LongSparseArray<RssiInfo> longSparseArray, LongSparseArray<RssiInfo> longSparseArray2) {
        long now = now();
        if (longSparseArray.size() == 0) {
            for (IRssiInfo iRssiInfo : list) {
                RssiInfo rssiInfo = new RssiInfo();
                rssiInfo.rssi = iRssiInfo.getRssi();
                rssiInfo.timeSinceBoot = now;
                rssiInfo.isConfident = false;
                longSparseArray2.put(iRssiInfo.getId(), rssiInfo);
            }
            return;
        }
        for (IRssiInfo iRssiInfo2 : list) {
            long id2 = iRssiInfo2.getId();
            RssiInfo rssiInfo2 = longSparseArray.get(id2);
            if (rssiInfo2 == null) {
                rssiInfo2 = new RssiInfo();
                rssiInfo2.rssi = iRssiInfo2.getRssi();
                rssiInfo2.timeSinceBoot = now;
                rssiInfo2.isConfident = true;
            } else if (rssiInfo2.rssi != iRssiInfo2.getRssi()) {
                rssiInfo2.rssi = iRssiInfo2.getRssi();
                rssiInfo2.timeSinceBoot = now;
                rssiInfo2.isConfident = true;
            }
            longSparseArray2.put(id2, rssiInfo2);
        }
    }

    public static RssiInfoManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new RssiInfoManager();
                }
            }
        }
        return sInstance;
    }

    private static long now() {
        return SystemClock.elapsedRealtime();
    }

    void clear() {
        synchronized (this.mCellLocked) {
            this.mCellRssiMap.clear();
        }
        synchronized (this.mWifiLocked) {
            this.mWifiRssiMap.clear();
        }
    }

    short computeCellFreshness(long j) {
        return computeFreshness(this.mCellRssiMap, j);
    }

    short computeWifiFreshness(long j) {
        return computeFreshness(this.mWifiRssiMap, j);
    }

    void updateCellList(List<IRssiInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (this.mCellLocked) {
            computeNewRssiMapLocked(list, this.mCellRssiMap, this.mCellRssiSwapMap);
            LongSparseArray<RssiInfo> longSparseArray = this.mCellRssiMap;
            this.mCellRssiMap = this.mCellRssiSwapMap;
            this.mCellRssiSwapMap = longSparseArray;
            longSparseArray.clear();
        }
    }

    void updateWifiList(List<IRssiInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (this.mWifiLocked) {
            computeNewRssiMapLocked(list, this.mWifiRssiMap, this.mWifiRssiSwapMap);
            LongSparseArray<RssiInfo> longSparseArray = this.mWifiRssiMap;
            this.mWifiRssiMap = this.mWifiRssiSwapMap;
            this.mWifiRssiSwapMap = longSparseArray;
            longSparseArray.clear();
        }
    }
}
