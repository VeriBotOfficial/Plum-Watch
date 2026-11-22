package com.bytedance.sdk.openadsdk.hm.fxn;

/* loaded from: classes14.dex */
public class fxn {
    public static final kg fxn = new kg(0);
    public static final kg kg = new kg(1);
    public static final kg gff = new kg(2);
    public static final kg hm = new kg(0);
    public static final kg rb = new kg(1);
    public static final kg bh = new kg(2);

    public static void fxn(kg kgVar, boolean z, int i, long j) {
        try {
            kgVar.f9556sg.getAndSet(true);
            if (z) {
                kgVar.fxn.incrementAndGet();
                kgVar.gff.addAndGet(j);
                return;
            }
            kgVar.kg.incrementAndGet();
            Integer num = kgVar.bh.get(Integer.valueOf(i));
            if (num != null) {
                kgVar.bh.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            } else {
                kgVar.bh.put(Integer.valueOf(i), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void fxn(kg kgVar, boolean z) {
        try {
            kgVar.f9556sg.getAndSet(true);
            if (z) {
                kgVar.fxn.incrementAndGet();
            } else {
                kgVar.kg.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void fxn(kg kgVar) {
        try {
            kgVar.f9556sg.getAndSet(true);
            kgVar.rb.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void fxn() {
        try {
            kg kgVar = fxn;
            if (kgVar.f9556sg.get()) {
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", kgVar.fxn().toString());
            }
            kg kgVar2 = kg;
            if (kgVar2.f9556sg.get()) {
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_net_state", "tt_sdk_event_net_state", kgVar2.fxn().toString());
            }
            kg kgVar3 = gff;
            if (kgVar3.f9556sg.get()) {
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", kgVar3.fxn().toString());
            }
            kg kgVar4 = hm;
            if (kgVar4.f9556sg.get()) {
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", kgVar4.kg().toString());
            }
            kg kgVar5 = rb;
            if (kgVar5.f9556sg.get()) {
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_db_state", "tt_sdk_event_db_state", kgVar5.kg().toString());
            }
            kg kgVar6 = bh;
            if (kgVar6.f9556sg.get()) {
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", kgVar6.kg().toString());
            }
        } catch (Throwable unused) {
        }
    }

    public static void kg() {
        try {
            com.bytedance.sdk.openadsdk.ckl.gff.kg("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.ckl.gff.kg("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.ckl.gff.kg("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.ckl.gff.kg("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.ckl.gff.kg("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.ckl.gff.kg("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }
}
