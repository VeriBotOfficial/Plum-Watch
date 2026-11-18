package com.huawei.hms.push.ups.entity;

/* JADX INFO: loaded from: classes11.dex */
public class CodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10492a;
    private String b;

    public CodeResult() {
    }

    public String getReason() {
        return this.b;
    }

    public int getReturnCode() {
        return this.f10492a;
    }

    public void setReason(String str) {
        this.b = str;
    }

    public void setReturnCode(int r1) {
        this.f10492a = r1;
    }

    public CodeResult(int r1) {
        this.f10492a = r1;
    }

    public CodeResult(int r1, String str) {
        this.f10492a = r1;
        this.b = str;
    }
}
