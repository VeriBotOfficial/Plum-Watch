package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class uhw {
    private static final AtomicInteger fxn;
    private static final AtomicInteger gff;
    private static final AtomicInteger hm;
    private static final AtomicInteger kg;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        fxn = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        kg = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        gff = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        hm = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void fxn() {
        try {
            long fxn2 = com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "upload_time_key", 0L);
            if (fxn2 <= 0 || System.currentTimeMillis() - fxn2 < 86400000) {
                if (fxn2 <= 0 || fxn2 > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            kg();
            synchronized (uhw.class) {
                fxn.set(0);
                kg.set(0);
                gff.set(0);
                hm.set(0);
                com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void kg() {
        final int i = fxn.get();
        final int i2 = kg.get();
        final int i3 = gff.get();
        final int i4 = hm.get();
        com.bytedance.sdk.openadsdk.ckl.gff.fxn("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.ckl.kg() { // from class: com.bytedance.sdk.openadsdk.core.uhw.1
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.ckl.fxn.hm.kg().fxn("crypt_v4_statistics").kg(jSONObject.toString());
            }
        });
    }

    public static void fxn(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.ckl.gff.fxn("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.ckl.kg() { // from class: com.bytedance.sdk.openadsdk.core.uhw.2
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.ckl.fxn.hm.kg().fxn("crypt_v4_fail").kg(jSONObject.toString());
            }
        });
    }

    public static synchronized void fxn(boolean z) {
        synchronized (uhw.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(gff.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(gff.incrementAndGet()));
            }
        }
    }

    public static void fxn(JSONObject jSONObject) {
        kg(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }

    public static synchronized void kg(boolean z) {
        synchronized (uhw.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(fxn.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(kg.incrementAndGet()));
            }
        }
    }
}
