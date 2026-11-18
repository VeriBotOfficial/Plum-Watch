package com.efs.sdk.memleaksdk.monitor;

import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface UMonitorReporter {
    void onJavaHeap(File file, JSONObject jSONObject);
}
