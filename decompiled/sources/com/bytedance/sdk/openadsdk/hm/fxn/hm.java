package com.bytedance.sdk.openadsdk.hm.fxn;

import android.content.Context;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.bytedance.sdk.component.bh.fxn.fxn;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.core.rmu;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public class hm {
    public static AtomicInteger fxn = new AtomicInteger(0);
    public static final AtomicBoolean kg = new AtomicBoolean(false);

    public static void fxn(Context context, boolean z) {
        if (kg.compareAndSet(false, true)) {
            com.bytedance.sdk.component.bh.fxn.kg.fxn(new fxn.C0476fxn().fxn(new hie()).kg(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn.gff()).gff(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn.rb()).fxn(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn.hm()).fxn(z).fxn(new dgx()).fxn(tw.fxn).kg(rmu.hm().mvp()).fxn(rmu.hm().rlu()).fxn(rmu.hm().uws()).fxn(), context);
            kg();
        }
    }

    public static void fxn(com.bytedance.sdk.openadsdk.hm.fxn fxnVar) {
        com.bytedance.sdk.component.bh.fxn.hm.fxn.fxn fxnVar2 = new com.bytedance.sdk.component.bh.fxn.hm.fxn.fxn(fxnVar.hm(), fxnVar);
        fxnVar2.kg(fxnVar.rb() ? (byte) 1 : (byte) 2);
        fxnVar2.fxn((byte) 0);
        if (com.bytedance.sdk.component.bh.fxn.kg.kg()) {
            fxn(rmu.fxn(), com.bytedance.sdk.openadsdk.multipro.kg.gff());
        }
        com.bytedance.sdk.component.bh.fxn.kg.fxn(fxnVar2);
    }

    public static com.bytedance.sdk.openadsdk.ckl.gff.gff fxn() {
        return mvp.fxn;
    }

    public static void fxn(final List<String> list, final int i, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.hm.gff.fxn(new com.bytedance.sdk.component.tw.tw(ARPScriptEnvironment.KEY_DATA_PIP_TRACK) { // from class: com.bytedance.sdk.openadsdk.hm.fxn.hm.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.bh.fxn.kg.kg()) {
                    hm.fxn(rmu.fxn(), com.bytedance.sdk.openadsdk.multipro.kg.gff());
                }
                com.bytedance.sdk.component.bh.fxn.kg.fxn(com.bytedance.sdk.openadsdk.core.mvp.fxn(rmu.fxn()), list, true, i, str);
            }
        });
    }

    public static void fxn(String str) {
        fxn(str, false);
    }

    public static void fxn(String str, boolean z) {
        if (com.bytedance.sdk.component.bh.fxn.kg.kg()) {
            fxn(rmu.fxn(), com.bytedance.sdk.openadsdk.multipro.kg.gff());
        }
        com.bytedance.sdk.component.bh.fxn.kg.fxn(str, z);
    }

    public static void kg() {
        com.bytedance.sdk.component.bh.fxn.kg.gff();
    }

    public static void gff() {
        try {
            com.bytedance.sdk.component.bh.fxn.kg.hm();
            com.bytedance.sdk.component.bh.fxn.kg.rb();
        } catch (Throwable th) {
            dx.gff("AdLogSwitchUtils", th.getMessage());
        }
    }
}
