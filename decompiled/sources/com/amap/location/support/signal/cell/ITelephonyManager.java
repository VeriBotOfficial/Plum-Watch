package com.amap.location.support.signal.cell;

import com.amap.location.support.bean.cell.AmapCell;
import java.util.List;

/* loaded from: classes11.dex */
public interface ITelephonyManager {
    void addCellStatusListener(CellStatusListener cellStatusListener, Object obj);

    List<AmapCell> getCellList();

    int getNetworkCoarseType();

    int getNetworkFineType();

    String getNetworkOperator();

    int getNetworkType();

    boolean isBadNetwork();

    void removeCellStatusListener(CellStatusListener cellStatusListener);

    void requestCellUpdate();
}
