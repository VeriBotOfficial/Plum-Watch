package com.beken.iot.smartsdk.core.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.beken.iot.smartsdk.core.data.BasicHead;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class CameraFramePacket {
    public static final int HEAD_SIZE = 4;
    private static final int INDEX_CNT = 2;
    private static final int INDEX_EOF = 1;
    private static final int INDEX_ID = 0;
    private static final int INDEX_SIZE = 3;
    private static final String TAG = "CameraFramePacket";
    private static final int VALUE_EOF = 1;
    private final int count;
    private final boolean eof;

    /* renamed from: id, reason: collision with root package name */
    private final int f9070id;
    private final int length;
    private final byte[] payload;
    private final int size;
    private int timeStamp;

    public CameraFramePacket(byte[] bArr) {
        this.timeStamp = 0;
        int parseId = parseId(bArr);
        this.f9070id = parseId;
        boolean parseEof = parseEof(bArr);
        this.eof = parseEof;
        int parseCount = parseCount(bArr);
        this.count = parseCount;
        this.size = parseSize(bArr);
        this.payload = Arrays.copyOfRange(bArr, 4, bArr.length);
        int length = bArr.length - 4;
        this.length = length;
        printD("ID: " + parseId + " EOF: " + parseEof + "  Index: " + parseCount + " Length: " + length);
    }

    public CameraFramePacket(byte[] bArr, BasicHead basicHead) {
        this.timeStamp = 0;
        int parseId = parseId(bArr);
        this.f9070id = parseId;
        boolean parseEof = parseEof(bArr);
        this.eof = parseEof;
        int parseCount = parseCount(bArr);
        this.count = parseCount;
        this.size = parseSize(bArr);
        this.payload = Arrays.copyOfRange(bArr, 4, bArr.length);
        int length = bArr.length - 4;
        this.length = length;
        this.timeStamp = basicHead.timestamp;
        printDetail(basicHead.sequence + " ID: " + parseId + " EOF: " + parseEof + "  Index: " + parseCount + " Length: " + length + " " + basicHead.length);
    }

    public static int naturalOrder(CameraFramePacket cameraFramePacket, CameraFramePacket cameraFramePacket2) {
        if (cameraFramePacket.getCount() < cameraFramePacket2.getCount()) {
            return -1;
        }
        return cameraFramePacket.getCount() == cameraFramePacket2.getCount() ? 0 : 1;
    }

    public static int reverseOrder(CameraFramePacket cameraFramePacket, CameraFramePacket cameraFramePacket2) {
        if (cameraFramePacket2.getCount() < cameraFramePacket.getCount()) {
            return -1;
        }
        return cameraFramePacket2.getCount() == cameraFramePacket.getCount() ? 0 : 1;
    }

    public static int getListDataSize(ArrayList<CameraFramePacket> arrayList) {
        Iterator<CameraFramePacket> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getLength();
        }
        return i;
    }

    public static CameraFramePacket getCameraFrame(ArrayList<CameraFramePacket> arrayList, int i) {
        Iterator<CameraFramePacket> it = arrayList.iterator();
        CameraFramePacket cameraFramePacket = null;
        while (it.hasNext()) {
            CameraFramePacket next = it.next();
            printD("ind: " + i + " seq: " + next.getId());
            if (i == next.getId()) {
                cameraFramePacket = next;
            }
        }
        return cameraFramePacket;
    }

    public static byte[] decodeList(ImageFrame imageFrame, int i, int i2) throws Exception {
        ArrayList<CameraFramePacket> packetList = imageFrame.getPacketList();
        if (packetList.size() == 0) {
            throw new Exception("warning: list was null");
        }
        if (packetList.size() != i2) {
            printD("list size: " + packetList.size());
            Iterator<CameraFramePacket> it = packetList.iterator();
            while (it.hasNext()) {
                CameraFramePacket next = it.next();
                printD("ID: " + next.getId() + " Count: " + next.getCount());
            }
            throw new Exception("No." + i + " got: " + packetList.size() + "/" + i2);
        }
        byte[] bArr = new byte[getListDataSize(packetList)];
        packetList.sort(new Comparator<CameraFramePacket>() { // from class: com.beken.iot.smartsdk.core.video.CameraFramePacket.1
            @Override // java.util.Comparator
            public int compare(CameraFramePacket cameraFramePacket, CameraFramePacket cameraFramePacket2) {
                return CameraFramePacket.naturalOrder(cameraFramePacket, cameraFramePacket2);
            }
        });
        Iterator<CameraFramePacket> it2 = packetList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            CameraFramePacket next2 = it2.next();
            printD("sequence: " + next2.getCount());
            System.arraycopy(next2.getPayload(), 0, bArr, i3, next2.getLength());
            i3 += next2.getLength();
        }
        return bArr;
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) throws Exception {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Bitmap bytes2Bitmap(byte[] bArr, int i) {
        Bitmap bitmap;
        try {
            bitmap = bytes2Bitmap(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            printD("Bitmap create failed");
            return bitmap2;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
    }

    public static String dumpHex(byte[] bArr, int i) {
        String str = "";
        for (int i2 = 0; i2 < bArr.length; i2++) {
            String str2 = str + String.format("%02X", Byte.valueOf(bArr[i2]));
            if (i2 % i == 0) {
                str = str2 + "\n";
            } else {
                str = str2 + " ";
            }
        }
        return str;
    }

    public int parseId(byte[] bArr) {
        return Byte.toUnsignedInt(bArr[0]);
    }

    public boolean parseEof(byte[] bArr) {
        return Byte.toUnsignedInt(bArr[1]) == 1;
    }

    public int parseCount(byte[] bArr) {
        return Byte.toUnsignedInt(bArr[2]);
    }

    public int parseSize(byte[] bArr) {
        return Byte.toUnsignedInt(bArr[3]);
    }

    public int getId() {
        return this.f9070id;
    }

    public boolean isEof() {
        return this.eof;
    }

    public int getCount() {
        return this.count;
    }

    public int getSize() {
        return this.size;
    }

    public int getLength() {
        return this.length;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public int getTimeStamp() {
        return this.timeStamp;
    }

    private static void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }

    private static void printDetail(String str) {
        BKSmartLog.INSTANCE.detail(TAG, str);
    }
}
