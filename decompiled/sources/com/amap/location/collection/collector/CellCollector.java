package com.amap.location.collection.collector;

import android.os.SystemClock;
import com.amap.location.collection.freshness.RssiManager;
import com.amap.location.support.bean.cell.AmapCell;
import com.amap.location.support.bean.cell.AmapCellCdma;
import com.amap.location.support.bean.cell.AmapCellGsm;
import com.amap.location.support.bean.cell.AmapCellLte;
import com.amap.location.support.bean.cell.AmapCellWcdma;
import com.amap.location.support.bean.location.AmapLocationGnss;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class CellCollector {
    private static final String TAG = "cellcl";
    private CellInfo mCellInfo = new CellInfo();
    private final List<AmapCell> mHistoryMainCells = new ArrayList(3);
    private AmapLocationGnss mLastCollectedLocation;
    private AmapCell mLastCollectedNewInterMainCell;
    private AmapCell mLastCollectedOldInterMainCell;

    public static class CellInfo {
        public List<AmapCell> cells = new ArrayList();
        public List<AmapCell> historyMainCellList = new ArrayList();
        public AmapCell mainCell;
        public AmapCell mainNewInterCell;
        public AmapCell mainOldInterCell;
        public String operator;
        public byte radio;

        public static boolean isSame(AmapCell amapCell, AmapCell amapCell2) {
            if (amapCell == null || amapCell2 == null) {
                return (amapCell == null) == (amapCell2 == null);
            }
            if ((amapCell instanceof AmapCellGsm) && (amapCell2 instanceof AmapCellGsm)) {
                AmapCellGsm amapCellGsm = (AmapCellGsm) amapCell;
                AmapCellGsm amapCellGsm2 = (AmapCellGsm) amapCell2;
                return amapCellGsm.lac == amapCellGsm2.lac && amapCellGsm.cid == amapCellGsm2.cid;
            }
            if ((amapCell instanceof AmapCellCdma) && (amapCell2 instanceof AmapCellCdma)) {
                AmapCellCdma amapCellCdma = (AmapCellCdma) amapCell;
                AmapCellCdma amapCellCdma2 = (AmapCellCdma) amapCell2;
                return amapCellCdma.bid == amapCellCdma2.bid && amapCellCdma.nid == amapCellCdma2.nid && amapCellCdma.sid == amapCellCdma2.sid;
            }
            if ((amapCell instanceof AmapCellLte) && (amapCell2 instanceof AmapCellLte)) {
                AmapCellLte amapCellLte = (AmapCellLte) amapCell;
                AmapCellLte amapCellLte2 = (AmapCellLte) amapCell2;
                return amapCellLte.tac == amapCellLte2.tac && amapCellLte.ci == amapCellLte2.ci;
            }
            if ((amapCell instanceof AmapCellWcdma) && (amapCell2 instanceof AmapCellWcdma)) {
                AmapCellWcdma amapCellWcdma = (AmapCellWcdma) amapCell;
                AmapCellWcdma amapCellWcdma2 = (AmapCellWcdma) amapCell2;
                if (amapCellWcdma.lac == amapCellWcdma2.lac && amapCellWcdma.cid == amapCellWcdma2.cid) {
                    return true;
                }
            }
            return false;
        }

        public void clear() {
            this.radio = (byte) 0;
            this.operator = "";
            this.mainCell = null;
            this.mainOldInterCell = null;
            this.mainNewInterCell = null;
            this.cells.clear();
            this.historyMainCellList.clear();
        }

        public String toString() {
            return "CellInfo{radio=" + ((int) this.radio) + ", operator='" + this.operator + "', mainCell=" + this.mainCell + ", mainOldInterCell=" + this.mainOldInterCell + ", mainNewInterCell=" + this.mainNewInterCell + ", cells=" + this.cells + ", historyMainCellList=" + this.historyMainCellList + AbstractJsonLexerKt.END_OBJ;
        }

        public void update(byte b, String str, List<AmapCell> list) {
            clear();
            this.radio = b;
            this.operator = str;
            if (list != null) {
                this.cells.addAll(list);
                for (AmapCell amapCell : this.cells) {
                    boolean z = amapCell.newApi;
                    if (!z && amapCell.main) {
                        this.mainOldInterCell = amapCell;
                    } else if (z && amapCell.main) {
                        this.mainNewInterCell = amapCell;
                    }
                }
            }
            AmapCell amapCell2 = this.mainOldInterCell;
            if (amapCell2 == null) {
                amapCell2 = this.mainNewInterCell;
            }
            this.mainCell = amapCell2;
        }
    }

    private boolean isDistanceEnough(AmapLocationGnss amapLocationGnss) {
        float f = amapLocationGnss.speed;
        return amapLocationGnss.distanceTo(this.mLastCollectedLocation) > ((double) ((f > 10.0f ? 1 : (f == 10.0f ? 0 : -1)) > 0 ? 2000.0f : (f > 2.0f ? 1 : (f == 2.0f ? 0 : -1)) > 0 ? 500.0f : 100.0f));
    }

    private void updateHistoryMainCells(CellInfo cellInfo) {
        synchronized (this.mHistoryMainCells) {
            for (AmapCell amapCell : cellInfo.cells) {
                if (amapCell != null && amapCell.main) {
                    AmapCell mo6910clone = amapCell.mo6910clone();
                    mo6910clone.lastUpdateSystemMills = SystemClock.elapsedRealtime();
                    addHistoryMainCells(mo6910clone);
                }
            }
            this.mCellInfo.historyMainCellList.clear();
            this.mCellInfo.historyMainCellList.addAll(this.mHistoryMainCells);
        }
    }

    void addHistoryMainCells(AmapCell amapCell) {
        if (amapCell == null) {
            return;
        }
        int size = this.mHistoryMainCells.size();
        if (size == 0) {
            this.mHistoryMainCells.add(amapCell);
            return;
        }
        int i = -1;
        long j = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            AmapCell amapCell2 = this.mHistoryMainCells.get(i2);
            if (amapCell.equals(amapCell2)) {
                int i4 = amapCell.signalStrength;
                if (i4 != amapCell2.signalStrength) {
                    amapCell2.lastUpdateSystemMills = i4;
                    amapCell2.signalStrength = i4;
                }
            } else {
                j = Math.min(j, amapCell2.lastUpdateSystemMills);
                if (j == amapCell2.lastUpdateSystemMills) {
                    i3 = i2;
                }
                i2++;
            }
        }
        if (i >= 0) {
            if (size < 3) {
                this.mHistoryMainCells.add(amapCell);
            } else {
                if (amapCell.lastUpdateSystemMills <= j || i >= size) {
                    return;
                }
                this.mHistoryMainCells.remove(i);
                this.mHistoryMainCells.add(amapCell);
            }
        }
    }

    CellInfo getCell(AmapLocationGnss amapLocationGnss, boolean z, byte b, String str, List<AmapCell> list) {
        if (z) {
            this.mCellInfo.clear();
            return null;
        }
        this.mCellInfo.update(b, str, list);
        if (this.mCellInfo.mainCell == null) {
            return null;
        }
        if (this.mLastCollectedLocation != null && !isDistanceEnough(amapLocationGnss) && CellInfo.isSame(this.mCellInfo.mainOldInterCell, this.mLastCollectedOldInterMainCell) && CellInfo.isSame(this.mCellInfo.mainNewInterCell, this.mLastCollectedNewInterMainCell)) {
            return null;
        }
        CellInfo cellInfo = this.mCellInfo;
        this.mLastCollectedOldInterMainCell = cellInfo.mainOldInterCell;
        this.mLastCollectedNewInterMainCell = cellInfo.mainNewInterCell;
        this.mLastCollectedLocation = amapLocationGnss;
        RssiManager.updateCellList(cellInfo.cells);
        updateHistoryMainCells(this.mCellInfo);
        return this.mCellInfo;
    }
}
