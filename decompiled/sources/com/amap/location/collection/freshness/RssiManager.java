package com.amap.location.collection.freshness;

import com.amap.location.support.bean.cell.AmapCell;
import com.amap.location.support.bean.cell.AmapCellCdma;
import com.amap.location.support.bean.cell.AmapCellGsm;
import com.amap.location.support.bean.cell.AmapCellLte;
import com.amap.location.support.bean.cell.AmapCellWcdma;
import com.amap.location.support.bean.wifi.AmapWifi;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes11.dex */
public class RssiManager {

    public static class CellRssiInfo implements IRssiInfo {
        private int mCid;
        private int mLac;
        private int mRssi;

        CellRssiInfo(int i, int i2, int i3) {
            this.mLac = i;
            this.mCid = i2;
            this.mRssi = i3;
        }

        @Override // com.amap.location.collection.freshness.IRssiInfo
        public long getId() {
            return RssiManager.getCellKey(this.mLac, this.mCid);
        }

        @Override // com.amap.location.collection.freshness.IRssiInfo
        public int getRssi() {
            return this.mRssi;
        }
    }

    public static class WiFiRssiInfo implements IRssiInfo {
        private long mMac;
        private int mRssi;

        WiFiRssiInfo(long j, int i) {
            this.mMac = j;
            this.mRssi = i;
        }

        @Override // com.amap.location.collection.freshness.IRssiInfo
        public long getId() {
            return this.mMac;
        }

        @Override // com.amap.location.collection.freshness.IRssiInfo
        public int getRssi() {
            return this.mRssi;
        }
    }

    public static synchronized void clearData() {
        synchronized (RssiManager.class) {
            RssiInfoManager.getInstance().clear();
        }
    }

    public static synchronized short computeCellFreshness(long j) {
        short computeCellFreshness;
        synchronized (RssiManager.class) {
            computeCellFreshness = RssiInfoManager.getInstance().computeCellFreshness(j);
        }
        return computeCellFreshness;
    }

    public static synchronized short computeWifiFreshness(long j) {
        short computeWifiFreshness;
        synchronized (RssiManager.class) {
            computeWifiFreshness = RssiInfoManager.getInstance().computeWifiFreshness(j);
        }
        return computeWifiFreshness;
    }

    public static long getCellKey(int i, int i2) {
        return (i2 & BodyPartID.bodyIdMax) | ((i & BodyPartID.bodyIdMax) << 32);
    }

    public static synchronized void updateCellList(List<AmapCell> list) {
        synchronized (RssiManager.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (AmapCell amapCell : list) {
                        if (amapCell instanceof AmapCellGsm) {
                            AmapCellGsm amapCellGsm = (AmapCellGsm) amapCell;
                            arrayList.add(new CellRssiInfo(amapCellGsm.lac, amapCellGsm.cid, amapCellGsm.signalStrength));
                        } else if (amapCell instanceof AmapCellLte) {
                            AmapCellLte amapCellLte = (AmapCellLte) amapCell;
                            arrayList.add(new CellRssiInfo(amapCellLte.tac, amapCellLte.ci, amapCellLte.signalStrength));
                        } else if (amapCell instanceof AmapCellWcdma) {
                            AmapCellWcdma amapCellWcdma = (AmapCellWcdma) amapCell;
                            arrayList.add(new CellRssiInfo(amapCellWcdma.lac, amapCellWcdma.cid, amapCellWcdma.signalStrength));
                        } else if (amapCell instanceof AmapCellCdma) {
                            AmapCellCdma amapCellCdma = (AmapCellCdma) amapCell;
                            arrayList.add(new CellRssiInfo(amapCellCdma.nid, amapCellCdma.bid, amapCellCdma.signalStrength));
                        }
                    }
                    RssiInfoManager.getInstance().updateCellList(arrayList);
                }
            }
        }
    }

    public static synchronized void updateWifiList(List<AmapWifi> list) {
        synchronized (RssiManager.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (AmapWifi amapWifi : list) {
                        arrayList.add(new WiFiRssiInfo(amapWifi.mac, amapWifi.rssi));
                    }
                    RssiInfoManager.getInstance().updateWifiList(arrayList);
                }
            }
        }
    }
}
