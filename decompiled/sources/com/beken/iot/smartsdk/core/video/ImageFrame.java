package com.beken.iot.smartsdk.core.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class ImageFrame implements Parcelable {
    public static final Parcelable.Creator<ImageFrame> CREATOR = new Parcelable.Creator<ImageFrame>() { // from class: com.beken.iot.smartsdk.core.video.ImageFrame.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageFrame createFromParcel(Parcel parcel) {
            return new ImageFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageFrame[] newArray(int i) {
            return new ImageFrame[i];
        }
    };
    public static final int STATE_BROKEN = 1;
    public static final int STATE_COMPLETE = 0;
    public static final int STATE_CONTINUE = 2;
    public static final int STATE_NULL = 3;
    private static final String TAG = "ImageFrame";
    private int format;
    private byte[] frameData;
    private final ArrayList<CameraFramePacket> packetList;
    private int packetSize;
    private String result;
    private long rxCompleteTime;
    private long rxDelay;
    private int sequence;
    private int txCompleteTime;
    private int txDelay;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ImageFrame() {
        this.packetList = new ArrayList<>(800);
        this.frameData = null;
        this.sequence = -1;
        this.txCompleteTime = 0;
        this.rxCompleteTime = 0L;
        this.txDelay = 0;
        this.rxDelay = 0L;
        this.format = 0;
        this.packetSize = 0;
    }

    public ArrayList<CameraFramePacket> getPacketList() {
        return this.packetList;
    }

    public byte[] getFrameData() {
        return this.frameData;
    }

    public void setFrameData(byte[] bArr) {
        this.frameData = bArr;
    }

    public int getSequence() {
        return this.sequence;
    }

    public int getTxCompleteTime() {
        return this.txCompleteTime;
    }

    public long getRxCompleteTime() {
        return this.rxCompleteTime;
    }

    public long getRxDelay() {
        return this.rxDelay;
    }

    public int getTxDelay() {
        return this.txDelay;
    }

    public void setRxDelay(long j) {
        this.rxDelay = j;
    }

    public void setTxDelay(int i) {
        this.txDelay = i;
    }

    public void calcRxDelay(long j) {
        this.rxDelay = Math.abs(this.rxCompleteTime - j);
    }

    public void calcTxDelay(int i) {
        this.txDelay = Math.abs(this.txCompleteTime - i);
    }

    public int getFormat() {
        return this.format;
    }

    public void setFormat(int i) {
        this.format = i;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    private void sort() {
        this.packetList.sort(new Comparator<CameraFramePacket>() { // from class: com.beken.iot.smartsdk.core.video.ImageFrame.1
            @Override // java.util.Comparator
            public int compare(CameraFramePacket cameraFramePacket, CameraFramePacket cameraFramePacket2) {
                return CameraFramePacket.naturalOrder(cameraFramePacket, cameraFramePacket2);
            }
        });
    }

    public int getAllPacketSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.packetList.size(); i2++) {
            i += this.packetList.get(i2).getLength() + 20;
        }
        return i;
    }

    public String toString() {
        return this.result;
    }

    public int decode(CameraFramePacket cameraFramePacket) {
        if (!append(cameraFramePacket)) {
            return 1;
        }
        if (!cameraFramePacket.isEof()) {
            return 2;
        }
        this.txCompleteTime = cameraFramePacket.getTimeStamp();
        this.rxCompleteTime = System.currentTimeMillis();
        if (this.packetList.size() == 0) {
            return 3;
        }
        if (this.packetList.size() != cameraFramePacket.getCount()) {
            printDetail("list size: " + this.packetList.size());
            Iterator<CameraFramePacket> it = this.packetList.iterator();
            while (it.hasNext()) {
                it.next();
                printDetail("ID: " + cameraFramePacket.getId() + " Count: " + cameraFramePacket.getCount());
            }
            this.result = "No." + cameraFramePacket.getId() + " got: " + this.packetList.size() + "/" + cameraFramePacket.getCount();
            return 1;
        }
        byte[] bArr = new byte[CameraFramePacket.getListDataSize(this.packetList)];
        sort();
        Iterator<CameraFramePacket> it2 = this.packetList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            CameraFramePacket next = it2.next();
            printDetail("sequence: " + next.getCount());
            System.arraycopy(next.getPayload(), 0, bArr, i, next.getLength());
            i += next.getLength();
        }
        this.frameData = bArr;
        return 0;
    }

    private boolean append(CameraFramePacket cameraFramePacket) {
        int i = this.sequence;
        if (i == -1) {
            this.sequence = cameraFramePacket.getId();
        } else if (i != cameraFramePacket.getId()) {
            printDetail("sequence not match " + this.sequence + " " + cameraFramePacket.getId());
            return false;
        }
        this.packetList.add(cameraFramePacket);
        this.packetSize = this.packetList.size();
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sequence);
        parcel.writeByteArray(this.frameData);
        parcel.writeInt(this.txDelay);
        parcel.writeLong(this.rxDelay);
        parcel.writeInt(this.format);
        parcel.writeInt(this.packetSize);
    }

    private ImageFrame(Parcel parcel) {
        this.packetList = new ArrayList<>(800);
        this.frameData = null;
        this.sequence = -1;
        this.txCompleteTime = 0;
        this.rxCompleteTime = 0L;
        this.txDelay = 0;
        this.rxDelay = 0L;
        this.format = 0;
        this.packetSize = 0;
        this.sequence = parcel.readInt();
        this.frameData = parcel.createByteArray();
        this.txDelay = parcel.readInt();
        this.rxDelay = parcel.readLong();
        this.format = parcel.readInt();
        this.packetSize = parcel.readInt();
    }

    private static void printDetail(String str) {
        BKSmartLog.INSTANCE.detail(TAG, str);
    }
}
