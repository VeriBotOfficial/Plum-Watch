package com.bluetrum.fota.manager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes13.dex */
final class OtaDataProvider {
    private int blockOffset;
    private final boolean isCompressedData;
    private final byte[] otaData;
    private int blockSize = -1;
    private int packetSize = 20;
    private int fileOffset = 0;

    public OtaDataProvider(byte[] bArr) {
        this.otaData = bArr;
        this.isCompressedData = checkIfCompressedData(bArr);
    }

    public void reset() {
        this.fileOffset = 0;
        this.packetSize = 20;
        this.blockSize = -1;
    }

    public boolean isCompressedData() {
        return this.isCompressedData;
    }

    public int getStartAddress() {
        return this.fileOffset;
    }

    public void setStartAddress(int i) {
        this.fileOffset = i;
    }

    public void setBlockSize(int i) {
        this.blockSize = i;
    }

    public void setPacketSize(int i) {
        this.packetSize = i;
    }

    public int getProgress() {
        return (this.fileOffset * 100) / this.otaData.length;
    }

    public boolean isBlockSendFinish() {
        int i = this.blockSize;
        if (i == -1) {
            return isAllDataSent();
        }
        return this.fileOffset - this.blockOffset == i || isAllDataSent();
    }

    public boolean isAllDataSent() {
        return this.fileOffset == this.otaData.length;
    }

    public int getTotalLengthToBeSent() {
        int i = this.blockSize;
        if (i == -1) {
            return this.otaData.length - this.fileOffset;
        }
        int min = Math.min(this.otaData.length - this.fileOffset, i);
        this.blockOffset = this.fileOffset;
        return min;
    }

    byte[] getStartData(int i) {
        int i2 = this.blockSize;
        if (i2 == -1) {
            i2 = this.otaData.length;
        }
        int min = Math.min(i2, this.packetSize - i);
        int i3 = this.fileOffset;
        int i4 = i3 + min;
        byte[] bArr = this.otaData;
        if (i4 > bArr.length) {
            min = bArr.length - i3;
        }
        byte[] bArr2 = new byte[min];
        System.arraycopy(bArr, i3, bArr2, 0, min);
        this.fileOffset += min;
        return bArr2;
    }

    byte[] getDataToBeSent(int i) {
        int i2 = this.blockSize;
        if (i2 == -1) {
            i2 = this.otaData.length;
        }
        int min = Math.min(i2, this.packetSize - i);
        int i3 = this.blockSize;
        if (i3 != -1) {
            int i4 = this.fileOffset;
            int i5 = this.blockOffset;
            if ((i4 - i5) + min > i3) {
                min = i3 - (i4 - i5);
            }
        }
        int i6 = this.fileOffset;
        int i7 = i6 + min;
        byte[] bArr = this.otaData;
        if (i7 > bArr.length) {
            min = bArr.length - i6;
        }
        byte[] bArr2 = new byte[min];
        System.arraycopy(bArr, i6, bArr2, 0, min);
        this.fileOffset += min;
        return bArr2;
    }

    public byte[] getHash() {
        return getHash(this.otaData);
    }

    private byte[] getHash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean checkIfCompressedData(byte[] bArr) {
        return bArr.length >= 3 && bArr[0] == 80 && bArr[1] == 79 && bArr[2] == 84;
    }
}
