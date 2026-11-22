package com.anythink.expressad.videocommon.c;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f5536a;
    private String b;

    private a(String str, String str2) {
        this.f5536a = str;
        this.b = str2;
    }

    private String a() {
        return this.f5536a;
    }

    private void a(String str) {
        this.f5536a = str;
    }

    private String b() {
        return this.b;
    }

    private void b(String str) {
        this.b = str;
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
