package com.wakeup.module.device.work.utils;

import com.blankj.utilcode.util.ArrayUtils;
import com.wakeup.commponent.module.ble.WatchBleOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class WriteQueue {
    private static final String[] TRANS_FILE_ORDER_LIST = {WatchBleOrder.SEND_TRANS_FILE_HEAD, WatchBleOrder.SEND_TRANS_FILE_HEAD_RESP, WatchBleOrder.SEND_TRANS_FILE_DATA, WatchBleOrder.SEND_TRANS_FILE_DATA_RESP, WatchBleOrder.SEND_TRANS_STREAM_CTRL};
    private final ArrayDeque<WriteModel> queue = new ArrayDeque<>();

    public void add(String str, byte[] bArr, boolean z) {
        add(str, bArr, z, 0);
    }

    public synchronized void add(String str, byte[] bArr, boolean z, int i) {
        WriteModel writeModel = new WriteModel(str, bArr, z);
        if (i > 0) {
            writeModel.setSplitNum(i);
        }
        if (ArrayUtils.contains(TRANS_FILE_ORDER_LIST, str)) {
            writeModel.customServiceUUId = BleUUID.FILE_TRANS_SERVICE_UUID;
            writeModel.customWireUUId = BleUUID.FILE_TRANS_WRITE_UUID;
        }
        if (WatchBleOrder.ZK_OTA_FIX_1.equals(str)) {
            writeModel.customServiceUUId = BleUUID.ZK_OTA_FIX_SERVICE_UUID;
            writeModel.customWireUUId = BleUUID.ZK_OTA_FIX_WRITE_UUID_1;
        }
        if (WatchBleOrder.ZK_OTA_FIX_2.equals(str)) {
            writeModel.customServiceUUId = BleUUID.ZK_OTA_FIX_SERVICE_UUID;
            writeModel.customWireUUId = BleUUID.ZK_OTA_FIX_WRITE_UUID_2;
        }
        if (WatchBleOrder.ZK_FOTA_DATA.equals(str)) {
            writeModel.customServiceUUId = BleUUID.ZK_FOTA_SERVICE_UUID;
            writeModel.customWireUUId = BleUUID.ZK_FOTA_WRITE_UUID;
        }
        this.queue.add(writeModel);
    }

    public synchronized WriteModel get() {
        return this.queue.peek();
    }

    public synchronized WriteModel next() {
        if (!this.queue.isEmpty()) {
            try {
                this.queue.remove();
            } catch (Exception unused) {
            }
        }
        return get();
    }

    public synchronized boolean removeHeadIfSame(WriteModel writeModel) {
        if (this.queue.peek() != writeModel) {
            return false;
        }
        this.queue.remove();
        return true;
    }

    public synchronized List<WriteModel> drain() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.queue);
        this.queue.clear();
        return arrayList;
    }

    public synchronized int size() {
        return this.queue.size();
    }

    public static class WriteModel {
        public final byte[] datas;
        public final boolean isSplit;
        public final String order;
        private int splitNum = 0;
        public String customServiceUUId = "";
        public String customWireUUId = "";

        WriteModel(String str, byte[] bArr, boolean z) {
            this.order = str;
            this.datas = bArr;
            this.isSplit = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.datas, ((WriteModel) obj).datas);
        }

        public int hashCode() {
            return Arrays.hashCode(this.datas);
        }

        public void setSplitNum(int i) {
            this.splitNum = i;
        }

        public int getSplitNum() {
            return this.splitNum;
        }
    }
}
