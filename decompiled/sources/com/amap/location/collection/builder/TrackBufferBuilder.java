package com.amap.location.collection.builder;

import com.amap.location.collection.data.flatbuffers.RootTTrack;
import com.amap.location.collection.data.flatbuffers.TGps;
import com.amap.location.collection.data.flatbuffers.TGpsStatus;
import com.amap.location.support.bean.gnss.AmapSatellite;
import com.amap.location.support.bean.location.AmapLocationGnss;
import com.amap.location.support.log.ALLog;
import java.util.List;

/* loaded from: classes11.dex */
public class TrackBufferBuilder extends AbstractBuilder {
    private static final int BYTE_BUFFER_SIZE = 500;

    public TrackBufferBuilder() {
        super(500);
    }

    private int addGps(AmapLocationGnss amapLocationGnss) {
        return TGps.createTGps(this.mFlatBufferBuilder, amapLocationGnss.sytemUtcTime, amapLocationGnss.nmeaTime, (int) (amapLocationGnss.longitude * 1000000.0d), (int) (amapLocationGnss.latitude * 1000000.0d), (int) amapLocationGnss.altitude, (int) amapLocationGnss.accuracy, (int) amapLocationGnss.speed, (short) amapLocationGnss.bearing, amapLocationGnss.satelliteCount, amapLocationGnss.aveSnr);
    }

    private int addSatellite(List<AmapSatellite> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            AmapSatellite amapSatellite = list.get(i);
            iArr[i] = TGpsStatus.createTGpsStatus(this.mFlatBufferBuilder, (byte) amapSatellite.prn, (byte) Math.round(amapSatellite.cn0), (byte) Math.round(amapSatellite.elevation), (short) Math.round(amapSatellite.azimuth), amapSatellite.usedInFix ? (byte) 1 : (byte) 0);
        }
        return RootTTrack.createGpsStatusVector(this.mFlatBufferBuilder, iArr);
    }

    public byte[] createCollectData(AmapLocationGnss amapLocationGnss, List<AmapSatellite> list, byte b) {
        init();
        try {
            this.mFlatBufferBuilder.finish(RootTTrack.createRootTTrack(this.mFlatBufferBuilder, addGps(amapLocationGnss), addSatellite(list), b));
            return this.mFlatBufferBuilder.sizedByteArray();
        } catch (Throwable th) {
            ALLog.d(th);
            return null;
        }
    }
}
