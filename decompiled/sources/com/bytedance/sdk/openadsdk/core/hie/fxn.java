package com.bytedance.sdk.openadsdk.core.hie;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.jq;
import com.bytedance.sdk.openadsdk.core.mvp;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.core.settings.rlu;
import com.bytedance.sdk.openadsdk.core.zu;
import com.bytedance.sdk.openadsdk.multipro.hm.hm;
import com.bytedance.sdk.openadsdk.utils.qhf;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes14.dex */
class fxn {
    private PglSSManager fxn;
    private volatile boolean gff = true;
    private volatile boolean hm = false;
    private volatile boolean kg;

    public fxn() {
        fxn();
    }

    public synchronized void fxn() {
        Context fxn;
        String hm;
        if (!this.kg) {
            try {
                fxn = rmu.fxn();
                hm = jq.kg().hm();
                if (TextUtils.isEmpty(hm)) {
                    hm = jq.fxn("app_id", Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                hie();
                this.kg = false;
            }
            if (TextUtils.isEmpty(hm)) {
                return;
            }
            String fxn2 = mvp.fxn(fxn);
            String kg = com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().kg();
            PglSSConfig build = PglSSConfig.builder().setAppId(hm).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
            String kg2 = hm.kg("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(kg2)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, kg2);
            }
            Set<String> fqm = rlu.jt().fqm();
            if (fqm != null && !fqm.isEmpty()) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, fqm);
            }
            String je = qhf.je();
            if (!TextUtils.isEmpty(je)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, je);
            }
            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, rlu.jt().vkm());
            String fxn3 = com.bytedance.sdk.openadsdk.ums.fxn.fxn(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
            if (!TextUtils.isEmpty(fxn3)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, fxn3);
            }
            build.setCustomInfo(hashMap);
            new Object[]{"init sec sdk, custom info is:", hashMap};
            build.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.hie.fxn.1
                @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                public void reportSoftDecData(final String str, final String str2) {
                    com.bytedance.sdk.openadsdk.ckl.gff.fxn(str, false, new com.bytedance.sdk.openadsdk.ckl.kg() { // from class: com.bytedance.sdk.openadsdk.core.hie.fxn.1.1
                        @Override // com.bytedance.sdk.openadsdk.ckl.kg
                        public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                            return com.bytedance.sdk.openadsdk.ckl.fxn.hm.kg().fxn(str).kg(str2);
                        }
                    });
                }
            });
            PglSSManager.init(fxn, build, null, null, fxn2, kg);
            jq();
            this.kg = true;
            try {
                if (this.gff) {
                    gff(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                dx.gff("mssdk", th.getMessage());
            }
        }
    }

    public boolean kg() {
        return this.kg;
    }

    private boolean tw() {
        if (!this.kg && this.gff) {
            fxn();
        }
        return this.kg;
    }

    private void jq() {
        if (this.fxn == null) {
            this.fxn = PglSSManager.getInstance();
        }
    }

    public void fxn(String str) {
        if (tw()) {
            jq();
            PglSSManager pglSSManager = this.fxn;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void fxn(final Map<String, Object> map) {
        if (tw()) {
            jq();
            if (this.fxn != null) {
                zu.kg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hie.fxn.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            fxn.this.fxn.setCustomInfo(map);
                            new Object[]{"map param custom info is: ", map};
                        } catch (Throwable th) {
                            dx.gff("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void gff() {
        if (tw()) {
            jq();
            if (this.fxn != null) {
                zu.kg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hie.fxn.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, rmu.hm().dpn());
                            fxn.this.fxn.setCustomInfo(hashMap);
                            new Object[]{"custom info is: ", hashMap};
                        } catch (Throwable th) {
                            dx.gff("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void kg(String str) {
        if (tw()) {
            jq();
            PglSSManager pglSSManager = this.fxn;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public void fxn(String str, Map<String, Object> map) {
        if (tw()) {
            jq();
            PglSSManager pglSSManager = this.fxn;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public String hm() {
        if (!tw()) {
            return "";
        }
        jq();
        PglSSManager pglSSManager = this.fxn;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public String rb() {
        if (!tw()) {
            return "";
        }
        jq();
        PglSSManager pglSSManager = this.fxn;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public long bh() {
        if (!tw()) {
            return 0L;
        }
        jq();
        PglSSManager pglSSManager = this.fxn;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public void fxn(MotionEvent motionEvent) {
        if (kg()) {
            jq();
            PglSSManager pglSSManager = this.fxn;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public int sg() {
        if (this.gff) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public Map<String, String> fxn(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!tw() || (featureHash = this.fxn.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }

    private Class hie() {
        Class<?> cls;
        try {
            cls = Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            this.gff = true;
            return cls;
        } catch (Throwable unused2) {
            this.gff = false;
            return cls;
        }
    }

    private void gff(final String str) {
        if (this.hm || TextUtils.isEmpty(str)) {
            return;
        }
        rmu.rb().fxn(new com.bytedance.sdk.openadsdk.ckl.kg() { // from class: com.bytedance.sdk.openadsdk.core.hie.fxn.4
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.ckl.fxn.hm.kg().fxn("secsdk_init_error").kg(str);
            }
        }, false);
        this.hm = true;
    }
}
