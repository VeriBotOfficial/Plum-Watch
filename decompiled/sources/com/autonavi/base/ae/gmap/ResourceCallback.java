package com.autonavi.base.ae.gmap;

/* loaded from: classes12.dex */
public class ResourceCallback {
    private long instance;

    public ResourceCallback() {
        this.instance = 0L;
    }

    private static native void nativeCallCancel();

    private static native void nativeCallFailed(long j, String str);

    private static native void nativeCallSuccess(long j, AMapAppResourceItem aMapAppResourceItem);

    public void callCancel() {
        nativeCallCancel();
    }

    public void callFailed(String str) {
        nativeCallFailed(this.instance, str);
    }

    public void callSuccess(AMapAppResourceItem aMapAppResourceItem) {
        nativeCallSuccess(this.instance, aMapAppResourceItem);
    }

    public long getInstance() {
        return this.instance;
    }

    public void setInstance(long j) {
        this.instance = j;
    }

    public ResourceCallback(long j) {
        this.instance = j;
    }
}
