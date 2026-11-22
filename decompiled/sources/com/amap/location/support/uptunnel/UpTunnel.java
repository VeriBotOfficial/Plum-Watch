package com.amap.location.support.uptunnel;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public class UpTunnel {
    private static volatile IUpTunnel sUptunnelImpl;

    public static void addCount(int i) {
        if (sUptunnelImpl != null) {
            sUptunnelImpl.addCount(i);
        }
    }

    public static void execCMD(JSONObject jSONObject) {
        if (sUptunnelImpl != null) {
            sUptunnelImpl.execCMD(jSONObject);
        }
    }

    public static void init(IUpTunnel iUpTunnel) {
        if (iUpTunnel != null) {
            sUptunnelImpl = iUpTunnel;
        }
    }

    public static void reportBlockData(int i, byte[] bArr) {
        if (sUptunnelImpl != null) {
            sUptunnelImpl.reportBlockData(i, bArr);
        }
    }

    public static void reportEvent(int i, byte[] bArr) {
        if (sUptunnelImpl != null) {
            sUptunnelImpl.reportEvent(i, bArr);
        }
    }
}
