package com.bytedance.sdk.openadsdk.bh;

import com.bytedance.sdk.openadsdk.core.gff;
import com.bytedance.sdk.openadsdk.core.zu;

/* loaded from: classes14.dex */
public class fxn {
    private static volatile fxn fxn;
    private int[] bh;
    private int ckl;
    private boolean dgx;
    private boolean gff;
    private boolean hie;
    private boolean hm;
    private int[] jq;
    private boolean kg;
    private int[] mvp;
    private int[] rb;
    private boolean rlu;
    private boolean rmu;

    /* renamed from: sg, reason: collision with root package name */
    private int[] f9422sg;
    private int[] tw;
    private boolean xdg;
    private boolean zu;

    private fxn() {
        kg();
    }

    public static fxn fxn() {
        if (fxn == null) {
            synchronized (gff.class) {
                if (fxn == null) {
                    fxn = new fxn();
                }
            }
        }
        return fxn;
    }

    public void kg() {
        zu.kg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bh.fxn.1
            @Override // java.lang.Runnable
            public void run() {
                fxn.this.zu = com.bytedance.sdk.openadsdk.ums.fxn.fxn("feature_switch", false);
                if (fxn.this.zu) {
                    try {
                        fxn.this.rmu = com.bytedance.sdk.openadsdk.ums.fxn.fxn("exclude_banner_native", false);
                        fxn.this.ckl = com.bytedance.sdk.openadsdk.ums.fxn.fxn("feature_timer_interval", 10000);
                        fxn.this.xdg = com.bytedance.sdk.openadsdk.ums.fxn.fxn("enable_feature_cids", true);
                        String[] split = com.bytedance.sdk.openadsdk.ums.fxn.fxn("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] split2 = com.bytedance.sdk.openadsdk.ums.fxn.fxn("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] split3 = com.bytedance.sdk.openadsdk.ums.fxn.fxn("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] split4 = com.bytedance.sdk.openadsdk.ums.fxn.fxn("pag_dislike_cnt", "1,3,5session").split(",");
                        fxn fxnVar = fxn.this;
                        fxnVar.kg = fxnVar.fxn(split);
                        fxn fxnVar2 = fxn.this;
                        fxnVar2.gff = fxnVar2.fxn(split2);
                        fxn fxnVar3 = fxn.this;
                        fxnVar3.hm = fxnVar3.fxn(split3);
                        fxn fxnVar4 = fxn.this;
                        fxnVar4.rb = fxnVar4.kg(split);
                        fxn fxnVar5 = fxn.this;
                        fxnVar5.bh = fxnVar5.kg(split2);
                        fxn fxnVar6 = fxn.this;
                        fxnVar6.f9422sg = fxnVar6.kg(split3);
                        fxn fxnVar7 = fxn.this;
                        fxnVar7.mvp = fxnVar7.gff(split4);
                        String[] split5 = com.bytedance.sdk.openadsdk.ums.fxn.fxn("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] split6 = com.bytedance.sdk.openadsdk.ums.fxn.fxn("pag_video_stay_time", "1,3,5&session").split("&");
                        fxn fxnVar8 = fxn.this;
                        fxnVar8.hie = fxnVar8.fxn(split5);
                        fxn fxnVar9 = fxn.this;
                        fxnVar9.dgx = fxnVar9.fxn(split6);
                        fxn fxnVar10 = fxn.this;
                        fxnVar10.tw = fxnVar10.kg(split5);
                        fxn fxnVar11 = fxn.this;
                        fxnVar11.jq = fxnVar11.kg(split6);
                        fxn.this.rlu = com.bytedance.sdk.openadsdk.ums.fxn.fxn("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fxn(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] kg(String[] strArr) {
        if (strArr.length > 0) {
            return gff(strArr[0].split(","));
        }
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] gff(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int parseInt = Integer.parseInt(str);
                iArr[i] = parseInt;
                if (parseInt > 0) {
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public boolean gff() {
        return this.zu;
    }

    public int hm() {
        return this.ckl;
    }

    public boolean rb() {
        return this.xdg;
    }

    public boolean bh() {
        return this.kg;
    }

    public boolean sg() {
        return this.gff;
    }

    public boolean tw() {
        return this.hm;
    }

    public int[] jq() {
        return this.rb;
    }

    public int[] hie() {
        return this.bh;
    }

    public int[] dgx() {
        return this.f9422sg;
    }

    public int[] mvp() {
        return this.tw;
    }

    public int[] rlu() {
        return this.jq;
    }

    public boolean zu() {
        return this.hie;
    }

    public boolean ckl() {
        return this.dgx;
    }

    public int[] xdg() {
        return this.mvp;
    }

    public boolean rmu() {
        return this.rlu;
    }

    public boolean je() {
        return this.rmu;
    }
}
