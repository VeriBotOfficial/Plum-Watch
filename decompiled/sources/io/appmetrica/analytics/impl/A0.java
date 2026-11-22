package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class A0 {
    public static String a(C3708z0 c3708z0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", c3708z0.f18602a).put("packageName", c3708z0.b).put("reporterType", c3708z0.c.getStringValue()).put("processID", c3708z0.d).put("processSessionID", c3708z0.e).put("errorEnvironment", c3708z0.f).toString().getBytes(Charsets.UTF_8), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static C3708z0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8));
            return new C3708z0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
