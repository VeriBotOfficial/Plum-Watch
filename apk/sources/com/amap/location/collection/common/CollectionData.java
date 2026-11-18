package com.amap.location.collection.common;

/* JADX INFO: loaded from: classes7.dex */
public class CollectionData {
    private byte[] mData;
    private Object mPrivateData;
    private int mType;

    public CollectionData(int r1, byte[] bArr) {
        this.mType = r1;
        this.mData = bArr;
    }

    public byte[] getData() {
        return this.mData;
    }

    public Object getPrivateData() {
        return this.mPrivateData;
    }

    public int getType() {
        return this.mType;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setPrivateData(Object obj) {
        this.mPrivateData = obj;
    }
}
