package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: compiled from: BaseAuthorityInfoBean.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f11492a;
    protected int b;
    protected int c;
    protected int d;

    protected void a(int r1) {
        this.f11492a = r1;
        this.b = r1;
        this.c = r1;
    }

    public void authDeviceIdStatus(int r1) {
        this.b = r1;
    }

    public void authGenDataStatus(int r1) {
        this.f11492a = r1;
    }

    public void authOtherDataStatus(int r1) {
        this.d = r1;
    }

    public void authSerialIdStatus(int r1) {
        this.c = r1;
    }

    public int getAuthDeviceIdStatus() {
        return this.b;
    }

    public int getAuthGenDataStatus() {
        return this.f11492a;
    }

    public int getAuthSerialIdStatus() {
        return this.c;
    }

    public int getOtherDataStatus() {
        return this.d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            str.hashCode();
            switch (str) {
                case "authority_serial_id":
                    return this.c;
                case "authority_device_id":
                    return this.b;
                case "authority_general_data":
                    return this.f11492a;
                case "authority_other":
                    return this.d;
            }
        }
        return 1;
    }
}
