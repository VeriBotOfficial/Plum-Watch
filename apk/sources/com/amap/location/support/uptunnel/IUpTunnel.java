package com.amap.location.support.uptunnel;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface IUpTunnel {
    void addCount(int r1);

    void execCMD(JSONObject jSONObject);

    void reportBlockData(int r1, byte[] bArr);

    void reportEvent(int r1, byte[] bArr);
}
