package com.autonavi.base.amap.mapcore;

/* JADX INFO: loaded from: classes16.dex */
public class LinkInfo {
    private int state = 0;
    private int time = 0;
    private int length = 0;

    public int getLength() {
        return this.length;
    }

    public int getState() {
        return this.state;
    }

    public int getTime() {
        return this.time;
    }

    public void setLength(int r1) {
        this.length = r1;
    }

    public void setState(int r1) {
        this.state = r1;
    }

    public void setTime(int r1) {
        this.time = r1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("状态：");
        sb.append(this.state).append("|时间：");
        sb.append(this.time).append("|长度：");
        sb.append(this.length);
        return sb.toString();
    }
}
