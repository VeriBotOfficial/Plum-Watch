package com.bluetrum.fota.manager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes15.dex */
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

    public void setStartAddress(int r1) {
        this.fileOffset = r1;
    }

    public void setBlockSize(int r1) {
        this.blockSize = r1;
    }

    public void setPacketSize(int r1) {
        this.packetSize = r1;
    }

    public int getProgress() {
        return (this.fileOffset * 100) / this.otaData.length;
    }

    public boolean isBlockSendFinish() {
        int r0 = this.blockSize;
        if (r0 == -1) {
            return isAllDataSent();
        }
        return this.fileOffset - this.blockOffset == r0 || isAllDataSent();
    }

    public boolean isAllDataSent() {
        return this.fileOffset == this.otaData.length;
    }

    public int getTotalLengthToBeSent() {
        int r0 = this.blockSize;
        if (r0 == -1) {
            return this.otaData.length - this.fileOffset;
        }
        int r1 = Math.min(this.otaData.length - this.fileOffset, r0);
        this.blockOffset = this.fileOffset;
        return r1;
    }

    byte[] getStartData(int r5) {
        int length = this.blockSize;
        if (length == -1) {
            length = this.otaData.length;
        }
        int length2 = Math.min(length, this.packetSize - r5);
        int r0 = this.fileOffset;
        int r1 = r0 + length2;
        byte[] bArr = this.otaData;
        if (r1 > bArr.length) {
            length2 = bArr.length - r0;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, r0, bArr2, 0, length2);
        this.fileOffset += length2;
        return bArr2;
    }

    byte[] getDataToBeSent(int r5) {
        int length = this.blockSize;
        if (length == -1) {
            length = this.otaData.length;
        }
        int length2 = Math.min(length, this.packetSize - r5);
        int r0 = this.blockSize;
        if (r0 != -1) {
            int r1 = this.fileOffset;
            int r2 = this.blockOffset;
            if ((r1 - r2) + length2 > r0) {
                length2 = r0 - (r1 - r2);
            }
        }
        int r3 = this.fileOffset;
        int r4 = r3 + length2;
        byte[] bArr = this.otaData;
        if (r4 > bArr.length) {
            length2 = bArr.length - r3;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, r3, bArr2, 0, length2);
        this.fileOffset += length2;
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
