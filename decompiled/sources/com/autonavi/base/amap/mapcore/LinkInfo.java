package com.autonavi.base.amap.mapcore;

/* loaded from: classes12.dex */
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

    public void setLength(int i) {
        this.length = i;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("状态：");
        sb.append(this.state).append("|时间：");
        sb.append(this.time).append("|长度：");
        sb.append(this.length);
        return sb.toString();
    }
}
