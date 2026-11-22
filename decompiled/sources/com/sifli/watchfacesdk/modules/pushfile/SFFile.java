package com.sifli.watchfacesdk.modules.pushfile;

import com.sifli.siflicore.error.SFException;
import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.util.ByteUtil;
import com.sifli.siflicore.util.DataTool;
import com.sifli.siflicore.util.FileUtil;
import com.sifli.siflicore.util.HexUtil;

/* loaded from: classes17.dex */
public class SFFile {
    private static final String TAG = "SFFile";
    private long fileLength;
    private String fileName;
    private String filePath;
    private boolean isSend;
    private byte[] lastBytes;
    private byte[] paddingAndCrcBytes;
    private int sliceCount;
    private int sliceLength;
    private long totalBytes;

    public SFFile(String str, String str2) {
        this.fileName = str;
        this.filePath = str2;
        long fileDataLength = FileUtil.getFileDataLength(str2);
        this.fileLength = fileDataLength;
        this.totalBytes = fileDataLength;
        this.paddingAndCrcBytes = new byte[0];
    }

    public void reSliceFile(int i) {
        this.sliceLength = i;
        this.sliceCount = DataTool.computeSliceCount(this.totalBytes, i);
    }

    public void paddingByte(byte b) throws SFException {
        this.paddingAndCrcBytes = FileUtil.appendCRCWithFile(this.filePath, b);
        long fileDataLength = FileUtil.getFileDataLength(this.filePath);
        byte[] bArr = this.paddingAndCrcBytes;
        this.totalBytes = fileDataLength + bArr.length;
        SFLog.i(TAG, "paddingAndCrcBytes=%s", HexUtil.encodeHexStr(bArr));
    }

    public String briefDes() {
        return String.format("<fileName=%s,length=%d>", this.fileName, Long.valueOf(this.totalBytes));
    }

    public String getFileName() {
        return this.fileName;
    }

    public byte[] getSliceData(int i) throws SFException {
        if (i < 0 || i > this.sliceCount) {
            SFLog.e(TAG, "watchface file slice index out of band.index=%d,sliceCount=%d,path=%s", Integer.valueOf(i), Integer.valueOf(this.sliceCount), this.filePath);
            throw new SFException(100, "watchface file slice index out of band.");
        }
        int i2 = this.sliceLength;
        int i3 = i * i2;
        long j = i3;
        long j2 = this.fileLength;
        if (j >= j2) {
            if (j == j2) {
                byte[] bArr = this.paddingAndCrcBytes;
                if (bArr != null && bArr.length != 0) {
                    return bArr;
                }
                SFLog.e(TAG, "getSliceData paddingAndCrcBytes is null or len =0 at end.sliceIndex=%d,sliceCount=%d,fileName=%s", Integer.valueOf(i), Integer.valueOf(this.sliceCount), this.fileName);
                throw new SFException(210, "getSliceData paddingAndCrcBytes is null or len = 0");
            }
            if (this.lastBytes != null) {
                SFLog.i(TAG, "getSliceData sliceIndex=%d,last slice 2/2", Integer.valueOf(i));
                byte[] bArr2 = this.lastBytes;
                this.lastBytes = null;
                return bArr2;
            }
            SFLog.e(TAG, "getSliceData lastBytes is null.sliceIndex=%d,sliceCount=%d,fileName=%s", Integer.valueOf(i), Integer.valueOf(this.sliceCount), this.fileName);
            throw new SFException(210, "getSliceData lastBytes is null");
        }
        byte[] fileSliceData = FileUtil.getFileSliceData(this.filePath, i3, i2);
        int length = fileSliceData.length;
        int i4 = this.sliceLength;
        if (length == i4) {
            SFLog.i(TAG, "getSliceData sliceIndex=%d,full slice", Integer.valueOf(i));
            return fileSliceData;
        }
        if (fileSliceData.length + this.paddingAndCrcBytes.length <= i4) {
            SFLog.i(TAG, "getSliceData sliceIndex=%d,last slice single", Integer.valueOf(i));
            return ByteUtil.mergeArrays(fileSliceData, this.paddingAndCrcBytes);
        }
        SFLog.i(TAG, "getSliceData sliceIndex=%d,last slice 1/2", Integer.valueOf(i));
        int length2 = this.sliceLength - fileSliceData.length;
        byte[] copyFrom = ByteUtil.copyFrom(this.paddingAndCrcBytes, 0, length2);
        byte[] bArr3 = this.paddingAndCrcBytes;
        this.lastBytes = ByteUtil.copyFrom(bArr3, length2, bArr3.length - length2);
        return ByteUtil.mergeArrays(fileSliceData, copyFrom);
    }

    public int getSliceLen(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.sliceCount)) {
            if (i < i2 - 1) {
                return this.sliceLength;
            }
            if (i == i2 - 1) {
                return (int) (this.totalBytes - (this.sliceLength * i));
            }
        }
        return 0;
    }

    public int getSliceCount() {
        return this.sliceCount;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public boolean hasSlice() {
        return this.sliceCount > 0;
    }

    public boolean isSend() {
        return this.isSend;
    }

    public void setSend(boolean z) {
        this.isSend = z;
    }
}
