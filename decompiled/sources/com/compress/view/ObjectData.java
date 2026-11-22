package com.compress.view;

/* loaded from: classes14.dex */
public abstract class ObjectData {
    public byte displayMode;
    public byte period;

    protected abstract byte[] getBytes();

    protected abstract int getSize();

    public byte getPeriod() {
        return this.period;
    }

    public void setPeriod(byte b) {
        this.period = b;
    }

    public byte getDisplayMode() {
        return this.displayMode;
    }

    public void setDisplayMode(byte b) {
        this.displayMode = b;
    }

    public int getSizeData() {
        return getSize();
    }

    public byte[] getBytesData() {
        return getBytes();
    }
}
