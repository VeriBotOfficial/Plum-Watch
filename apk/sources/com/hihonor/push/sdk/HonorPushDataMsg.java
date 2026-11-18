package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class HonorPushDataMsg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10122a = 1;
    public int b = 0;
    public long c;
    public String d;

    public String getData() {
        return this.d;
    }

    public long getMsgId() {
        return this.c;
    }

    public int getType() {
        return this.b;
    }

    public int getVersion() {
        return this.f10122a;
    }

    public void setData(String str) {
        this.d = str;
    }

    public void setMsgId(long j) {
        this.c = j;
    }

    public void setType(int r1) {
        this.b = r1;
    }

    public void setVersion(int r1) {
        this.f10122a = r1;
    }
}
