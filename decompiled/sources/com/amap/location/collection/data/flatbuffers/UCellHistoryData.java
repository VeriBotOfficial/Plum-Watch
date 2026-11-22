package com.amap.location.collection.data.flatbuffers;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;

/* loaded from: classes11.dex */
public final class UCellHistoryData {
    public static final byte NONE = 0;
    public static final byte TMainCellCDMAHistory = 2;
    public static final byte TMainCellGSMHistory = 1;
    public static final String[] names = {DialPromoBanner.NONE, "TMainCellGSMHistory", "TMainCellCDMAHistory"};

    private UCellHistoryData() {
    }

    public static String name(int i) {
        return names[i];
    }
}
