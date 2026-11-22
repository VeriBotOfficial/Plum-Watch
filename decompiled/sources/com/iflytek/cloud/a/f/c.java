package com.iflytek.cloud.a.f;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.speech.UtilityConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f11135a = new JSONObject();
    long b = 0;
    long c = 0;

    public void a(com.iflytek.cloud.b.a aVar) {
        this.c = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        a("app_start", com.iflytek.cloud.msc.util.d.a(this.c), false);
        String a2 = aVar.a(UtilityConfig.KEY_CALLER_APPID);
        if (!TextUtils.isEmpty(a2)) {
            a("app_caller_appid", a2, false);
        }
        String a3 = com.iflytek.cloud.msc.util.a.b((Context) null).a("app.ver.code");
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        a("app_cver", a3, false);
    }

    public synchronized void a(String str) {
        a(str, SystemClock.elapsedRealtime() - this.b, false);
    }

    public synchronized void a(String str, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!z) {
                this.f11135a.put(str, j);
            } else {
                JSONArray optJSONArray = this.f11135a.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    this.f11135a.put(str, optJSONArray);
                }
                if (optJSONArray != null) {
                    optJSONArray.put(j);
                }
            }
        } catch (JSONException e) {
            DebugLog.LogE(e);
        }
    }

    public synchronized void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (!z) {
                this.f11135a.put(str, str2);
            } else {
                JSONArray optJSONArray = this.f11135a.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    this.f11135a.put(str, optJSONArray);
                }
                if (optJSONArray != null) {
                    optJSONArray.put(str2);
                }
            }
        } catch (JSONException e) {
            DebugLog.LogE(e);
        }
    }

    public synchronized String a() {
        return this.f11135a.toString();
    }
}
