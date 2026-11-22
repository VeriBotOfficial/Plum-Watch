package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.je;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.utils.yws;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class kg extends com.bytedance.sdk.component.tw.tw {
    private final List<? extends com.bytedance.sdk.component.tw.tw> fxn;

    public kg(String str, List<? extends com.bytedance.sdk.component.tw.tw> list) {
        super(str);
        this.fxn = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.tw.tw> list;
        if (je.gff(rmu.fxn()) != 0 && (list = this.fxn) != null) {
            Iterator<? extends com.bytedance.sdk.component.tw.tw> it = list.iterator();
            while (it.hasNext()) {
                yws.fxn(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.jq.fxn().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
