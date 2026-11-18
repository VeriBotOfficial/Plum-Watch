package com.bytedance.sdk.openadsdk.iwp;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface hm {
    JSONObject bh();

    HandlerThread fxn(String str, int r2);

    ExecutorService fxn();

    JSONObject fxn(JSONObject jSONObject);

    String gff();

    Handler hm();

    Context kg();

    String rb();

    Map<String, String> sg();
}
