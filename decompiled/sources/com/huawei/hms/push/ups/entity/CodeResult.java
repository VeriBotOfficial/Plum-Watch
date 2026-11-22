package com.huawei.hms.push.ups.entity;

/* loaded from: classes14.dex */
public class CodeResult {

    /* renamed from: a, reason: collision with root package name */
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

    public void setReturnCode(int i) {
        this.f10492a = i;
    }

    public CodeResult(int i) {
        this.f10492a = i;
    }

    public CodeResult(int i, String str) {
        this.f10492a = i;
        this.b = str;
    }
}
