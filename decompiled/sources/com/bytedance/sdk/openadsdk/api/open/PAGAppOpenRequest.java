package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes14.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int fxn;

    public int getTimeout() {
        return this.fxn;
    }

    public void setTimeout(int i) {
        this.fxn = i;
    }
}
