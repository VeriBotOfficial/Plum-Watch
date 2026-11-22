package com.bytedance.sdk.openadsdk.core.hie;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class kg {
    private static com.bytedance.sdk.openadsdk.core.hie.fxn fxn;
    private String kg;

    private kg() {
        this.kg = null;
        fxn = new com.bytedance.sdk.openadsdk.core.hie.fxn();
    }

    public void fxn(String str) {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar;
        if (TextUtils.isEmpty(str) || (fxnVar = fxn) == null) {
            return;
        }
        fxnVar.fxn(str);
    }

    public void kg(String str) {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar;
        if (TextUtils.isEmpty(str) || (fxnVar = fxn) == null) {
            return;
        }
        fxnVar.kg(str);
    }

    public void fxn(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            fxnVar.fxn(map);
        }
    }

    public void fxn() {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            fxnVar.gff();
        }
    }

    public static kg kg() {
        return fxn.fxn;
    }

    public void fxn(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            fxnVar.fxn(str, map);
        }
    }

    public boolean gff() {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar == null) {
            return false;
        }
        return fxnVar.kg();
    }

    public String hm() {
        String hm;
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        return (fxnVar == null || (hm = fxnVar.hm()) == null) ? "" : hm;
    }

    public Map<String, String> fxn(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            return fxnVar.fxn(str, bArr);
        }
        return new HashMap();
    }

    public String rb() {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            return fxnVar.rb();
        }
        return "";
    }

    public long bh() {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            return fxnVar.bh();
        }
        return 0L;
    }

    public int sg() {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            return fxnVar.sg();
        }
        return 1;
    }

    public void fxn(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.hie.fxn fxnVar = fxn;
        if (fxnVar != null) {
            fxnVar.fxn(motionEvent);
        }
    }

    private static class fxn {
        private static final kg fxn = new kg();
    }
}
