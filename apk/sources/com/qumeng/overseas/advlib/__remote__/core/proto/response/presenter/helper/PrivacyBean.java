package com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.helper;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class PrivacyBean implements Serializable {
    private int clkNum;
    private long firstClkTime;

    public PrivacyBean() {
        this.firstClkTime = 0L;
        this.clkNum = 0;
    }

    public int getClkNum() {
        return this.clkNum;
    }

    public long getFirstClkTime() {
        return this.firstClkTime;
    }

    public void setClkNum(int r1) {
        this.clkNum = r1;
    }

    public void setFirstClkTime(long j) {
        this.firstClkTime = j;
    }

    public PrivacyBean(int r3) {
        this.firstClkTime = 0L;
        this.clkNum = r3;
        this.firstClkTime = System.currentTimeMillis();
    }
}
