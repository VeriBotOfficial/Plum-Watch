package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.bh;

/* loaded from: classes14.dex */
public class rb extends bh {
    private static volatile rb fxn;

    @Override // com.bytedance.sdk.openadsdk.core.bh
    public /* bridge */ /* synthetic */ bh.gff fxn() {
        return super.fxn();
    }

    public static rb fxn(Context context) {
        if (fxn == null) {
            synchronized (rb.class) {
                if (fxn == null) {
                    fxn = new rb(context);
                }
            }
        }
        return fxn;
    }

    private rb(Context context) {
        super(context);
    }
}
