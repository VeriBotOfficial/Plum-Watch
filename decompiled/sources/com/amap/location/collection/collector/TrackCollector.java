package com.amap.location.collection.collector;

import android.os.SystemClock;
import com.amap.location.collection.CollectionConfig;
import com.amap.location.collection.builder.TrackBufferBuilder;
import com.amap.location.support.bean.gnss.AmapSatellite;
import com.amap.location.support.bean.location.AmapLocationGnss;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ShortCompanionObject;

/* loaded from: classes11.dex */
public class TrackCollector {
    public static final int COLLECT_MIN_DISTANCE = 5;
    public static final long COLLECT_MIN_TIME = 2000;
    private static final int GPS_STATUS_FRESHNESS = 3000;
    private static final String TAG = "trackcl";
    private CollectionConfig.TrackCollectorConfig mConfig;
    private long mGpsStatusChangedTime;
    private AmapLocationGnss mLastCollectedLocation;
    private long mLastCollectedTime;
    private List<AmapSatellite> mSatelliteList = new ArrayList();
    private short mAveSnr = ShortCompanionObject.MAX_VALUE;
    private byte mSateNum = 0;
    private AmapLocationGnss mGps = new AmapLocationGnss();
    private TrackBufferBuilder mTrackBufferBuilder = new TrackBufferBuilder();

    public TrackCollector(CollectionConfig.TrackCollectorConfig trackCollectorConfig) {
        this.mConfig = trackCollectorConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if ((r0 - r2) <= 3000) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amap.location.collection.common.CollectionData build(com.amap.location.support.bean.location.AmapLocationGnss r10) {
        /*
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.amap.location.support.bean.location.AmapLocationGnss r2 = r9.mLastCollectedLocation
            if (r2 == 0) goto L1c
            long r3 = r9.mLastCollectedTime
            long r3 = r0 - r3
            r5 = 2000(0x7d0, double:9.88E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L66
            double r2 = r10.distanceTo(r2)
            r4 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L66
        L1c:
            r9.mLastCollectedTime = r0
            r9.mLastCollectedLocation = r10
            com.amap.location.collection.CollectionConfig$TrackCollectorConfig r2 = r9.mConfig
            boolean r2 = r2.isCollectSatellites()
            if (r2 == 0) goto L38
            long r2 = r9.mGpsStatusChangedTime
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L38
            long r0 = r0 - r2
            r2 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L38
            goto L3d
        L38:
            java.util.List<com.amap.location.support.bean.gnss.AmapSatellite> r0 = r9.mSatelliteList
            r0.clear()
        L3d:
            com.amap.location.support.bean.location.AmapLocationGnss r1 = r9.mGps
            short r2 = r9.mAveSnr
            byte r3 = r9.mSateNum
            long r5 = r10.nmeaTime
            long r7 = java.lang.System.currentTimeMillis()
            r4 = r10
            com.amap.location.collection.utils.GpsUtil.transformGps(r1, r2, r3, r4, r5, r7)
            com.amap.location.collection.builder.TrackBufferBuilder r10 = r9.mTrackBufferBuilder
            com.amap.location.support.bean.location.AmapLocationGnss r0 = r9.mGps
            java.util.List<com.amap.location.support.bean.gnss.AmapSatellite> r1 = r9.mSatelliteList
            com.amap.location.collection.CollectionConfig$TrackCollectorConfig r2 = r9.mConfig
            byte r2 = r2.getLocScene()
            byte[] r10 = r10.createCollectData(r0, r1, r2)
            if (r10 == 0) goto L66
            com.amap.location.collection.common.CollectionData r0 = new com.amap.location.collection.common.CollectionData
            r1 = 1
            r0.<init>(r1, r10)
            return r0
        L66:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.location.collection.collector.TrackCollector.build(com.amap.location.support.bean.location.AmapLocationGnss):com.amap.location.collection.common.CollectionData");
    }

    public void onGpsStatusListener(int i, int i2, float f, List<AmapSatellite> list) {
        this.mGpsStatusChangedTime = SystemClock.elapsedRealtime();
        this.mSatelliteList.clear();
        for (AmapSatellite amapSatellite : list) {
            int i3 = amapSatellite.prn;
            if (i3 > 1 && i3 <= 32) {
                this.mSatelliteList.add(amapSatellite);
            }
        }
        this.mAveSnr = (short) Math.round(f * 100.0f);
        this.mSateNum = i <= 127 ? (byte) i : Byte.MAX_VALUE;
    }
}
