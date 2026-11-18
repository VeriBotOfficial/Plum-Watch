package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* JADX INFO: compiled from: AdParams.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12653a;
    private String b;

    public a(String str, String str2) {
        this.f12653a = str;
        this.b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
