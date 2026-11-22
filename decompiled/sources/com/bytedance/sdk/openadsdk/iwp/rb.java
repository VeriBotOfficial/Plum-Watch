package com.bytedance.sdk.openadsdk.iwp;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rb implements hm {
    Handler fxn = null;
    private hm kg;

    rb(hm hmVar) {
        this.kg = hmVar;
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public ExecutorService fxn() {
        hm hmVar = this.kg;
        if (hmVar == null || hmVar.fxn() == null) {
            return Executors.newCachedThreadPool();
        }
        return this.kg.fxn();
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public Context kg() {
        hm hmVar = this.kg;
        if (hmVar == null || hmVar.kg() == null) {
            return tw();
        }
        return this.kg.kg();
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public String gff() {
        hm hmVar = this.kg;
        if (hmVar == null || TextUtils.isEmpty(hmVar.gff())) {
            return AbstractJsonLexerKt.NULL;
        }
        return this.kg.gff();
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public Handler hm() {
        hm hmVar = this.kg;
        if (hmVar == null || hmVar.sg() == null) {
            Handler handler = new Handler(fxn("pag_strategy", -1).getLooper());
            this.fxn = handler;
            return handler;
        }
        return this.kg.hm();
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public String rb() {
        hm hmVar = this.kg;
        if (hmVar != null) {
            return hmVar.rb();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public JSONObject bh() {
        hm hmVar = this.kg;
        if (hmVar != null) {
            return hmVar.bh();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public Map<String, String> sg() {
        hm hmVar = this.kg;
        if (hmVar == null || hmVar.sg() == null) {
            return new HashMap();
        }
        return this.kg.sg();
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public JSONObject fxn(JSONObject jSONObject) {
        hm hmVar = this.kg;
        return hmVar != null ? hmVar.fxn(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.iwp.hm
    public HandlerThread fxn(String str, int i) {
        HandlerThread fxn;
        hm hmVar = this.kg;
        if (hmVar != null && (fxn = hmVar.fxn(str, i)) != null) {
            return fxn;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }

    private Context tw() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
