package com.amap.location.support.uptunnel;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface IUpTunnel {
    void addCount(int i);

    void execCMD(JSONObject jSONObject);

    void reportBlockData(int i, byte[] bArr);

    void reportEvent(int i, byte[] bArr);
}
