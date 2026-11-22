package com.beken.iot.smartsdk.core.pack;

import com.beken.iot.smartsdk.core.data.BasicHead;
import com.beken.iot.smartsdk.core.data.EventHead;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class EventTransferConst extends TransmissionUnpacked {
    public static final int EVT_FLAGS_CONTINUE = 1;
    public static final int EVT_NOTIFY_FLAGS = -16777216;
    public static final int EVT_NOTIFY_HEARTBEAT = -16777215;
    public static final int EVT_PAK_SIZE = 9;
    private static final String TAG = "EventTransferConst";
    protected EventHead eventHead;
    protected byte[] payload;
    private byte[] primaryCache = null;
    private byte[] primaryData = null;

    public EventTransferConst(BasicHead basicHead, EventHead eventHead, byte[] bArr) {
        this.payload = null;
        this.basicHead = basicHead;
        this.eventHead = eventHead;
        this.payload = bArr;
    }

    public static byte[] unpackEvt(List<EventTransferConst> list, byte[] bArr, byte[] bArr2) {
        printDetail("unpack");
        ArrayList arrayList = new ArrayList();
        byte[] unpack = unpack(arrayList, bArr, bArr2);
        for (int i = 0; i < arrayList.size(); i++) {
            TransmissionUnpacked transmissionUnpacked = (TransmissionUnpacked) arrayList.get(i);
            byte[] payload = transmissionUnpacked.getPayload();
            if (payload.length < 9) {
                printDetail("Evt size no enough: " + payload.length);
            } else {
                BasicHead basicHead = transmissionUnpacked.getBasicHead();
                int bytes2int = bytes2int(payload, 0);
                int bytes2char = bytes2char(payload, 4);
                int bytes2short = bytes2short(payload, 5);
                int bytes2short2 = bytes2short(payload, 7);
                EventHead eventHead = new EventHead(bytes2int, bytes2char, bytes2short, bytes2short2);
                printDetail(String.format("opcode: %x, status: %d, length: %d", Integer.valueOf(bytes2int), Integer.valueOf(bytes2char), Integer.valueOf(bytes2short2)));
                EventTransferConst eventTransferConst = new EventTransferConst(basicHead, eventHead, bytes2short2 != 0 ? reorder(payload, 9, payload.length - 9) : null);
                eventTransferConst.setPrimaryData(bArr2);
                list.add(eventTransferConst);
            }
        }
        return unpack;
    }

    public int getOpcode() {
        return this.eventHead.opcode;
    }

    public int getLength() {
        return this.eventHead.length;
    }

    public int getStatus() {
        return this.eventHead.status;
    }

    @Override // com.beken.iot.smartsdk.core.pack.TransmissionUnpacked
    public byte[] getPayload() {
        return this.payload;
    }

    public boolean isComplete() {
        return (this.eventHead.eventFlags & 1) == 0;
    }

    public void setPrimaryData(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.primaryData = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.primaryData = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public void setPrimaryCache(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.primaryCache = new byte[0];
        } else {
            System.arraycopy(bArr, 0, this.primaryCache, 0, bArr.length);
        }
    }

    public void dump() {
        byte[] bArr = this.primaryData;
        if (bArr == null || bArr.length == 0) {
            printDetail("primaryData zero");
        } else {
            printDetail("primaryData:");
            TransmissionProfile.dump(TAG, this.primaryData, 20);
        }
        byte[] bArr2 = this.primaryCache;
        if (bArr2 == null || bArr2.length == 0) {
            printDetail("primaryCache zero");
        } else {
            printDetail("primaryCache:");
            TransmissionProfile.dump(TAG, this.primaryCache, 20);
        }
    }

    private static void printDetail(String str) {
        BKSmartLog.INSTANCE.detail(TAG, str);
    }
}
