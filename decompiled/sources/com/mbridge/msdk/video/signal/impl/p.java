package com.mbridge.msdk.video.signal.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSRewardVideoV1Diff.java */
/* loaded from: classes17.dex */
public class p extends g {
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put("device", new com.mbridge.msdk.foundation.tools.r(com.mbridge.msdk.foundation.controller.c.m().d()).a());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
