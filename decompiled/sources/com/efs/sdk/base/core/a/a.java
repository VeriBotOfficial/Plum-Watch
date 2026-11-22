package com.efs.sdk.base.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class a {
    private static volatile long b = -1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9589a;

    /* synthetic */ a(byte b2) {
        this();
    }

    private a() {
        this.f9589a = true;
    }

    /* renamed from: com.efs.sdk.base.core.a.a$a, reason: collision with other inner class name */
    static class C0553a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f9590a = new a(0);
    }

    public static a a() {
        return C0553a.f9590a;
    }

    public static long b() {
        if (b == -1) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + b;
    }

    public final HttpResponse a(String str, c cVar, File file, boolean z) {
        String b2 = cVar.b();
        String a2 = a(str, cVar);
        if (this.f9589a) {
            Log.i("efs.px.api", "Upload file, url is ".concat(String.valueOf(a2)));
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("wpk-header", b2);
        com.efs.sdk.base.core.util.a.d a3 = new com.efs.sdk.base.core.util.a.d(a2).a(hashMap);
        a3.f9646a.d = file;
        return a3.a("type", cVar.h).a("size", new StringBuilder().append(cVar.o).toString()).a("flow_limit", Boolean.toString(z)).a(d.a()).a().b();
    }

    public final HttpResponse a(String str, c cVar, byte[] bArr, boolean z) {
        String b2 = cVar.b();
        String a2 = a(str, cVar);
        if (this.f9589a) {
            Log.i("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(a2)));
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("wpk-header", b2);
        com.efs.sdk.base.core.util.a.d a3 = new com.efs.sdk.base.core.util.a.d(a2).a(hashMap);
        a3.f9646a.c = bArr;
        a3.f9646a.g = true;
        return a3.a("type", cVar.h).a("size", new StringBuilder().append(cVar.o).toString()).a("flow_limit", Boolean.toString(z)).a(d.a()).a().b();
    }

    private static String a(String str, c cVar) {
        String str2;
        byte b2 = cVar.g;
        if (b2 == 1) {
            str2 = "/apm_logs";
        } else if (b2 == 2) {
            str2 = "/perf_upload";
        } else if (b2 == 3) {
            str2 = "/api/v1/mix/upload";
        } else {
            str2 = "/api/v1/raw/upload";
        }
        return str + str2;
    }

    static void a(HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String optString = jSONObject.optString("code", "-1");
            httpResponse.setBizCode(optString);
            if (!"0".equals(optString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j - b()) > 1500000) {
                b = j - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            Log.e("efs.px.api", "checkPxReturn error", th);
        }
    }
}
