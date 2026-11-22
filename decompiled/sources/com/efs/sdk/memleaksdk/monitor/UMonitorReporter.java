package com.efs.sdk.memleaksdk.monitor;

import java.io.File;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface UMonitorReporter {
    void onJavaHeap(File file, JSONObject jSONObject);
}
