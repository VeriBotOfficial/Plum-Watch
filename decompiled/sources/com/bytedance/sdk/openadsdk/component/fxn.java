package com.bytedance.sdk.openadsdk.component;

import android.view.View;
import com.bykv.vk.openvk.fxn.fxn.fxn.hm.gff;
import com.wakeup.module.record.Constants;

/* loaded from: classes14.dex */
public class fxn implements gff.fxn, com.bytedance.sdk.openadsdk.component.bh.fxn {
    public void gff() {
    }

    public void hm() {
    }

    public void rb() {
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.hm.gff.fxn
    public void fxn(long j, int i) {
        new Object[]{"open_ad", Constants.ON_COMPLETE_KEY};
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.hm.gff.fxn
    public void kg(long j, int i) {
        new Object[]{"open_ad", "onError"};
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.hm.gff.fxn
    public void fxn() {
        new Object[]{"open_ad", "onTimeOut"};
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.hm.gff.fxn
    public void fxn(long j, long j2) {
        new Object[]{"open_ad", "onProgressUpdate"};
    }

    public void fxn(View view) {
        new Object[]{"open_ad", "onClickSkip"};
    }

    public void kg(View view) {
        new Object[]{"open_ad", "onClickDislike"};
    }

    public void kg() {
        new Object[]{"open_ad", "onCountDownFinish"};
    }

    public void fxn(int i, boolean z) {
        new Object[]{"open_ad", "onTimeChanged"};
    }
}
