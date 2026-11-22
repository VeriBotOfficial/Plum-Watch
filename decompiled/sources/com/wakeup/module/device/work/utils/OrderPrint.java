package com.wakeup.module.device.work.utils;

import com.wakeup.common.log.LogUtils;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.WatchBleOrder;
import com.wakeup.module.device.lib.exception.BleException;
import com.wakeup.module.device.work.debug.BleDebugMonitor;
import com.wakeup.module.device.work.utils.WriteQueue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class OrderPrint {
    private static final List<String> FILTER_LIST;
    private static final String TAG = "Ble_Order";

    static {
        ArrayList arrayList = new ArrayList();
        FILTER_LIST = arrayList;
        arrayList.add(WatchBleOrder.SEND_DIAL_SERIAL_NUM);
        arrayList.add(WatchBleOrder.SEND_DIAL_REQ);
        arrayList.add(WatchBleOrder.SEND_NUCLEIC_ACID_CODE_DATA);
        arrayList.add(WatchBleOrder.ZK_FOTA_DATA);
    }

    private OrderPrint() {
    }

    public static void printSendOrder(WriteQueue.WriteModel writeModel) {
        if (FILTER_LIST.contains(writeModel.order)) {
            return;
        }
        BleDebugMonitor.onSend(writeModel.order, writeModel.datas);
        LogUtils.i(TAG, "write " + writeModel.order + " >>>>>> " + BleUtil.bytesToHexStr(writeModel.datas));
    }

    public static void printSendResultSuccess(WriteQueue.WriteModel writeModel, int i, int i2) {
        if (FILTER_LIST.contains(writeModel.order)) {
            return;
        }
        BleDebugMonitor.onSendResult(writeModel.order, true, i, i2, null);
        if (writeModel.isSplit && i2 > 1) {
            LogUtils.i(TAG, "write " + writeModel.order + " success  current = " + i + "    total = " + i2);
        } else {
            LogUtils.i(TAG, "write " + writeModel.order + " success");
        }
    }

    public static void printSendResultFail(WriteQueue.WriteModel writeModel, BleException bleException) {
        BleDebugMonitor.onSendResult(writeModel.order, false, 0, 0, bleException.getCode() + " " + bleException.getDescription());
        LogUtils.i(TAG, "write " + writeModel.order + " fail = " + bleException.getCode() + "   exception = " + bleException.getDescription());
    }

    public static void printReceive(byte[] bArr) {
        BleDebugMonitor.onReceive(bArr);
        LogUtils.i(TAG, "receive <<<<<< " + BleUtil.bytesToHexStr(bArr));
    }
}
