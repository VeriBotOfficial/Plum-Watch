package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes7.dex */
public class PartETag {
    private long crc64;
    private String eTag;
    private int partNumber;
    private long partSize;

    public PartETag(int r1, String str) {
        setPartNumber(r1);
        setETag(str);
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(int r1) {
        this.partNumber = r1;
    }

    public String getETag() {
        return this.eTag;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public long getPartSize() {
        return this.partSize;
    }

    public void setPartSize(long j) {
        this.partSize = j;
    }

    public long getCRC64() {
        return this.crc64;
    }

    public void setCRC64(long j) {
        this.crc64 = j;
    }
}
