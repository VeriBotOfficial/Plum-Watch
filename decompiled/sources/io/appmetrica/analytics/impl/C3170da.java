package io.appmetrica.analytics.impl;

import com.facebook.react.uimanager.ViewProps;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3170da {
    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        return ((Boolean) WrapUtils.getOrDefault(jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean(ViewProps.ENABLED)) : null, Boolean.valueOf(z))).booleanValue();
    }
}
