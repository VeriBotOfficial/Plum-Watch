package com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.helper;

import java.io.Serializable;

/* loaded from: classes17.dex */
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

    public void setClkNum(int i) {
        this.clkNum = i;
    }

    public void setFirstClkTime(long j) {
        this.firstClkTime = j;
    }

    public PrivacyBean(int i) {
        this.firstClkTime = 0L;
        this.clkNum = i;
        this.firstClkTime = System.currentTimeMillis();
    }
}
