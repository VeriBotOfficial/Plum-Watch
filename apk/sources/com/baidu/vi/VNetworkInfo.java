package com.baidu.vi;

import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes15.dex */
public class VNetworkInfo {
    public int state;
    public int type;
    public String typename;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9049a;

        static {
            int[] r0 = new int[NetworkInfo.State.values().length];
            f9049a = r0;
            try {
                r0[NetworkInfo.State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9049a[NetworkInfo.State.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9049a[NetworkInfo.State.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9049a[NetworkInfo.State.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9049a[NetworkInfo.State.SUSPENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public VNetworkInfo(NetworkInfo networkInfo) {
        this.typename = networkInfo.getTypeName();
        this.type = networkInfo.getType();
        int r3 = a.f9049a[networkInfo.getState().ordinal()];
        if (r3 == 1) {
            this.state = 2;
        } else if (r3 != 2) {
            this.state = 0;
        } else {
            this.state = 1;
        }
    }
}
