package com.amap.location.collection.data.flatbuffers;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;

/* JADX INFO: loaded from: classes7.dex */
public final class UCellHistoryData {
    public static final byte NONE = 0;
    public static final byte TMainCellCDMAHistory = 2;
    public static final byte TMainCellGSMHistory = 1;
    public static final String[] names = {DialPromoBanner.NONE, "TMainCellGSMHistory", "TMainCellCDMAHistory"};

    private UCellHistoryData() {
    }

    public static String name(int r1) {
        return names[r1];
    }
}
