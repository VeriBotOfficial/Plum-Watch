package com.amap.location.collection.common;

/* loaded from: classes11.dex */
public class CollectionData {
    private byte[] mData;
    private Object mPrivateData;
    private int mType;

    public CollectionData(int i, byte[] bArr) {
        this.mType = i;
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
