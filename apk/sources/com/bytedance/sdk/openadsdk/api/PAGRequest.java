package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class PAGRequest {
    private String fxn;
    private Bundle gff = null;
    private Map<String, Object> kg;

    public String getAdString() {
        return this.fxn;
    }

    public void setAdString(String str) {
        this.fxn = str;
    }

    public Map<String, Object> getExtraInfo() {
        return this.kg;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.kg = map;
    }

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.gff == null) {
            this.gff = new Bundle();
        }
        this.gff.putBundle(cls.getName(), bundle);
    }

    public Bundle getNetworkExtrasBundle() {
        return this.gff;
    }
}
