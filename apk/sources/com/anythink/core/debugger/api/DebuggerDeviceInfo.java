package com.anythink.core.debugger.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class DebuggerDeviceInfo {
    private JSONObject deviceInfoJsonObj;

    public void setDeviceInfoJsonObj(JSONObject jSONObject) {
        this.deviceInfoJsonObj = jSONObject;
    }

    public JSONObject getDeviceInfoJsonObj() {
        return this.deviceInfoJsonObj;
    }
}
